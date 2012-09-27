package com.groupdocs.demo.annotation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupdocs.sdk.java.api.AntAPI;
import com.groupdocs.sdk.java.model.AnnotationInfo;
import com.groupdocs.sdk.java.model.AnnotationReplyInfo;
import com.groupdocs.sdk.java.model.ListAnnotationsResponse;
import com.wordnik.swagger.runtime.common.APIInvoker;
import com.wordnik.swagger.runtime.common.GroupDocsUrlSigningSecurityHandler;
import com.wordnik.swagger.runtime.exception.APIException;

@WebServlet("/annotation")
public class AnnotationServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String guid = (String) session.getAttribute("fileGuid");
		String clientId = (String) session.getAttribute("clientId");
		String privateKey = (String) session.getAttribute("privateKey");
		
		log("session params: clientId=" + clientId + ", privateKey: " + privateKey + ", guid=" + guid);
		
		APIInvoker apiInvoker = APIInvoker.initialize(new GroupDocsUrlSigningSecurityHandler(privateKey), UploadServlet.apiServer, true);
		AntAPI.setApiInvoker(apiInvoker);
		StringBuilder str = new StringBuilder();
		try {
			ListAnnotationsResponse annotations = AntAPI.ListAnnotations(clientId, guid);
			for (AnnotationInfo ant : annotations.getResult().getAnnotations()) {
				List<String> replies = new ArrayList<String>();
				for (AnnotationReplyInfo reply : ant.getReplies()){
					replies.add(reply.getUserName() + ": " + reply.getText());
				}
				str.append("Annotation Type: ").append(ant.getType()).append(" -- Replies: ").append(replies).append("<br/>");
			}
		} catch (APIException e) {
			e.printStackTrace();
		}
		log(str.toString());
		response.getWriter().print(str);
	}
	
}
