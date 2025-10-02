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
 * CreativeportfoliocreateSlideDimension
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class CreativeportfoliocreateSlideDimension {
  @JsonProperty("dimension_height")
  private Long dimensionHeight = null;

  @JsonProperty("dimension_width")
  private Long dimensionWidth = null;

  public CreativeportfoliocreateSlideDimension dimensionHeight(Long dimensionHeight) {
    this.dimensionHeight = dimensionHeight;
    return this;
  }

   /**
   * Get dimensionHeight
   * @return dimensionHeight
  **/
  @Schema(description = "")
  public Long getDimensionHeight() {
    return dimensionHeight;
  }

  public void setDimensionHeight(Long dimensionHeight) {
    this.dimensionHeight = dimensionHeight;
  }

  public CreativeportfoliocreateSlideDimension dimensionWidth(Long dimensionWidth) {
    this.dimensionWidth = dimensionWidth;
    return this;
  }

   /**
   * Get dimensionWidth
   * @return dimensionWidth
  **/
  @Schema(description = "")
  public Long getDimensionWidth() {
    return dimensionWidth;
  }

  public void setDimensionWidth(Long dimensionWidth) {
    this.dimensionWidth = dimensionWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeportfoliocreateSlideDimension creativeportfoliocreateSlideDimension = (CreativeportfoliocreateSlideDimension) o;
    return Objects.equals(this.dimensionHeight, creativeportfoliocreateSlideDimension.dimensionHeight) &&
        Objects.equals(this.dimensionWidth, creativeportfoliocreateSlideDimension.dimensionWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionHeight, dimensionWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeportfoliocreateSlideDimension {\n");
    
    sb.append("    dimensionHeight: ").append(toIndentedString(dimensionHeight)).append("\n");
    sb.append("    dimensionWidth: ").append(toIndentedString(dimensionWidth)).append("\n");
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
