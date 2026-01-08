/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules {
  @JsonProperty("event_source_ids")
  private List<String> eventSourceIds = null;

  @JsonProperty("filter_set")
  private DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet filterSet = null;

  @JsonProperty("retention_days")
  private Integer retentionDays = null;

  public DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules eventSourceIds(List<String> eventSourceIds) {
    this.eventSourceIds = eventSourceIds;
    return this;
  }

  public DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules addEventSourceIdsItem(String eventSourceIdsItem) {
    if (this.eventSourceIds == null) {
      this.eventSourceIds = new ArrayList<String>();
    }
    this.eventSourceIds.add(eventSourceIdsItem);
    return this;
  }

   /**
   * Required when audience_type is not ENGAGEMENT or LEAD_GENERATION. List of event source IDs of the rule. For an Engagement Audience, use ad group IDs as event source IDs. If not specified, all available event source IDs will be used. For an Organic Engagement Audience, use TikTok post IDs as event source IDs. You can use /identity/video/get/ to get TikTok post IDs. The maximum allowed number of TikTok post IDs is 10. For a Live Engagement Audience, use live video ID as event source IDs. You can use /identity/live/get/ to get live video IDs. The maximum allowed number of live video IDs is 10. For an App Activity Audience, use App IDs as event source IDs. For a Website Traffic Audience, use pixel IDs as event source IDs. For a Lead Generation Audience, do not pass in this field. Otherwise, an error will occur. If not specified, all available event source IDs will be used. For a Business Account Audience, use core user IDs of the advertisers. You can use /user/info/ to get a core user ID. For a Shop Activity Audience, use TikTok Shop IDs as event source IDs. You can use /store/list/ to get TikTok Shop IDs. For an Offline Activity Audience, use Offline Event set IDs as event source IDs. You can use /offline/get/ to get Offline Event set IDs.
   * @return eventSourceIds
  **/
  @Schema(description = "Required when audience_type is not ENGAGEMENT or LEAD_GENERATION. List of event source IDs of the rule. For an Engagement Audience, use ad group IDs as event source IDs. If not specified, all available event source IDs will be used. For an Organic Engagement Audience, use TikTok post IDs as event source IDs. You can use /identity/video/get/ to get TikTok post IDs. The maximum allowed number of TikTok post IDs is 10. For a Live Engagement Audience, use live video ID as event source IDs. You can use /identity/live/get/ to get live video IDs. The maximum allowed number of live video IDs is 10. For an App Activity Audience, use App IDs as event source IDs. For a Website Traffic Audience, use pixel IDs as event source IDs. For a Lead Generation Audience, do not pass in this field. Otherwise, an error will occur. If not specified, all available event source IDs will be used. For a Business Account Audience, use core user IDs of the advertisers. You can use /user/info/ to get a core user ID. For a Shop Activity Audience, use TikTok Shop IDs as event source IDs. You can use /store/list/ to get TikTok Shop IDs. For an Offline Activity Audience, use Offline Event set IDs as event source IDs. You can use /offline/get/ to get Offline Event set IDs.")
  public List<String> getEventSourceIds() {
    return eventSourceIds;
  }

  public void setEventSourceIds(List<String> eventSourceIds) {
    this.eventSourceIds = eventSourceIds;
  }

  public DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules filterSet(DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet filterSet) {
    this.filterSet = filterSet;
    return this;
  }

   /**
   * Get filterSet
   * @return filterSet
  **/
  @Schema(description = "")
  public DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet getFilterSet() {
    return filterSet;
  }

  public void setFilterSet(DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet filterSet) {
    this.filterSet = filterSet;
  }

  public DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * Audience lookback window. For enum values, see Enumerations - Lookback window. Note: If audience_type &#x3D; BUSINESS_ACCOUNT, and the value in the filters object is not BUSINESS ACCOUNT PROFILE FOLLOW, then retention_days must be 7, 14, or 30. If audience_type &#x3D; ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO, then retention_days must be 7, 14, or 30. To avoid confusion between retention_days and retention_in_days, we&#x27;ll rename retention_days in the next API version.
   * @return retentionDays
  **/
  @Schema(required = true, description = "Audience lookback window. For enum values, see Enumerations - Lookback window. Note: If audience_type = BUSINESS_ACCOUNT, and the value in the filters object is not BUSINESS ACCOUNT PROFILE FOLLOW, then retention_days must be 7, 14, or 30. If audience_type = ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO, then retention_days must be 7, 14, or 30. To avoid confusion between retention_days and retention_in_days, we'll rename retention_days in the next API version.")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules = (DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules) o;
    return Objects.equals(this.eventSourceIds, dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules.eventSourceIds) &&
        Objects.equals(this.filterSet, dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules.filterSet) &&
        Objects.equals(this.retentionDays, dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules.retentionDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSourceIds, filterSet, retentionDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules {\n");
    
    sb.append("    eventSourceIds: ").append(toIndentedString(eventSourceIds)).append("\n");
    sb.append("    filterSet: ").append(toIndentedString(filterSet)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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
