/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerrulebatchBindBindInfo model module.
 * @module model/OptimizerrulebatchBindBindInfo
 * @version 0.1.7
 */
export class OptimizerrulebatchBindBindInfo {
  /**
   * Constructs a new <code>OptimizerrulebatchBindBindInfo</code>.
   * @alias module:model/OptimizerrulebatchBindBindInfo
   * @class
   * @param bind_type {String} 
   * @param dimension {String} 
   * @param dimension_ids {Array.<String>} 
   * @param rule_id {String} 
   */
  constructor(bind_type, dimension, dimension_ids, rule_id) {
    this.bind_type = bind_type;
    this.dimension = dimension;
    this.dimension_ids = dimension_ids;
    this.rule_id = rule_id;
  }

  /**
   * Constructs a <code>OptimizerrulebatchBindBindInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerrulebatchBindBindInfo} obj Optional instance to populate.
   * @return {module:model/OptimizerrulebatchBindBindInfo} The populated <code>OptimizerrulebatchBindBindInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerrulebatchBindBindInfo();
      if (data.hasOwnProperty('bind_type'))
        obj.bind_type = ApiClient.convertToType(data['bind_type'], 'String');
      if (data.hasOwnProperty('dimension'))
        obj.dimension = ApiClient.convertToType(data['dimension'], 'String');
      if (data.hasOwnProperty('dimension_ids'))
        obj.dimension_ids = ApiClient.convertToType(data['dimension_ids'], ['String']);
      if (data.hasOwnProperty('rule_id'))
        obj.rule_id = ApiClient.convertToType(data['rule_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bind_type
 */
OptimizerrulebatchBindBindInfo.prototype.bind_type = undefined;

/**
 * @member {String} dimension
 */
OptimizerrulebatchBindBindInfo.prototype.dimension = undefined;

/**
 * @member {Array.<String>} dimension_ids
 */
OptimizerrulebatchBindBindInfo.prototype.dimension_ids = undefined;

/**
 * @member {String} rule_id
 */
OptimizerrulebatchBindBindInfo.prototype.rule_id = undefined;

