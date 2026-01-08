/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateExcludedCustomActions model module.
 * @module model/AdgroupcreateExcludedCustomActions
 * @version 0.1.9
 */
export class AdgroupcreateExcludedCustomActions {
  /**
   * Constructs a new <code>AdgroupcreateExcludedCustomActions</code>.
   * @alias module:model/AdgroupcreateExcludedCustomActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateExcludedCustomActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateExcludedCustomActions} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateExcludedCustomActions} The populated <code>AdgroupcreateExcludedCustomActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateExcludedCustomActions();
      if (data.hasOwnProperty('code'))
        obj.code = ApiClient.convertToType(data['code'], 'String');
      if (data.hasOwnProperty('days'))
        obj.days = ApiClient.convertToType(data['days'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {String} code
 */
AdgroupcreateExcludedCustomActions.prototype.code = undefined;

/**
 * @member {Number} days
 */
AdgroupcreateExcludedCustomActions.prototype.days = undefined;

