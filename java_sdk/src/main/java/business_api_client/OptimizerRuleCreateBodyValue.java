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
 * OptimizerRuleCreateBodyValue
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class OptimizerRuleCreateBodyValue {
  @JsonProperty("limit")
  private Float limit = null;

  @JsonProperty("use_limit")
  private Boolean useLimit = null;

  @JsonProperty("value")
  private Float value = null;

  public OptimizerRuleCreateBodyValue limit(Float limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Float getLimit() {
    return limit;
  }

  public void setLimit(Float limit) {
    this.limit = limit;
  }

  public OptimizerRuleCreateBodyValue useLimit(Boolean useLimit) {
    this.useLimit = useLimit;
    return this;
  }

   /**
   * Get useLimit
   * @return useLimit
  **/
  @Schema(description = "")
  public Boolean isUseLimit() {
    return useLimit;
  }

  public void setUseLimit(Boolean useLimit) {
    this.useLimit = useLimit;
  }

  public OptimizerRuleCreateBodyValue value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyValue optimizerRuleCreateBodyValue = (OptimizerRuleCreateBodyValue) o;
    return Objects.equals(this.limit, optimizerRuleCreateBodyValue.limit) &&
        Objects.equals(this.useLimit, optimizerRuleCreateBodyValue.useLimit) &&
        Objects.equals(this.value, optimizerRuleCreateBodyValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, useLimit, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyValue {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    useLimit: ").append(toIndentedString(useLimit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
