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
 * FilteringAdvertiserBalanceGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class FilteringAdvertiserBalanceGet {
  @JsonProperty("advertiser_status")
  private List<String> advertiserStatus = null;

  @JsonProperty("keyword")
  private String keyword = null;

  public FilteringAdvertiserBalanceGet advertiserStatus(List<String> advertiserStatus) {
    this.advertiserStatus = advertiserStatus;
    return this;
  }

  public FilteringAdvertiserBalanceGet addAdvertiserStatusItem(String advertiserStatusItem) {
    if (this.advertiserStatus == null) {
      this.advertiserStatus = new ArrayList<String>();
    }
    this.advertiserStatus.add(advertiserStatusItem);
    return this;
  }

   /**
   * Get advertiserStatus
   * @return advertiserStatus
  **/
  @Schema(description = "")
  public List<String> getAdvertiserStatus() {
    return advertiserStatus;
  }

  public void setAdvertiserStatus(List<String> advertiserStatus) {
    this.advertiserStatus = advertiserStatus;
  }

  public FilteringAdvertiserBalanceGet keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringAdvertiserBalanceGet filteringAdvertiserBalanceGet = (FilteringAdvertiserBalanceGet) o;
    return Objects.equals(this.advertiserStatus, filteringAdvertiserBalanceGet.advertiserStatus) &&
        Objects.equals(this.keyword, filteringAdvertiserBalanceGet.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserStatus, keyword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringAdvertiserBalanceGet {\n");
    
    sb.append("    advertiserStatus: ").append(toIndentedString(advertiserStatus)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
