/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of the inclusion rule set.
 */
@Schema(description = "Details of the inclusion rule set.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet {
  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("rules")
  private List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules> rules = new ArrayList<OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules>();

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator between the inclusion rules within the inclusion rule set. Enum value: OR. If you provide more than one inclusion rule, the inclusion rules will be combined using OR logic to broaden the audience.
   * @return operator
  **/
  @Schema(required = true, description = "Operator between the inclusion rules within the inclusion rule set. Enum value: OR. If you provide more than one inclusion rule, the inclusion rules will be combined using OR logic to broaden the audience.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet rules(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules> rules) {
    this.rules = rules;
    return this;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet addRulesItem(OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of inclusion rules within the inclusion rule set.
   * @return rules
  **/
  @Schema(required = true, description = "A list of inclusion rules within the inclusion rule set.")
  public List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules> getRules() {
    return rules;
  }

  public void setRules(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet openApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet = (OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet) o;
    return Objects.equals(this.operator, openApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.operator) &&
        Objects.equals(this.rules, openApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
