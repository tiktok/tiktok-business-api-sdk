/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ContextInfoCatalogFeedLog model module.
 * @module model/ContextInfoCatalogFeedLog
 * @version 0.1.8
 */
export class ContextInfoCatalogFeedLog {
  /**
   * Constructs a new <code>ContextInfoCatalogFeedLog</code>.
   * @alias module:model/ContextInfoCatalogFeedLog
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ContextInfoCatalogFeedLog</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ContextInfoCatalogFeedLog} obj Optional instance to populate.
   * @return {module:model/ContextInfoCatalogFeedLog} The populated <code>ContextInfoCatalogFeedLog</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ContextInfoCatalogFeedLog();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'String');
      if (data.hasOwnProperty('developer_id'))
        obj.developer_id = ApiClient.convertToType(data['developer_id'], 'String');
      if (data.hasOwnProperty('x_forwarded_for'))
        obj.x_forwarded_for = ApiClient.convertToType(data['x_forwarded_for'], 'String');
      if (data.hasOwnProperty('x_real_ip'))
        obj.x_real_ip = ApiClient.convertToType(data['x_real_ip'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} app_id
 */
ContextInfoCatalogFeedLog.prototype.app_id = undefined;

/**
 * @member {String} core_user_id
 */
ContextInfoCatalogFeedLog.prototype.core_user_id = undefined;

/**
 * @member {String} developer_id
 */
ContextInfoCatalogFeedLog.prototype.developer_id = undefined;

/**
 * @member {String} x_forwarded_for
 */
ContextInfoCatalogFeedLog.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
ContextInfoCatalogFeedLog.prototype.x_real_ip = undefined;

