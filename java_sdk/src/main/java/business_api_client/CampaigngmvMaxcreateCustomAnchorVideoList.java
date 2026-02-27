/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CampaigngmvMaxcreateCustomAnchorVideoList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class CampaigngmvMaxcreateCustomAnchorVideoList {
  @JsonProperty("identity_info")
  private CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo identityInfo = null;

  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("spu_id_list")
  private List<String> spuIdList = null;

  public CampaigngmvMaxcreateCustomAnchorVideoList identityInfo(CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
    return this;
  }

   /**
   * Get identityInfo
   * @return identityInfo
  **/
  @Schema(description = "")
  public CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo getIdentityInfo() {
    return identityInfo;
  }

  public void setIdentityInfo(CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
  }

  public CampaigngmvMaxcreateCustomAnchorVideoList itemId(String itemId) {
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

  public CampaigngmvMaxcreateCustomAnchorVideoList spuIdList(List<String> spuIdList) {
    this.spuIdList = spuIdList;
    return this;
  }

  public CampaigngmvMaxcreateCustomAnchorVideoList addSpuIdListItem(String spuIdListItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaigngmvMaxcreateCustomAnchorVideoList campaigngmvMaxcreateCustomAnchorVideoList = (CampaigngmvMaxcreateCustomAnchorVideoList) o;
    return Objects.equals(this.identityInfo, campaigngmvMaxcreateCustomAnchorVideoList.identityInfo) &&
        Objects.equals(this.itemId, campaigngmvMaxcreateCustomAnchorVideoList.itemId) &&
        Objects.equals(this.spuIdList, campaigngmvMaxcreateCustomAnchorVideoList.spuIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityInfo, itemId, spuIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxcreateCustomAnchorVideoList {\n");
    
    sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    spuIdList: ").append(toIndentedString(spuIdList)).append("\n");
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
