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
public class TestAsyncApi extends AbstractIntegrationTest {
  
	@Test
	public void testGetJob() throws ApiException {
	
  		String userId = "";
		String jobId = "";
		GetJobResponse response = new AsyncApi().GetJob(userId, jobId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetJobJson() throws ApiException {
	
  		String userId = "";
		String jobId = "";
		GetJobResponse response = new AsyncApi().GetJobJson(userId, jobId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetJobDocuments() throws ApiException {
	
  		String userId = "";
		String jobId = "";
		String format = "json";
		GetJobDocumentsResponse response = new AsyncApi().GetJobDocuments(userId, jobId, format);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateJob() throws ApiException {
	
  		JobInfo body = null;
		String userId = "";
		CreateJobResponse response = new AsyncApi().CreateJob(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteJob() throws ApiException {
	
  		String userId = "";
		String jobGuid = "";
		DeleteResult response = new AsyncApi().DeleteJob(userId, jobGuid);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddJobDocument() throws ApiException {
	
  		Boolean checkOwnership = null;
		String userId = "";
		String jobId = "";
		String fileId = "";
		String formats = "";
		AddJobDocumentResponse response = new AsyncApi().AddJobDocument(checkOwnership, userId, jobId, fileId, formats);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteJobDocument() throws ApiException {
	
  		String userId = "";
		String jobGuid = "";
		String documentId = "";
		DeleteResponse response = new AsyncApi().DeleteJobDocument(userId, jobGuid, documentId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddJobDocumentUrl() throws ApiException {
	
  		String userId = "";
		String jobId = "";
		String absoluteUrl = "";
		String formats = "";
		AddJobDocumentResponse response = new AsyncApi().AddJobDocumentUrl(userId, jobId, absoluteUrl, formats);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateJob() throws ApiException {
	
  		JobInfo body = null;
		String userId = "";
		String jobId = "";
		UpdateJobResponse response = new AsyncApi().UpdateJob(body, userId, jobId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetJobs() throws ApiException {
	
  		String userId = "";
		String pageIndex = "";
		String pageSize = "";
		String date = "";
		String status = "";
		String actions = "";
		String excludedActions = "";
		GetJobsResponse response = new AsyncApi().GetJobs(userId, pageIndex, pageSize, date, status, actions, excludedActions);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetJobsDocuments() throws ApiException {
	
  		Boolean orderAsc = null;
		String userId = "";
		String pageIndex = "";
		String pageSize = "";
		String actions = "";
		String excludedActions = "";
		String orderBy = "";
		GetJobsDocumentsResponse response = new AsyncApi().GetJobsDocuments(orderAsc, userId, pageIndex, pageSize, actions, excludedActions, orderBy);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testConvert() throws ApiException {
	
  		Boolean printScript = null;
		String userId = "";
		String fileId = "";
		String targetType = "";
		String emailResults = "";
		String description = "";
		String callbackUrl = "";
		ConvertResponse response = new AsyncApi().Convert(printScript, userId, fileId, targetType, emailResults, description, callbackUrl);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
