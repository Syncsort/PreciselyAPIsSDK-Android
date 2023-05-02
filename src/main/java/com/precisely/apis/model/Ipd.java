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
import com.precisely.apis.model.BoundaryBuffer;
import com.precisely.apis.model.DistrictType;
import com.precisely.apis.model.Rate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ipd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class Ipd {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISTRICT_NAME = "districtName";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "districtType";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private DistrictType districtType;

  public static final String SERIALIZED_NAME_TAX_CODE_DESCRIPTION = "taxCodeDescription";
  @SerializedName(SERIALIZED_NAME_TAX_CODE_DESCRIPTION)
  private String taxCodeDescription;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_BOUNDARY_BUFFER = "boundaryBuffer";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_BUFFER)
  private BoundaryBuffer boundaryBuffer;

  public static final String SERIALIZED_NAME_RATES = "rates";
  @SerializedName(SERIALIZED_NAME_RATES)
  private List<Rate> rates = null;

  public Ipd() { 
  }

  public Ipd id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Ipd districtName(String districtName) {
    
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


  public Ipd districtType(DistrictType districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DistrictType getDistrictType() {
    return districtType;
  }


  public void setDistrictType(DistrictType districtType) {
    this.districtType = districtType;
  }


  public Ipd taxCodeDescription(String taxCodeDescription) {
    
    this.taxCodeDescription = taxCodeDescription;
    return this;
  }

   /**
   * Get taxCodeDescription
   * @return taxCodeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxCodeDescription() {
    return taxCodeDescription;
  }


  public void setTaxCodeDescription(String taxCodeDescription) {
    this.taxCodeDescription = taxCodeDescription;
  }


  public Ipd effectiveDate(String effectiveDate) {
    
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


  public Ipd expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public Ipd boundaryBuffer(BoundaryBuffer boundaryBuffer) {
    
    this.boundaryBuffer = boundaryBuffer;
    return this;
  }

   /**
   * Get boundaryBuffer
   * @return boundaryBuffer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BoundaryBuffer getBoundaryBuffer() {
    return boundaryBuffer;
  }


  public void setBoundaryBuffer(BoundaryBuffer boundaryBuffer) {
    this.boundaryBuffer = boundaryBuffer;
  }


  public Ipd rates(List<Rate> rates) {
    
    this.rates = rates;
    return this;
  }

  public Ipd addRatesItem(Rate ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<Rate>();
    }
    this.rates.add(ratesItem);
    return this;
  }

   /**
   * Get rates
   * @return rates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Rate> getRates() {
    return rates;
  }


  public void setRates(List<Rate> rates) {
    this.rates = rates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipd ipd = (Ipd) o;
    return Objects.equals(this.id, ipd.id) &&
        Objects.equals(this.districtName, ipd.districtName) &&
        Objects.equals(this.districtType, ipd.districtType) &&
        Objects.equals(this.taxCodeDescription, ipd.taxCodeDescription) &&
        Objects.equals(this.effectiveDate, ipd.effectiveDate) &&
        Objects.equals(this.expirationDate, ipd.expirationDate) &&
        Objects.equals(this.boundaryBuffer, ipd.boundaryBuffer) &&
        Objects.equals(this.rates, ipd.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, districtName, districtType, taxCodeDescription, effectiveDate, expirationDate, boundaryBuffer, rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipd {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    taxCodeDescription: ").append(toIndentedString(taxCodeDescription)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    boundaryBuffer: ").append(toIndentedString(boundaryBuffer)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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

