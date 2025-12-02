/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixelContext;
import business_api_client.PixelProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PixelTrackBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class PixelTrackBody {
  @JsonProperty("context")
  private PixelContext context = null;

  @JsonProperty("event")
  private String event = null;

  @JsonProperty("event_id")
  private String eventId = null;

  @JsonProperty("pixel_code")
  private String pixelCode = null;

  @JsonProperty("properties")
  private PixelProperties properties = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public PixelTrackBody context(PixelContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public PixelContext getContext() {
    return context;
  }

  public void setContext(PixelContext context) {
    this.context = context;
  }

  public PixelTrackBody event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Conversion event name. Please refer to the above &#x60;Supported web events section&#x60; for accepted event names.
   * @return event
  **/
  @Schema(required = true, description = "Conversion event name. Please refer to the above `Supported web events section` for accepted event names.")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public PixelTrackBody eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Any string or hashed ID that can identify a unique event. This is required if you are sending overlapping events from both TikTok Pixel and Events API.  Please check the [deduplication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584864945154) subsection for details and complete the setup. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber 
   * @return eventId
  **/
  @Schema(description = "Any string or hashed ID that can identify a unique event. This is required if you are sending overlapping events from both TikTok Pixel and Events API.  Please check the [deduplication](https://ads.tiktok.com/marketing_api/docs?id=1739584864945154) subsection for details and complete the setup. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber ")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public PixelTrackBody pixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
    return this;
  }

   /**
   * Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584855420929) section
   * @return pixelCode
  **/
  @Schema(required = true, description = "Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929) section")
  public String getPixelCode() {
    return pixelCode;
  }

  public void setPixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
  }

  public PixelTrackBody properties(PixelProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public PixelProperties getProperties() {
    return properties;
  }

  public void setProperties(PixelProperties properties) {
    this.properties = properties;
  }

  public PixelTrackBody timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.
   * @return timestamp
  **/
  @Schema(description = "Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelTrackBody pixelTrackBody = (PixelTrackBody) o;
    return Objects.equals(this.context, pixelTrackBody.context) &&
        Objects.equals(this.event, pixelTrackBody.event) &&
        Objects.equals(this.eventId, pixelTrackBody.eventId) &&
        Objects.equals(this.pixelCode, pixelTrackBody.pixelCode) &&
        Objects.equals(this.properties, pixelTrackBody.properties) &&
        Objects.equals(this.timestamp, pixelTrackBody.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, event, eventId, pixelCode, properties, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelTrackBody {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    pixelCode: ").append(toIndentedString(pixelCode)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
