/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';
import {OpenApiv13creativeportfoliocreatePortfolioContent} from './OpenApiv13creativeportfoliocreatePortfolioContent';

/**
 * The PortfolioCreateBody model module.
 * @module model/PortfolioCreateBody
 * @version 0.1.1
 */
export class PortfolioCreateBody {
  /**
   * Constructs a new <code>PortfolioCreateBody</code>.
   * @alias module:model/PortfolioCreateBody
   * @class
   * @param advertiser_id {String} The advertiser ID
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>PortfolioCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioCreateBody} obj Optional instance to populate.
   * @return {module:model/PortfolioCreateBody} The populated <code>PortfolioCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PortfolioCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('creative_portfolio_type'))
        obj.creative_portfolio_type = ApiClient.convertToType(data['creative_portfolio_type'], 'String');
      if (data.hasOwnProperty('portfolio_content'))
        obj.portfolio_content = ApiClient.convertToType(data['portfolio_content'], [OpenApiv13creativeportfoliocreatePortfolioContent]);
    }
    return obj;
  }
}

/**
 * The advertiser ID
 * @member {String} advertiser_id
 */
PortfolioCreateBody.prototype.advertiser_id = undefined;

/**
 * Type of the portfolio. Enum values: `CTA` (call-to-action text), `CARD` (card), `PREMIUM_BADGE` (badge pop-up)， `STICKER` (countdown sticker) ,`DOWNLOAD_CARD` (Download Card), `PRODUCT_CARD` (Product Card). The default value is `CTA`. See examples of Countdown Stickers Download Cards and in [Portfolios](https://ads.tiktok.com/marketing_api/docs?id=1739361803446273), and see examples of Countdown Sticker and Download Card in [Countdown Sticker](https://ads.tiktok.com/help/article?aid=10007423) and [Download Card](https://ads.tiktok.com/help/article?aid=10007086).Note: You can only create one countdown sticker at a time.Countdown Sticker is an allowlist-only feature for auction ads with the advertising objective (`objective_type`) as App Installs (`APP_INSTALL`), App Promotion (`APP_PROMOTION`), Traffic (`TRAFFIC`), or Conversion (`CONVERSIONS`). If you would like to access it for auction ads with these objectives , please contact your TikTok representative.Download Card is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Product Cards can only be used in Video Shopping Ads.
 * @member {String} creative_portfolio_type
 */
PortfolioCreateBody.prototype.creative_portfolio_type = undefined;

/**
 * The content of the portfolio
 * @member {Array.<module:model/OpenApiv13creativeportfoliocreatePortfolioContent>} portfolio_content
 */
PortfolioCreateBody.prototype.portfolio_content = undefined;

