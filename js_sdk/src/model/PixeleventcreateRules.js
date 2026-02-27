/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixeleventcreateRules model module.
 * @module model/PixeleventcreateRules
 * @version 1.2.1
 */
export class PixeleventcreateRules {
  /**
   * Constructs a new <code>PixeleventcreateRules</code>.
   * @alias module:model/PixeleventcreateRules
   * @class
   * @param operator {String} 
   * @param trigger {String} 
   * @param value {String} 
   * @param variable {String} 
   */
  constructor(operator, trigger, value, variable) {
    this.operator = operator;
    this.trigger = trigger;
    this.value = value;
    this.variable = variable;
  }

  /**
   * Constructs a <code>PixeleventcreateRules</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixeleventcreateRules} obj Optional instance to populate.
   * @return {module:model/PixeleventcreateRules} The populated <code>PixeleventcreateRules</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixeleventcreateRules();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('trigger'))
        obj.trigger = ApiClient.convertToType(data['trigger'], 'String');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'String');
      if (data.hasOwnProperty('variable'))
        obj.variable = ApiClient.convertToType(data['variable'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} operator
 */
PixeleventcreateRules.prototype.operator = undefined;

/**
 * @member {String} trigger
 */
PixeleventcreateRules.prototype.trigger = undefined;

/**
 * @member {String} value
 */
PixeleventcreateRules.prototype.value = undefined;

/**
 * @member {String} variable
 */
PixeleventcreateRules.prototype.variable = undefined;

