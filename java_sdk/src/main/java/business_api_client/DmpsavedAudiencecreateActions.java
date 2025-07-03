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
import java.util.ArrayList;
import java.util.List;
/**
 * DmpsavedAudiencecreateActions
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class DmpsavedAudiencecreateActions {
  @JsonProperty("action_category_ids")
  private List<String> actionCategoryIds = null;

  @JsonProperty("action_period")
  private Integer actionPeriod = null;

  @JsonProperty("action_scene")
  private String actionScene = null;

  @JsonProperty("video_user_actions")
  private List<String> videoUserActions = null;

  public DmpsavedAudiencecreateActions actionCategoryIds(List<String> actionCategoryIds) {
    this.actionCategoryIds = actionCategoryIds;
    return this;
  }

  public DmpsavedAudiencecreateActions addActionCategoryIdsItem(String actionCategoryIdsItem) {
    if (this.actionCategoryIds == null) {
      this.actionCategoryIds = new ArrayList<String>();
    }
    this.actionCategoryIds.add(actionCategoryIdsItem);
    return this;
  }

   /**
   * Required when actions has been specified and valid only when TikTok placement is the only placement selected in your ad group. IDs of the action categories (behaviors) or hashtags that you want to target. You can get action category IDs via /tool/action_category/.
   * @return actionCategoryIds
  **/
  @Schema(description = "Required when actions has been specified and valid only when TikTok placement is the only placement selected in your ad group. IDs of the action categories (behaviors) or hashtags that you want to target. You can get action category IDs via /tool/action_category/.")
  public List<String> getActionCategoryIds() {
    return actionCategoryIds;
  }

  public void setActionCategoryIds(List<String> actionCategoryIds) {
    this.actionCategoryIds = actionCategoryIds;
  }

  public DmpsavedAudiencecreateActions actionPeriod(Integer actionPeriod) {
    this.actionPeriod = actionPeriod;
    return this;
  }

   /**
   * Required when actions has been specified. The time period to include actions from. Enum values: 0, 7, 15. If action_scene is CREATOR_RELATED or HASHTAG_RELATED, 0 will be used regardless of the value you pass in. 0 means that there is no definite timeframe to select actions from.
   * @return actionPeriod
  **/
  @Schema(description = "Required when actions has been specified. The time period to include actions from. Enum values: 0, 7, 15. If action_scene is CREATOR_RELATED or HASHTAG_RELATED, 0 will be used regardless of the value you pass in. 0 means that there is no definite timeframe to select actions from.")
  public Integer getActionPeriod() {
    return actionPeriod;
  }

  public void setActionPeriod(Integer actionPeriod) {
    this.actionPeriod = actionPeriod;
  }

  public DmpsavedAudiencecreateActions actionScene(String actionScene) {
    this.actionScene = actionScene;
    return this;
  }

   /**
   * Required when actions has been specified. Where you can collect information about user actions. Enum values: VIDEO_RELATED, CREATOR_RELATED, HASHTAG_RELATED.
   * @return actionScene
  **/
  @Schema(description = "Required when actions has been specified. Where you can collect information about user actions. Enum values: VIDEO_RELATED, CREATOR_RELATED, HASHTAG_RELATED.")
  public String getActionScene() {
    return actionScene;
  }

  public void setActionScene(String actionScene) {
    this.actionScene = actionScene;
  }

  public DmpsavedAudiencecreateActions videoUserActions(List<String> videoUserActions) {
    this.videoUserActions = videoUserActions;
    return this;
  }

  public DmpsavedAudiencecreateActions addVideoUserActionsItem(String videoUserActionsItem) {
    if (this.videoUserActions == null) {
      this.videoUserActions = new ArrayList<String>();
    }
    this.videoUserActions.add(videoUserActionsItem);
    return this;
  }

   /**
   * Required when actions has been specified. Video-related Actions. If action_scene is VIDEO_RELATED, the allowed values are: WATCHED_TO_END,LIKED,COMMENTED,SHARED. If action_scene is CREATOR_RELATED, the allowed values are: FOLLOWING, VIEW_HOMEPAGE. If action_scene is HASHTAG_RELATED, the allowed value is VIEW_HASHTAG.
   * @return videoUserActions
  **/
  @Schema(description = "Required when actions has been specified. Video-related Actions. If action_scene is VIDEO_RELATED, the allowed values are: WATCHED_TO_END,LIKED,COMMENTED,SHARED. If action_scene is CREATOR_RELATED, the allowed values are: FOLLOWING, VIEW_HOMEPAGE. If action_scene is HASHTAG_RELATED, the allowed value is VIEW_HASHTAG.")
  public List<String> getVideoUserActions() {
    return videoUserActions;
  }

  public void setVideoUserActions(List<String> videoUserActions) {
    this.videoUserActions = videoUserActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpsavedAudiencecreateActions dmpsavedAudiencecreateActions = (DmpsavedAudiencecreateActions) o;
    return Objects.equals(this.actionCategoryIds, dmpsavedAudiencecreateActions.actionCategoryIds) &&
        Objects.equals(this.actionPeriod, dmpsavedAudiencecreateActions.actionPeriod) &&
        Objects.equals(this.actionScene, dmpsavedAudiencecreateActions.actionScene) &&
        Objects.equals(this.videoUserActions, dmpsavedAudiencecreateActions.videoUserActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategoryIds, actionPeriod, actionScene, videoUserActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpsavedAudiencecreateActions {\n");
    
    sb.append("    actionCategoryIds: ").append(toIndentedString(actionCategoryIds)).append("\n");
    sb.append("    actionPeriod: ").append(toIndentedString(actionPeriod)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    videoUserActions: ").append(toIndentedString(videoUserActions)).append("\n");
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
