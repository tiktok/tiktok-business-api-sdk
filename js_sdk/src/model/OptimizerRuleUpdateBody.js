/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerRuleUpdateBodyRules} from './OptimizerRuleUpdateBodyRules.js';

/**
 * The OptimizerRuleUpdateBody model module.
 * @module model/OptimizerRuleUpdateBody
 * @version 0.1.8
 */
export class OptimizerRuleUpdateBody {
  /**
   * Constructs a new <code>OptimizerRuleUpdateBody</code>.
   * @alias module:model/OptimizerRuleUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param rules {Array.<module:model/OptimizerRuleUpdateBodyRules>} 
   */
  constructor(advertiser_id, rules) {
    this.advertiser_id = advertiser_id;
    this.rules = rules;
  }

  /**
   * Constructs a <code>OptimizerRuleUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleUpdateBody} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleUpdateBody} The populated <code>OptimizerRuleUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('lang'))
        obj.lang = ApiClient.convertToType(data['lang'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [OptimizerRuleUpdateBodyRules]);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
OptimizerRuleUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} lang
 * @default 'EN'
 */
OptimizerRuleUpdateBody.prototype.lang = 'EN';

/**
 * @member {Array.<module:model/OptimizerRuleUpdateBodyRules>} rules
 */
OptimizerRuleUpdateBody.prototype.rules = undefined;

