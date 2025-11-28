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
 * CreativeportfoliocreateBadgePosition
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class CreativeportfoliocreateBadgePosition {
  @JsonProperty("angle")
  private Long angle = null;

  @JsonProperty("position_x")
  private Double positionX = null;

  @JsonProperty("position_y")
  private Double positionY = null;

  public CreativeportfoliocreateBadgePosition angle(Long angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Get angle
   * @return angle
  **/
  @Schema(description = "")
  public Long getAngle() {
    return angle;
  }

  public void setAngle(Long angle) {
    this.angle = angle;
  }

  public CreativeportfoliocreateBadgePosition positionX(Double positionX) {
    this.positionX = positionX;
    return this;
  }

   /**
   * Get positionX
   * @return positionX
  **/
  @Schema(description = "")
  public Double getPositionX() {
    return positionX;
  }

  public void setPositionX(Double positionX) {
    this.positionX = positionX;
  }

  public CreativeportfoliocreateBadgePosition positionY(Double positionY) {
    this.positionY = positionY;
    return this;
  }

   /**
   * Get positionY
   * @return positionY
  **/
  @Schema(description = "")
  public Double getPositionY() {
    return positionY;
  }

  public void setPositionY(Double positionY) {
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
