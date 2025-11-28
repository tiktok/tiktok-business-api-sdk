/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdgroupcreateAudienceRuleExclusions;
import business_api_client.AdgroupcreateAudienceRuleInclusions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
 */
@Schema(description = "List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class AdgroupcreateAudienceRule {
  @JsonProperty("exclusions")
  private AdgroupcreateAudienceRuleExclusions exclusions = null;

  @JsonProperty("inclusions")
  private AdgroupcreateAudienceRuleInclusions inclusions = null;

  public AdgroupcreateAudienceRule exclusions(AdgroupcreateAudienceRuleExclusions exclusions) {
    this.exclusions = exclusions;
    return this;
  }

   /**
   * Get exclusions
   * @return exclusions
  **/
  @Schema(description = "")
  public AdgroupcreateAudienceRuleExclusions getExclusions() {
    return exclusions;
  }

  public void setExclusions(AdgroupcreateAudienceRuleExclusions exclusions) {
    this.exclusions = exclusions;
  }

  public AdgroupcreateAudienceRule inclusions(AdgroupcreateAudienceRuleInclusions inclusions) {
    this.inclusions = inclusions;
    return this;
  }

   /**
   * Get inclusions
   * @return inclusions
  **/
  @Schema(description = "")
  public AdgroupcreateAudienceRuleInclusions getInclusions() {
    return inclusions;
  }

  public void setInclusions(AdgroupcreateAudienceRuleInclusions inclusions) {
    this.inclusions = inclusions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupcreateAudienceRule adgroupcreateAudienceRule = (AdgroupcreateAudienceRule) o;
    return Objects.equals(this.exclusions, adgroupcreateAudienceRule.exclusions) &&
        Objects.equals(this.inclusions, adgroupcreateAudienceRule.inclusions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusions, inclusions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateAudienceRule {\n");
    
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    inclusions: ").append(toIndentedString(inclusions)).append("\n");
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
