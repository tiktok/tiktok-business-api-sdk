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
 * AdgroupcreateAudienceRuleExclusionsFilterFilters
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class AdgroupcreateAudienceRuleExclusionsFilterFilters {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("value")
  private String value = null;

  public AdgroupcreateAudienceRuleExclusionsFilterFilters field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(description = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public AdgroupcreateAudienceRuleExclusionsFilterFilters operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public AdgroupcreateAudienceRuleExclusionsFilterFilters value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    AdgroupcreateAudienceRuleExclusionsFilterFilters adgroupcreateAudienceRuleExclusionsFilterFilters = (AdgroupcreateAudienceRuleExclusionsFilterFilters) o;
    return Objects.equals(this.field, adgroupcreateAudienceRuleExclusionsFilterFilters.field) &&
        Objects.equals(this.operator, adgroupcreateAudienceRuleExclusionsFilterFilters.operator) &&
        Objects.equals(this.value, adgroupcreateAudienceRuleExclusionsFilterFilters.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateAudienceRuleExclusionsFilterFilters {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
