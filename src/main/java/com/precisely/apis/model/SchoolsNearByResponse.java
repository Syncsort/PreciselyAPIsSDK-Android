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
import com.precisely.apis.model.Address;
import com.precisely.apis.model.School;
import com.precisely.apis.model.SchoolDistrict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SchoolsNearByResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class SchoolsNearByResponse {
  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private Address matchedAddress;

  public static final String SERIALIZED_NAME_SCHOOL = "school";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private List<School> school = null;

  public static final String SERIALIZED_NAME_SCHOOL_DISTRICT = "schoolDistrict";
  @SerializedName(SERIALIZED_NAME_SCHOOL_DISTRICT)
  private SchoolDistrict schoolDistrict;

  public SchoolsNearByResponse() { 
  }

  public SchoolsNearByResponse matchedAddress(Address matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  public SchoolsNearByResponse school(List<School> school) {
    
    this.school = school;
    return this;
  }

  public SchoolsNearByResponse addSchoolItem(School schoolItem) {
    if (this.school == null) {
      this.school = new ArrayList<School>();
    }
    this.school.add(schoolItem);
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<School> getSchool() {
    return school;
  }


  public void setSchool(List<School> school) {
    this.school = school;
  }


  public SchoolsNearByResponse schoolDistrict(SchoolDistrict schoolDistrict) {
    
    this.schoolDistrict = schoolDistrict;
    return this;
  }

   /**
   * Get schoolDistrict
   * @return schoolDistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SchoolDistrict getSchoolDistrict() {
    return schoolDistrict;
  }


  public void setSchoolDistrict(SchoolDistrict schoolDistrict) {
    this.schoolDistrict = schoolDistrict;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolsNearByResponse schoolsNearByResponse = (SchoolsNearByResponse) o;
    return Objects.equals(this.matchedAddress, schoolsNearByResponse.matchedAddress) &&
        Objects.equals(this.school, schoolsNearByResponse.school) &&
        Objects.equals(this.schoolDistrict, schoolsNearByResponse.schoolDistrict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedAddress, school, schoolDistrict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolsNearByResponse {\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    schoolDistrict: ").append(toIndentedString(schoolDistrict)).append("\n");
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
