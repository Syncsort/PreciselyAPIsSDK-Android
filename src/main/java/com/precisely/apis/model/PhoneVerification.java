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
import com.precisely.apis.model.DeviceStatusNetwork;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PhoneVerification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class PhoneVerification {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_LOCATABLE = "locatable";
  @SerializedName(SERIALIZED_NAME_LOCATABLE)
  private String locatable;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private DeviceStatusNetwork network;

  public static final String SERIALIZED_NAME_PRIVACY_CONSENT_REQUIRED = "privacyConsentRequired";
  @SerializedName(SERIALIZED_NAME_PRIVACY_CONSENT_REQUIRED)
  private String privacyConsentRequired;

  public PhoneVerification() { 
  }

  public PhoneVerification phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneVerification locatable(String locatable) {
    
    this.locatable = locatable;
    return this;
  }

   /**
   * Get locatable
   * @return locatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocatable() {
    return locatable;
  }


  public void setLocatable(String locatable) {
    this.locatable = locatable;
  }


  public PhoneVerification network(DeviceStatusNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceStatusNetwork getNetwork() {
    return network;
  }


  public void setNetwork(DeviceStatusNetwork network) {
    this.network = network;
  }


  public PhoneVerification privacyConsentRequired(String privacyConsentRequired) {
    
    this.privacyConsentRequired = privacyConsentRequired;
    return this;
  }

   /**
   * Get privacyConsentRequired
   * @return privacyConsentRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacyConsentRequired() {
    return privacyConsentRequired;
  }


  public void setPrivacyConsentRequired(String privacyConsentRequired) {
    this.privacyConsentRequired = privacyConsentRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneVerification phoneVerification = (PhoneVerification) o;
    return Objects.equals(this.phoneNumber, phoneVerification.phoneNumber) &&
        Objects.equals(this.locatable, phoneVerification.locatable) &&
        Objects.equals(this.network, phoneVerification.network) &&
        Objects.equals(this.privacyConsentRequired, phoneVerification.privacyConsentRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, locatable, network, privacyConsentRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneVerification {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    locatable: ").append(toIndentedString(locatable)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    privacyConsentRequired: ").append(toIndentedString(privacyConsentRequired)).append("\n");
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
