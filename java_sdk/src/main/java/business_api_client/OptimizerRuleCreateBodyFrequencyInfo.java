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
/**
 * OptimizerRuleCreateBodyFrequencyInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyFrequencyInfo {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("custom_frequency_type")
  private String customFrequencyType = null;

  @JsonProperty("time")
  private Long time = null;

  @JsonProperty("type")
  private String type = null;

  public OptimizerRuleCreateBodyFrequencyInfo count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public OptimizerRuleCreateBodyFrequencyInfo customFrequencyType(String customFrequencyType) {
    this.customFrequencyType = customFrequencyType;
    return this;
  }

   /**
   * Get customFrequencyType
   * @return customFrequencyType
  **/
  @Schema(description = "")
  public String getCustomFrequencyType() {
    return customFrequencyType;
  }

  public void setCustomFrequencyType(String customFrequencyType) {
    this.customFrequencyType = customFrequencyType;
  }

  public OptimizerRuleCreateBodyFrequencyInfo time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public OptimizerRuleCreateBodyFrequencyInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyFrequencyInfo optimizerRuleCreateBodyFrequencyInfo = (OptimizerRuleCreateBodyFrequencyInfo) o;
    return Objects.equals(this.count, optimizerRuleCreateBodyFrequencyInfo.count) &&
        Objects.equals(this.customFrequencyType, optimizerRuleCreateBodyFrequencyInfo.customFrequencyType) &&
        Objects.equals(this.time, optimizerRuleCreateBodyFrequencyInfo.time) &&
        Objects.equals(this.type, optimizerRuleCreateBodyFrequencyInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, customFrequencyType, time, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyFrequencyInfo {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    customFrequencyType: ").append(toIndentedString(customFrequencyType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
