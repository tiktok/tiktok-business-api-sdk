/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.BcassetGroupcreateAssets;
import business_api_client.BcassetGroupcreateMembers;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AssetGroupCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class AssetGroupCreateBody {
  @JsonProperty("asset_group_name")
  private String assetGroupName = null;

  @JsonProperty("assets")
  private List<BcassetGroupcreateAssets> assets = new ArrayList<BcassetGroupcreateAssets>();

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("members")
  private List<BcassetGroupcreateMembers> members = new ArrayList<BcassetGroupcreateMembers>();

  public AssetGroupCreateBody assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

   /**
   * Get assetGroupName
   * @return assetGroupName
  **/
  @Schema(required = true, description = "")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  public AssetGroupCreateBody assets(List<BcassetGroupcreateAssets> assets) {
    this.assets = assets;
    return this;
  }

  public AssetGroupCreateBody addAssetsItem(BcassetGroupcreateAssets assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @Schema(required = true, description = "")
  public List<BcassetGroupcreateAssets> getAssets() {
    return assets;
  }

  public void setAssets(List<BcassetGroupcreateAssets> assets) {
    this.assets = assets;
  }

  public AssetGroupCreateBody bcId(String bcId) {
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

  public AssetGroupCreateBody members(List<BcassetGroupcreateMembers> members) {
    this.members = members;
    return this;
  }

  public AssetGroupCreateBody addMembersItem(BcassetGroupcreateMembers membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @Schema(required = true, description = "")
  public List<BcassetGroupcreateMembers> getMembers() {
    return members;
  }

  public void setMembers(List<BcassetGroupcreateMembers> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupCreateBody assetGroupCreateBody = (AssetGroupCreateBody) o;
    return Objects.equals(this.assetGroupName, assetGroupCreateBody.assetGroupName) &&
        Objects.equals(this.assets, assetGroupCreateBody.assets) &&
        Objects.equals(this.bcId, assetGroupCreateBody.bcId) &&
        Objects.equals(this.members, assetGroupCreateBody.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupName, assets, bcId, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupCreateBody {\n");
    
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
