/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringCreativePortfolioList model module.
 * @module model/FilteringCreativePortfolioList
 * @version 0.1.9
 */
export class FilteringCreativePortfolioList {
  /**
   * Constructs a new <code>FilteringCreativePortfolioList</code>.
   * @alias module:model/FilteringCreativePortfolioList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringCreativePortfolioList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringCreativePortfolioList} obj Optional instance to populate.
   * @return {module:model/FilteringCreativePortfolioList} The populated <code>FilteringCreativePortfolioList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringCreativePortfolioList();
      if (data.hasOwnProperty('creative_portfolio_ids'))
        obj.creative_portfolio_ids = ApiClient.convertToType(data['creative_portfolio_ids'], ['String']);
      if (data.hasOwnProperty('creative_portfolio_types'))
        obj.creative_portfolio_types = ApiClient.convertToType(data['creative_portfolio_types'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} creative_portfolio_ids
 */
FilteringCreativePortfolioList.prototype.creative_portfolio_ids = undefined;

/**
 * @member {Array.<String>} creative_portfolio_types
 */
FilteringCreativePortfolioList.prototype.creative_portfolio_types = undefined;

