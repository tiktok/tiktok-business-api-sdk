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
 * CampaigngmvMaxupdatePromotionDaysCustomScheduleList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class CampaigngmvMaxupdatePromotionDaysCustomScheduleList {
  @JsonProperty("end_date")
  private String endDate = null;

  @JsonProperty("schedule_type")
  private String scheduleType = "STARTEND";

  @JsonProperty("start_date")
  private String startDate = null;

  public CampaigngmvMaxupdatePromotionDaysCustomScheduleList endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CampaigngmvMaxupdatePromotionDaysCustomScheduleList scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @Schema(description = "")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public CampaigngmvMaxupdatePromotionDaysCustomScheduleList startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaigngmvMaxupdatePromotionDaysCustomScheduleList campaigngmvMaxupdatePromotionDaysCustomScheduleList = (CampaigngmvMaxupdatePromotionDaysCustomScheduleList) o;
    return Objects.equals(this.endDate, campaigngmvMaxupdatePromotionDaysCustomScheduleList.endDate) &&
        Objects.equals(this.scheduleType, campaigngmvMaxupdatePromotionDaysCustomScheduleList.scheduleType) &&
        Objects.equals(this.startDate, campaigngmvMaxupdatePromotionDaysCustomScheduleList.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, scheduleType, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxupdatePromotionDaysCustomScheduleList {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
