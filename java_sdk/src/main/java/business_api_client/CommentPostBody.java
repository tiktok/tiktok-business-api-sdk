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
 * CommentPostBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class CommentPostBody {
  @JsonProperty("ad_id")
  private String adId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("comment_id")
  private String commentId = null;

  @JsonProperty("comment_type")
  private String commentType = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("tiktok_item_id")
  private String tiktokItemId = null;

  public CommentPostBody adId(String adId) {
    this.adId = adId;
    return this;
  }

   /**
   * Get adId
   * @return adId
  **/
  @Schema(required = true, description = "")
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public CommentPostBody advertiserId(String advertiserId) {
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

  public CommentPostBody commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  @Schema(required = true, description = "")
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public CommentPostBody commentType(String commentType) {
    this.commentType = commentType;
    return this;
  }

   /**
   * Get commentType
   * @return commentType
  **/
  @Schema(required = true, description = "")
  public String getCommentType() {
    return commentType;
  }

  public void setCommentType(String commentType) {
    this.commentType = commentType;
  }

  public CommentPostBody identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(required = true, description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public CommentPostBody identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(required = true, description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public CommentPostBody text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(required = true, description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CommentPostBody tiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
    return this;
  }

   /**
   * Get tiktokItemId
   * @return tiktokItemId
  **/
  @Schema(required = true, description = "")
  public String getTiktokItemId() {
    return tiktokItemId;
  }

  public void setTiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentPostBody commentPostBody = (CommentPostBody) o;
    return Objects.equals(this.adId, commentPostBody.adId) &&
        Objects.equals(this.advertiserId, commentPostBody.advertiserId) &&
        Objects.equals(this.commentId, commentPostBody.commentId) &&
        Objects.equals(this.commentType, commentPostBody.commentType) &&
        Objects.equals(this.identityId, commentPostBody.identityId) &&
        Objects.equals(this.identityType, commentPostBody.identityType) &&
        Objects.equals(this.text, commentPostBody.text) &&
        Objects.equals(this.tiktokItemId, commentPostBody.tiktokItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, commentId, commentType, identityId, identityType, text, tiktokItemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentPostBody {\n");
    
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentType: ").append(toIndentedString(commentType)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tiktokItemId: ").append(toIndentedString(tiktokItemId)).append("\n");
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
