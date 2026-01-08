/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OptimizerRuleCreateBodyActions;
import business_api_client.OptimizerRuleCreateBodyApplyObjects;
import business_api_client.OptimizerRuleCreateBodyConditions;
import business_api_client.OptimizerRuleCreateBodyNotification;
import business_api_client.OptimizerRuleCreateBodyRuleExecInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OptimizerRuleCreateBodyRules
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyRules {
  @JsonProperty("actions")
  private List<OptimizerRuleCreateBodyActions> actions = new ArrayList<OptimizerRuleCreateBodyActions>();

  @JsonProperty("apply_objects")
  private List<OptimizerRuleCreateBodyApplyObjects> applyObjects = new ArrayList<OptimizerRuleCreateBodyApplyObjects>();

  @JsonProperty("conditions")
  private List<OptimizerRuleCreateBodyConditions> conditions = new ArrayList<OptimizerRuleCreateBodyConditions>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notification")
  private OptimizerRuleCreateBodyNotification notification = null;

  @JsonProperty("rule_exec_info")
  private OptimizerRuleCreateBodyRuleExecInfo ruleExecInfo = null;

  @JsonProperty("tzone")
  private String tzone = null;

  public OptimizerRuleCreateBodyRules actions(List<OptimizerRuleCreateBodyActions> actions) {
    this.actions = actions;
    return this;
  }

  public OptimizerRuleCreateBodyRules addActionsItem(OptimizerRuleCreateBodyActions actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(required = true, description = "")
  public List<OptimizerRuleCreateBodyActions> getActions() {
    return actions;
  }

  public void setActions(List<OptimizerRuleCreateBodyActions> actions) {
    this.actions = actions;
  }

  public OptimizerRuleCreateBodyRules applyObjects(List<OptimizerRuleCreateBodyApplyObjects> applyObjects) {
    this.applyObjects = applyObjects;
    return this;
  }

  public OptimizerRuleCreateBodyRules addApplyObjectsItem(OptimizerRuleCreateBodyApplyObjects applyObjectsItem) {
    this.applyObjects.add(applyObjectsItem);
    return this;
  }

   /**
   * Get applyObjects
   * @return applyObjects
  **/
  @Schema(required = true, description = "")
  public List<OptimizerRuleCreateBodyApplyObjects> getApplyObjects() {
    return applyObjects;
  }

  public void setApplyObjects(List<OptimizerRuleCreateBodyApplyObjects> applyObjects) {
    this.applyObjects = applyObjects;
  }

  public OptimizerRuleCreateBodyRules conditions(List<OptimizerRuleCreateBodyConditions> conditions) {
    this.conditions = conditions;
    return this;
  }

  public OptimizerRuleCreateBodyRules addConditionsItem(OptimizerRuleCreateBodyConditions conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(required = true, description = "")
  public List<OptimizerRuleCreateBodyConditions> getConditions() {
    return conditions;
  }

  public void setConditions(List<OptimizerRuleCreateBodyConditions> conditions) {
    this.conditions = conditions;
  }

  public OptimizerRuleCreateBodyRules name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OptimizerRuleCreateBodyRules notification(OptimizerRuleCreateBodyNotification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @Schema(required = true, description = "")
  public OptimizerRuleCreateBodyNotification getNotification() {
    return notification;
  }

  public void setNotification(OptimizerRuleCreateBodyNotification notification) {
    this.notification = notification;
  }

  public OptimizerRuleCreateBodyRules ruleExecInfo(OptimizerRuleCreateBodyRuleExecInfo ruleExecInfo) {
    this.ruleExecInfo = ruleExecInfo;
    return this;
  }

   /**
   * Get ruleExecInfo
   * @return ruleExecInfo
  **/
  @Schema(required = true, description = "")
  public OptimizerRuleCreateBodyRuleExecInfo getRuleExecInfo() {
    return ruleExecInfo;
  }

  public void setRuleExecInfo(OptimizerRuleCreateBodyRuleExecInfo ruleExecInfo) {
    this.ruleExecInfo = ruleExecInfo;
  }

  public OptimizerRuleCreateBodyRules tzone(String tzone) {
    this.tzone = tzone;
    return this;
  }

   /**
   * Get tzone
   * @return tzone
  **/
  @Schema(description = "")
  public String getTzone() {
    return tzone;
  }

  public void setTzone(String tzone) {
    this.tzone = tzone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyRules optimizerRuleCreateBodyRules = (OptimizerRuleCreateBodyRules) o;
    return Objects.equals(this.actions, optimizerRuleCreateBodyRules.actions) &&
        Objects.equals(this.applyObjects, optimizerRuleCreateBodyRules.applyObjects) &&
        Objects.equals(this.conditions, optimizerRuleCreateBodyRules.conditions) &&
        Objects.equals(this.name, optimizerRuleCreateBodyRules.name) &&
        Objects.equals(this.notification, optimizerRuleCreateBodyRules.notification) &&
        Objects.equals(this.ruleExecInfo, optimizerRuleCreateBodyRules.ruleExecInfo) &&
        Objects.equals(this.tzone, optimizerRuleCreateBodyRules.tzone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, applyObjects, conditions, name, notification, ruleExecInfo, tzone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyRules {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    applyObjects: ").append(toIndentedString(applyObjects)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    ruleExecInfo: ").append(toIndentedString(ruleExecInfo)).append("\n");
    sb.append("    tzone: ").append(toIndentedString(tzone)).append("\n");
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
