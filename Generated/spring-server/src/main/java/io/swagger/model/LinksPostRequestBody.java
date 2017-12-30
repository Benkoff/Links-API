package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A JSON object containing link&#x60;s information, has no ID before it&#x60;s saved, every just saved link is active by default -&gt; no id &amp; active fields
 */
@ApiModel(description = "A JSON object containing link`s information, has no ID before it`s saved, every just saved link is active by default -> no id & active fields")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-30T06:46:06.357Z")

public class LinksPostRequestBody   {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("reference")
  private String reference = null;

  public LinksPostRequestBody user(String user) {
    this.user = user;
    return this;
  }

   /**
   * the user which saved the link
   * @return user
  **/
  @ApiModelProperty(value = "the user which saved the link")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public LinksPostRequestBody url(String url) {
    this.url = url;
    return this;
  }

   /**
   * the link been saved before
   * @return url
  **/
  @ApiModelProperty(value = "the link been saved before")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LinksPostRequestBody label(String label) {
    this.label = label;
    return this;
  }

   /**
   * a label given by user
   * @return label
  **/
  @ApiModelProperty(value = "a label given by user")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LinksPostRequestBody reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * a reference assigned by user
   * @return reference
  **/
  @ApiModelProperty(value = "a reference assigned by user")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksPostRequestBody linksPostRequestBody = (LinksPostRequestBody) o;
    return Objects.equals(this.user, linksPostRequestBody.user) &&
        Objects.equals(this.url, linksPostRequestBody.url) &&
        Objects.equals(this.label, linksPostRequestBody.label) &&
        Objects.equals(this.reference, linksPostRequestBody.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, url, label, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksPostRequestBody {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

