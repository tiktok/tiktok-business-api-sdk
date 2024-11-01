/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("parameter_filters")
  private List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters> parameterFilters = null;

  @JsonProperty("value")
  private String value = null;

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. Filter field. Enum value: EVENT: To exclude the people who&#x27;ve carried out a certain action in the past few days as indicated by retention_days.
   * @return field
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. Filter field. Enum value: EVENT: To exclude the people who've carried out a certain action in the past few days as indicated by retention_days.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. Filter operator between filter field and filter value. Enum value: EQ: equals.
   * @return operator
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. Filter operator between filter field and filter value. Enum value: EQ: equals.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters parameterFilters(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters> parameterFilters) {
    this.parameterFilters = parameterFilters;
    return this;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters addParameterFiltersItem(OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters parameterFiltersItem) {
    if (this.parameterFilters == null) {
      this.parameterFilters = new ArrayList<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters>();
    }
    this.parameterFilters.add(parameterFiltersItem);
    return this;
  }

   /**
   * List of filters on URL keywords or parameters. Within parameter_filters, you can add a maximum of one URL keyword filter (with field set to URL) and 10 parameter filters (with field not set to URL) . If specified, these filters (parameter_filters) are combined with the action filter (as specified by field, operator and value) using default AND logic to form the exclusion rule. For example, if retention_days is 30 and filter_set is set to {\&quot;operator\&quot;: \&quot;OR\&quot;, \&quot;filters\&quot;:[{\&quot;field\&quot;:\&quot;EVENT\&quot;,\&quot;operator\&quot;:\&quot;EQ\&quot;, \&quot;value\&quot;:\&quot;PIXEL COMPLETE PAYMENT\&quot;},\&quot;parameter_filters\&quot;:[{\&quot;field\&quot;:\&quot;URL\&quot;,\&quot;operator\&quot;:\&quot;CONTAINS\&quot;,\&quot;value\&quot;:\&quot;us\&quot;}]]}, the exclusion rule will create an audience that excludes people who carried out the \&quot;Complete Payment\&quot; action on a webpage with \&quot;us\&quot; included in the page URL within the past 30 days on the website where the Pixel is installed.
   * @return parameterFilters
  **/
  @Schema(description = "List of filters on URL keywords or parameters. Within parameter_filters, you can add a maximum of one URL keyword filter (with field set to URL) and 10 parameter filters (with field not set to URL) . If specified, these filters (parameter_filters) are combined with the action filter (as specified by field, operator and value) using default AND logic to form the exclusion rule. For example, if retention_days is 30 and filter_set is set to {\"operator\": \"OR\", \"filters\":[{\"field\":\"EVENT\",\"operator\":\"EQ\", \"value\":\"PIXEL COMPLETE PAYMENT\"},\"parameter_filters\":[{\"field\":\"URL\",\"operator\":\"CONTAINS\",\"value\":\"us\"}]]}, the exclusion rule will create an audience that excludes people who carried out the \"Complete Payment\" action on a webpage with \"us\" included in the page URL within the past 30 days on the website where the Pixel is installed.")
  public List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters> getParameterFilters() {
    return parameterFilters;
  }

  public void setParameterFilters(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters> parameterFilters) {
    this.parameterFilters = parameterFilters;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. Filter value. For enum values, see Enumeration - Filter Value.
   * @return value
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. Filter value. For enum values, see Enumeration - Filter Value.")
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
    OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters = (OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters) o;
    return Objects.equals(this.field, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.field) &&
        Objects.equals(this.operator, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.operator) &&
        Objects.equals(this.parameterFilters, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.parameterFilters) &&
        Objects.equals(this.value, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, parameterFilters, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameterFilters: ").append(toIndentedString(parameterFilters)).append("\n");
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
