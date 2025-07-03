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
 * OptimizerRuleCreateBodyConditions
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyConditions {
  @JsonProperty("calculation_type")
  private String calculationType = null;

  @JsonProperty("match_type")
  private String matchType = null;

  @JsonProperty("range_type")
  private String rangeType = null;

  @JsonProperty("subject_type")
  private String subjectType = null;

  @JsonProperty("values")
  private List<String> values = null;

  public OptimizerRuleCreateBodyConditions calculationType(String calculationType) {
    this.calculationType = calculationType;
    return this;
  }

   /**
   * Get calculationType
   * @return calculationType
  **/
  @Schema(description = "")
  public String getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(String calculationType) {
    this.calculationType = calculationType;
  }

  public OptimizerRuleCreateBodyConditions matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @Schema(description = "")
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }

  public OptimizerRuleCreateBodyConditions rangeType(String rangeType) {
    this.rangeType = rangeType;
    return this;
  }

   /**
   * Get rangeType
   * @return rangeType
  **/
  @Schema(description = "")
  public String getRangeType() {
    return rangeType;
  }

  public void setRangeType(String rangeType) {
    this.rangeType = rangeType;
  }

  public OptimizerRuleCreateBodyConditions subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

   /**
   * Get subjectType
   * @return subjectType
  **/
  @Schema(required = true, description = "")
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public OptimizerRuleCreateBodyConditions values(List<String> values) {
    this.values = values;
    return this;
  }

  public OptimizerRuleCreateBodyConditions addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyConditions optimizerRuleCreateBodyConditions = (OptimizerRuleCreateBodyConditions) o;
    return Objects.equals(this.calculationType, optimizerRuleCreateBodyConditions.calculationType) &&
        Objects.equals(this.matchType, optimizerRuleCreateBodyConditions.matchType) &&
        Objects.equals(this.rangeType, optimizerRuleCreateBodyConditions.rangeType) &&
        Objects.equals(this.subjectType, optimizerRuleCreateBodyConditions.subjectType) &&
        Objects.equals(this.values, optimizerRuleCreateBodyConditions.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationType, matchType, rangeType, subjectType, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyConditions {\n");
    
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
