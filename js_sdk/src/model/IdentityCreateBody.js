/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The IdentityCreateBody model module.
 * @module model/IdentityCreateBody
 * @version 0.1.9
 */
export class IdentityCreateBody {
  /**
   * Constructs a new <code>IdentityCreateBody</code>.
   * @alias module:model/IdentityCreateBody
   * @class
   * @param advertiser_id {String} Advertiser ID
   * @param display_name {String} Display name. The maximum length is 100 characters.
   * @param image_uri {String} `image_id` of the avatar. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097) endpoint. Width and height ratio must be 1:1.
   */
  constructor(advertiser_id, display_name, image_uri) {
    this.advertiser_id = advertiser_id;
    this.display_name = display_name;
    this.image_uri = image_uri;
  }

  /**
   * Constructs a <code>IdentityCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IdentityCreateBody} obj Optional instance to populate.
   * @return {module:model/IdentityCreateBody} The populated <code>IdentityCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new IdentityCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('display_name'))
        obj.display_name = ApiClient.convertToType(data['display_name'], 'String');
      if (data.hasOwnProperty('image_uri'))
        obj.image_uri = ApiClient.convertToType(data['image_uri'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
IdentityCreateBody.prototype.advertiser_id = undefined;

/**
 * Display name. The maximum length is 100 characters.
 * @member {String} display_name
 */
IdentityCreateBody.prototype.display_name = undefined;

/**
 * `image_id` of the avatar. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097) endpoint. Width and height ratio must be 1:1.
 * @member {String} image_uri
 */
IdentityCreateBody.prototype.image_uri = undefined;

