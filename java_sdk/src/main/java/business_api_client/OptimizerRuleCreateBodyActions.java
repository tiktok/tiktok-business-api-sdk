/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OptimizerRuleCreateBodyFrequencyInfo;
import business_api_client.OptimizerRuleCreateBodyValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OptimizerRuleCreateBodyActions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyActions {
  @JsonProperty("action_type")
  private String actionType = null;

  @JsonProperty("frequency_info")
  private OptimizerRuleCreateBodyFrequencyInfo frequencyInfo = null;

  @JsonProperty("subject_type")
  private String subjectType = null;

  @JsonProperty("value")
  private OptimizerRuleCreateBodyValue value = null;

  @JsonProperty("value_type")
  private String valueType = null;

  public OptimizerRuleCreateBodyActions actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @Schema(description = "")
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public OptimizerRuleCreateBodyActions frequencyInfo(OptimizerRuleCreateBodyFrequencyInfo frequencyInfo) {
    this.frequencyInfo = frequencyInfo;
    return this;
  }

   /**
   * Get frequencyInfo
   * @return frequencyInfo
  **/
  @Schema(description = "")
  public OptimizerRuleCreateBodyFrequencyInfo getFrequencyInfo() {
    return frequencyInfo;
  }

  public void setFrequencyInfo(OptimizerRuleCreateBodyFrequencyInfo frequencyInfo) {
    this.frequencyInfo = frequencyInfo;
  }

  public OptimizerRuleCreateBodyActions subjectType(String subjectType) {
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

  public OptimizerRuleCreateBodyActions value(OptimizerRuleCreateBodyValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public OptimizerRuleCreateBodyValue getValue() {
    return value;
  }

  public void setValue(OptimizerRuleCreateBodyValue value) {
    this.value = value;
  }

  public OptimizerRuleCreateBodyActions valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyActions optimizerRuleCreateBodyActions = (OptimizerRuleCreateBodyActions) o;
    return Objects.equals(this.actionType, optimizerRuleCreateBodyActions.actionType) &&
        Objects.equals(this.frequencyInfo, optimizerRuleCreateBodyActions.frequencyInfo) &&
        Objects.equals(this.subjectType, optimizerRuleCreateBodyActions.subjectType) &&
        Objects.equals(this.value, optimizerRuleCreateBodyActions.value) &&
        Objects.equals(this.valueType, optimizerRuleCreateBodyActions.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, frequencyInfo, subjectType, value, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyActions {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    frequencyInfo: ").append(toIndentedString(frequencyInfo)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
