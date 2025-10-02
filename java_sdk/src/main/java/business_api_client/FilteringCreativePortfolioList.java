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
 * FilteringCreativePortfolioList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class FilteringCreativePortfolioList {
  @JsonProperty("creative_portfolio_ids")
  private List<String> creativePortfolioIds = null;

  @JsonProperty("creative_portfolio_types")
  private List<String> creativePortfolioTypes = null;

  public FilteringCreativePortfolioList creativePortfolioIds(List<String> creativePortfolioIds) {
    this.creativePortfolioIds = creativePortfolioIds;
    return this;
  }

  public FilteringCreativePortfolioList addCreativePortfolioIdsItem(String creativePortfolioIdsItem) {
    if (this.creativePortfolioIds == null) {
      this.creativePortfolioIds = new ArrayList<String>();
    }
    this.creativePortfolioIds.add(creativePortfolioIdsItem);
    return this;
  }

   /**
   * Get creativePortfolioIds
   * @return creativePortfolioIds
  **/
  @Schema(description = "")
  public List<String> getCreativePortfolioIds() {
    return creativePortfolioIds;
  }

  public void setCreativePortfolioIds(List<String> creativePortfolioIds) {
    this.creativePortfolioIds = creativePortfolioIds;
  }

  public FilteringCreativePortfolioList creativePortfolioTypes(List<String> creativePortfolioTypes) {
    this.creativePortfolioTypes = creativePortfolioTypes;
    return this;
  }

  public FilteringCreativePortfolioList addCreativePortfolioTypesItem(String creativePortfolioTypesItem) {
    if (this.creativePortfolioTypes == null) {
      this.creativePortfolioTypes = new ArrayList<String>();
    }
    this.creativePortfolioTypes.add(creativePortfolioTypesItem);
    return this;
  }

   /**
   * Get creativePortfolioTypes
   * @return creativePortfolioTypes
  **/
  @Schema(description = "")
  public List<String> getCreativePortfolioTypes() {
    return creativePortfolioTypes;
  }

  public void setCreativePortfolioTypes(List<String> creativePortfolioTypes) {
    this.creativePortfolioTypes = creativePortfolioTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringCreativePortfolioList filteringCreativePortfolioList = (FilteringCreativePortfolioList) o;
    return Objects.equals(this.creativePortfolioIds, filteringCreativePortfolioList.creativePortfolioIds) &&
        Objects.equals(this.creativePortfolioTypes, filteringCreativePortfolioList.creativePortfolioTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativePortfolioIds, creativePortfolioTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringCreativePortfolioList {\n");
    
    sb.append("    creativePortfolioIds: ").append(toIndentedString(creativePortfolioIds)).append("\n");
    sb.append("    creativePortfolioTypes: ").append(toIndentedString(creativePortfolioTypes)).append("\n");
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
