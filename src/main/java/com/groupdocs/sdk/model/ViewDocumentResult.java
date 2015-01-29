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
package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.Dimension;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ViewDocumentResult {
  private String name = null;
  private Integer version = null;
  private Integer page_count = null;
  private Dimension page_size = null;
  private String url = null;
  private String doc_type = null;
  private List<String> image_urls = new ArrayList<String>();
  private String token = null;
  private String pageHtml = null;
  private String pageCss = null;
  private String password = null;
  private Boolean lic = null;
  private String pdfPrintUrl = null;
  private String htmlPrintUrl = null;
  private String documentDescription = null;
  private Double id = null;
  private String guid = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getPage_count() {
    return page_count;
  }
  public void setPage_count(Integer page_count) {
    this.page_count = page_count;
  }

  public Dimension getPage_size() {
    return page_size;
  }
  public void setPage_size(Dimension page_size) {
    this.page_size = page_size;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public String getDoc_type() {
    return doc_type;
  }
  public void setDoc_type(String doc_type) {
    this.doc_type = doc_type;
  }

  public List<String> getImage_urls() {
    return image_urls;
  }
  public void setImage_urls(List<String> image_urls) {
    this.image_urls = image_urls;
  }

  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  public String getPageHtml() {
    return pageHtml;
  }
  public void setPageHtml(String pageHtml) {
    this.pageHtml = pageHtml;
  }

  public String getPageCss() {
    return pageCss;
  }
  public void setPageCss(String pageCss) {
    this.pageCss = pageCss;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getLic() {
    return lic;
  }
  public void setLic(Boolean lic) {
    this.lic = lic;
  }

  public String getPdfPrintUrl() {
    return pdfPrintUrl;
  }
  public void setPdfPrintUrl(String pdfPrintUrl) {
    this.pdfPrintUrl = pdfPrintUrl;
  }

  public String getHtmlPrintUrl() {
    return htmlPrintUrl;
  }
  public void setHtmlPrintUrl(String htmlPrintUrl) {
    this.htmlPrintUrl = htmlPrintUrl;
  }

  public String getDocumentDescription() {
    return documentDescription;
  }
  public void setDocumentDescription(String documentDescription) {
    this.documentDescription = documentDescription;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewDocumentResult {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  page_count: ").append(page_count).append("\n");
    sb.append("  page_size: ").append(page_size).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  doc_type: ").append(doc_type).append("\n");
    sb.append("  image_urls: ").append(image_urls).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  pageHtml: ").append(pageHtml).append("\n");
    sb.append("  pageCss: ").append(pageCss).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  lic: ").append(lic).append("\n");
    sb.append("  pdfPrintUrl: ").append(pdfPrintUrl).append("\n");
    sb.append("  htmlPrintUrl: ").append(htmlPrintUrl).append("\n");
    sb.append("  documentDescription: ").append(documentDescription).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

