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
 * OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo {
  @JsonProperty("date_type")
  private String dateType = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("num")
  private List<Long> num = new ArrayList<Long>();

  @JsonProperty("start_time")
  private String startTime = null;

  public OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

   /**
   * Get dateType
   * @return dateType
  **/
  @Schema(required = true, description = "")
  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(required = true, description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo num(List<Long> num) {
    this.num = num;
    return this;
  }

  public OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo addNumItem(Long numItem) {
    this.num.add(numItem);
    return this;
  }

   /**
   * Get num
   * @return num
  **/
  @Schema(required = true, description = "")
  public List<Long> getNum() {
    return num;
  }

  public void setNum(List<Long> num) {
    this.num = num;
  }

  public OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(required = true, description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo optimizerRuleCreateBodyRuleExecInfoTimePeriodInfo = (OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo) o;
    return Objects.equals(this.dateType, optimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.dateType) &&
        Objects.equals(this.endTime, optimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.endTime) &&
        Objects.equals(this.num, optimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.num) &&
        Objects.equals(this.startTime, optimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateType, endTime, num, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo {\n");
    
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
