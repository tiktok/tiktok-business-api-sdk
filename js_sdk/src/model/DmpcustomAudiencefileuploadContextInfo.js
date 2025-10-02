/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The DmpcustomAudiencefileuploadContextInfo model module.
 * @module model/DmpcustomAudiencefileuploadContextInfo
 * @version 0.1.8
 */
export class DmpcustomAudiencefileuploadContextInfo {
  /**
   * Constructs a new <code>DmpcustomAudiencefileuploadContextInfo</code>.
   * @alias module:model/DmpcustomAudiencefileuploadContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>DmpcustomAudiencefileuploadContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencefileuploadContextInfo} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencefileuploadContextInfo} The populated <code>DmpcustomAudiencefileuploadContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencefileuploadContextInfo();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'Number');
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
      if (data.hasOwnProperty('developer_id'))
        obj.developer_id = ApiClient.convertToType(data['developer_id'], 'Number');
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
DmpcustomAudiencefileuploadContextInfo.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
DmpcustomAudiencefileuploadContextInfo.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
DmpcustomAudiencefileuploadContextInfo.prototype.developer_id = undefined;

/**
 * @member {String} x_forwarded_for
 */
DmpcustomAudiencefileuploadContextInfo.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
DmpcustomAudiencefileuploadContextInfo.prototype.x_real_ip = undefined;

