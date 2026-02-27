/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyLandingPageUrlList model module.
 * @module model/SmartPlusAdCreateBodyLandingPageUrlList
 * @version 1.2.1
 */
export class SmartPlusAdCreateBodyLandingPageUrlList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyLandingPageUrlList</code>.
   * @alias module:model/SmartPlusAdCreateBodyLandingPageUrlList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyLandingPageUrlList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyLandingPageUrlList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyLandingPageUrlList} The populated <code>SmartPlusAdCreateBodyLandingPageUrlList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyLandingPageUrlList();
      if (data.hasOwnProperty('landing_page_url'))
        obj.landing_page_url = ApiClient.convertToType(data['landing_page_url'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} landing_page_url
 */
SmartPlusAdCreateBodyLandingPageUrlList.prototype.landing_page_url = undefined;

