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
 * AdAcoBodyMediaInfoImageInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class AdAcoBodyMediaInfoImageInfo {
  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("web_uri")
  private String webUri = null;

  public AdAcoBodyMediaInfoImageInfo fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Image name. If image material is used, this field is used to form ad&#x27;s name.
   * @return fileName
  **/
  @Schema(description = "Image name. If image material is used, this field is used to form ad's name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AdAcoBodyMediaInfoImageInfo webUri(String webUri) {
    this.webUri = webUri;
    return this;
  }

   /**
   * Image ID. You can find the image ID in the response after you upload an image via the [/file/image/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642) endpoint.
   * @return webUri
  **/
  @Schema(description = "Image ID. You can find the image ID in the response after you upload an image via the [/file/image/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642) endpoint.")
  public String getWebUri() {
    return webUri;
  }

  public void setWebUri(String webUri) {
    this.webUri = webUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyMediaInfoImageInfo adAcoBodyMediaInfoImageInfo = (AdAcoBodyMediaInfoImageInfo) o;
    return Objects.equals(this.fileName, adAcoBodyMediaInfoImageInfo.fileName) &&
        Objects.equals(this.webUri, adAcoBodyMediaInfoImageInfo.webUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, webUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyMediaInfoImageInfo {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    webUri: ").append(toIndentedString(webUri)).append("\n");
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
