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
 * Details of the Countdown Sticker you want to create. You can see an example of Countdown Sticker in [Countdown Sticker](https://ads.tiktok.com/help/article?aid&#x3D;10007423). Note: You can only create one countdown sticker at a time
 */
@Schema(description = "Details of the Countdown Sticker you want to create. You can see an example of Countdown Sticker in [Countdown Sticker](https://ads.tiktok.com/help/article?aid=10007423). Note: You can only create one countdown sticker at a time")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class OpenApiv13creativeportfoliocreateStickerParam {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("cutoff_time")
  private String cutoffTime = null;

  @JsonProperty("display_angle")
  private Integer displayAngle = null;

  @JsonProperty("landing_page_url")
  private String landingPageUrl = null;

  @JsonProperty("live_tiktok_user_id")
  private String liveTiktokUserId = null;

  @JsonProperty("opacity")
  private String opacity = null;

  @JsonProperty("position_x")
  private Integer positionX = null;

  @JsonProperty("position_y")
  private Integer positionY = null;

  @JsonProperty("reminder_time")
  private String reminderTime = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("sticker_type")
  private String stickerType = null;

  @JsonProperty("title")
  private String title = null;

  public OpenApiv13creativeportfoliocreateStickerParam color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Background color of the sticker. Enum values: &#x60;ORANGE&#x60;(orange), &#x60;BLACK&#x60;(black), &#x60;RED&#x60;(red), &#x60;BLUE&#x60;(blue)
   * @return color
  **/
  @Schema(description = "Background color of the sticker. Enum values: `ORANGE`(orange), `BLACK`(black), `RED`(red), `BLUE`(blue)")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public OpenApiv13creativeportfoliocreateStickerParam cutoffTime(String cutoffTime) {
    this.cutoffTime = cutoffTime;
    return this;
  }

   /**
   * Countdown deadline (when &#x60;sticker_type&#x60;&#x3D; &#x60;COUNTDOWN&#x60; or &#x60;REMINDER_COUNTDOWN&#x60;) or LIVE start time (when &#x60;sticker_type&#x60;&#x3D;&#x60;LIVE_REMINDER_COUNTDOWN&#x60;) for the Countdown Sticker, in the format of \&quot;2022-10-30 00:00:00\&quot; (UTC+0 Time). Note: The time you pass in via this field is regarded as UTC+0 time by default and you cannot modify the default time zone
   * @return cutoffTime
  **/
  @Schema(description = "Countdown deadline (when `sticker_type`= `COUNTDOWN` or `REMINDER_COUNTDOWN`) or LIVE start time (when `sticker_type`=`LIVE_REMINDER_COUNTDOWN`) for the Countdown Sticker, in the format of \"2022-10-30 00:00:00\" (UTC+0 Time). Note: The time you pass in via this field is regarded as UTC+0 time by default and you cannot modify the default time zone")
  public String getCutoffTime() {
    return cutoffTime;
  }

  public void setCutoffTime(String cutoffTime) {
    this.cutoffTime = cutoffTime;
  }

  public OpenApiv13creativeportfoliocreateStickerParam displayAngle(Integer displayAngle) {
    this.displayAngle = displayAngle;
    return this;
  }

   /**
   * Sticker display angle. Value range: &#x60;[-180, +180]&#x60;. &#x60;+90&#x60; means to rotate the sticker clockwise by 90 degrees
   * @return displayAngle
  **/
  @Schema(description = "Sticker display angle. Value range: `[-180, +180]`. `+90` means to rotate the sticker clockwise by 90 degrees")
  public Integer getDisplayAngle() {
    return displayAngle;
  }

  public void setDisplayAngle(Integer displayAngle) {
    this.displayAngle = displayAngle;
  }

  public OpenApiv13creativeportfoliocreateStickerParam landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * The landing page URL you will be redirected to when you click the reminder after the countdown for an non-LIVE event ends. Required when &#x60;sticker_type&#x60; is &#x60;REMINDER_COUNTDOWN&#x60;
   * @return landingPageUrl
  **/
  @Schema(description = "The landing page URL you will be redirected to when you click the reminder after the countdown for an non-LIVE event ends. Required when `sticker_type` is `REMINDER_COUNTDOWN`")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public OpenApiv13creativeportfoliocreateStickerParam liveTiktokUserId(String liveTiktokUserId) {
    this.liveTiktokUserId = liveTiktokUserId;
    return this;
  }

   /**
   * TikTok user ID of the LIVE event host. Required when &#x60;sticker_type&#x60; is &#x60;LIVE_REMINDER_COUNTDOWN&#x60;. After specifying this field, you will be redirected to the host LIVE room when you click the reminder for a LIVE event
   * @return liveTiktokUserId
  **/
  @Schema(description = "TikTok user ID of the LIVE event host. Required when `sticker_type` is `LIVE_REMINDER_COUNTDOWN`. After specifying this field, you will be redirected to the host LIVE room when you click the reminder for a LIVE event")
  public String getLiveTiktokUserId() {
    return liveTiktokUserId;
  }

  public void setLiveTiktokUserId(String liveTiktokUserId) {
    this.liveTiktokUserId = liveTiktokUserId;
  }

  public OpenApiv13creativeportfoliocreateStickerParam opacity(String opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Sticker opacity. Enum values: &#x60;0.7&#x60;, &#x60;0.8&#x60;, &#x60;0.9&#x60;, &#x60;1&#x60;. The lower the value, the more transparent the sticker will be
   * @return opacity
  **/
  @Schema(description = "Sticker opacity. Enum values: `0.7`, `0.8`, `0.9`, `1`. The lower the value, the more transparent the sticker will be")
  public String getOpacity() {
    return opacity;
  }

  public void setOpacity(String opacity) {
    this.opacity = opacity;
  }

  public OpenApiv13creativeportfoliocreateStickerParam positionX(Integer positionX) {
    this.positionX = positionX;
    return this;
  }

   /**
   * The x-axis coordinate relative to the top-left corner of the screen. Value range: 50-109
   * @return positionX
  **/
  @Schema(description = "The x-axis coordinate relative to the top-left corner of the screen. Value range: 50-109")
  public Integer getPositionX() {
    return positionX;
  }

  public void setPositionX(Integer positionX) {
    this.positionX = positionX;
  }

  public OpenApiv13creativeportfoliocreateStickerParam positionY(Integer positionY) {
    this.positionY = positionY;
    return this;
  }

   /**
   * The y-axis coordinate relative to the top-left corner of the screen. Value range: 141-506
   * @return positionY
  **/
  @Schema(description = "The y-axis coordinate relative to the top-left corner of the screen. Value range: 141-506")
  public Integer getPositionY() {
    return positionY;
  }

  public void setPositionY(Integer positionY) {
    this.positionY = positionY;
  }

  public OpenApiv13creativeportfoliocreateStickerParam reminderTime(String reminderTime) {
    this.reminderTime = reminderTime;
    return this;
  }

   /**
   * The time set for the reminder. Required when &#x60;sticker_type&#x60;&#x3D; &#x60;REMINDER_COUNTDOWN&#x60; or &#x60;LIVE_REMINDER_COUNTDOWN&#x60;.For non-LIVE stickers (when &#x60;sticker_type&#x60;&#x3D; &#x60;REMINDER_COUNTDOWN&#x60;), the enum values are:&#x60;ONE_MINUTE_EARLIER&#x60;: send the reminder one minute before the non-LIVE event.&#x60;ONE_HOUR_EARLIER &#x60;: send the reminder one hour before the non-LIVE event.&#x60;ONE_DAY_EARLIER&#x60;: send the reminder one day before the non-LIVE event.For LIVE stickers (when &#x60;sticker_type&#x60;&#x3D; &#x60;LIVE_REMINDER_COUNTDOWN&#x60;), the enum values are: &#x60;ONE_MINUTE_AFTER&#x60;: send the reminder one minute after the LIVE event starts.&#x60;FIVE_MINUTES_AFTER&#x60;: send the reminder five minutes after the LIVE event starts.&#x60;TEN_MINUTES_AFTER&#x60;: send the reminder ten minutes after the LIVE event starts. 
   * @return reminderTime
  **/
  @Schema(description = "The time set for the reminder. Required when `sticker_type`= `REMINDER_COUNTDOWN` or `LIVE_REMINDER_COUNTDOWN`.For non-LIVE stickers (when `sticker_type`= `REMINDER_COUNTDOWN`), the enum values are:`ONE_MINUTE_EARLIER`: send the reminder one minute before the non-LIVE event.`ONE_HOUR_EARLIER `: send the reminder one hour before the non-LIVE event.`ONE_DAY_EARLIER`: send the reminder one day before the non-LIVE event.For LIVE stickers (when `sticker_type`= `LIVE_REMINDER_COUNTDOWN`), the enum values are: `ONE_MINUTE_AFTER`: send the reminder one minute after the LIVE event starts.`FIVE_MINUTES_AFTER`: send the reminder five minutes after the LIVE event starts.`TEN_MINUTES_AFTER`: send the reminder ten minutes after the LIVE event starts. ")
  public String getReminderTime() {
    return reminderTime;
  }

  public void setReminderTime(String reminderTime) {
    this.reminderTime = reminderTime;
  }

  public OpenApiv13creativeportfoliocreateStickerParam size(String size) {
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

  public OpenApiv13creativeportfoliocreateStickerParam stickerType(String stickerType) {
    this.stickerType = stickerType;
    return this;
  }

   /**
   * Sticker type. Default value: &#x60;COUNTDOWN&#x60;. Enum values: &#x60;COUNTDOWN&#x60;: A Countdown Sticker with no reminder.&#x60;REMINDER_COUNTDOWN&#x60;: A Countdown Sticker with reminder for a non-LIVE event.&#x60;LIVE_REMINDER_COUNTDOWN&#x60;: A Countdown Sticker with reminder for a LIVE event.
   * @return stickerType
  **/
  @Schema(description = "Sticker type. Default value: `COUNTDOWN`. Enum values: `COUNTDOWN`: A Countdown Sticker with no reminder.`REMINDER_COUNTDOWN`: A Countdown Sticker with reminder for a non-LIVE event.`LIVE_REMINDER_COUNTDOWN`: A Countdown Sticker with reminder for a LIVE event.")
  public String getStickerType() {
    return stickerType;
  }

  public void setStickerType(String stickerType) {
    this.stickerType = stickerType;
  }

  public OpenApiv13creativeportfoliocreateStickerParam title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Sticker title. The maximum length is 54, in UTF-8 bytes (54 English letters or 18 Chinese characters), and the hashtag symbol (#) is not supported
   * @return title
  **/
  @Schema(description = "Sticker title. The maximum length is 54, in UTF-8 bytes (54 English letters or 18 Chinese characters), and the hashtag symbol (#) is not supported")
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
    OpenApiv13creativeportfoliocreateStickerParam openApiv13creativeportfoliocreateStickerParam = (OpenApiv13creativeportfoliocreateStickerParam) o;
    return Objects.equals(this.color, openApiv13creativeportfoliocreateStickerParam.color) &&
        Objects.equals(this.cutoffTime, openApiv13creativeportfoliocreateStickerParam.cutoffTime) &&
        Objects.equals(this.displayAngle, openApiv13creativeportfoliocreateStickerParam.displayAngle) &&
        Objects.equals(this.landingPageUrl, openApiv13creativeportfoliocreateStickerParam.landingPageUrl) &&
        Objects.equals(this.liveTiktokUserId, openApiv13creativeportfoliocreateStickerParam.liveTiktokUserId) &&
        Objects.equals(this.opacity, openApiv13creativeportfoliocreateStickerParam.opacity) &&
        Objects.equals(this.positionX, openApiv13creativeportfoliocreateStickerParam.positionX) &&
        Objects.equals(this.positionY, openApiv13creativeportfoliocreateStickerParam.positionY) &&
        Objects.equals(this.reminderTime, openApiv13creativeportfoliocreateStickerParam.reminderTime) &&
        Objects.equals(this.size, openApiv13creativeportfoliocreateStickerParam.size) &&
        Objects.equals(this.stickerType, openApiv13creativeportfoliocreateStickerParam.stickerType) &&
        Objects.equals(this.title, openApiv13creativeportfoliocreateStickerParam.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, cutoffTime, displayAngle, landingPageUrl, liveTiktokUserId, opacity, positionX, positionY, reminderTime, size, stickerType, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13creativeportfoliocreateStickerParam {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cutoffTime: ").append(toIndentedString(cutoffTime)).append("\n");
    sb.append("    displayAngle: ").append(toIndentedString(displayAngle)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    liveTiktokUserId: ").append(toIndentedString(liveTiktokUserId)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
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
