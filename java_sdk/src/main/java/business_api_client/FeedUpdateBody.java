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
 * FeedUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class FeedUpdateBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("feed_id")
  private String feedId = null;

  @JsonProperty("feed_name")
  private String feedName = null;

  @JsonProperty("schedule_param")
  private CatalogfeedcreateScheduleParam scheduleParam = null;

  @JsonProperty("update_mode")
  private String updateMode = null;

  public FeedUpdateBody bcId(String bcId) {
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

  public FeedUpdateBody catalogId(String catalogId) {
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

  public FeedUpdateBody feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Get feedId
   * @return feedId
  **/
  @Schema(required = true, description = "")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public FeedUpdateBody feedName(String feedName) {
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

  public FeedUpdateBody scheduleParam(CatalogfeedcreateScheduleParam scheduleParam) {
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

  public FeedUpdateBody updateMode(String updateMode) {
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
    FeedUpdateBody feedUpdateBody = (FeedUpdateBody) o;
    return Objects.equals(this.bcId, feedUpdateBody.bcId) &&
        Objects.equals(this.catalogId, feedUpdateBody.catalogId) &&
        Objects.equals(this.feedId, feedUpdateBody.feedId) &&
        Objects.equals(this.feedName, feedUpdateBody.feedName) &&
        Objects.equals(this.scheduleParam, feedUpdateBody.scheduleParam) &&
        Objects.equals(this.updateMode, feedUpdateBody.updateMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, feedId, feedName, scheduleParam, updateMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedUpdateBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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
