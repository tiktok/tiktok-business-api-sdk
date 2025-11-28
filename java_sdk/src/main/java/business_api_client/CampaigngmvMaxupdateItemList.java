/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxupdateIdentityInfo;
import business_api_client.CampaigngmvMaxupdateVideoInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CampaigngmvMaxupdateItemList
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class CampaigngmvMaxupdateItemList {
  @JsonProperty("identity_info")
  private CampaigngmvMaxupdateIdentityInfo identityInfo = null;

  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("spu_id_list")
  private List<String> spuIdList = null;

  @JsonProperty("video_info")
  private CampaigngmvMaxupdateVideoInfo videoInfo = null;

  public CampaigngmvMaxupdateItemList identityInfo(CampaigngmvMaxupdateIdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
    return this;
  }

   /**
   * Get identityInfo
   * @return identityInfo
  **/
  @Schema(description = "")
  public CampaigngmvMaxupdateIdentityInfo getIdentityInfo() {
    return identityInfo;
  }

  public void setIdentityInfo(CampaigngmvMaxupdateIdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
  }

  public CampaigngmvMaxupdateItemList itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CampaigngmvMaxupdateItemList spuIdList(List<String> spuIdList) {
    this.spuIdList = spuIdList;
    return this;
  }

  public CampaigngmvMaxupdateItemList addSpuIdListItem(String spuIdListItem) {
    if (this.spuIdList == null) {
      this.spuIdList = new ArrayList<String>();
    }
    this.spuIdList.add(spuIdListItem);
    return this;
  }

   /**
   * Get spuIdList
   * @return spuIdList
  **/
  @Schema(description = "")
  public List<String> getSpuIdList() {
    return spuIdList;
  }

  public void setSpuIdList(List<String> spuIdList) {
    this.spuIdList = spuIdList;
  }

  public CampaigngmvMaxupdateItemList videoInfo(CampaigngmvMaxupdateVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @Schema(description = "")
  public CampaigngmvMaxupdateVideoInfo getVideoInfo() {
    return videoInfo;
  }

  public void setVideoInfo(CampaigngmvMaxupdateVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaigngmvMaxupdateItemList campaigngmvMaxupdateItemList = (CampaigngmvMaxupdateItemList) o;
    return Objects.equals(this.identityInfo, campaigngmvMaxupdateItemList.identityInfo) &&
        Objects.equals(this.itemId, campaigngmvMaxupdateItemList.itemId) &&
        Objects.equals(this.spuIdList, campaigngmvMaxupdateItemList.spuIdList) &&
        Objects.equals(this.videoInfo, campaigngmvMaxupdateItemList.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityInfo, itemId, spuIdList, videoInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxupdateItemList {\n");
    
    sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    spuIdList: ").append(toIndentedString(spuIdList)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
