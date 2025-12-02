/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeAssetDeleteBody model module.
 * @module model/CreativeAssetDeleteBody
 * @version 0.1.9
 */
export class CreativeAssetDeleteBody {
  /**
   * Constructs a new <code>CreativeAssetDeleteBody</code>.
   * @alias module:model/CreativeAssetDeleteBody
   * @class
   * @param advertiser_id {String} 
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>CreativeAssetDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeAssetDeleteBody} obj Optional instance to populate.
   * @return {module:model/CreativeAssetDeleteBody} The populated <code>CreativeAssetDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeAssetDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('image_ids'))
        obj.image_ids = ApiClient.convertToType(data['image_ids'], ['String']);
      if (data.hasOwnProperty('video_ids'))
        obj.video_ids = ApiClient.convertToType(data['video_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
CreativeAssetDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} image_ids
 */
CreativeAssetDeleteBody.prototype.image_ids = undefined;

/**
 * @member {Array.<String>} video_ids
 */
CreativeAssetDeleteBody.prototype.video_ids = undefined;

