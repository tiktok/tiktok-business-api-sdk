/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13dmpcustomAudiencefileuploadContextInfo model module.
 * @module model/OpenApiv13dmpcustomAudiencefileuploadContextInfo
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudiencefileuploadContextInfo {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudiencefileuploadContextInfo</code>.
   * @alias module:model/OpenApiv13dmpcustomAudiencefileuploadContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudiencefileuploadContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudiencefileuploadContextInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudiencefileuploadContextInfo} The populated <code>OpenApiv13dmpcustomAudiencefileuploadContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudiencefileuploadContextInfo();
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
OpenApiv13dmpcustomAudiencefileuploadContextInfo.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
OpenApiv13dmpcustomAudiencefileuploadContextInfo.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
OpenApiv13dmpcustomAudiencefileuploadContextInfo.prototype.developer_id = undefined;

/**
 * @member {String} x_forwarded_for
 */
OpenApiv13dmpcustomAudiencefileuploadContextInfo.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
OpenApiv13dmpcustomAudiencefileuploadContextInfo.prototype.x_real_ip = undefined;

