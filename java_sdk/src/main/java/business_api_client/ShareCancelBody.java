/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencefileuploadContextInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ShareCancelBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class ShareCancelBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("context_info")
  private DmpcustomAudiencefileuploadContextInfo contextInfo = null;

  @JsonProperty("custom_audience_id")
  private String customAudienceId = null;

  @JsonProperty("shared_advertiser_id")
  private String sharedAdvertiserId = null;

  public ShareCancelBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * The advertiser ID that performed the operation.
   * @return advertiserId
  **/
  @Schema(required = true, description = "The advertiser ID that performed the operation.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public ShareCancelBody contextInfo(DmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public DmpcustomAudiencefileuploadContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(DmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public ShareCancelBody customAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * The audience ID that you want to stop sharing.
   * @return customAudienceId
  **/
  @Schema(required = true, description = "The audience ID that you want to stop sharing.")
  public String getCustomAudienceId() {
    return customAudienceId;
  }

  public void setCustomAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
  }

  public ShareCancelBody sharedAdvertiserId(String sharedAdvertiserId) {
    this.sharedAdvertiserId = sharedAdvertiserId;
    return this;
  }

   /**
   * The advertiser ID you want to stop sharing with. You only need to pass this field if you want to stop sharing audiences with an advertiser.
   * @return sharedAdvertiserId
  **/
  @Schema(required = true, description = "The advertiser ID you want to stop sharing with. You only need to pass this field if you want to stop sharing audiences with an advertiser.")
  public String getSharedAdvertiserId() {
    return sharedAdvertiserId;
  }

  public void setSharedAdvertiserId(String sharedAdvertiserId) {
    this.sharedAdvertiserId = sharedAdvertiserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareCancelBody shareCancelBody = (ShareCancelBody) o;
    return Objects.equals(this.advertiserId, shareCancelBody.advertiserId) &&
        Objects.equals(this.contextInfo, shareCancelBody.contextInfo) &&
        Objects.equals(this.customAudienceId, shareCancelBody.customAudienceId) &&
        Objects.equals(this.sharedAdvertiserId, shareCancelBody.sharedAdvertiserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, contextInfo, customAudienceId, sharedAdvertiserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareCancelBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    sharedAdvertiserId: ").append(toIndentedString(sharedAdvertiserId)).append("\n");
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
