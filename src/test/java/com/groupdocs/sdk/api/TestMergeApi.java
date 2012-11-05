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
public class TestMergeApi extends AbstractIntegrationTest {
  
	@Test
	public void testAddJobDocumentDataSource() throws ApiException {
	
  		String userId = "";
		String jobId = "";
		String fileId = "";
		String datasourceId = "";
		AddDocumentDataSourceResponse response = new MergeApi().AddJobDocumentDataSource(userId, jobId, fileId, datasourceId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddJobDocumentDataSourceFields() throws ApiException {
	
  		List<DatasourceField> body = null;
		String userId = "";
		String jobId = "";
		String fileId = "";
		AddDocumentDataSourceResponse response = new MergeApi().AddJobDocumentDataSourceFields(body, userId, jobId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testFillQuestionnaire() throws ApiException {
	
  		String userId = "";
		String collectorId = "";
		String datasourceId = "";
		String targetType = "";
		String emailResults = "";
		MergeTemplateResponse response = new MergeApi().FillQuestionnaire(userId, collectorId, datasourceId, targetType, emailResults);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testMergeDatasource() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String datasourceId = "";
		String targetType = "";
		String emailResults = "";
		MergeTemplateResponse response = new MergeApi().MergeDatasource(userId, fileId, datasourceId, targetType, emailResults);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testMergeDatasourceFields() throws ApiException {
	
  		List<DatasourceField> body = null;
		String userId = "";
		String fileId = "";
		String targetType = "";
		String emailResults = "";
		String assemblyName = "";
		MergeTemplateResponse response = new MergeApi().MergeDatasourceFields(body, userId, fileId, targetType, emailResults, assemblyName);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaire() throws ApiException {
	
  		String userId = "";
		String questionnaireId = "";
		GetQuestionnaireResponse response = new MergeApi().GetQuestionnaire(userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaires() throws ApiException {
	
  		String userId = "";
		String status = "";
		Integer pageNumber = 0;
		Integer pageSize = 0;
		GetQuestionnairesResponse response = new MergeApi().GetQuestionnaires(userId, status, pageNumber, pageSize);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateQuestionnaire() throws ApiException {
	
  		QuestionnaireInfo body = null;
		String userId = "";
		CreateQuestionnaireResponse response = new MergeApi().CreateQuestionnaire(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateQuestionnaire() throws ApiException {
	
  		QuestionnaireInfo body = null;
		String userId = "";
		String questionnaireId = "";
		UpdateQuestionnaireResponse response = new MergeApi().UpdateQuestionnaire(body, userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteQuestionnaire() throws ApiException {
	
  		String userId = "";
		String questionnaireId = "";
		DeleteQuestionnaireResponse response = new MergeApi().DeleteQuestionnaire(userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentQuestionnaires() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		GetDocumentQuestionnairesResponse response = new MergeApi().GetDocumentQuestionnaires(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateDocumentQuestionnaire() throws ApiException {
	
  		QuestionnaireInfo body = null;
		String userId = "";
		String fileId = "";
		AddDocumentQuestionnaireResponse response = new MergeApi().CreateDocumentQuestionnaire(body, userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddDocumentQuestionnaire() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String questionnaireId = "";
		AddDocumentQuestionnaireResponse response = new MergeApi().AddDocumentQuestionnaire(userId, fileId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteDocumentQuestionnaire() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String questionnaireId = "";
		DeleteDocumentQuestionnaireResponse response = new MergeApi().DeleteDocumentQuestionnaire(userId, fileId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddDataSource() throws ApiException {
	
  		Datasource body = null;
		String userId = "";
		AddDatasourceResponse response = new MergeApi().AddDataSource(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateDataSource() throws ApiException {
	
  		Datasource body = null;
		String userId = "";
		String datasourceId = "";
		AddDatasourceResponse response = new MergeApi().UpdateDataSource(body, userId, datasourceId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateDataSourceFields() throws ApiException {
	
  		Datasource body = null;
		String userId = "";
		String datasourceId = "";
		AddDatasourceResponse response = new MergeApi().UpdateDataSourceFields(body, userId, datasourceId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteDataSource() throws ApiException {
	
  		String userId = "";
		String datasourceId = "";
		DeleteDatasourceResponse response = new MergeApi().DeleteDataSource(userId, datasourceId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDataSource() throws ApiException {
	
  		String userId = "";
		String datasourceId = "";
		String fields = "";
		GetDatasourceResponse response = new MergeApi().GetDataSource(userId, datasourceId, fields);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaireDataSources() throws ApiException {
	
  		Boolean includeFields = null;
		String userId = "";
		String questionnaireId = "";
		GetDatasourcesResponse response = new MergeApi().GetQuestionnaireDataSources(includeFields, userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddQuestionnaireExecution() throws ApiException {
	
  		QuestionnaireExecutionInfo body = null;
		String userId = "";
		String collectorId = "";
		AddQuestionnaireExecutionResponse response = new MergeApi().AddQuestionnaireExecution(body, userId, collectorId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaireExecutions() throws ApiException {
	
  		String userId = "";
		String questionnaireId = "";
		GetQuestionnaireExecutionsResponse response = new MergeApi().GetQuestionnaireExecutions(userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteQuestionnaireExecution() throws ApiException {
	
  		String userId = "";
		String executionId = "";
		DeleteQuestionnaireExecutionResponse response = new MergeApi().DeleteQuestionnaireExecution(userId, executionId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateQuestionnaireExecution() throws ApiException {
	
  		QuestionnaireExecutionInfo body = null;
		String userId = "";
		String executionId = "";
		UpdateQuestionnaireExecutionResponse response = new MergeApi().UpdateQuestionnaireExecution(body, userId, executionId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateQuestionnaireExecutionStatus() throws ApiException {
	
  		String userId = "";
		String executionId = "";
		String body = "";
		UpdateQuestionnaireExecutionResponse response = new MergeApi().UpdateQuestionnaireExecutionStatus(userId, executionId, body);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaireCollectors() throws ApiException {
	
  		String userId = "";
		String questionnaireId = "";
		GetQuestionnaireCollectorsResponse response = new MergeApi().GetQuestionnaireCollectors(userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaireCollector() throws ApiException {
	
  		String userId = "";
		String collectorId = "";
		GetQuestionnaireCollectorResponse response = new MergeApi().GetQuestionnaireCollector(userId, collectorId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddQuestionnaireCollector() throws ApiException {
	
  		QuestionnaireCollectorInfo body = null;
		String userId = "";
		String questionnaireId = "";
		AddQuestionnaireCollectorResponse response = new MergeApi().AddQuestionnaireCollector(body, userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateQuestionnaireCollector() throws ApiException {
	
  		QuestionnaireCollectorInfo body = null;
		String userId = "";
		String collectorId = "";
		UpdateQuestionnaireCollectorResponse response = new MergeApi().UpdateQuestionnaireCollector(body, userId, collectorId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteQuestionnaireCollector() throws ApiException {
	
  		String userId = "";
		String collectorId = "";
		DeleteQuestionnaireCollectorResponse response = new MergeApi().DeleteQuestionnaireCollector(userId, collectorId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetTemplates() throws ApiException {
	
  		String userId = "";
		GetTemplatesResponse response = new MergeApi().GetTemplates(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetQuestionnaireFields() throws ApiException {
	
  		Boolean includeGeometry = null;
		String userId = "";
		String questionnaireId = "";
		TemplateFieldsResponse response = new MergeApi().GetQuestionnaireFields(includeGeometry, userId, questionnaireId);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
