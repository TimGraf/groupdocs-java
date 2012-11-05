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
public class TestMgmtApi extends AbstractIntegrationTest {
  
	@Test
	public void testGetUserProfile() throws ApiException {
	
  		String userId = "";
		UserInfoResponse response = new MgmtApi().GetUserProfile(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateUserProfile() throws ApiException {
	
  		UserInfo body = null;
		String userId = "";
		UpdateUserResponse response = new MgmtApi().UpdateUserProfile(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testChangeUserPassword() throws ApiException {
	
  		UserPasswordInfo body = null;
		String userId = "";
		ChangePasswordResponse response = new MgmtApi().ChangeUserPassword(body, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserProfileByResetToken() throws ApiException {
	
  		String callerId = "";
		String token = "";
		UserInfoResponse response = new MgmtApi().GetUserProfileByResetToken(callerId, token);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserProfileByVerifToken() throws ApiException {
	
  		String callerId = "";
		String token = "";
		UserInfoResponse response = new MgmtApi().GetUserProfileByVerifToken(callerId, token);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserProfileByClaimedToken() throws ApiException {
	
  		String callerId = "";
		String token = "";
		UserInfoResponse response = new MgmtApi().GetUserProfileByClaimedToken(callerId, token);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetAlienUserProfile() throws ApiException {
	
  		String callerId = "";
		String userId = "";
		UserInfoResponse response = new MgmtApi().GetAlienUserProfile(callerId, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateAlienUserProfile() throws ApiException {
	
  		UserInfo body = null;
		String callerId = "";
		String userId = "";
		UpdateUserResponse response = new MgmtApi().UpdateAlienUserProfile(body, callerId, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateUser() throws ApiException {
	
  		UserInfo body = null;
		String callerId = "";
		CreateUserResponse response = new MgmtApi().CreateUser(body, callerId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testCreateUserLogin() throws ApiException {
	
  		String callerId = "";
		String userId = "";
		String password = "";
		UserInfoResponse response = new MgmtApi().CreateUserLogin(callerId, userId, password);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testChangeAlienUserPassword() throws ApiException {
	
  		UserPasswordInfo body = null;
		String callerId = "";
		String userId = "";
		ChangePasswordResponse response = new MgmtApi().ChangeAlienUserPassword(body, callerId, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testResetUserPassword() throws ApiException {
	
  		String callerId = "";
		String userId = "";
		ResetPasswordResponse response = new MgmtApi().ResetUserPassword(callerId, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetStorageProviders() throws ApiException {
	
  		String userId = "";
		GetStorageProvidersResponse response = new MgmtApi().GetStorageProviders(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testAddStorageProvider() throws ApiException {
	
  		StorageProviderInfo body = null;
		String userId = "";
		String provider = "";
		AddStorageProviderResponse response = new MgmtApi().AddStorageProvider(body, userId, provider);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateStorageProvider() throws ApiException {
	
  		StorageProviderInfo body = null;
		String userId = "";
		String provider = "";
		UpdateStorageProviderResponse response = new MgmtApi().UpdateStorageProvider(body, userId, provider);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetRoles() throws ApiException {
	
  		String userId = "";
		GetRolesResponse response = new MgmtApi().GetRoles(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserRoles() throws ApiException {
	
  		String callerId = "";
		String userId = "";
		GetRolesResponse response = new MgmtApi().GetUserRoles(callerId, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetUserRoles() throws ApiException {
	
  		List<RoleInfo> body = null;
		String callerId = "";
		String userId = "";
		SetUserRolesResponse response = new MgmtApi().SetUserRoles(body, callerId, userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetAccount() throws ApiException {
	
  		String userId = "";
		GetAccountResponse response = new MgmtApi().GetAccount(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteAccount() throws ApiException {
	
  		String userId = "";
		DeleteAccountResponse response = new MgmtApi().DeleteAccount(userId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetAccountUsers() throws ApiException {
	
  		String adminId = "";
		GetAccountUsersResponse response = new MgmtApi().GetAccountUsers(adminId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testUpdateAccountUser() throws ApiException {
	
  		UserInfo body = null;
		String adminId = "";
		String userName = "";
		UpdateAccountUserResponse response = new MgmtApi().UpdateAccountUser(body, adminId, userName);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testDeleteAccountUser() throws ApiException {
	
  		String adminId = "";
		String userName = "";
		DeleteAccountUserResponse response = new MgmtApi().DeleteAccountUser(adminId, userName);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserEmbedKey() throws ApiException {
	
  		String userId = "";
		String area = "";
		GetUserEmbedKeyResponse response = new MgmtApi().GetUserEmbedKey(userId, area);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserEmbedKeyFromGuid() throws ApiException {
	
  		String callerId = "";
		String guid = "";
		GetUserEmbedKeyResponse response = new MgmtApi().GetUserEmbedKeyFromGuid(callerId, guid);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGenerateKeyForUser() throws ApiException {
	
  		String userId = "";
		String area = "";
		GetUserEmbedKeyResponse response = new MgmtApi().GenerateKeyForUser(userId, area);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
