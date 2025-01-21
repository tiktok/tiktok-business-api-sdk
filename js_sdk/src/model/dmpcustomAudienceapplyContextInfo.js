/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The dmpcustomAudienceapplyContextInfo model module.
 * @module model/dmpcustomAudienceapplyContextInfo
 * @version 0.1.2
 */
export class dmpcustomAudienceapplyContextInfo {
  /**
   * Constructs a new <code>dmpcustomAudienceapplyContextInfo</code>.
   * @alias module:model/dmpcustomAudienceapplyContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>dmpcustomAudienceapplyContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudienceapplyContextInfo} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudienceapplyContextInfo} The populated <code>dmpcustomAudienceapplyContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudienceapplyContextInfo();
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} core_user_id
 */
dmpcustomAudienceapplyContextInfo.prototype.core_user_id = undefined;

