/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudiencefileuploadContextInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
/**
 * FileUploadBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class FileUploadBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("calculate_type")
  private String calculateType = null;

  @JsonProperty("context_info")
  private OpenApiv13dmpcustomAudiencefileuploadContextInfo contextInfo = null;

  @JsonProperty("file")
  private File file = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("file_signature")
  private String fileSignature = null;

  public FileUploadBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public FileUploadBody calculateType(String calculateType) {
    this.calculateType = calculateType;
    return this;
  }

   /**
   * Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type.
   * @return calculateType
  **/
  @Schema(required = true, description = "Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type.")
  public String getCalculateType() {
    return calculateType;
  }

  public void setCalculateType(String calculateType) {
    this.calculateType = calculateType;
  }

  public FileUploadBody contextInfo(OpenApiv13dmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public OpenApiv13dmpcustomAudiencefileuploadContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(OpenApiv13dmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public FileUploadBody file(File file) {
    this.file = file;
    return this;
  }

   /**
   * Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt.
   * @return file
  **/
  @Schema(required = true, description = "Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt.")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public FileUploadBody fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * FileName.
   * @return fileName
  **/
  @Schema(description = "FileName.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileUploadBody fileSignature(String fileSignature) {
    this.fileSignature = fileSignature;
    return this;
  }

   /**
   * The file&#x27;s MD5, which is used for server-side verification.
   * @return fileSignature
  **/
  @Schema(required = true, description = "The file's MD5, which is used for server-side verification.")
  public String getFileSignature() {
    return fileSignature;
  }

  public void setFileSignature(String fileSignature) {
    this.fileSignature = fileSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadBody fileUploadBody = (FileUploadBody) o;
    return Objects.equals(this.advertiserId, fileUploadBody.advertiserId) &&
        Objects.equals(this.calculateType, fileUploadBody.calculateType) &&
        Objects.equals(this.contextInfo, fileUploadBody.contextInfo) &&
        Objects.equals(this.file, fileUploadBody.file) &&
        Objects.equals(this.fileName, fileUploadBody.fileName) &&
        Objects.equals(this.fileSignature, fileUploadBody.fileSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, calculateType, contextInfo, Objects.hashCode(file), fileName, fileSignature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    calculateType: ").append(toIndentedString(calculateType)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSignature: ").append(toIndentedString(fileSignature)).append("\n");
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
