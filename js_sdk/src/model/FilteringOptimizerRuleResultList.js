/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringOptimizerRuleResultList model module.
 * @module model/FilteringOptimizerRuleResultList
 * @version 1.2.1
 */
export class FilteringOptimizerRuleResultList {
  /**
   * Constructs a new <code>FilteringOptimizerRuleResultList</code>.
   * @alias module:model/FilteringOptimizerRuleResultList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringOptimizerRuleResultList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringOptimizerRuleResultList} obj Optional instance to populate.
   * @return {module:model/FilteringOptimizerRuleResultList} The populated <code>FilteringOptimizerRuleResultList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringOptimizerRuleResultList();
      if (data.hasOwnProperty('action'))
        obj.action = ApiClient.convertToType(data['action'], 'String');
      if (data.hasOwnProperty('data_dimension'))
        obj.data_dimension = ApiClient.convertToType(data['data_dimension'], 'String');
      if (data.hasOwnProperty('rule_info'))
        obj.rule_info = ApiClient.convertToType(data['rule_info'], ['String']);
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'String');
      if (data.hasOwnProperty('time'))
        obj.time = ApiClient.convertToType(data['time'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} action
 */
FilteringOptimizerRuleResultList.prototype.action = undefined;

/**
 * @member {String} data_dimension
 */
FilteringOptimizerRuleResultList.prototype.data_dimension = undefined;

/**
 * @member {Array.<String>} rule_info
 */
FilteringOptimizerRuleResultList.prototype.rule_info = undefined;

/**
 * @member {String} status
 */
FilteringOptimizerRuleResultList.prototype.status = undefined;

/**
 * @member {Array.<String>} time
 */
FilteringOptimizerRuleResultList.prototype.time = undefined;

