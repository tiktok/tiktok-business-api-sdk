/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerRuleCreateBodyRules} from './OptimizerRuleCreateBodyRules.js';

/**
 * The OptimizerRuleCreateBody model module.
 * @module model/OptimizerRuleCreateBody
 * @version 0.1.7
 */
export class OptimizerRuleCreateBody {
  /**
   * Constructs a new <code>OptimizerRuleCreateBody</code>.
   * @alias module:model/OptimizerRuleCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param rules {Array.<module:model/OptimizerRuleCreateBodyRules>} 
   */
  constructor(advertiser_id, rules) {
    this.advertiser_id = advertiser_id;
    this.rules = rules;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBody} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBody} The populated <code>OptimizerRuleCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('lang'))
        obj.lang = ApiClient.convertToType(data['lang'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [OptimizerRuleCreateBodyRules]);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
OptimizerRuleCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} lang
 * @default 'EN'
 */
OptimizerRuleCreateBody.prototype.lang = 'EN';

/**
 * @member {Array.<module:model/OptimizerRuleCreateBodyRules>} rules
 */
OptimizerRuleCreateBody.prototype.rules = undefined;

