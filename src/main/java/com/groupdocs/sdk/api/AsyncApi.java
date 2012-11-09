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
import com.groupdocs.sdk.model.GetJobResponse;
import com.groupdocs.sdk.model.JobInfo;
import com.groupdocs.sdk.model.GetJobDocumentsResponse;
import com.groupdocs.sdk.model.AddJobDocumentResponse;
import com.groupdocs.sdk.model.GetJobResourcesResponse;
import com.groupdocs.sdk.model.ConvertResponse;
import com.groupdocs.sdk.model.DeleteResponse;
import com.groupdocs.sdk.model.CreateJobResponse;
import com.groupdocs.sdk.model.UpdateJobResponse;
import com.groupdocs.sdk.model.DeleteResult;
import com.groupdocs.sdk.model.GetJobsDocumentsResponse;
import com.groupdocs.sdk.model.GetJobsResponse;
import java.util.*;

public class AsyncApi {
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

  public GetJobResponse GetJob (String userId, String jobId) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobId}?format=xml".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetJobResponse) ApiInvoker.deserialize(response, "", GetJobResponse.class);
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
  public GetJobResponse GetJobJson (String userId, String jobId) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobId}?format=json".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetJobResponse) ApiInvoker.deserialize(response, "", GetJobResponse.class);
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
  public GetJobResourcesResponse GetJobResources (String userId, String statusIds) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/resources?statusIds={statusIds}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "statusIds" + "}", String.valueOf(statusIds));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || statusIds == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetJobResourcesResponse) ApiInvoker.deserialize(response, "", GetJobResourcesResponse.class);
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
  public GetJobDocumentsResponse GetJobDocuments (String userId, String jobId, String format) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobId}/documents?format={format}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId)).replace("{" + "format" + "}", String.valueOf(format));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetJobDocumentsResponse) ApiInvoker.deserialize(response, "", GetJobDocumentsResponse.class);
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
  public CreateJobResponse CreateJob (String userId, JobInfo body) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (CreateJobResponse) ApiInvoker.deserialize(response, "", CreateJobResponse.class);
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
  public DeleteResult DeleteJob (String userId, String jobGuid) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobGuid" + "}", String.valueOf(jobGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DeleteResult) ApiInvoker.deserialize(response, "", DeleteResult.class);
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
  public AddJobDocumentResponse AddJobDocument (String userId, String jobId, String fileId, Boolean checkOwnership, String formats) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobId}/files/{fileId}?check_ownership={checkOwnership}&out_formats={formats}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "checkOwnership" + "}", String.valueOf(checkOwnership)).replace("{" + "formats" + "}", String.valueOf(formats));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null || fileId == null || checkOwnership == null || formats == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (AddJobDocumentResponse) ApiInvoker.deserialize(response, "", AddJobDocumentResponse.class);
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
  public DeleteResponse DeleteJobDocument (String userId, String jobGuid, String documentId) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobGuid}/documents/{documentId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobGuid" + "}", String.valueOf(jobGuid)).replace("{" + "documentId" + "}", String.valueOf(documentId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobGuid == null || documentId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
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
  public AddJobDocumentResponse AddJobDocumentUrl (String userId, String jobId, String absoluteUrl, String formats) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobId}/urls?absolute_url={absoluteUrl}&out_formats={formats}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId)).replace("{" + "absoluteUrl" + "}", String.valueOf(absoluteUrl)).replace("{" + "formats" + "}", String.valueOf(formats));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null || absoluteUrl == null || formats == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (AddJobDocumentResponse) ApiInvoker.deserialize(response, "", AddJobDocumentResponse.class);
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
  public UpdateJobResponse UpdateJob (String userId, String jobId, JobInfo body) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/{jobId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (UpdateJobResponse) ApiInvoker.deserialize(response, "", UpdateJobResponse.class);
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
  public GetJobsResponse GetJobs (String userId, String pageIndex, String pageSize, String date, String statusIds, String actions, String excludedActions) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs?page={pageIndex}&count={pageSize}&date={date}&statusIds={statusIds}&actions={actions}&excluded_actions={excludedActions}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "pageIndex" + "}", String.valueOf(pageIndex)).replace("{" + "pageSize" + "}", String.valueOf(pageSize)).replace("{" + "date" + "}", String.valueOf(date)).replace("{" + "statusIds" + "}", String.valueOf(statusIds)).replace("{" + "actions" + "}", String.valueOf(actions)).replace("{" + "excludedActions" + "}", String.valueOf(excludedActions));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || pageIndex == null || pageSize == null || date == null || statusIds == null || actions == null || excludedActions == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetJobsResponse) ApiInvoker.deserialize(response, "", GetJobsResponse.class);
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
  public GetJobsDocumentsResponse GetJobsDocuments (String userId, String pageIndex, String pageSize, String actions, String excludedActions, String orderBy, Boolean orderAsc) throws ApiException {
  	String resourcePath = "/async/{userId}/jobs/documents?page={pageIndex}&count={pageSize}&actions={actions}&excluded_actions={excludedActions}&order_by={orderBy}&order_asc={orderAsc}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "pageIndex" + "}", String.valueOf(pageIndex)).replace("{" + "pageSize" + "}", String.valueOf(pageSize)).replace("{" + "actions" + "}", String.valueOf(actions)).replace("{" + "excludedActions" + "}", String.valueOf(excludedActions)).replace("{" + "orderBy" + "}", String.valueOf(orderBy)).replace("{" + "orderAsc" + "}", String.valueOf(orderAsc));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || pageIndex == null || pageSize == null || actions == null || excludedActions == null || orderBy == null || orderAsc == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetJobsDocumentsResponse) ApiInvoker.deserialize(response, "", GetJobsDocumentsResponse.class);
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
  public ConvertResponse Convert (String userId, String fileId, String targetType, String emailResults, String description, Boolean printScript, String callbackUrl) throws ApiException {
  	String resourcePath = "/async/{userId}/files/{fileId}?new_type={targetType}&email_results={emailResults}&new_description={description}&print_script={printScript}&callback={callbackUrl}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "targetType" + "}", String.valueOf(targetType)).replace("{" + "emailResults" + "}", String.valueOf(emailResults)).replace("{" + "description" + "}", String.valueOf(description)).replace("{" + "printScript" + "}", String.valueOf(printScript)).replace("{" + "callbackUrl" + "}", String.valueOf(callbackUrl));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || targetType == null || emailResults == null || description == null || printScript == null || callbackUrl == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (ConvertResponse) ApiInvoker.deserialize(response, "", ConvertResponse.class);
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

