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

import com.groupdocs.sdk.common.ApiException;
import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.model.UpdateSubscriptionPlanInfo;
import com.groupdocs.sdk.model.BillingAddressInfo;
import com.groupdocs.sdk.model.GetInvoicesResponse;
import com.groupdocs.sdk.model.GetCountriesResponse;
import com.groupdocs.sdk.model.GetPurchaseWizardResponse;
import com.groupdocs.sdk.model.GetPlanResponse;
import com.groupdocs.sdk.model.SubscriptionPlanInfo;
import com.groupdocs.sdk.model.GetSubscriptionPlanUsageResponse;
import com.groupdocs.sdk.model.GetBillingAddressResponse;
import com.groupdocs.sdk.model.GetUserSubscriptionPlanResponse;
import com.groupdocs.sdk.model.GetTermSuggestionsResponse;
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

  public GetInvoicesResponse SimulateAssessForPricingPlan (String userId, String discountCode, String planId) throws ApiException {
    // verify required params are set
    if(userId == null || discountCode == null || planId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/plans/{planId}/discounts/{discountCode}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "discountCode" + "}", String.valueOf(discountCode)).replace("{" + "planId" + "}", String.valueOf(planId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetInvoicesResponse) ApiInvoker.deserialize(response, "", GetInvoicesResponse.class);
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
  public GetInvoicesResponse SimulateAssessForPaymentPlan (String userId, String discountCode, String paymentPlanId) throws ApiException {
    // verify required params are set
    if(userId == null || discountCode == null || paymentPlanId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/paymentPlans/{paymentPlanId}/discounts/{discountCode}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "discountCode" + "}", String.valueOf(discountCode)).replace("{" + "paymentPlanId" + "}", String.valueOf(paymentPlanId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetInvoicesResponse) ApiInvoker.deserialize(response, "", GetInvoicesResponse.class);
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
  public GetPlanResponse GetUserPlan (String callerId) throws ApiException {
    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{callerId}/plan".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{callerId}/subscription".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
    // verify required params are set
    if(callerId == null || family == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{callerId}/plans/{family}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "family" + "}", String.valueOf(family));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
    // verify required params are set
    if(userId == null || productId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/subscriptions/{productId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "productId" + "}", String.valueOf(productId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
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
  public SetUserSubscriptionPlanResponse UpdateSubscriptionPlan (String userId, String productId, UpdateSubscriptionPlanInfo body) throws ApiException {
    // verify required params are set
    if(userId == null || productId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/subscriptions/{productId}".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "productId" + "}", String.valueOf(productId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "POST", queryParams, body, headerParams, String.class);
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
    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{callerId}/countries".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
    // verify required params are set
    if(callerId == null || countryName == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{callerId}/countries/{countryName}/states".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId)).replace("{" + "countryName" + "}", String.valueOf(countryName));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
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
  public GetBillingAddressResponse SetBillingAddress (String userId, BillingAddressInfo body) throws ApiException {
    // verify required params are set
    if(userId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/billingaddress".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "PUT", queryParams, body, headerParams, String.class);
      if(response != null){
        return (GetBillingAddressResponse) ApiInvoker.deserialize(response, "", GetBillingAddressResponse.class);
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
  public GetInvoicesResponse GetInvoices (String callerId, String pageNumber, Integer pageSize) throws ApiException {
    // verify required params are set
    if(callerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{callerId}/invoices?pageNumber={pageNumber}&pageSize={pageSize}".replace("*", "");
  	int pos = resourcePath.indexOf("?");
  	if(pos > -1){
  		resourcePath = resourcePath.substring(0, pos);
  	}
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "callerId" + "}", String.valueOf(callerId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(pageNumber)))
      queryParams.put("pageNumber", String.valueOf(pageNumber));
    if(!"null".equals(String.valueOf(pageSize)))
      queryParams.put("pageSize", String.valueOf(pageSize));
    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetInvoicesResponse) ApiInvoker.deserialize(response, "", GetInvoicesResponse.class);
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
  public GetSubscriptionPlanUsageResponse GetSubscriptionPlanUsage (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/usage".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetSubscriptionPlanUsageResponse) ApiInvoker.deserialize(response, "", GetSubscriptionPlanUsageResponse.class);
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
  public GetPurchaseWizardResponse GetPurchseWizardInfo (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/purchase/wizard".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetPurchaseWizardResponse) ApiInvoker.deserialize(response, "", GetPurchaseWizardResponse.class);
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
  public GetTermSuggestionsResponse GetTermSuggestions (String userId, String term) throws ApiException {
    // verify required params are set
    if(userId == null || term == null ) {
       throw new ApiException(400, "missing required params");
    }
    String resourcePath = "/system/{userId}/terms/{term}/suggestions".replace("*", "");
  	// create path and map variables
    resourcePath = resourcePath.replace("{format}","json").replace("{" + "userId" + "}", String.valueOf(userId)).replace("{" + "term" + "}", String.valueOf(term));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, resourcePath, "GET", queryParams, null, headerParams, String.class);
      if(response != null){
        return (GetTermSuggestionsResponse) ApiInvoker.deserialize(response, "", GetTermSuggestionsResponse.class);
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

