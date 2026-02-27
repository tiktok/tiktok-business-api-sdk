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
 * AssetShareBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AssetShareBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("asset_type")
  private String assetType = "VIDEO";

  @JsonProperty("material_ids")
  private List<String> materialIds = new ArrayList<String>();

  @JsonProperty("shared_advertiser_ids")
  private List<String> sharedAdvertiserIds = new ArrayList<String>();

  public AssetShareBody advertiserId(String advertiserId) {
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

  public AssetShareBody assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AssetShareBody materialIds(List<String> materialIds) {
    this.materialIds = materialIds;
    return this;
  }

  public AssetShareBody addMaterialIdsItem(String materialIdsItem) {
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * Get materialIds
   * @return materialIds
  **/
  @Schema(required = true, description = "")
  public List<String> getMaterialIds() {
    return materialIds;
  }

  public void setMaterialIds(List<String> materialIds) {
    this.materialIds = materialIds;
  }

  public AssetShareBody sharedAdvertiserIds(List<String> sharedAdvertiserIds) {
    this.sharedAdvertiserIds = sharedAdvertiserIds;
    return this;
  }

  public AssetShareBody addSharedAdvertiserIdsItem(String sharedAdvertiserIdsItem) {
    this.sharedAdvertiserIds.add(sharedAdvertiserIdsItem);
    return this;
  }

   /**
   * Get sharedAdvertiserIds
   * @return sharedAdvertiserIds
  **/
  @Schema(required = true, description = "")
  public List<String> getSharedAdvertiserIds() {
    return sharedAdvertiserIds;
  }

  public void setSharedAdvertiserIds(List<String> sharedAdvertiserIds) {
    this.sharedAdvertiserIds = sharedAdvertiserIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetShareBody assetShareBody = (AssetShareBody) o;
    return Objects.equals(this.advertiserId, assetShareBody.advertiserId) &&
        Objects.equals(this.assetType, assetShareBody.assetType) &&
        Objects.equals(this.materialIds, assetShareBody.materialIds) &&
        Objects.equals(this.sharedAdvertiserIds, assetShareBody.sharedAdvertiserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetType, materialIds, sharedAdvertiserIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetShareBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    sharedAdvertiserIds: ").append(toIndentedString(sharedAdvertiserIds)).append("\n");
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
