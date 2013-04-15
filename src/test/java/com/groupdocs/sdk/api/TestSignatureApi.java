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
import org.junit.internal.runners.statements.Fail;

import java.util.*;

import junit.framework.Assert;

@Category(IntegrationTest.class)
public class TestSignatureApi extends AbstractIntegrationTest {
  
	@Test
	public void testGetContacts() throws ApiException {
	
  		String userId = AbstractIntegrationTest.userId;
		String page = null;
		String firstName = null;
		String lastName = null;
		String email = null;
		String records = null;
		try {
			new SignatureApi().GetContacts(userId, page, firstName, lastName, email, records);
			Assert.fail();
		}
		catch (ApiException e) {
			assertThat(e.getCode(), is(401));
		}
	}
	
	
}
