package com.groupdocs.sdk.api;

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.model.CompressResponse;
import com.groupdocs.sdk.model.DeleteResponse;
import com.groupdocs.sdk.model.RenameResponse;
import java.util.*;

public class PostApi {
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

  public RenameResponse RenameByPost (String userId, String fileId, String newName) throws ApiException {
  	String resourcePath = "/post/file.rename?user_id={userId}&amp;file_id={fileId}&amp;new_name={newName}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "newName" + "}", String.valueOf(newName));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || newName == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (RenameResponse) ApiInvoker.deserialize(response, "", RenameResponse.class);
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
  public DeleteResponse DeleteByPost (String userId, String fileId) throws ApiException {
  	String resourcePath = "/post/file.delete?user_id={userId}&amp;file_id={fileId}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (DeleteResponse) ApiInvoker.deserialize(response, "", DeleteResponse.class);
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
  public DeleteResponse DeleteFromFolderByPost (String userId, String path) throws ApiException {
  	String resourcePath = "/post/file.delete.in?user_id={userId}&amp;path={path}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "path" + "}", String.valueOf(path));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || path == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (DeleteResponse) ApiInvoker.deserialize(response, "", DeleteResponse.class);
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
  public CompressResponse CompressByPost (String userId, String fileId, String archiveType) throws ApiException {
  	String resourcePath = "/post/file.compress?user_id={userId}&amp;file_id={fileId}&amp;archive_type={archiveType}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "archiveType" + "}", String.valueOf(archiveType));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || archiveType == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (CompressResponse) ApiInvoker.deserialize(response, "", CompressResponse.class);
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

