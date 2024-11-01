/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdAcoBodyMediaInfoImageInfo} from './AdAcoBodyMediaInfoImageInfo.js';
import {AdAcoBodyMediaInfoVideoInfo} from './AdAcoBodyMediaInfoVideoInfo.js';

/**
 * The AdAcoBodyMediaInfo model module.
 * @module model/AdAcoBodyMediaInfo
 * @version 0.1.2
 */
export class AdAcoBodyMediaInfo {
  /**
   * Constructs a new <code>AdAcoBodyMediaInfo</code>.
   * Material information.
   * @alias module:model/AdAcoBodyMediaInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyMediaInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyMediaInfo} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyMediaInfo} The populated <code>AdAcoBodyMediaInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyMediaInfo();
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('image_info'))
        obj.image_info = ApiClient.convertToType(data['image_info'], [AdAcoBodyMediaInfoImageInfo]);
      if (data.hasOwnProperty('tiktok_item_id'))
        obj.tiktok_item_id = ApiClient.convertToType(data['tiktok_item_id'], 'String');
      if (data.hasOwnProperty('video_info'))
        obj.video_info = AdAcoBodyMediaInfoVideoInfo.constructFromObject(data['video_info']);
    }
    return obj;
  }
}

/**
 * Identity ID. Required when you are not using Spark Ads (`tiktok_item_id`).
 * @member {String} identity_id
 */
AdAcoBodyMediaInfo.prototype.identity_id = undefined;

/**
 * Identity type. Required when you are not using Spark Ads (`tiktok_item_id`). The only supported value is `CUSTOMIZED_USER`.
 * @member {String} identity_type
 */
AdAcoBodyMediaInfo.prototype.identity_type = undefined;

/**
 * Image information. When you want to upload image materials (`video_info` is NOT included in the request), this field will be used as image materials. When you want to upload video materials (`video_info` is included in the request), this field will be used as the video cover. Only 1 picture can be submitted in each `image_info` object.
 * @member {Array.<module:model/AdAcoBodyMediaInfoImageInfo>} image_info
 */
AdAcoBodyMediaInfo.prototype.image_info = undefined;

/**
 * The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the `tiktok_item_id` you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id=1738376324021250) and  [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740218475032577) endpoints.
 * @member {String} tiktok_item_id
 */
AdAcoBodyMediaInfo.prototype.tiktok_item_id = undefined;

/**
 * @member {module:model/AdAcoBodyMediaInfoVideoInfo} video_info
 */
AdAcoBodyMediaInfo.prototype.video_info = undefined;

