/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CommentDeleteBody model module.
 * @module model/CommentDeleteBody
 * @version 1.2.1
 */
export class CommentDeleteBody {
  /**
   * Constructs a new <code>CommentDeleteBody</code>.
   * @alias module:model/CommentDeleteBody
   * @class
   * @param ad_id {String} 
   * @param advertiser_id {String} 
   * @param comment_id {String} 
   * @param identity_id {String} 
   * @param identity_type {String} 
   * @param tiktok_item_id {String} 
   */
  constructor(ad_id, advertiser_id, comment_id, identity_id, identity_type, tiktok_item_id) {
    this.ad_id = ad_id;
    this.advertiser_id = advertiser_id;
    this.comment_id = comment_id;
    this.identity_id = identity_id;
    this.identity_type = identity_type;
    this.tiktok_item_id = tiktok_item_id;
  }

  /**
   * Constructs a <code>CommentDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CommentDeleteBody} obj Optional instance to populate.
   * @return {module:model/CommentDeleteBody} The populated <code>CommentDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CommentDeleteBody();
      if (data.hasOwnProperty('ad_id'))
        obj.ad_id = ApiClient.convertToType(data['ad_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('comment_id'))
        obj.comment_id = ApiClient.convertToType(data['comment_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('tiktok_item_id'))
        obj.tiktok_item_id = ApiClient.convertToType(data['tiktok_item_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} ad_id
 */
CommentDeleteBody.prototype.ad_id = undefined;

/**
 * @member {String} advertiser_id
 */
CommentDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {String} comment_id
 */
CommentDeleteBody.prototype.comment_id = undefined;

/**
 * @member {String} identity_id
 */
CommentDeleteBody.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
CommentDeleteBody.prototype.identity_type = undefined;

/**
 * @member {String} tiktok_item_id
 */
CommentDeleteBody.prototype.tiktok_item_id = undefined;

