/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.adgroupcreateAudienceRuleInclusionsRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A set of inclusion rule object. Quantity range- 1 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below [Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
 */
@Schema(description = "A set of inclusion rule object. Quantity range- 1 to 5, without repetition. For the format, see the \"Rule set format\" section below [Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id=1739566532187138)).")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class adgroupcreateAudienceRuleInclusions {
  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("rules")
  private List<adgroupcreateAudienceRuleInclusionsRules> rules = null;

  public adgroupcreateAudienceRuleInclusions operator(String operator) {
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

  public adgroupcreateAudienceRuleInclusions rules(List<adgroupcreateAudienceRuleInclusionsRules> rules) {
    this.rules = rules;
    return this;
  }

  public adgroupcreateAudienceRuleInclusions addRulesItem(adgroupcreateAudienceRuleInclusionsRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<adgroupcreateAudienceRuleInclusionsRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<adgroupcreateAudienceRuleInclusionsRules> getRules() {
    return rules;
  }

  public void setRules(List<adgroupcreateAudienceRuleInclusionsRules> rules) {
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
    adgroupcreateAudienceRuleInclusions adgroupcreateAudienceRuleInclusions = (adgroupcreateAudienceRuleInclusions) o;
    return Objects.equals(this.operator, adgroupcreateAudienceRuleInclusions.operator) &&
        Objects.equals(this.rules, adgroupcreateAudienceRuleInclusions.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class adgroupcreateAudienceRuleInclusions {\n");
    
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
