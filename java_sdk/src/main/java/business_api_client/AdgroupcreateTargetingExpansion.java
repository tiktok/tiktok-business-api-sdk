/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Settings about targeting expansion
 */
@Schema(description = "Settings about targeting expansion")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class AdgroupcreateTargetingExpansion {
  @JsonProperty("expansion_enabled")
  private Boolean expansionEnabled = null;

  @JsonProperty("expansion_types")
  private List<String> expansionTypes = null;

  public AdgroupcreateTargetingExpansion expansionEnabled(Boolean expansionEnabled) {
    this.expansionEnabled = expansionEnabled;
    return this;
  }

   /**
   * Whether to enable targeting expansion
   * @return expansionEnabled
  **/
  @Schema(description = "Whether to enable targeting expansion")
  public Boolean isExpansionEnabled() {
    return expansionEnabled;
  }

  public void setExpansionEnabled(Boolean expansionEnabled) {
    this.expansionEnabled = expansionEnabled;
  }

  public AdgroupcreateTargetingExpansion expansionTypes(List<String> expansionTypes) {
    this.expansionTypes = expansionTypes;
    return this;
  }

  public AdgroupcreateTargetingExpansion addExpansionTypesItem(String expansionTypesItem) {
    if (this.expansionTypes == null) {
      this.expansionTypes = new ArrayList<String>();
    }
    this.expansionTypes.add(expansionTypesItem);
    return this;
  }

   /**
   * The target audience types that you want to expand. Required when &#x60;expansion_enabled&#x60; is &#x60;true&#x60;. Target audience types that are eligible for expanding must already have a value or selection. Enum values- &#x60;AGE&#x60;&#x60;GENDER&#x60;&#x60;INTEREST_AND_BEHAVIOR&#x60;- This type includes &#x60;ad_tag_v2&#x60;, &#x60;video_action&#x60;,  &#x60;action_categories&#x60;, and &#x60;action_scene&#x60;. &#x60;CUSTOM_AUDIENCE&#x60;- This type includes &#x60;retargeting_tags&#x60; and &#x60;retargeting_tags_exclude&#x60;.
   * @return expansionTypes
  **/
  @Schema(description = "The target audience types that you want to expand. Required when `expansion_enabled` is `true`. Target audience types that are eligible for expanding must already have a value or selection. Enum values- `AGE``GENDER``INTEREST_AND_BEHAVIOR`- This type includes `ad_tag_v2`, `video_action`,  `action_categories`, and `action_scene`. `CUSTOM_AUDIENCE`- This type includes `retargeting_tags` and `retargeting_tags_exclude`.")
  public List<String> getExpansionTypes() {
    return expansionTypes;
  }

  public void setExpansionTypes(List<String> expansionTypes) {
    this.expansionTypes = expansionTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupcreateTargetingExpansion adgroupcreateTargetingExpansion = (AdgroupcreateTargetingExpansion) o;
    return Objects.equals(this.expansionEnabled, adgroupcreateTargetingExpansion.expansionEnabled) &&
        Objects.equals(this.expansionTypes, adgroupcreateTargetingExpansion.expansionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expansionEnabled, expansionTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateTargetingExpansion {\n");
    
    sb.append("    expansionEnabled: ").append(toIndentedString(expansionEnabled)).append("\n");
    sb.append("    expansionTypes: ").append(toIndentedString(expansionTypes)).append("\n");
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
