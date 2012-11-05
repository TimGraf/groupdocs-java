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
public class TestSystemApi extends AbstractIntegrationTest {
  
	@Test
	public void testGetUserPlan() throws ApiException {
	
  		String callerId = "";
		GetPlanResponse response = new SystemApi().GetUserPlan(callerId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetUserSubscriptionPlan() throws ApiException {
	
  		String callerId = "";
		GetUserSubscriptionPlanResponse response = new SystemApi().GetUserSubscriptionPlan(callerId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetSubscriptionPlans() throws ApiException {
	
  		String callerId = "";
		String family = "";
		GetSubscriptionPlansResponse response = new SystemApi().GetSubscriptionPlans(callerId, family);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testSetSubscriptionPlan() throws ApiException {
	
  		SubscriptionPlanInfo body = null;
		String userId = "";
		String productId = "";
		SetUserSubscriptionPlanResponse response = new SystemApi().SetSubscriptionPlan(body, userId, productId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetCountries() throws ApiException {
	
  		String callerId = "";
		GetCountriesResponse response = new SystemApi().GetCountries(callerId);
		assertThat(response, not(nullValue()));
		
	}
	
	@Test
	public void testGetStates() throws ApiException {
	
  		String callerId = "";
		String countryName = "";
		GetStatesResponse response = new SystemApi().GetStates(callerId, countryName);
		assertThat(response, not(nullValue()));
		
	}
	
	
}
