/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringOptimizerRuleList model module.
 * @module model/FilteringOptimizerRuleList
 * @version 0.1.9
 */
export class FilteringOptimizerRuleList {
  /**
   * Constructs a new <code>FilteringOptimizerRuleList</code>.
   * @alias module:model/FilteringOptimizerRuleList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringOptimizerRuleList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringOptimizerRuleList} obj Optional instance to populate.
   * @return {module:model/FilteringOptimizerRuleList} The populated <code>FilteringOptimizerRuleList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringOptimizerRuleList();
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
FilteringOptimizerRuleList.prototype.action = undefined;

/**
 * @member {String} data_dimension
 */
FilteringOptimizerRuleList.prototype.data_dimension = undefined;

/**
 * @member {Array.<String>} rule_info
 */
FilteringOptimizerRuleList.prototype.rule_info = undefined;

/**
 * @member {String} status
 */
FilteringOptimizerRuleList.prototype.status = undefined;

/**
 * @member {Array.<String>} time
 */
FilteringOptimizerRuleList.prototype.time = undefined;

