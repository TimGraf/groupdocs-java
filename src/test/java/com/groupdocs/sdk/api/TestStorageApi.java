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
public class TestStorageApi extends AbstractIntegrationTest {
  
	@Test
	public void testGetStorageInfo() throws ApiException {
	
  		String userId = "";
		StorageInfoResponse response = new StorageApi().GetStorageInfo(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testListEntities() throws ApiException {
	
  		Boolean orderAsc = null;
		Boolean extended = null;
		String userId = "";
		String path = "";
		Integer pageIndex = 0;
		Integer pageSize = 0;
		String orderBy = "";
		String filter = "";
		String fileTypes = "";
		ListEntitiesResponse response = new StorageApi().ListEntities(orderAsc, extended, userId, path, pageIndex, pageSize, orderBy, filter, fileTypes);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetFile() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String response = new StorageApi().GetFile(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSharedFile() throws ApiException {
	
  		String userEmail = "";
		String filePath = "";
		String response = new StorageApi().GetSharedFile(userEmail, filePath);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpload() throws ApiException {
	
  		InputStream body = null;
		String userId = "";
		String path = "";
		String description = "";
		UploadResponse response = new StorageApi().Upload(body, userId, path, description);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUploadWeb() throws ApiException {
	
  		String userId = "";
		String url = "";
		UploadResponse response = new StorageApi().UploadWeb(userId, url);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUploadGoogle() throws ApiException {
	
  		String userId = "";
		String path = "";
		String fileId = "";
		UploadResponse response = new StorageApi().UploadGoogle(userId, path, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDelete() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		DeleteResponse response = new StorageApi().Delete(userId, fileId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteFromFolder() throws ApiException {
	
  		String userId = "";
		String path = "";
		DeleteResponse response = new StorageApi().DeleteFromFolder(userId, path);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testMoveFile() throws ApiException {
	
  		String userId = "";
		String path = "";
		String mode = "";
		String Groupdocs_Move = "";
		String Groupdocs_Copy = "";
		FileMoveResponse response = new StorageApi().MoveFile(userId, path, mode, Groupdocs_Move, Groupdocs_Copy);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testMoveFolder() throws ApiException {
	
  		String userId = "";
		String path = "";
		String mode = "";
		String Groupdocs_Copy = "";
		String Groupdocs_Move = "";
		FolderMoveResponse response = new StorageApi().MoveFolder(userId, path, mode, Groupdocs_Copy, Groupdocs_Move);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreate() throws ApiException {
	
  		String userId = "";
		String path = "";
		CreateFolderResponse response = new StorageApi().Create(userId, path);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCompress() throws ApiException {
	
  		String userId = "";
		String fileId = "";
		String archiveType = "";
		CompressResponse response = new StorageApi().Compress(userId, fileId, archiveType);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreatePackage() throws ApiException {
	
  		Boolean storeRelativePath = null;
		List<String> body = null;
		String userId = "";
		String packageName = "";
		CreatePackageResponse response = new StorageApi().CreatePackage(storeRelativePath, body, userId, packageName);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testMoveToTrash() throws ApiException {
	
  		String userId = "";
		String path = "";
		FolderMoveResponse response = new StorageApi().MoveToTrash(userId, path);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testRestoreFromTrash() throws ApiException {
	
  		String userId = "";
		String path = "";
		DeleteResponse response = new StorageApi().RestoreFromTrash(userId, path);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
