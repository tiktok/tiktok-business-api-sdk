/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OptimizerRuleUpdateBodyRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OptimizerRuleUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class OptimizerRuleUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("lang")
  private String lang = "EN";

  @JsonProperty("rules")
  private List<OptimizerRuleUpdateBodyRules> rules = new ArrayList<OptimizerRuleUpdateBodyRules>();

  public OptimizerRuleUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public OptimizerRuleUpdateBody lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public OptimizerRuleUpdateBody rules(List<OptimizerRuleUpdateBodyRules> rules) {
    this.rules = rules;
    return this;
  }

  public OptimizerRuleUpdateBody addRulesItem(OptimizerRuleUpdateBodyRules rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(required = true, description = "")
  public List<OptimizerRuleUpdateBodyRules> getRules() {
    return rules;
  }

  public void setRules(List<OptimizerRuleUpdateBodyRules> rules) {
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
    OptimizerRuleUpdateBody optimizerRuleUpdateBody = (OptimizerRuleUpdateBody) o;
    return Objects.equals(this.advertiserId, optimizerRuleUpdateBody.advertiserId) &&
        Objects.equals(this.lang, optimizerRuleUpdateBody.lang) &&
        Objects.equals(this.rules, optimizerRuleUpdateBody.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, lang, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
