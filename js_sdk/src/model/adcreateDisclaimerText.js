/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The adcreateDisclaimerText model module.
 * @module model/adcreateDisclaimerText
 * @version 0.1.2
 */
export class adcreateDisclaimerText {
  /**
   * Constructs a new <code>adcreateDisclaimerText</code>.
   * The text-only disclaimer that you want to add to the ad.  Required when &#x60;disclaimer_type&#x60; &#x3D; &#x60;TEXT_ONLY&#x60;.
   * @alias module:model/adcreateDisclaimerText
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adcreateDisclaimerText</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adcreateDisclaimerText} obj Optional instance to populate.
   * @return {module:model/adcreateDisclaimerText} The populated <code>adcreateDisclaimerText</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adcreateDisclaimerText();
      if (data.hasOwnProperty('text'))
        obj.text = ApiClient.convertToType(data['text'], 'String');
    }
    return obj;
  }
}

/**
 * The disclaimer text. Length limit- 90 characters.
 * @member {String} text
 */
adcreateDisclaimerText.prototype.text = undefined;

