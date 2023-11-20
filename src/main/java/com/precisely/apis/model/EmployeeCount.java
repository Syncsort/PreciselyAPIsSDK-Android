/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EmployeeCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class EmployeeCount {
  public static final String SERIALIZED_NAME_IN_LOCAL_BRANCH = "inLocalBranch";
  @SerializedName(SERIALIZED_NAME_IN_LOCAL_BRANCH)
  private String inLocalBranch;

  public static final String SERIALIZED_NAME_IN_ORGANIZATION = "inOrganization";
  @SerializedName(SERIALIZED_NAME_IN_ORGANIZATION)
  private String inOrganization;

  public EmployeeCount() { 
  }

  public EmployeeCount inLocalBranch(String inLocalBranch) {
    
    this.inLocalBranch = inLocalBranch;
    return this;
  }

   /**
   * Get inLocalBranch
   * @return inLocalBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInLocalBranch() {
    return inLocalBranch;
  }


  public void setInLocalBranch(String inLocalBranch) {
    this.inLocalBranch = inLocalBranch;
  }


  public EmployeeCount inOrganization(String inOrganization) {
    
    this.inOrganization = inOrganization;
    return this;
  }

   /**
   * Get inOrganization
   * @return inOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInOrganization() {
    return inOrganization;
  }


  public void setInOrganization(String inOrganization) {
    this.inOrganization = inOrganization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeCount employeeCount = (EmployeeCount) o;
    return Objects.equals(this.inLocalBranch, employeeCount.inLocalBranch) &&
        Objects.equals(this.inOrganization, employeeCount.inOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inLocalBranch, inOrganization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCount {\n");
    sb.append("    inLocalBranch: ").append(toIndentedString(inLocalBranch)).append("\n");
    sb.append("    inOrganization: ").append(toIndentedString(inOrganization)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

