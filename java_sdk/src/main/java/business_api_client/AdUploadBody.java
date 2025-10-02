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
 * AdUploadBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AdUploadBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("auto_bind_enabled")
  private Boolean autoBindEnabled = null;

  @JsonProperty("auto_fix_enabled")
  private Boolean autoFixEnabled = null;

  @JsonProperty("file_id")
  private String fileId = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("flaw_detect")
  private Boolean flawDetect = null;

  @JsonProperty("is_third_party")
  private Boolean isThirdParty = null;

  @JsonProperty("upload_type")
  private String uploadType = null;

  @JsonProperty("video_file")
  private File videoFile = null;

  @JsonProperty("video_id")
  private String videoId = null;

  @JsonProperty("video_signature")
  private String videoSignature = null;

  @JsonProperty("video_url")
  private String videoUrl = null;

  public AdUploadBody advertiserId(String advertiserId) {
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

  public AdUploadBody autoBindEnabled(Boolean autoBindEnabled) {
    this.autoBindEnabled = autoBindEnabled;
    return this;
  }

   /**
   * Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect &#x3D; True and auto_fix_enabled &#x3D; True.
   * @return autoBindEnabled
  **/
  @Schema(description = "Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect = True and auto_fix_enabled = True.")
  public Boolean isAutoBindEnabled() {
    return autoBindEnabled;
  }

  public void setAutoBindEnabled(Boolean autoBindEnabled) {
    this.autoBindEnabled = autoBindEnabled;
  }

  public AdUploadBody autoFixEnabled(Boolean autoFixEnabled) {
    this.autoFixEnabled = autoFixEnabled;
    return this;
  }

   /**
   * Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled &#x3D; False, then well return an error message with flaw types indicated. \\n auto_fix_enabled &#x3D;True, then well automatically fix all the issues and return fix_task_id and flaw_types.
   * @return autoFixEnabled
  **/
  @Schema(description = "Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled = False, then well return an error message with flaw types indicated. \\n auto_fix_enabled =True, then well automatically fix all the issues and return fix_task_id and flaw_types.")
  public Boolean isAutoFixEnabled() {
    return autoFixEnabled;
  }

  public void setAutoFixEnabled(Boolean autoFixEnabled) {
    this.autoFixEnabled = autoFixEnabled;
  }

  public AdUploadBody fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID.
   * @return fileId
  **/
  @Schema(description = "The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public AdUploadBody fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again.
   * @return fileName
  **/
  @Schema(description = "Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AdUploadBody flawDetect(Boolean flawDetect) {
    this.flawDetect = flawDetect;
    return this;
  }

   /**
   * Whether to automatically detect an issue in your video. Default value is False.
   * @return flawDetect
  **/
  @Schema(description = "Whether to automatically detect an issue in your video. Default value is False.")
  public Boolean isFlawDetect() {
    return flawDetect;
  }

  public void setFlawDetect(Boolean flawDetect) {
    this.flawDetect = flawDetect;
  }

  public AdUploadBody isThirdParty(Boolean isThirdParty) {
    this.isThirdParty = isThirdParty;
    return this;
  }

   /**
   * The video is third party or not.
   * @return isThirdParty
  **/
  @Schema(description = "The video is third party or not.")
  public Boolean isIsThirdParty() {
    return isThirdParty;
  }

  public void setIsThirdParty(Boolean isThirdParty) {
    this.isThirdParty = isThirdParty;
  }

  public AdUploadBody uploadType(String uploadType) {
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID.
   * @return uploadType
  **/
  @Schema(description = "Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID.")
  public String getUploadType() {
    return uploadType;
  }

  public void setUploadType(String uploadType) {
    this.uploadType = uploadType;
  }

  public AdUploadBody videoFile(File videoFile) {
    this.videoFile = videoFile;
    return this;
  }

   /**
   * Video file. Required when upload_type is UPLOAD_BY_FILE.
   * @return videoFile
  **/
  @Schema(description = "Video file. Required when upload_type is UPLOAD_BY_FILE.")
  public File getVideoFile() {
    return videoFile;
  }

  public void setVideoFile(File videoFile) {
    this.videoFile = videoFile;
  }

  public AdUploadBody videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID.
   * @return videoId
  **/
  @Schema(description = "Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID.")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public AdUploadBody videoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
    return this;
  }

   /**
   * Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE.
   * @return videoSignature
  **/
  @Schema(description = "Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE.")
  public String getVideoSignature() {
    return videoSignature;
  }

  public void setVideoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
  }

  public AdUploadBody videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file.
   * @return videoUrl
  **/
  @Schema(description = "Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file.")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdUploadBody adUploadBody = (AdUploadBody) o;
    return Objects.equals(this.advertiserId, adUploadBody.advertiserId) &&
        Objects.equals(this.autoBindEnabled, adUploadBody.autoBindEnabled) &&
        Objects.equals(this.autoFixEnabled, adUploadBody.autoFixEnabled) &&
        Objects.equals(this.fileId, adUploadBody.fileId) &&
        Objects.equals(this.fileName, adUploadBody.fileName) &&
        Objects.equals(this.flawDetect, adUploadBody.flawDetect) &&
        Objects.equals(this.isThirdParty, adUploadBody.isThirdParty) &&
        Objects.equals(this.uploadType, adUploadBody.uploadType) &&
        Objects.equals(this.videoFile, adUploadBody.videoFile) &&
        Objects.equals(this.videoId, adUploadBody.videoId) &&
        Objects.equals(this.videoSignature, adUploadBody.videoSignature) &&
        Objects.equals(this.videoUrl, adUploadBody.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, autoBindEnabled, autoFixEnabled, fileId, fileName, flawDetect, isThirdParty, uploadType, Objects.hashCode(videoFile), videoId, videoSignature, videoUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUploadBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoBindEnabled: ").append(toIndentedString(autoBindEnabled)).append("\n");
    sb.append("    autoFixEnabled: ").append(toIndentedString(autoFixEnabled)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    flawDetect: ").append(toIndentedString(flawDetect)).append("\n");
    sb.append("    isThirdParty: ").append(toIndentedString(isThirdParty)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    videoFile: ").append(toIndentedString(videoFile)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoSignature: ").append(toIndentedString(videoSignature)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
