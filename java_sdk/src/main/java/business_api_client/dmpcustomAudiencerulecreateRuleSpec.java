/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet;
import business_api_client.dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Rule of the audience.
 */
@Schema(description = "Rule of the audience.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class dmpcustomAudiencerulecreateRuleSpec {
  @JsonProperty("exclusion_rule_set")
  private dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet = null;

  @JsonProperty("inclusion_rule_set")
  private dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet = null;

  public dmpcustomAudiencerulecreateRuleSpec exclusionRuleSet(dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet) {
    this.exclusionRuleSet = exclusionRuleSet;
    return this;
  }

   /**
   * Get exclusionRuleSet
   * @return exclusionRuleSet
  **/
  @Schema(description = "")
  public dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet getExclusionRuleSet() {
    return exclusionRuleSet;
  }

  public void setExclusionRuleSet(dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet) {
    this.exclusionRuleSet = exclusionRuleSet;
  }

  public dmpcustomAudiencerulecreateRuleSpec inclusionRuleSet(dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet) {
    this.inclusionRuleSet = inclusionRuleSet;
    return this;
  }

   /**
   * Get inclusionRuleSet
   * @return inclusionRuleSet
  **/
  @Schema(required = true, description = "")
  public dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet getInclusionRuleSet() {
    return inclusionRuleSet;
  }

  public void setInclusionRuleSet(dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet) {
    this.inclusionRuleSet = inclusionRuleSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    dmpcustomAudiencerulecreateRuleSpec dmpcustomAudiencerulecreateRuleSpec = (dmpcustomAudiencerulecreateRuleSpec) o;
    return Objects.equals(this.exclusionRuleSet, dmpcustomAudiencerulecreateRuleSpec.exclusionRuleSet) &&
        Objects.equals(this.inclusionRuleSet, dmpcustomAudiencerulecreateRuleSpec.inclusionRuleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionRuleSet, inclusionRuleSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class dmpcustomAudiencerulecreateRuleSpec {\n");
    
    sb.append("    exclusionRuleSet: ").append(toIndentedString(exclusionRuleSet)).append("\n");
    sb.append("    inclusionRuleSet: ").append(toIndentedString(inclusionRuleSet)).append("\n");
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
