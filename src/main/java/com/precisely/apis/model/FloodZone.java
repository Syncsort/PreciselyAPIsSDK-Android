/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.BaseFloodElevation;
import com.precisely.apis.model.PrimaryZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FloodZone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class FloodZone {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_AREA_TYPE = "areaType";
  @SerializedName(SERIALIZED_NAME_AREA_TYPE)
  private String areaType;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "riskLevel";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_PRIMARY_ZONE = "primaryZone";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ZONE)
  private PrimaryZone primaryZone;

  public static final String SERIALIZED_NAME_BASE_FLOOD_ELEVATION = "baseFloodElevation";
  @SerializedName(SERIALIZED_NAME_BASE_FLOOD_ELEVATION)
  private BaseFloodElevation baseFloodElevation;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public FloodZone() { 
  }

  public FloodZone code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
