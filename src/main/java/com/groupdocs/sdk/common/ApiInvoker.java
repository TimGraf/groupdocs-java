/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.common;

import java.io.InputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.JavaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.wordnik.swagger.core.util.JsonUtil;

public class ApiInvoker {
  private static ApiInvoker INSTANCE = new ApiInvoker();
  private Map<String, Client> hostMap = new HashMap<String, Client>();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private static final String ENC = "UTF-8";
  private RequestSigner signer;


  public static ApiInvoker getInstance() {
    return INSTANCE;
  }

  public void setRequestSigner(RequestSigner signer){
	  this.signer = signer;
  }
  
  public void addDefaultHeader(String key, String value) {
	   defaultHeaderMap.put(key, value);
  }

  public String escapeString(String str) {
	  return encodeURIComponent(str);
  }

  public static String encodeURI(String uri) {
	  return encodeURIComponent(uri)
			  .replace("%3B", ";")
			  .replace("%2C", ",")
			  .replace("%2F", "/")
			  .replace("%3F", "?")
			  .replace("%3A", ":")
			  .replace("%40", "@")
			  .replace("%26", "&")
			  .replace("%3D", "=")
			  //.replace("%2B", "+")
			  .replace("%24", "$")
			  .replace("%25", "%")
			  .replace("%23", "#");
  }

  public static String encodeURIComponent(String str) {
	  try {
		  return URLEncoder.encode(str, ENC)
	              .replace("+", "%20")
	              .replace("%21", "!")
	              .replace("%27", "'")
	              .replace("%28", "(")
	              .replace("%29", ")")
	              .replace("%7E", "~");
	  } catch(UnsupportedEncodingException e){
    	  return str;
	  }
  }

  public static Object deserialize(String json, String containerType, Class cls) throws ApiException {
    try{
      if("List".equals(containerType)) {
        JavaType typeInfo = JsonUtil.getJsonMapper().getTypeFactory().constructCollectionType(List.class, cls);
        List response = (List<?>) JsonUtil.getJsonMapper().readValue(json, typeInfo);
        return response;
      }
      else if(String.class.equals(cls)) {
        return json;
      }
      else {
        return JsonUtil.getJsonMapper().readValue(json, cls);
      }
    }
    catch (IOException e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public static String serialize(Object obj) throws ApiException {
    try {
      if (obj != null) return JsonUtil.getJsonMapper().writeValueAsString(obj);
      else return "{}";
    }
    catch (Exception e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public String invokeAPI(String host, String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams) throws ApiException {
    Client client = getClient(host);

    StringBuilder b = new StringBuilder();
    
    for(String key : queryParams.keySet()) {
    	String value = queryParams.get(key);
    	if (value != null){
    		if(b.toString().length() == 0) b.append("?");
    		else b.append("&");
    		b.append(escapeString(key)).append("=").append(escapeString(value));
    	}
    }
    String querystring = b.toString();

    boolean isFileUpload = false;
    MediaType contentType;
    if(body == null) {
    	contentType = MediaType.TEXT_HTML_TYPE;
    } else {
    	contentType = MediaType.APPLICATION_JSON_TYPE;
    	if(body instanceof InputStream){
    		isFileUpload = true;
    		contentType = MediaType.APPLICATION_OCTET_STREAM_TYPE;
    	}
    }
    
    Builder builder = client.resource(encodeURI(signer.signUrl(host + path + querystring))).type(contentType);
    for(String key : headerParams.keySet()) {
    	builder.header(key, headerParams.get(key));
    }
    
    for(String key : defaultHeaderMap.keySet()) {
    	if(!headerParams.containsKey(key)) {
    		builder.header(key, defaultHeaderMap.get(key));
    	}
    }
    ClientResponse response = null;

    if("GET".equals(method)) {
    	response = (ClientResponse) builder.get(ClientResponse.class);
    }
    else if ("POST".equals(method)) {
    	Object requestBody;
    	if(isFileUpload){
    		requestBody = body;
    	} else {
    		requestBody = signer.signContent(serialize(body), builder);
    	}
        response = builder.post(ClientResponse.class, requestBody);
    }
    else if ("PUT".equals(method)) {
    	Object requestBody;
    	if(isFileUpload){
    		requestBody = body;
    	} else {
    		requestBody = signer.signContent(serialize(body), builder);
    	}
        response = builder.put(ClientResponse.class, requestBody);
      }
    else if ("DELETE".equals(method)) {
        response = builder.delete(ClientResponse.class, signer.signContent(serialize(body), builder));
    }
    else {
    	throw new ApiException(500, "unknown method type " + method);
    }
    if(response.getClientResponseStatus() == ClientResponse.Status.OK
    	|| response.getClientResponseStatus() == ClientResponse.Status.CREATED
        || response.getClientResponseStatus() == ClientResponse.Status.ACCEPTED
        || response.getClientResponseStatus() == ClientResponse.Status.NOT_FOUND) {
    	return (String) response.getEntity(String.class);
    }
    else {
    	throw new ApiException(
    	          response.getClientResponseStatus().getStatusCode(),
    	          response.getEntity(String.class));    	
    }
  }

  private Client getClient(String host) {
	if(!hostMap.containsKey(host)) {
		Client client = Client.create();
		client.addFilter(new LoggingFilter());
        hostMap.put(host, client);
	}
	return hostMap.get(host);
  }
  
}

