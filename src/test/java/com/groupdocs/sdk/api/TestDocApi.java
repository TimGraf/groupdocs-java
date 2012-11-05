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
public class TestDocApi extends AbstractIntegrationTest {
  
	@Test
	public void testViewDocument() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String pageNumber = "";
		String pageCount = "";
		String width = "";
		String quality = "";
		String usePdf = "";
		ViewDocumentResponse response = new DocApi().ViewDocument(userId, fileId, pageNumber, pageCount, width, quality, usePdf);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentViews() throws ApiException {
	
  		String userId = "";
		String startIndex = "";
		String pageSize = "";
		DocumentViewsResponse response = new DocApi().GetDocumentViews(userId, startIndex, pageSize);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testShareDocument() throws ApiException {
	
  		List<String> body = null;
		String userId = "";
		String fileId = "";
		SharedUsersResponse response = new DocApi().ShareDocument(body, userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUnshareDocument() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		SharedUsersResponse response = new DocApi().UnshareDocument(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetFolderSharers() throws ApiException {
	
  		String userId = "";
		String folderId = "";
		SharedUsersResponse response = new DocApi().GetFolderSharers(userId, folderId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testShareFolder() throws ApiException {
	
  		List<String> body = null;
		String userId = "";
		String folderId = "";
		SharedUsersResponse response = new DocApi().ShareFolder(body, userId, folderId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUnshareFolder() throws ApiException {
	
  		String userId = "";
		String folderId = "";
		SharedUsersResponse response = new DocApi().UnshareFolder(userId, folderId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetDocumentAccessMode() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String mode = "";
		DocumentAccessInfoResponse response = new DocApi().SetDocumentAccessMode(userId, fileId, mode);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentAccessInfo() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		DocumentAccessInfoResponse response = new DocApi().GetDocumentAccessInfo(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentMetadata() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		GetDocumentInfoResponse response = new DocApi().GetDocumentMetadata(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentMetadataByPath() throws ApiException {
	
  		String userId = "";
		String path = "";
		GetDocumentInfoResponse response = new DocApi().GetDocumentMetadataByPath(userId, path);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetDocumentUserStatus() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String status = "";
		DocumentUserStatusResponse response = new DocApi().SetDocumentUserStatus(userId, fileId, status);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSharedDocuments() throws ApiException {
	
  		Boolean orderAsc = null;
		String userId = "";
		String sharesTypes = "";
		String pageIndex = "";
		String pageSize = "";
		String orderBy = "";
		SharedDocumentsResponse response = new DocApi().GetSharedDocuments(orderAsc, userId, sharesTypes, pageIndex, pageSize, orderBy);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetTemplateFields() throws ApiException {
	
  		Boolean includeGeometry = null;
		String userId = "";
		String fileId = "";
		TemplateFieldsResponse response = new DocApi().GetTemplateFields(includeGeometry, userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentFormats() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		GetDocumentForeignTypesResponse response = new DocApi().GetDocumentFormats(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentPageImage() throws ApiException {
	
  		Boolean usePdf = null;
		Boolean expiresOn = null;
		String userId = "";
		String fileId = "";
		Integer pageNumber = 0;
		String dimension = "";
		Integer quality = 0;
		InputStream response = new DocApi().GetDocumentPageImage(usePdf, expiresOn, userId, fileId, pageNumber, dimension, quality);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentPagesImageUrls() throws ApiException {
	
  		Boolean usePdf = null;
		String userId = "";
		String fileId = "";
		Integer firstPage = 0;
		Integer pageCount = 0;
		String dimension = "";
		Integer quality = 0;
		String token = "";
		GetImageUrlsResponse response = new DocApi().GetDocumentPagesImageUrls(usePdf, userId, fileId, firstPage, pageCount, dimension, quality, token);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetEditLock() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		GetEditLockResponse response = new DocApi().GetEditLock(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testRemoveEditLock() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		RemoveEditLockResponse response = new DocApi().RemoveEditLock(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
