/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PlayableSaveBody model module.
 * @module model/PlayableSaveBody
 * @version 0.1.7
 */
export class PlayableSaveBody {
  /**
   * Constructs a new <code>PlayableSaveBody</code>.
   * @alias module:model/PlayableSaveBody
   * @class
   * @param advertiser_id {String} 
   * @param playable_id {String} 
   * @param playable_name {String} 
   */
  constructor(advertiser_id, playable_id, playable_name) {
    this.advertiser_id = advertiser_id;
    this.playable_id = playable_id;
    this.playable_name = playable_name;
  }

  /**
   * Constructs a <code>PlayableSaveBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PlayableSaveBody} obj Optional instance to populate.
   * @return {module:model/PlayableSaveBody} The populated <code>PlayableSaveBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PlayableSaveBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('playable_id'))
        obj.playable_id = ApiClient.convertToType(data['playable_id'], 'String');
      if (data.hasOwnProperty('playable_name'))
        obj.playable_name = ApiClient.convertToType(data['playable_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
PlayableSaveBody.prototype.advertiser_id = undefined;

/**
 * @member {String} playable_id
 */
PlayableSaveBody.prototype.playable_id = undefined;

/**
 * @member {String} playable_name
 */
PlayableSaveBody.prototype.playable_name = undefined;

