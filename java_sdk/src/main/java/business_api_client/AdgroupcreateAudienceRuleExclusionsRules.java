/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdgroupcreateAudienceRuleExclusionsEventSources;
import business_api_client.AdgroupcreateAudienceRuleExclusionsFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdgroupcreateAudienceRuleExclusionsRules
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class AdgroupcreateAudienceRuleExclusionsRules {
  @JsonProperty("event_sources")
  private List<AdgroupcreateAudienceRuleExclusionsEventSources> eventSources = null;

  @JsonProperty("filter")
  private AdgroupcreateAudienceRuleExclusionsFilter filter = null;

  @JsonProperty("retention")
  private String retention = null;

  public AdgroupcreateAudienceRuleExclusionsRules eventSources(List<AdgroupcreateAudienceRuleExclusionsEventSources> eventSources) {
    this.eventSources = eventSources;
    return this;
  }

  public AdgroupcreateAudienceRuleExclusionsRules addEventSourcesItem(AdgroupcreateAudienceRuleExclusionsEventSources eventSourcesItem) {
    if (this.eventSources == null) {
      this.eventSources = new ArrayList<AdgroupcreateAudienceRuleExclusionsEventSources>();
    }
    this.eventSources.add(eventSourcesItem);
    return this;
  }

   /**
   * Get eventSources
   * @return eventSources
  **/
  @Schema(description = "")
  public List<AdgroupcreateAudienceRuleExclusionsEventSources> getEventSources() {
    return eventSources;
  }

  public void setEventSources(List<AdgroupcreateAudienceRuleExclusionsEventSources> eventSources) {
    this.eventSources = eventSources;
  }

  public AdgroupcreateAudienceRuleExclusionsRules filter(AdgroupcreateAudienceRuleExclusionsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public AdgroupcreateAudienceRuleExclusionsFilter getFilter() {
    return filter;
  }

  public void setFilter(AdgroupcreateAudienceRuleExclusionsFilter filter) {
    this.filter = filter;
  }

  public AdgroupcreateAudienceRuleExclusionsRules retention(String retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @Schema(description = "")
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupcreateAudienceRuleExclusionsRules adgroupcreateAudienceRuleExclusionsRules = (AdgroupcreateAudienceRuleExclusionsRules) o;
    return Objects.equals(this.eventSources, adgroupcreateAudienceRuleExclusionsRules.eventSources) &&
        Objects.equals(this.filter, adgroupcreateAudienceRuleExclusionsRules.filter) &&
        Objects.equals(this.retention, adgroupcreateAudienceRuleExclusionsRules.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSources, filter, retention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateAudienceRuleExclusionsRules {\n");
    
    sb.append("    eventSources: ").append(toIndentedString(eventSources)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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
