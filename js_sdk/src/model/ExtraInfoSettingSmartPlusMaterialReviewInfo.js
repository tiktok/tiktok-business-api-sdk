/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ExtraInfoSettingSmartPlusMaterialReviewInfo model module.
 * @module model/ExtraInfoSettingSmartPlusMaterialReviewInfo
 * @version 0.1.9
 */
export class ExtraInfoSettingSmartPlusMaterialReviewInfo {
  /**
   * Constructs a new <code>ExtraInfoSettingSmartPlusMaterialReviewInfo</code>.
   * @alias module:model/ExtraInfoSettingSmartPlusMaterialReviewInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ExtraInfoSettingSmartPlusMaterialReviewInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ExtraInfoSettingSmartPlusMaterialReviewInfo} obj Optional instance to populate.
   * @return {module:model/ExtraInfoSettingSmartPlusMaterialReviewInfo} The populated <code>ExtraInfoSettingSmartPlusMaterialReviewInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ExtraInfoSettingSmartPlusMaterialReviewInfo();
      if (data.hasOwnProperty('include_reject_info'))
        obj.include_reject_info = ApiClient.convertToType(data['include_reject_info'], 'Boolean');
      if (data.hasOwnProperty('include_violation_frame'))
        obj.include_violation_frame = ApiClient.convertToType(data['include_violation_frame'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Boolean} include_reject_info
 * @default false
 */
ExtraInfoSettingSmartPlusMaterialReviewInfo.prototype.include_reject_info = false;

/**
 * @member {Boolean} include_violation_frame
 * @default false
 */
ExtraInfoSettingSmartPlusMaterialReviewInfo.prototype.include_violation_frame = false;

