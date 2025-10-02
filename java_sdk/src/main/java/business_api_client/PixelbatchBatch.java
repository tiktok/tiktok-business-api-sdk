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
 * PixelbatchBatch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class PixelbatchBatch {
  @JsonProperty("context")
  private PixelContext context = null;

  @JsonProperty("event")
  private String event = null;

  @JsonProperty("event_id")
  private String eventId = null;

  @JsonProperty("properties")
  private PixelProperties properties = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("type")
  private String type = null;

  public PixelbatchBatch context(PixelContext context) {
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

  public PixelbatchBatch event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Conversion event name. Please refer to the above &#x60;Supported web events&#x60; section for accepted event names.
   * @return event
  **/
  @Schema(description = "Conversion event name. Please refer to the above `Supported web events` section for accepted event names.")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public PixelbatchBatch eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * {Any hashed ID that can identify a unique user/session and do not contain &#x60;_&#x60;}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber 
   * @return eventId
  **/
  @Schema(description = "{Any hashed ID that can identify a unique user/session and do not contain `_`}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber ")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public PixelbatchBatch properties(PixelProperties properties) {
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

  public PixelbatchBatch timestamp(String timestamp) {
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

  public PixelbatchBatch type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Currently only accepting value track
   * @return type
  **/
  @Schema(description = "Currently only accepting value track")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelbatchBatch pixelbatchBatch = (PixelbatchBatch) o;
    return Objects.equals(this.context, pixelbatchBatch.context) &&
        Objects.equals(this.event, pixelbatchBatch.event) &&
        Objects.equals(this.eventId, pixelbatchBatch.eventId) &&
        Objects.equals(this.properties, pixelbatchBatch.properties) &&
        Objects.equals(this.timestamp, pixelbatchBatch.timestamp) &&
        Objects.equals(this.type, pixelbatchBatch.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, event, eventId, properties, timestamp, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelbatchBatch {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
