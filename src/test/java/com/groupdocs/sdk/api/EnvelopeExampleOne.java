package com.groupdocs.sdk.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.IOUtils;

import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.common.FileStream;
import com.groupdocs.sdk.common.GroupDocsRequestSigner;
import com.groupdocs.sdk.model.SignatureEnvelopeDocumentResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldSettings;
import com.groupdocs.sdk.model.SignatureEnvelopeResponse;
import com.groupdocs.sdk.model.SignatureEnvelopeSettings;
import com.groupdocs.sdk.model.SignatureFieldInfo;
import com.groupdocs.sdk.model.SignatureRoleInfo;

import com.sun.net.httpserver.*;

public class EnvelopeExampleOne {
	static String userId = "2721ad21bcf0d71e";
	static String apiKey = "8d8a7d642a807a31c2741c101a60cef2";
	
	public static void main(String[] args) throws Exception {
		ApiInvoker.getInstance().setDebug(true);
		ApiInvoker.getInstance().setRequestSigner(
				new GroupDocsRequestSigner(apiKey));

		final SignatureApi api = new SignatureApi();
		api.setBasePath("https://dev-api.groupdocs.com/v2.0");
		
		//upload document
//		String filename = "interactiveform_enabled.pdf";
//		InputStream is = EnvelopeExampleOne.class.getClassLoader()
//				.getResourceAsStream(filename);
		File file = new File("/home/zhaidarbek/workspace/groupdocs/java/groupdocs-java/src/test/resources/GroupDocs_Signature_Demo.pdf");
		InputStream is = new FileInputStream(file);
		StorageApi storageApi = new StorageApi();
		storageApi.setBasePath("https://dev-api.groupdocs.com/v2.0");
		String documentId = storageApi.Upload(userId, "samples/signature/" + file.getName(), null, new FileStream(is)).getResult().getGuid();
		IOUtils.closeQuietly(is);
		
		//create envelope
		SignatureEnvelopeSettings env = new SignatureEnvelopeSettings();
		env.setEmailSubject("Sing this!");
		SignatureEnvelopeResponse envelopeResponse = api.CreateSignatureEnvelope(userId, "SampleEnvelope_" + UUID.randomUUID(), env, null, null);
		
		//add document to envelope
		final String envelopeId = envelopeResponse.getResult().getEnvelope().getId();
		SignatureEnvelopeDocumentResponse envelopeDocument = api.AddSignatureEnvelopeDocument(userId, envelopeId, documentId, null);
		
		//update document object after it's created
		documentId = envelopeDocument.getResult().getDocument().getDocumentId();
		
		//add new recipient to envelope
		String roleId = null;
		List<SignatureRoleInfo> roles = api.GetRolesList(userId, null).getResult().getRoles();
		for(SignatureRoleInfo role : roles){
			if(role.getName().equalsIgnoreCase("Signer")){
				roleId = role.getId();
			}
		}
		String recipientId = api.AddSignatureEnvelopeRecipient(userId, envelopeId, "jake.ayazbayev@gmail.com", "Jake", "Ayazbayev", null, roleId).getResult().getRecipient().getId();
		
		//add city field to envelope
		String fieldId = null;
		List<SignatureFieldInfo> fields = api.GetFieldsList(userId, null).getResult().getFields();
		for(SignatureFieldInfo field : fields){
			System.out.println(field);
			if(field.getFieldType() == 2){ // single line, see http://scotland.groupdocs.com/wiki/display/SDS/field.type
				fieldId = field.getId();
			}
		}
		SignatureEnvelopeFieldSettings envField = new SignatureEnvelopeFieldSettings();
		envField.setName("City");
		envField.setLocationX(0.3);
		envField.setLocationY(0.2);
		envField.setPage(1);
		api.AddSignatureEnvelopeField(userId, envelopeId, documentId, recipientId, fieldId, envField);
		
		//add signature field to envelope
		fieldId = null;
		envField = new SignatureEnvelopeFieldSettings();
		for(SignatureFieldInfo field : fields){
			if(field.getFieldType() == 1){ // signature, see http://scotland.groupdocs.com/wiki/display/SDS/field.type
				fieldId = field.getId();
			}
		}
		envField.setLocationX(0.3);
		envField.setLocationY(0.3);
		envField.setPage(1);
		api.AddSignatureEnvelopeField(userId, envelopeId, documentId, recipientId, fieldId, envField);
		
		// start server to handle webhook 
//		startHttpServerForWebhook(new HttpHandler(){
//			@Override
//			public void handle(HttpExchange exchange) throws IOException {
//				System.out.println("Received webhook via " + exchange.getRequestMethod());
//				InputStream is = exchange.getRequestBody();
//				if(is != null){
//					String reqBody = IOUtils.toString(is);
//					System.out.println("Request Body: " + reqBody);
//					IOUtils.closeQuietly(is);
//				}
//				
////				try{
////					//download signed documents as archive
////					FileStream zip = api.GetSignedEnvelopeDocuments(userId, envelopeId);
////					FileOutputStream fos = new FileOutputStream(zip.getFileName());
////					IOUtils.copy(zip.getInputStream(), fos);
////					IOUtils.closeQuietly(fos);
////					
////					//archive envelope
////					api.ArchiveSignatureEnvelope(userId, envelopeId);
////				} catch(Exception e){
////					e.printStackTrace();
////				}
//			}
//		});
		
		//send envelope
		FileStream stream = new FileStream(IOUtils.toInputStream("jake.dyndns.biz:8080/comparisonCallbackHandler"));
		api.SignatureEnvelopeSend(userId, envelopeId, stream); //"jake.dyndns.biz:8080/comparisonCallbackHandler");
		
		//construct embedded signature url
		String url = "https://dev-apps.groupdocs.com/signature/sign/" + envelopeId;
		System.out.println("Please go to " + url + " and sign the envelope. Waiting for you...");
	
//		commented because polling is not recommended, use webhook instead
//		
//		//there we wait for document to be signed
//		//assuming it's signed, we can proceed
//		SignatureEnvelopeInfo signedEnvelope = null;
//		do {
//			SignatureEnvelopeResponse response = api.GetSignatureEnvelope(userId, envelopeId);
//			if(response != null && response.getResult() != null){
//				signedEnvelope = response.getResult().getEnvelope();
//			}
//		} while(signedEnvelope == null || signedEnvelope.getStatus() == 5); // completed, see http://scotland.groupdocs.com/wiki/display/SDS/envelope.status
		
	}

	private static void startHttpServerForWebhook(HttpHandler callbackHandler) throws IOException {
		InetSocketAddress address = new InetSocketAddress(8080);
		HttpServer server = HttpServer.create(address, 10);
		server.createContext("/callbackHandler", callbackHandler);
		server.start();
	}

}
