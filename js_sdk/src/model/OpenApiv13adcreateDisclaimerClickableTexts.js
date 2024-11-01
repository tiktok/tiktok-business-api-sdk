/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13adcreateDisclaimerClickableTexts model module.
 * @module model/OpenApiv13adcreateDisclaimerClickableTexts
 * @version 0.1.2
 */
export class OpenApiv13adcreateDisclaimerClickableTexts {
  /**
   * Constructs a new <code>OpenApiv13adcreateDisclaimerClickableTexts</code>.
   * @alias module:model/OpenApiv13adcreateDisclaimerClickableTexts
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adcreateDisclaimerClickableTexts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adcreateDisclaimerClickableTexts} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adcreateDisclaimerClickableTexts} The populated <code>OpenApiv13adcreateDisclaimerClickableTexts</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adcreateDisclaimerClickableTexts();
      if (data.hasOwnProperty('text'))
        obj.text = ApiClient.convertToType(data['text'], 'String');
      if (data.hasOwnProperty('url'))
        obj.url = ApiClient.convertToType(data['url'], 'String');
    }
    return obj;
  }
}

/**
 * The disclaimer text. Length limit- 40 characters.
 * @member {String} text
 */
OpenApiv13adcreateDisclaimerClickableTexts.prototype.text = undefined;

/**
 * The URL for the clickable disclaimer. When users tap each text, they will be redirected to the URL and see more disclaimer details.
 * @member {String} url
 */
OpenApiv13adcreateDisclaimerClickableTexts.prototype.url = undefined;

