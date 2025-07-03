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
import java.util.ArrayList;
import java.util.List;
/**
 * VideoDeleteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class VideoDeleteBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("catalog_video_ids")
  private List<String> catalogVideoIds = new ArrayList<String>();

  public VideoDeleteBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(required = true, description = "")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public VideoDeleteBody catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(required = true, description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public VideoDeleteBody catalogVideoIds(List<String> catalogVideoIds) {
    this.catalogVideoIds = catalogVideoIds;
    return this;
  }

  public VideoDeleteBody addCatalogVideoIdsItem(String catalogVideoIdsItem) {
    this.catalogVideoIds.add(catalogVideoIdsItem);
    return this;
  }

   /**
   * Get catalogVideoIds
   * @return catalogVideoIds
  **/
  @Schema(required = true, description = "")
  public List<String> getCatalogVideoIds() {
    return catalogVideoIds;
  }

  public void setCatalogVideoIds(List<String> catalogVideoIds) {
    this.catalogVideoIds = catalogVideoIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoDeleteBody videoDeleteBody = (VideoDeleteBody) o;
    return Objects.equals(this.bcId, videoDeleteBody.bcId) &&
        Objects.equals(this.catalogId, videoDeleteBody.catalogId) &&
        Objects.equals(this.catalogVideoIds, videoDeleteBody.catalogVideoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, catalogVideoIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoDeleteBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogVideoIds: ").append(toIndentedString(catalogVideoIds)).append("\n");
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
