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
 * ImageEditBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-04-24T14:52:51.475773-07:00[America/Los_Angeles]")
public class ImageEditBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("edit_method")
  private String editMethod = "fix_size";

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("image_id")
  private String imageId = null;

  @JsonProperty("image_name")
  private String imageName = null;

  @JsonProperty("width")
  private Long width = null;

  public ImageEditBody advertiserId(String advertiserId) {
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

  public ImageEditBody editMethod(String editMethod) {
    this.editMethod = editMethod;
    return this;
  }

   /**
   * Get editMethod
   * @return editMethod
  **/
  @Schema(description = "")
  public String getEditMethod() {
    return editMethod;
  }

  public void setEditMethod(String editMethod) {
    this.editMethod = editMethod;
  }

  public ImageEditBody height(Long height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * minimum: 3
   * @return height
  **/
  @Schema(required = true, description = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public ImageEditBody imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(required = true, description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImageEditBody imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @Schema(description = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public ImageEditBody width(Long width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * minimum: 3
   * @return width
  **/
  @Schema(required = true, description = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageEditBody imageEditBody = (ImageEditBody) o;
    return Objects.equals(this.advertiserId, imageEditBody.advertiserId) &&
        Objects.equals(this.editMethod, imageEditBody.editMethod) &&
        Objects.equals(this.height, imageEditBody.height) &&
        Objects.equals(this.imageId, imageEditBody.imageId) &&
        Objects.equals(this.imageName, imageEditBody.imageName) &&
        Objects.equals(this.width, imageEditBody.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, editMethod, height, imageId, imageName, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageEditBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    editMethod: ").append(toIndentedString(editMethod)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
