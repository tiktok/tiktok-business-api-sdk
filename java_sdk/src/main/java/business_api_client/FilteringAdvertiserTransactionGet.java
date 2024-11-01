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

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
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
  private Boolean summaryByAccount = null;

  @JsonProperty("transfer_type")
  private String transferType = null;

  public FilteringAdvertiserTransactionGet endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Transaction record search end time, (UTC+0) format：&#x60;2020-11-12&#x60;. The default date is the same day
   * @return endDate
  **/
  @Schema(description = "Transaction record search end time, (UTC+0) format：`2020-11-12`. The default date is the same day")
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
   * Fund type. Allowed types- &#x60;FUNDS_TYPE_CASH&#x60;(cash), &#x60;FUNDS_TYPE_GRANT&#x60;(coupon/voucher). The default is to select both types.
   * @return fundsType
  **/
  @Schema(description = "Fund type. Allowed types- `FUNDS_TYPE_CASH`(cash), `FUNDS_TYPE_GRANT`(coupon/voucher). The default is to select both types.")
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
   * Search keywords, you can search for ad account name or ad account ID.
   * @return keyword
  **/
  @Schema(description = "Search keywords, you can search for ad account name or ad account ID.")
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
   * Transaction record search start time, (UTC+0) format：&#x60;2020-10-12&#x60;. The default date is 90 days ago
   * @return startDate
  **/
  @Schema(description = "Transaction record search start time, (UTC+0) format：`2020-10-12`. The default date is 90 days ago")
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
   * Whether to summarize by account. &#x60;false&#x60; means no summary; &#x60;true&#x60; means summary. Default value- &#x60;false&#x60;.
   * @return summaryByAccount
  **/
  @Schema(description = "Whether to summarize by account. `false` means no summary; `true` means summary. Default value- `false`.")
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
   * Billing type. Enum values- &#x60;TRANS_TYPE_TRANSFER&#x60;(transfer), &#x60;TRANS_TYPE_TAX&#x60;(tax), &#x60;TRANS_TYPE_COST&#x60;(consumption), &#x60;TRANS_TYPE_PAYMENT&#x60; (payment). Default value-  &#x60;TRANS_TYPE_TRANSFER&#x60;
   * @return transferType
  **/
  @Schema(description = "Billing type. Enum values- `TRANS_TYPE_TRANSFER`(transfer), `TRANS_TYPE_TAX`(tax), `TRANS_TYPE_COST`(consumption), `TRANS_TYPE_PAYMENT` (payment). Default value-  `TRANS_TYPE_TRANSFER`")
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
