/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OptimizerrulebatchBindBindInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class OptimizerrulebatchBindBindInfo {
  @JsonProperty("bind_type")
  private String bindType = null;

  @JsonProperty("dimension")
  private String dimension = null;

  @JsonProperty("dimension_ids")
  private List<String> dimensionIds = new ArrayList<String>();

  @JsonProperty("rule_id")
  private String ruleId = null;

  public OptimizerrulebatchBindBindInfo bindType(String bindType) {
    this.bindType = bindType;
    return this;
  }

   /**
   * Get bindType
   * @return bindType
  **/
  @Schema(required = true, description = "")
  public String getBindType() {
    return bindType;
  }

  public void setBindType(String bindType) {
    this.bindType = bindType;
  }

  public OptimizerrulebatchBindBindInfo dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @Schema(required = true, description = "")
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public OptimizerrulebatchBindBindInfo dimensionIds(List<String> dimensionIds) {
    this.dimensionIds = dimensionIds;
    return this;
  }

  public OptimizerrulebatchBindBindInfo addDimensionIdsItem(String dimensionIdsItem) {
    this.dimensionIds.add(dimensionIdsItem);
    return this;
  }

   /**
   * Get dimensionIds
   * @return dimensionIds
  **/
  @Schema(required = true, description = "")
  public List<String> getDimensionIds() {
    return dimensionIds;
  }

  public void setDimensionIds(List<String> dimensionIds) {
    this.dimensionIds = dimensionIds;
  }

  public OptimizerrulebatchBindBindInfo ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @Schema(required = true, description = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerrulebatchBindBindInfo optimizerrulebatchBindBindInfo = (OptimizerrulebatchBindBindInfo) o;
    return Objects.equals(this.bindType, optimizerrulebatchBindBindInfo.bindType) &&
        Objects.equals(this.dimension, optimizerrulebatchBindBindInfo.dimension) &&
        Objects.equals(this.dimensionIds, optimizerrulebatchBindBindInfo.dimensionIds) &&
        Objects.equals(this.ruleId, optimizerrulebatchBindBindInfo.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindType, dimension, dimensionIds, ruleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerrulebatchBindBindInfo {\n");
    
    sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionIds: ").append(toIndentedString(dimensionIds)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
