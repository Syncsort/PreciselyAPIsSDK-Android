/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
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
import com.precisely.apis.model.IndividualValueVariable;
import com.precisely.apis.model.RangeVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ExpenditureTheme
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class ExpenditureTheme {
  public static final String SERIALIZED_NAME_BOUNDARY_REF = "boundaryRef";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_REF)
  private String boundaryRef;

  public static final String SERIALIZED_NAME_INDIVIDUAL_VALUE_VARIABLE = "individualValueVariable";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_VALUE_VARIABLE)
  private List<IndividualValueVariable> individualValueVariable = null;

  public static final String SERIALIZED_NAME_RANGE_VARIABLE = "rangeVariable";
  @SerializedName(SERIALIZED_NAME_RANGE_VARIABLE)
  private List<RangeVariable> rangeVariable = null;

  public ExpenditureTheme() { 
  }

  public ExpenditureTheme boundaryRef(String boundaryRef) {
    
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBoundaryRef() {
    return boundaryRef;
  }


  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }


  public ExpenditureTheme individualValueVariable(List<IndividualValueVariable> individualValueVariable) {
    
    this.individualValueVariable = individualValueVariable;
    return this;
  }

  public ExpenditureTheme addIndividualValueVariableItem(IndividualValueVariable individualValueVariableItem) {
    if (this.individualValueVariable == null) {
      this.individualValueVariable = new ArrayList<IndividualValueVariable>();
    }
    this.individualValueVariable.add(individualValueVariableItem);
    return this;
  }

   /**
   * Get individualValueVariable
   * @return individualValueVariable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IndividualValueVariable> getIndividualValueVariable() {
    return individualValueVariable;
  }


  public void setIndividualValueVariable(List<IndividualValueVariable> individualValueVariable) {
    this.individualValueVariable = individualValueVariable;
  }


  public ExpenditureTheme rangeVariable(List<RangeVariable> rangeVariable) {
    
    this.rangeVariable = rangeVariable;
    return this;
  }

  public ExpenditureTheme addRangeVariableItem(RangeVariable rangeVariableItem) {
    if (this.rangeVariable == null) {
      this.rangeVariable = new ArrayList<RangeVariable>();
    }
    this.rangeVariable.add(rangeVariableItem);
    return this;
  }

   /**
   * Get rangeVariable
   * @return rangeVariable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RangeVariable> getRangeVariable() {
    return rangeVariable;
  }


  public void setRangeVariable(List<RangeVariable> rangeVariable) {
    this.rangeVariable = rangeVariable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenditureTheme expenditureTheme = (ExpenditureTheme) o;
    return Objects.equals(this.boundaryRef, expenditureTheme.boundaryRef) &&
        Objects.equals(this.individualValueVariable, expenditureTheme.individualValueVariable) &&
        Objects.equals(this.rangeVariable, expenditureTheme.rangeVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryRef, individualValueVariable, rangeVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenditureTheme {\n");
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
    sb.append("    individualValueVariable: ").append(toIndentedString(individualValueVariable)).append("\n");
    sb.append("    rangeVariable: ").append(toIndentedString(rangeVariable)).append("\n");
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

