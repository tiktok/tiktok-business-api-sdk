/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdcreateDisclaimerText model module.
 * @module model/AdcreateDisclaimerText
 * @version 0.1.5
 */
export class AdcreateDisclaimerText {
  /**
   * Constructs a new <code>AdcreateDisclaimerText</code>.
   * The text-only disclaimer that you want to add to the ad.  Required when &#x60;disclaimer_type&#x60; &#x3D; &#x60;TEXT_ONLY&#x60;.
   * @alias module:model/AdcreateDisclaimerText
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdcreateDisclaimerText</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdcreateDisclaimerText} obj Optional instance to populate.
   * @return {module:model/AdcreateDisclaimerText} The populated <code>AdcreateDisclaimerText</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdcreateDisclaimerText();
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
AdcreateDisclaimerText.prototype.text = undefined;

