/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.Census;
import com.precisely.apis.model.LatLongFields;
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.SalesTax;
import com.precisely.apis.model.TaxJurisdiction;
import com.precisely.apis.model.UseTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * TaxBatchResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class TaxBatchResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("jurisdiction")
  private TaxJurisdiction jurisdiction = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  @SerializedName("salesTax")
  private SalesTax salesTax = null;

  @SerializedName("useTax")
  private UseTax useTax = null;

  @SerializedName("census")
  private Census census = null;

  @SerializedName("latLongFields")
  private LatLongFields latLongFields = null;

  public TaxBatchResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public TaxBatchResponse confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public TaxBatchResponse jurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxJurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public TaxBatchResponse matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }

  public TaxBatchResponse salesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Get salesTax
   * @return salesTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesTax getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
  }

  public TaxBatchResponse useTax(UseTax useTax) {
    this.useTax = useTax;
    return this;
  }

   /**
   * Get useTax
   * @return useTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public UseTax getUseTax() {
    return useTax;
  }

  public void setUseTax(UseTax useTax) {
    this.useTax = useTax;
  }

  public TaxBatchResponse census(Census census) {
    this.census = census;
    return this;
  }

   /**
   * Get census
   * @return census
  **/
  @ApiModelProperty(example = "null", value = "")
  public Census getCensus() {
    return census;
  }

  public void setCensus(Census census) {
    this.census = census;
  }

  public TaxBatchResponse latLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
    return this;
  }

   /**
   * Get latLongFields
   * @return latLongFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public LatLongFields getLatLongFields() {
    return latLongFields;
  }

  public void setLatLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxBatchResponse taxBatchResponse = (TaxBatchResponse) o;
    return Objects.equals(this.objectId, taxBatchResponse.objectId) &&
        Objects.equals(this.confidence, taxBatchResponse.confidence) &&
        Objects.equals(this.jurisdiction, taxBatchResponse.jurisdiction) &&
        Objects.equals(this.matchedAddress, taxBatchResponse.matchedAddress) &&
        Objects.equals(this.salesTax, taxBatchResponse.salesTax) &&
        Objects.equals(this.useTax, taxBatchResponse.useTax) &&
        Objects.equals(this.census, taxBatchResponse.census) &&
        Objects.equals(this.latLongFields, taxBatchResponse.latLongFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, confidence, jurisdiction, matchedAddress, salesTax, useTax, census, latLongFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxBatchResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    useTax: ").append(toIndentedString(useTax)).append("\n");
    sb.append("    census: ").append(toIndentedString(census)).append("\n");
    sb.append("    latLongFields: ").append(toIndentedString(latLongFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

