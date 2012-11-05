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
public class TestPostApi extends AbstractIntegrationTest {
  
	@Test
	public void testRenameByPost() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String newName = "";
		RenameResponse response = new PostApi().RenameByPost(userId, fileId, newName);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteByPost() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		DeleteResponse response = new PostApi().DeleteByPost(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteFromFolderByPost() throws ApiException {
	
  		String userId = "";
		String path = "";
		DeleteResponse response = new PostApi().DeleteFromFolderByPost(userId, path);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCompressByPost() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String archiveType = "";
		CompressResponse response = new PostApi().CompressByPost(userId, fileId, archiveType);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
