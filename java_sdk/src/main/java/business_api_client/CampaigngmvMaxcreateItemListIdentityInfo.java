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
/**
 * CampaigngmvMaxcreateItemListIdentityInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class CampaigngmvMaxcreateItemListIdentityInfo {
  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_authorized_shop_id")
  private String identityAuthorizedShopId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("store_id")
  private String storeId = null;

  public CampaigngmvMaxcreateItemListIdentityInfo identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * Get identityAuthorizedBcId
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public CampaigngmvMaxcreateItemListIdentityInfo identityAuthorizedShopId(String identityAuthorizedShopId) {
    this.identityAuthorizedShopId = identityAuthorizedShopId;
    return this;
  }

   /**
   * Get identityAuthorizedShopId
   * @return identityAuthorizedShopId
  **/
  @Schema(description = "")
  public String getIdentityAuthorizedShopId() {
    return identityAuthorizedShopId;
  }

  public void setIdentityAuthorizedShopId(String identityAuthorizedShopId) {
    this.identityAuthorizedShopId = identityAuthorizedShopId;
  }

  public CampaigngmvMaxcreateItemListIdentityInfo identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(required = true, description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public CampaigngmvMaxcreateItemListIdentityInfo identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(required = true, description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public CampaigngmvMaxcreateItemListIdentityInfo storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @Schema(description = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaigngmvMaxcreateItemListIdentityInfo campaigngmvMaxcreateItemListIdentityInfo = (CampaigngmvMaxcreateItemListIdentityInfo) o;
    return Objects.equals(this.identityAuthorizedBcId, campaigngmvMaxcreateItemListIdentityInfo.identityAuthorizedBcId) &&
        Objects.equals(this.identityAuthorizedShopId, campaigngmvMaxcreateItemListIdentityInfo.identityAuthorizedShopId) &&
        Objects.equals(this.identityId, campaigngmvMaxcreateItemListIdentityInfo.identityId) &&
        Objects.equals(this.identityType, campaigngmvMaxcreateItemListIdentityInfo.identityType) &&
        Objects.equals(this.storeId, campaigngmvMaxcreateItemListIdentityInfo.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityAuthorizedBcId, identityAuthorizedShopId, identityId, identityType, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxcreateItemListIdentityInfo {\n");
    
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityAuthorizedShopId: ").append(toIndentedString(identityAuthorizedShopId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
