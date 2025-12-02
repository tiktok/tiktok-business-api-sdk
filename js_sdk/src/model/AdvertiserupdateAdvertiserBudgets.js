/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdvertiserupdateAdvertiserBudgets model module.
 * @module model/AdvertiserupdateAdvertiserBudgets
 * @version 0.1.9
 */
export class AdvertiserupdateAdvertiserBudgets {
  /**
   * Constructs a new <code>AdvertiserupdateAdvertiserBudgets</code>.
   * @alias module:model/AdvertiserupdateAdvertiserBudgets
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdvertiserupdateAdvertiserBudgets</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdvertiserupdateAdvertiserBudgets} obj Optional instance to populate.
   * @return {module:model/AdvertiserupdateAdvertiserBudgets} The populated <code>AdvertiserupdateAdvertiserBudgets</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdvertiserupdateAdvertiserBudgets();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'Number');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('budget_mode'))
        obj.budget_mode = ApiClient.convertToType(data['budget_mode'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} advertiser_id
 */
AdvertiserupdateAdvertiserBudgets.prototype.advertiser_id = undefined;

/**
 * @member {Number} budget
 */
AdvertiserupdateAdvertiserBudgets.prototype.budget = undefined;

/**
 * @member {String} budget_mode
 */
AdvertiserupdateAdvertiserBudgets.prototype.budget_mode = undefined;

