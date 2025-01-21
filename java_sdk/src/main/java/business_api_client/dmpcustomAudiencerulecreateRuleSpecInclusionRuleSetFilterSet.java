/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The set of filters for each inclusion rule.
 */
@Schema(description = "The set of filters for each inclusion rule.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet {
  @JsonProperty("filters")
  private List<dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters> filters = new ArrayList<dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters>();

  @JsonProperty("operator")
  private String operator = null;

  public dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet filters(List<dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters> filters) {
    this.filters = filters;
    return this;
  }

  public dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet addFiltersItem(dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
   * @return filters
  **/
  @Schema(required = true, description = "An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.")
  public List<dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters> filters) {
    this.filters = filters;
  }

  public dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator between filters in the filters object array. Enum value: OR. Within each inclusion rule, you can only specify one object in filters.
   * @return operator
  **/
  @Schema(required = true, description = "Operator between filters in the filters object array. Enum value: OR. Within each inclusion rule, you can only specify one object in filters.")
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
    dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet = (dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet) o;
    return Objects.equals(this.filters, dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.filters) &&
        Objects.equals(this.operator, dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet {\n");
    
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
