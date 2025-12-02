/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OptimizerrulebatchBindBindInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * RuleBatchBindBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class RuleBatchBindBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("bind_info")
  private List<OptimizerrulebatchBindBindInfo> bindInfo = new ArrayList<OptimizerrulebatchBindBindInfo>();

  @JsonProperty("lang")
  private String lang = "EN";

  public RuleBatchBindBody advertiserId(String advertiserId) {
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

  public RuleBatchBindBody bindInfo(List<OptimizerrulebatchBindBindInfo> bindInfo) {
    this.bindInfo = bindInfo;
    return this;
  }

  public RuleBatchBindBody addBindInfoItem(OptimizerrulebatchBindBindInfo bindInfoItem) {
    this.bindInfo.add(bindInfoItem);
    return this;
  }

   /**
   * Get bindInfo
   * @return bindInfo
  **/
  @Schema(required = true, description = "")
  public List<OptimizerrulebatchBindBindInfo> getBindInfo() {
    return bindInfo;
  }

  public void setBindInfo(List<OptimizerrulebatchBindBindInfo> bindInfo) {
    this.bindInfo = bindInfo;
  }

  public RuleBatchBindBody lang(String lang) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleBatchBindBody ruleBatchBindBody = (RuleBatchBindBody) o;
    return Objects.equals(this.advertiserId, ruleBatchBindBody.advertiserId) &&
        Objects.equals(this.bindInfo, ruleBatchBindBody.bindInfo) &&
        Objects.equals(this.lang, ruleBatchBindBody.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bindInfo, lang);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleBatchBindBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bindInfo: ").append(toIndentedString(bindInfo)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
