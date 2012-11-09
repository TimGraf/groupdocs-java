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
import com.groupdocs.sdk.model.QuestionnaireInfo;
import com.groupdocs.sdk.model.GetQuestionnaireExecutionsResponse;
import com.groupdocs.sdk.model.Datasource;
import com.groupdocs.sdk.model.UpdateQuestionnaireExecutionResponse;
import com.groupdocs.sdk.model.GetQuestionnairesResponse;
import com.groupdocs.sdk.model.GetQuestionnaireMetadataResponse;
import com.groupdocs.sdk.model.UpdateQuestionnaireResponse;
import com.groupdocs.sdk.model.GetDocumentQuestionnairesResponse;
import com.groupdocs.sdk.model.QuestionnaireExecutionInfo;
import com.groupdocs.sdk.model.AddDatasourceResponse;
import com.groupdocs.sdk.model.AddQuestionnaireCollectorResponse;
import com.groupdocs.sdk.model.AddDocumentDataSourceResponse;
import com.groupdocs.sdk.model.DatasourceField;
import com.groupdocs.sdk.model.DeleteQuestionnaireExecutionResponse;
import com.groupdocs.sdk.model.DeleteDocumentQuestionnaireResponse;
import com.groupdocs.sdk.model.GetQuestionnaireCollectorResponse;
import com.groupdocs.sdk.model.TemplateFieldsResponse;
import com.groupdocs.sdk.model.QuestionnaireCollectorInfo;
import com.groupdocs.sdk.model.AddDocumentQuestionnaireResponse;
import com.groupdocs.sdk.model.GetQuestionnaireCollectorsResponse;
import com.groupdocs.sdk.model.DeleteQuestionnaireCollectorResponse;
import com.groupdocs.sdk.model.DeleteDatasourceResponse;
import com.groupdocs.sdk.model.QuestionnaireMetadata;
import com.groupdocs.sdk.model.GetDatasourceResponse;
import com.groupdocs.sdk.model.AddQuestionnaireExecutionResponse;
import com.groupdocs.sdk.model.GetTemplatesResponse;
import com.groupdocs.sdk.model.DeleteQuestionnaireResponse;
import com.groupdocs.sdk.model.MergeTemplateResponse;
import com.groupdocs.sdk.model.GetQuestionnaireResponse;
import com.groupdocs.sdk.model.GetDatasourcesResponse;
import com.groupdocs.sdk.model.UpdateQuestionnaireCollectorResponse;
import com.groupdocs.sdk.model.CreateQuestionnaireResponse;
import java.util.*;

public class MergeApi {
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

  public AddDocumentDataSourceResponse AddJobDocumentDataSource (String userId, String jobId, String fileId, String datasourceId) throws ApiException {
  	String resourcePath = "/merge/{userId}/jobs/{jobId}/files/{fileId}/datasources/{datasourceId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null || fileId == null || datasourceId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (AddDocumentDataSourceResponse) ApiInvoker.deserialize(response, "", AddDocumentDataSourceResponse.class);
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
  public AddDocumentDataSourceResponse AddJobDocumentDataSourceFields (String userId, String jobId, String fileId, List<DatasourceField> body) throws ApiException {
  	String resourcePath = "/merge/{userId}/jobs/{jobId}/files/{fileId}/datasources".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobId" + "}", String.valueOf(jobId)).replace("{" + "fileId" + "}", String.valueOf(fileId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || jobId == null || fileId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (AddDocumentDataSourceResponse) ApiInvoker.deserialize(response, "", AddDocumentDataSourceResponse.class);
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
  public MergeTemplateResponse FillQuestionnaire (String userId, String collectorId, String datasourceId, String targetType, String emailResults) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/collectors/{collectorId}/datasources/{datasourceId}?new_type={targetType}&email_results={emailResults}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "collectorId" + "}", String.valueOf(collectorId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId)).replace("{" + "targetType" + "}", String.valueOf(targetType)).replace("{" + "emailResults" + "}", String.valueOf(emailResults));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || collectorId == null || datasourceId == null || targetType == null || emailResults == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (MergeTemplateResponse) ApiInvoker.deserialize(response, "", MergeTemplateResponse.class);
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
  public MergeTemplateResponse MergeDatasource (String userId, String fileId, String datasourceId, String targetType, String emailResults) throws ApiException {
  	String resourcePath = "/merge/{userId}/files/{fileId}/datasources/{datasourceId}?new_type={targetType}&email_results={emailResults}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId)).replace("{" + "targetType" + "}", String.valueOf(targetType)).replace("{" + "emailResults" + "}", String.valueOf(emailResults));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || datasourceId == null || targetType == null || emailResults == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (MergeTemplateResponse) ApiInvoker.deserialize(response, "", MergeTemplateResponse.class);
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
  public MergeTemplateResponse MergeDatasourceFields (String userId, String fileId, String targetType, String emailResults, String assemblyName, List<DatasourceField> body) throws ApiException {
  	String resourcePath = "/merge/{userId}/files/{fileId}/datasources?new_type={targetType}&email_results={emailResults}&assembly_name={assemblyName}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "targetType" + "}", String.valueOf(targetType)).replace("{" + "emailResults" + "}", String.valueOf(emailResults)).replace("{" + "assemblyName" + "}", String.valueOf(assemblyName));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || targetType == null || emailResults == null || assemblyName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (MergeTemplateResponse) ApiInvoker.deserialize(response, "", MergeTemplateResponse.class);
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
  public GetQuestionnaireResponse GetQuestionnaire (String userId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnaireResponse) ApiInvoker.deserialize(response, "", GetQuestionnaireResponse.class);
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
  public GetQuestionnairesResponse GetQuestionnaires (String userId, String status, Integer pageNumber, Integer pageSize) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires?status={status}&page_number={pageNumber}&page_size={pageSize}".replace("*", "");
  	resourcePath = resourcePath.substring(0, resourcePath.indexOf("?"));
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(status)))
      queryParams.put("status", String.valueOf(status));
    if(!"null".equals(String.valueOf(pageNumber)))
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(!"null".equals(String.valueOf(pageSize)))
      queryParams.put("pageSize", String.valueOf(pageSize));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnairesResponse) ApiInvoker.deserialize(response, "", GetQuestionnairesResponse.class);
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
  public CreateQuestionnaireResponse CreateQuestionnaire (String userId, QuestionnaireInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires".replace("*", "");
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
        return (CreateQuestionnaireResponse) ApiInvoker.deserialize(response, "", CreateQuestionnaireResponse.class);
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
  public UpdateQuestionnaireResponse UpdateQuestionnaire (String userId, String questionnaireId, QuestionnaireInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (UpdateQuestionnaireResponse) ApiInvoker.deserialize(response, "", UpdateQuestionnaireResponse.class);
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
  public DeleteQuestionnaireResponse DeleteQuestionnaire (String userId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DeleteQuestionnaireResponse) ApiInvoker.deserialize(response, "", DeleteQuestionnaireResponse.class);
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
  public GetDocumentQuestionnairesResponse GetDocumentQuestionnaires (String userId, String fileId) throws ApiException {
  	String resourcePath = "/merge/{userId}/files/{fileId}/questionnaires".replace("*", "");
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
        return (GetDocumentQuestionnairesResponse) ApiInvoker.deserialize(response, "", GetDocumentQuestionnairesResponse.class);
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
  public AddDocumentQuestionnaireResponse CreateDocumentQuestionnaire (String userId, String fileId, QuestionnaireInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/files/{fileId}/questionnaires".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (AddDocumentQuestionnaireResponse) ApiInvoker.deserialize(response, "", AddDocumentQuestionnaireResponse.class);
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
  public AddDocumentQuestionnaireResponse AddDocumentQuestionnaire (String userId, String fileId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/files/{fileId}/questionnaires/{questionnaireId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (AddDocumentQuestionnaireResponse) ApiInvoker.deserialize(response, "", AddDocumentQuestionnaireResponse.class);
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
  public DeleteDocumentQuestionnaireResponse DeleteDocumentQuestionnaire (String userId, String fileId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/files/{fileId}/questionnaires/{questionnaireId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fileId" + "}", String.valueOf(fileId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || fileId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DeleteDocumentQuestionnaireResponse) ApiInvoker.deserialize(response, "", DeleteDocumentQuestionnaireResponse.class);
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
  public AddDatasourceResponse AddDataSource (String userId, Datasource body) throws ApiException {
  	String resourcePath = "/merge/{userId}/datasources".replace("*", "");
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
        return (AddDatasourceResponse) ApiInvoker.deserialize(response, "", AddDatasourceResponse.class);
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
  public AddDatasourceResponse UpdateDataSource (String userId, String datasourceId, Datasource body) throws ApiException {
  	String resourcePath = "/merge/{userId}/datasources/{datasourceId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || datasourceId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (AddDatasourceResponse) ApiInvoker.deserialize(response, "", AddDatasourceResponse.class);
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
  public AddDatasourceResponse UpdateDataSourceFields (String userId, String datasourceId, Datasource body) throws ApiException {
  	String resourcePath = "/merge/{userId}/datasources/{datasourceId}/fields".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || datasourceId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (AddDatasourceResponse) ApiInvoker.deserialize(response, "", AddDatasourceResponse.class);
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
  public DeleteDatasourceResponse DeleteDataSource (String userId, String datasourceId) throws ApiException {
  	String resourcePath = "/merge/{userId}/datasources/{datasourceId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || datasourceId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DeleteDatasourceResponse) ApiInvoker.deserialize(response, "", DeleteDatasourceResponse.class);
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
  public GetDatasourceResponse GetDataSource (String userId, String datasourceId, String fields) throws ApiException {
  	String resourcePath = "/merge/{userId}/datasources/{datasourceId}?field={fields}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "datasourceId" + "}", String.valueOf(datasourceId)).replace("{" + "fields" + "}", String.valueOf(fields));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || datasourceId == null || fields == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetDatasourceResponse) ApiInvoker.deserialize(response, "", GetDatasourceResponse.class);
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
  public GetDatasourcesResponse GetQuestionnaireDataSources (String userId, String questionnaireId, Boolean includeFields) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/datasources?include_fields={includeFields}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId)).replace("{" + "includeFields" + "}", String.valueOf(includeFields));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null || includeFields == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetDatasourcesResponse) ApiInvoker.deserialize(response, "", GetDatasourcesResponse.class);
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
  public AddQuestionnaireExecutionResponse AddQuestionnaireExecution (String userId, String collectorId, QuestionnaireExecutionInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/collectors/{collectorId}/executions".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "collectorId" + "}", String.valueOf(collectorId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || collectorId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (AddQuestionnaireExecutionResponse) ApiInvoker.deserialize(response, "", AddQuestionnaireExecutionResponse.class);
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
  public GetQuestionnaireExecutionsResponse GetQuestionnaireCollectorExecutions (String userId, String collectorId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/collectors/{collectorId}/executions".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "collectorId" + "}", String.valueOf(collectorId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || collectorId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnaireExecutionsResponse) ApiInvoker.deserialize(response, "", GetQuestionnaireExecutionsResponse.class);
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
  public GetQuestionnaireExecutionsResponse GetQuestionnaireExecutions (String userId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/executions".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnaireExecutionsResponse) ApiInvoker.deserialize(response, "", GetQuestionnaireExecutionsResponse.class);
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
  public DeleteQuestionnaireExecutionResponse DeleteQuestionnaireExecution (String userId, String executionId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/executions/{executionId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "executionId" + "}", String.valueOf(executionId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || executionId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DeleteQuestionnaireExecutionResponse) ApiInvoker.deserialize(response, "", DeleteQuestionnaireExecutionResponse.class);
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
  public UpdateQuestionnaireExecutionResponse UpdateQuestionnaireExecution (String userId, String executionId, QuestionnaireExecutionInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/executions/{executionId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "executionId" + "}", String.valueOf(executionId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || executionId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (UpdateQuestionnaireExecutionResponse) ApiInvoker.deserialize(response, "", UpdateQuestionnaireExecutionResponse.class);
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
  public UpdateQuestionnaireExecutionResponse UpdateQuestionnaireExecutionStatus (String userId, String executionId, String body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/executions/{executionId}/status".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "executionId" + "}", String.valueOf(executionId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || executionId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (UpdateQuestionnaireExecutionResponse) ApiInvoker.deserialize(response, "", UpdateQuestionnaireExecutionResponse.class);
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
  public GetQuestionnaireCollectorsResponse GetQuestionnaireCollectors (String userId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/collectors".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnaireCollectorsResponse) ApiInvoker.deserialize(response, "", GetQuestionnaireCollectorsResponse.class);
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
  public GetQuestionnaireCollectorResponse GetQuestionnaireCollector (String userId, String collectorId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/collectors/{collectorId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "collectorId" + "}", String.valueOf(collectorId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || collectorId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnaireCollectorResponse) ApiInvoker.deserialize(response, "", GetQuestionnaireCollectorResponse.class);
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
  public AddQuestionnaireCollectorResponse AddQuestionnaireCollector (String userId, String questionnaireId, QuestionnaireCollectorInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/collectors".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (AddQuestionnaireCollectorResponse) ApiInvoker.deserialize(response, "", AddQuestionnaireCollectorResponse.class);
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
  public UpdateQuestionnaireCollectorResponse UpdateQuestionnaireCollector (String userId, String collectorId, QuestionnaireCollectorInfo body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/collectors/{collectorId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "collectorId" + "}", String.valueOf(collectorId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || collectorId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (UpdateQuestionnaireCollectorResponse) ApiInvoker.deserialize(response, "", UpdateQuestionnaireCollectorResponse.class);
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
  public DeleteQuestionnaireCollectorResponse DeleteQuestionnaireCollector (String userId, String collectorId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/collectors/{collectorId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "collectorId" + "}", String.valueOf(collectorId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || collectorId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (DeleteQuestionnaireCollectorResponse) ApiInvoker.deserialize(response, "", DeleteQuestionnaireCollectorResponse.class);
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
  public GetTemplatesResponse GetTemplates (String userId) throws ApiException {
  	String resourcePath = "/merge/{userId}/templates".replace("*", "");
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
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetTemplatesResponse) ApiInvoker.deserialize(response, "", GetTemplatesResponse.class);
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
  public TemplateFieldsResponse GetQuestionnaireFields (String userId, String questionnaireId, Boolean includeGeometry) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/fields?include_geometry={includeGeometry}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId)).replace("{" + "includeGeometry" + "}", String.valueOf(includeGeometry));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null || includeGeometry == null ) {
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
  public GetQuestionnaireMetadataResponse GetQuestionnaireMetadata (String userId, String questionnaireId) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/metadata".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetQuestionnaireMetadataResponse) ApiInvoker.deserialize(response, "", GetQuestionnaireMetadataResponse.class);
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
  public UpdateQuestionnaireResponse UpdateQuestionnaireMetadata (String userId, String questionnaireId, QuestionnaireMetadata body) throws ApiException {
  	String resourcePath = "/merge/{userId}/questionnaires/{questionnaireId}/metadata".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "questionnaireId" + "}", String.valueOf(questionnaireId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || questionnaireId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (UpdateQuestionnaireResponse) ApiInvoker.deserialize(response, "", UpdateQuestionnaireResponse.class);
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

