/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo} from './OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.js';

/**
 * The OptimizerRuleCreateBodyRuleExecInfo model module.
 * @module model/OptimizerRuleCreateBodyRuleExecInfo
 * @version 0.1.7
 */
export class OptimizerRuleCreateBodyRuleExecInfo {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyRuleExecInfo</code>.
   * @alias module:model/OptimizerRuleCreateBodyRuleExecInfo
   * @class
   * @param exec_time_type {String} 
   */
  constructor(exec_time_type) {
    this.exec_time_type = exec_time_type;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyRuleExecInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyRuleExecInfo} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyRuleExecInfo} The populated <code>OptimizerRuleCreateBodyRuleExecInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyRuleExecInfo();
      if (data.hasOwnProperty('exec_time'))
        obj.exec_time = ApiClient.convertToType(data['exec_time'], 'String');
      if (data.hasOwnProperty('exec_time_type'))
        obj.exec_time_type = ApiClient.convertToType(data['exec_time_type'], 'String');
      if (data.hasOwnProperty('time_period_info'))
        obj.time_period_info = ApiClient.convertToType(data['time_period_info'], [OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo]);
    }
    return obj;
  }
}

/**
 * @member {String} exec_time
 */
OptimizerRuleCreateBodyRuleExecInfo.prototype.exec_time = undefined;

/**
 * @member {String} exec_time_type
 */
OptimizerRuleCreateBodyRuleExecInfo.prototype.exec_time_type = undefined;

/**
 * @member {Array.<module:model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo>} time_period_info
 */
OptimizerRuleCreateBodyRuleExecInfo.prototype.time_period_info = undefined;

