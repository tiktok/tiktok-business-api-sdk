/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BlockedwordTaskCreateBody model module.
 * @module model/BlockedwordTaskCreateBody
 * @version 0.1.9
 */
export class BlockedwordTaskCreateBody {
  /**
   * Constructs a new <code>BlockedwordTaskCreateBody</code>.
   * @alias module:model/BlockedwordTaskCreateBody
   * @class
   * @param advertiser_id {String} 
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>BlockedwordTaskCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BlockedwordTaskCreateBody} obj Optional instance to populate.
   * @return {module:model/BlockedwordTaskCreateBody} The populated <code>BlockedwordTaskCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BlockedwordTaskCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('blocked_words'))
        obj.blocked_words = ApiClient.convertToType(data['blocked_words'], ['String']);
      if (data.hasOwnProperty('lang'))
        obj.lang = ApiClient.convertToType(data['lang'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
BlockedwordTaskCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} blocked_words
 */
BlockedwordTaskCreateBody.prototype.blocked_words = undefined;

/**
 * @member {String} lang
 * @default 'EN'
 */
BlockedwordTaskCreateBody.prototype.lang = 'EN';

