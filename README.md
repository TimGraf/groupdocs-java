GroupDocs Java SDK [![Build Status](https://secure.travis-ci.org/groupdocs/groupdocs-java.png)](http://travis-ci.org/groupdocs/groupdocs-java)
=============

Latest SDK version 1.7.0.

## Requirements

* SDK requires Maven 2.2.0 (or later).

## Installation

You can use [Maven](http://maven.apache.org/) to download and use SDK as well as its dependencies.
GroupDocs Java SDK is now in Maven Central. To use SDK in your own project just add the following to your `pom.xml`

	<dependency>
		<groupId>com.groupdocs</groupId>
		<artifactId>groupdocs-java-client</artifactId>
		<version>1.7.0</version>
	</dependency>

### Usage Example
	ApiInvoker.getInstance().setRequestSigner(new GroupDocsRequestSigner(privateKey));
	AntApi api = new AntApi();
	ListAnnotationsResponse response = api.ListAnnotations(userId, fileId);

### Samples
To see SDK in action go to [https://github.com/groupdocs/groupdocs-java-samples](https://github.com/groupdocs/groupdocs-java-samples)


###[Sign, Manage, Annotate, Assemble, Compare and Convert Documents with GroupDocs](http://groupdocs.com)
1. [Sign documents online with GroupDocs Signature](http://groupdocs.com/apps/signature)
2. [PDF, Word and Image Annotation with GroupDocs Annotation](http://groupdocs.com/apps/annotation)
3. [Online DOC, DOCX, PPT Document Comparison with GroupDocs Comparison](http://groupdocs.com/apps/comparison)
4. [Online Document Management with GroupDocs Dashboard](http://groupdocs.com/apps/dashboard)
5. [Doc to PDF, Doc to Docx, PPT to PDF, and other Document Conversions with GroupDocs Viewer](http://groupdocs.com/apps/viewer)
6. [Online Document Automation with GroupDocs Assembly](http://groupdocs.com/apps/assembly)

License
-------

	Copyright 2012 GroupDocs.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
