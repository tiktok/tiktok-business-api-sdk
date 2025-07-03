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
 * AssetDeleteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class AssetDeleteBody {
  @JsonProperty("asset_ids")
  private List<String> assetIds = new ArrayList<String>();

  @JsonProperty("asset_type")
  private String assetType = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("partner_id")
  private String partnerId = null;

  public AssetDeleteBody assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public AssetDeleteBody addAssetIdsItem(String assetIdsItem) {
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

  public AssetDeleteBody assetType(String assetType) {
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

  public AssetDeleteBody bcId(String bcId) {
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

  public AssetDeleteBody partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @Schema(required = true, description = "")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetDeleteBody assetDeleteBody = (AssetDeleteBody) o;
    return Objects.equals(this.assetIds, assetDeleteBody.assetIds) &&
        Objects.equals(this.assetType, assetDeleteBody.assetType) &&
        Objects.equals(this.bcId, assetDeleteBody.bcId) &&
        Objects.equals(this.partnerId, assetDeleteBody.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, assetType, bcId, partnerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetDeleteBody {\n");
    
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
