/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CatalogfeedcreateScheduleParamSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CatalogfeedcreateScheduleParam
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class CatalogfeedcreateScheduleParam {
  @JsonProperty("day_of_month")
  private Integer dayOfMonth = null;

  @JsonProperty("hour")
  private Integer hour = null;

  @JsonProperty("interval_count")
  private Integer intervalCount = null;

  @JsonProperty("interval_type")
  private String intervalType = null;

  @JsonProperty("minute")
  private Integer minute = null;

  @JsonProperty("source")
  private CatalogfeedcreateScheduleParamSource source = null;

  @JsonProperty("timezone")
  private String timezone = null;

  public CatalogfeedcreateScheduleParam dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Get dayOfMonth
   * minimum: 1
   * maximum: 31
   * @return dayOfMonth
  **/
  @Schema(description = "")
  public Integer getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public CatalogfeedcreateScheduleParam hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * minimum: 0
   * maximum: 23
   * @return hour
  **/
  @Schema(description = "")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public CatalogfeedcreateScheduleParam intervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
    return this;
  }

   /**
   * Get intervalCount
   * minimum: 1
   * maximum: 30
   * @return intervalCount
  **/
  @Schema(description = "")
  public Integer getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
  }

  public CatalogfeedcreateScheduleParam intervalType(String intervalType) {
    this.intervalType = intervalType;
    return this;
  }

   /**
   * Get intervalType
   * @return intervalType
  **/
  @Schema(description = "")
  public String getIntervalType() {
    return intervalType;
  }

  public void setIntervalType(String intervalType) {
    this.intervalType = intervalType;
  }

  public CatalogfeedcreateScheduleParam minute(Integer minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * minimum: 0
   * maximum: 59
   * @return minute
  **/
  @Schema(description = "")
  public Integer getMinute() {
    return minute;
  }

  public void setMinute(Integer minute) {
    this.minute = minute;
  }

  public CatalogfeedcreateScheduleParam source(CatalogfeedcreateScheduleParamSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public CatalogfeedcreateScheduleParamSource getSource() {
    return source;
  }

  public void setSource(CatalogfeedcreateScheduleParamSource source) {
    this.source = source;
  }

  public CatalogfeedcreateScheduleParam timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @Schema(description = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogfeedcreateScheduleParam catalogfeedcreateScheduleParam = (CatalogfeedcreateScheduleParam) o;
    return Objects.equals(this.dayOfMonth, catalogfeedcreateScheduleParam.dayOfMonth) &&
        Objects.equals(this.hour, catalogfeedcreateScheduleParam.hour) &&
        Objects.equals(this.intervalCount, catalogfeedcreateScheduleParam.intervalCount) &&
        Objects.equals(this.intervalType, catalogfeedcreateScheduleParam.intervalType) &&
        Objects.equals(this.minute, catalogfeedcreateScheduleParam.minute) &&
        Objects.equals(this.source, catalogfeedcreateScheduleParam.source) &&
        Objects.equals(this.timezone, catalogfeedcreateScheduleParam.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfMonth, hour, intervalCount, intervalType, minute, source, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogfeedcreateScheduleParam {\n");
    
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    intervalCount: ").append(toIndentedString(intervalCount)).append("\n");
    sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
