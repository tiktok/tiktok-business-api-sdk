/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13adcreateDisclaimerText model module.
 * @module model/OpenApiv13adcreateDisclaimerText
 * @version 0.1.2
 */
export class OpenApiv13adcreateDisclaimerText {
  /**
   * Constructs a new <code>OpenApiv13adcreateDisclaimerText</code>.
   * The text-only disclaimer that you want to add to the ad.  Required when &#x60;disclaimer_type&#x60; &#x3D; &#x60;TEXT_ONLY&#x60;.
   * @alias module:model/OpenApiv13adcreateDisclaimerText
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adcreateDisclaimerText</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adcreateDisclaimerText} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adcreateDisclaimerText} The populated <code>OpenApiv13adcreateDisclaimerText</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adcreateDisclaimerText();
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
OpenApiv13adcreateDisclaimerText.prototype.text = undefined;

