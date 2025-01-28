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
import java.util.ArrayList;
import java.util.List;
/**
 * FilteringVideoAdSearch
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class FilteringVideoAdSearch {
  @JsonProperty("displayable")
  private Boolean displayable = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("material_ids")
  private List<String> materialIds = null;

  @JsonProperty("ratio")
  private List<BigDecimal> ratio = null;

  @JsonProperty("video_ids")
  private List<String> videoIds = null;

  @JsonProperty("width")
  private Integer width = null;

  public FilteringVideoAdSearch displayable(Boolean displayable) {
    this.displayable = displayable;
    return this;
  }

   /**
   * Enum values: \\n False(default value): Search in all materials \\n True: Search in the materials displayed on the platform.
   * @return displayable
  **/
  @Schema(description = "Enum values: \\n False(default value): Search in all materials \\n True: Search in the materials displayed on the platform.")
  public Boolean isDisplayable() {
    return displayable;
  }

  public void setDisplayable(Boolean displayable) {
    this.displayable = displayable;
  }

  public FilteringVideoAdSearch height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Video height.
   * @return height
  **/
  @Schema(description = "Video height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public FilteringVideoAdSearch materialIds(List<String> materialIds) {
    this.materialIds = materialIds;
    return this;
  }

  public FilteringVideoAdSearch addMaterialIdsItem(String materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<String>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * A list of material IDs. At most 100 IDs can be included in the list.
   * @return materialIds
  **/
  @Schema(description = "A list of material IDs. At most 100 IDs can be included in the list.")
  public List<String> getMaterialIds() {
    return materialIds;
  }

  public void setMaterialIds(List<String> materialIds) {
    this.materialIds = materialIds;
  }

  public FilteringVideoAdSearch ratio(List<BigDecimal> ratio) {
    this.ratio = ratio;
    return this;
  }

  public FilteringVideoAdSearch addRatioItem(BigDecimal ratioItem) {
    if (this.ratio == null) {
      this.ratio = new ArrayList<BigDecimal>();
    }
    this.ratio.add(ratioItem);
    return this;
  }

   /**
   * Video aspect ratio, e.g.: [1.7, 2.5]. Use 1.7 to search for videos with aspect ratio between 1.65-1.75, i.e. the precision floating point is 0.05.
   * @return ratio
  **/
  @Schema(description = "Video aspect ratio, e.g.: [1.7, 2.5]. Use 1.7 to search for videos with aspect ratio between 1.65-1.75, i.e. the precision floating point is 0.05.")
  public List<BigDecimal> getRatio() {
    return ratio;
  }

  public void setRatio(List<BigDecimal> ratio) {
    this.ratio = ratio;
  }

  public FilteringVideoAdSearch videoIds(List<String> videoIds) {
    this.videoIds = videoIds;
    return this;
  }

  public FilteringVideoAdSearch addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<String>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * A list of video IDs. At most 100 IDs can be included in the list.
   * @return videoIds
  **/
  @Schema(description = "A list of video IDs. At most 100 IDs can be included in the list.")
  public List<String> getVideoIds() {
    return videoIds;
  }

  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }

  public FilteringVideoAdSearch width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Video width.
   * @return width
  **/
  @Schema(description = "Video width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
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
    FilteringVideoAdSearch filteringVideoAdSearch = (FilteringVideoAdSearch) o;
    return Objects.equals(this.displayable, filteringVideoAdSearch.displayable) &&
        Objects.equals(this.height, filteringVideoAdSearch.height) &&
        Objects.equals(this.materialIds, filteringVideoAdSearch.materialIds) &&
        Objects.equals(this.ratio, filteringVideoAdSearch.ratio) &&
        Objects.equals(this.videoIds, filteringVideoAdSearch.videoIds) &&
        Objects.equals(this.width, filteringVideoAdSearch.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayable, height, materialIds, ratio, videoIds, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringVideoAdSearch {\n");
    
    sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
