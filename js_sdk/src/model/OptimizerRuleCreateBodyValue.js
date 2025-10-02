/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerRuleCreateBodyValue model module.
 * @module model/OptimizerRuleCreateBodyValue
 * @version 0.1.8
 */
export class OptimizerRuleCreateBodyValue {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyValue</code>.
   * @alias module:model/OptimizerRuleCreateBodyValue
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyValue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyValue} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyValue} The populated <code>OptimizerRuleCreateBodyValue</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyValue();
      if (data.hasOwnProperty('limit'))
        obj.limit = ApiClient.convertToType(data['limit'], 'Number');
      if (data.hasOwnProperty('use_limit'))
        obj.use_limit = ApiClient.convertToType(data['use_limit'], 'Boolean');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} limit
 */
OptimizerRuleCreateBodyValue.prototype.limit = undefined;

/**
 * @member {Boolean} use_limit
 */
OptimizerRuleCreateBodyValue.prototype.use_limit = undefined;

/**
 * @member {Number} value
 */
OptimizerRuleCreateBodyValue.prototype.value = undefined;

