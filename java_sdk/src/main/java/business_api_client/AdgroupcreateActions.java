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
 * AdgroupcreateActions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class AdgroupcreateActions {
  @JsonProperty("action_category_ids")
  private List<String> actionCategoryIds = null;

  @JsonProperty("action_period")
  private Integer actionPeriod = null;

  @JsonProperty("action_scene")
  private String actionScene = null;

  @JsonProperty("video_user_actions")
  private List<String> videoUserActions = null;

  public AdgroupcreateActions actionCategoryIds(List<String> actionCategoryIds) {
    this.actionCategoryIds = actionCategoryIds;
    return this;
  }

  public AdgroupcreateActions addActionCategoryIdsItem(String actionCategoryIdsItem) {
    if (this.actionCategoryIds == null) {
      this.actionCategoryIds = new ArrayList<String>();
    }
    this.actionCategoryIds.add(actionCategoryIdsItem);
    return this;
  }

   /**
   * Get actionCategoryIds
   * @return actionCategoryIds
  **/
  @Schema(description = "")
  public List<String> getActionCategoryIds() {
    return actionCategoryIds;
  }

  public void setActionCategoryIds(List<String> actionCategoryIds) {
    this.actionCategoryIds = actionCategoryIds;
  }

  public AdgroupcreateActions actionPeriod(Integer actionPeriod) {
    this.actionPeriod = actionPeriod;
    return this;
  }

   /**
   * Get actionPeriod
   * @return actionPeriod
  **/
  @Schema(description = "")
  public Integer getActionPeriod() {
    return actionPeriod;
  }

  public void setActionPeriod(Integer actionPeriod) {
    this.actionPeriod = actionPeriod;
  }

  public AdgroupcreateActions actionScene(String actionScene) {
    this.actionScene = actionScene;
    return this;
  }

   /**
   * Get actionScene
   * @return actionScene
  **/
  @Schema(description = "")
  public String getActionScene() {
    return actionScene;
  }

  public void setActionScene(String actionScene) {
    this.actionScene = actionScene;
  }

  public AdgroupcreateActions videoUserActions(List<String> videoUserActions) {
    this.videoUserActions = videoUserActions;
    return this;
  }

  public AdgroupcreateActions addVideoUserActionsItem(String videoUserActionsItem) {
    if (this.videoUserActions == null) {
      this.videoUserActions = new ArrayList<String>();
    }
    this.videoUserActions.add(videoUserActionsItem);
    return this;
  }

   /**
   * Get videoUserActions
   * @return videoUserActions
  **/
  @Schema(description = "")
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
    AdgroupcreateActions adgroupcreateActions = (AdgroupcreateActions) o;
    return Objects.equals(this.actionCategoryIds, adgroupcreateActions.actionCategoryIds) &&
        Objects.equals(this.actionPeriod, adgroupcreateActions.actionPeriod) &&
        Objects.equals(this.actionScene, adgroupcreateActions.actionScene) &&
        Objects.equals(this.videoUserActions, adgroupcreateActions.videoUserActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategoryIds, actionPeriod, actionScene, videoUserActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateActions {\n");
    
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
