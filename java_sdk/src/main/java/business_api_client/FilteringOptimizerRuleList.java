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
 * FilteringOptimizerRuleList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class FilteringOptimizerRuleList {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("data_dimension")
  private String dataDimension = null;

  @JsonProperty("rule_info")
  private List<String> ruleInfo = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("time")
  private List<String> time = null;

  public FilteringOptimizerRuleList action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public FilteringOptimizerRuleList dataDimension(String dataDimension) {
    this.dataDimension = dataDimension;
    return this;
  }

   /**
   * Get dataDimension
   * @return dataDimension
  **/
  @Schema(description = "")
  public String getDataDimension() {
    return dataDimension;
  }

  public void setDataDimension(String dataDimension) {
    this.dataDimension = dataDimension;
  }

  public FilteringOptimizerRuleList ruleInfo(List<String> ruleInfo) {
    this.ruleInfo = ruleInfo;
    return this;
  }

  public FilteringOptimizerRuleList addRuleInfoItem(String ruleInfoItem) {
    if (this.ruleInfo == null) {
      this.ruleInfo = new ArrayList<String>();
    }
    this.ruleInfo.add(ruleInfoItem);
    return this;
  }

   /**
   * Get ruleInfo
   * @return ruleInfo
  **/
  @Schema(description = "")
  public List<String> getRuleInfo() {
    return ruleInfo;
  }

  public void setRuleInfo(List<String> ruleInfo) {
    this.ruleInfo = ruleInfo;
  }

  public FilteringOptimizerRuleList status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FilteringOptimizerRuleList time(List<String> time) {
    this.time = time;
    return this;
  }

  public FilteringOptimizerRuleList addTimeItem(String timeItem) {
    if (this.time == null) {
      this.time = new ArrayList<String>();
    }
    this.time.add(timeItem);
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public List<String> getTime() {
    return time;
  }

  public void setTime(List<String> time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringOptimizerRuleList filteringOptimizerRuleList = (FilteringOptimizerRuleList) o;
    return Objects.equals(this.action, filteringOptimizerRuleList.action) &&
        Objects.equals(this.dataDimension, filteringOptimizerRuleList.dataDimension) &&
        Objects.equals(this.ruleInfo, filteringOptimizerRuleList.ruleInfo) &&
        Objects.equals(this.status, filteringOptimizerRuleList.status) &&
        Objects.equals(this.time, filteringOptimizerRuleList.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dataDimension, ruleInfo, status, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringOptimizerRuleList {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dataDimension: ").append(toIndentedString(dataDimension)).append("\n");
    sb.append("    ruleInfo: ").append(toIndentedString(ruleInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
