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
 * MaterialStatusUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class MaterialStatusUpdateBody {
  @JsonProperty("ad_group_id")
  private String adGroupId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("material_ids")
  private List<String> materialIds = new ArrayList<String>();

  @JsonProperty("material_status")
  private String materialStatus = null;

  public MaterialStatusUpdateBody adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * Adgroup ID
   * @return adGroupId
  **/
  @Schema(required = true, description = "Adgroup ID")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public MaterialStatusUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public MaterialStatusUpdateBody materialIds(List<String> materialIds) {
    this.materialIds = materialIds;
    return this;
  }

  public MaterialStatusUpdateBody addMaterialIdsItem(String materialIdsItem) {
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * Material ID
   * @return materialIds
  **/
  @Schema(required = true, description = "Material ID")
  public List<String> getMaterialIds() {
    return materialIds;
  }

  public void setMaterialIds(List<String> materialIds) {
    this.materialIds = materialIds;
  }

  public MaterialStatusUpdateBody materialStatus(String materialStatus) {
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Material status
   * @return materialStatus
  **/
  @Schema(required = true, description = "Material status")
  public String getMaterialStatus() {
    return materialStatus;
  }

  public void setMaterialStatus(String materialStatus) {
    this.materialStatus = materialStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialStatusUpdateBody materialStatusUpdateBody = (MaterialStatusUpdateBody) o;
    return Objects.equals(this.adGroupId, materialStatusUpdateBody.adGroupId) &&
        Objects.equals(this.advertiserId, materialStatusUpdateBody.advertiserId) &&
        Objects.equals(this.materialIds, materialStatusUpdateBody.materialIds) &&
        Objects.equals(this.materialStatus, materialStatusUpdateBody.materialStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, advertiserId, materialIds, materialStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialStatusUpdateBody {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
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
