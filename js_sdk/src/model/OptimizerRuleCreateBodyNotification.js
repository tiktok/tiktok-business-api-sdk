/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OptimizerRuleCreateBodyNotificationEmailSetting} from './OptimizerRuleCreateBodyNotificationEmailSetting.js';

/**
 * The OptimizerRuleCreateBodyNotification model module.
 * @module model/OptimizerRuleCreateBodyNotification
 * @version 0.1.7
 */
export class OptimizerRuleCreateBodyNotification {
  /**
   * Constructs a new <code>OptimizerRuleCreateBodyNotification</code>.
   * @alias module:model/OptimizerRuleCreateBodyNotification
   * @class
   * @param notification_type {String} 
   */
  constructor(notification_type) {
    this.notification_type = notification_type;
  }

  /**
   * Constructs a <code>OptimizerRuleCreateBodyNotification</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizerRuleCreateBodyNotification} obj Optional instance to populate.
   * @return {module:model/OptimizerRuleCreateBodyNotification} The populated <code>OptimizerRuleCreateBodyNotification</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptimizerRuleCreateBodyNotification();
      if (data.hasOwnProperty('email_setting'))
        obj.email_setting = OptimizerRuleCreateBodyNotificationEmailSetting.constructFromObject(data['email_setting']);
      if (data.hasOwnProperty('notification_type'))
        obj.notification_type = ApiClient.convertToType(data['notification_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/OptimizerRuleCreateBodyNotificationEmailSetting} email_setting
 */
OptimizerRuleCreateBodyNotification.prototype.email_setting = undefined;

/**
 * @member {String} notification_type
 */
OptimizerRuleCreateBodyNotification.prototype.notification_type = undefined;

