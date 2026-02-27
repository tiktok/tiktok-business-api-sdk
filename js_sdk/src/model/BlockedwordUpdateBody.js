/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BlockedwordUpdateBody model module.
 * @module model/BlockedwordUpdateBody
 * @version 1.2.1
 */
export class BlockedwordUpdateBody {
  /**
   * Constructs a new <code>BlockedwordUpdateBody</code>.
   * @alias module:model/BlockedwordUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param new_word {String} 
   * @param old_word {String} 
   */
  constructor(advertiser_id, new_word, old_word) {
    this.advertiser_id = advertiser_id;
    this.new_word = new_word;
    this.old_word = old_word;
  }

  /**
   * Constructs a <code>BlockedwordUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BlockedwordUpdateBody} obj Optional instance to populate.
   * @return {module:model/BlockedwordUpdateBody} The populated <code>BlockedwordUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BlockedwordUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('new_word'))
        obj.new_word = ApiClient.convertToType(data['new_word'], 'String');
      if (data.hasOwnProperty('old_word'))
        obj.old_word = ApiClient.convertToType(data['old_word'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
BlockedwordUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} new_word
 */
BlockedwordUpdateBody.prototype.new_word = undefined;

/**
 * @member {String} old_word
 */
BlockedwordUpdateBody.prototype.old_word = undefined;

