/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13creativeportfoliocreatePortfolioContent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PortfolioCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class PortfolioCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("creative_portfolio_type")
  private String creativePortfolioType = null;

  @JsonProperty("portfolio_content")
  private List<OpenApiv13creativeportfoliocreatePortfolioContent> portfolioContent = null;

  public PortfolioCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * The advertiser ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "The advertiser ID")
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
   * Type of the portfolio. Enum values: &#x60;CTA&#x60; (call-to-action text), &#x60;CARD&#x60; (card), &#x60;PREMIUM_BADGE&#x60; (badge pop-up)， &#x60;STICKER&#x60; (countdown sticker) ,&#x60;DOWNLOAD_CARD&#x60; (Download Card), &#x60;PRODUCT_CARD&#x60; (Product Card). The default value is &#x60;CTA&#x60;. See examples of Countdown Stickers Download Cards and in [Portfolios](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739361803446273), and see examples of Countdown Sticker and Download Card in [Countdown Sticker](https://ads.tiktok.com/help/article?aid&#x3D;10007423) and [Download Card](https://ads.tiktok.com/help/article?aid&#x3D;10007086).Note: You can only create one countdown sticker at a time.Countdown Sticker is an allowlist-only feature for auction ads with the advertising objective (&#x60;objective_type&#x60;) as App Installs (&#x60;APP_INSTALL&#x60;), App Promotion (&#x60;APP_PROMOTION&#x60;), Traffic (&#x60;TRAFFIC&#x60;), or Conversion (&#x60;CONVERSIONS&#x60;). If you would like to access it for auction ads with these objectives , please contact your TikTok representative.Download Card is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Product Cards can only be used in Video Shopping Ads.
   * @return creativePortfolioType
  **/
  @Schema(description = "Type of the portfolio. Enum values: `CTA` (call-to-action text), `CARD` (card), `PREMIUM_BADGE` (badge pop-up)， `STICKER` (countdown sticker) ,`DOWNLOAD_CARD` (Download Card), `PRODUCT_CARD` (Product Card). The default value is `CTA`. See examples of Countdown Stickers Download Cards and in [Portfolios](https://ads.tiktok.com/marketing_api/docs?id=1739361803446273), and see examples of Countdown Sticker and Download Card in [Countdown Sticker](https://ads.tiktok.com/help/article?aid=10007423) and [Download Card](https://ads.tiktok.com/help/article?aid=10007086).Note: You can only create one countdown sticker at a time.Countdown Sticker is an allowlist-only feature for auction ads with the advertising objective (`objective_type`) as App Installs (`APP_INSTALL`), App Promotion (`APP_PROMOTION`), Traffic (`TRAFFIC`), or Conversion (`CONVERSIONS`). If you would like to access it for auction ads with these objectives , please contact your TikTok representative.Download Card is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Product Cards can only be used in Video Shopping Ads.")
  public String getCreativePortfolioType() {
    return creativePortfolioType;
  }

  public void setCreativePortfolioType(String creativePortfolioType) {
    this.creativePortfolioType = creativePortfolioType;
  }

  public PortfolioCreateBody portfolioContent(List<OpenApiv13creativeportfoliocreatePortfolioContent> portfolioContent) {
    this.portfolioContent = portfolioContent;
    return this;
  }

  public PortfolioCreateBody addPortfolioContentItem(OpenApiv13creativeportfoliocreatePortfolioContent portfolioContentItem) {
    if (this.portfolioContent == null) {
      this.portfolioContent = new ArrayList<OpenApiv13creativeportfoliocreatePortfolioContent>();
    }
    this.portfolioContent.add(portfolioContentItem);
    return this;
  }

   /**
   * The content of the portfolio
   * @return portfolioContent
  **/
  @Schema(description = "The content of the portfolio")
  public List<OpenApiv13creativeportfoliocreatePortfolioContent> getPortfolioContent() {
    return portfolioContent;
  }

  public void setPortfolioContent(List<OpenApiv13creativeportfoliocreatePortfolioContent> portfolioContent) {
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
