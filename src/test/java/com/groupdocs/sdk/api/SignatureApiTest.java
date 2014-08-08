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

import static com.github.restdriver.clientdriver.RestClientDriver.giveResponse;
import static com.github.restdriver.clientdriver.RestClientDriver.onRequestTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.regex.Pattern;

import javax.ws.rs.core.MediaType;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.restdriver.clientdriver.ClientDriverRequest;
import com.github.restdriver.clientdriver.ClientDriverRequest.Method;
import com.github.restdriver.clientdriver.ClientDriverResponse;
import com.github.restdriver.clientdriver.ClientDriverRule;

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.FileStream;
import com.groupdocs.sdk.model.SignatureTemplateRecipientsResponse;
import com.groupdocs.sdk.model.SignatureStatusResponse;
import com.groupdocs.sdk.model.SignatureSignEnvelopeSettingsInfo;
import com.groupdocs.sdk.model.SignatureContactResponse;
import com.groupdocs.sdk.model.SignatureFormSettingsInfo;
import com.groupdocs.sdk.model.SignatureFormFieldLocationSettingsInfo;
import com.groupdocs.sdk.model.SignatureRolesResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldsResponse;
import com.groupdocs.sdk.model.PublicSignatureSignDocumentSignerSettingsInfo;
import com.groupdocs.sdk.model.SignatureFormDocumentsResponse;
import com.groupdocs.sdk.model.WebhookInfo;
import com.groupdocs.sdk.model.SignatureEnvelopeRecipientResponse;
import com.groupdocs.sdk.model.SignatureSignatureSettingsInfo;
import com.groupdocs.sdk.model.SignatureFormResponse;
import com.groupdocs.sdk.model.SignatureTemplateFieldLocationSettingsInfo;
import com.groupdocs.sdk.model.SignatureFieldSettingsInfo;
import com.groupdocs.sdk.model.SignatureFormDocumentSettingsInfo;
import com.groupdocs.sdk.model.SignatureSignFormSettingsInfo;
import com.groupdocs.sdk.model.SignatureEnvelopeResourcesResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeDocumentsResponse;
import com.groupdocs.sdk.model.SignatureTemplatesResponse;
import com.groupdocs.sdk.model.SignaturePredefinedListSettingsInfo;
import com.groupdocs.sdk.model.SignatureFieldsResponse;
import com.groupdocs.sdk.model.SignatureTemplateFieldsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldSettingsInfo;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldResponse;
import com.groupdocs.sdk.model.SignatureDocumentFieldsResponse;
import com.groupdocs.sdk.model.SignatureContactsResponse;
import com.groupdocs.sdk.model.SignatureFormsResponse;
import com.groupdocs.sdk.model.SignatureTemplateDocumentResponse;
import com.groupdocs.sdk.model.SignatureFormDocumentResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeSettingsInfo;
import com.groupdocs.sdk.model.SignatureSignDocumentResponse;
import com.groupdocs.sdk.model.SignatureFormAuditLogsResponse;
import com.groupdocs.sdk.model.SignatureFormResourcesResponse;
import com.groupdocs.sdk.model.SignatureContactsImportResponse;
import com.groupdocs.sdk.model.SignatureFormFieldResponse;
import com.groupdocs.sdk.model.SignatureFormParticipantResponse;
import com.groupdocs.sdk.model.SignatureFormFieldSettingsInfo;
import com.groupdocs.sdk.model.SignatureTemplateResourcesResponse;
import com.groupdocs.sdk.model.SignatureTemplateDocumentsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeRecipientsResponse;
import com.groupdocs.sdk.model.SignatureSignatureResponse;
import com.groupdocs.sdk.model.SignatureFieldResponse;
import com.groupdocs.sdk.model.SignatureTemplateFieldResponse;
import com.groupdocs.sdk.model.SignatureTemplateRecipientResponse;
import com.groupdocs.sdk.model.SignatureSignDocumentSettingsInfo;
import com.groupdocs.sdk.model.SignatureTemplateSettingsInfo;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldLocationSettingsInfo;
import com.groupdocs.sdk.model.SignatureEnvelopesResponse;
import com.groupdocs.sdk.model.SignatureFormFieldsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeDocumentResponse;
import com.groupdocs.sdk.model.SignaturePredefinedListResponse;
import com.groupdocs.sdk.model.SignatureContactSettingsInfo;
import com.groupdocs.sdk.model.SignatureSignaturesResponse;
import com.groupdocs.sdk.model.SignatureTemplateAssignFieldSettingsInfo;
import com.groupdocs.sdk.model.SignatureTemplateFieldSettingsInfo;
import com.groupdocs.sdk.model.SignatureVerifyDocumentResponse;
import com.groupdocs.sdk.model.SignaturePredefinedListsResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeAssignFieldSettingsInfo;
import com.groupdocs.sdk.model.SignatureEnvelopeAuditLogsResponse;
import com.groupdocs.sdk.model.SignatureContactIntegrationSettings;
import com.groupdocs.sdk.model.SignatureEnvelopeSendResponse;
import com.groupdocs.sdk.model.SignatureTemplateResponse;
import com.groupdocs.sdk.model.SignatureSignDocumentStatusResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeResponse;


public class SignatureApiTest extends AbstractUnitTest {
  
	SignatureApi api;
	
	@Rule
	public ClientDriverRule driver = new ClientDriverRule();
	
	@Before
	public void setUpBefore() throws Exception {
		api = new SignatureApi();
		api.setBasePath(driver.getBaseUrl());
	}

	@Test
	public void testGetSignatureTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateResponse response = api.GetSignatureTemplate(userId, templateGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCreateSignatureTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String name = "name";
		String templateGuid = "templateGuid";
		String envelopeGuid = "envelopeGuid";
		SignatureTemplateSettingsInfo body = getSampleRequest("signature/payload/CreateSignatureTemplate.json", new TypeReference<SignatureTemplateSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/template".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("templateId", templateGuid);
		mockRequest = mockRequest.withParam("envelopeId", envelopeGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CreateSignatureTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateResponse response = api.CreateSignatureTemplate(userId, name, templateGuid, envelopeGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		SignatureTemplateSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureTemplate.json", new TypeReference<SignatureTemplateSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateResponse response = api.ModifySignatureTemplate(userId, templateGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRenameSignatureTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String name = "name";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RenameSignatureTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateResponse response = api.RenameSignatureTemplate(userId, templateGuid, name);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureTemplate(userId, templateGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureTemplateRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String nickname = "nickname";
		String roleGuid = "roleGuid";
		Integer order = 0;
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipient".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("nickname", nickname);
		mockRequest = mockRequest.withParam("role", roleGuid);
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureTemplateRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateRecipientResponse response = api.AddSignatureTemplateRecipient(userId, templateGuid, nickname, roleGuid, order);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureTemplateRecipients() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipients".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureTemplateRecipients.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateRecipientsResponse response = api.GetSignatureTemplateRecipients(userId, templateGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureTemplateRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipients/{recipientGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureTemplateRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureTemplateRecipient(userId, templateGuid, recipientGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureTemplateRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String recipientGuid = "recipientGuid";
		String nickname = "nickname";
		String roleGuid = "roleGuid";
		String order = "order";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/recipient/{recipientGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("nickname", nickname);
		mockRequest = mockRequest.withParam("role", roleGuid);
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureTemplateRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateRecipientResponse response = api.ModifySignatureTemplateRecipient(userId, templateGuid, recipientGuid, nickname, roleGuid, order);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureTemplateDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		Integer order = 0;
		Boolean parseFields = Boolean.TRUE;
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("parseFields", parseFields);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureTemplateDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateDocumentResponse response = api.AddSignatureTemplateDocument(userId, templateGuid, documentGuid, order, parseFields);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureTemplateDocuments() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureTemplateDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateDocumentsResponse response = api.GetSignatureTemplateDocuments(userId, templateGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureTemplateDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureTemplateDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureTemplateDocument(userId, templateGuid, documentGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureTemplateField() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		SignatureTemplateFieldSettingsInfo body = getSampleRequest("signature/payload/AddSignatureTemplateField.json", new TypeReference<SignatureTemplateFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureTemplateField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateFieldResponse response = api.AddSignatureTemplateField(userId, templateGuid, documentGuid, recipientGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAssignSignatureTemplateField() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		SignatureTemplateAssignFieldSettingsInfo body = getSampleRequest("signature/payload/AssignSignatureTemplateField.json", new TypeReference<SignatureTemplateAssignFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AssignSignatureTemplateField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateFieldResponse response = api.AssignSignatureTemplateField(userId, templateGuid, documentGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureTemplateField() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		SignatureTemplateFieldSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureTemplateField.json", new TypeReference<SignatureTemplateFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/recipientGuid/{recipientGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureTemplateField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateFieldResponse response = api.ModifySignatureTemplateField(userId, templateGuid, documentGuid, recipientGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureTemplateFieldLocation() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureTemplateFieldLocation.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureTemplateFieldLocation(userId, templateGuid, fieldGuid, locationGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureTemplateFieldLocation() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		SignatureTemplateFieldLocationSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureTemplateFieldLocation.json", new TypeReference<SignatureTemplateFieldLocationSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/documents/{documentGuid}/recipient/{recipientGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureTemplateFieldLocation.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateFieldResponse response = api.ModifySignatureTemplateFieldLocation(userId, templateGuid, documentGuid, recipientGuid, fieldGuid, locationGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureTemplateFields() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/fields".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("document", documentGuid);
		mockRequest = mockRequest.withParam("recipient", recipientGuid);
		mockRequest = mockRequest.withParam("field", fieldGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureTemplateFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateFieldsResponse response = api.GetSignatureTemplateFields(userId, templateGuid, documentGuid, recipientGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureTemplateField() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/fields/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureTemplateField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateResponse response = api.DeleteSignatureTemplateField(userId, templateGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureTemplateResources() throws Exception {
		// sample parameters
		String userId = "userId";
		
		String resourcePath = "/signature/{userId}/templates/resources".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureTemplateResources.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateResourcesResponse response = api.GetSignatureTemplateResources(userId);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRenameSignatureTemplateDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String templateGuid = "templateGuid";
		String documentGuid = "documentGuid";
		String newName = "newName";
		
		String resourcePath = "/signature/{userId}/templates/{templateGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("newName", newName);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RenameSignatureTemplateDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplateDocumentResponse response = api.RenameSignatureTemplateDocument(userId, templateGuid, documentGuid, newName);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetContacts() throws Exception {
		// sample parameters
		String userId = "userId";
		Integer page = 0;
		Integer records = 0;
		String firstName = "firstName";
		String lastName = "lastName";
		String email = "email";
		Boolean useAnd = Boolean.TRUE;
		
		String resourcePath = "/signature/{userId}/contacts".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("page", page);
		mockRequest = mockRequest.withParam("records", records);
		mockRequest = mockRequest.withParam("firstName", firstName);
		mockRequest = mockRequest.withParam("lastName", lastName);
		mockRequest = mockRequest.withParam("email", email);
		mockRequest = mockRequest.withParam("useAnd", useAnd);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetContacts.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureContactsResponse response = api.GetContacts(userId, page, records, firstName, lastName, email, useAnd);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddContact() throws Exception {
		// sample parameters
		String userId = "userId";
		SignatureContactSettingsInfo body = getSampleRequest("signature/payload/AddContact.json", new TypeReference<SignatureContactSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/contact".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddContact.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureContactResponse response = api.AddContact(userId, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifyContact() throws Exception {
		// sample parameters
		String userId = "userId";
		String contactGuid = "contactGuid";
		SignatureContactSettingsInfo body = getSampleRequest("signature/payload/ModifyContact.json", new TypeReference<SignatureContactSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/contacts/{contactGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "contactGuid" + "}", String.valueOf(contactGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifyContact.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureContactResponse response = api.ModifyContact(userId, contactGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteContact() throws Exception {
		// sample parameters
		String userId = "userId";
		String contactGuid = "contactGuid";
		
		String resourcePath = "/signature/{userId}/contacts/{contactGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "contactGuid" + "}", String.valueOf(contactGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteContact.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureContactResponse response = api.DeleteContact(userId, contactGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testImportContacts() throws Exception {
		// sample parameters
		String userId = "userId";
		List<SignatureContactSettingsInfo> body = getSampleRequest("signature/payload/ImportContacts.json", new TypeReference<List<SignatureContactSettingsInfo>>(){});
		
		String resourcePath = "/signature/{userId}/contacts".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ImportContacts.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureContactsImportResponse response = api.ImportContacts(userId, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddContactIntegration() throws Exception {
		// sample parameters
		String userId = "userId";
		SignatureContactIntegrationSettings body = getSampleRequest("signature/payload/AddContactIntegration.json", new TypeReference<SignatureContactIntegrationSettings>(){});
		
		String resourcePath = "/signature/{userId}/integration".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddContactIntegration.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.AddContactIntegration(userId, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testSignDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		SignatureSignDocumentSettingsInfo body = getSampleRequest("signature/payload/SignDocument.json", new TypeReference<SignatureSignDocumentSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/sign".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/SignDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureSignDocumentResponse response = api.SignDocument(userId, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignDocumentStatus() throws Exception {
		// sample parameters
		String userId = "userId";
		String jobGuid = "jobGuid";
		
		String resourcePath = "/signature/{userId}/documents/{jobGuid}/status".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "jobGuid" + "}", String.valueOf(jobGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignDocumentStatus.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureSignDocumentStatusResponse response = api.GetSignDocumentStatus(userId, jobGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testArchiveSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/archive".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ArchiveSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.ArchiveSignatureEnvelope(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetEnvelopeAuditLogs() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/logs".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetEnvelopeAuditLogs.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeAuditLogsResponse response = api.GetEnvelopeAuditLogs(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCreateSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String name = "name";
		String templateGuid = "templateGuid";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		Boolean parseFields = Boolean.TRUE;
		SignatureEnvelopeSettingsInfo body = getSampleRequest("signature/payload/CreateSignatureEnvelope.json", new TypeReference<SignatureEnvelopeSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelope".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("templateId", templateGuid);
		mockRequest = mockRequest.withParam("envelopeId", envelopeGuid);
		mockRequest = mockRequest.withParam("documentId", documentGuid);
		mockRequest = mockRequest.withParam("parseFields", parseFields);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CreateSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResponse response = api.CreateSignatureEnvelope(userId, name, templateGuid, envelopeGuid, documentGuid, parseFields, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeclineEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}/decline".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeclineEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeclineEnvelope(userId, envelopeGuid, recipientGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDelegateEnvelopeRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		String recipientEmail = "recipientEmail";
		String recipientFirstName = "recipientFirstName";
		String recipientLastName = "recipientLastName";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}/delegate".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("email", recipientEmail);
		mockRequest = mockRequest.withParam("firstname", recipientFirstName);
		mockRequest = mockRequest.withParam("lastname", recipientLastName);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DelegateEnvelopeRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DelegateEnvelopeRecipient(userId, envelopeGuid, recipientGuid, recipientEmail, recipientFirstName, recipientLastName);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureEnvelope(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureEnvelopeDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		Integer order = 0;
		Boolean parseFields = Boolean.TRUE;
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("parseFields", parseFields);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureEnvelopeDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeDocumentResponse response = api.AddSignatureEnvelopeDocument(userId, envelopeGuid, documentGuid, order, parseFields);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignedEnvelopeDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignedEnvelopeDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.GetSignedEnvelopeDocument(userId, envelopeGuid, documentGuid);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureEnvelopeDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureEnvelopeDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureEnvelopeDocument(userId, envelopeGuid, documentGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelopeDocuments() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelopeDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeDocumentsResponse response = api.GetSignatureEnvelopeDocuments(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignedEnvelopeDocuments() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/get".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignedEnvelopeDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.GetSignedEnvelopeDocuments(userId, envelopeGuid);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureEnvelopeField() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		SignatureEnvelopeFieldSettingsInfo body = getSampleRequest("signature/payload/AddSignatureEnvelopeField.json", new TypeReference<SignatureEnvelopeFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureEnvelopeField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldsResponse response = api.AddSignatureEnvelopeField(userId, envelopeGuid, documentGuid, recipientGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAssignSignatureEnvelopeField() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		SignatureEnvelopeAssignFieldSettingsInfo body = getSampleRequest("signature/payload/AssignSignatureEnvelopeField.json", new TypeReference<SignatureEnvelopeAssignFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AssignSignatureEnvelopeField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldResponse response = api.AssignSignatureEnvelopeField(userId, envelopeGuid, documentGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testFillEnvelopeField() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		String signatureGuid = "signatureGuid";
		FileStream body = new FileStream(getClass().getClassLoader().getResourceAsStream("test.doc"));
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", Pattern.compile(".*"));
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signatureId", signatureGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/FillEnvelopeField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldResponse response = api.FillEnvelopeField(userId, envelopeGuid, documentGuid, recipientGuid, fieldGuid, signatureGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureEnvelopeFieldLocation() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		SignatureEnvelopeFieldLocationSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureEnvelopeFieldLocation.json", new TypeReference<SignatureEnvelopeFieldLocationSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureEnvelopeFieldLocation.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldResponse response = api.ModifySignatureEnvelopeFieldLocation(userId, envelopeGuid, documentGuid, recipientGuid, fieldGuid, locationGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureEnvelopeFieldLocation() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureEnvelopeFieldLocation.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureEnvelopeFieldLocation(userId, envelopeGuid, fieldGuid, locationGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureEnvelopeField() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		SignatureEnvelopeFieldSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureEnvelopeField.json", new TypeReference<SignatureEnvelopeFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipientGuid/{recipientGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureEnvelopeField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldResponse response = api.ModifySignatureEnvelopeField(userId, envelopeGuid, documentGuid, recipientGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureEnvelopeField() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/fields/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureEnvelopeField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureEnvelopeField(userId, envelopeGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelopeFields() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/fields".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("document", documentGuid);
		mockRequest = mockRequest.withParam("recipient", recipientGuid);
		mockRequest = mockRequest.withParam("field", fieldGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelopeFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldsResponse response = api.GetSignatureEnvelopeFields(userId, envelopeGuid, documentGuid, recipientGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResponse response = api.GetSignatureEnvelope(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		SignatureEnvelopeSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureEnvelope.json", new TypeReference<SignatureEnvelopeSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResponse response = api.ModifySignatureEnvelope(userId, envelopeGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureEnvelopeRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String recipientEmail = "recipientEmail";
		String recipientFirstName = "recipientFirstName";
		String recipientLastName = "recipientLastName";
		String roleGuid = "roleGuid";
		Integer order = 0;
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("email", recipientEmail);
		mockRequest = mockRequest.withParam("firstname", recipientFirstName);
		mockRequest = mockRequest.withParam("lastname", recipientLastName);
		mockRequest = mockRequest.withParam("role", roleGuid);
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureEnvelopeRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeRecipientResponse response = api.AddSignatureEnvelopeRecipient(userId, envelopeGuid, recipientEmail, recipientFirstName, recipientLastName, roleGuid, order);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureEnvelopeRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		String recipientEmail = "recipientEmail";
		String recipientFirstName = "recipientFirstName";
		String recipientLastName = "recipientLastName";
		String roleGuid = "roleGuid";
		Integer order = 0;
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("email", recipientEmail);
		mockRequest = mockRequest.withParam("firstname", recipientFirstName);
		mockRequest = mockRequest.withParam("lastname", recipientLastName);
		mockRequest = mockRequest.withParam("role", roleGuid);
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureEnvelopeRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeRecipientResponse response = api.ModifySignatureEnvelopeRecipient(userId, envelopeGuid, recipientGuid, recipientEmail, recipientFirstName, recipientLastName, roleGuid, order);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureEnvelopeRecipient() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipients/{recipientGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureEnvelopeRecipient.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureEnvelopeRecipient(userId, envelopeGuid, recipientGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelopeRecipients() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipients".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelopeRecipients.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeRecipientsResponse response = api.GetSignatureEnvelopeRecipients(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRenameSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String name = "name";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RenameSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResponse response = api.RenameSignatureEnvelope(userId, envelopeGuid, name);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRestartExpiredSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/restart".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RestartExpiredSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.RestartExpiredSignatureEnvelope(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testSignatureEnvelopeSend() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		WebhookInfo body = getSampleRequest("signature/payload/SignatureEnvelopeSend.json", new TypeReference<WebhookInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/send".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/SignatureEnvelopeSend.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeSendResponse response = api.SignatureEnvelopeSend(userId, envelopeGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testSignEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		SignatureSignEnvelopeSettingsInfo body = getSampleRequest("signature/payload/SignEnvelope.json", new TypeReference<SignatureSignEnvelopeSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/recipient/{recipientGuid}/sign".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/SignEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.SignEnvelope(userId, envelopeGuid, recipientGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelopes() throws Exception {
		// sample parameters
		String userId = "userId";
		Integer statusId = 0;
		Integer page = 0;
		Integer records = 0;
		String originalDocumentMD5 = "originalDocumentMD5";
		String recipientEmail = "recipientEmail";
		String date = "date";
		String name = "name";
		String tag = "tag";
		
		String resourcePath = "/signature/{userId}/envelopes".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("statusId", statusId);
		mockRequest = mockRequest.withParam("page", page);
		mockRequest = mockRequest.withParam("records", records);
		mockRequest = mockRequest.withParam("document", originalDocumentMD5);
		mockRequest = mockRequest.withParam("recipient", recipientEmail);
		mockRequest = mockRequest.withParam("date", date);
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("tag", tag);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelopes.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopesResponse response = api.GetSignatureEnvelopes(userId, statusId, page, records, originalDocumentMD5, recipientEmail, date, name, tag);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelopeResources() throws Exception {
		// sample parameters
		String userId = "userId";
		String statusIds = "statusIds";
		
		String resourcePath = "/signature/{userId}/envelopes/resources".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("statusIds", statusIds);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelopeResources.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResourcesResponse response = api.GetSignatureEnvelopeResources(userId, statusIds);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetRecipientSignatureEnvelopes() throws Exception {
		// sample parameters
		String userId = "userId";
		String statusId = "statusId";
		Integer page = 0;
		Integer records = 0;
		
		String resourcePath = "/signature/{userId}/envelopes/recipient".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("statusId", statusId);
		mockRequest = mockRequest.withParam("page", page);
		mockRequest = mockRequest.withParam("records", records);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetRecipientSignatureEnvelopes.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopesResponse response = api.GetRecipientSignatureEnvelopes(userId, statusId, page, records);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRenameSignatureEnvelopeDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String newName = "newName";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("newName", newName);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RenameSignatureEnvelopeDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeDocumentResponse response = api.RenameSignatureEnvelopeDocument(userId, envelopeGuid, documentGuid, newName);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCancelSignatureEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/cancel".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CancelSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.CancelSignatureEnvelope(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRetrySignEnvelope() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/retry".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RetrySignEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.RetrySignEnvelope(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testUpdateEnvelopeFromTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String templateGuid = "templateGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/templates/{templateGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/UpdateEnvelopeFromTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResponse response = api.UpdateEnvelopeFromTemplate(userId, envelopeGuid, templateGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureEnvelopeFieldLocationOrder() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		Integer order = 0;
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureEnvelopeFieldLocationOrder.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldResponse response = api.ModifySignatureEnvelopeFieldLocationOrder(userId, envelopeGuid, documentGuid, recipientGuid, fieldGuid, locationGuid, order);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testResendSignatureEnvelopeEmailNotification() throws Exception {
		// sample parameters
		String userId = "userId";
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/{userId}/envelopes/{envelopeGuid}/resend-notification".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ResendSignatureEnvelopeEmailNotification.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.ResendSignatureEnvelopeEmailNotification(userId, envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetFieldsList() throws Exception {
		// sample parameters
		String userId = "userId";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/fields".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("id", fieldGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetFieldsList.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFieldsResponse response = api.GetFieldsList(userId, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCreateSignatureField() throws Exception {
		// sample parameters
		String userId = "userId";
		SignatureFieldSettingsInfo body = getSampleRequest("signature/payload/CreateSignatureField.json", new TypeReference<SignatureFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/field".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CreateSignatureField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFieldResponse response = api.CreateSignatureField(userId, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureField() throws Exception {
		// sample parameters
		String userId = "userId";
		String fieldGuid = "fieldGuid";
		SignatureFieldSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureField.json", new TypeReference<SignatureFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/fields/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFieldResponse response = api.ModifySignatureField(userId, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureField() throws Exception {
		// sample parameters
		String userId = "userId";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/fields/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureField(userId, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testArchiveSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/archive".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ArchiveSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.ArchiveSignatureForm(userId, formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCompleteSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/complete".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CompleteSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.CompleteSignatureForm(userId, formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCreateSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String name = "name";
		String templateGuid = "templateGuid";
		String assemblyGuid = "assemblyGuid";
		String formGuid = "formGuid";
		SignatureFormSettingsInfo body = getSampleRequest("signature/payload/CreateSignatureForm.json", new TypeReference<SignatureFormSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/form".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("templateId", templateGuid);
		mockRequest = mockRequest.withParam("assemblyId", assemblyGuid);
		mockRequest = mockRequest.withParam("formId", formGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CreateSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResponse response = api.CreateSignatureForm(userId, name, templateGuid, assemblyGuid, formGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureForm(userId, formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureFormDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		Integer order = 0;
		Boolean parseFields = Boolean.TRUE;
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("order", order);
		mockRequest = mockRequest.withParam("parseFields", parseFields);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureFormDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormDocumentResponse response = api.AddSignatureFormDocument(userId, formGuid, documentGuid, order, parseFields);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureFormDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureFormDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureFormDocument(userId, formGuid, documentGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureFormDocuments() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureFormDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormDocumentsResponse response = api.GetSignatureFormDocuments(userId, formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddSignatureFormField() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		SignatureFormFieldSettingsInfo body = getSampleRequest("signature/payload/AddSignatureFormField.json", new TypeReference<SignatureFormFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddSignatureFormField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldResponse response = api.AddSignatureFormField(userId, formGuid, documentGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureFormFieldLocation() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		SignatureFormFieldLocationSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureFormFieldLocation.json", new TypeReference<SignatureFormFieldLocationSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureFormFieldLocation.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldResponse response = api.ModifySignatureFormFieldLocation(userId, formGuid, documentGuid, fieldGuid, locationGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureFormFieldLocation() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String fieldGuid = "fieldGuid";
		String locationGuid = "locationGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/fields/{fieldGuid}/locations/{locationGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "locationGuid" + "}", String.valueOf(locationGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureFormFieldLocation.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureFormFieldLocation(userId, formGuid, fieldGuid, locationGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureFormField() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		SignatureFormFieldSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureFormField.json", new TypeReference<SignatureFormFieldSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/field/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureFormField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldResponse response = api.ModifySignatureFormField(userId, formGuid, documentGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignatureFormField() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/fields/{fieldGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignatureFormField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignatureFormField(userId, formGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureFormFields() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/fields".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("field", fieldGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureFormFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldsResponse response = api.GetSignatureFormFields(userId, formGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureFormDocumentFields() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/{documentGuid}/fields".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("field", fieldGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureFormDocumentFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldsResponse response = api.GetSignatureFormDocumentFields(userId, formGuid, documentGuid, fieldGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResponse response = api.GetSignatureForm(userId, formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		SignatureFormSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureForm.json", new TypeReference<SignatureFormSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResponse response = api.ModifySignatureForm(userId, formGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublishSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		WebhookInfo body = getSampleRequest("signature/payload/PublishSignatureForm.json", new TypeReference<WebhookInfo>(){});
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/publish".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublishSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.PublishSignatureForm(userId, formGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRenameSignatureForm() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String name = "name";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("new_name", name);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RenameSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResponse response = api.RenameSignatureForm(userId, formGuid, name);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testUpdateSignatureFormFromTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String templateGuid = "templateGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/templates/{templateGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "templateGuid" + "}", String.valueOf(templateGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/UpdateSignatureFormFromTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResponse response = api.UpdateSignatureFormFromTemplate(userId, formGuid, templateGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureForms() throws Exception {
		// sample parameters
		String userId = "userId";
		Integer statusId = 0;
		Integer page = 0;
		Integer records = 0;
		String originalDocumentMD5 = "originalDocumentMD5";
		String date = "date";
		String name = "name";
		String tag = "tag";
		
		String resourcePath = "/signature/{userId}/forms".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("statusId", statusId);
		mockRequest = mockRequest.withParam("page", page);
		mockRequest = mockRequest.withParam("records", records);
		mockRequest = mockRequest.withParam("document", originalDocumentMD5);
		mockRequest = mockRequest.withParam("date", date);
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("tag", tag);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureForms.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormsResponse response = api.GetSignatureForms(userId, statusId, page, records, originalDocumentMD5, date, name, tag);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureFormResources() throws Exception {
		// sample parameters
		String userId = "userId";
		String statusIds = "statusIds";
		
		String resourcePath = "/signature/{userId}/forms/resources".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("statusIds", statusIds);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureFormResources.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResourcesResponse response = api.GetSignatureFormResources(userId, statusIds);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignedFormDocuments() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/documents/get".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignedFormDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.GetSignedFormDocuments(userId, formGuid);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testRenameSignatureFormDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String newName = "newName";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("newName", newName);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/RenameSignatureFormDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormDocumentResponse response = api.RenameSignatureFormDocument(userId, formGuid, documentGuid, newName);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testModifySignatureFormDocument() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		SignatureFormDocumentSettingsInfo body = getSampleRequest("signature/payload/ModifySignatureFormDocument.json", new TypeReference<SignatureFormDocumentSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/document/{documentGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/ModifySignatureFormDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormDocumentResponse response = api.ModifySignatureFormDocument(userId, formGuid, documentGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetFormAuditLogs() throws Exception {
		// sample parameters
		String userId = "userId";
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/{userId}/forms/{formGuid}/logs".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetFormAuditLogs.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormAuditLogsResponse response = api.GetFormAuditLogs(userId, formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignaturePredefinedLists() throws Exception {
		// sample parameters
		String userId = "userId";
		
		String resourcePath = "/signature/{userId}/lists".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignaturePredefinedLists.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignaturePredefinedListsResponse response = api.GetSignaturePredefinedLists(userId);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testAddPredefinedList() throws Exception {
		// sample parameters
		String userId = "userId";
		SignaturePredefinedListSettingsInfo body = getSampleRequest("signature/payload/AddPredefinedList.json", new TypeReference<SignaturePredefinedListSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/list".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/AddPredefinedList.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignaturePredefinedListResponse response = api.AddPredefinedList(userId, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeletePredefinedList() throws Exception {
		// sample parameters
		String userId = "userId";
		String listGuid = "listGuid";
		
		String resourcePath = "/signature/{userId}/lists/{listGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "listGuid" + "}", String.valueOf(listGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeletePredefinedList.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignaturePredefinedListsResponse response = api.DeletePredefinedList(userId, listGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetRolesList() throws Exception {
		// sample parameters
		String userId = "userId";
		String roleGuid = "roleGuid";
		
		String resourcePath = "/signature/{userId}/roles".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("id", roleGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetRolesList.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureRolesResponse response = api.GetRolesList(userId, roleGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetUserEmailTemplate() throws Exception {
		// sample parameters
		String userId = "userId";
		Integer templateType = 0;
		
		String resourcePath = "/signature/{userId}/email-template/{templateType}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "templateType" + "}", String.valueOf(templateType));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetUserEmailTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.GetUserEmailTemplate(userId, templateType);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testCreateSignature() throws Exception {
		// sample parameters
		String userId = "userId";
		String name = "name";
		SignatureSignatureSettingsInfo body = getSampleRequest("signature/payload/CreateSignature.json", new TypeReference<SignatureSignatureSettingsInfo>(){});
		
		String resourcePath = "/signature/{userId}/signature".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/CreateSignature.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureSignatureResponse response = api.CreateSignature(userId, name, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testDeleteSignature() throws Exception {
		// sample parameters
		String userId = "userId";
		String signatureGuid = "signatureGuid";
		
		String resourcePath = "/signature/{userId}/signatures/{signatureGuid}".replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "signatureGuid" + "}", String.valueOf(signatureGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.DELETE).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/DeleteSignature.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.DeleteSignature(userId, signatureGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatures() throws Exception {
		// sample parameters
		String userId = "userId";
		Integer page = 0;
		Integer records = 0;
		String name = "name";
		
		String resourcePath = "/signature/{userId}/signatures".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("page", page);
		mockRequest = mockRequest.withParam("records", records);
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatures.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureSignaturesResponse response = api.GetSignatures(userId, page, records, name);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureTemplates() throws Exception {
		// sample parameters
		String userId = "userId";
		Integer page = 0;
		Integer records = 0;
		String documentGuid = "documentGuid";
		String recipientName = "recipientName";
		String name = "name";
		String tag = "tag";
		
		String resourcePath = "/signature/{userId}/templates".replace("{" + "userId" + "}", String.valueOf(userId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("page", page);
		mockRequest = mockRequest.withParam("records", records);
		mockRequest = mockRequest.withParam("documentGuid", documentGuid);
		mockRequest = mockRequest.withParam("recipientName", recipientName);
		mockRequest = mockRequest.withParam("name", name);
		mockRequest = mockRequest.withParam("tag", tag);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureTemplates.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureTemplatesResponse response = api.GetSignatureTemplates(userId, page, records, documentGuid, recipientName, name, tag);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicFillEnvelopeField() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		FileStream body = new FileStream(getClass().getClassLoader().getResourceAsStream("test.doc"));
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/documents/{documentGuid}/recipient/{recipientGuid}/field/{fieldGuid}".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", Pattern.compile(".*"));
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicFillEnvelopeField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldResponse response = api.PublicFillEnvelopeField(envelopeGuid, documentGuid, recipientGuid, fieldGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicSignEnvelope() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		SignatureSignEnvelopeSettingsInfo body = getSampleRequest("signature/payload/PublicSignEnvelope.json", new TypeReference<SignatureSignEnvelopeSettingsInfo>(){});
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}/sign".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicSignEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.PublicSignEnvelope(envelopeGuid, recipientGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetEnvelopeDocuments() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}/documents".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetEnvelopeDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeDocumentsResponse response = api.PublicGetEnvelopeDocuments(envelopeGuid, recipientGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetEnvelopeRecipients() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipients".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetEnvelopeRecipients.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeRecipientsResponse response = api.PublicGetEnvelopeRecipients(envelopeGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignatureEnvelopeFields() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String documentGuid = "documentGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/fields".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("document", documentGuid);
		mockRequest = mockRequest.withParam("recipient", recipientGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignatureEnvelopeFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeFieldsResponse response = api.PublicGetSignatureEnvelopeFields(envelopeGuid, documentGuid, recipientGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignatureEnvelope() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignatureEnvelope.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureEnvelopeResponse response = api.PublicGetSignatureEnvelope(envelopeGuid, recipientGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignedEnvelopeDocuments() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/recipient/{recipientGuid}/documents/get".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignedEnvelopeDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.PublicGetSignedEnvelopeDocuments(envelopeGuid, recipientGuid);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicFillSignatureForm() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}/fill".replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicFillSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormParticipantResponse response = api.PublicFillSignatureForm(formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicFillFormField() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String fieldGuid = "fieldGuid";
		String participantIdId = "participantIdId";
		String authSignature = "authSignature";
		FileStream body = new FileStream(getClass().getClassLoader().getResourceAsStream("test.doc"));
		
		String resourcePath = "/signature/public/forms/{formGuid}/documents/{documentGuid}/participant/{participantGuid}/field/{fieldGuid}".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "documentGuid" + "}", String.valueOf(documentGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid)).replace("{" + "participantIdId" + "}", String.valueOf(participantIdId));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", Pattern.compile(".*"));
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("participantAuthSignature", authSignature);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicFillFormField.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldResponse response = api.PublicFillFormField(formGuid, documentGuid, fieldGuid, authSignature, body, participantIdId);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicSignForm() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String participantGuid = "participantGuid";
		String participantName = "participantName";
		String authSignature = "authSignature";
		FileStream authData = new FileStream(getClass().getClassLoader().getResourceAsStream("test.doc"));
		SignatureSignFormSettingsInfo body = getSampleRequest("signature/payload/PublicSignForm.json", new TypeReference<SignatureSignFormSettingsInfo>(){});
		
		String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}/sign".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("name", participantName);
		mockRequest = mockRequest.withParam("participantAuthSignature", authSignature);
		mockRequest = mockRequest.withParam("authData", authData);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicSignForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.PublicSignForm(formGuid, participantGuid, participantName, authSignature, authData, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignatureForm() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}".replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignatureForm.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormResponse response = api.PublicGetSignatureForm(formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignatureFormDocuments() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}/documents".replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignatureFormDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormDocumentsResponse response = api.PublicGetSignatureFormDocuments(formGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignatureFormFields() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String documentGuid = "documentGuid";
		String participantGuid = "participantGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}/fields".replace("{" + "formGuid" + "}", String.valueOf(formGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("document", documentGuid);
		mockRequest = mockRequest.withParam("participant", participantGuid);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignatureFormFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormFieldsResponse response = api.PublicGetSignatureFormFields(formGuid, documentGuid, participantGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignedFormDocuments() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String participantGuid = "participantGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}/documents/get".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignedFormDocuments.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.PublicGetSignedFormDocuments(formGuid, participantGuid);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureFormParticipant() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String participantGuid = "participantGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}/participants/{participantGuid}".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureFormParticipant.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormParticipantResponse response = api.GetSignatureFormParticipant(formGuid, participantGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicSignDocument() throws Exception {
		// sample parameters
		String documentGuid = "documentGuid";
		PublicSignatureSignDocumentSignerSettingsInfo body = getSampleRequest("signature/payload/PublicSignDocument.json", new TypeReference<PublicSignatureSignDocumentSignerSettingsInfo>(){});
		
		String resourcePath = "/signature/public/documents/{documentGuid}/sign".replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", MediaType.APPLICATION_JSON);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicSignDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureSignDocumentResponse response = api.PublicSignDocument(documentGuid, body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicVerifyDocument() throws Exception {
		// sample parameters
		FileStream body = new FileStream(getClass().getClassLoader().getResourceAsStream("test.doc"));
		
		String resourcePath = "/signature/public/verify";
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.POST).withHeader("Content-Type", Pattern.compile(".*"));
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicVerifyDocument.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureVerifyDocumentResponse response = api.PublicVerifyDocument(body);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetSignDocumentStatus() throws Exception {
		// sample parameters
		String jobGuid = "jobGuid";
		
		String resourcePath = "/signature/public/documents/{jobGuid}/status".replace("{" + "jobGuid" + "}", String.valueOf(jobGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetSignDocumentStatus.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureSignDocumentStatusResponse response = api.PublicGetSignDocumentStatus(jobGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetDocumentFields() throws Exception {
		// sample parameters
		String documentGuid = "documentGuid";
		
		String resourcePath = "/signature/public/documents/{documentGuid}/fields".replace("{" + "documentGuid" + "}", String.valueOf(documentGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetDocumentFields.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureDocumentFieldsResponse response = api.PublicGetDocumentFields(documentGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicModifyFormParticipant() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String participantGuid = "participantGuid";
		String participantEmail = "participantEmail";
		
		String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.PUT).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("email", participantEmail);
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicModifyFormParticipant.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureFormParticipantResponse response = api.PublicModifyFormParticipant(formGuid, participantGuid, participantEmail);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicValidateFormParticipant() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String participantGuid = "participantGuid";
		String validationCode = "validationCode";
		
		String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}/validationCode/{validationCode}".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid)).replace("{" + "validationCode" + "}", String.valueOf(validationCode));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicValidateFormParticipant.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.PublicValidateFormParticipant(formGuid, participantGuid, validationCode);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicFormParticipantResentValidationCode() throws Exception {
		// sample parameters
		String formGuid = "formGuid";
		String participantGuid = "participantGuid";
		
		String resourcePath = "/signature/public/forms/{formGuid}/participant/{participantGuid}/validationCode/resent".replace("{" + "formGuid" + "}", String.valueOf(formGuid)).replace("{" + "participantGuid" + "}", String.valueOf(participantGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicFormParticipantResentValidationCode.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			SignatureStatusResponse response = api.PublicFormParticipantResentValidationCode(formGuid, participantGuid);
			// this ensures that json was successfully deserialized into corresponding model object
			assertSameJson(responseBody, response);
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testGetSignatureEnvelopeFieldData() throws Exception {
		// sample parameters
		String envelopeGuid = "envelopeGuid";
		String recipientGuid = "recipientGuid";
		String fieldGuid = "fieldGuid";
		
		String resourcePath = "/signature/public/envelopes/{envelopeGuid}/fields/recipient/{recipientGuid}/field/{fieldGuid}".replace("{" + "envelopeGuid" + "}", String.valueOf(envelopeGuid)).replace("{" + "recipientGuid" + "}", String.valueOf(recipientGuid)).replace("{" + "fieldGuid" + "}", String.valueOf(fieldGuid));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/GetSignatureEnvelopeFieldData.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.GetSignatureEnvelopeFieldData(envelopeGuid, recipientGuid, fieldGuid);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	@Test
	public void testPublicGetDefaultEmailTemplate() throws Exception {
		// sample parameters
		Integer templateType = 0;
		
		String resourcePath = "/signature/public/email-template/{templateType}/default".replace("{" + "templateType" + "}", String.valueOf(templateType));
		
		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("signature", Pattern.compile(".*"));
		// read response json from file
		String responseBody = getSampleResponse("signature/PublicGetDefaultEmailTemplate.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		try {
			FileStream response = api.PublicGetDefaultEmailTemplate(templateType);
			assertThat(response.getInputStream(), not(nullValue()));
			
		} catch(ApiException e){
			log(e.getCode() + ": " + e.getMessage());
		}
	
	}
	
	
}

