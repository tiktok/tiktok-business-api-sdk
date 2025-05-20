/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyCallToActionList model module.
 * @module model/AdAcoBodyCallToActionList
 * @version 0.1.7
 */
export class AdAcoBodyCallToActionList {
  /**
   * Constructs a new <code>AdAcoBodyCallToActionList</code>.
   * @alias module:model/AdAcoBodyCallToActionList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyCallToActionList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyCallToActionList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyCallToActionList} The populated <code>AdAcoBodyCallToActionList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyCallToActionList();
      if (data.hasOwnProperty('call_to_action'))
        obj.call_to_action = ApiClient.convertToType(data['call_to_action'], 'String');
    }
    return obj;
  }
}

/**
 * Call-to-action text. For enum values, see [Enumeration - Call-to-action](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} call_to_action
 */
AdAcoBodyCallToActionList.prototype.call_to_action = undefined;

