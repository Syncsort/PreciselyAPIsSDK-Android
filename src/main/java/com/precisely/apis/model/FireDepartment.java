/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.FireDepartmentContactDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FireDepartment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T15:06:57.026+05:30")
public class FireDepartment   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("numberOfStations")
  private Integer numberOfStations = null;

  @SerializedName("administrativeOfficeOnly")
  private Boolean administrativeOfficeOnly = false;

  @SerializedName("contactDetails")
  private FireDepartmentContactDetails contactDetails = null;

  public FireDepartment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FireDepartment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FireDepartment numberOfStations(Integer numberOfStations) {
    this.numberOfStations = numberOfStations;
    return this;
  }

   /**
   * Get numberOfStations
   * @return numberOfStations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumberOfStations() {
    return numberOfStations;
  }

  public void setNumberOfStations(Integer numberOfStations) {
    this.numberOfStations = numberOfStations;
  }

  public FireDepartment administrativeOfficeOnly(Boolean administrativeOfficeOnly) {
    this.administrativeOfficeOnly = administrativeOfficeOnly;
    return this;
  }

   /**
   * Get administrativeOfficeOnly
   * @return administrativeOfficeOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAdministrativeOfficeOnly() {
    return administrativeOfficeOnly;
  }

  public void setAdministrativeOfficeOnly(Boolean administrativeOfficeOnly) {
    this.administrativeOfficeOnly = administrativeOfficeOnly;
  }

  public FireDepartment contactDetails(FireDepartmentContactDetails contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public FireDepartmentContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(FireDepartmentContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireDepartment fireDepartment = (FireDepartment) o;
    return Objects.equals(this.name, fireDepartment.name) &&
        Objects.equals(this.type, fireDepartment.type) &&
        Objects.equals(this.numberOfStations, fireDepartment.numberOfStations) &&
        Objects.equals(this.administrativeOfficeOnly, fireDepartment.administrativeOfficeOnly) &&
        Objects.equals(this.contactDetails, fireDepartment.contactDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, numberOfStations, administrativeOfficeOnly, contactDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireDepartment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    numberOfStations: ").append(toIndentedString(numberOfStations)).append("\n");
    sb.append("    administrativeOfficeOnly: ").append(toIndentedString(administrativeOfficeOnly)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
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

