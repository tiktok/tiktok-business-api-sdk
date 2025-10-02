/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerRuleCreateBodyActions} from './OptimizerRuleCreateBodyActions.js';
import {OptimizerRuleCreateBodyApplyObjects} from './OptimizerRuleCreateBodyApplyObjects.js';
import {OptimizerRuleCreateBodyConditions} from './OptimizerRuleCreateBodyConditions.js';
import {OptimizerRuleCreateBodyNotification} from './OptimizerRuleCreateBodyNotification.js';
import {OptimizerRuleCreateBodyRuleExecInfo} from './OptimizerRuleCreateBodyRuleExecInfo.js';

/**
 * The OptimizerRuleCreateBodyRules model module.
 * @module model/OptimizerRuleCreateBodyRules
 * @version 0.1.8
 */
export class OptimizerRuleCreateBodyRules {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyRules</code>.
   * @alias module:model/OptimizerRuleCreateBodyRules
   * @class
   * @param actions {Array.<module:model/OptimizerRuleCreateBodyActions>} 
   * @param apply_objects {Array.<module:model/OptimizerRuleCreateBodyApplyObjects>} 
   * @param conditions {Array.<module:model/OptimizerRuleCreateBodyConditions>} 
   * @param name {String} 
   * @param notification {module:model/OptimizerRuleCreateBodyNotification} 
   * @param rule_exec_info {module:model/OptimizerRuleCreateBodyRuleExecInfo} 
   */
  constructor(actions, apply_objects, conditions, name, notification, rule_exec_info) {
    this.actions = actions;
    this.apply_objects = apply_objects;
    this.conditions = conditions;
    this.name = name;
    this.notification = notification;
    this.rule_exec_info = rule_exec_info;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyRules</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyRules} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyRules} The populated <code>OptimizerRuleCreateBodyRules</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyRules();
      if (data.hasOwnProperty('actions'))
        obj.actions = ApiClient.convertToType(data['actions'], [OptimizerRuleCreateBodyActions]);
      if (data.hasOwnProperty('apply_objects'))
        obj.apply_objects = ApiClient.convertToType(data['apply_objects'], [OptimizerRuleCreateBodyApplyObjects]);
      if (data.hasOwnProperty('conditions'))
        obj.conditions = ApiClient.convertToType(data['conditions'], [OptimizerRuleCreateBodyConditions]);
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('notification'))
        obj.notification = OptimizerRuleCreateBodyNotification.constructFromObject(data['notification']);
      if (data.hasOwnProperty('rule_exec_info'))
        obj.rule_exec_info = OptimizerRuleCreateBodyRuleExecInfo.constructFromObject(data['rule_exec_info']);
      if (data.hasOwnProperty('tzone'))
        obj.tzone = ApiClient.convertToType(data['tzone'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/OptimizerRuleCreateBodyActions>} actions
 */
OptimizerRuleCreateBodyRules.prototype.actions = undefined;

/**
 * @member {Array.<module:model/OptimizerRuleCreateBodyApplyObjects>} apply_objects
 */
OptimizerRuleCreateBodyRules.prototype.apply_objects = undefined;

/**
 * @member {Array.<module:model/OptimizerRuleCreateBodyConditions>} conditions
 */
OptimizerRuleCreateBodyRules.prototype.conditions = undefined;

/**
 * @member {String} name
 */
OptimizerRuleCreateBodyRules.prototype.name = undefined;

/**
 * @member {module:model/OptimizerRuleCreateBodyNotification} notification
 */
OptimizerRuleCreateBodyRules.prototype.notification = undefined;

/**
 * @member {module:model/OptimizerRuleCreateBodyRuleExecInfo} rule_exec_info
 */
OptimizerRuleCreateBodyRules.prototype.rule_exec_info = undefined;

/**
 * @member {String} tzone
 */
OptimizerRuleCreateBodyRules.prototype.tzone = undefined;

