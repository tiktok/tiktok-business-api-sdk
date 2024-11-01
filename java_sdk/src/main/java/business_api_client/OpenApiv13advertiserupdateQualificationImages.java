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
 * Additional business certificates
 */
@Schema(description = "Additional business certificates")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13advertiserupdateQualificationImages {
  @JsonProperty("image_id")
  private String imageId = null;

  public OpenApiv13advertiserupdateQualificationImages imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Image ID of the business certificate
   * @return imageId
  **/
  @Schema(description = "Image ID of the business certificate")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13advertiserupdateQualificationImages openApiv13advertiserupdateQualificationImages = (OpenApiv13advertiserupdateQualificationImages) o;
    return Objects.equals(this.imageId, openApiv13advertiserupdateQualificationImages.imageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13advertiserupdateQualificationImages {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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
