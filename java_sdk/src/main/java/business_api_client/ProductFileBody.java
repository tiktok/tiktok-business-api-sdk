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
 * ProductFileBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class ProductFileBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("feed_id")
  private Long feedId = null;

  @JsonProperty("file_url")
  private String fileUrl = null;

  @JsonProperty("update_mode")
  private String updateMode = "INCREMENTAL";

  public ProductFileBody bcId(String bcId) {
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

  public ProductFileBody catalogId(String catalogId) {
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

  public ProductFileBody feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Get feedId
   * @return feedId
  **/
  @Schema(description = "")
  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public ProductFileBody fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Get fileUrl
   * @return fileUrl
  **/
  @Schema(required = true, description = "")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public ProductFileBody updateMode(String updateMode) {
    this.updateMode = updateMode;
    return this;
  }

   /**
   * Get updateMode
   * @return updateMode
  **/
  @Schema(description = "")
  public String getUpdateMode() {
    return updateMode;
  }

  public void setUpdateMode(String updateMode) {
    this.updateMode = updateMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFileBody productFileBody = (ProductFileBody) o;
    return Objects.equals(this.bcId, productFileBody.bcId) &&
        Objects.equals(this.catalogId, productFileBody.catalogId) &&
        Objects.equals(this.feedId, productFileBody.feedId) &&
        Objects.equals(this.fileUrl, productFileBody.fileUrl) &&
        Objects.equals(this.updateMode, productFileBody.updateMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, feedId, fileUrl, updateMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFileBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    updateMode: ").append(toIndentedString(updateMode)).append("\n");
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
