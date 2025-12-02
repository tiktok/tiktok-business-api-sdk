/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerRuleCreateBodyConditions model module.
 * @module model/OptimizerRuleCreateBodyConditions
 * @version 0.1.9
 */
export class OptimizerRuleCreateBodyConditions {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyConditions</code>.
   * @alias module:model/OptimizerRuleCreateBodyConditions
   * @class
   * @param subject_type {String} 
   */
  constructor(subject_type) {
    this.subject_type = subject_type;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyConditions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyConditions} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyConditions} The populated <code>OptimizerRuleCreateBodyConditions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyConditions();
      if (data.hasOwnProperty('calculation_type'))
        obj.calculation_type = ApiClient.convertToType(data['calculation_type'], 'String');
      if (data.hasOwnProperty('match_type'))
        obj.match_type = ApiClient.convertToType(data['match_type'], 'String');
      if (data.hasOwnProperty('range_type'))
        obj.range_type = ApiClient.convertToType(data['range_type'], 'String');
      if (data.hasOwnProperty('subject_type'))
        obj.subject_type = ApiClient.convertToType(data['subject_type'], 'String');
      if (data.hasOwnProperty('values'))
        obj.values = ApiClient.convertToType(data['values'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} calculation_type
 */
OptimizerRuleCreateBodyConditions.prototype.calculation_type = undefined;

/**
 * @member {String} match_type
 */
OptimizerRuleCreateBodyConditions.prototype.match_type = undefined;

/**
 * @member {String} range_type
 */
OptimizerRuleCreateBodyConditions.prototype.range_type = undefined;

/**
 * @member {String} subject_type
 */
OptimizerRuleCreateBodyConditions.prototype.subject_type = undefined;

/**
 * @member {Array.<String>} values
 */
OptimizerRuleCreateBodyConditions.prototype.values = undefined;

