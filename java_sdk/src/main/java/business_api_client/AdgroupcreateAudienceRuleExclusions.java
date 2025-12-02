/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdgroupcreateAudienceRuleExclusionsRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A set of exclusion rule object. Quantity range- 0 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below.[Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
 */
@Schema(description = "A set of exclusion rule object. Quantity range- 0 to 5, without repetition. For the format, see the \"Rule set format\" section below.[Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id=1739566532187138)).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class AdgroupcreateAudienceRuleExclusions {
  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("rules")
  private List<AdgroupcreateAudienceRuleExclusionsRules> rules = null;

  public AdgroupcreateAudienceRuleExclusions operator(String operator) {
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

  public AdgroupcreateAudienceRuleExclusions rules(List<AdgroupcreateAudienceRuleExclusionsRules> rules) {
    this.rules = rules;
    return this;
  }

  public AdgroupcreateAudienceRuleExclusions addRulesItem(AdgroupcreateAudienceRuleExclusionsRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<AdgroupcreateAudienceRuleExclusionsRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<AdgroupcreateAudienceRuleExclusionsRules> getRules() {
    return rules;
  }

  public void setRules(List<AdgroupcreateAudienceRuleExclusionsRules> rules) {
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
    AdgroupcreateAudienceRuleExclusions adgroupcreateAudienceRuleExclusions = (AdgroupcreateAudienceRuleExclusions) o;
    return Objects.equals(this.operator, adgroupcreateAudienceRuleExclusions.operator) &&
        Objects.equals(this.rules, adgroupcreateAudienceRuleExclusions.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateAudienceRuleExclusions {\n");
    
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
