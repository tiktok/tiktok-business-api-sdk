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
 * SmartPlusAdAppealBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class SmartPlusAdAppealBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("appeal_reason")
  private String appealReason = null;

  @JsonProperty("attachment_list")
  private List<String> attachmentList = null;

  @JsonProperty("smart_plus_ad_id")
  private String smartPlusAdId = null;

  public SmartPlusAdAppealBody advertiserId(String advertiserId) {
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

  public SmartPlusAdAppealBody appealReason(String appealReason) {
    this.appealReason = appealReason;
    return this;
  }

   /**
   * Get appealReason
   * @return appealReason
  **/
  @Schema(description = "")
  public String getAppealReason() {
    return appealReason;
  }

  public void setAppealReason(String appealReason) {
    this.appealReason = appealReason;
  }

  public SmartPlusAdAppealBody attachmentList(List<String> attachmentList) {
    this.attachmentList = attachmentList;
    return this;
  }

  public SmartPlusAdAppealBody addAttachmentListItem(String attachmentListItem) {
    if (this.attachmentList == null) {
      this.attachmentList = new ArrayList<String>();
    }
    this.attachmentList.add(attachmentListItem);
    return this;
  }

   /**
   * Get attachmentList
   * @return attachmentList
  **/
  @Schema(description = "")
  public List<String> getAttachmentList() {
    return attachmentList;
  }

  public void setAttachmentList(List<String> attachmentList) {
    this.attachmentList = attachmentList;
  }

  public SmartPlusAdAppealBody smartPlusAdId(String smartPlusAdId) {
    this.smartPlusAdId = smartPlusAdId;
    return this;
  }

   /**
   * Get smartPlusAdId
   * @return smartPlusAdId
  **/
  @Schema(required = true, description = "")
  public String getSmartPlusAdId() {
    return smartPlusAdId;
  }

  public void setSmartPlusAdId(String smartPlusAdId) {
    this.smartPlusAdId = smartPlusAdId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdAppealBody smartPlusAdAppealBody = (SmartPlusAdAppealBody) o;
    return Objects.equals(this.advertiserId, smartPlusAdAppealBody.advertiserId) &&
        Objects.equals(this.appealReason, smartPlusAdAppealBody.appealReason) &&
        Objects.equals(this.attachmentList, smartPlusAdAppealBody.attachmentList) &&
        Objects.equals(this.smartPlusAdId, smartPlusAdAppealBody.smartPlusAdId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appealReason, attachmentList, smartPlusAdId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdAppealBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appealReason: ").append(toIndentedString(appealReason)).append("\n");
    sb.append("    attachmentList: ").append(toIndentedString(attachmentList)).append("\n");
    sb.append("    smartPlusAdId: ").append(toIndentedString(smartPlusAdId)).append("\n");
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
