/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixeleventcreateRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PixeleventcreatePixelEvents
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class PixeleventcreatePixelEvents {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("currency_value")
  private String currencyValue = null;

  @JsonProperty("event_code")
  private String eventCode = null;

  @JsonProperty("event_id")
  private String eventId = null;

  @JsonProperty("event_name")
  private String eventName = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("rules")
  private List<PixeleventcreateRules> rules = null;

  @JsonProperty("statistic_type")
  private String statisticType = null;

  public PixeleventcreatePixelEvents currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PixeleventcreatePixelEvents currencyValue(String currencyValue) {
    this.currencyValue = currencyValue;
    return this;
  }

   /**
   * Get currencyValue
   * @return currencyValue
  **/
  @Schema(description = "")
  public String getCurrencyValue() {
    return currencyValue;
  }

  public void setCurrencyValue(String currencyValue) {
    this.currencyValue = currencyValue;
  }

  public PixeleventcreatePixelEvents eventCode(String eventCode) {
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @Schema(description = "")
  public String getEventCode() {
    return eventCode;
  }

  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }

  public PixeleventcreatePixelEvents eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(description = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public PixeleventcreatePixelEvents eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @Schema(description = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public PixeleventcreatePixelEvents eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public PixeleventcreatePixelEvents rules(List<PixeleventcreateRules> rules) {
    this.rules = rules;
    return this;
  }

  public PixeleventcreatePixelEvents addRulesItem(PixeleventcreateRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PixeleventcreateRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<PixeleventcreateRules> getRules() {
    return rules;
  }

  public void setRules(List<PixeleventcreateRules> rules) {
    this.rules = rules;
  }

  public PixeleventcreatePixelEvents statisticType(String statisticType) {
    this.statisticType = statisticType;
    return this;
  }

   /**
   * Get statisticType
   * @return statisticType
  **/
  @Schema(description = "")
  public String getStatisticType() {
    return statisticType;
  }

  public void setStatisticType(String statisticType) {
    this.statisticType = statisticType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixeleventcreatePixelEvents pixeleventcreatePixelEvents = (PixeleventcreatePixelEvents) o;
    return Objects.equals(this.currency, pixeleventcreatePixelEvents.currency) &&
        Objects.equals(this.currencyValue, pixeleventcreatePixelEvents.currencyValue) &&
        Objects.equals(this.eventCode, pixeleventcreatePixelEvents.eventCode) &&
        Objects.equals(this.eventId, pixeleventcreatePixelEvents.eventId) &&
        Objects.equals(this.eventName, pixeleventcreatePixelEvents.eventName) &&
        Objects.equals(this.eventType, pixeleventcreatePixelEvents.eventType) &&
        Objects.equals(this.rules, pixeleventcreatePixelEvents.rules) &&
        Objects.equals(this.statisticType, pixeleventcreatePixelEvents.statisticType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, currencyValue, eventCode, eventId, eventName, eventType, rules, statisticType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixeleventcreatePixelEvents {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyValue: ").append(toIndentedString(currencyValue)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    statisticType: ").append(toIndentedString(statisticType)).append("\n");
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
