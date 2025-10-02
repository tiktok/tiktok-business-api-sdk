/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CatalogfeedcreateScheduleParam;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * FeedCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class FeedCreateBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("feed_name")
  private String feedName = null;

  @JsonProperty("schedule_param")
  private CatalogfeedcreateScheduleParam scheduleParam = null;

  @JsonProperty("update_mode")
  private String updateMode = null;

  public FeedCreateBody bcId(String bcId) {
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

  public FeedCreateBody catalogId(String catalogId) {
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

  public FeedCreateBody feedName(String feedName) {
    this.feedName = feedName;
    return this;
  }

   /**
   * Get feedName
   * @return feedName
  **/
  @Schema(required = true, description = "")
  public String getFeedName() {
    return feedName;
  }

  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }

  public FeedCreateBody scheduleParam(CatalogfeedcreateScheduleParam scheduleParam) {
    this.scheduleParam = scheduleParam;
    return this;
  }

   /**
   * Get scheduleParam
   * @return scheduleParam
  **/
  @Schema(description = "")
  public CatalogfeedcreateScheduleParam getScheduleParam() {
    return scheduleParam;
  }

  public void setScheduleParam(CatalogfeedcreateScheduleParam scheduleParam) {
    this.scheduleParam = scheduleParam;
  }

  public FeedCreateBody updateMode(String updateMode) {
    this.updateMode = updateMode;
    return this;
  }

   /**
   * Get updateMode
   * @return updateMode
  **/
  @Schema(required = true, description = "")
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
    FeedCreateBody feedCreateBody = (FeedCreateBody) o;
    return Objects.equals(this.bcId, feedCreateBody.bcId) &&
        Objects.equals(this.catalogId, feedCreateBody.catalogId) &&
        Objects.equals(this.feedName, feedCreateBody.feedName) &&
        Objects.equals(this.scheduleParam, feedCreateBody.scheduleParam) &&
        Objects.equals(this.updateMode, feedCreateBody.updateMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, feedName, scheduleParam, updateMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedCreateBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    scheduleParam: ").append(toIndentedString(scheduleParam)).append("\n");
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
