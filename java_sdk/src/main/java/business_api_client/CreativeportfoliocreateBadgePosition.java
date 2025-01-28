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
import java.math.BigDecimal;
/**
 * Badge position information
 */
@Schema(description = "Badge position information")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class CreativeportfoliocreateBadgePosition {
  @JsonProperty("angle")
  private Integer angle = null;

  @JsonProperty("position_x")
  private BigDecimal positionX = null;

  @JsonProperty("position_y")
  private BigDecimal positionY = null;

  public CreativeportfoliocreateBadgePosition angle(Integer angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Initial rotation angle when the badge starts to show
   * @return angle
  **/
  @Schema(description = "Initial rotation angle when the badge starts to show")
  public Integer getAngle() {
    return angle;
  }

  public void setAngle(Integer angle) {
    this.angle = angle;
  }

  public CreativeportfoliocreateBadgePosition positionX(BigDecimal positionX) {
    this.positionX = positionX;
    return this;
  }

   /**
   * Relative x-axis value of the top-left corner of the badge. It is the x coordinate of the top-left corner divided by 720. Range: 0-1
   * @return positionX
  **/
  @Schema(description = "Relative x-axis value of the top-left corner of the badge. It is the x coordinate of the top-left corner divided by 720. Range: 0-1")
  public BigDecimal getPositionX() {
    return positionX;
  }

  public void setPositionX(BigDecimal positionX) {
    this.positionX = positionX;
  }

  public CreativeportfoliocreateBadgePosition positionY(BigDecimal positionY) {
    this.positionY = positionY;
    return this;
  }

   /**
   *  Relative y-axis value of the top-left corner of the badge. It is the y coordinate of the top-left corner divided by 1280. Range: 0-1
   * @return positionY
  **/
  @Schema(description = " Relative y-axis value of the top-left corner of the badge. It is the y coordinate of the top-left corner divided by 1280. Range: 0-1")
  public BigDecimal getPositionY() {
    return positionY;
  }

  public void setPositionY(BigDecimal positionY) {
    this.positionY = positionY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeportfoliocreateBadgePosition creativeportfoliocreateBadgePosition = (CreativeportfoliocreateBadgePosition) o;
    return Objects.equals(this.angle, creativeportfoliocreateBadgePosition.angle) &&
        Objects.equals(this.positionX, creativeportfoliocreateBadgePosition.positionX) &&
        Objects.equals(this.positionY, creativeportfoliocreateBadgePosition.positionY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(angle, positionX, positionY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeportfoliocreateBadgePosition {\n");
    
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
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
