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
 * CategoryMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class CategoryMetadata {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SIC = "sic";
  @SerializedName(SERIALIZED_NAME_SIC)
  private String sic;

  public static final String SERIALIZED_NAME_TRADE_DIVISION = "tradeDivision";
  @SerializedName(SERIALIZED_NAME_TRADE_DIVISION)
  private String tradeDivision;

  public static final String SERIALIZED_NAME_TRADE_GROUP = "tradeGroup";
  @SerializedName(SERIALIZED_NAME_TRADE_GROUP)
  private String tradeGroup;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_SUB_CLASS = "subClass";
  @SerializedName(SERIALIZED_NAME_SUB_CLASS)
  private String subClass;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public CategoryMetadata() { 
  }

  public CategoryMetadata code(String code) {
    
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


  public CategoryMetadata sic(String sic) {
    
    this.sic = sic;
    return this;
  }

   /**
   * Get sic
   * @return sic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSic() {
    return sic;
  }


  public void setSic(String sic) {
    this.sic = sic;
  }


  public CategoryMetadata tradeDivision(String tradeDivision) {
    
    this.tradeDivision = tradeDivision;
    return this;
  }

   /**
   * Get tradeDivision
   * @return tradeDivision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeDivision() {
    return tradeDivision;
  }


  public void setTradeDivision(String tradeDivision) {
    this.tradeDivision = tradeDivision;
  }


  public CategoryMetadata tradeGroup(String tradeGroup) {
    
    this.tradeGroup = tradeGroup;
    return this;
  }

   /**
   * Get tradeGroup
   * @return tradeGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeGroup() {
    return tradeGroup;
  }


  public void setTradeGroup(String tradeGroup) {
    this.tradeGroup = tradeGroup;
  }


  public CategoryMetadata propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public CategoryMetadata subClass(String subClass) {
    
    this.subClass = subClass;
    return this;
  }

   /**
   * Get subClass
   * @return subClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubClass() {
    return subClass;
  }


  public void setSubClass(String subClass) {
    this.subClass = subClass;
  }


  public CategoryMetadata description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryMetadata categoryMetadata = (CategoryMetadata) o;
    return Objects.equals(this.code, categoryMetadata.code) &&
        Objects.equals(this.sic, categoryMetadata.sic) &&
        Objects.equals(this.tradeDivision, categoryMetadata.tradeDivision) &&
        Objects.equals(this.tradeGroup, categoryMetadata.tradeGroup) &&
        Objects.equals(this.propertyClass, categoryMetadata.propertyClass) &&
        Objects.equals(this.subClass, categoryMetadata.subClass) &&
        Objects.equals(this.description, categoryMetadata.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, sic, tradeDivision, tradeGroup, propertyClass, subClass, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryMetadata {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    sic: ").append(toIndentedString(sic)).append("\n");
    sb.append("    tradeDivision: ").append(toIndentedString(tradeDivision)).append("\n");
    sb.append("    tradeGroup: ").append(toIndentedString(tradeGroup)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    subClass: ").append(toIndentedString(subClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

