/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet;
import business_api_client.DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Rule of the audience.
 */
@Schema(description = "Rule of the audience.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class DmpcustomAudiencerulecreateRuleSpec {
  @JsonProperty("exclusion_rule_set")
  private DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet = null;

  @JsonProperty("inclusion_rule_set")
  private DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet = null;

  public DmpcustomAudiencerulecreateRuleSpec exclusionRuleSet(DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet) {
    this.exclusionRuleSet = exclusionRuleSet;
    return this;
  }

   /**
   * Get exclusionRuleSet
   * @return exclusionRuleSet
  **/
  @Schema(description = "")
  public DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet getExclusionRuleSet() {
    return exclusionRuleSet;
  }

  public void setExclusionRuleSet(DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet) {
    this.exclusionRuleSet = exclusionRuleSet;
  }

  public DmpcustomAudiencerulecreateRuleSpec inclusionRuleSet(DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet) {
    this.inclusionRuleSet = inclusionRuleSet;
    return this;
  }

   /**
   * Get inclusionRuleSet
   * @return inclusionRuleSet
  **/
  @Schema(required = true, description = "")
  public DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet getInclusionRuleSet() {
    return inclusionRuleSet;
  }

  public void setInclusionRuleSet(DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet) {
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
    DmpcustomAudiencerulecreateRuleSpec dmpcustomAudiencerulecreateRuleSpec = (DmpcustomAudiencerulecreateRuleSpec) o;
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
    sb.append("class DmpcustomAudiencerulecreateRuleSpec {\n");
    
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
