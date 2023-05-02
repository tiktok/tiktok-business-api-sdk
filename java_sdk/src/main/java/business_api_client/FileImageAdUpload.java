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
 * FileImageAdUpload
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class FileImageAdUpload {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("file_id")
  private String fileId = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("image_file")
  private File imageFile = null;

  @JsonProperty("image_signature")
  private String imageSignature = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("upload_type")
  private String uploadType = null;

  public FileImageAdUpload advertiserId(String advertiserId) {
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

  public FileImageAdUpload fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID.
   * @return fileId
  **/
  @Schema(description = "The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public FileImageAdUpload fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off.
   * @return fileName
  **/
  @Schema(description = "Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileImageAdUpload imageFile(File imageFile) {
    this.imageFile = imageFile;
    return this;
  }

   /**
   * Picture file, required when upload_type is UPLOAD_BY_FILE.
   * @return imageFile
  **/
  @Schema(description = "Picture file, required when upload_type is UPLOAD_BY_FILE.")
  public File getImageFile() {
    return imageFile;
  }

  public void setImageFile(File imageFile) {
    this.imageFile = imageFile;
  }

  public FileImageAdUpload imageSignature(String imageSignature) {
    this.imageSignature = imageSignature;
    return this;
  }

   /**
   * Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE.
   * @return imageSignature
  **/
  @Schema(description = "Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE.")
  public String getImageSignature() {
    return imageSignature;
  }

  public void setImageSignature(String imageSignature) {
    this.imageSignature = imageSignature;
  }

  public FileImageAdUpload imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL.
   * @return imageUrl
  **/
  @Schema(description = "Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public FileImageAdUpload uploadType(String uploadType) {
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID.
   * @return uploadType
  **/
  @Schema(description = "Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID.")
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
    FileImageAdUpload fileImageAdUpload = (FileImageAdUpload) o;
    return Objects.equals(this.advertiserId, fileImageAdUpload.advertiserId) &&
        Objects.equals(this.fileId, fileImageAdUpload.fileId) &&
        Objects.equals(this.fileName, fileImageAdUpload.fileName) &&
        Objects.equals(this.imageFile, fileImageAdUpload.imageFile) &&
        Objects.equals(this.imageSignature, fileImageAdUpload.imageSignature) &&
        Objects.equals(this.imageUrl, fileImageAdUpload.imageUrl) &&
        Objects.equals(this.uploadType, fileImageAdUpload.uploadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, fileId, fileName, Objects.hashCode(imageFile), imageSignature, imageUrl, uploadType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileImageAdUpload {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageSignature: ").append(toIndentedString(imageSignature)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
