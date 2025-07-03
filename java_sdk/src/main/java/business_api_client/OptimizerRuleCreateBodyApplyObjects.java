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
 * OptimizerRuleCreateBodyApplyObjects
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyApplyObjects {
  @JsonProperty("bind_type")
  private String bindType = null;

  @JsonProperty("dimension")
  private String dimension = null;

  @JsonProperty("dimension_ids")
  private List<String> dimensionIds = null;

  @JsonProperty("pre_condition_type")
  private String preConditionType = null;

  public OptimizerRuleCreateBodyApplyObjects bindType(String bindType) {
    this.bindType = bindType;
    return this;
  }

   /**
   * Get bindType
   * @return bindType
  **/
  @Schema(description = "")
  public String getBindType() {
    return bindType;
  }

  public void setBindType(String bindType) {
    this.bindType = bindType;
  }

  public OptimizerRuleCreateBodyApplyObjects dimension(String dimension) {
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

  public OptimizerRuleCreateBodyApplyObjects dimensionIds(List<String> dimensionIds) {
    this.dimensionIds = dimensionIds;
    return this;
  }

  public OptimizerRuleCreateBodyApplyObjects addDimensionIdsItem(String dimensionIdsItem) {
    if (this.dimensionIds == null) {
      this.dimensionIds = new ArrayList<String>();
    }
    this.dimensionIds.add(dimensionIdsItem);
    return this;
  }

   /**
   * Get dimensionIds
   * @return dimensionIds
  **/
  @Schema(description = "")
  public List<String> getDimensionIds() {
    return dimensionIds;
  }

  public void setDimensionIds(List<String> dimensionIds) {
    this.dimensionIds = dimensionIds;
  }

  public OptimizerRuleCreateBodyApplyObjects preConditionType(String preConditionType) {
    this.preConditionType = preConditionType;
    return this;
  }

   /**
   * Get preConditionType
   * @return preConditionType
  **/
  @Schema(required = true, description = "")
  public String getPreConditionType() {
    return preConditionType;
  }

  public void setPreConditionType(String preConditionType) {
    this.preConditionType = preConditionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyApplyObjects optimizerRuleCreateBodyApplyObjects = (OptimizerRuleCreateBodyApplyObjects) o;
    return Objects.equals(this.bindType, optimizerRuleCreateBodyApplyObjects.bindType) &&
        Objects.equals(this.dimension, optimizerRuleCreateBodyApplyObjects.dimension) &&
        Objects.equals(this.dimensionIds, optimizerRuleCreateBodyApplyObjects.dimensionIds) &&
        Objects.equals(this.preConditionType, optimizerRuleCreateBodyApplyObjects.preConditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindType, dimension, dimensionIds, preConditionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyApplyObjects {\n");
    
    sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionIds: ").append(toIndentedString(dimensionIds)).append("\n");
    sb.append("    preConditionType: ").append(toIndentedString(preConditionType)).append("\n");
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
