/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CreativeportfoliocreatePortfolioContent} from './CreativeportfoliocreatePortfolioContent.js';

/**
 * The PortfolioCreateBody model module.
 * @module model/PortfolioCreateBody
 * @version 1.2.1
 */
export class PortfolioCreateBody {
  /**
   * Constructs a new <code>PortfolioCreateBody</code>.
   * @alias module:model/PortfolioCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param portfolio_content {Array.<module:model/CreativeportfoliocreatePortfolioContent>} 
   */
  constructor(advertiser_id, portfolio_content) {
    this.advertiser_id = advertiser_id;
    this.portfolio_content = portfolio_content;
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
        obj.portfolio_content = ApiClient.convertToType(data['portfolio_content'], [CreativeportfoliocreatePortfolioContent]);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
PortfolioCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} creative_portfolio_type
 * @default 'CTA'
 */
PortfolioCreateBody.prototype.creative_portfolio_type = 'CTA';

/**
 * @member {Array.<module:model/CreativeportfoliocreatePortfolioContent>} portfolio_content
 */
PortfolioCreateBody.prototype.portfolio_content = undefined;

