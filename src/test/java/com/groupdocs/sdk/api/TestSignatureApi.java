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

import com.groupdocs.sdk.common.*;
import com.groupdocs.sdk.model.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import java.util.*;

@Category(IntegrationTest.class)
public class TestSignatureApi extends AbstractIntegrationTest {
  
	@Test
	public void testDeleteSignatureTemplateDocument() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String documentId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureTemplateDocument(userId, templateId, documentId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddSignatureTemplateField() throws ApiException {
	
  		SignatureTemplateFieldSettings body = null;
		String userId = "";
		String templateId = "";
		String documentId = "";
		String recipientId = "";
		String fieldId = "";
		SignatureTemplateFieldResponse response = new SignatureApi().AddSignatureTemplateField(body, userId, templateId, documentId, recipientId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureTemplateField() throws ApiException {
	
  		SignatureTemplateFieldSettings body = null;
		String userId = "";
		String templateId = "";
		String documentId = "";
		String fieldId = "";
		SignatureTemplateFieldResponse response = new SignatureApi().ModifySignatureTemplateField(body, userId, templateId, documentId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureTemplateFieldLocation() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String fieldId = "";
		String locationId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureTemplateFieldLocation(userId, templateId, fieldId, locationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureTemplateFieldLocation() throws ApiException {
	
  		SignatureTemplateFieldLocationSettings body = null;
		String userId = "";
		String templateId = "";
		String documentId = "";
		String recipientId = "";
		String fieldId = "";
		String locationId = "";
		SignatureTemplateFieldResponse response = new SignatureApi().ModifySignatureTemplateFieldLocation(body, userId, templateId, documentId, recipientId, fieldId, locationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureTemplateFields() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String documentId = "";
		String recipientId = "";
		SignatureTemplateFieldsResponse response = new SignatureApi().GetSignatureTemplateFields(userId, templateId, documentId, recipientId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureTemplateField() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String fieldId = "";
		SignatureTemplateResponse response = new SignatureApi().DeleteSignatureTemplateField(userId, templateId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatures() throws ApiException {
	
  		String userId = "";
		Integer page = 0;
		String name = "";
		Integer records = 0;
		SignatureSignaturesResponse response = new SignatureApi().GetSignatures(userId, page, name, records);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignature() throws ApiException {
	
  		String userId = "";
		String signatureId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignature(userId, signatureId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateSignature() throws ApiException {
	
  		SignatureSignatureSettings body = null;
		String userId = "";
		String name = "";
		SignatureSignatureResponse response = new SignatureApi().CreateSignature(body, userId, name);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testFillEnvelopeField() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String documentId = "";
		String recipientId = "";
		String fieldId = "";
		String body = "";
		SignatureEnvelopeFieldResponse response = new SignatureApi().FillEnvelopeField(userId, envelopeId, documentId, recipientId, fieldId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSignEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String recipientId = "";
		SignatureStatusResponse response = new SignatureApi().SignEnvelope(userId, envelopeId, recipientId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeclineEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String recipientId = "";
		SignatureStatusResponse response = new SignatureApi().DeclineEnvelope(userId, envelopeId, recipientId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDelegateEnvelopeRecipient() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String recipientId = "";
		String email = "";
		String firstname = "";
		String lastname = "";
		SignatureStatusResponse response = new SignatureApi().DelegateEnvelopeRecipient(userId, envelopeId, recipientId, email, firstname, lastname);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddContact() throws ApiException {
	
  		SignatureContactSettings body = null;
		String userId = "";
		SignatureContactResponse response = new SignatureApi().AddContact(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifyContact() throws ApiException {
	
  		SignatureContactSettings body = null;
		String userId = "";
		String contactId = "";
		SignatureContactResponse response = new SignatureApi().ModifyContact(body, userId, contactId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetContacts() throws ApiException {
	
  		String userId = "";
		String page = "";
		String firstName = "";
		String lastName = "";
		String email = "";
		String records = "";
		SignatureContactsResponse response = new SignatureApi().GetContacts(userId, page, firstName, lastName, email, records);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteContact() throws ApiException {
	
  		String userId = "";
		String contactId = "";
		SignatureContactResponse response = new SignatureApi().DeleteContact(userId, contactId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testImportContacts() throws ApiException {
	
  		String userId = "";
		String body = "";
		SignatureContactsImportResponse response = new SignatureApi().ImportContacts(userId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureEnvelopeResources() throws ApiException {
	
  		String userId = "";
		String statusIds = "";
		SignatureEnvelopeResourcesResponse response = new SignatureApi().GetSignatureEnvelopeResources(userId, statusIds);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddContactIntegration() throws ApiException {
	
  		String userId = "";
		String body = "";
		SignatureStatusResponse response = new SignatureApi().AddContactIntegration(userId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignaturePredefinedLists() throws ApiException {
	
  		String userId = "";
		SignaturePredefinedListsResponse response = new SignatureApi().GetSignaturePredefinedLists(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddPredefinedList() throws ApiException {
	
  		SignaturePredefinedListSettings body = null;
		String userId = "";
		SignaturePredefinedListResponse response = new SignatureApi().AddPredefinedList(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeletePredefinedList() throws ApiException {
	
  		String userId = "";
		String listId = "";
		SignaturePredefinedListResponse response = new SignatureApi().DeletePredefinedList(userId, listId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetEnvelopeAuditLogs() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureEnvelopeAuditLogsResponse response = new SignatureApi().GetEnvelopeAuditLogs(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateSignatureForm() throws ApiException {
	
  		SignatureEnvelopeSettings body = null;
		String userId = "";
		String name = "";
		Integer assemblyGuid = 0;
		String templateGuid = "";
		SignatureFormResponse response = new SignatureApi().CreateSignatureForm(body, userId, name, assemblyGuid, templateGuid);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureFormDocuments() throws ApiException {
	
  		String userId = "";
		String formId = "";
		SignatureFormDocumentsResponse response = new SignatureApi().GetSignatureFormDocuments(userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureFormFields() throws ApiException {
	
  		String userId = "";
		String formId = "";
		String documentId = "";
		String participantId = "";
		SignatureFormFieldsResponse response = new SignatureApi().GetSignatureFormFields(userId, formId, documentId, participantId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureForm() throws ApiException {
	
  		String userId = "";
		String formId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureForm(userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureForm() throws ApiException {
	
  		String userId = "";
		String formId = "";
		SignatureFormResponse response = new SignatureApi().GetSignatureForm(userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureForms() throws ApiException {
	
  		String userId = "";
		String statusId = "";
		Integer page = 0;
		String date = "";
		String name = "";
		Integer records = 0;
		String documentId = "";
		SignatureFormsResponse response = new SignatureApi().GetSignatureForms(userId, statusId, page, date, name, records, documentId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testRenameSignatureForm() throws ApiException {
	
  		String userId = "";
		String formId = "";
		String name = "";
		SignatureFormResponse response = new SignatureApi().RenameSignatureForm(userId, formId, name);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testPublishSignatureForm() throws ApiException {
	
  		String userId = "";
		String formId = "";
		SignatureStatusResponse response = new SignatureApi().PublishSignatureForm(userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCompleteSignatureForm() throws ApiException {
	
  		String userId = "";
		String formId = "";
		SignatureStatusResponse response = new SignatureApi().CompleteSignatureForm(userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureForm() throws ApiException {
	
  		SignatureFormSettings body = null;
		String userId = "";
		String formId = "";
		SignatureFormResponse response = new SignatureApi().ModifySignatureForm(body, userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testArchiveSignatureForm() throws ApiException {
	
  		String userId = "";
		String formId = "";
		SignatureStatusResponse response = new SignatureApi().ArchiveSignatureForm(userId, formId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureFormResources() throws ApiException {
	
  		String userId = "";
		String statusIds = "";
		SignatureFormResourcesResponse response = new SignatureApi().GetSignatureFormResources(userId, statusIds);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureTemplateResources() throws ApiException {
	
  		String userId = "";
		SignatureTemplateResourcesResponse response = new SignatureApi().GetSignatureTemplateResources(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSignDocument() throws ApiException {
	
  		SignatureSignDocumentSettings body = null;
		String userId = "";
		SignatureSignDocumentResponse response = new SignatureApi().SignDocument(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureEnvelopes() throws ApiException {
	
  		String userId = "";
		String statusId = "";
		Integer page = 0;
		String recipientEmail = "";
		String date = "";
		String name = "";
		Integer records = 0;
		String documentId = "";
		SignatureEnvelopesResponse response = new SignatureApi().GetSignatureEnvelopes(userId, statusId, page, recipientEmail, date, name, records, documentId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetRecipientSignatureEnvelopes() throws ApiException {
	
  		String userId = "";
		String statusId = "";
		Integer page = 0;
		Integer records = 0;
		SignatureEnvelopesResponse response = new SignatureApi().GetRecipientSignatureEnvelopes(userId, statusId, page, records);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureEnvelopeResponse response = new SignatureApi().GetSignatureEnvelope(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateSignatureEnvelope() throws ApiException {
	
  		SignatureEnvelopeSettings body = null;
		String userId = "";
		String name = "";
		Integer envelopeGuid = 0;
		String templateGuid = "";
		SignatureEnvelopeResponse response = new SignatureApi().CreateSignatureEnvelope(body, userId, name, envelopeGuid, templateGuid);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureEnvelope() throws ApiException {
	
  		SignatureEnvelopeSettings body = null;
		String userId = "";
		String envelopeId = "";
		SignatureEnvelopeResponse response = new SignatureApi().ModifySignatureEnvelope(body, userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testRenameSignatureEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String name = "";
		SignatureEnvelopeResponse response = new SignatureApi().RenameSignatureEnvelope(userId, envelopeId, name);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureEnvelope(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetRolesList() throws ApiException {
	
  		String userId = "";
		String id = "";
		SignatureRolesResponse response = new SignatureApi().GetRolesList(userId, id);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetFieldsList() throws ApiException {
	
  		String userId = "";
		String id = "";
		SignatureFieldsResponse response = new SignatureApi().GetFieldsList(userId, id);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateSignatureField() throws ApiException {
	
  		SignatureFieldSettings body = null;
		String userId = "";
		SignatureFieldResponse response = new SignatureApi().CreateSignatureField(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureField() throws ApiException {
	
  		SignatureFieldSettings body = null;
		String userId = "";
		String fieldId = "";
		SignatureFieldResponse response = new SignatureApi().ModifySignatureField(body, userId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureField() throws ApiException {
	
  		String userId = "";
		String fieldId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureField(userId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddSignatureEnvelopeRecipient() throws ApiException {
	
  		String userId = "";
		Integer order = 0;
		String lastname = "";
		String email = "";
		String envelopeid = "";
		String firstname = "";
		String role = "";
		SignatureEnvelopeRecipientResponse response = new SignatureApi().AddSignatureEnvelopeRecipient(userId, order, lastname, email, envelopeid, firstname, role);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureEnvelopeRecipients() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureEnvelopeRecipientsResponse response = new SignatureApi().GetSignatureEnvelopeRecipients(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureEnvelopeRecipient() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String recipientId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureEnvelopeRecipient(userId, envelopeId, recipientId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureEnvelopeRecipient() throws ApiException {
	
  		String userId = "";
		Integer order = 0;
		String envelopeid = "";
		String email = "";
		String firstname = "";
		String lastname = "";
		String role = "";
		SignatureEnvelopeRecipientResponse response = new SignatureApi().ModifySignatureEnvelopeRecipient(userId, order, envelopeid, email, firstname, lastname, role);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddSignatureEnvelopeDocument() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String documentId = "";
		Integer order = 0;
		SignatureEnvelopeDocumentResponse response = new SignatureApi().AddSignatureEnvelopeDocument(userId, envelopeId, documentId, order);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureEnvelopeDocuments() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureEnvelopeDocumentsResponse response = new SignatureApi().GetSignatureEnvelopeDocuments(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignedEnvelopeDocument() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String documentId = "";
		String response = new SignatureApi().GetSignedEnvelopeDocument(userId, envelopeId, documentId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignedEnvelopeDocuments() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String response = new SignatureApi().GetSignedEnvelopeDocuments(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureEnvelopeDocument() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String documentId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureEnvelopeDocument(userId, envelopeId, documentId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddSignatureEnvelopeField() throws ApiException {
	
  		SignatureEnvelopeFieldSettings body = null;
		String userId = "";
		String envelopeId = "";
		String documentId = "";
		String recipientId = "";
		String fieldId = "";
		SignatureEnvelopeFieldsResponse response = new SignatureApi().AddSignatureEnvelopeField(body, userId, envelopeId, documentId, recipientId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureEnvelopeFields() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String documentId = "";
		String recipientId = "";
		SignatureEnvelopeFieldsResponse response = new SignatureApi().GetSignatureEnvelopeFields(userId, envelopeId, documentId, recipientId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureEnvelopeField() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String fieldId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureEnvelopeField(userId, envelopeId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureEnvelopeField() throws ApiException {
	
  		SignatureEnvelopeFieldSettings body = null;
		String userId = "";
		String envelopeId = "";
		String documentId = "";
		String fieldId = "";
		SignatureEnvelopeFieldResponse response = new SignatureApi().ModifySignatureEnvelopeField(body, userId, envelopeId, documentId, fieldId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testArchiveSignatureEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureStatusResponse response = new SignatureApi().ArchiveSignatureEnvelope(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testRestartExpiredSignatureEnvelope() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureStatusResponse response = new SignatureApi().RestartExpiredSignatureEnvelope(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSignatureEnvelopeSend() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		SignatureStatusResponse response = new SignatureApi().SignatureEnvelopeSend(userId, envelopeId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureEnvelopeFieldLocation() throws ApiException {
	
  		String userId = "";
		String envelopeId = "";
		String fieldId = "";
		String locationId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureEnvelopeFieldLocation(userId, envelopeId, fieldId, locationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureEnvelopeFieldLocation() throws ApiException {
	
  		SignatureEnvelopeFieldLocationSettings body = null;
		String userId = "";
		String envelopeId = "";
		String documentId = "";
		String recipientId = "";
		String fieldId = "";
		String locationId = "";
		SignatureEnvelopeFieldResponse response = new SignatureApi().ModifySignatureEnvelopeFieldLocation(body, userId, envelopeId, documentId, recipientId, fieldId, locationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureTemplates() throws ApiException {
	
  		String userId = "";
		String page = "";
		String documentGuid = "";
		String recipientName = "";
		String name = "";
		String records = "";
		SignatureTemplatesResponse response = new SignatureApi().GetSignatureTemplates(userId, page, documentGuid, recipientName, name, records);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureTemplate() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		SignatureTemplateResponse response = new SignatureApi().GetSignatureTemplate(userId, templateId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateSignatureTemplate() throws ApiException {
	
  		SignatureTemplateSettings body = null;
		String userId = "";
		String name = "";
		String templateId = "";
		String envelopetId = "";
		SignatureTemplateResponse response = new SignatureApi().CreateSignatureTemplate(body, userId, name, templateId, envelopetId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureTemplate() throws ApiException {
	
  		SignatureTemplateSettings body = null;
		String userId = "";
		String templateId = "";
		SignatureTemplateResponse response = new SignatureApi().ModifySignatureTemplate(body, userId, templateId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testRenameSignatureTemplate() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String name = "";
		SignatureTemplateResponse response = new SignatureApi().RenameSignatureTemplate(userId, templateId, name);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureTemplate() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureTemplate(userId, templateId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddSignatureTemplateRecipient() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String nickname = "";
		String order = "";
		String role = "";
		SignatureTemplateResponse response = new SignatureApi().AddSignatureTemplateRecipient(userId, templateId, nickname, order, role);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureTemplateRecipients() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		SignatureTemplateRecipientsResponse response = new SignatureApi().GetSignatureTemplateRecipients(userId, templateId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteSignatureTemplateRecipient() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String recipientId = "";
		SignatureStatusResponse response = new SignatureApi().DeleteSignatureTemplateRecipient(userId, templateId, recipientId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testModifySignatureTemplateRecipient() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String nickname = "";
		String order = "";
		String role = "";
		SignatureTemplateResponse response = new SignatureApi().ModifySignatureTemplateRecipient(userId, templateId, nickname, order, role);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddSignatureTemplateDocument() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		String documentId = "";
		String order = "";
		SignatureTemplateDocumentResponse response = new SignatureApi().AddSignatureTemplateDocument(userId, templateId, documentId, order);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSignatureTemplateDocuments() throws ApiException {
	
  		String userId = "";
		String templateId = "";
		SignatureTemplateDocumentsResponse response = new SignatureApi().GetSignatureTemplateDocuments(userId, templateId);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
