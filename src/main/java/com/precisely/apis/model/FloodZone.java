/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.0
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
import com.precisely.apis.model.BaseFloodElevation;
import com.precisely.apis.model.PrimaryZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FloodZone
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-29T16:11:29.305+05:30")
public class FloodZone   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("areaType")
  private String areaType = null;

  @SerializedName("riskLevel")
  private String riskLevel = null;

  @SerializedName("primaryZone")
  private PrimaryZone primaryZone = null;

  @SerializedName("baseFloodElevation")
  private BaseFloodElevation baseFloodElevation = null;

  @SerializedName("additionalInfo")
  private String additionalInfo = null;

  public FloodZone code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public FloodZone areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Get areaType
   * @return areaType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public FloodZone riskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }

  public FloodZone primaryZone(PrimaryZone primaryZone) {
    this.primaryZone = primaryZone;
    return this;
  }

   /**
   * Get primaryZone
   * @return primaryZone
  **/
  @ApiModelProperty(example = "null", value = "")
  public PrimaryZone getPrimaryZone() {
    return primaryZone;
  }

  public void setPrimaryZone(PrimaryZone primaryZone) {
    this.primaryZone = primaryZone;
  }

  public FloodZone baseFloodElevation(BaseFloodElevation baseFloodElevation) {
    this.baseFloodElevation = baseFloodElevation;
    return this;
  }

   /**
   * Get baseFloodElevation
   * @return baseFloodElevation
  **/
  @ApiModelProperty(example = "null", value = "")
  public BaseFloodElevation getBaseFloodElevation() {
    return baseFloodElevation;
  }

  public void setBaseFloodElevation(BaseFloodElevation baseFloodElevation) {
    this.baseFloodElevation = baseFloodElevation;
  }

  public FloodZone additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodZone floodZone = (FloodZone) o;
    return Objects.equals(this.code, floodZone.code) &&
        Objects.equals(this.areaType, floodZone.areaType) &&
        Objects.equals(this.riskLevel, floodZone.riskLevel) &&
        Objects.equals(this.primaryZone, floodZone.primaryZone) &&
        Objects.equals(this.baseFloodElevation, floodZone.baseFloodElevation) &&
        Objects.equals(this.additionalInfo, floodZone.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, areaType, riskLevel, primaryZone, baseFloodElevation, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodZone {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    primaryZone: ").append(toIndentedString(primaryZone)).append("\n");
    sb.append("    baseFloodElevation: ").append(toIndentedString(baseFloodElevation)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

