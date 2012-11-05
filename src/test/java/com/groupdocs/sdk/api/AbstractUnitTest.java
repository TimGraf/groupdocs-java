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

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.BeforeClass;

import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.common.GroupDocsRequestSigner;
import com.groupdocs.sdk.common.RequestSigner;


public abstract class AbstractUnitTest {
	public static String API_SERVER;
	public static SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("ddMMyyyy");
	private static final Boolean enableLogging;
	protected static RequestSigner signer;
	protected static String userId;
	
	static {
		String apiServer = System.getProperty("apiServer", "https://api.groupdocs.com/v2.0");
		if(apiServer.endsWith("/")){
			API_SERVER = apiServer.substring(0, apiServer.length() - 1);
		} else {
			API_SERVER = apiServer;
		}
		String clientKey = System.getProperty("clientKey", "2721ad21bcf0d71e");
		String privateKey = System.getProperty("privateKey", "8d8a7d642a807a31c2741c101a60cef2");
		signer = new GroupDocsRequestSigner(privateKey);
		ApiInvoker.getInstance().setRequestSigner(signer);
		userId = clientKey;
		enableLogging = Boolean.valueOf(System.getProperty("enableLogging", "true"));
	}

	public static void log(Object msg){
		if(enableLogging){
			System.out.println(msg);
		}
	}
	
	public static String getSampleResponse(String fileName) throws Exception {
		URL resource = AbstractUnitTest.class.getClassLoader().getResource(fileName);
		File jsonFile = new File(resource.toURI());
		return FileUtils.readFileToString(jsonFile);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}
	

}

