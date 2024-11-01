/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Required when exclusion_rule_set is passed. The set of filters for the exclusion rule.
 */
@Schema(description = "Required when exclusion_rule_set is passed. The set of filters for the exclusion rule.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet {
  @JsonProperty("filters")
  private List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters> filters = new ArrayList<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters>();

  @JsonProperty("operator")
  private String operator = null;

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet filters(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters> filters) {
    this.filters = filters;
    return this;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet addFiltersItem(OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
   * @return filters
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.")
  public List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters> filters) {
    this.filters = filters;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. Operator between filters in the filters object array. Enum value: OR. Within each exclusion rule, you can only specify one object in filters.
   * @return operator
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. Operator between filters in the filters object array. Enum value: OR. Within each exclusion rule, you can only specify one object in filters.")
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
    OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet = (OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet) o;
    return Objects.equals(this.filters, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.filters) &&
        Objects.equals(this.operator, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet {\n");
    
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