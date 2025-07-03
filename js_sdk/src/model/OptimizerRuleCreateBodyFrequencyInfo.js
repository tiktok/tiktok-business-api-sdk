/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerRuleCreateBodyFrequencyInfo model module.
 * @module model/OptimizerRuleCreateBodyFrequencyInfo
 * @version 0.1.7
 */
export class OptimizerRuleCreateBodyFrequencyInfo {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyFrequencyInfo</code>.
   * @alias module:model/OptimizerRuleCreateBodyFrequencyInfo
   * @class
   * @param type {String} 
   */
  constructor(type) {
    this.type = type;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyFrequencyInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyFrequencyInfo} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyFrequencyInfo} The populated <code>OptimizerRuleCreateBodyFrequencyInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyFrequencyInfo();
      if (data.hasOwnProperty('count'))
        obj.count = ApiClient.convertToType(data['count'], 'Number');
      if (data.hasOwnProperty('custom_frequency_type'))
        obj.custom_frequency_type = ApiClient.convertToType(data['custom_frequency_type'], 'String');
      if (data.hasOwnProperty('time'))
        obj.time = ApiClient.convertToType(data['time'], 'Number');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} count
 */
OptimizerRuleCreateBodyFrequencyInfo.prototype.count = undefined;

/**
 * @member {String} custom_frequency_type
 */
OptimizerRuleCreateBodyFrequencyInfo.prototype.custom_frequency_type = undefined;

/**
 * @member {Number} time
 */
OptimizerRuleCreateBodyFrequencyInfo.prototype.time = undefined;

/**
 * @member {String} type
 */
OptimizerRuleCreateBodyFrequencyInfo.prototype.type = undefined;

