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
 * FilteringAdvertiserTransactionGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class FilteringAdvertiserTransactionGet {
  @JsonProperty("end_date")
  private String endDate = null;

  @JsonProperty("funds_type")
  private List<String> fundsType = null;

  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("summary_by_account")
  private Boolean summaryByAccount = false;

  @JsonProperty("transfer_type")
  private String transferType = null;

  public FilteringAdvertiserTransactionGet endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public FilteringAdvertiserTransactionGet fundsType(List<String> fundsType) {
    this.fundsType = fundsType;
    return this;
  }

  public FilteringAdvertiserTransactionGet addFundsTypeItem(String fundsTypeItem) {
    if (this.fundsType == null) {
      this.fundsType = new ArrayList<String>();
    }
    this.fundsType.add(fundsTypeItem);
    return this;
  }

   /**
   * Get fundsType
   * @return fundsType
  **/
  @Schema(description = "")
  public List<String> getFundsType() {
    return fundsType;
  }

  public void setFundsType(List<String> fundsType) {
    this.fundsType = fundsType;
  }

  public FilteringAdvertiserTransactionGet keyword(String keyword) {
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

  public FilteringAdvertiserTransactionGet startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public FilteringAdvertiserTransactionGet summaryByAccount(Boolean summaryByAccount) {
    this.summaryByAccount = summaryByAccount;
    return this;
  }

   /**
   * Get summaryByAccount
   * @return summaryByAccount
  **/
  @Schema(description = "")
  public Boolean isSummaryByAccount() {
    return summaryByAccount;
  }

  public void setSummaryByAccount(Boolean summaryByAccount) {
    this.summaryByAccount = summaryByAccount;
  }

  public FilteringAdvertiserTransactionGet transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @Schema(description = "")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringAdvertiserTransactionGet filteringAdvertiserTransactionGet = (FilteringAdvertiserTransactionGet) o;
    return Objects.equals(this.endDate, filteringAdvertiserTransactionGet.endDate) &&
        Objects.equals(this.fundsType, filteringAdvertiserTransactionGet.fundsType) &&
        Objects.equals(this.keyword, filteringAdvertiserTransactionGet.keyword) &&
        Objects.equals(this.startDate, filteringAdvertiserTransactionGet.startDate) &&
        Objects.equals(this.summaryByAccount, filteringAdvertiserTransactionGet.summaryByAccount) &&
        Objects.equals(this.transferType, filteringAdvertiserTransactionGet.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, fundsType, keyword, startDate, summaryByAccount, transferType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringAdvertiserTransactionGet {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fundsType: ").append(toIndentedString(fundsType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    summaryByAccount: ").append(toIndentedString(summaryByAccount)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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
