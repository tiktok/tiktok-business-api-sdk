/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyLandingPageUrls model module.
 * @module model/AdAcoBodyLandingPageUrls
 * @version 0.1.4
 */
export class AdAcoBodyLandingPageUrls {
  /**
   * Constructs a new <code>AdAcoBodyLandingPageUrls</code>.
   * @alias module:model/AdAcoBodyLandingPageUrls
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyLandingPageUrls</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyLandingPageUrls} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyLandingPageUrls} The populated <code>AdAcoBodyLandingPageUrls</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyLandingPageUrls();
      if (data.hasOwnProperty('landing_page_url'))
        obj.landing_page_url = ApiClient.convertToType(data['landing_page_url'], 'String');
    }
    return obj;
  }
}

/**
 * Landing page URL.
 * @member {String} landing_page_url
 */
AdAcoBodyLandingPageUrls.prototype.landing_page_url = undefined;

