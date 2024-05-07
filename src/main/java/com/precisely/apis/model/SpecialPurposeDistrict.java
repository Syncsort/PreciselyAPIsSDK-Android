/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.1.0
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
 * SpecialPurposeDistrict
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class SpecialPurposeDistrict {
  public static final String SERIALIZED_NAME_DISTRICT_NAME = "districtName";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "districtCode";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_DISTRICT_NUMBER = "districtNumber";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NUMBER)
  private String districtNumber;

  public static final String SERIALIZED_NAME_VERSION_DATE = "versionDate";
  @SerializedName(SERIALIZED_NAME_VERSION_DATE)
  private String versionDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  public static final String SERIALIZED_NAME_COMPILED_DATE = "compiledDate";
  @SerializedName(SERIALIZED_NAME_COMPILED_DATE)
  private String compiledDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private String updateDate;

  public SpecialPurposeDistrict() { 
  }

  public SpecialPurposeDistrict districtName(String districtName) {
    
    this.districtName = districtName;
    return this;
  }

   /**
   * Get districtName
   * @return districtName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictName() {
    return districtName;
  }


  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }


  public SpecialPurposeDistrict districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * Get districtCode
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public SpecialPurposeDistrict districtNumber(String districtNumber) {
    
    this.districtNumber = districtNumber;
    return this;
  }

   /**
   * Get districtNumber
   * @return districtNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictNumber() {
    return districtNumber;
  }


  public void setDistrictNumber(String districtNumber) {
    this.districtNumber = districtNumber;
  }


  public SpecialPurposeDistrict versionDate(String versionDate) {
    
    this.versionDate = versionDate;
    return this;
  }

   /**
   * Get versionDate
   * @return versionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionDate() {
    return versionDate;
  }


  public void setVersionDate(String versionDate) {
    this.versionDate = versionDate;
  }


  public SpecialPurposeDistrict effectiveDate(String effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public SpecialPurposeDistrict compiledDate(String compiledDate) {
    
    this.compiledDate = compiledDate;
    return this;
  }

   /**
   * Get compiledDate
   * @return compiledDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompiledDate() {
    return compiledDate;
  }


  public void setCompiledDate(String compiledDate) {
    this.compiledDate = compiledDate;
  }


  public SpecialPurposeDistrict updateDate(String updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateDate() {
    return updateDate;
  }


  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialPurposeDistrict specialPurposeDistrict = (SpecialPurposeDistrict) o;
    return Objects.equals(this.districtName, specialPurposeDistrict.districtName) &&
        Objects.equals(this.districtCode, specialPurposeDistrict.districtCode) &&
        Objects.equals(this.districtNumber, specialPurposeDistrict.districtNumber) &&
        Objects.equals(this.versionDate, specialPurposeDistrict.versionDate) &&
        Objects.equals(this.effectiveDate, specialPurposeDistrict.effectiveDate) &&
        Objects.equals(this.compiledDate, specialPurposeDistrict.compiledDate) &&
        Objects.equals(this.updateDate, specialPurposeDistrict.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtName, districtCode, districtNumber, versionDate, effectiveDate, compiledDate, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialPurposeDistrict {\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    districtNumber: ").append(toIndentedString(districtNumber)).append("\n");
    sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    compiledDate: ").append(toIndentedString(compiledDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

