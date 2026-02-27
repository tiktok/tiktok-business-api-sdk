/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerRuleCreateBodyFrequencyInfo} from './OptimizerRuleCreateBodyFrequencyInfo.js';
import {OptimizerRuleCreateBodyValue} from './OptimizerRuleCreateBodyValue.js';

/**
 * The OptimizerRuleCreateBodyActions model module.
 * @module model/OptimizerRuleCreateBodyActions
 * @version 1.2.1
 */
export class OptimizerRuleCreateBodyActions {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyActions</code>.
   * @alias module:model/OptimizerRuleCreateBodyActions
   * @class
   * @param subject_type {String} 
   */
  constructor(subject_type) {
    this.subject_type = subject_type;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyActions} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyActions} The populated <code>OptimizerRuleCreateBodyActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyActions();
      if (data.hasOwnProperty('action_type'))
        obj.action_type = ApiClient.convertToType(data['action_type'], 'String');
      if (data.hasOwnProperty('frequency_info'))
        obj.frequency_info = OptimizerRuleCreateBodyFrequencyInfo.constructFromObject(data['frequency_info']);
      if (data.hasOwnProperty('subject_type'))
        obj.subject_type = ApiClient.convertToType(data['subject_type'], 'String');
      if (data.hasOwnProperty('value'))
        obj.value = OptimizerRuleCreateBodyValue.constructFromObject(data['value']);
      if (data.hasOwnProperty('value_type'))
        obj.value_type = ApiClient.convertToType(data['value_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} action_type
 */
OptimizerRuleCreateBodyActions.prototype.action_type = undefined;

/**
 * @member {module:model/OptimizerRuleCreateBodyFrequencyInfo} frequency_info
 */
OptimizerRuleCreateBodyActions.prototype.frequency_info = undefined;

/**
 * @member {String} subject_type
 */
OptimizerRuleCreateBodyActions.prototype.subject_type = undefined;

/**
 * @member {module:model/OptimizerRuleCreateBodyValue} value
 */
OptimizerRuleCreateBodyActions.prototype.value = undefined;

/**
 * @member {String} value_type
 */
OptimizerRuleCreateBodyActions.prototype.value_type = undefined;

