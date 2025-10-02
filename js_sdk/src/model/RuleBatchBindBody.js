/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerrulebatchBindBindInfo} from './OptimizerrulebatchBindBindInfo.js';

/**
 * The RuleBatchBindBody model module.
 * @module model/RuleBatchBindBody
 * @version 0.1.8
 */
export class RuleBatchBindBody {
  /**
   * Constructs a new <code>RuleBatchBindBody</code>.
   * @alias module:model/RuleBatchBindBody
   * @class
   * @param advertiser_id {String} 
   * @param bind_info {Array.<module:model/OptimizerrulebatchBindBindInfo>} 
   */
  constructor(advertiser_id, bind_info) {
    this.advertiser_id = advertiser_id;
    this.bind_info = bind_info;
  }

  /**
   * Constructs a <code>RuleBatchBindBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RuleBatchBindBody} obj Optional instance to populate.
   * @return {module:model/RuleBatchBindBody} The populated <code>RuleBatchBindBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new RuleBatchBindBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('bind_info'))
        obj.bind_info = ApiClient.convertToType(data['bind_info'], [OptimizerrulebatchBindBindInfo]);
      if (data.hasOwnProperty('lang'))
        obj.lang = ApiClient.convertToType(data['lang'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
RuleBatchBindBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<module:model/OptimizerrulebatchBindBindInfo>} bind_info
 */
RuleBatchBindBody.prototype.bind_info = undefined;

/**
 * @member {String} lang
 * @default 'EN'
 */
RuleBatchBindBody.prototype.lang = 'EN';

