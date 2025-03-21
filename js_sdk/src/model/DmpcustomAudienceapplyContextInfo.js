/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The DmpcustomAudienceapplyContextInfo model module.
 * @module model/DmpcustomAudienceapplyContextInfo
 * @version 0.1.5
 */
export class DmpcustomAudienceapplyContextInfo {
  /**
   * Constructs a new <code>DmpcustomAudienceapplyContextInfo</code>.
   * @alias module:model/DmpcustomAudienceapplyContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>DmpcustomAudienceapplyContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudienceapplyContextInfo} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudienceapplyContextInfo} The populated <code>DmpcustomAudienceapplyContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudienceapplyContextInfo();
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} core_user_id
 */
DmpcustomAudienceapplyContextInfo.prototype.core_user_id = undefined;

