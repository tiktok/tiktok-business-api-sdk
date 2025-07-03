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
 * AssetAssignBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class AssetAssignBody {
  @JsonProperty("advertiser_role")
  private String advertiserRole = null;

  @JsonProperty("asset_id")
  private String assetId = null;

  @JsonProperty("asset_type")
  private String assetType = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_role")
  private String catalogRole = null;

  @JsonProperty("form_library_role")
  private String formLibraryRole = null;

  @JsonProperty("store_role")
  private String storeRole = null;

  @JsonProperty("tt_account_roles")
  private List<String> ttAccountRoles = null;

  @JsonProperty("user_id")
  private String userId = null;

  public AssetAssignBody advertiserRole(String advertiserRole) {
    this.advertiserRole = advertiserRole;
    return this;
  }

   /**
   * Get advertiserRole
   * @return advertiserRole
  **/
  @Schema(description = "")
  public String getAdvertiserRole() {
    return advertiserRole;
  }

  public void setAdvertiserRole(String advertiserRole) {
    this.advertiserRole = advertiserRole;
  }

  public AssetAssignBody assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @Schema(required = true, description = "")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public AssetAssignBody assetType(String assetType) {
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

  public AssetAssignBody bcId(String bcId) {
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

  public AssetAssignBody catalogRole(String catalogRole) {
    this.catalogRole = catalogRole;
    return this;
  }

   /**
   * Get catalogRole
   * @return catalogRole
  **/
  @Schema(description = "")
  public String getCatalogRole() {
    return catalogRole;
  }

  public void setCatalogRole(String catalogRole) {
    this.catalogRole = catalogRole;
  }

  public AssetAssignBody formLibraryRole(String formLibraryRole) {
    this.formLibraryRole = formLibraryRole;
    return this;
  }

   /**
   * Get formLibraryRole
   * @return formLibraryRole
  **/
  @Schema(description = "")
  public String getFormLibraryRole() {
    return formLibraryRole;
  }

  public void setFormLibraryRole(String formLibraryRole) {
    this.formLibraryRole = formLibraryRole;
  }

  public AssetAssignBody storeRole(String storeRole) {
    this.storeRole = storeRole;
    return this;
  }

   /**
   * Get storeRole
   * @return storeRole
  **/
  @Schema(description = "")
  public String getStoreRole() {
    return storeRole;
  }

  public void setStoreRole(String storeRole) {
    this.storeRole = storeRole;
  }

  public AssetAssignBody ttAccountRoles(List<String> ttAccountRoles) {
    this.ttAccountRoles = ttAccountRoles;
    return this;
  }

  public AssetAssignBody addTtAccountRolesItem(String ttAccountRolesItem) {
    if (this.ttAccountRoles == null) {
      this.ttAccountRoles = new ArrayList<String>();
    }
    this.ttAccountRoles.add(ttAccountRolesItem);
    return this;
  }

   /**
   * Get ttAccountRoles
   * @return ttAccountRoles
  **/
  @Schema(description = "")
  public List<String> getTtAccountRoles() {
    return ttAccountRoles;
  }

  public void setTtAccountRoles(List<String> ttAccountRoles) {
    this.ttAccountRoles = ttAccountRoles;
  }

  public AssetAssignBody userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(required = true, description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetAssignBody assetAssignBody = (AssetAssignBody) o;
    return Objects.equals(this.advertiserRole, assetAssignBody.advertiserRole) &&
        Objects.equals(this.assetId, assetAssignBody.assetId) &&
        Objects.equals(this.assetType, assetAssignBody.assetType) &&
        Objects.equals(this.bcId, assetAssignBody.bcId) &&
        Objects.equals(this.catalogRole, assetAssignBody.catalogRole) &&
        Objects.equals(this.formLibraryRole, assetAssignBody.formLibraryRole) &&
        Objects.equals(this.storeRole, assetAssignBody.storeRole) &&
        Objects.equals(this.ttAccountRoles, assetAssignBody.ttAccountRoles) &&
        Objects.equals(this.userId, assetAssignBody.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserRole, assetId, assetType, bcId, catalogRole, formLibraryRole, storeRole, ttAccountRoles, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetAssignBody {\n");
    
    sb.append("    advertiserRole: ").append(toIndentedString(advertiserRole)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogRole: ").append(toIndentedString(catalogRole)).append("\n");
    sb.append("    formLibraryRole: ").append(toIndentedString(formLibraryRole)).append("\n");
    sb.append("    storeRole: ").append(toIndentedString(storeRole)).append("\n");
    sb.append("    ttAccountRoles: ").append(toIndentedString(ttAccountRoles)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
