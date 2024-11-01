/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13dmpcustomAudiencelookalikecreateContextInfo model module.
 * @module model/OpenApiv13dmpcustomAudiencelookalikecreateContextInfo
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudiencelookalikecreateContextInfo {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudiencelookalikecreateContextInfo</code>.
   * @alias module:model/OpenApiv13dmpcustomAudiencelookalikecreateContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudiencelookalikecreateContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudiencelookalikecreateContextInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudiencelookalikecreateContextInfo} The populated <code>OpenApiv13dmpcustomAudiencelookalikecreateContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudiencelookalikecreateContextInfo();
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
OpenApiv13dmpcustomAudiencelookalikecreateContextInfo.prototype.app_id = undefined;

/**
 * @member {Number} core_user_id
 */
OpenApiv13dmpcustomAudiencelookalikecreateContextInfo.prototype.core_user_id = undefined;

/**
 * @member {Number} developer_id
 */
OpenApiv13dmpcustomAudiencelookalikecreateContextInfo.prototype.developer_id = undefined;

