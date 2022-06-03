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
import com.precisely.apis.model.SpecialPurposeDistrict;
import com.precisely.apis.model.TaxCounty;
import com.precisely.apis.model.TaxPlace;
import com.precisely.apis.model.TaxState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaxJurisdiction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class TaxJurisdiction {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private TaxState state;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private TaxCounty county;

  public static final String SERIALIZED_NAME_PLACE = "place";
  @SerializedName(SERIALIZED_NAME_PLACE)
  private TaxPlace place;

  public static final String SERIALIZED_NAME_SPDS = "spds";
  @SerializedName(SERIALIZED_NAME_SPDS)
  private List<SpecialPurposeDistrict> spds = null;

  public TaxJurisdiction() { 
  }

  public TaxJurisdiction state(TaxState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxState getState() {
    return state;
  }


  public void setState(TaxState state) {
    this.state = state;
  }


  public TaxJurisdiction county(TaxCounty county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxCounty getCounty() {
    return county;
  }


  public void setCounty(TaxCounty county) {
    this.county = county;
  }


  public TaxJurisdiction place(TaxPlace place) {
    
    this.place = place;
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxPlace getPlace() {
    return place;
  }


  public void setPlace(TaxPlace place) {
    this.place = place;
  }


  public TaxJurisdiction spds(List<SpecialPurposeDistrict> spds) {
    
    this.spds = spds;
    return this;
  }

  public TaxJurisdiction addSpdsItem(SpecialPurposeDistrict spdsItem) {
    if (this.spds == null) {
      this.spds = new ArrayList<SpecialPurposeDistrict>();
    }
    this.spds.add(spdsItem);
    return this;
  }

   /**
   * Get spds
   * @return spds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SpecialPurposeDistrict> getSpds() {
    return spds;
  }


  public void setSpds(List<SpecialPurposeDistrict> spds) {
    this.spds = spds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxJurisdiction taxJurisdiction = (TaxJurisdiction) o;
    return Objects.equals(this.state, taxJurisdiction.state) &&
        Objects.equals(this.county, taxJurisdiction.county) &&
        Objects.equals(this.place, taxJurisdiction.place) &&
        Objects.equals(this.spds, taxJurisdiction.spds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, county, place, spds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxJurisdiction {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    spds: ").append(toIndentedString(spds)).append("\n");
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
