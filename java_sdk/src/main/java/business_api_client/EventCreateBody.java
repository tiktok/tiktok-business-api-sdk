/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixeleventcreatePixelEvents;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EventCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class EventCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("pixel_events")
  private List<PixeleventcreatePixelEvents> pixelEvents = new ArrayList<PixeleventcreatePixelEvents>();

  @JsonProperty("pixel_id")
  private String pixelId = null;

  public EventCreateBody advertiserId(String advertiserId) {
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

  public EventCreateBody pixelEvents(List<PixeleventcreatePixelEvents> pixelEvents) {
    this.pixelEvents = pixelEvents;
    return this;
  }

  public EventCreateBody addPixelEventsItem(PixeleventcreatePixelEvents pixelEventsItem) {
    this.pixelEvents.add(pixelEventsItem);
    return this;
  }

   /**
   * Get pixelEvents
   * @return pixelEvents
  **/
  @Schema(required = true, description = "")
  public List<PixeleventcreatePixelEvents> getPixelEvents() {
    return pixelEvents;
  }

  public void setPixelEvents(List<PixeleventcreatePixelEvents> pixelEvents) {
    this.pixelEvents = pixelEvents;
  }

  public EventCreateBody pixelId(String pixelId) {
    this.pixelId = pixelId;
    return this;
  }

   /**
   * Get pixelId
   * @return pixelId
  **/
  @Schema(required = true, description = "")
  public String getPixelId() {
    return pixelId;
  }

  public void setPixelId(String pixelId) {
    this.pixelId = pixelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCreateBody eventCreateBody = (EventCreateBody) o;
    return Objects.equals(this.advertiserId, eventCreateBody.advertiserId) &&
        Objects.equals(this.pixelEvents, eventCreateBody.pixelEvents) &&
        Objects.equals(this.pixelId, eventCreateBody.pixelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, pixelEvents, pixelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    pixelEvents: ").append(toIndentedString(pixelEvents)).append("\n");
    sb.append("    pixelId: ").append(toIndentedString(pixelId)).append("\n");
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
