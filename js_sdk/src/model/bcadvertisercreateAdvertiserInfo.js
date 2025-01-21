/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The bcadvertisercreateAdvertiserInfo model module.
 * @module model/bcadvertisercreateAdvertiserInfo
 * @version 0.1.2
 */
export class bcadvertisercreateAdvertiserInfo {
  /**
   * Constructs a new <code>bcadvertisercreateAdvertiserInfo</code>.
   * Ad Account information
   * @alias module:model/bcadvertisercreateAdvertiserInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>bcadvertisercreateAdvertiserInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/bcadvertisercreateAdvertiserInfo} obj Optional instance to populate.
   * @return {module:model/bcadvertisercreateAdvertiserInfo} The populated <code>bcadvertisercreateAdvertiserInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new bcadvertisercreateAdvertiserInfo();
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('timezone'))
        obj.timezone = ApiClient.convertToType(data['timezone'], 'String');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'String');
    }
    return obj;
  }
}

/**
 * Ad Account currency, note: need to be consistent with the Business Center, the value range is shown in [Appendix-Currency](https://ads.tiktok.com/marketing_api/docs?id=1737585839634433)
 * @member {String} currency
 */
bcadvertisercreateAdvertiserInfo.prototype.currency = undefined;

/**
 * Ad Account name, length cannot exceed 100 characters
 * @member {String} name
 */
bcadvertisercreateAdvertiserInfo.prototype.name = undefined;

/**
 * Ad Account time zone code, the value range is shown in  [Appendix-Time Zone](https://ads.tiktok.com/marketing_api/docs?id=1737586324313089)
 * @member {String} timezone
 */
bcadvertisercreateAdvertiserInfo.prototype.timezone = undefined;

/**
 * Type of ad account that you want to create. Enum values: `RESERVATION`, `AUCTION` (default).Note: `DIRECT` Business Centers can only create an ad account of `AUCTION` type
 * @member {String} type
 */
bcadvertisercreateAdvertiserInfo.prototype.type = undefined;

