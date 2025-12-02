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
 * OfflineCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class OfflineCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("auto_tracking")
  private Boolean autoTracking = false;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  public OfflineCreateBody advertiserId(String advertiserId) {
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

  public OfflineCreateBody autoTracking(Boolean autoTracking) {
    this.autoTracking = autoTracking;
    return this;
  }

   /**
   * Get autoTracking
   * @return autoTracking
  **/
  @Schema(description = "")
  public Boolean isAutoTracking() {
    return autoTracking;
  }

  public void setAutoTracking(Boolean autoTracking) {
    this.autoTracking = autoTracking;
  }

  public OfflineCreateBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfflineCreateBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineCreateBody offlineCreateBody = (OfflineCreateBody) o;
    return Objects.equals(this.advertiserId, offlineCreateBody.advertiserId) &&
        Objects.equals(this.autoTracking, offlineCreateBody.autoTracking) &&
        Objects.equals(this.description, offlineCreateBody.description) &&
        Objects.equals(this.name, offlineCreateBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, autoTracking, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoTracking: ").append(toIndentedString(autoTracking)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
