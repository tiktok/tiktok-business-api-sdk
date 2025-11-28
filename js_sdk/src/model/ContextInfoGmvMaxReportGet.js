/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ContextInfoGmvMaxReportGet model module.
 * @module model/ContextInfoGmvMaxReportGet
 * @version 0.1.8
 */
export class ContextInfoGmvMaxReportGet {
  /**
   * Constructs a new <code>ContextInfoGmvMaxReportGet</code>.
   * @alias module:model/ContextInfoGmvMaxReportGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ContextInfoGmvMaxReportGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ContextInfoGmvMaxReportGet} obj Optional instance to populate.
   * @return {module:model/ContextInfoGmvMaxReportGet} The populated <code>ContextInfoGmvMaxReportGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ContextInfoGmvMaxReportGet();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'Number');
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
      if (data.hasOwnProperty('developer_id'))
        obj.developer_id = ApiClient.convertToType(data['developer_id'], 'Number');
      if (data.hasOwnProperty('referer'))
        obj.referer = ApiClient.convertToType(data['referer'], 'String');
      if (data.hasOwnProperty('user_agent'))
        obj.user_agent = ApiClient.convertToType(data['user_agent'], 'String');
      if (data.hasOwnProperty('x_forwarded_for'))
        obj.x_forwarded_for = ApiClient.convertToType(data['x_forwarded_for'], 'String');
      if (data.hasOwnProperty('x_real_ip'))
        obj.x_real_ip = ApiClient.convertToType(data['x_real_ip'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} app_id
 */
ContextInfoGmvMaxReportGet.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
ContextInfoGmvMaxReportGet.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
ContextInfoGmvMaxReportGet.prototype.developer_id = undefined;

/**
 * @member {String} referer
 */
ContextInfoGmvMaxReportGet.prototype.referer = undefined;

/**
 * @member {String} user_agent
 */
ContextInfoGmvMaxReportGet.prototype.user_agent = undefined;

/**
 * @member {String} x_forwarded_for
 */
ContextInfoGmvMaxReportGet.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
ContextInfoGmvMaxReportGet.prototype.x_real_ip = undefined;

