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
public class TestAntApi extends AbstractIntegrationTest {
  
	@Test
	public void testCreateAnnotation() throws ApiException {
	
  		AnnotationInfo body = null;
		String userId = "";
		String fileId = "";
		CreateAnnotationResponse response = new AntApi().CreateAnnotation(body, userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testListAnnotations() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		ListAnnotationsResponse response = new AntApi().ListAnnotations(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteAnnotation() throws ApiException {
	
  		String userId = "";
		String annotationId = "";
		DeleteAnnotationResponse response = new AntApi().DeleteAnnotation(userId, annotationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateAnnotationReply() throws ApiException {
	
  		AnnotationReplyInfo body = null;
		String userId = "";
		String annotationId = "";
		AddReplyResponse response = new AntApi().CreateAnnotationReply(body, userId, annotationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testEditAnnotationReply() throws ApiException {
	
  		String userId = "";
		String replyGuid = "";
		String body = "";
		EditReplyResponse response = new AntApi().EditAnnotationReply(userId, replyGuid, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteAnnotationReply() throws ApiException {
	
  		String userId = "";
		String replyGuid = "";
		DeleteReplyResponse response = new AntApi().DeleteAnnotationReply(userId, replyGuid);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testListAnnotationReplies() throws ApiException {
	
  		String userId = "";
		String annotationId = "";
		Long after = 0;
		ListRepliesResponse response = new AntApi().ListAnnotationReplies(userId, annotationId, after);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetAnnotationCollaborators() throws ApiException {
	
  		List<String> body = null;
		String userId = "";
		String fileId = "";
		String version = "";
		SetCollaboratorsResponse response = new AntApi().SetAnnotationCollaborators(body, userId, fileId, version);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetAnnotationCollaborators() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		GetCollaboratorsResponse response = new AntApi().GetAnnotationCollaborators(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddAnnotationCollaborator() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String body = "";
		AddCollaboratorResponse response = new AntApi().AddAnnotationCollaborator(userId, fileId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetReviewerContacts() throws ApiException {
	
  		String userId = "";
		GetReviewerContactsResponse response = new AntApi().GetReviewerContacts(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetReviewerContacts() throws ApiException {
	
  		String userId = "";
		GetReviewerContactsResponse response = new AntApi().SetReviewerContacts(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testMoveAnnotation() throws ApiException {
	
  		Point body = null;
		String userId = "";
		String annotationId = "";
		MoveAnnotationResponse response = new AntApi().MoveAnnotation(body, userId, annotationId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetAnnotationAccess() throws ApiException {
	
  		String userId = "";
		String annotationId = "";
		Integer body = 0;
		SetAnnotationAccessResponse response = new AntApi().SetAnnotationAccess(userId, annotationId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetReviewerRights() throws ApiException {
	
  		List<ReviewerInfo> body = null;
		String userId = "";
		String fileId = "";
		SetDocumentRightsResponse response = new AntApi().SetReviewerRights(body, userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetSharedLinkAccessRights() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		Integer body = 0;
		SetSharedLinkAccessRightsResponse response = new AntApi().SetSharedLinkAccessRights(userId, fileId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
