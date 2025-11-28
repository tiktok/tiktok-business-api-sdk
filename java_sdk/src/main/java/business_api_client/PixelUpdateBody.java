/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixelupdateAdvancedMatchingFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PixelUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class PixelUpdateBody {
  @JsonProperty("advanced_matching_fields")
  private PixelupdateAdvancedMatchingFields advancedMatchingFields = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("pixel_id")
  private String pixelId = null;

  @JsonProperty("pixel_name")
  private String pixelName = null;

  public PixelUpdateBody advancedMatchingFields(PixelupdateAdvancedMatchingFields advancedMatchingFields) {
    this.advancedMatchingFields = advancedMatchingFields;
    return this;
  }

   /**
   * Get advancedMatchingFields
   * @return advancedMatchingFields
  **/
  @Schema(description = "")
  public PixelupdateAdvancedMatchingFields getAdvancedMatchingFields() {
    return advancedMatchingFields;
  }

  public void setAdvancedMatchingFields(PixelupdateAdvancedMatchingFields advancedMatchingFields) {
    this.advancedMatchingFields = advancedMatchingFields;
  }

  public PixelUpdateBody advertiserId(String advertiserId) {
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

  public PixelUpdateBody pixelId(String pixelId) {
    this.pixelId = pixelId;
    return this;
  }

   /**
   * Get pixelId
   * @return pixelId
  **/
  @Schema(required = true, description = "")
  public String getPixelId() {
    return pixelId;
  }

  public void setPixelId(String pixelId) {
    this.pixelId = pixelId;
  }

  public PixelUpdateBody pixelName(String pixelName) {
    this.pixelName = pixelName;
    return this;
  }

   /**
   * Get pixelName
   * @return pixelName
  **/
  @Schema(required = true, description = "")
  public String getPixelName() {
    return pixelName;
  }

  public void setPixelName(String pixelName) {
    this.pixelName = pixelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelUpdateBody pixelUpdateBody = (PixelUpdateBody) o;
    return Objects.equals(this.advancedMatchingFields, pixelUpdateBody.advancedMatchingFields) &&
        Objects.equals(this.advertiserId, pixelUpdateBody.advertiserId) &&
        Objects.equals(this.pixelId, pixelUpdateBody.pixelId) &&
        Objects.equals(this.pixelName, pixelUpdateBody.pixelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedMatchingFields, advertiserId, pixelId, pixelName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelUpdateBody {\n");
    
    sb.append("    advancedMatchingFields: ").append(toIndentedString(advancedMatchingFields)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    pixelId: ").append(toIndentedString(pixelId)).append("\n");
    sb.append("    pixelName: ").append(toIndentedString(pixelName)).append("\n");
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
