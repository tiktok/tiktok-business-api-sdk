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
 * OpenApiv13adgroupcreateActions
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class OpenApiv13adgroupcreateActions {
  @JsonProperty("action_category_ids")
  private List<String> actionCategoryIds = null;

  @JsonProperty("action_period")
  private Integer actionPeriod = null;

  @JsonProperty("action_scene")
  private String actionScene = null;

  @JsonProperty("video_user_actions")
  private List<String> videoUserActions = null;

  public OpenApiv13adgroupcreateActions actionCategoryIds(List<String> actionCategoryIds) {
    this.actionCategoryIds = actionCategoryIds;
    return this;
  }

  public OpenApiv13adgroupcreateActions addActionCategoryIdsItem(String actionCategoryIdsItem) {
    if (this.actionCategoryIds == null) {
      this.actionCategoryIds = new ArrayList<String>();
    }
    this.actionCategoryIds.add(actionCategoryIdsItem);
    return this;
  }

   /**
   * IDs of the action categories (behaviors) or hashtags that you want to target. This field is valid only when TikTok placement is the only placement selected.
   * @return actionCategoryIds
  **/
  @Schema(description = "IDs of the action categories (behaviors) or hashtags that you want to target. This field is valid only when TikTok placement is the only placement selected.")
  public List<String> getActionCategoryIds() {
    return actionCategoryIds;
  }

  public void setActionCategoryIds(List<String> actionCategoryIds) {
    this.actionCategoryIds = actionCategoryIds;
  }

  public OpenApiv13adgroupcreateActions actionPeriod(Integer actionPeriod) {
    this.actionPeriod = actionPeriod;
    return this;
  }

   /**
   * Select a time period to include actions from. Supported values- &#x60;0&#x60;, &#x60;7&#x60;, &#x60;15&#x60;. If &#x60;action_scene&#x60; is &#x60;CREATOR_RELATED&#x60; or &#x60;HASHTAG_RELATED&#x60;, 0 will be used regardless of the value you pass in. &#x60;0&#x60; means that there is no definite timeframe to select actions from.
   * @return actionPeriod
  **/
  @Schema(description = "Select a time period to include actions from. Supported values- `0`, `7`, `15`. If `action_scene` is `CREATOR_RELATED` or `HASHTAG_RELATED`, 0 will be used regardless of the value you pass in. `0` means that there is no definite timeframe to select actions from.")
  public Integer getActionPeriod() {
    return actionPeriod;
  }

  public void setActionPeriod(Integer actionPeriod) {
    this.actionPeriod = actionPeriod;
  }

  public OpenApiv13adgroupcreateActions actionScene(String actionScene) {
    this.actionScene = actionScene;
    return this;
  }

   /**
   * Where you can collect information about user actions. Enum values- &#x60;VIDEO_RELATED&#x60;, &#x60;CREATOR_RELATED&#x60;, &#x60;HASHTAG_RELATED&#x60;.
   * @return actionScene
  **/
  @Schema(description = "Where you can collect information about user actions. Enum values- `VIDEO_RELATED`, `CREATOR_RELATED`, `HASHTAG_RELATED`.")
  public String getActionScene() {
    return actionScene;
  }

  public void setActionScene(String actionScene) {
    this.actionScene = actionScene;
  }

  public OpenApiv13adgroupcreateActions videoUserActions(List<String> videoUserActions) {
    this.videoUserActions = videoUserActions;
    return this;
  }

  public OpenApiv13adgroupcreateActions addVideoUserActionsItem(String videoUserActionsItem) {
    if (this.videoUserActions == null) {
      this.videoUserActions = new ArrayList<String>();
    }
    this.videoUserActions.add(videoUserActionsItem);
    return this;
  }

   /**
   * Video-related Actions. If &#x60;action_scene&#x60; is &#x60;VIDEO_RELATED&#x60;, the allowed values are- &#x60;WATCHED_TO_END&#x60;,&#x60;LIKED&#x60;,&#x60;COMMENTED&#x60;,&#x60;SHARED&#x60;. If &#x60;action_scene&#x60; is &#x60;CREATOR_RELATED&#x60;, the allowed values are- &#x60;FOLLOWING&#x60;, &#x60;VIEW_HOMEPAGE&#x60;. If &#x60;action_scene&#x60; is &#x60;HASHTAG_RELATED&#x60;, the allowed value is &#x60;VIEW_HASHTAG&#x60;.
   * @return videoUserActions
  **/
  @Schema(description = "Video-related Actions. If `action_scene` is `VIDEO_RELATED`, the allowed values are- `WATCHED_TO_END`,`LIKED`,`COMMENTED`,`SHARED`. If `action_scene` is `CREATOR_RELATED`, the allowed values are- `FOLLOWING`, `VIEW_HOMEPAGE`. If `action_scene` is `HASHTAG_RELATED`, the allowed value is `VIEW_HASHTAG`.")
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
    OpenApiv13adgroupcreateActions openApiv13adgroupcreateActions = (OpenApiv13adgroupcreateActions) o;
    return Objects.equals(this.actionCategoryIds, openApiv13adgroupcreateActions.actionCategoryIds) &&
        Objects.equals(this.actionPeriod, openApiv13adgroupcreateActions.actionPeriod) &&
        Objects.equals(this.actionScene, openApiv13adgroupcreateActions.actionScene) &&
        Objects.equals(this.videoUserActions, openApiv13adgroupcreateActions.videoUserActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategoryIds, actionPeriod, actionScene, videoUserActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13adgroupcreateActions {\n");
    
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
