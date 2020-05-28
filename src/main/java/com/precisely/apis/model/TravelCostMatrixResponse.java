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
import com.precisely.apis.model.Matrix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * TravelCostMatrixResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class TravelCostMatrixResponse   {
  @SerializedName("matrix")
  private List<Matrix> matrix = new ArrayList<Matrix>();

  public TravelCostMatrixResponse matrix(List<Matrix> matrix) {
    this.matrix = matrix;
    return this;
  }

   /**
   * Get matrix
   * @return matrix
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Matrix> getMatrix() {
    return matrix;
  }

  public void setMatrix(List<Matrix> matrix) {
    this.matrix = matrix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelCostMatrixResponse travelCostMatrixResponse = (TravelCostMatrixResponse) o;
    return Objects.equals(this.matrix, travelCostMatrixResponse.matrix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matrix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelCostMatrixResponse {\n");
    
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
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

