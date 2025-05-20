/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CreativeportfoliocreatePortfolioContent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PortfolioCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class PortfolioCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("creative_portfolio_type")
  private String creativePortfolioType = "CTA";

  @JsonProperty("portfolio_content")
  private List<CreativeportfoliocreatePortfolioContent> portfolioContent = new ArrayList<CreativeportfoliocreatePortfolioContent>();

  public PortfolioCreateBody advertiserId(String advertiserId) {
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

  public PortfolioCreateBody creativePortfolioType(String creativePortfolioType) {
    this.creativePortfolioType = creativePortfolioType;
    return this;
  }

   /**
   * Get creativePortfolioType
   * @return creativePortfolioType
  **/
  @Schema(description = "")
  public String getCreativePortfolioType() {
    return creativePortfolioType;
  }

  public void setCreativePortfolioType(String creativePortfolioType) {
    this.creativePortfolioType = creativePortfolioType;
  }

  public PortfolioCreateBody portfolioContent(List<CreativeportfoliocreatePortfolioContent> portfolioContent) {
    this.portfolioContent = portfolioContent;
    return this;
  }

  public PortfolioCreateBody addPortfolioContentItem(CreativeportfoliocreatePortfolioContent portfolioContentItem) {
    this.portfolioContent.add(portfolioContentItem);
    return this;
  }

   /**
   * Get portfolioContent
   * @return portfolioContent
  **/
  @Schema(required = true, description = "")
  public List<CreativeportfoliocreatePortfolioContent> getPortfolioContent() {
    return portfolioContent;
  }

  public void setPortfolioContent(List<CreativeportfoliocreatePortfolioContent> portfolioContent) {
    this.portfolioContent = portfolioContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioCreateBody portfolioCreateBody = (PortfolioCreateBody) o;
    return Objects.equals(this.advertiserId, portfolioCreateBody.advertiserId) &&
        Objects.equals(this.creativePortfolioType, portfolioCreateBody.creativePortfolioType) &&
        Objects.equals(this.portfolioContent, portfolioCreateBody.portfolioContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, creativePortfolioType, portfolioContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creativePortfolioType: ").append(toIndentedString(creativePortfolioType)).append("\n");
    sb.append("    portfolioContent: ").append(toIndentedString(portfolioContent)).append("\n");
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
