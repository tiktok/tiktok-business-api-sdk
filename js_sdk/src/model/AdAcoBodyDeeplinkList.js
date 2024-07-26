/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyDeeplinkList model module.
 * @module model/AdAcoBodyDeeplinkList
 * @version 0.1.1
 */
export class AdAcoBodyDeeplinkList {
  /**
   * Constructs a new <code>AdAcoBodyDeeplinkList</code>.
   * @alias module:model/AdAcoBodyDeeplinkList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyDeeplinkList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyDeeplinkList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyDeeplinkList} The populated <code>AdAcoBodyDeeplinkList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyDeeplinkList();
      if (data.hasOwnProperty('deeplink'))
        obj.deeplink = ApiClient.convertToType(data['deeplink'], 'String');
      if (data.hasOwnProperty('deeplink_type'))
        obj.deeplink_type = ApiClient.convertToType(data['deeplink_type'], 'String');
    }
    return obj;
  }
}

/**
 * The specific location where you want your audience to go if they have your app installed.
 * @member {String} deeplink
 */
AdAcoBodyDeeplinkList.prototype.deeplink = undefined;

/**
 * The open URL type. Allowed values differs based on campaign objectives. Allowed values- `NORMAL` (supported in Traffic, Conversion), `DEFERRED_DEEPLINK` (supported in App Install ). The default value is `NORMAL`. For an ad that will be included in an iOS 14 campaign, this field cannot be set to `DEFERRED_DEEPLINK`.
 * @member {String} deeplink_type
 */
AdAcoBodyDeeplinkList.prototype.deeplink_type = undefined;

