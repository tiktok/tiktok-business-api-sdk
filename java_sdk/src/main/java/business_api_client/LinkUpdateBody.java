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
 * LinkUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class LinkUpdateBody {
  @JsonProperty("advertiser_ids")
  private List<String> advertiserIds = new ArrayList<String>();

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("pixel_code")
  private String pixelCode = null;

  @JsonProperty("relation_status")
  private String relationStatus = null;

  public LinkUpdateBody advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public LinkUpdateBody addAdvertiserIdsItem(String advertiserIdsItem) {
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * Get advertiserIds
   * @return advertiserIds
  **/
  @Schema(required = true, description = "")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  public LinkUpdateBody bcId(String bcId) {
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

  public LinkUpdateBody pixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
    return this;
  }

   /**
   * Get pixelCode
   * @return pixelCode
  **/
  @Schema(required = true, description = "")
  public String getPixelCode() {
    return pixelCode;
  }

  public void setPixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
  }

  public LinkUpdateBody relationStatus(String relationStatus) {
    this.relationStatus = relationStatus;
    return this;
  }

   /**
   * Get relationStatus
   * @return relationStatus
  **/
  @Schema(required = true, description = "")
  public String getRelationStatus() {
    return relationStatus;
  }

  public void setRelationStatus(String relationStatus) {
    this.relationStatus = relationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkUpdateBody linkUpdateBody = (LinkUpdateBody) o;
    return Objects.equals(this.advertiserIds, linkUpdateBody.advertiserIds) &&
        Objects.equals(this.bcId, linkUpdateBody.bcId) &&
        Objects.equals(this.pixelCode, linkUpdateBody.pixelCode) &&
        Objects.equals(this.relationStatus, linkUpdateBody.relationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, bcId, pixelCode, relationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkUpdateBody {\n");
    
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    pixelCode: ").append(toIndentedString(pixelCode)).append("\n");
    sb.append("    relationStatus: ").append(toIndentedString(relationStatus)).append("\n");
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
