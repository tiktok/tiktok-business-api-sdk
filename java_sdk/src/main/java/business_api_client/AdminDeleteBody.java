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
 * AdminDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AdminDeleteBody {
  @JsonProperty("asset_ids")
  private List<String> assetIds = new ArrayList<String>();

  @JsonProperty("asset_type")
  private String assetType = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("child_bc_id")
  private String childBcId = null;

  public AdminDeleteBody assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public AdminDeleteBody addAssetIdsItem(String assetIdsItem) {
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * Get assetIds
   * @return assetIds
  **/
  @Schema(required = true, description = "")
  public List<String> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }

  public AdminDeleteBody assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(required = true, description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AdminDeleteBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(required = true, description = "")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public AdminDeleteBody childBcId(String childBcId) {
    this.childBcId = childBcId;
    return this;
  }

   /**
   * Get childBcId
   * @return childBcId
  **/
  @Schema(description = "")
  public String getChildBcId() {
    return childBcId;
  }

  public void setChildBcId(String childBcId) {
    this.childBcId = childBcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminDeleteBody adminDeleteBody = (AdminDeleteBody) o;
    return Objects.equals(this.assetIds, adminDeleteBody.assetIds) &&
        Objects.equals(this.assetType, adminDeleteBody.assetType) &&
        Objects.equals(this.bcId, adminDeleteBody.bcId) &&
        Objects.equals(this.childBcId, adminDeleteBody.childBcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, assetType, bcId, childBcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminDeleteBody {\n");
    
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    childBcId: ").append(toIndentedString(childBcId)).append("\n");
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
