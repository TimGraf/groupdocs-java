package com.groupdocs.sdk.api;

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.ApiInvoker;
import java.util.*;

public class SharedApi {
  String basePath = "https://api.groupdocs.com/v2.0";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public String Download (String guid, String fileName, Boolean render) throws ApiException {
  	String resourcePath = "/shared/files/{guid}?filename={fileName}&amp;render={render}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "guid" + "}", String.valueOf(guid)).replace("{" + "fileName" + "}", String.valueOf(fileName)).replace("{" + "render" + "}", String.valueOf(render));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(guid == null || fileName == null || render == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public String GetXml (String guid) throws ApiException {
  	String resourcePath = "/shared/files/{guid}/xml".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "guid" + "}", String.valueOf(guid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(guid == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public String GetPackage (String path) throws ApiException {
  	String resourcePath = "/shared/packages/{*path}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "path" + "}", String.valueOf(path));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(path == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

