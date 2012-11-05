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
public class TestComparisonApi extends AbstractIntegrationTest {
  
	@Test
	public void testDownloadResult() throws ApiException {
	
  		String userId = "";
		String resultFileId = "";
		String format = "json";
		String response = new ComparisonApi().DownloadResult(userId, resultFileId, format);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCompare() throws ApiException {
	
  		String userId = "";
		String sourceFileId = "";
		String targetFileId = "";
		CompareResponse response = new ComparisonApi().Compare(userId, sourceFileId, targetFileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetChanges() throws ApiException {
	
  		String userId = "";
		String resultFileId = "";
		ChangesResponse response = new ComparisonApi().GetChanges(userId, resultFileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateChanges() throws ApiException {
	
  		List<ChangeInfo> body = null;
		String userId = "";
		String resultFileId = "";
		ChangesResponse response = new ComparisonApi().UpdateChanges(body, userId, resultFileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetDocumentDetails() throws ApiException {
	
  		String userId = "";
		String guid = "";
		DocumentDetailsResponse response = new ComparisonApi().GetDocumentDetails(userId, guid);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
