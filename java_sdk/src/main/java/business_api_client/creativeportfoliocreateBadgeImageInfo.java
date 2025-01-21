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
 * Information about the badge image
 */
@Schema(description = "Information about the badge image")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-21T14:49:06.465252-08:00[America/Los_Angeles]")
public class creativeportfoliocreateBadgeImageInfo {
  @JsonProperty("image_id")
  private String imageId = null;

  public creativeportfoliocreateBadgeImageInfo imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * ID of the badge image. The image must be 448x448 px. Supported formats include PNG, JPEG, and JPG. The largest size supported is 1 MB
   * @return imageId
  **/
  @Schema(description = "ID of the badge image. The image must be 448x448 px. Supported formats include PNG, JPEG, and JPG. The largest size supported is 1 MB")
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
    creativeportfoliocreateBadgeImageInfo creativeportfoliocreateBadgeImageInfo = (creativeportfoliocreateBadgeImageInfo) o;
    return Objects.equals(this.imageId, creativeportfoliocreateBadgeImageInfo.imageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class creativeportfoliocreateBadgeImageInfo {\n");
    
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
