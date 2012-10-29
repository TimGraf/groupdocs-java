package com.groupdocs.sdk.api;

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.model.UpdateStorageProviderResponse;
import com.groupdocs.sdk.model.DeleteAccountUserResponse;
import com.groupdocs.sdk.model.UserInfoResponse;
import com.groupdocs.sdk.model.UserInfo;
import com.groupdocs.sdk.model.SetUserRolesResponse;
import com.groupdocs.sdk.model.UpdateAccountUserResponse;
import com.groupdocs.sdk.model.ResetPasswordResponse;
import com.groupdocs.sdk.model.GetStorageProvidersResponse;
import com.groupdocs.sdk.model.StorageProviderInfo;
import com.groupdocs.sdk.model.ChangePasswordResponse;
import com.groupdocs.sdk.model.AddStorageProviderResponse;
import com.groupdocs.sdk.model.UpdateUserResponse;
import com.groupdocs.sdk.model.UserPasswordInfo;
import com.groupdocs.sdk.model.GetAccountResponse;
import com.groupdocs.sdk.model.CreateUserResponse;
import com.groupdocs.sdk.model.GetRolesResponse;
import com.groupdocs.sdk.model.GetUserEmbedKeyResponse;
import com.groupdocs.sdk.model.DeleteAccountResponse;
import com.groupdocs.sdk.model.RoleInfo;
import com.groupdocs.sdk.model.GetAccountUsersResponse;
import java.util.*;

public class MgmtApi {
  String basePath = "https://api.groupdocs.com/v2.0";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public UserInfoResponse GetUserProfile (String userId) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/profile".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (UserInfoResponse) ApiInvoker.deserialize(response, "", UserInfoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UpdateUserResponse UpdateUserProfile (String userId, UserInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/profile".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (UpdateUserResponse) ApiInvoker.deserialize(response, "", UpdateUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ChangePasswordResponse ChangeUserPassword (String userId, UserPasswordInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/profile/password".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ChangePasswordResponse) ApiInvoker.deserialize(response, "", ChangePasswordResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UserInfoResponse GetUserProfileByResetToken (String callerId, String token) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/reset-tokens?token={token}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "token" + "}", String.valueOf(token));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || token == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (UserInfoResponse) ApiInvoker.deserialize(response, "", UserInfoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UserInfoResponse GetUserProfileByVerifToken (String callerId, String token) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/verif-tokens?token={token}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "token" + "}", String.valueOf(token));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || token == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (UserInfoResponse) ApiInvoker.deserialize(response, "", UserInfoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UserInfoResponse GetUserProfileByClaimedToken (String callerId, String token) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/claimed-tokens?token={token}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "token" + "}", String.valueOf(token));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || token == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (UserInfoResponse) ApiInvoker.deserialize(response, "", UserInfoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UserInfoResponse GetAlienUserProfile (String callerId, String userId) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/profile".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (UserInfoResponse) ApiInvoker.deserialize(response, "", UserInfoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UpdateUserResponse UpdateAlienUserProfile (String callerId, String userId, UserInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/profile".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (UpdateUserResponse) ApiInvoker.deserialize(response, "", UpdateUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public CreateUserResponse CreateUser (String callerId, UserInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams);
      if(response != null){
        return (CreateUserResponse) ApiInvoker.deserialize(response, "", CreateUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UserInfoResponse CreateUserLogin (String callerId, String userId, String password) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/logins".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "password" + "}", String.valueOf(password));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null || password == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, null, headerParams);
      if(response != null){
        return (UserInfoResponse) ApiInvoker.deserialize(response, "", UserInfoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ChangePasswordResponse ChangeAlienUserPassword (String callerId, String userId, UserPasswordInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/password".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ChangePasswordResponse) ApiInvoker.deserialize(response, "", ChangePasswordResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResetPasswordResponse ResetUserPassword (String callerId, String userId) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/password".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return (ResetPasswordResponse) ApiInvoker.deserialize(response, "", ResetPasswordResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetStorageProvidersResponse GetStorageProviders (String userId) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/storages".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetStorageProvidersResponse) ApiInvoker.deserialize(response, "", GetStorageProvidersResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public AddStorageProviderResponse AddStorageProvider (String userId, String provider, StorageProviderInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/storages/{provider}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "provider" + "}", String.valueOf(provider));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || provider == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams);
      if(response != null){
        return (AddStorageProviderResponse) ApiInvoker.deserialize(response, "", AddStorageProviderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UpdateStorageProviderResponse UpdateStorageProvider (String userId, String provider, StorageProviderInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/storages/{provider}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "provider" + "}", String.valueOf(provider));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || provider == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (UpdateStorageProviderResponse) ApiInvoker.deserialize(response, "", UpdateStorageProviderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetRolesResponse GetRoles (String userId) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/roles".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetRolesResponse) ApiInvoker.deserialize(response, "", GetRolesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetRolesResponse GetUserRoles (String callerId, String userId) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/roles".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetRolesResponse) ApiInvoker.deserialize(response, "", GetRolesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public SetUserRolesResponse SetUserRoles (String callerId, String userId, List<RoleInfo> body) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/users/{userId}/roles".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (SetUserRolesResponse) ApiInvoker.deserialize(response, "", SetUserRolesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetAccountResponse GetAccount (String userId) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/account".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetAccountResponse) ApiInvoker.deserialize(response, "", GetAccountResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public DeleteAccountResponse DeleteAccount (String userId) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/account".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return (DeleteAccountResponse) ApiInvoker.deserialize(response, "", DeleteAccountResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetAccountUsersResponse GetAccountUsers (String adminId) throws ApiException {
  	String resourcePath = "/mgmt/{adminId}/account/users".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "adminId" + "}", String.valueOf(adminId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(adminId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetAccountUsersResponse) ApiInvoker.deserialize(response, "", GetAccountUsersResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public UpdateAccountUserResponse UpdateAccountUser (String adminId, String userName, UserInfo body) throws ApiException {
  	String resourcePath = "/mgmt/{adminId}/account/users/{userName}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "adminId" + "}", String.valueOf(adminId)).replace("{" + "userName" + "}", String.valueOf(userName));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(adminId == null || userName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (UpdateAccountUserResponse) ApiInvoker.deserialize(response, "", UpdateAccountUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public DeleteAccountUserResponse DeleteAccountUser (String adminId, String userName) throws ApiException {
  	String resourcePath = "/mgmt/{adminId}/account/users/{userName}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "adminId" + "}", String.valueOf(adminId)).replace("{" + "userName" + "}", String.valueOf(userName));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(adminId == null || userName == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return (DeleteAccountUserResponse) ApiInvoker.deserialize(response, "", DeleteAccountUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetUserEmbedKeyResponse GetUserEmbedKey (String userId, String area) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/embedkey/{area}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "area" + "}", String.valueOf(area));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || area == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetUserEmbedKeyResponse) ApiInvoker.deserialize(response, "", GetUserEmbedKeyResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetUserEmbedKeyResponse GetUserEmbedKeyFromGuid (String callerId, String guid) throws ApiException {
  	String resourcePath = "/mgmt/{callerId}/embedkey/guid/{guid}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "guid" + "}", String.valueOf(guid));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || guid == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetUserEmbedKeyResponse) ApiInvoker.deserialize(response, "", GetUserEmbedKeyResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public GetUserEmbedKeyResponse GenerateKeyForUser (String userId, String area) throws ApiException {
  	String resourcePath = "/mgmt/{userId}/embedkey/new/{area}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "area" + "}", String.valueOf(area));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || area == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetUserEmbedKeyResponse) ApiInvoker.deserialize(response, "", GetUserEmbedKeyResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

