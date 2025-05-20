/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BlockedwordDeleteBody model module.
 * @module model/BlockedwordDeleteBody
 * @version 0.1.7
 */
export class BlockedwordDeleteBody {
  /**
   * Constructs a new <code>BlockedwordDeleteBody</code>.
   * @alias module:model/BlockedwordDeleteBody
   * @class
   * @param advertiser_id {String} 
   * @param blocked_words {Array.<String>} 
   */
  constructor(advertiser_id, blocked_words) {
    this.advertiser_id = advertiser_id;
    this.blocked_words = blocked_words;
  }

  /**
   * Constructs a <code>BlockedwordDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BlockedwordDeleteBody} obj Optional instance to populate.
   * @return {module:model/BlockedwordDeleteBody} The populated <code>BlockedwordDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BlockedwordDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('blocked_words'))
        obj.blocked_words = ApiClient.convertToType(data['blocked_words'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
BlockedwordDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} blocked_words
 */
BlockedwordDeleteBody.prototype.blocked_words = undefined;

