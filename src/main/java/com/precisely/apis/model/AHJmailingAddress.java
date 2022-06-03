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
 * AHJmailingAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class AHJmailingAddress {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_STREET_SIDE = "streetSide";
  @SerializedName(SERIALIZED_NAME_STREET_SIDE)
  private String streetSide;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "businessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "addressLine3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  private String addressLine3;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "stateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private String county;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_URBANIZATION_NAME = "urbanizationName";
  @SerializedName(SERIALIZED_NAME_URBANIZATION_NAME)
  private String urbanizationName;

  public static final String SERIALIZED_NAME_FORMATTED_ADDRESS = "formattedAddress";
  @SerializedName(SERIALIZED_NAME_FORMATTED_ADDRESS)
  private String formattedAddress;

  public static final String SERIALIZED_NAME_MAIN_ADDRESS_LINE = "mainAddressLine";
  @SerializedName(SERIALIZED_NAME_MAIN_ADDRESS_LINE)
  private String mainAddressLine;

  public static final String SERIALIZED_NAME_ADDRESS_LAST_LINE = "addressLastLine";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LAST_LINE)
  private String addressLastLine;

  public static final String SERIALIZED_NAME_PLACE_NAME = "placeName";
  @SerializedName(SERIALIZED_NAME_PLACE_NAME)
  private String placeName;

  public static final String SERIALIZED_NAME_AREA_NAME1 = "areaName1";
  @SerializedName(SERIALIZED_NAME_AREA_NAME1)
  private String areaName1;

  public static final String SERIALIZED_NAME_AREA_NAME2 = "areaName2";
  @SerializedName(SERIALIZED_NAME_AREA_NAME2)
  private String areaName2;

  public static final String SERIALIZED_NAME_AREA_NAME3 = "areaName3";
  @SerializedName(SERIALIZED_NAME_AREA_NAME3)
  private String areaName3;

  public static final String SERIALIZED_NAME_AREA_NAME4 = "areaName4";
  @SerializedName(SERIALIZED_NAME_AREA_NAME4)
  private String areaName4;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_POST_CODE_EXT = "postCodeExt";
  @SerializedName(SERIALIZED_NAME_POST_CODE_EXT)
  private String postCodeExt;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ADDRESS_NUMBER = "addressNumber";
  @SerializedName(SERIALIZED_NAME_ADDRESS_NUMBER)
  private String addressNumber;

  public static final String SERIALIZED_NAME_STREET_NAME = "streetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unitType";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_UNIT_VALUE = "unitValue";
  @SerializedName(SERIALIZED_NAME_UNIT_VALUE)
  private String unitValue;

  public AHJmailingAddress() { 
  }

  public AHJmailingAddress objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public AHJmailingAddress displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AHJmailingAddress streetSide(String streetSide) {
    
    this.streetSide = streetSide;
    return this;
  }

   /**
   * Get streetSide
   * @return streetSide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetSide() {
    return streetSide;
  }


  public void setStreetSide(String streetSide) {
    this.streetSide = streetSide;
  }


  public AHJmailingAddress businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public AHJmailingAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public AHJmailingAddress addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public AHJmailingAddress addressLine3(String addressLine3) {
    
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Get addressLine3
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine3() {
    return addressLine3;
  }


  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public AHJmailingAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AHJmailingAddress stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * Get stateProvince
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public AHJmailingAddress county(String county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCounty() {
    return county;
  }


  public void setCounty(String county) {
    this.county = county;
  }


  public AHJmailingAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public AHJmailingAddress latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public AHJmailingAddress longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public AHJmailingAddress status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AHJmailingAddress urbanizationName(String urbanizationName) {
    
    this.urbanizationName = urbanizationName;
    return this;
  }

   /**
   * Get urbanizationName
   * @return urbanizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrbanizationName() {
    return urbanizationName;
  }


  public void setUrbanizationName(String urbanizationName) {
    this.urbanizationName = urbanizationName;
  }


  public AHJmailingAddress formattedAddress(String formattedAddress) {
    
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormattedAddress() {
    return formattedAddress;
  }


  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  public AHJmailingAddress mainAddressLine(String mainAddressLine) {
    
    this.mainAddressLine = mainAddressLine;
    return this;
  }

   /**
   * Get mainAddressLine
   * @return mainAddressLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMainAddressLine() {
    return mainAddressLine;
  }


  public void setMainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
  }


  public AHJmailingAddress addressLastLine(String addressLastLine) {
    
    this.addressLastLine = addressLastLine;
    return this;
  }

   /**
   * Get addressLastLine
   * @return addressLastLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLastLine() {
    return addressLastLine;
  }


  public void setAddressLastLine(String addressLastLine) {
    this.addressLastLine = addressLastLine;
  }


  public AHJmailingAddress placeName(String placeName) {
    
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceName() {
    return placeName;
  }


  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }


  public AHJmailingAddress areaName1(String areaName1) {
    
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName1() {
    return areaName1;
  }


  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }


  public AHJmailingAddress areaName2(String areaName2) {
    
    this.areaName2 = areaName2;
    return this;
  }

   /**
   * Get areaName2
   * @return areaName2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName2() {
    return areaName2;
  }


  public void setAreaName2(String areaName2) {
    this.areaName2 = areaName2;
  }


  public AHJmailingAddress areaName3(String areaName3) {
    
    this.areaName3 = areaName3;
    return this;
  }

   /**
   * Get areaName3
   * @return areaName3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName3() {
    return areaName3;
  }


  public void setAreaName3(String areaName3) {
    this.areaName3 = areaName3;
  }


  public AHJmailingAddress areaName4(String areaName4) {
    
    this.areaName4 = areaName4;
    return this;
  }

   /**
   * Get areaName4
   * @return areaName4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName4() {
    return areaName4;
  }


  public void setAreaName4(String areaName4) {
    this.areaName4 = areaName4;
  }


  public AHJmailingAddress postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public AHJmailingAddress postCodeExt(String postCodeExt) {
    
    this.postCodeExt = postCodeExt;
    return this;
  }

   /**
   * Get postCodeExt
   * @return postCodeExt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCodeExt() {
    return postCodeExt;
  }


  public void setPostCodeExt(String postCodeExt) {
    this.postCodeExt = postCodeExt;
  }


  public AHJmailingAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public AHJmailingAddress addressNumber(String addressNumber) {
    
    this.addressNumber = addressNumber;
    return this;
  }

   /**
   * Get addressNumber
   * @return addressNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressNumber() {
    return addressNumber;
  }


  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }


  public AHJmailingAddress streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public AHJmailingAddress unitType(String unitType) {
    
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public AHJmailingAddress unitValue(String unitValue) {
    
    this.unitValue = unitValue;
    return this;
  }

   /**
   * Get unitValue
   * @return unitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitValue() {
    return unitValue;
  }


  public void setUnitValue(String unitValue) {
    this.unitValue = unitValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AHJmailingAddress ahJmailingAddress = (AHJmailingAddress) o;
    return Objects.equals(this.objectId, ahJmailingAddress.objectId) &&
        Objects.equals(this.displayName, ahJmailingAddress.displayName) &&
        Objects.equals(this.streetSide, ahJmailingAddress.streetSide) &&
        Objects.equals(this.businessName, ahJmailingAddress.businessName) &&
        Objects.equals(this.addressLine1, ahJmailingAddress.addressLine1) &&
        Objects.equals(this.addressLine2, ahJmailingAddress.addressLine2) &&
        Objects.equals(this.addressLine3, ahJmailingAddress.addressLine3) &&
        Objects.equals(this.city, ahJmailingAddress.city) &&
        Objects.equals(this.stateProvince, ahJmailingAddress.stateProvince) &&
        Objects.equals(this.county, ahJmailingAddress.county) &&
        Objects.equals(this.postalCode, ahJmailingAddress.postalCode) &&
        Objects.equals(this.latitude, ahJmailingAddress.latitude) &&
        Objects.equals(this.longitude, ahJmailingAddress.longitude) &&
        Objects.equals(this.status, ahJmailingAddress.status) &&
        Objects.equals(this.urbanizationName, ahJmailingAddress.urbanizationName) &&
        Objects.equals(this.formattedAddress, ahJmailingAddress.formattedAddress) &&
        Objects.equals(this.mainAddressLine, ahJmailingAddress.mainAddressLine) &&
        Objects.equals(this.addressLastLine, ahJmailingAddress.addressLastLine) &&
        Objects.equals(this.placeName, ahJmailingAddress.placeName) &&
        Objects.equals(this.areaName1, ahJmailingAddress.areaName1) &&
        Objects.equals(this.areaName2, ahJmailingAddress.areaName2) &&
        Objects.equals(this.areaName3, ahJmailingAddress.areaName3) &&
        Objects.equals(this.areaName4, ahJmailingAddress.areaName4) &&
        Objects.equals(this.postCode, ahJmailingAddress.postCode) &&
        Objects.equals(this.postCodeExt, ahJmailingAddress.postCodeExt) &&
        Objects.equals(this.country, ahJmailingAddress.country) &&
        Objects.equals(this.addressNumber, ahJmailingAddress.addressNumber) &&
        Objects.equals(this.streetName, ahJmailingAddress.streetName) &&
        Objects.equals(this.unitType, ahJmailingAddress.unitType) &&
        Objects.equals(this.unitValue, ahJmailingAddress.unitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, displayName, streetSide, businessName, addressLine1, addressLine2, addressLine3, city, stateProvince, county, postalCode, latitude, longitude, status, urbanizationName, formattedAddress, mainAddressLine, addressLastLine, placeName, areaName1, areaName2, areaName3, areaName4, postCode, postCodeExt, country, addressNumber, streetName, unitType, unitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AHJmailingAddress {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    streetSide: ").append(toIndentedString(streetSide)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    urbanizationName: ").append(toIndentedString(urbanizationName)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    mainAddressLine: ").append(toIndentedString(mainAddressLine)).append("\n");
    sb.append("    addressLastLine: ").append(toIndentedString(addressLastLine)).append("\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    areaName2: ").append(toIndentedString(areaName2)).append("\n");
    sb.append("    areaName3: ").append(toIndentedString(areaName3)).append("\n");
    sb.append("    areaName4: ").append(toIndentedString(areaName4)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postCodeExt: ").append(toIndentedString(postCodeExt)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unitValue: ").append(toIndentedString(unitValue)).append("\n");
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
