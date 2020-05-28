/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Sic
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class Sic   {
  @SerializedName("businessLine")
  private String businessLine = null;

  @SerializedName("sicCode")
  private String sicCode = null;

  @SerializedName("sicCodeDescription")
  private String sicCodeDescription = null;

  @SerializedName("primarySicCode")
  private String primarySicCode = null;

  @SerializedName("secondarySicCode")
  private String secondarySicCode = null;

  public Sic businessLine(String businessLine) {
    this.businessLine = businessLine;
    return this;
  }

   /**
   * Get businessLine
   * @return businessLine
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBusinessLine() {
    return businessLine;
  }

  public void setBusinessLine(String businessLine) {
    this.businessLine = businessLine;
  }

  public Sic sicCode(String sicCode) {
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Get sicCode
   * @return sicCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSicCode() {
    return sicCode;
  }

  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }

  public Sic sicCodeDescription(String sicCodeDescription) {
    this.sicCodeDescription = sicCodeDescription;
    return this;
  }

   /**
   * Get sicCodeDescription
   * @return sicCodeDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSicCodeDescription() {
    return sicCodeDescription;
  }

  public void setSicCodeDescription(String sicCodeDescription) {
    this.sicCodeDescription = sicCodeDescription;
  }

  public Sic primarySicCode(String primarySicCode) {
    this.primarySicCode = primarySicCode;
    return this;
  }

   /**
   * Get primarySicCode
   * @return primarySicCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrimarySicCode() {
    return primarySicCode;
  }

  public void setPrimarySicCode(String primarySicCode) {
    this.primarySicCode = primarySicCode;
  }

  public Sic secondarySicCode(String secondarySicCode) {
    this.secondarySicCode = secondarySicCode;
    return this;
  }

   /**
   * Get secondarySicCode
   * @return secondarySicCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSecondarySicCode() {
    return secondarySicCode;
  }

  public void setSecondarySicCode(String secondarySicCode) {
    this.secondarySicCode = secondarySicCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sic sic = (Sic) o;
    return Objects.equals(this.businessLine, sic.businessLine) &&
        Objects.equals(this.sicCode, sic.sicCode) &&
        Objects.equals(this.sicCodeDescription, sic.sicCodeDescription) &&
        Objects.equals(this.primarySicCode, sic.primarySicCode) &&
        Objects.equals(this.secondarySicCode, sic.secondarySicCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLine, sicCode, sicCodeDescription, primarySicCode, secondarySicCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sic {\n");
    
    sb.append("    businessLine: ").append(toIndentedString(businessLine)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    sicCodeDescription: ").append(toIndentedString(sicCodeDescription)).append("\n");
    sb.append("    primarySicCode: ").append(toIndentedString(primarySicCode)).append("\n");
    sb.append("    secondarySicCode: ").append(toIndentedString(secondarySicCode)).append("\n");
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

