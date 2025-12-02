/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerRuleCreateBodyApplyObjects model module.
 * @module model/OptimizerRuleCreateBodyApplyObjects
 * @version 0.1.9
 */
export class OptimizerRuleCreateBodyApplyObjects {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyApplyObjects</code>.
   * @alias module:model/OptimizerRuleCreateBodyApplyObjects
   * @class
   * @param dimension {String} 
   * @param pre_condition_type {String} 
   */
  constructor(dimension, pre_condition_type) {
    this.dimension = dimension;
    this.pre_condition_type = pre_condition_type;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyApplyObjects</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyApplyObjects} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyApplyObjects} The populated <code>OptimizerRuleCreateBodyApplyObjects</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyApplyObjects();
      if (data.hasOwnProperty('bind_type'))
        obj.bind_type = ApiClient.convertToType(data['bind_type'], 'String');
      if (data.hasOwnProperty('dimension'))
        obj.dimension = ApiClient.convertToType(data['dimension'], 'String');
      if (data.hasOwnProperty('dimension_ids'))
        obj.dimension_ids = ApiClient.convertToType(data['dimension_ids'], ['String']);
      if (data.hasOwnProperty('pre_condition_type'))
        obj.pre_condition_type = ApiClient.convertToType(data['pre_condition_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bind_type
 */
OptimizerRuleCreateBodyApplyObjects.prototype.bind_type = undefined;

/**
 * @member {String} dimension
 */
OptimizerRuleCreateBodyApplyObjects.prototype.dimension = undefined;

/**
 * @member {Array.<String>} dimension_ids
 */
OptimizerRuleCreateBodyApplyObjects.prototype.dimension_ids = undefined;

/**
 * @member {String} pre_condition_type
 */
OptimizerRuleCreateBodyApplyObjects.prototype.pre_condition_type = undefined;

