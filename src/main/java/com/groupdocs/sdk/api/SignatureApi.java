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
import com.groupdocs.sdk.model.SignatureEnvelopeResponse;
import com.groupdocs.sdk.model.SignatureStatusResponse;
import com.groupdocs.sdk.model.SignatureContactResponse;
import com.groupdocs.sdk.model.SignatureRolesResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldsResponse;
import com.groupdocs.sdk.model.SignatureFormDocumentsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeRecipientResponse;
import com.groupdocs.sdk.model.PublicSignatureSignDocumentSignerSettings;
import com.groupdocs.sdk.model.SignatureFormResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeResourcesResponse;
import com.groupdocs.sdk.model.SignatureContactSettings;
import com.groupdocs.sdk.model.SignatureEnvelopeDocumentsResponse;
import com.groupdocs.sdk.model.SignatureTemplatesResponse;
import com.groupdocs.sdk.model.SignatureTemplateAssignFieldSettings;
import com.groupdocs.sdk.model.SignatureFieldsResponse;
import com.groupdocs.sdk.model.SignatureTemplateFieldsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldResponse;
import com.groupdocs.sdk.model.SignaturePredefinedListSettings;
import com.groupdocs.sdk.model.SignatureContactsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeSettings;
import com.groupdocs.sdk.model.SignatureFormsResponse;
import com.groupdocs.sdk.model.SignatureFormFieldLocationSettings;
import com.groupdocs.sdk.model.SignatureSignatureSettings;
import com.groupdocs.sdk.model.SignatureTemplateDocumentResponse;
import com.groupdocs.sdk.model.SignatureTemplateFieldSettings;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldSettings;
import com.groupdocs.sdk.model.SignatureFormDocumentResponse;
import com.groupdocs.sdk.model.SignatureSignDocumentResponse;
import com.groupdocs.sdk.model.SignatureFormSettings;
import com.groupdocs.sdk.model.SignatureFormFieldSettings;
import com.groupdocs.sdk.model.SignatureFormResourcesResponse;
import com.groupdocs.sdk.model.SignatureTemplateSettings;
import com.groupdocs.sdk.model.SignatureContactsImportResponse;
import com.groupdocs.sdk.model.SignatureFormFieldResponse;
import com.groupdocs.sdk.model.SignatureFormParticipantResponse;
import com.groupdocs.sdk.model.SignatureTemplateResourcesResponse;
import com.groupdocs.sdk.model.SignatureTemplateDocumentsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldLocationSettings;
import com.groupdocs.sdk.model.SignatureEnvelopeRecipientsResponse;
import com.groupdocs.sdk.model.SignatureSignatureResponse;
import com.groupdocs.sdk.model.SignatureFieldResponse;
import com.groupdocs.sdk.model.SignatureTemplateFieldResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeAssignFieldSettings;
import com.groupdocs.sdk.model.SignatureTemplateFieldLocationSettings;
import com.groupdocs.sdk.model.SignatureTemplateRecipientResponse;
import com.groupdocs.sdk.model.SignatureEnvelopesResponse;
import com.groupdocs.sdk.model.SignatureFormFieldsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeDocumentResponse;
import com.groupdocs.sdk.model.SignatureFieldSettings;
import com.groupdocs.sdk.model.SignaturePredefinedListResponse;
import com.groupdocs.sdk.model.SignatureSignDocumentSettings;
import com.groupdocs.sdk.model.SignatureSignaturesResponse;
import com.groupdocs.sdk.model.SignatureVerifyDocumentResponse;
import com.groupdocs.sdk.model.SignaturePredefinedListsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeAuditLogsResponse;
import com.groupdocs.sdk.model.SignatureContactIntegrationSettings;
import com.groupdocs.sdk.model.SignatureEnvelopeSendResponse;
import com.groupdocs.sdk.model.SignatureTemplateResponse;
import com.groupdocs.sdk.model.SignatureSignDocumentStatusResponse;
import com.groupdocs.sdk.model.SignatureTemplateRecipientsResponse;
import java.util.*;

public class SignatureApi {
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

  public SignatureStatusResponse AddContactIntegration (String userId, SignatureContactIntegrationSettings body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/integration".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureSignDocumentResponse SignDocument (String userId, SignatureSignDocumentSettings body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/sign".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureSignDocumentResponse) ApiInvoker.deserialize(response, "", SignatureSignDocumentResponse.class);
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
  public SignatureSignDocumentStatusResponse GetSignDocumentStatus (String userId, String jobGuid) throws ApiException {
    // verify required params are set
    if(userId == null || jobGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/documents/{jobGuid}/status".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobGuid" + "}", String.valueOf(jobGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureSignDocumentStatusResponse) ApiInvoker.deserialize(response, "", SignatureSignDocumentStatusResponse.class);
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
  public SignatureStatusResponse ArchiveSignatureEnvelope (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/archive".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeAuditLogsResponse GetEnvelopeAuditLogs (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/logs".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeAuditLogsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeAuditLogsResponse.class);
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
  public SignatureEnvelopeResponse CreateSignatureEnvelope (String userId, String name, String templateGuid, String envelopeGuid, String documentGuid, SignatureEnvelopeSettings body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelope?name={name}&templateId={templateGuid}&envelopeId={envelopeGuid}&documentId={documentGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(templateGuid)))
      queryParams.put("templateId", String.valueOf(templateGuid));
    if(!"null".equals(String.valueOf(envelopeGuid)))
      queryParams.put("envelopeId", String.valueOf(envelopeGuid));
    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("documentId", String.valueOf(documentGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeResponse.class);
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
  public SignatureStatusResponse DeclineEnvelope (String userId, String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}/decline".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureStatusResponse DelegateEnvelopeRecipient (String userId, String envelopeGuid, String recipientGuid, String recipientEmail, String recipientFirstName, String recipientLastName) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || recipientGuid == null || recipientEmail == null || recipientFirstName == null || recipientLastName == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}/delegate?email={recipientEmail}&firstname={recipientFirstName}&lastname={recipientLastName}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(recipientEmail)))
      queryParams.put("email", String.valueOf(recipientEmail));
    if(!"null".equals(String.valueOf(recipientFirstName)))
      queryParams.put("firstname", String.valueOf(recipientFirstName));
    if(!"null".equals(String.valueOf(recipientLastName)))
      queryParams.put("lastname", String.valueOf(recipientLastName));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureStatusResponse DeleteSignatureEnvelope (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeDocumentResponse AddSignatureEnvelopeDocument (String userId, String envelopeGuid, String documentGuid, Integer order) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/document/{documentGuid}?order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeDocumentResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeDocumentResponse.class);
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
  public FileStream GetSignedEnvelopeDocument (String userId, String envelopeGuid, String documentGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/document/{documentGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

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
  public SignatureStatusResponse DeleteSignatureEnvelopeDocument (String userId, String envelopeGuid, String documentGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeDocumentsResponse GetSignatureEnvelopeDocuments (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeDocumentsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeDocumentsResponse.class);
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
  public FileStream GetSignedEnvelopeDocuments (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/get".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

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
  public SignatureEnvelopeFieldsResponse AddSignatureEnvelopeField (String userId, String envelopeGuid, String documentGuid, String recipientGuid, String fieldGuid, SignatureEnvelopeFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null || recipientGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldsResponse.class);
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
  public SignatureEnvelopeFieldResponse AssignSignatureEnvelopeField (String userId, String envelopeGuid, String documentGuid, String fieldGuid, SignatureEnvelopeAssignFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldResponse.class);
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
  public SignatureEnvelopeFieldResponse FillEnvelopeField (String userId, String envelopeGuid, String documentGuid, String recipientGuid, String fieldGuid, String signatureGuid, FileStream body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null || recipientGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}?signatureId={signatureGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(signatureGuid)))
      queryParams.put("signatureId", String.valueOf(signatureGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldResponse.class);
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
  public SignatureEnvelopeFieldResponse ModifySignatureEnvelopeFieldLocation (String userId, String envelopeGuid, String documentGuid, String recipientGuid, String fieldGuid, String locationGuid, SignatureEnvelopeFieldLocationSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null || recipientGuid == null || fieldGuid == null || locationGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldResponse.class);
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
  public SignatureStatusResponse DeleteSignatureEnvelopeFieldLocation (String userId, String envelopeGuid, String fieldGuid, String locationGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || fieldGuid == null || locationGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeFieldResponse ModifySignatureEnvelopeField (String userId, String envelopeGuid, String documentGuid, String fieldGuid, SignatureEnvelopeFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || documentGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldResponse.class);
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
  public SignatureStatusResponse DeleteSignatureEnvelopeField (String userId, String envelopeGuid, String fieldGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/fields/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeFieldsResponse GetSignatureEnvelopeFields (String userId, String envelopeGuid, String documentGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/fields?document={documentGuid}&recipient={recipientGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("document", String.valueOf(documentGuid));
    if(!"null".equals(String.valueOf(recipientGuid)))
      queryParams.put("recipient", String.valueOf(recipientGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldsResponse.class);
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
  public SignatureEnvelopeResponse GetSignatureEnvelope (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeResponse.class);
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
  public SignatureEnvelopeResponse ModifySignatureEnvelope (String userId, String envelopeGuid, SignatureEnvelopeSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeResponse.class);
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
  public SignatureEnvelopeRecipientResponse AddSignatureEnvelopeRecipient (String userId, String envelopeGuid, String recipientEmail, String recipientFirstName, String recipientLastName, String roleGuid, Integer order) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || recipientEmail == null || recipientFirstName == null || recipientLastName == null || roleGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient?email={recipientEmail}&firstname={recipientFirstName}&lastname={recipientLastName}&role={roleGuid}&order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(recipientEmail)))
      queryParams.put("email", String.valueOf(recipientEmail));
    if(!"null".equals(String.valueOf(recipientFirstName)))
      queryParams.put("firstname", String.valueOf(recipientFirstName));
    if(!"null".equals(String.valueOf(recipientLastName)))
      queryParams.put("lastname", String.valueOf(recipientLastName));
    if(!"null".equals(String.valueOf(roleGuid)))
      queryParams.put("role", String.valueOf(roleGuid));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeRecipientResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeRecipientResponse.class);
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
  public SignatureEnvelopeRecipientResponse ModifySignatureEnvelopeRecipient (String userId, String envelopeGuid, String recipientGuid, String recipientEmail, String recipientFirstName, String recipientLastName, String roleGuid, Integer order) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || recipientGuid == null || recipientEmail == null || recipientFirstName == null || recipientLastName == null || roleGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}?email={recipientEmail}&firstname={recipientFirstName}&lastname={recipientLastName}&role={roleGuid}&order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(recipientEmail)))
      queryParams.put("email", String.valueOf(recipientEmail));
    if(!"null".equals(String.valueOf(recipientFirstName)))
      queryParams.put("firstname", String.valueOf(recipientFirstName));
    if(!"null".equals(String.valueOf(recipientLastName)))
      queryParams.put("lastname", String.valueOf(recipientLastName));
    if(!"null".equals(String.valueOf(roleGuid)))
      queryParams.put("role", String.valueOf(roleGuid));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeRecipientResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeRecipientResponse.class);
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
  public SignatureStatusResponse DeleteSignatureEnvelopeRecipient (String userId, String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipients/{recipientGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeRecipientsResponse GetSignatureEnvelopeRecipients (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipients".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeRecipientsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeRecipientsResponse.class);
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
  public SignatureEnvelopeResponse RenameSignatureEnvelope (String userId, String envelopeGuid, String name) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || name == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}?name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeResponse.class);
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
  public SignatureStatusResponse RestartExpiredSignatureEnvelope (String userId, String envelopeGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/restart".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeSendResponse SignatureEnvelopeSend (String userId, String envelopeGuid, FileStream body) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/send".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeSendResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeSendResponse.class);
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
  public SignatureStatusResponse SignEnvelope (String userId, String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(userId == null || envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}/sign".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopesResponse GetSignatureEnvelopes (String userId, Integer statusId, Integer page, Integer records, String date, String name, String document, String recipient) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes?statusId={statusId}&records={records}&page={page}&document={originalDocumentMD5}&recipient={recipientEmail}&date={date}&name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(statusId)))
      queryParams.put("statusId", String.valueOf(statusId));
    if(!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    if(!"null".equals(String.valueOf(records)))
      queryParams.put("records", String.valueOf(records));
    if(!"null".equals(String.valueOf(date)))
      queryParams.put("date", String.valueOf(date));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(document)))
      queryParams.put("document", String.valueOf(document));
    if(!"null".equals(String.valueOf(recipient)))
      queryParams.put("recipient", String.valueOf(recipient));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopesResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopesResponse.class);
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
  public SignatureEnvelopeResourcesResponse GetSignatureEnvelopeResources (String userId, String statusIds) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/resources?statusIds={statusIds}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(statusIds)))
      queryParams.put("statusIds", String.valueOf(statusIds));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeResourcesResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeResourcesResponse.class);
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
  public SignatureEnvelopesResponse GetRecipientSignatureEnvelopes (String userId, String statusId, Integer page, Integer records) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/envelopes/recipient?statusId={statusId}&records={records}&page={page}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(statusId)))
      queryParams.put("statusId", String.valueOf(statusId));
    if(!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    if(!"null".equals(String.valueOf(records)))
      queryParams.put("records", String.valueOf(records));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopesResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopesResponse.class);
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
  public SignatureStatusResponse ArchiveSignatureForm (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/archive".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureStatusResponse CompleteSignatureForm (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/complete".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormResponse CreateSignatureForm (String userId, String name, String templateGuid, String assemblyGuid, String formGuid, SignatureFormSettings body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/form?name={name}&templateId={templateGuid}&assemblyId={assemblyGuid}&formId={formGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(templateGuid)))
      queryParams.put("templateId", String.valueOf(templateGuid));
    if(!"null".equals(String.valueOf(assemblyGuid)))
      queryParams.put("assemblyId", String.valueOf(assemblyGuid));
    if(!"null".equals(String.valueOf(formGuid)))
      queryParams.put("formId", String.valueOf(formGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFormResponse) ApiInvoker.deserialize(response, "", SignatureFormResponse.class);
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
  public SignatureStatusResponse DeleteSignatureForm (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormDocumentResponse AddSignatureFormDocument (String userId, String formGuid, String documentGuid, Integer order) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/document/{documentGuid}?order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormDocumentResponse) ApiInvoker.deserialize(response, "", SignatureFormDocumentResponse.class);
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
  public SignatureStatusResponse DeleteSignatureFormDocument (String userId, String formGuid, String documentGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormDocumentsResponse GetSignatureFormDocuments (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormDocumentsResponse) ApiInvoker.deserialize(response, "", SignatureFormDocumentsResponse.class);
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
  public SignatureFormFieldResponse AddSignatureFormField (String userId, String formGuid, String documentGuid, String fieldGuid, SignatureFormFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || documentGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFormFieldResponse) ApiInvoker.deserialize(response, "", SignatureFormFieldResponse.class);
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
  public SignatureFormFieldResponse ModifySignatureFormFieldLocation (String userId, String formGuid, String documentGuid, String fieldGuid, String locationGuid, SignatureFormFieldLocationSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || documentGuid == null || fieldGuid == null || locationGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFormFieldResponse) ApiInvoker.deserialize(response, "", SignatureFormFieldResponse.class);
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
  public SignatureStatusResponse DeleteSignatureFormFieldLocation (String userId, String formGuid, String fieldGuid, String locationGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || fieldGuid == null || locationGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormFieldResponse ModifySignatureFormField (String userId, String formGuid, String documentGuid, String fieldGuid, SignatureFormFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || documentGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFormFieldResponse) ApiInvoker.deserialize(response, "", SignatureFormFieldResponse.class);
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
  public SignatureStatusResponse DeleteSignatureFormField (String userId, String formGuid, String fieldGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/fields/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormFieldsResponse GetSignatureFormFields (String userId, String formGuid, String documentGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/fields".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormFieldsResponse) ApiInvoker.deserialize(response, "", SignatureFormFieldsResponse.class);
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
  public SignatureFormResponse GetSignatureForm (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormResponse) ApiInvoker.deserialize(response, "", SignatureFormResponse.class);
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
  public SignatureFormResponse ModifySignatureForm (String userId, String formGuid, SignatureFormSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFormResponse) ApiInvoker.deserialize(response, "", SignatureFormResponse.class);
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
  public SignatureStatusResponse PublishSignatureForm (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/publish".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormResponse RenameSignatureForm (String userId, String formGuid, String name) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || name == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}?new_name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("new_name", String.valueOf(name));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormResponse) ApiInvoker.deserialize(response, "", SignatureFormResponse.class);
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
  public SignatureFormResponse UpdateSignatureFormFromTemplate (String userId, String formGuid, String templateGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/templates/{templateGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormResponse) ApiInvoker.deserialize(response, "", SignatureFormResponse.class);
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
  public SignatureFormsResponse GetSignatureForms (String userId, Integer statusId, Integer page, Integer records, String date, String name, String documentGuid) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms?statusId={statusId}&records={records}&page={page}&document={originalDocumentMD5}&date={date}&name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(statusId)))
      queryParams.put("statusId", String.valueOf(statusId));
    if(!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    if(!"null".equals(String.valueOf(records)))
      queryParams.put("records", String.valueOf(records));
    if(!"null".equals(String.valueOf(date)))
      queryParams.put("date", String.valueOf(date));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("documentGuid", String.valueOf(documentGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormsResponse) ApiInvoker.deserialize(response, "", SignatureFormsResponse.class);
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
  public SignatureFormResourcesResponse GetSignatureFormResources (String userId, String statusIds) throws ApiException {
    // verify required params are set
    if(userId == null || statusIds == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/resources?statusIds={statusIds}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(statusIds)))
      queryParams.put("statusIds", String.valueOf(statusIds));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormResourcesResponse) ApiInvoker.deserialize(response, "", SignatureFormResourcesResponse.class);
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
  public FileStream GetSignedFormDocuments (String userId, String formGuid) throws ApiException {
    // verify required params are set
    if(userId == null || formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/get".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

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
  public SignaturePredefinedListsResponse GetSignaturePredefinedLists (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/lists".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignaturePredefinedListsResponse) ApiInvoker.deserialize(response, "", SignaturePredefinedListsResponse.class);
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
  public SignaturePredefinedListResponse AddPredefinedList (String userId, SignaturePredefinedListSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/list".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignaturePredefinedListResponse) ApiInvoker.deserialize(response, "", SignaturePredefinedListResponse.class);
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
  public SignaturePredefinedListResponse DeletePredefinedList (String userId, String listGuid) throws ApiException {
    // verify required params are set
    if(userId == null || listGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/lists/{listGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "listGuid" + "}", String.valueOf(listGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignaturePredefinedListResponse) ApiInvoker.deserialize(response, "", SignaturePredefinedListResponse.class);
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
  public SignatureRolesResponse GetRolesList (String userId, String roleGuid) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/roles?id={roleGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(roleGuid)))
      queryParams.put("id", String.valueOf(roleGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureRolesResponse) ApiInvoker.deserialize(response, "", SignatureRolesResponse.class);
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
  public SignatureSignatureResponse CreateSignature (String userId, String name, SignatureSignatureSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || name == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/signature?name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureSignatureResponse) ApiInvoker.deserialize(response, "", SignatureSignatureResponse.class);
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
  public SignatureStatusResponse DeleteSignature (String userId, String signatureGuid) throws ApiException {
    // verify required params are set
    if(userId == null || signatureGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/signatures/{signatureGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "signatureGuid" + "}", String.valueOf(signatureGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureSignaturesResponse GetSignatures (String userId, Integer page, Integer records, String name) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/signatures?records={records}&page={page}&name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    if(!"null".equals(String.valueOf(records)))
      queryParams.put("records", String.valueOf(records));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureSignaturesResponse) ApiInvoker.deserialize(response, "", SignatureSignaturesResponse.class);
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
  public SignatureTemplatesResponse GetSignatureTemplates (String userId, Integer page, Integer records, String documentGuid, String recipientName, String name) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates?records={records}&page={page}&documentGuid={documentGuid}&recipientName={recipientName}&name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    if(!"null".equals(String.valueOf(records)))
      queryParams.put("records", String.valueOf(records));
    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("documentGuid", String.valueOf(documentGuid));
    if(!"null".equals(String.valueOf(recipientName)))
      queryParams.put("recipientName", String.valueOf(recipientName));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplatesResponse) ApiInvoker.deserialize(response, "", SignatureTemplatesResponse.class);
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
  public SignatureTemplateResponse GetSignatureTemplate (String userId, String templateGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateResponse) ApiInvoker.deserialize(response, "", SignatureTemplateResponse.class);
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
  public SignatureTemplateResponse CreateSignatureTemplate (String userId, String name, String templateGuid, String envelopeGuid, SignatureTemplateSettings body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/template?name={name}&templateId={templateGuid}&envelopeId={envelopeGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(templateGuid)))
      queryParams.put("templateId", String.valueOf(templateGuid));
    if(!"null".equals(String.valueOf(envelopeGuid)))
      queryParams.put("envelopeId", String.valueOf(envelopeGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateResponse) ApiInvoker.deserialize(response, "", SignatureTemplateResponse.class);
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
  public SignatureTemplateResponse ModifySignatureTemplate (String userId, String templateGuid, SignatureTemplateSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateResponse) ApiInvoker.deserialize(response, "", SignatureTemplateResponse.class);
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
  public SignatureTemplateResponse RenameSignatureTemplate (String userId, String templateGuid, String name) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || name == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}?name={name}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateResponse) ApiInvoker.deserialize(response, "", SignatureTemplateResponse.class);
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
  public SignatureStatusResponse DeleteSignatureTemplate (String userId, String templateGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureTemplateRecipientResponse AddSignatureTemplateRecipient (String userId, String templateGuid, String nickname, String roleGuid, Integer order) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || nickname == null || roleGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipient?nickname={nickname}&role={roleGuid}&order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(nickname)))
      queryParams.put("nickname", String.valueOf(nickname));
    if(!"null".equals(String.valueOf(roleGuid)))
      queryParams.put("role", String.valueOf(roleGuid));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateRecipientResponse) ApiInvoker.deserialize(response, "", SignatureTemplateRecipientResponse.class);
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
  public SignatureTemplateRecipientsResponse GetSignatureTemplateRecipients (String userId, String templateGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipients".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateRecipientsResponse) ApiInvoker.deserialize(response, "", SignatureTemplateRecipientsResponse.class);
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
  public SignatureStatusResponse DeleteSignatureTemplateRecipient (String userId, String templateGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipients/{recipientGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureTemplateRecipientResponse ModifySignatureTemplateRecipient (String userId, String templateGuid, String recipientGuid, String nickname, String roleGuid, String order) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || recipientGuid == null || nickname == null || roleGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipient/{recipientGuid}?nickname={nickname}&role={roleGuid}&order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(nickname)))
      queryParams.put("nickname", String.valueOf(nickname));
    if(!"null".equals(String.valueOf(roleGuid)))
      queryParams.put("role", String.valueOf(roleGuid));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateRecipientResponse) ApiInvoker.deserialize(response, "", SignatureTemplateRecipientResponse.class);
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
  public SignatureTemplateDocumentResponse AddSignatureTemplateDocument (String userId, String templateGuid, String documentGuid, Integer order) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/document/{documentGuid}?order={order}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateDocumentResponse) ApiInvoker.deserialize(response, "", SignatureTemplateDocumentResponse.class);
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
  public SignatureTemplateDocumentsResponse GetSignatureTemplateDocuments (String userId, String templateGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateDocumentsResponse) ApiInvoker.deserialize(response, "", SignatureTemplateDocumentsResponse.class);
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
  public SignatureStatusResponse DeleteSignatureTemplateDocument (String userId, String templateGuid, String documentGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureTemplateFieldResponse AddSignatureTemplateField (String userId, String templateGuid, String documentGuid, String recipientGuid, String fieldGuid, SignatureTemplateFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || documentGuid == null || recipientGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateFieldResponse) ApiInvoker.deserialize(response, "", SignatureTemplateFieldResponse.class);
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
  public SignatureTemplateFieldResponse AssignSignatureTemplateField (String userId, String templateGuid, String documentGuid, String fieldGuid, SignatureTemplateAssignFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || documentGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateFieldResponse) ApiInvoker.deserialize(response, "", SignatureTemplateFieldResponse.class);
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
  public SignatureTemplateFieldResponse ModifySignatureTemplateField (String userId, String templateGuid, String documentGuid, String fieldGuid, SignatureTemplateFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || documentGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateFieldResponse) ApiInvoker.deserialize(response, "", SignatureTemplateFieldResponse.class);
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
  public SignatureStatusResponse DeleteSignatureTemplateFieldLocation (String userId, String templateGuid, String fieldGuid, String locationGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || fieldGuid == null || locationGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureTemplateFieldResponse ModifySignatureTemplateFieldLocation (String userId, String templateGuid, String documentGuid, String recipientGuid, String fieldGuid, String locationGuid, SignatureTemplateFieldLocationSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || documentGuid == null || recipientGuid == null || fieldGuid == null || locationGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/recipient/{recipientGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateFieldResponse) ApiInvoker.deserialize(response, "", SignatureTemplateFieldResponse.class);
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
  public SignatureTemplateFieldsResponse GetSignatureTemplateFields (String userId, String templateGuid, String documentGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/fields?document={documentGuid}&recipient={recipientGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("document", String.valueOf(documentGuid));
    if(!"null".equals(String.valueOf(recipientGuid)))
      queryParams.put("recipient", String.valueOf(recipientGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateFieldsResponse) ApiInvoker.deserialize(response, "", SignatureTemplateFieldsResponse.class);
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
  public SignatureTemplateResponse DeleteSignatureTemplateField (String userId, String templateGuid, String fieldGuid) throws ApiException {
    // verify required params are set
    if(userId == null || templateGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/{templateGuid}/fields/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateResponse) ApiInvoker.deserialize(response, "", SignatureTemplateResponse.class);
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
  public SignatureTemplateResourcesResponse GetSignatureTemplateResources (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/templates/resources".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureTemplateResourcesResponse) ApiInvoker.deserialize(response, "", SignatureTemplateResourcesResponse.class);
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
  public SignatureFieldsResponse GetFieldsList (String userId, String fieldGuid) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/fields?id={fieldGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(fieldGuid)))
      queryParams.put("id", String.valueOf(fieldGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFieldsResponse) ApiInvoker.deserialize(response, "", SignatureFieldsResponse.class);
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
  public SignatureFieldResponse CreateSignatureField (String userId, SignatureFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/field".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFieldResponse) ApiInvoker.deserialize(response, "", SignatureFieldResponse.class);
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
  public SignatureFieldResponse ModifySignatureField (String userId, String fieldGuid, SignatureFieldSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/fields/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFieldResponse) ApiInvoker.deserialize(response, "", SignatureFieldResponse.class);
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
  public SignatureStatusResponse DeleteSignatureField (String userId, String fieldGuid) throws ApiException {
    // verify required params are set
    if(userId == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/fields/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureContactsResponse GetContacts (String userId, Integer page, Integer records, String firstName, String lastName, String email) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/contacts?firstName={firstName}&lastName={lastName}&email={email}&records={records}&page={page}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    if(!"null".equals(String.valueOf(records)))
      queryParams.put("records", String.valueOf(records));
    if(!"null".equals(String.valueOf(firstName)))
      queryParams.put("firstName", String.valueOf(firstName));
    if(!"null".equals(String.valueOf(lastName)))
      queryParams.put("lastName", String.valueOf(lastName));
    if(!"null".equals(String.valueOf(email)))
      queryParams.put("email", String.valueOf(email));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureContactsResponse) ApiInvoker.deserialize(response, "", SignatureContactsResponse.class);
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
  public SignatureContactResponse AddContact (String userId, SignatureContactSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/contact".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureContactResponse) ApiInvoker.deserialize(response, "", SignatureContactResponse.class);
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
  public SignatureContactResponse ModifyContact (String userId, String contactGuid, SignatureContactSettings body) throws ApiException {
    // verify required params are set
    if(userId == null || contactGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/contacts/{contactGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "contactGuid" + "}", String.valueOf(contactGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureContactResponse) ApiInvoker.deserialize(response, "", SignatureContactResponse.class);
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
  public SignatureContactResponse DeleteContact (String userId, String contactGuid) throws ApiException {
    // verify required params are set
    if(userId == null || contactGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/contacts/{contactGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "contactGuid" + "}", String.valueOf(contactGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureContactResponse) ApiInvoker.deserialize(response, "", SignatureContactResponse.class);
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
  public SignatureContactsImportResponse ImportContacts (String userId, List<SignatureContactSettings> body) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/{userId}/contacts".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureContactsImportResponse) ApiInvoker.deserialize(response, "", SignatureContactsImportResponse.class);
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
  public SignatureEnvelopeFieldResponse PublicFillEnvelopeField (String envelopeGuid, String documentGuid, String recipientGuid, String fieldGuid, String body) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null || documentGuid == null || recipientGuid == null || fieldGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldResponse.class);
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
  public SignatureStatusResponse PublicSignEnvelope (String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}/sign".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureEnvelopeDocumentsResponse PublicGetEnvelopeDocuments (String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}/documents".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeDocumentsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeDocumentsResponse.class);
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
  public SignatureEnvelopeRecipientsResponse PublicGetEnvelopeRecipients (String envelopeGuid) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipients".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeRecipientsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeRecipientsResponse.class);
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
  public SignatureEnvelopeFieldsResponse PublicGetSignatureEnvelopeFields (String envelopeGuid, String documentGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null || documentGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/fields?document={documentGuid}&recipient={recipientGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("document", String.valueOf(documentGuid));
    if(!"null".equals(String.valueOf(recipientGuid)))
      queryParams.put("recipient", String.valueOf(recipientGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeFieldsResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeFieldsResponse.class);
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
  public SignatureEnvelopeResponse PublicGetSignatureEnvelope (String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureEnvelopeResponse) ApiInvoker.deserialize(response, "", SignatureEnvelopeResponse.class);
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
  public String PublicGetSignedEnvelopeDocuments (String envelopeGuid, String recipientGuid) throws ApiException {
    // verify required params are set
    if(envelopeGuid == null || recipientGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}/documents/get".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
  public SignatureFormParticipantResponse PublicFillSignatureForm (String formGuid) throws ApiException {
    // verify required params are set
    if(formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/fill".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormParticipantResponse) ApiInvoker.deserialize(response, "", SignatureFormParticipantResponse.class);
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
  public SignatureFormFieldResponse PublicFillFormField (String formGuid, String documentGuid, String fieldGuid, String authSignature, String body, String participantIdId) throws ApiException {
    // verify required params are set
    if(formGuid == null || documentGuid == null || fieldGuid == null || authSignature == null || participantIdId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/documents/{documentGuid}/participant/{participantGuid}/field/{fieldGuid}?participantAuthSignature={authSignature}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "participantIdId" + "}", String.valueOf(participantIdId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(authSignature)))
      queryParams.put("participantAuthSignature", String.valueOf(authSignature));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureFormFieldResponse) ApiInvoker.deserialize(response, "", SignatureFormFieldResponse.class);
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
  public SignatureStatusResponse PublicSignForm (String formGuid, String participantGuid, String authSignature) throws ApiException {
    // verify required params are set
    if(formGuid == null || participantGuid == null || authSignature == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}/sign?participantAuthSignature={authSignature}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(authSignature)))
      queryParams.put("participantAuthSignature", String.valueOf(authSignature));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureStatusResponse) ApiInvoker.deserialize(response, "", SignatureStatusResponse.class);
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
  public SignatureFormResponse PublicGetSignatureForm (String formGuid) throws ApiException {
    // verify required params are set
    if(formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormResponse) ApiInvoker.deserialize(response, "", SignatureFormResponse.class);
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
  public SignatureFormDocumentsResponse PublicGetSignatureFormDocuments (String formGuid) throws ApiException {
    // verify required params are set
    if(formGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/documents".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormDocumentsResponse) ApiInvoker.deserialize(response, "", SignatureFormDocumentsResponse.class);
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
  public SignatureFormFieldsResponse PublicGetSignatureFormFields (String formGuid, String documentGuid, String participantGuid) throws ApiException {
    // verify required params are set
    if(formGuid == null || documentGuid == null || participantGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/fields?document={documentGuid}&participant={participantGuid}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(documentGuid)))
      queryParams.put("document", String.valueOf(documentGuid));
    if(!"null".equals(String.valueOf(participantGuid)))
      queryParams.put("participant", String.valueOf(participantGuid));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormFieldsResponse) ApiInvoker.deserialize(response, "", SignatureFormFieldsResponse.class);
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
  public String PublicGetSignedFormDocuments (String formGuid, String participantGuid) throws ApiException {
    // verify required params are set
    if(formGuid == null || participantGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}/documents/get".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
  public SignatureFormParticipantResponse GetSignatureFormParticipant (String formGuid, String participantGuid) throws ApiException {
    // verify required params are set
    if(formGuid == null || participantGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/forms/{formGuid}/participants/{participantGuid}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureFormParticipantResponse) ApiInvoker.deserialize(response, "", SignatureFormParticipantResponse.class);
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
  public SignatureSignDocumentResponse PublicSignDocument (String documentGuid, PublicSignatureSignDocumentSignerSettings body) throws ApiException {
    // verify required params are set
    if(documentGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/documents/{documentGuid}/sign".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureSignDocumentResponse) ApiInvoker.deserialize(response, "", SignatureSignDocumentResponse.class);
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
  public SignatureVerifyDocumentResponse PublicVerifyDocument (FileStream body) throws ApiException {
    // verify required params are set
    if(body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/verify".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
      if(response != null){
        return (SignatureVerifyDocumentResponse) ApiInvoker.deserialize(response, "", SignatureVerifyDocumentResponse.class);
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
  public SignatureSignDocumentStatusResponse PublicGetSignDocumentStatus (String jobGuid) throws ApiException {
    // verify required params are set
    if(jobGuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/signature/public/documents/{jobGuid}/status".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "jobGuid" + "}", String.valueOf(jobGuid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (SignatureSignDocumentStatusResponse) ApiInvoker.deserialize(response, "", SignatureSignDocumentStatusResponse.class);
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

