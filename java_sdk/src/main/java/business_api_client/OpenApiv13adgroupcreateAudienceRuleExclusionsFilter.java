/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OpenApiv13adgroupcreateAudienceRuleExclusionsFilter
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13adgroupcreateAudienceRuleExclusionsFilter {
  @JsonProperty("filters")
  private List<OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters> filters = null;

  @JsonProperty("operator")
  private String operator = null;

  public OpenApiv13adgroupcreateAudienceRuleExclusionsFilter filters(List<OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters> filters) {
    this.filters = filters;
    return this;
  }

  public OpenApiv13adgroupcreateAudienceRuleExclusionsFilter addFiltersItem(OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Schema(description = "")
  public List<OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters> filters) {
    this.filters = filters;
  }

  public OpenApiv13adgroupcreateAudienceRuleExclusionsFilter operator(String operator) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13adgroupcreateAudienceRuleExclusionsFilter openApiv13adgroupcreateAudienceRuleExclusionsFilter = (OpenApiv13adgroupcreateAudienceRuleExclusionsFilter) o;
    return Objects.equals(this.filters, openApiv13adgroupcreateAudienceRuleExclusionsFilter.filters) &&
        Objects.equals(this.operator, openApiv13adgroupcreateAudienceRuleExclusionsFilter.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13adgroupcreateAudienceRuleExclusionsFilter {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
