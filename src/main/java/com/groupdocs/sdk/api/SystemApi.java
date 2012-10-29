package com.groupdocs.sdk.api;

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.model.GetCountriesResponse;
import com.groupdocs.sdk.model.GetPlanResponse;
import com.groupdocs.sdk.model.SubscriptionPlanInfo;
import com.groupdocs.sdk.model.GetUserSubscriptionPlanResponse;
import com.groupdocs.sdk.model.GetSubscriptionPlansResponse;
import com.groupdocs.sdk.model.GetStatesResponse;
import com.groupdocs.sdk.model.SetUserSubscriptionPlanResponse;
import java.util.*;

public class SystemApi {
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

  public GetPlanResponse GetUserPlan (String callerId) throws ApiException {
  	String resourcePath = "/system/{callerId}/plan".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetPlanResponse) ApiInvoker.deserialize(response, "", GetPlanResponse.class);
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
  public GetUserSubscriptionPlanResponse GetUserSubscriptionPlan (String callerId) throws ApiException {
  	String resourcePath = "/system/{callerId}/subscription".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetUserSubscriptionPlanResponse) ApiInvoker.deserialize(response, "", GetUserSubscriptionPlanResponse.class);
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
  public GetSubscriptionPlansResponse GetSubscriptionPlans (String callerId, String family) throws ApiException {
  	String resourcePath = "/system/{callerId}/plans/{family}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "family" + "}", String.valueOf(family));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || family == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetSubscriptionPlansResponse) ApiInvoker.deserialize(response, "", GetSubscriptionPlansResponse.class);
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
  public SetUserSubscriptionPlanResponse SetSubscriptionPlan (String userId, String productId, SubscriptionPlanInfo body) throws ApiException {
  	String resourcePath = "/system/{userId}/subscriptions/{productId}".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "productId" + "}", String.valueOf(productId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(userId == null || productId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (SetUserSubscriptionPlanResponse) ApiInvoker.deserialize(response, "", SetUserSubscriptionPlanResponse.class);
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
  public GetCountriesResponse GetCountries (String callerId) throws ApiException {
  	String resourcePath = "/system/{callerId}/countries".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetCountriesResponse) ApiInvoker.deserialize(response, "", GetCountriesResponse.class);
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
  public GetStatesResponse GetStates (String callerId, String countryName) throws ApiException {
  	String resourcePath = "/system/{callerId}/countries/{countryName}/states".replace("*", "");
    // create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "countryName" + "}", String.valueOf(countryName));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(callerId == null || countryName == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams);
      if(response != null){
        return (GetStatesResponse) ApiInvoker.deserialize(response, "", GetStatesResponse.class);
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

