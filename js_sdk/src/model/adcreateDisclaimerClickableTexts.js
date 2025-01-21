/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The adcreateDisclaimerClickableTexts model module.
 * @module model/adcreateDisclaimerClickableTexts
 * @version 0.1.2
 */
export class adcreateDisclaimerClickableTexts {
  /**
   * Constructs a new <code>adcreateDisclaimerClickableTexts</code>.
   * @alias module:model/adcreateDisclaimerClickableTexts
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adcreateDisclaimerClickableTexts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adcreateDisclaimerClickableTexts} obj Optional instance to populate.
   * @return {module:model/adcreateDisclaimerClickableTexts} The populated <code>adcreateDisclaimerClickableTexts</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adcreateDisclaimerClickableTexts();
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
adcreateDisclaimerClickableTexts.prototype.text = undefined;

/**
 * The URL for the clickable disclaimer. When users tap each text, they will be redirected to the URL and see more disclaimer details.
 * @member {String} url
 */
adcreateDisclaimerClickableTexts.prototype.url = undefined;

