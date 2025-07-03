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
 * FilteringBcAccountTransactionGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class FilteringBcAccountTransactionGet {
  @JsonProperty("account_ids")
  private List<String> accountIds = null;

  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("billing_types")
  private List<String> billingTypes = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("owner_of_account")
  private List<String> ownerOfAccount = null;

  @JsonProperty("start_time")
  private String startTime = null;

  @JsonProperty("transaction_types")
  private List<String> transactionTypes = null;

  public FilteringBcAccountTransactionGet accountIds(List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public FilteringBcAccountTransactionGet addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<String>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * List of account IDs.
   * @return accountIds
  **/
  @Schema(description = "List of account IDs.")
  public List<String> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }

  public FilteringBcAccountTransactionGet accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name.
   * @return accountName
  **/
  @Schema(description = "Account name.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public FilteringBcAccountTransactionGet billingTypes(List<String> billingTypes) {
    this.billingTypes = billingTypes;
    return this;
  }

  public FilteringBcAccountTransactionGet addBillingTypesItem(String billingTypesItem) {
    if (this.billingTypes == null) {
      this.billingTypes = new ArrayList<String>();
    }
    this.billingTypes.add(billingTypesItem);
    return this;
  }

   /**
   * Billing types.
   * @return billingTypes
  **/
  @Schema(description = "Billing types.")
  public List<String> getBillingTypes() {
    return billingTypes;
  }

  public void setBillingTypes(List<String> billingTypes) {
    this.billingTypes = billingTypes;
  }

  public FilteringBcAccountTransactionGet endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time for filtering transactions.
   * @return endTime
  **/
  @Schema(description = "End time for filtering transactions.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public FilteringBcAccountTransactionGet ownerOfAccount(List<String> ownerOfAccount) {
    this.ownerOfAccount = ownerOfAccount;
    return this;
  }

  public FilteringBcAccountTransactionGet addOwnerOfAccountItem(String ownerOfAccountItem) {
    if (this.ownerOfAccount == null) {
      this.ownerOfAccount = new ArrayList<String>();
    }
    this.ownerOfAccount.add(ownerOfAccountItem);
    return this;
  }

   /**
   * Owners of the account.
   * @return ownerOfAccount
  **/
  @Schema(description = "Owners of the account.")
  public List<String> getOwnerOfAccount() {
    return ownerOfAccount;
  }

  public void setOwnerOfAccount(List<String> ownerOfAccount) {
    this.ownerOfAccount = ownerOfAccount;
  }

  public FilteringBcAccountTransactionGet startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time for filtering transactions.
   * @return startTime
  **/
  @Schema(description = "Start time for filtering transactions.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public FilteringBcAccountTransactionGet transactionTypes(List<String> transactionTypes) {
    this.transactionTypes = transactionTypes;
    return this;
  }

  public FilteringBcAccountTransactionGet addTransactionTypesItem(String transactionTypesItem) {
    if (this.transactionTypes == null) {
      this.transactionTypes = new ArrayList<String>();
    }
    this.transactionTypes.add(transactionTypesItem);
    return this;
  }

   /**
   * Transaction types.
   * @return transactionTypes
  **/
  @Schema(description = "Transaction types.")
  public List<String> getTransactionTypes() {
    return transactionTypes;
  }

  public void setTransactionTypes(List<String> transactionTypes) {
    this.transactionTypes = transactionTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBcAccountTransactionGet filteringBcAccountTransactionGet = (FilteringBcAccountTransactionGet) o;
    return Objects.equals(this.accountIds, filteringBcAccountTransactionGet.accountIds) &&
        Objects.equals(this.accountName, filteringBcAccountTransactionGet.accountName) &&
        Objects.equals(this.billingTypes, filteringBcAccountTransactionGet.billingTypes) &&
        Objects.equals(this.endTime, filteringBcAccountTransactionGet.endTime) &&
        Objects.equals(this.ownerOfAccount, filteringBcAccountTransactionGet.ownerOfAccount) &&
        Objects.equals(this.startTime, filteringBcAccountTransactionGet.startTime) &&
        Objects.equals(this.transactionTypes, filteringBcAccountTransactionGet.transactionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, accountName, billingTypes, endTime, ownerOfAccount, startTime, transactionTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcAccountTransactionGet {\n");
    
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    billingTypes: ").append(toIndentedString(billingTypes)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    ownerOfAccount: ").append(toIndentedString(ownerOfAccount)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    transactionTypes: ").append(toIndentedString(transactionTypes)).append("\n");
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
