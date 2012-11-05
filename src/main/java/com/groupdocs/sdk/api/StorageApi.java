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
package com.groupdocs.sdk.api;

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.ApiInvoker;
import java.io.InputStream;
import com.groupdocs.sdk.model.CreateFolderResponse;
import com.groupdocs.sdk.model.FileMoveResponse;
import com.groupdocs.sdk.model.ListEntitiesResponse;
import com.groupdocs.sdk.model.CompressResponse;
import com.groupdocs.sdk.model.StorageInfoResponse;
import com.groupdocs.sdk.model.UploadResponse;
import com.groupdocs.sdk.model.DeleteResponse;
import com.groupdocs.sdk.model.FolderMoveResponse;
import com.groupdocs.sdk.model.CreatePackageResponse;
import java.util.*;

public class StorageApi {
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

  public StorageInfoResponse GetStorageInfo (String userId) throws ApiException {
  	String resourcePath = "/storage/{userId}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (StorageInfoResponse) ApiInvoker.deserialize(response, "", StorageInfoResponse.class);
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
  public ListEntitiesResponse ListEntities (String userId, String path, Integer pageIndex, Integer pageSize, String orderBy, Boolean orderAsc, String filter, String fileTypes, Boolean extended) throws ApiException {
  	String resourcePath = "/storage/{userId}/folders/{*path}?page={pageIndex}&amp;count={pageSize}&amp;order_by={orderBy}&amp;order_asc={orderAsc}&amp;filter={filter}&amp;file_types={fileTypes}&amp;extended={extended}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "path" + "}", String.valueOf(path)).replace("{" + "pageIndex" + "}", String.valueOf(pageIndex)).replace("{" + "pageSize" + "}", String.valueOf(pageSize)).replace("{" + "orderBy" + "}", String.valueOf(orderBy)).replace("{" + "orderAsc" + "}", String.valueOf(orderAsc)).replace("{" + "filter" + "}", String.valueOf(filter)).replace("{" + "fileTypes" + "}", String.valueOf(fileTypes)).replace("{" + "extended" + "}", String.valueOf(extended));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || path == null || pageIndex == null || pageSize == null || orderBy == null || orderAsc == null || filter == null || fileTypes == null || extended == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ListEntitiesResponse) ApiInvoker.deserialize(response, "", ListEntitiesResponse.class);
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
  public String GetFile (String userId, String fileId) throws ApiException {
  	String resourcePath = "/storage/{userId}/files/{fileId}".replace("*", "");
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
  public String GetSharedFile (String userEmail, String filePath) throws ApiException {
  	String resourcePath = "/storage/shared/{userEmail}/{*filePath}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userEmail" + "}", String.valueOf(userEmail)).replace("{" + "filePath" + "}", String.valueOf(filePath));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userEmail == null || filePath == null ) {
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
  public UploadResponse Upload (String userId, String path, String description, InputStream body) throws ApiException {
  	String resourcePath = "/storage/{userId}/folders/{*path}?description={description}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "path" + "}", String.valueOf(path)).replace("{" + "description" + "}", String.valueOf(description));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || path == null || description == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams);
      if(response != null){
        return (UploadResponse) ApiInvoker.deserialize(response, "", UploadResponse.class);
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
  public UploadResponse UploadWeb (String userId, String url) throws ApiException {
  	String resourcePath = "/storage/{userId}/urls?url={url}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "url" + "}", String.valueOf(url));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || url == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (UploadResponse) ApiInvoker.deserialize(response, "", UploadResponse.class);
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
  public UploadResponse UploadGoogle (String userId, String path, String fileId) throws ApiException {
  	String resourcePath = "/storage/{userId}/google/files/{*path}?file_id={fileId}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "path" + "}", String.valueOf(path)).replace("{" + "fileId" + "}", String.valueOf(fileId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || path == null || fileId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (UploadResponse) ApiInvoker.deserialize(response, "", UploadResponse.class);
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
  public DeleteResponse Delete (String userId, String fileId) throws ApiException {
  	String resourcePath = "/storage/{userId}/files/{fileId}".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams);
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
  public DeleteResponse DeleteFromFolder (String userId, String path) throws ApiException {
  	String resourcePath = "/storage/{userId}/folders/{*path}".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams);
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
  public FileMoveResponse MoveFile (String userId, String path, String mode, String Groupdocs_Move, String Groupdocs_Copy) throws ApiException {
  	String resourcePath = "/storage/{userId}/files/{*path}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "path" + "}", String.valueOf(path)).replace("{" + "mode" + "}", String.valueOf(mode));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || path == null || mode == null ) {
       throw new ApiException(400, "missing required params");
    }
    headerParams.put("Groupdocs-Move", Groupdocs_Move);
    headerParams.put("Groupdocs-Copy", Groupdocs_Copy);
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams);
      if(response != null){
        return (FileMoveResponse) ApiInvoker.deserialize(response, "", FileMoveResponse.class);
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
  public FolderMoveResponse MoveFolder (String userId, String path, String mode, String Groupdocs_Copy, String Groupdocs_Move) throws ApiException {
  	String resourcePath = "/storage/{userId}/folders/{*path}?override_mode={mode}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "path" + "}", String.valueOf(path)).replace("{" + "mode" + "}", String.valueOf(mode));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || path == null || mode == null ) {
       throw new ApiException(400, "missing required params");
    }
    headerParams.put("Groupdocs-Copy", Groupdocs_Copy);
    headerParams.put("Groupdocs-Move", Groupdocs_Move);
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams);
      if(response != null){
        return (FolderMoveResponse) ApiInvoker.deserialize(response, "", FolderMoveResponse.class);
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
  public CreateFolderResponse Create (String userId, String path) throws ApiException {
  	String resourcePath = "/storage/{userId}/paths/{*path}".replace("*", "");
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
        return (CreateFolderResponse) ApiInvoker.deserialize(response, "", CreateFolderResponse.class);
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
  public CompressResponse Compress (String userId, String fileId, String archiveType) throws ApiException {
  	String resourcePath = "/storage/{userId}/files/{fileId}/archive/{archiveType}".replace("*", "");
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
  public CreatePackageResponse CreatePackage (String userId, String packageName, Boolean storeRelativePath, List<String> body) throws ApiException {
  	String resourcePath = "/storage/{userId}/packages/{packageName}?storeRelativePath={storeRelativePath}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "packageName" + "}", String.valueOf(packageName)).replace("{" + "storeRelativePath" + "}", String.valueOf(storeRelativePath));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || packageName == null || storeRelativePath == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams);
      if(response != null){
        return (CreatePackageResponse) ApiInvoker.deserialize(response, "", CreatePackageResponse.class);
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
  public FolderMoveResponse MoveToTrash (String userId, String path) throws ApiException {
  	String resourcePath = "/storage/{userId}/trash/{*path}".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams);
      if(response != null){
        return (FolderMoveResponse) ApiInvoker.deserialize(response, "", FolderMoveResponse.class);
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
  public DeleteResponse RestoreFromTrash (String userId, String path) throws ApiException {
  	String resourcePath = "/storage/{userId}/trash/{*path}".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams);
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
  }

