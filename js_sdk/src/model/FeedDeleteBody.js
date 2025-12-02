/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FeedDeleteBody model module.
 * @module model/FeedDeleteBody
 * @version 0.1.9
 */
export class FeedDeleteBody {
  /**
   * Constructs a new <code>FeedDeleteBody</code>.
   * @alias module:model/FeedDeleteBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param feed_id {String} 
   */
  constructor(bc_id, catalog_id, feed_id) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.feed_id = feed_id;
  }

  /**
   * Constructs a <code>FeedDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FeedDeleteBody} obj Optional instance to populate.
   * @return {module:model/FeedDeleteBody} The populated <code>FeedDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FeedDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('feed_id'))
        obj.feed_id = ApiClient.convertToType(data['feed_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
FeedDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
FeedDeleteBody.prototype.catalog_id = undefined;

/**
 * @member {String} feed_id
 */
FeedDeleteBody.prototype.feed_id = undefined;

