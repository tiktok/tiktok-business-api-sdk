/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OptimizerRuleCreateBodyRuleExecInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyRuleExecInfo {
  @JsonProperty("exec_time")
  private String execTime = null;

  @JsonProperty("exec_time_type")
  private String execTimeType = null;

  @JsonProperty("time_period_info")
  private List<OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo> timePeriodInfo = null;

  public OptimizerRuleCreateBodyRuleExecInfo execTime(String execTime) {
    this.execTime = execTime;
    return this;
  }

   /**
   * Get execTime
   * @return execTime
  **/
  @Schema(description = "")
  public String getExecTime() {
    return execTime;
  }

  public void setExecTime(String execTime) {
    this.execTime = execTime;
  }

  public OptimizerRuleCreateBodyRuleExecInfo execTimeType(String execTimeType) {
    this.execTimeType = execTimeType;
    return this;
  }

   /**
   * Get execTimeType
   * @return execTimeType
  **/
  @Schema(required = true, description = "")
  public String getExecTimeType() {
    return execTimeType;
  }

  public void setExecTimeType(String execTimeType) {
    this.execTimeType = execTimeType;
  }

  public OptimizerRuleCreateBodyRuleExecInfo timePeriodInfo(List<OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo> timePeriodInfo) {
    this.timePeriodInfo = timePeriodInfo;
    return this;
  }

  public OptimizerRuleCreateBodyRuleExecInfo addTimePeriodInfoItem(OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo timePeriodInfoItem) {
    if (this.timePeriodInfo == null) {
      this.timePeriodInfo = new ArrayList<OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo>();
    }
    this.timePeriodInfo.add(timePeriodInfoItem);
    return this;
  }

   /**
   * Get timePeriodInfo
   * @return timePeriodInfo
  **/
  @Schema(description = "")
  public List<OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo> getTimePeriodInfo() {
    return timePeriodInfo;
  }

  public void setTimePeriodInfo(List<OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo> timePeriodInfo) {
    this.timePeriodInfo = timePeriodInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyRuleExecInfo optimizerRuleCreateBodyRuleExecInfo = (OptimizerRuleCreateBodyRuleExecInfo) o;
    return Objects.equals(this.execTime, optimizerRuleCreateBodyRuleExecInfo.execTime) &&
        Objects.equals(this.execTimeType, optimizerRuleCreateBodyRuleExecInfo.execTimeType) &&
        Objects.equals(this.timePeriodInfo, optimizerRuleCreateBodyRuleExecInfo.timePeriodInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execTime, execTimeType, timePeriodInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyRuleExecInfo {\n");
    
    sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
    sb.append("    execTimeType: ").append(toIndentedString(execTimeType)).append("\n");
    sb.append("    timePeriodInfo: ").append(toIndentedString(timePeriodInfo)).append("\n");
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
