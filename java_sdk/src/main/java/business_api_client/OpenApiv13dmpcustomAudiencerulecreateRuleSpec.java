/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet;
import business_api_client.OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Rule of the audience.
 */
@Schema(description = "Rule of the audience.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencerulecreateRuleSpec {
  @JsonProperty("exclusion_rule_set")
  private OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet = null;

  @JsonProperty("inclusion_rule_set")
  private OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet = null;

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpec exclusionRuleSet(OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet) {
    this.exclusionRuleSet = exclusionRuleSet;
    return this;
  }

   /**
   * Get exclusionRuleSet
   * @return exclusionRuleSet
  **/
  @Schema(description = "")
  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet getExclusionRuleSet() {
    return exclusionRuleSet;
  }

  public void setExclusionRuleSet(OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet exclusionRuleSet) {
    this.exclusionRuleSet = exclusionRuleSet;
  }

  public OpenApiv13dmpcustomAudiencerulecreateRuleSpec inclusionRuleSet(OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet) {
    this.inclusionRuleSet = inclusionRuleSet;
    return this;
  }

   /**
   * Get inclusionRuleSet
   * @return inclusionRuleSet
  **/
  @Schema(required = true, description = "")
  public OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet getInclusionRuleSet() {
    return inclusionRuleSet;
  }

  public void setInclusionRuleSet(OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet inclusionRuleSet) {
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
    OpenApiv13dmpcustomAudiencerulecreateRuleSpec openApiv13dmpcustomAudiencerulecreateRuleSpec = (OpenApiv13dmpcustomAudiencerulecreateRuleSpec) o;
    return Objects.equals(this.exclusionRuleSet, openApiv13dmpcustomAudiencerulecreateRuleSpec.exclusionRuleSet) &&
        Objects.equals(this.inclusionRuleSet, openApiv13dmpcustomAudiencerulecreateRuleSpec.inclusionRuleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionRuleSet, inclusionRuleSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencerulecreateRuleSpec {\n");
    
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
