/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateAppConfig model module.
 * @module model/AdgroupcreateAppConfig
 * @version 0.1.9
 */
export class AdgroupcreateAppConfig {
  /**
   * Constructs a new <code>AdgroupcreateAppConfig</code>.
   * @alias module:model/AdgroupcreateAppConfig
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAppConfig</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAppConfig} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAppConfig} The populated <code>AdgroupcreateAppConfig</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAppConfig();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} app_id
 */
AdgroupcreateAppConfig.prototype.app_id = undefined;

