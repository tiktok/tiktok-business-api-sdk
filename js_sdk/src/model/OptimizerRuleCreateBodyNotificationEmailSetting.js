/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OptimizerRuleCreateBodyNotificationEmailSetting model module.
 * @module model/OptimizerRuleCreateBodyNotificationEmailSetting
 * @version 0.1.9
 */
export class OptimizerRuleCreateBodyNotificationEmailSetting {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyNotificationEmailSetting</code>.
   * @alias module:model/OptimizerRuleCreateBodyNotificationEmailSetting
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyNotificationEmailSetting</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyNotificationEmailSetting} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyNotificationEmailSetting} The populated <code>OptimizerRuleCreateBodyNotificationEmailSetting</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyNotificationEmailSetting();
      if (data.hasOwnProperty('email_exec_time'))
        obj.email_exec_time = ApiClient.convertToType(data['email_exec_time'], ['String']);
      if (data.hasOwnProperty('mute_option'))
        obj.mute_option = ApiClient.convertToType(data['mute_option'], 'String');
      if (data.hasOwnProperty('no_result_notification'))
        obj.no_result_notification = ApiClient.convertToType(data['no_result_notification'], 'Boolean');
      if (data.hasOwnProperty('notification_period'))
        obj.notification_period = ApiClient.convertToType(data['notification_period'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} email_exec_time
 */
OptimizerRuleCreateBodyNotificationEmailSetting.prototype.email_exec_time = undefined;

/**
 * @member {String} mute_option
 */
OptimizerRuleCreateBodyNotificationEmailSetting.prototype.mute_option = undefined;

/**
 * @member {Boolean} no_result_notification
 */
OptimizerRuleCreateBodyNotificationEmailSetting.prototype.no_result_notification = undefined;

/**
 * @member {String} notification_period
 */
OptimizerRuleCreateBodyNotificationEmailSetting.prototype.notification_period = undefined;

