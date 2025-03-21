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
 * IdentityCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class IdentityCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("image_uri")
  private String imageUri = null;

  public IdentityCreateBody advertiserId(String advertiserId) {
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

  public IdentityCreateBody displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name. The maximum length is 100 characters.
   * @return displayName
  **/
  @Schema(required = true, description = "Display name. The maximum length is 100 characters.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IdentityCreateBody imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

   /**
   * &#x60;image_id&#x60; of the avatar. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172488964097) endpoint. Width and height ratio must be 1:1.
   * @return imageUri
  **/
  @Schema(required = true, description = "`image_id` of the avatar. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097) endpoint. Width and height ratio must be 1:1.")
  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityCreateBody identityCreateBody = (IdentityCreateBody) o;
    return Objects.equals(this.advertiserId, identityCreateBody.advertiserId) &&
        Objects.equals(this.displayName, identityCreateBody.displayName) &&
        Objects.equals(this.imageUri, identityCreateBody.imageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, displayName, imageUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
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
