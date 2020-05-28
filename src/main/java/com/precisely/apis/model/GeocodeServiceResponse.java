/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
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
import com.precisely.apis.model.Candidate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * GeocodeServiceResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class GeocodeServiceResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("totalPossibleCandidates")
  private Integer totalPossibleCandidates = null;

  @SerializedName("totalMatches")
  private Integer totalMatches = null;

  @SerializedName("candidates")
  private List<Candidate> candidates = new ArrayList<Candidate>();

  public GeocodeServiceResponse objectId(String objectId) {
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

  public GeocodeServiceResponse totalPossibleCandidates(Integer totalPossibleCandidates) {
    this.totalPossibleCandidates = totalPossibleCandidates;
    return this;
  }

   /**
   * Get totalPossibleCandidates
   * @return totalPossibleCandidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalPossibleCandidates() {
    return totalPossibleCandidates;
  }

  public void setTotalPossibleCandidates(Integer totalPossibleCandidates) {
    this.totalPossibleCandidates = totalPossibleCandidates;
  }

  public GeocodeServiceResponse totalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
    return this;
  }

   /**
   * Get totalMatches
   * @return totalMatches
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalMatches() {
    return totalMatches;
  }

  public void setTotalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
  }

  public GeocodeServiceResponse candidates(List<Candidate> candidates) {
    this.candidates = candidates;
    return this;
  }

   /**
   * Get candidates
   * @return candidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Candidate> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<Candidate> candidates) {
    this.candidates = candidates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeServiceResponse geocodeServiceResponse = (GeocodeServiceResponse) o;
    return Objects.equals(this.objectId, geocodeServiceResponse.objectId) &&
        Objects.equals(this.totalPossibleCandidates, geocodeServiceResponse.totalPossibleCandidates) &&
        Objects.equals(this.totalMatches, geocodeServiceResponse.totalMatches) &&
        Objects.equals(this.candidates, geocodeServiceResponse.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, totalPossibleCandidates, totalMatches, candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeServiceResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    totalPossibleCandidates: ").append(toIndentedString(totalPossibleCandidates)).append("\n");
    sb.append("    totalMatches: ").append(toIndentedString(totalMatches)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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

