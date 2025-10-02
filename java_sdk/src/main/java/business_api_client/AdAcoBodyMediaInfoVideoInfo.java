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
 * Video information, required when the material type is video.
 */
@Schema(description = "Video information, required when the material type is video.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AdAcoBodyMediaInfoVideoInfo {
  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("video_id")
  private String videoId = null;

  public AdAcoBodyMediaInfoVideoInfo fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Video name.
   * @return fileName
  **/
  @Schema(description = "Video name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AdAcoBodyMediaInfoVideoInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Video ID. You can get the video ID when you upload a video using the [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449) endpoint. To ensure a smooth integration journey, we recommned that you use [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)(&#x60;upload_type&#x60; &#x3D; &#x60;UPLOAD_BY_VIDEO_ID&#x60;)to bind video ID with your advertiser ID.
   * @return videoId
  **/
  @Schema(description = "Video ID. You can get the video ID when you upload a video using the [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449) endpoint. To ensure a smooth integration journey, we recommned that you use [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449)(`upload_type` = `UPLOAD_BY_VIDEO_ID`)to bind video ID with your advertiser ID.")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyMediaInfoVideoInfo adAcoBodyMediaInfoVideoInfo = (AdAcoBodyMediaInfoVideoInfo) o;
    return Objects.equals(this.fileName, adAcoBodyMediaInfoVideoInfo.fileName) &&
        Objects.equals(this.videoId, adAcoBodyMediaInfoVideoInfo.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, videoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyMediaInfoVideoInfo {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
