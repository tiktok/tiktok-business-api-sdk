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
 * DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("values")
  private List<String> values = new ArrayList<String>();

  public DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Required when parameter_filters within exclusion_rule_set is passed. Filter condition. Use this field to specify whether to filter URL keywords, or Web Event parameters reported via the Pixel. Enum value: URL: URL keywords. CONTENT_TYPE: the parameter content_type. PRICE: the parameter price. VALUE: the parameter value. CONTENT_ID: the parameter content_id. CONTENT_CATEGORY: the parameter content_category.
   * @return field
  **/
  @Schema(required = true, description = "Required when parameter_filters within exclusion_rule_set is passed. Filter condition. Use this field to specify whether to filter URL keywords, or Web Event parameters reported via the Pixel. Enum value: URL: URL keywords. CONTENT_TYPE: the parameter content_type. PRICE: the parameter price. VALUE: the parameter value. CONTENT_ID: the parameter content_id. CONTENT_CATEGORY: the parameter content_category.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Required when parameter_filters within exclusion_rule_set is passed. Filter operator between filter condition and filter value. Enum value: CONTAINS: contains. DOES_NOT_CONTAIN: doesn&#x27;t contain. EQ: equals. IS_LESS_THAN: is less than. IS_GREATER_THAN: is greater than. IS_LESS_THAN_OR_EQUAL_TO: is less than or equal to. IS_GRETER_THAN_OR_EQUAL_TO: is greater than or equal to. The allowed values vary based on the field value: If field is set to URL, operator can only be set to CONTAINS, DOES_NOT_CONTAIN, or EQ. If field is not set to URL, operator can be set to CONTAINS, DOES_NOT_CONTAINS, EQ, IS_LESS_THAN, IS_GREATER_THAN, IS_LESS_THAN_OR_EQUAL_TO, or IS_GREATER_THAN_OR_EQUAL_TO.
   * @return operator
  **/
  @Schema(required = true, description = "Required when parameter_filters within exclusion_rule_set is passed. Filter operator between filter condition and filter value. Enum value: CONTAINS: contains. DOES_NOT_CONTAIN: doesn't contain. EQ: equals. IS_LESS_THAN: is less than. IS_GREATER_THAN: is greater than. IS_LESS_THAN_OR_EQUAL_TO: is less than or equal to. IS_GRETER_THAN_OR_EQUAL_TO: is greater than or equal to. The allowed values vary based on the field value: If field is set to URL, operator can only be set to CONTAINS, DOES_NOT_CONTAIN, or EQ. If field is not set to URL, operator can be set to CONTAINS, DOES_NOT_CONTAINS, EQ, IS_LESS_THAN, IS_GREATER_THAN, IS_LESS_THAN_OR_EQUAL_TO, or IS_GREATER_THAN_OR_EQUAL_TO.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters values(List<String> values) {
    this.values = values;
    return this;
  }

  public DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Required when parameter_filters within exclusion_rule_set is passed. A list of filter values. Max size: 10. Length limit for each value: 100 characters. If you specify multiple values, the values will be combined using OR logic.
   * @return values
  **/
  @Schema(required = true, description = "Required when parameter_filters within exclusion_rule_set is passed. A list of filter values. Max size: 10. Length limit for each value: 100 characters. If you specify multiple values, the values will be combined using OR logic.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters = (DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters) o;
    return Objects.equals(this.field, dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters.field) &&
        Objects.equals(this.operator, dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters.operator) &&
        Objects.equals(this.values, dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
