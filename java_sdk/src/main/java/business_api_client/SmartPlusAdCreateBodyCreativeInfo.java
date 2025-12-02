/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdCreateBodyCreativeInfoImageInfo;
import business_api_client.SmartPlusAdCreateBodyCreativeInfoMusicInfo;
import business_api_client.SmartPlusAdCreateBodyCreativeInfoVideoInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartPlusAdCreateBodyCreativeInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class SmartPlusAdCreateBodyCreativeInfo {
  @JsonProperty("ad_format")
  private String adFormat = null;

  @JsonProperty("aigc_disclosure_type")
  private String aigcDisclosureType = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("image_info")
  private List<SmartPlusAdCreateBodyCreativeInfoImageInfo> imageInfo = null;

  @JsonProperty("music_info")
  private SmartPlusAdCreateBodyCreativeInfoMusicInfo musicInfo = null;

  @JsonProperty("tiktok_item_id")
  private String tiktokItemId = null;

  @JsonProperty("video_info")
  private SmartPlusAdCreateBodyCreativeInfoVideoInfo videoInfo = null;

  public SmartPlusAdCreateBodyCreativeInfo adFormat(String adFormat) {
    this.adFormat = adFormat;
    return this;
  }

   /**
   * Get adFormat
   * @return adFormat
  **/
  @Schema(required = true, description = "")
  public String getAdFormat() {
    return adFormat;
  }

  public void setAdFormat(String adFormat) {
    this.adFormat = adFormat;
  }

  public SmartPlusAdCreateBodyCreativeInfo aigcDisclosureType(String aigcDisclosureType) {
    this.aigcDisclosureType = aigcDisclosureType;
    return this;
  }

   /**
   * Get aigcDisclosureType
   * @return aigcDisclosureType
  **/
  @Schema(description = "")
  public String getAigcDisclosureType() {
    return aigcDisclosureType;
  }

  public void setAigcDisclosureType(String aigcDisclosureType) {
    this.aigcDisclosureType = aigcDisclosureType;
  }

  public SmartPlusAdCreateBodyCreativeInfo identityAuthorizedBcId(String identityAuthorizedBcId) {
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

  public SmartPlusAdCreateBodyCreativeInfo identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public SmartPlusAdCreateBodyCreativeInfo identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public SmartPlusAdCreateBodyCreativeInfo imageInfo(List<SmartPlusAdCreateBodyCreativeInfoImageInfo> imageInfo) {
    this.imageInfo = imageInfo;
    return this;
  }

  public SmartPlusAdCreateBodyCreativeInfo addImageInfoItem(SmartPlusAdCreateBodyCreativeInfoImageInfo imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<SmartPlusAdCreateBodyCreativeInfoImageInfo>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyCreativeInfoImageInfo> getImageInfo() {
    return imageInfo;
  }

  public void setImageInfo(List<SmartPlusAdCreateBodyCreativeInfoImageInfo> imageInfo) {
    this.imageInfo = imageInfo;
  }

  public SmartPlusAdCreateBodyCreativeInfo musicInfo(SmartPlusAdCreateBodyCreativeInfoMusicInfo musicInfo) {
    this.musicInfo = musicInfo;
    return this;
  }

   /**
   * Get musicInfo
   * @return musicInfo
  **/
  @Schema(description = "")
  public SmartPlusAdCreateBodyCreativeInfoMusicInfo getMusicInfo() {
    return musicInfo;
  }

  public void setMusicInfo(SmartPlusAdCreateBodyCreativeInfoMusicInfo musicInfo) {
    this.musicInfo = musicInfo;
  }

  public SmartPlusAdCreateBodyCreativeInfo tiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
    return this;
  }

   /**
   * Get tiktokItemId
   * @return tiktokItemId
  **/
  @Schema(description = "")
  public String getTiktokItemId() {
    return tiktokItemId;
  }

  public void setTiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
  }

  public SmartPlusAdCreateBodyCreativeInfo videoInfo(SmartPlusAdCreateBodyCreativeInfoVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @Schema(description = "")
  public SmartPlusAdCreateBodyCreativeInfoVideoInfo getVideoInfo() {
    return videoInfo;
  }

  public void setVideoInfo(SmartPlusAdCreateBodyCreativeInfoVideoInfo videoInfo) {
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
    SmartPlusAdCreateBodyCreativeInfo smartPlusAdCreateBodyCreativeInfo = (SmartPlusAdCreateBodyCreativeInfo) o;
    return Objects.equals(this.adFormat, smartPlusAdCreateBodyCreativeInfo.adFormat) &&
        Objects.equals(this.aigcDisclosureType, smartPlusAdCreateBodyCreativeInfo.aigcDisclosureType) &&
        Objects.equals(this.identityAuthorizedBcId, smartPlusAdCreateBodyCreativeInfo.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, smartPlusAdCreateBodyCreativeInfo.identityId) &&
        Objects.equals(this.identityType, smartPlusAdCreateBodyCreativeInfo.identityType) &&
        Objects.equals(this.imageInfo, smartPlusAdCreateBodyCreativeInfo.imageInfo) &&
        Objects.equals(this.musicInfo, smartPlusAdCreateBodyCreativeInfo.musicInfo) &&
        Objects.equals(this.tiktokItemId, smartPlusAdCreateBodyCreativeInfo.tiktokItemId) &&
        Objects.equals(this.videoInfo, smartPlusAdCreateBodyCreativeInfo.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adFormat, aigcDisclosureType, identityAuthorizedBcId, identityId, identityType, imageInfo, musicInfo, tiktokItemId, videoInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBodyCreativeInfo {\n");
    
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    aigcDisclosureType: ").append(toIndentedString(aigcDisclosureType)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    musicInfo: ").append(toIndentedString(musicInfo)).append("\n");
    sb.append("    tiktokItemId: ").append(toIndentedString(tiktokItemId)).append("\n");
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
