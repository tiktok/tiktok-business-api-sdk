/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyCardList model module.
 * @module model/AdAcoBodyCardList
 * @version 1.2.1
 */
export class AdAcoBodyCardList {
  /**
   * Constructs a new <code>AdAcoBodyCardList</code>.
   * @alias module:model/AdAcoBodyCardList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyCardList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyCardList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyCardList} The populated <code>AdAcoBodyCardList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyCardList();
      if (data.hasOwnProperty('card_id'))
        obj.card_id = ApiClient.convertToType(data['card_id'], 'String');
    }
    return obj;
  }
}

/**
 * Display Card ID, gift code card ID, premium badge ID, Countdown Sticker ID, or Download Card ID.<ul><li> To learn about how to get a display card ID or download card ID, please see [Use Cards in Ads](https://ads.tiktok.com/marketing_api/docs?id=1738963975941122).To learn about how to get a premium badge ID, see [Premium Add-ons](https://ads.tiktok.com/marketing_api/docs?id=1749019676181505). Premium badges are only supported in R&F ads.To learn about how to get a Countdown Sticker ID, see [Stickers](https://ads.tiktok.com/marketing_api/docs?id=1749019667506177).
 * @member {String} card_id
 */
AdAcoBodyCardList.prototype.card_id = undefined;

