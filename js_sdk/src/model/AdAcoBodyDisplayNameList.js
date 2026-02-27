/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyDisplayNameList model module.
 * @module model/AdAcoBodyDisplayNameList
 * @version 1.2.1
 */
export class AdAcoBodyDisplayNameList {
  /**
   * Constructs a new <code>AdAcoBodyDisplayNameList</code>.
   * @alias module:model/AdAcoBodyDisplayNameList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyDisplayNameList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyDisplayNameList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyDisplayNameList} The populated <code>AdAcoBodyDisplayNameList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyDisplayNameList();
      if (data.hasOwnProperty('app_name'))
        obj.app_name = ApiClient.convertToType(data['app_name'], 'String');
      if (data.hasOwnProperty('landing_page_name'))
        obj.landing_page_name = ApiClient.convertToType(data['landing_page_name'], 'String');
    }
    return obj;
  }
}

/**
 * App name that is displayed in the ad. If not specified, the name in the app store will be used. Number of characters allowed- 1-40. If the name in the app store exceeds 40 characters, you must pass in a new app name with this field.
 * @member {String} app_name
 */
AdAcoBodyDisplayNameList.prototype.app_name = undefined;

/**
 * The display name of the landing page, required when the promotion type is landing page. Length limit- 1-40 characters.
 * @member {String} landing_page_name
 */
AdAcoBodyDisplayNameList.prototype.landing_page_name = undefined;

