/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The DmpcustomAudiencelookalikecreateContextInfo model module.
 * @module model/DmpcustomAudiencelookalikecreateContextInfo
 * @version 0.1.4
 */
export class DmpcustomAudiencelookalikecreateContextInfo {
  /**
   * Constructs a new <code>DmpcustomAudiencelookalikecreateContextInfo</code>.
   * @alias module:model/DmpcustomAudiencelookalikecreateContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>DmpcustomAudiencelookalikecreateContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencelookalikecreateContextInfo} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencelookalikecreateContextInfo} The populated <code>DmpcustomAudiencelookalikecreateContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencelookalikecreateContextInfo();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'Number');
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
      if (data.hasOwnProperty('developer_id'))
        obj.developer_id = ApiClient.convertToType(data['developer_id'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} app_id
 */
DmpcustomAudiencelookalikecreateContextInfo.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
DmpcustomAudiencelookalikecreateContextInfo.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
DmpcustomAudiencelookalikecreateContextInfo.prototype.developer_id = undefined;

