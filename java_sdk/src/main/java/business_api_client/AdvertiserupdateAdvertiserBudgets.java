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
 * AdvertiserupdateAdvertiserBudgets
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AdvertiserupdateAdvertiserBudgets {
  @JsonProperty("advertiser_id")
  private Long advertiserId = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  public AdvertiserupdateAdvertiserBudgets advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(description = "")
  public Long getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdvertiserupdateAdvertiserBudgets budget(Double budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(description = "")
  public Double getBudget() {
    return budget;
  }

  public void setBudget(Double budget) {
    this.budget = budget;
  }

  public AdvertiserupdateAdvertiserBudgets budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @Schema(description = "")
  public String getBudgetMode() {
    return budgetMode;
  }

  public void setBudgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserupdateAdvertiserBudgets advertiserupdateAdvertiserBudgets = (AdvertiserupdateAdvertiserBudgets) o;
    return Objects.equals(this.advertiserId, advertiserupdateAdvertiserBudgets.advertiserId) &&
        Objects.equals(this.budget, advertiserupdateAdvertiserBudgets.budget) &&
        Objects.equals(this.budgetMode, advertiserupdateAdvertiserBudgets.budgetMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, budgetMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserupdateAdvertiserBudgets {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
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
