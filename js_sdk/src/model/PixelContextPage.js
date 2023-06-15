/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The PixelContextPage model module.
 * @module model/PixelContextPage
 * @version 0.1.1
 */
export class PixelContextPage {
  /**
   * Constructs a new <code>PixelContextPage</code>.
   * Page information.
   * @alias module:model/PixelContextPage
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelContextPage</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelContextPage} obj Optional instance to populate.
   * @return {module:model/PixelContextPage} The populated <code>PixelContextPage</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelContextPage();
      if (data.hasOwnProperty('referrer'))
        obj.referrer = ApiClient.convertToType(data['referrer'], 'String');
      if (data.hasOwnProperty('url'))
        obj.url = ApiClient.convertToType(data['url'], 'String');
    }
    return obj;
  }
}

/**
 * Page referrer.
 * @member {String} referrer
 */
PixelContextPage.prototype.referrer = undefined;

/**
 * Page url when event happened.
 * @member {String} url
 */
PixelContextPage.prototype.url = undefined;

