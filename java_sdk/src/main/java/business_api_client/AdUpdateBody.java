/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdupdateCreatives;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdUpdateBody {
  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("creatives")
  private List<AdupdateCreatives> creatives = new ArrayList<AdupdateCreatives>();

  @JsonProperty("patch_update")
  private Boolean patchUpdate = null;

  public AdUpdateBody adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @Schema(required = true, description = "")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdUpdateBody advertiserId(String advertiserId) {
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

  public AdUpdateBody creatives(List<AdupdateCreatives> creatives) {
    this.creatives = creatives;
    return this;
  }

  public AdUpdateBody addCreativesItem(AdupdateCreatives creativesItem) {
    this.creatives.add(creativesItem);
    return this;
  }

   /**
   * Get creatives
   * @return creatives
  **/
  @Schema(required = true, description = "")
  public List<AdupdateCreatives> getCreatives() {
    return creatives;
  }

  public void setCreatives(List<AdupdateCreatives> creatives) {
    this.creatives = creatives;
  }

  public AdUpdateBody patchUpdate(Boolean patchUpdate) {
    this.patchUpdate = patchUpdate;
    return this;
  }

   /**
   * Get patchUpdate
   * @return patchUpdate
  **/
  @Schema(description = "")
  public Boolean isPatchUpdate() {
    return patchUpdate;
  }

  public void setPatchUpdate(Boolean patchUpdate) {
    this.patchUpdate = patchUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdUpdateBody adUpdateBody = (AdUpdateBody) o;
    return Objects.equals(this.adgroupId, adUpdateBody.adgroupId) &&
        Objects.equals(this.advertiserId, adUpdateBody.advertiserId) &&
        Objects.equals(this.creatives, adUpdateBody.creatives) &&
        Objects.equals(this.patchUpdate, adUpdateBody.patchUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, advertiserId, creatives, patchUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUpdateBody {\n");
    
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creatives: ").append(toIndentedString(creatives)).append("\n");
    sb.append("    patchUpdate: ").append(toIndentedString(patchUpdate)).append("\n");
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
