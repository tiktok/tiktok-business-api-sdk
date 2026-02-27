/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdAcoBodyMediaInfoImageInfo;
import business_api_client.AdAcoBodyMediaInfoVideoInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Material information.
 */
@Schema(description = "Material information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdAcoBodyMediaInfo {
  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("image_info")
  private List<AdAcoBodyMediaInfoImageInfo> imageInfo = null;

  @JsonProperty("tiktok_item_id")
  private String tiktokItemId = null;

  @JsonProperty("video_info")
  private AdAcoBodyMediaInfoVideoInfo videoInfo = null;

  public AdAcoBodyMediaInfo identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Identity ID. Required when you are not using Spark Ads (&#x60;tiktok_item_id&#x60;).
   * @return identityId
  **/
  @Schema(description = "Identity ID. Required when you are not using Spark Ads (`tiktok_item_id`).")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public AdAcoBodyMediaInfo identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Identity type. Required when you are not using Spark Ads (&#x60;tiktok_item_id&#x60;). The only supported value is &#x60;CUSTOMIZED_USER&#x60;.
   * @return identityType
  **/
  @Schema(description = "Identity type. Required when you are not using Spark Ads (`tiktok_item_id`). The only supported value is `CUSTOMIZED_USER`.")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public AdAcoBodyMediaInfo imageInfo(List<AdAcoBodyMediaInfoImageInfo> imageInfo) {
    this.imageInfo = imageInfo;
    return this;
  }

  public AdAcoBodyMediaInfo addImageInfoItem(AdAcoBodyMediaInfoImageInfo imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<AdAcoBodyMediaInfoImageInfo>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * Image information. When you want to upload image materials (&#x60;video_info&#x60; is NOT included in the request), this field will be used as image materials. When you want to upload video materials (&#x60;video_info&#x60; is included in the request), this field will be used as the video cover. Only 1 picture can be submitted in each &#x60;image_info&#x60; object.
   * @return imageInfo
  **/
  @Schema(description = "Image information. When you want to upload image materials (`video_info` is NOT included in the request), this field will be used as image materials. When you want to upload video materials (`video_info` is included in the request), this field will be used as the video cover. Only 1 picture can be submitted in each `image_info` object.")
  public List<AdAcoBodyMediaInfoImageInfo> getImageInfo() {
    return imageInfo;
  }

  public void setImageInfo(List<AdAcoBodyMediaInfoImageInfo> imageInfo) {
    this.imageInfo = imageInfo;
  }

  public AdAcoBodyMediaInfo tiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
    return this;
  }

   /**
   * The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the &#x60;tiktok_item_id&#x60; you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738376324021250) and  [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740218475032577) endpoints.
   * @return tiktokItemId
  **/
  @Schema(description = "The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the `tiktok_item_id` you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id=1738376324021250) and  [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740218475032577) endpoints.")
  public String getTiktokItemId() {
    return tiktokItemId;
  }

  public void setTiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
  }

  public AdAcoBodyMediaInfo videoInfo(AdAcoBodyMediaInfoVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @Schema(description = "")
  public AdAcoBodyMediaInfoVideoInfo getVideoInfo() {
    return videoInfo;
  }

  public void setVideoInfo(AdAcoBodyMediaInfoVideoInfo videoInfo) {
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
    AdAcoBodyMediaInfo adAcoBodyMediaInfo = (AdAcoBodyMediaInfo) o;
    return Objects.equals(this.identityId, adAcoBodyMediaInfo.identityId) &&
        Objects.equals(this.identityType, adAcoBodyMediaInfo.identityType) &&
        Objects.equals(this.imageInfo, adAcoBodyMediaInfo.imageInfo) &&
        Objects.equals(this.tiktokItemId, adAcoBodyMediaInfo.tiktokItemId) &&
        Objects.equals(this.videoInfo, adAcoBodyMediaInfo.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityId, identityType, imageInfo, tiktokItemId, videoInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyMediaInfo {\n");
    
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
