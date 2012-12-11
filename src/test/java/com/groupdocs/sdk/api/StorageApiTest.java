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
import static org.hamcrest.Matchers.equalTo;

import java.util.regex.Pattern;

import javax.ws.rs.core.MediaType;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.github.restdriver.clientdriver.ClientDriverRequest;
import com.github.restdriver.clientdriver.ClientDriverRequest.Method;
import com.github.restdriver.clientdriver.ClientDriverResponse;
import com.github.restdriver.clientdriver.ClientDriverRule;
import com.groupdocs.sdk.model.ListEntitiesResponse;

public class StorageApiTest extends AbstractUnitTest {

	StorageApi api;
	
	@Rule
	public ClientDriverRule driver = new ClientDriverRule();
	
	@Before
	public void setUpBefore() throws Exception {
		api = new StorageApi();
		api.setBasePath(driver.getBaseUrl());
	}

	@Test
	public void testListEntities() throws Exception {
		// sample parameters
		Boolean orderAsc = true;
		Boolean extended = true;
		String userId = "userId";
		String path = "path";
		Integer pageIndex = 0;
		Integer pageSize = 0;
		String orderBy = "orderBy";
		String filter = "filter";
		String fileTypes = "fileTypes";
		
		// strip off query part
		String resourcePath = "/storage/{userId}/folders/{path}".
				replace("{userId}", userId).
				replace("{path}", path); 

		ClientDriverRequest mockRequest = onRequestTo(resourcePath).withMethod(Method.GET).withHeader("Content-Type", MediaType.TEXT_HTML);
		// add query parameters to expectation
		mockRequest = mockRequest.withParam("page", pageIndex).withParam("count", pageSize).withParam("extended", extended).withParam("filter", filter).withParam("file_types", fileTypes).withParam("order_asc", orderAsc).withParam("order_by", orderBy).withParam("signature", Pattern.compile(".*"));
		
		// read response json from file
		String responseBody = getSampleResponse("storage/ListEntities.json");
		
		ClientDriverResponse mockResponse = giveResponse(responseBody).withStatus(200);
		driver.addExpectation(mockRequest, mockResponse);
		
		ListEntitiesResponse response = api.ListEntities(userId, path, pageIndex, pageSize, orderBy, orderAsc, filter, fileTypes, extended);
		// this ensures that json was successfully deserialized into corresponding model object
		assertSameJson(responseBody, response);
	}

}
