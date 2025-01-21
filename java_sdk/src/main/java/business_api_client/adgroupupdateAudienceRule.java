/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.adgroupcreateAudienceRuleInclusions;
import business_api_client.adgroupupdateAudienceRuleExclusions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
 */
@Schema(description = "List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class adgroupupdateAudienceRule {
  @JsonProperty("exclusions")
  private adgroupupdateAudienceRuleExclusions exclusions = null;

  @JsonProperty("inclusions")
  private adgroupcreateAudienceRuleInclusions inclusions = null;

  public adgroupupdateAudienceRule exclusions(adgroupupdateAudienceRuleExclusions exclusions) {
    this.exclusions = exclusions;
    return this;
  }

   /**
   * Get exclusions
   * @return exclusions
  **/
  @Schema(description = "")
  public adgroupupdateAudienceRuleExclusions getExclusions() {
    return exclusions;
  }

  public void setExclusions(adgroupupdateAudienceRuleExclusions exclusions) {
    this.exclusions = exclusions;
  }

  public adgroupupdateAudienceRule inclusions(adgroupcreateAudienceRuleInclusions inclusions) {
    this.inclusions = inclusions;
    return this;
  }

   /**
   * Get inclusions
   * @return inclusions
  **/
  @Schema(description = "")
  public adgroupcreateAudienceRuleInclusions getInclusions() {
    return inclusions;
  }

  public void setInclusions(adgroupcreateAudienceRuleInclusions inclusions) {
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
    adgroupupdateAudienceRule adgroupupdateAudienceRule = (adgroupupdateAudienceRule) o;
    return Objects.equals(this.exclusions, adgroupupdateAudienceRule.exclusions) &&
        Objects.equals(this.inclusions, adgroupupdateAudienceRule.inclusions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusions, inclusions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class adgroupupdateAudienceRule {\n");
    
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
