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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SchoolDistrict
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class SchoolDistrict {
  public static final String SERIALIZED_NAME_NCES_DISTRICT_ID = "ncesDistrictId";
  @SerializedName(SERIALIZED_NAME_NCES_DISTRICT_ID)
  private String ncesDistrictId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOTAL_SCHOOLS = "totalSchools";
  @SerializedName(SERIALIZED_NAME_TOTAL_SCHOOLS)
  private String totalSchools;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "districtType";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private String districtType;

  public static final String SERIALIZED_NAME_METRO = "metro";
  @SerializedName(SERIALIZED_NAME_METRO)
  private String metro;

  public static final String SERIALIZED_NAME_AREA_IN_SQ_M = "areaInSqM";
  @SerializedName(SERIALIZED_NAME_AREA_IN_SQ_M)
  private String areaInSqM;

  public static final String SERIALIZED_NAME_SUPERVISORY_UNION_ID = "supervisoryUnionId";
  @SerializedName(SERIALIZED_NAME_SUPERVISORY_UNION_ID)
  private String supervisoryUnionId;

  public static final String SERIALIZED_NAME_DISTRICT_ENROLLMENT = "districtEnrollment";
  @SerializedName(SERIALIZED_NAME_DISTRICT_ENROLLMENT)
  private String districtEnrollment;

  public static final String SERIALIZED_NAME_DISTRICT_URL = "districtUrl";
  @SerializedName(SERIALIZED_NAME_DISTRICT_URL)
  private String districtUrl;

  public SchoolDistrict() { 
  }

  public SchoolDistrict ncesDistrictId(String ncesDistrictId) {
    
    this.ncesDistrictId = ncesDistrictId;
    return this;
  }

   /**
   * Get ncesDistrictId
   * @return ncesDistrictId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNcesDistrictId() {
    return ncesDistrictId;
  }


  public void setNcesDistrictId(String ncesDistrictId) {
    this.ncesDistrictId = ncesDistrictId;
  }


  public SchoolDistrict name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SchoolDistrict totalSchools(String totalSchools) {
    
    this.totalSchools = totalSchools;
    return this;
  }

   /**
   * Get totalSchools
   * @return totalSchools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalSchools() {
    return totalSchools;
  }


  public void setTotalSchools(String totalSchools) {
    this.totalSchools = totalSchools;
  }


  public SchoolDistrict districtType(String districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictType() {
    return districtType;
  }


  public void setDistrictType(String districtType) {
    this.districtType = districtType;
  }


  public SchoolDistrict metro(String metro) {
    
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMetro() {
    return metro;
  }


  public void setMetro(String metro) {
    this.metro = metro;
  }


  public SchoolDistrict areaInSqM(String areaInSqM) {
    
    this.areaInSqM = areaInSqM;
    return this;
  }

   /**
   * Get areaInSqM
   * @return areaInSqM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaInSqM() {
    return areaInSqM;
  }


  public void setAreaInSqM(String areaInSqM) {
    this.areaInSqM = areaInSqM;
  }


  public SchoolDistrict supervisoryUnionId(String supervisoryUnionId) {
    
    this.supervisoryUnionId = supervisoryUnionId;
    return this;
  }

   /**
   * Get supervisoryUnionId
   * @return supervisoryUnionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSupervisoryUnionId() {
    return supervisoryUnionId;
  }


  public void setSupervisoryUnionId(String supervisoryUnionId) {
    this.supervisoryUnionId = supervisoryUnionId;
  }


  public SchoolDistrict districtEnrollment(String districtEnrollment) {
    
    this.districtEnrollment = districtEnrollment;
    return this;
  }

   /**
   * Get districtEnrollment
   * @return districtEnrollment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictEnrollment() {
    return districtEnrollment;
  }


  public void setDistrictEnrollment(String districtEnrollment) {
    this.districtEnrollment = districtEnrollment;
  }


  public SchoolDistrict districtUrl(String districtUrl) {
    
    this.districtUrl = districtUrl;
    return this;
  }

   /**
   * Get districtUrl
   * @return districtUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictUrl() {
    return districtUrl;
  }


  public void setDistrictUrl(String districtUrl) {
    this.districtUrl = districtUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolDistrict schoolDistrict = (SchoolDistrict) o;
    return Objects.equals(this.ncesDistrictId, schoolDistrict.ncesDistrictId) &&
        Objects.equals(this.name, schoolDistrict.name) &&
        Objects.equals(this.totalSchools, schoolDistrict.totalSchools) &&
        Objects.equals(this.districtType, schoolDistrict.districtType) &&
        Objects.equals(this.metro, schoolDistrict.metro) &&
        Objects.equals(this.areaInSqM, schoolDistrict.areaInSqM) &&
        Objects.equals(this.supervisoryUnionId, schoolDistrict.supervisoryUnionId) &&
        Objects.equals(this.districtEnrollment, schoolDistrict.districtEnrollment) &&
        Objects.equals(this.districtUrl, schoolDistrict.districtUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ncesDistrictId, name, totalSchools, districtType, metro, areaInSqM, supervisoryUnionId, districtEnrollment, districtUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolDistrict {\n");
    sb.append("    ncesDistrictId: ").append(toIndentedString(ncesDistrictId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalSchools: ").append(toIndentedString(totalSchools)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    areaInSqM: ").append(toIndentedString(areaInSqM)).append("\n");
    sb.append("    supervisoryUnionId: ").append(toIndentedString(supervisoryUnionId)).append("\n");
    sb.append("    districtEnrollment: ").append(toIndentedString(districtEnrollment)).append("\n");
    sb.append("    districtUrl: ").append(toIndentedString(districtUrl)).append("\n");
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
