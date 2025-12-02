/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ContextInfoCatalogProductLog model module.
 * @module model/ContextInfoCatalogProductLog
 * @version 0.1.9
 */
export class ContextInfoCatalogProductLog {
  /**
   * Constructs a new <code>ContextInfoCatalogProductLog</code>.
   * @alias module:model/ContextInfoCatalogProductLog
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ContextInfoCatalogProductLog</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ContextInfoCatalogProductLog} obj Optional instance to populate.
   * @return {module:model/ContextInfoCatalogProductLog} The populated <code>ContextInfoCatalogProductLog</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ContextInfoCatalogProductLog();
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
ContextInfoCatalogProductLog.prototype.app_id = undefined;

/**
 * @member {String} core_user_id
 */
ContextInfoCatalogProductLog.prototype.core_user_id = undefined;

/**
 * @member {String} developer_id
 */
ContextInfoCatalogProductLog.prototype.developer_id = undefined;

/**
 * @member {String} x_forwarded_for
 */
ContextInfoCatalogProductLog.prototype.x_forwarded_for = undefined;

/**
 * @member {String} x_real_ip
 */
ContextInfoCatalogProductLog.prototype.x_real_ip = undefined;

