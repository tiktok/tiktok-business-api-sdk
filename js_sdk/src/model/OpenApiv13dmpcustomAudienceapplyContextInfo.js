/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13dmpcustomAudienceapplyContextInfo model module.
 * @module model/OpenApiv13dmpcustomAudienceapplyContextInfo
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudienceapplyContextInfo {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudienceapplyContextInfo</code>.
   * @alias module:model/OpenApiv13dmpcustomAudienceapplyContextInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudienceapplyContextInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudienceapplyContextInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudienceapplyContextInfo} The populated <code>OpenApiv13dmpcustomAudienceapplyContextInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudienceapplyContextInfo();
      if (data.hasOwnProperty('core_user_id'))
        obj.core_user_id = ApiClient.convertToType(data['core_user_id'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} core_user_id
 */
OpenApiv13dmpcustomAudienceapplyContextInfo.prototype.core_user_id = undefined;

