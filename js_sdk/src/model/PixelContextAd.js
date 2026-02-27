/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixelContextAd model module.
 * @module model/PixelContextAd
 * @version 1.2.1
 */
export class PixelContextAd {
  /**
   * Constructs a new <code>PixelContextAd</code>.
   * Ad information.
   * @alias module:model/PixelContextAd
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelContextAd</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelContextAd} obj Optional instance to populate.
   * @return {module:model/PixelContextAd} The populated <code>PixelContextAd</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelContextAd();
      if (data.hasOwnProperty('callback'))
        obj.callback = ApiClient.convertToType(data['callback'], 'String');
    }
    return obj;
  }
}

/**
 * TikTok Click ID. TikTok Click ID (ttclid) is a tracking parameter appended to a landing page URL whenever a user clicks on an ad on TikTok. The ttcid valid period is the same as your CTA window setting in [Attribution Manager](https://ads.tiktok.com/help/article/attribution-manager?redirected=1). For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id=1739584860883969)
 * @member {String} callback
 */
PixelContextAd.prototype.callback = undefined;

