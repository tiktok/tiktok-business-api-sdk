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
 * CreativeAssetDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class CreativeAssetDeleteBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("image_ids")
  private List<String> imageIds = null;

  @JsonProperty("video_ids")
  private List<String> videoIds = null;

  public CreativeAssetDeleteBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public CreativeAssetDeleteBody imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public CreativeAssetDeleteBody addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<String>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * Get imageIds
   * @return imageIds
  **/
  @Schema(description = "")
  public List<String> getImageIds() {
    return imageIds;
  }

  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }

  public CreativeAssetDeleteBody videoIds(List<String> videoIds) {
    this.videoIds = videoIds;
    return this;
  }

  public CreativeAssetDeleteBody addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<String>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * Get videoIds
   * @return videoIds
  **/
  @Schema(description = "")
  public List<String> getVideoIds() {
    return videoIds;
  }

  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAssetDeleteBody creativeAssetDeleteBody = (CreativeAssetDeleteBody) o;
    return Objects.equals(this.advertiserId, creativeAssetDeleteBody.advertiserId) &&
        Objects.equals(this.imageIds, creativeAssetDeleteBody.imageIds) &&
        Objects.equals(this.videoIds, creativeAssetDeleteBody.videoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, imageIds, videoIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeAssetDeleteBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
