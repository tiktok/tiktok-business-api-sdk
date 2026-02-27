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
 * AdgroupupdateTargetingExpansion
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdgroupupdateTargetingExpansion {
  @JsonProperty("expansion_enabled")
  private Boolean expansionEnabled = null;

  @JsonProperty("expansion_types")
  private List<String> expansionTypes = null;

  public AdgroupupdateTargetingExpansion expansionEnabled(Boolean expansionEnabled) {
    this.expansionEnabled = expansionEnabled;
    return this;
  }

   /**
   * Get expansionEnabled
   * @return expansionEnabled
  **/
  @Schema(description = "")
  public Boolean isExpansionEnabled() {
    return expansionEnabled;
  }

  public void setExpansionEnabled(Boolean expansionEnabled) {
    this.expansionEnabled = expansionEnabled;
  }

  public AdgroupupdateTargetingExpansion expansionTypes(List<String> expansionTypes) {
    this.expansionTypes = expansionTypes;
    return this;
  }

  public AdgroupupdateTargetingExpansion addExpansionTypesItem(String expansionTypesItem) {
    if (this.expansionTypes == null) {
      this.expansionTypes = new ArrayList<String>();
    }
    this.expansionTypes.add(expansionTypesItem);
    return this;
  }

   /**
   * Get expansionTypes
   * @return expansionTypes
  **/
  @Schema(description = "")
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
    AdgroupupdateTargetingExpansion adgroupupdateTargetingExpansion = (AdgroupupdateTargetingExpansion) o;
    return Objects.equals(this.expansionEnabled, adgroupupdateTargetingExpansion.expansionEnabled) &&
        Objects.equals(this.expansionTypes, adgroupupdateTargetingExpansion.expansionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expansionEnabled, expansionTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupupdateTargetingExpansion {\n");
    
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
