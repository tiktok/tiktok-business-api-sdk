/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PlayableDeleteBody model module.
 * @module model/PlayableDeleteBody
 * @version 0.1.9
 */
export class PlayableDeleteBody {
  /**
   * Constructs a new <code>PlayableDeleteBody</code>.
   * @alias module:model/PlayableDeleteBody
   * @class
   * @param advertiser_id {String} 
   * @param playable_id {String} 
   */
  constructor(advertiser_id, playable_id) {
    this.advertiser_id = advertiser_id;
    this.playable_id = playable_id;
  }

  /**
   * Constructs a <code>PlayableDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PlayableDeleteBody} obj Optional instance to populate.
   * @return {module:model/PlayableDeleteBody} The populated <code>PlayableDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PlayableDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('playable_id'))
        obj.playable_id = ApiClient.convertToType(data['playable_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
PlayableDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {String} playable_id
 */
PlayableDeleteBody.prototype.playable_id = undefined;

