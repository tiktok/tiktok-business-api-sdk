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
 * AssetGroupUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class AssetGroupUpdateBody {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("asset_group_id")
  private String assetGroupId = null;

  @JsonProperty("asset_group_name")
  private String assetGroupName = null;

  @JsonProperty("assets")
  private List<BcassetGroupcreateAssets> assets = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("members")
  private List<BcassetGroupcreateMembers> members = null;

  @JsonProperty("update_entity")
  private String updateEntity = null;

  public AssetGroupUpdateBody action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public AssetGroupUpdateBody assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

   /**
   * Get assetGroupId
   * @return assetGroupId
  **/
  @Schema(required = true, description = "")
  public String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public AssetGroupUpdateBody assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

   /**
   * Get assetGroupName
   * @return assetGroupName
  **/
  @Schema(description = "")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  public AssetGroupUpdateBody assets(List<BcassetGroupcreateAssets> assets) {
    this.assets = assets;
    return this;
  }

  public AssetGroupUpdateBody addAssetsItem(BcassetGroupcreateAssets assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<BcassetGroupcreateAssets>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @Schema(description = "")
  public List<BcassetGroupcreateAssets> getAssets() {
    return assets;
  }

  public void setAssets(List<BcassetGroupcreateAssets> assets) {
    this.assets = assets;
  }

  public AssetGroupUpdateBody bcId(String bcId) {
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

  public AssetGroupUpdateBody members(List<BcassetGroupcreateMembers> members) {
    this.members = members;
    return this;
  }

  public AssetGroupUpdateBody addMembersItem(BcassetGroupcreateMembers membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<BcassetGroupcreateMembers>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @Schema(description = "")
  public List<BcassetGroupcreateMembers> getMembers() {
    return members;
  }

  public void setMembers(List<BcassetGroupcreateMembers> members) {
    this.members = members;
  }

  public AssetGroupUpdateBody updateEntity(String updateEntity) {
    this.updateEntity = updateEntity;
    return this;
  }

   /**
   * Get updateEntity
   * @return updateEntity
  **/
  @Schema(required = true, description = "")
  public String getUpdateEntity() {
    return updateEntity;
  }

  public void setUpdateEntity(String updateEntity) {
    this.updateEntity = updateEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupUpdateBody assetGroupUpdateBody = (AssetGroupUpdateBody) o;
    return Objects.equals(this.action, assetGroupUpdateBody.action) &&
        Objects.equals(this.assetGroupId, assetGroupUpdateBody.assetGroupId) &&
        Objects.equals(this.assetGroupName, assetGroupUpdateBody.assetGroupName) &&
        Objects.equals(this.assets, assetGroupUpdateBody.assets) &&
        Objects.equals(this.bcId, assetGroupUpdateBody.bcId) &&
        Objects.equals(this.members, assetGroupUpdateBody.members) &&
        Objects.equals(this.updateEntity, assetGroupUpdateBody.updateEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, assetGroupId, assetGroupName, assets, bcId, members, updateEntity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupUpdateBody {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    updateEntity: ").append(toIndentedString(updateEntity)).append("\n");
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
