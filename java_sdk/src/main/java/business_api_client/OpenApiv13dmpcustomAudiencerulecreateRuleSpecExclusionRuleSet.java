/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet {
  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("rules")
  private List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules> rules = new ArrayList<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules>();

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. Operator between the exclusion rules within the exclusion rule set. Enum value: OR.
   * @return operator
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. Operator between the exclusion rules within the exclusion rule set. Enum value: OR.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet rules(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules> rules) {
    this.rules = rules;
    return this;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet addRulesItem(OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Required when exclusion_rule_set is passed. A list of exclusion rules within the exclusion rule set.
   * @return rules
  **/
  @Schema(required = true, description = "Required when exclusion_rule_set is passed. A list of exclusion rules within the exclusion rule set.")
  public List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules> getRules() {
    return rules;
  }

  public void setRules(List<OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules> rules) {
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
    OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet = (OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet) o;
    return Objects.equals(this.operator, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.operator) &&
        Objects.equals(this.rules, openApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet {\n");
    
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
