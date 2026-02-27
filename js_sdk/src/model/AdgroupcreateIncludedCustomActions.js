/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateIncludedCustomActions model module.
 * @module model/AdgroupcreateIncludedCustomActions
 * @version 1.2.1
 */
export class AdgroupcreateIncludedCustomActions {
  /**
   * Constructs a new <code>AdgroupcreateIncludedCustomActions</code>.
   * @alias module:model/AdgroupcreateIncludedCustomActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateIncludedCustomActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateIncludedCustomActions} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateIncludedCustomActions} The populated <code>AdgroupcreateIncludedCustomActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateIncludedCustomActions();
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
AdgroupcreateIncludedCustomActions.prototype.code = undefined;

/**
 * @member {Number} days
 */
AdgroupcreateIncludedCustomActions.prototype.days = undefined;

