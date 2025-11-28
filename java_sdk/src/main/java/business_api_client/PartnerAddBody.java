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
 * PartnerAddBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class PartnerAddBody {
  @JsonProperty("advertiser_role")
  private String advertiserRole = "ANALYST";

  @JsonProperty("asset_ids")
  private List<String> assetIds = null;

  @JsonProperty("asset_type")
  private String assetType = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_role")
  private String catalogRole = "AD_PROMOTE";

  @JsonProperty("partner_id")
  private String partnerId = null;

  @JsonProperty("source_child_bc_id")
  private String sourceChildBcId = null;

  @JsonProperty("target_child_bc_id")
  private String targetChildBcId = null;

  public PartnerAddBody advertiserRole(String advertiserRole) {
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

  public PartnerAddBody assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public PartnerAddBody addAssetIdsItem(String assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<String>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * Get assetIds
   * @return assetIds
  **/
  @Schema(description = "")
  public List<String> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }

  public PartnerAddBody assetType(String assetType) {
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

  public PartnerAddBody bcId(String bcId) {
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

  public PartnerAddBody catalogRole(String catalogRole) {
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

  public PartnerAddBody partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @Schema(description = "")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public PartnerAddBody sourceChildBcId(String sourceChildBcId) {
    this.sourceChildBcId = sourceChildBcId;
    return this;
  }

   /**
   * Get sourceChildBcId
   * @return sourceChildBcId
  **/
  @Schema(description = "")
  public String getSourceChildBcId() {
    return sourceChildBcId;
  }

  public void setSourceChildBcId(String sourceChildBcId) {
    this.sourceChildBcId = sourceChildBcId;
  }

  public PartnerAddBody targetChildBcId(String targetChildBcId) {
    this.targetChildBcId = targetChildBcId;
    return this;
  }

   /**
   * Get targetChildBcId
   * @return targetChildBcId
  **/
  @Schema(description = "")
  public String getTargetChildBcId() {
    return targetChildBcId;
  }

  public void setTargetChildBcId(String targetChildBcId) {
    this.targetChildBcId = targetChildBcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerAddBody partnerAddBody = (PartnerAddBody) o;
    return Objects.equals(this.advertiserRole, partnerAddBody.advertiserRole) &&
        Objects.equals(this.assetIds, partnerAddBody.assetIds) &&
        Objects.equals(this.assetType, partnerAddBody.assetType) &&
        Objects.equals(this.bcId, partnerAddBody.bcId) &&
        Objects.equals(this.catalogRole, partnerAddBody.catalogRole) &&
        Objects.equals(this.partnerId, partnerAddBody.partnerId) &&
        Objects.equals(this.sourceChildBcId, partnerAddBody.sourceChildBcId) &&
        Objects.equals(this.targetChildBcId, partnerAddBody.targetChildBcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserRole, assetIds, assetType, bcId, catalogRole, partnerId, sourceChildBcId, targetChildBcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerAddBody {\n");
    
    sb.append("    advertiserRole: ").append(toIndentedString(advertiserRole)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogRole: ").append(toIndentedString(catalogRole)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    sourceChildBcId: ").append(toIndentedString(sourceChildBcId)).append("\n");
    sb.append("    targetChildBcId: ").append(toIndentedString(targetChildBcId)).append("\n");
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
