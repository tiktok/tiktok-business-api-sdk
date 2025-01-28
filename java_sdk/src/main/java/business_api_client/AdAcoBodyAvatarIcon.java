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
 * Avatar image.
 */
@Schema(description = "Avatar image.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class AdAcoBodyAvatarIcon {
  @JsonProperty("web_uri")
  private String webUri = null;

  public AdAcoBodyAvatarIcon webUri(String webUri) {
    this.webUri = webUri;
    return this;
  }

   /**
   * ID of the avatar image. It can be uploaded through the Upload an image endpoint.
   * @return webUri
  **/
  @Schema(description = "ID of the avatar image. It can be uploaded through the Upload an image endpoint.")
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
    AdAcoBodyAvatarIcon adAcoBodyAvatarIcon = (AdAcoBodyAvatarIcon) o;
    return Objects.equals(this.webUri, adAcoBodyAvatarIcon.webUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyAvatarIcon {\n");
    
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
