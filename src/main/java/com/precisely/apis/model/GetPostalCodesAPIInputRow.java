/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.0
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
import com.precisely.apis.model.GetPostalCodesAPIOutputUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetPostalCodesAPIInputRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class GetPostalCodesAPIInputRow {
  public static final String SERIALIZED_NAME_USER_FIELDS = "user_fields";
  @SerializedName(SERIALIZED_NAME_USER_FIELDS)
  private List<GetPostalCodesAPIOutputUserFields> userFields = null;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "StateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public GetPostalCodesAPIInputRow() { 
  }

  public GetPostalCodesAPIInputRow userFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public GetPostalCodesAPIInputRow addUserFieldsItem(GetPostalCodesAPIOutputUserFields userFieldsItem) {
    if (this.userFields == null) {
      this.userFields = new ArrayList<GetPostalCodesAPIOutputUserFields>();
    }
    this.userFields.add(userFieldsItem);
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These fields are returned, unmodified, in the user_fields section of the response.")

  public List<GetPostalCodesAPIOutputUserFields> getUserFields() {
    return userFields;
  }


  public void setUserFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    this.userFields = userFields;
  }


  public GetPostalCodesAPIInputRow city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city name.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city name.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public GetPostalCodesAPIInputRow stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The state or province.
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province.")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPostalCodesAPIInputRow getPostalCodesAPIInputRow = (GetPostalCodesAPIInputRow) o;
    return Objects.equals(this.userFields, getPostalCodesAPIInputRow.userFields) &&
        Objects.equals(this.city, getPostalCodesAPIInputRow.city) &&
        Objects.equals(this.stateProvince, getPostalCodesAPIInputRow.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, city, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPostalCodesAPIInputRow {\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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

