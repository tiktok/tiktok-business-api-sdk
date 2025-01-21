/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The dmpcustomAudiencefileuploadContextInfo model module.
 * @module model/dmpcustomAudiencefileuploadContextInfo
 * @version 0.1.2
 */
export class dmpcustomAudiencefileuploadContextInfo {
  /**
   * Constructs a new <code>dmpcustomAudiencefileuploadContextInfo</code>.
   * @alias module:model/dmpcustomAudiencefileuploadContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>dmpcustomAudiencefileuploadContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudiencefileuploadContextInfo} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudiencefileuploadContextInfo} The populated <code>dmpcustomAudiencefileuploadContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudiencefileuploadContextInfo();
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
dmpcustomAudiencefileuploadContextInfo.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
dmpcustomAudiencefileuploadContextInfo.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
dmpcustomAudiencefileuploadContextInfo.prototype.developer_id = undefined;

/**
 * @member {String} x_forwarded_for
 */
dmpcustomAudiencefileuploadContextInfo.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
dmpcustomAudiencefileuploadContextInfo.prototype.x_real_ip = undefined;

