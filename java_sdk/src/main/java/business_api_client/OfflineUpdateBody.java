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
 * OfflineUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class OfflineUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("auto_tracking")
  private Boolean autoTracking = null;

  @JsonProperty("event_set_id")
  private String eventSetId = null;

  @JsonProperty("name")
  private String name = null;

  public OfflineUpdateBody advertiserId(String advertiserId) {
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

  public OfflineUpdateBody autoTracking(Boolean autoTracking) {
    this.autoTracking = autoTracking;
    return this;
  }

   /**
   * Get autoTracking
   * @return autoTracking
  **/
  @Schema(description = "")
  public Boolean isAutoTracking() {
    return autoTracking;
  }

  public void setAutoTracking(Boolean autoTracking) {
    this.autoTracking = autoTracking;
  }

  public OfflineUpdateBody eventSetId(String eventSetId) {
    this.eventSetId = eventSetId;
    return this;
  }

   /**
   * Get eventSetId
   * @return eventSetId
  **/
  @Schema(required = true, description = "")
  public String getEventSetId() {
    return eventSetId;
  }

  public void setEventSetId(String eventSetId) {
    this.eventSetId = eventSetId;
  }

  public OfflineUpdateBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineUpdateBody offlineUpdateBody = (OfflineUpdateBody) o;
    return Objects.equals(this.advertiserId, offlineUpdateBody.advertiserId) &&
        Objects.equals(this.autoTracking, offlineUpdateBody.autoTracking) &&
        Objects.equals(this.eventSetId, offlineUpdateBody.eventSetId) &&
        Objects.equals(this.name, offlineUpdateBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, autoTracking, eventSetId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoTracking: ").append(toIndentedString(autoTracking)).append("\n");
    sb.append("    eventSetId: ").append(toIndentedString(eventSetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
