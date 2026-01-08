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
 * AdgroupcreateIncludedCustomActions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class AdgroupcreateIncludedCustomActions {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("days")
  private Integer days = null;

  public AdgroupcreateIncludedCustomActions code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AdgroupcreateIncludedCustomActions days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @Schema(description = "")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupcreateIncludedCustomActions adgroupcreateIncludedCustomActions = (AdgroupcreateIncludedCustomActions) o;
    return Objects.equals(this.code, adgroupcreateIncludedCustomActions.code) &&
        Objects.equals(this.days, adgroupcreateIncludedCustomActions.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateIncludedCustomActions {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
