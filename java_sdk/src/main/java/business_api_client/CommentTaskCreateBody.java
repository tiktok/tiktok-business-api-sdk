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
 * CommentTaskCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class CommentTaskCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("comment_ids")
  private List<String> commentIds = null;

  @JsonProperty("comment_status")
  private List<String> commentStatus = null;

  @JsonProperty("comment_type")
  private List<String> commentType = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("lang")
  private String lang = "EN";

  @JsonProperty("search_field")
  private String searchField = null;

  @JsonProperty("search_value")
  private String searchValue = null;

  @JsonProperty("sort_field")
  private String sortField = "CREATE_TIME";

  @JsonProperty("sort_type")
  private String sortType = "DESC";

  @JsonProperty("start_time")
  private String startTime = null;

  public CommentTaskCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public CommentTaskCreateBody commentIds(List<String> commentIds) {
    this.commentIds = commentIds;
    return this;
  }

  public CommentTaskCreateBody addCommentIdsItem(String commentIdsItem) {
    if (this.commentIds == null) {
      this.commentIds = new ArrayList<String>();
    }
    this.commentIds.add(commentIdsItem);
    return this;
  }

   /**
   * Get commentIds
   * @return commentIds
  **/
  @Schema(description = "")
  public List<String> getCommentIds() {
    return commentIds;
  }

  public void setCommentIds(List<String> commentIds) {
    this.commentIds = commentIds;
  }

  public CommentTaskCreateBody commentStatus(List<String> commentStatus) {
    this.commentStatus = commentStatus;
    return this;
  }

  public CommentTaskCreateBody addCommentStatusItem(String commentStatusItem) {
    if (this.commentStatus == null) {
      this.commentStatus = new ArrayList<String>();
    }
    this.commentStatus.add(commentStatusItem);
    return this;
  }

   /**
   * Get commentStatus
   * @return commentStatus
  **/
  @Schema(description = "")
  public List<String> getCommentStatus() {
    return commentStatus;
  }

  public void setCommentStatus(List<String> commentStatus) {
    this.commentStatus = commentStatus;
  }

  public CommentTaskCreateBody commentType(List<String> commentType) {
    this.commentType = commentType;
    return this;
  }

  public CommentTaskCreateBody addCommentTypeItem(String commentTypeItem) {
    if (this.commentType == null) {
      this.commentType = new ArrayList<String>();
    }
    this.commentType.add(commentTypeItem);
    return this;
  }

   /**
   * Get commentType
   * @return commentType
  **/
  @Schema(description = "")
  public List<String> getCommentType() {
    return commentType;
  }

  public void setCommentType(List<String> commentType) {
    this.commentType = commentType;
  }

  public CommentTaskCreateBody endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(required = true, description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public CommentTaskCreateBody lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public CommentTaskCreateBody searchField(String searchField) {
    this.searchField = searchField;
    return this;
  }

   /**
   * Get searchField
   * @return searchField
  **/
  @Schema(required = true, description = "")
  public String getSearchField() {
    return searchField;
  }

  public void setSearchField(String searchField) {
    this.searchField = searchField;
  }

  public CommentTaskCreateBody searchValue(String searchValue) {
    this.searchValue = searchValue;
    return this;
  }

   /**
   * Get searchValue
   * @return searchValue
  **/
  @Schema(required = true, description = "")
  public String getSearchValue() {
    return searchValue;
  }

  public void setSearchValue(String searchValue) {
    this.searchValue = searchValue;
  }

  public CommentTaskCreateBody sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @Schema(description = "")
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public CommentTaskCreateBody sortType(String sortType) {
    this.sortType = sortType;
    return this;
  }

   /**
   * Get sortType
   * @return sortType
  **/
  @Schema(description = "")
  public String getSortType() {
    return sortType;
  }

  public void setSortType(String sortType) {
    this.sortType = sortType;
  }

  public CommentTaskCreateBody startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(required = true, description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentTaskCreateBody commentTaskCreateBody = (CommentTaskCreateBody) o;
    return Objects.equals(this.advertiserId, commentTaskCreateBody.advertiserId) &&
        Objects.equals(this.commentIds, commentTaskCreateBody.commentIds) &&
        Objects.equals(this.commentStatus, commentTaskCreateBody.commentStatus) &&
        Objects.equals(this.commentType, commentTaskCreateBody.commentType) &&
        Objects.equals(this.endTime, commentTaskCreateBody.endTime) &&
        Objects.equals(this.lang, commentTaskCreateBody.lang) &&
        Objects.equals(this.searchField, commentTaskCreateBody.searchField) &&
        Objects.equals(this.searchValue, commentTaskCreateBody.searchValue) &&
        Objects.equals(this.sortField, commentTaskCreateBody.sortField) &&
        Objects.equals(this.sortType, commentTaskCreateBody.sortType) &&
        Objects.equals(this.startTime, commentTaskCreateBody.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, commentIds, commentStatus, commentType, endTime, lang, searchField, searchValue, sortField, sortType, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentTaskCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    commentIds: ").append(toIndentedString(commentIds)).append("\n");
    sb.append("    commentStatus: ").append(toIndentedString(commentStatus)).append("\n");
    sb.append("    commentType: ").append(toIndentedString(commentType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    searchField: ").append(toIndentedString(searchField)).append("\n");
    sb.append("    searchValue: ").append(toIndentedString(searchValue)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
