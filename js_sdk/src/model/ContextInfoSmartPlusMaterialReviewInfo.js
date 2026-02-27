/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ContextInfoSmartPlusMaterialReviewInfo model module.
 * @module model/ContextInfoSmartPlusMaterialReviewInfo
 * @version 1.2.1
 */
export class ContextInfoSmartPlusMaterialReviewInfo {
  /**
   * Constructs a new <code>ContextInfoSmartPlusMaterialReviewInfo</code>.
   * @alias module:model/ContextInfoSmartPlusMaterialReviewInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ContextInfoSmartPlusMaterialReviewInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ContextInfoSmartPlusMaterialReviewInfo} obj Optional instance to populate.
   * @return {module:model/ContextInfoSmartPlusMaterialReviewInfo} The populated <code>ContextInfoSmartPlusMaterialReviewInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ContextInfoSmartPlusMaterialReviewInfo();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'Number');
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
      if (data.hasOwnProperty('developer_id'))
        obj.developer_id = ApiClient.convertToType(data['developer_id'], 'Number');
      if (data.hasOwnProperty('developer_region'))
        obj.developer_region = ApiClient.convertToType(data['developer_region'], 'String');
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
ContextInfoSmartPlusMaterialReviewInfo.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.developer_id = undefined;

/**
 * @member {String} developer_region
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.developer_region = undefined;

/**
 * @member {String} referer
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.referer = undefined;

/**
 * @member {String} user_agent
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.user_agent = undefined;

/**
 * @member {String} x_forwarded_for
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
ContextInfoSmartPlusMaterialReviewInfo.prototype.x_real_ip = undefined;

