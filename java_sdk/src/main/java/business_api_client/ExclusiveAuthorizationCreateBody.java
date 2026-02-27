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
 * ExclusiveAuthorizationCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class ExclusiveAuthorizationCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("store_authorized_bc_id")
  private String storeAuthorizedBcId = null;

  @JsonProperty("store_id")
  private String storeId = null;

  public ExclusiveAuthorizationCreateBody advertiserId(String advertiserId) {
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

  public ExclusiveAuthorizationCreateBody storeAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
    return this;
  }

   /**
   * Get storeAuthorizedBcId
   * @return storeAuthorizedBcId
  **/
  @Schema(required = true, description = "")
  public String getStoreAuthorizedBcId() {
    return storeAuthorizedBcId;
  }

  public void setStoreAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
  }

  public ExclusiveAuthorizationCreateBody storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @Schema(required = true, description = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExclusiveAuthorizationCreateBody exclusiveAuthorizationCreateBody = (ExclusiveAuthorizationCreateBody) o;
    return Objects.equals(this.advertiserId, exclusiveAuthorizationCreateBody.advertiserId) &&
        Objects.equals(this.storeAuthorizedBcId, exclusiveAuthorizationCreateBody.storeAuthorizedBcId) &&
        Objects.equals(this.storeId, exclusiveAuthorizationCreateBody.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, storeAuthorizedBcId, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExclusiveAuthorizationCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    storeAuthorizedBcId: ").append(toIndentedString(storeAuthorizedBcId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
