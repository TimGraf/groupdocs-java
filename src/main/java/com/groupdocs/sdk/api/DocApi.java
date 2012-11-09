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
import com.groupdocs.sdk.common.FileStream;
import com.groupdocs.sdk.model.SharedUsersResponse;
import com.groupdocs.sdk.model.GetDocumentForeignTypesResponse;
import com.groupdocs.sdk.model.GetDocumentInfoResponse;
import com.groupdocs.sdk.model.DocumentAccessInfoResponse;
import com.groupdocs.sdk.model.DocumentViewsResponse;
import com.groupdocs.sdk.model.SharedDocumentsResponse;
import com.groupdocs.sdk.model.RemoveEditLockResponse;
import com.groupdocs.sdk.model.TemplateFieldsResponse;
import com.groupdocs.sdk.model.ViewDocumentResponse;
import com.groupdocs.sdk.model.GetEditLockResponse;
import com.groupdocs.sdk.model.DocumentUserStatusResponse;
import com.groupdocs.sdk.model.GetImageUrlsResponse;
import java.util.*;

public class DocApi {
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

  public ViewDocumentResponse ViewDocument (String userId, String fileId, String pageNumber, String pageCount, String width, String quality, String usePdf) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/thumbnails?page_number={pageNumber}&page_count={pageCount}&width={width}&quality={quality}&use_pdf={usePdf}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "pageNumber" + "}", String.valueOf(pageNumber)).replace("{" + "pageCount" + "}", String.valueOf(pageCount)).replace("{" + "width" + "}", String.valueOf(width)).replace("{" + "quality" + "}", String.valueOf(quality)).replace("{" + "usePdf" + "}", String.valueOf(usePdf));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || pageNumber == null || pageCount == null || width == null || quality == null || usePdf == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (ViewDocumentResponse) ApiInvoker.deserialize(response, "", ViewDocumentResponse.class);
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
  public DocumentViewsResponse GetDocumentViews (String userId, String startIndex, String pageSize) throws ApiException {
  	String resourcePath = "/doc/{userId}/views?page_index={startIndex}&page_size={pageSize}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "startIndex" + "}", String.valueOf(startIndex)).replace("{" + "pageSize" + "}", String.valueOf(pageSize));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || startIndex == null || pageSize == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DocumentViewsResponse) ApiInvoker.deserialize(response, "", DocumentViewsResponse.class);
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
  public SharedUsersResponse ShareDocument (String userId, String fileId, List<String> body) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/sharers".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SharedUsersResponse) ApiInvoker.deserialize(response, "", SharedUsersResponse.class);
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
  public SharedUsersResponse UnshareDocument (String userId, String fileId) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/sharers".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SharedUsersResponse) ApiInvoker.deserialize(response, "", SharedUsersResponse.class);
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
  public SharedUsersResponse GetFolderSharers (String userId, String folderId) throws ApiException {
  	String resourcePath = "/doc/{userId}/folders/{folderId}/sharers".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "folderId" + "}", String.valueOf(folderId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || folderId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SharedUsersResponse) ApiInvoker.deserialize(response, "", SharedUsersResponse.class);
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
  public SharedUsersResponse ShareFolder (String userId, String folderId, List<String> body) throws ApiException {
  	String resourcePath = "/doc/{userId}/folders/{folderId}/sharers".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "folderId" + "}", String.valueOf(folderId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || folderId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SharedUsersResponse) ApiInvoker.deserialize(response, "", SharedUsersResponse.class);
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
  public SharedUsersResponse UnshareFolder (String userId, String folderId) throws ApiException {
  	String resourcePath = "/doc/{userId}/folders/{folderId}/sharers".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "folderId" + "}", String.valueOf(folderId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || folderId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SharedUsersResponse) ApiInvoker.deserialize(response, "", SharedUsersResponse.class);
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
  public DocumentAccessInfoResponse SetDocumentAccessMode (String userId, String fileId, String mode) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/accessinfo?mode={mode}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "mode" + "}", String.valueOf(mode));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || mode == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DocumentAccessInfoResponse) ApiInvoker.deserialize(response, "", DocumentAccessInfoResponse.class);
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
  public DocumentAccessInfoResponse GetDocumentAccessInfo (String userId, String fileId) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/accessinfo".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DocumentAccessInfoResponse) ApiInvoker.deserialize(response, "", DocumentAccessInfoResponse.class);
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
  public GetDocumentInfoResponse GetDocumentMetadata (String userId, String fileId) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/metadata".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetDocumentInfoResponse) ApiInvoker.deserialize(response, "", GetDocumentInfoResponse.class);
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
  public GetDocumentInfoResponse GetDocumentMetadataByPath (String userId, String path) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{*path}".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetDocumentInfoResponse) ApiInvoker.deserialize(response, "", GetDocumentInfoResponse.class);
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
  public DocumentUserStatusResponse SetDocumentUserStatus (String userId, String fileId, String status) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/sharer".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "status" + "}", String.valueOf(status));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || status == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DocumentUserStatusResponse) ApiInvoker.deserialize(response, "", DocumentUserStatusResponse.class);
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
  public SharedDocumentsResponse GetSharedDocuments (String userId, String sharesTypes, String pageIndex, String pageSize, String orderBy, Boolean orderAsc) throws ApiException {
  	String resourcePath = "/doc/{userId}/shares/{sharesTypes}?page_index={pageIndex}&page_size={pageSize}&order_by={orderBy}&order_asc={orderAsc}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "sharesTypes" + "}", String.valueOf(sharesTypes)).replace("{" + "pageIndex" + "}", String.valueOf(pageIndex)).replace("{" + "pageSize" + "}", String.valueOf(pageSize)).replace("{" + "orderBy" + "}", String.valueOf(orderBy)).replace("{" + "orderAsc" + "}", String.valueOf(orderAsc));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || sharesTypes == null || pageIndex == null || pageSize == null || orderBy == null || orderAsc == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SharedDocumentsResponse) ApiInvoker.deserialize(response, "", SharedDocumentsResponse.class);
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
  public TemplateFieldsResponse GetTemplateFields (String userId, String fileId, Boolean includeGeometry) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/fields?include_geometry={includeGeometry}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "includeGeometry" + "}", String.valueOf(includeGeometry));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || includeGeometry == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (TemplateFieldsResponse) ApiInvoker.deserialize(response, "", TemplateFieldsResponse.class);
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
  public GetDocumentForeignTypesResponse GetDocumentFormats (String userId, String fileId) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/formats".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetDocumentForeignTypesResponse) ApiInvoker.deserialize(response, "", GetDocumentForeignTypesResponse.class);
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
  public FileStream GetDocumentPageImage (String userId, String fileId, Integer pageNumber, String dimension, Integer quality, Boolean usePdf, Boolean expiresOn) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/pages/{pageNumber}/images/{dimension}?quality={quality}&use_pdf={usePdf}&expires={expiresOn}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "pageNumber" + "}", String.valueOf(pageNumber)).replace("{" + "dimension" + "}", String.valueOf(dimension)).replace("{" + "quality" + "}", String.valueOf(quality)).replace("{" + "usePdf" + "}", String.valueOf(usePdf)).replace("{" + "expiresOn" + "}", String.valueOf(expiresOn));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || pageNumber == null || dimension == null || quality == null || usePdf == null || expiresOn == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      return apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, FileStream.class);
      } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetImageUrlsResponse GetDocumentPagesImageUrls (String userId, String fileId, Integer firstPage, Integer pageCount, String dimension, Integer quality, Boolean usePdf, String token) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/pages/images/{dimension}/urls?first_page={firstPage}&page_count={pageCount}&quality={quality}&use_pdf={usePdf}&token={token}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "firstPage" + "}", String.valueOf(firstPage)).replace("{" + "pageCount" + "}", String.valueOf(pageCount)).replace("{" + "dimension" + "}", String.valueOf(dimension)).replace("{" + "quality" + "}", String.valueOf(quality)).replace("{" + "usePdf" + "}", String.valueOf(usePdf)).replace("{" + "token" + "}", String.valueOf(token));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || firstPage == null || pageCount == null || dimension == null || quality == null || usePdf == null || token == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetImageUrlsResponse) ApiInvoker.deserialize(response, "", GetImageUrlsResponse.class);
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
  public GetEditLockResponse GetEditLock (String userId, String fileId) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/editlock".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetEditLockResponse) ApiInvoker.deserialize(response, "", GetEditLockResponse.class);
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
  public RemoveEditLockResponse RemoveEditLock (String userId, String fileId) throws ApiException {
  	String resourcePath = "/doc/{userId}/files/{fileId}/editlock".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (RemoveEditLockResponse) ApiInvoker.deserialize(response, "", RemoveEditLockResponse.class);
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

