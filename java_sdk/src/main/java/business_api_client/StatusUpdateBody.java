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
 * StatusUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class StatusUpdateBody {
  @JsonProperty("ad_type")
  private String adType = "BIDDING";

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("comment_ids")
  private List<String> commentIds = new ArrayList<String>();

  @JsonProperty("operation")
  private String operation = null;

  public StatusUpdateBody adType(String adType) {
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @Schema(description = "")
  public String getAdType() {
    return adType;
  }

  public void setAdType(String adType) {
    this.adType = adType;
  }

  public StatusUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public StatusUpdateBody commentIds(List<String> commentIds) {
    this.commentIds = commentIds;
    return this;
  }

  public StatusUpdateBody addCommentIdsItem(String commentIdsItem) {
    this.commentIds.add(commentIdsItem);
    return this;
  }

   /**
   * Get commentIds
   * @return commentIds
  **/
  @Schema(required = true, description = "")
  public List<String> getCommentIds() {
    return commentIds;
  }

  public void setCommentIds(List<String> commentIds) {
    this.commentIds = commentIds;
  }

  public StatusUpdateBody operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @Schema(required = true, description = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdateBody statusUpdateBody = (StatusUpdateBody) o;
    return Objects.equals(this.adType, statusUpdateBody.adType) &&
        Objects.equals(this.advertiserId, statusUpdateBody.advertiserId) &&
        Objects.equals(this.commentIds, statusUpdateBody.commentIds) &&
        Objects.equals(this.operation, statusUpdateBody.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, advertiserId, commentIds, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateBody {\n");
    
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    commentIds: ").append(toIndentedString(commentIds)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
