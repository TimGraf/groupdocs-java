package com.groupdocs.sdk.samples;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.groupdocs.sdk.api.AntApi;
import com.groupdocs.sdk.api.StorageApi;
import com.groupdocs.sdk.common.ApiInvoker;
import com.groupdocs.sdk.common.GroupDocsRequestSigner;
import com.groupdocs.sdk.model.AddReplyResponse;
import com.groupdocs.sdk.model.AnnotationInfo;
import com.groupdocs.sdk.model.AnnotationReplyInfo;
import com.groupdocs.sdk.model.CreateAnnotationResponse;
import com.groupdocs.sdk.model.EditReplyResponse;
import com.groupdocs.sdk.model.ListAnnotationsResponse;
import com.groupdocs.sdk.model.ListRepliesResponse;
import com.groupdocs.sdk.model.Rectangle;
import com.groupdocs.sdk.model.ReviewerInfo;
import com.groupdocs.sdk.model.SetCollaboratorsResponse;
import com.groupdocs.sdk.model.SetDocumentRightsResponse;
import com.groupdocs.sdk.model.UploadResponse;

public class Examples {
	static String privateKey = "8d8a7d642a807a31c2741c101a60cef2"; // dev:8d8a7d642a807a31c2741c101a60cef2 prod:6fee5f4fc3dd52049cb20367c45cfeca
	static String userId = "2721ad21bcf0d71e"; // dev:2721ad21bcf0d71e prod:e50280a09d8188e3 
	static String fileId = "a532d40b1d0ed07f3b16050fb2ca83b218e3cc1b44b8a53a8aaea38e5c8c9985"; // dev:a532d40b1d0ed07f3b16050fb2ca83b218e3cc1b44b8a53a8aaea38e5c8c9985 prod:a8e39117127960d4eb4bb4294a5ca773e44f5e03c5328facda5051fcd85a31e0
	static String apiServer = "https://dev-api.groupdocs.com/v2.0"; //https://dev-api.groupdocs.com/v2.0
	public static ObjectMapper mapper = new ObjectMapper();
	private static final AntApi api = new AntApi();
	static {
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		api.setBasePath(apiServer);
		ApiInvoker.getInstance().setRequestSigner(
				new GroupDocsRequestSigner(privateKey));
	}

	public static void main(String[] args) throws Exception {
//		createAnnotation();
//		listAnnotations();
//		listAnnotationReplies();
//		 uploadFile();
//		createAnnotationReply();
//		editAnnotationReply();
//		getFile();
//		setAnnotationCollaborators();
		setReviewerRights();
	}

	// multipart file upload
	private static void uploadFile() throws Exception {
		InputStream stream = Examples.class.getClassLoader()
				.getResourceAsStream("com/groupdocs/sdk/samples/test.docx");
		StorageApi api = new StorageApi();
		api.setBasePath(apiServer);
		UploadResponse response = api.Upload(userId, "test.docx",
				"alpha123 ; , / ? : @ & = + $", stream);
		System.out.println(mapper.writeValueAsString(response));
	}

	// GET
	private static void listAnnotations() throws Exception {
		ListAnnotationsResponse response = api.ListAnnotations(userId,
				fileId);
		System.out.println(mapper.writeValueAsString(response));
	}

	private static void listAnnotationReplies() throws Exception {
		String annotationId = "8f8cc25250066a77";
		ListRepliesResponse response = api.ListAnnotationReplies(userId, annotationId, 10L);
		System.out.println(mapper.writeValueAsString(response));
	}

	private static void getFile() throws Exception {
		String response = new StorageApi().GetFile(userId, fileId);
//		System.out.println(mapper.writeValueAsString(response));
	}

	// POST
	private static void createAnnotation() throws Exception {
		AnnotationInfo annotation = new AnnotationInfo();
		Rectangle box = new Rectangle();
		box.setHeight(100d);
		box.setWidth(100d);
		box.setX(100d);
		box.setY(100d);
		AnnotationReplyInfo reply = new AnnotationReplyInfo();
		reply.setText("first message");
		AnnotationReplyInfo reply2 = new AnnotationReplyInfo();
		reply2.setText("second message");
		annotation.setType("Text");
		annotation.setBox(box);
		annotation.setReplies(Arrays.asList(new AnnotationReplyInfo[] { reply, reply2 }));

		CreateAnnotationResponse response = api.CreateAnnotation(
				userId, fileId, annotation);
		System.out.println(mapper.writeValueAsString(response));
	}
	
	private static void createAnnotationReply() throws Exception {
		String msg = "test message from java client library";

		String parentReplyGuid = "6a215585";
		String annotationId = "8f8cc25250066a77";
		AnnotationReplyInfo reply = new AnnotationReplyInfo();
		reply.setText(msg);
		reply.setParentReplyGuid(parentReplyGuid);
//		reply.setGuid(annotationId);
		AddReplyResponse response = api.CreateAnnotationReply(userId, annotationId, reply);
		System.out.println(mapper.writeValueAsString(response));
	}
	
	private static void editAnnotationReply() throws Exception {
		String msg = "updated message from java client library";
		String replyGuid = "6a215585";
		EditReplyResponse response = api.EditAnnotationReply(userId, replyGuid, msg);
		System.out.println(mapper.writeValueAsString(response));
	}
	
	private static void setAnnotationCollaborators() throws Exception {
		String version = "1";
		List<String> collaborators = Arrays.asList("test1@gmail.com", "test2@gmail.com");
		SetCollaboratorsResponse response = api.SetAnnotationCollaborators(userId, fileId, version, collaborators);
		System.out.println(mapper.writeValueAsString(response));
	}
	
	private static void setReviewerRights() throws Exception {
		ReviewerInfo rev1 = new ReviewerInfo();
		rev1.setAccess_rights(1);
		rev1.setId(1232d);
		ReviewerInfo rev2 = new ReviewerInfo();
		rev2.setAccess_rights(0);
		rev2.setId(1233d);
		List<ReviewerInfo> collaborators = Arrays.asList(rev1, rev2);
		SetDocumentRightsResponse response = api.SetReviewerRights(userId, fileId, collaborators);
		System.out.println(mapper.writeValueAsString(response));
	}
	
}
