/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo model module.
 * @module model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo
 * @version 1.2.1
 */
export class OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo</code>.
   * @alias module:model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo
   * @class
   * @param date_type {String} 
   * @param end_time {String} 
   * @param num {Array.<Number>} 
   * @param start_time {String} 
   */
  constructor(date_type, end_time, num, start_time) {
    this.date_type = date_type;
    this.end_time = end_time;
    this.num = num;
    this.start_time = start_time;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo} The populated <code>OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo();
      if (data.hasOwnProperty('date_type'))
        obj.date_type = ApiClient.convertToType(data['date_type'], 'String');
      if (data.hasOwnProperty('end_time'))
        obj.end_time = ApiClient.convertToType(data['end_time'], 'String');
      if (data.hasOwnProperty('num'))
        obj.num = ApiClient.convertToType(data['num'], ['Number']);
      if (data.hasOwnProperty('start_time'))
        obj.start_time = ApiClient.convertToType(data['start_time'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} date_type
 */
OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.prototype.date_type = undefined;

/**
 * @member {String} end_time
 */
OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.prototype.end_time = undefined;

/**
 * @member {Array.<Number>} num
 */
OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.prototype.num = undefined;

/**
 * @member {String} start_time
 */
OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.prototype.start_time = undefined;

