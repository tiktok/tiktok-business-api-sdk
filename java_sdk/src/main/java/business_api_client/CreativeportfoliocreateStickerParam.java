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
 * CreativeportfoliocreateStickerParam
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class CreativeportfoliocreateStickerParam {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("cutoff_time")
  private String cutoffTime = null;

  @JsonProperty("display_angle")
  private Long displayAngle = null;

  @JsonProperty("giftcode")
  private String giftcode = null;

  @JsonProperty("landing_page_url")
  private String landingPageUrl = null;

  @JsonProperty("live_tiktok_user_id")
  private String liveTiktokUserId = null;

  @JsonProperty("opacity")
  private String opacity = null;

  @JsonProperty("position_x")
  private Long positionX = null;

  @JsonProperty("position_y")
  private Long positionY = null;

  @JsonProperty("predefined_placement")
  private String predefinedPlacement = null;

  @JsonProperty("reminder_time")
  private String reminderTime = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("sticker_type")
  private String stickerType = "COUNTDOWN";

  @JsonProperty("title")
  private String title = null;

  public CreativeportfoliocreateStickerParam color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @Schema(required = true, description = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public CreativeportfoliocreateStickerParam cutoffTime(String cutoffTime) {
    this.cutoffTime = cutoffTime;
    return this;
  }

   /**
   * Get cutoffTime
   * @return cutoffTime
  **/
  @Schema(description = "")
  public String getCutoffTime() {
    return cutoffTime;
  }

  public void setCutoffTime(String cutoffTime) {
    this.cutoffTime = cutoffTime;
  }

  public CreativeportfoliocreateStickerParam displayAngle(Long displayAngle) {
    this.displayAngle = displayAngle;
    return this;
  }

   /**
   * Get displayAngle
   * maximum: 180
   * @return displayAngle
  **/
  @Schema(description = "")
  public Long getDisplayAngle() {
    return displayAngle;
  }

  public void setDisplayAngle(Long displayAngle) {
    this.displayAngle = displayAngle;
  }

  public CreativeportfoliocreateStickerParam giftcode(String giftcode) {
    this.giftcode = giftcode;
    return this;
  }

   /**
   * Get giftcode
   * @return giftcode
  **/
  @Schema(description = "")
  public String getGiftcode() {
    return giftcode;
  }

  public void setGiftcode(String giftcode) {
    this.giftcode = giftcode;
  }

  public CreativeportfoliocreateStickerParam landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Get landingPageUrl
   * @return landingPageUrl
  **/
  @Schema(description = "")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public CreativeportfoliocreateStickerParam liveTiktokUserId(String liveTiktokUserId) {
    this.liveTiktokUserId = liveTiktokUserId;
    return this;
  }

   /**
   * Get liveTiktokUserId
   * @return liveTiktokUserId
  **/
  @Schema(description = "")
  public String getLiveTiktokUserId() {
    return liveTiktokUserId;
  }

  public void setLiveTiktokUserId(String liveTiktokUserId) {
    this.liveTiktokUserId = liveTiktokUserId;
  }

  public CreativeportfoliocreateStickerParam opacity(String opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Get opacity
   * @return opacity
  **/
  @Schema(description = "")
  public String getOpacity() {
    return opacity;
  }

  public void setOpacity(String opacity) {
    this.opacity = opacity;
  }

  public CreativeportfoliocreateStickerParam positionX(Long positionX) {
    this.positionX = positionX;
    return this;
  }

   /**
   * Get positionX
   * @return positionX
  **/
  @Schema(description = "")
  public Long getPositionX() {
    return positionX;
  }

  public void setPositionX(Long positionX) {
    this.positionX = positionX;
  }

  public CreativeportfoliocreateStickerParam positionY(Long positionY) {
    this.positionY = positionY;
    return this;
  }

   /**
   * Get positionY
   * @return positionY
  **/
  @Schema(description = "")
  public Long getPositionY() {
    return positionY;
  }

  public void setPositionY(Long positionY) {
    this.positionY = positionY;
  }

  public CreativeportfoliocreateStickerParam predefinedPlacement(String predefinedPlacement) {
    this.predefinedPlacement = predefinedPlacement;
    return this;
  }

   /**
   * Get predefinedPlacement
   * @return predefinedPlacement
  **/
  @Schema(description = "")
  public String getPredefinedPlacement() {
    return predefinedPlacement;
  }

  public void setPredefinedPlacement(String predefinedPlacement) {
    this.predefinedPlacement = predefinedPlacement;
  }

  public CreativeportfoliocreateStickerParam reminderTime(String reminderTime) {
    this.reminderTime = reminderTime;
    return this;
  }

   /**
   * Get reminderTime
   * @return reminderTime
  **/
  @Schema(description = "")
  public String getReminderTime() {
    return reminderTime;
  }

  public void setReminderTime(String reminderTime) {
    this.reminderTime = reminderTime;
  }

  public CreativeportfoliocreateStickerParam size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public CreativeportfoliocreateStickerParam stickerType(String stickerType) {
    this.stickerType = stickerType;
    return this;
  }

   /**
   * Get stickerType
   * @return stickerType
  **/
  @Schema(description = "")
  public String getStickerType() {
    return stickerType;
  }

  public void setStickerType(String stickerType) {
    this.stickerType = stickerType;
  }

  public CreativeportfoliocreateStickerParam title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeportfoliocreateStickerParam creativeportfoliocreateStickerParam = (CreativeportfoliocreateStickerParam) o;
    return Objects.equals(this.color, creativeportfoliocreateStickerParam.color) &&
        Objects.equals(this.cutoffTime, creativeportfoliocreateStickerParam.cutoffTime) &&
        Objects.equals(this.displayAngle, creativeportfoliocreateStickerParam.displayAngle) &&
        Objects.equals(this.giftcode, creativeportfoliocreateStickerParam.giftcode) &&
        Objects.equals(this.landingPageUrl, creativeportfoliocreateStickerParam.landingPageUrl) &&
        Objects.equals(this.liveTiktokUserId, creativeportfoliocreateStickerParam.liveTiktokUserId) &&
        Objects.equals(this.opacity, creativeportfoliocreateStickerParam.opacity) &&
        Objects.equals(this.positionX, creativeportfoliocreateStickerParam.positionX) &&
        Objects.equals(this.positionY, creativeportfoliocreateStickerParam.positionY) &&
        Objects.equals(this.predefinedPlacement, creativeportfoliocreateStickerParam.predefinedPlacement) &&
        Objects.equals(this.reminderTime, creativeportfoliocreateStickerParam.reminderTime) &&
        Objects.equals(this.size, creativeportfoliocreateStickerParam.size) &&
        Objects.equals(this.stickerType, creativeportfoliocreateStickerParam.stickerType) &&
        Objects.equals(this.title, creativeportfoliocreateStickerParam.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, cutoffTime, displayAngle, giftcode, landingPageUrl, liveTiktokUserId, opacity, positionX, positionY, predefinedPlacement, reminderTime, size, stickerType, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeportfoliocreateStickerParam {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cutoffTime: ").append(toIndentedString(cutoffTime)).append("\n");
    sb.append("    displayAngle: ").append(toIndentedString(displayAngle)).append("\n");
    sb.append("    giftcode: ").append(toIndentedString(giftcode)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    liveTiktokUserId: ").append(toIndentedString(liveTiktokUserId)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
    sb.append("    predefinedPlacement: ").append(toIndentedString(predefinedPlacement)).append("\n");
    sb.append("    reminderTime: ").append(toIndentedString(reminderTime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    stickerType: ").append(toIndentedString(stickerType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
