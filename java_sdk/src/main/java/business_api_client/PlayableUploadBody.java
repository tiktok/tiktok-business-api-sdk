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
import java.io.File;
/**
 * PlayableUploadBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-04-24T14:52:51.475773-07:00[America/Los_Angeles]")
public class PlayableUploadBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("file_id")
  private String fileId = null;

  @JsonProperty("playable_package")
  private File playablePackage = null;

  @JsonProperty("upload_type")
  private String uploadType = null;

  public PlayableUploadBody advertiserId(String advertiserId) {
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

  public PlayableUploadBody fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @Schema(description = "")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public PlayableUploadBody playablePackage(File playablePackage) {
    this.playablePackage = playablePackage;
    return this;
  }

   /**
   * Get playablePackage
   * @return playablePackage
  **/
  @Schema(description = "")
  public File getPlayablePackage() {
    return playablePackage;
  }

  public void setPlayablePackage(File playablePackage) {
    this.playablePackage = playablePackage;
  }

  public PlayableUploadBody uploadType(String uploadType) {
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @Schema(description = "")
  public String getUploadType() {
    return uploadType;
  }

  public void setUploadType(String uploadType) {
    this.uploadType = uploadType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableUploadBody playableUploadBody = (PlayableUploadBody) o;
    return Objects.equals(this.advertiserId, playableUploadBody.advertiserId) &&
        Objects.equals(this.fileId, playableUploadBody.fileId) &&
        Objects.equals(this.playablePackage, playableUploadBody.playablePackage) &&
        Objects.equals(this.uploadType, playableUploadBody.uploadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, fileId, Objects.hashCode(playablePackage), uploadType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableUploadBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    playablePackage: ").append(toIndentedString(playablePackage)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
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
