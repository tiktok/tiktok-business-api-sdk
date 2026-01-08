/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxcreateItemListIdentityInfo;
import business_api_client.CampaigngmvMaxcreateVideoInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CampaigngmvMaxcreateItemList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class CampaigngmvMaxcreateItemList {
  @JsonProperty("identity_info")
  private CampaigngmvMaxcreateItemListIdentityInfo identityInfo = null;

  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("spu_id_list")
  private List<String> spuIdList = null;

  @JsonProperty("video_info")
  private CampaigngmvMaxcreateVideoInfo videoInfo = null;

  public CampaigngmvMaxcreateItemList identityInfo(CampaigngmvMaxcreateItemListIdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
    return this;
  }

   /**
   * Get identityInfo
   * @return identityInfo
  **/
  @Schema(description = "")
  public CampaigngmvMaxcreateItemListIdentityInfo getIdentityInfo() {
    return identityInfo;
  }

  public void setIdentityInfo(CampaigngmvMaxcreateItemListIdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
  }

  public CampaigngmvMaxcreateItemList itemId(String itemId) {
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

  public CampaigngmvMaxcreateItemList spuIdList(List<String> spuIdList) {
    this.spuIdList = spuIdList;
    return this;
  }

  public CampaigngmvMaxcreateItemList addSpuIdListItem(String spuIdListItem) {
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

  public CampaigngmvMaxcreateItemList videoInfo(CampaigngmvMaxcreateVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @Schema(description = "")
  public CampaigngmvMaxcreateVideoInfo getVideoInfo() {
    return videoInfo;
  }

  public void setVideoInfo(CampaigngmvMaxcreateVideoInfo videoInfo) {
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
    CampaigngmvMaxcreateItemList campaigngmvMaxcreateItemList = (CampaigngmvMaxcreateItemList) o;
    return Objects.equals(this.identityInfo, campaigngmvMaxcreateItemList.identityInfo) &&
        Objects.equals(this.itemId, campaigngmvMaxcreateItemList.itemId) &&
        Objects.equals(this.spuIdList, campaigngmvMaxcreateItemList.spuIdList) &&
        Objects.equals(this.videoInfo, campaigngmvMaxcreateItemList.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityInfo, itemId, spuIdList, videoInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxcreateItemList {\n");
    
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
