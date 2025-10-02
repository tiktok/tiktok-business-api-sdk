/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CommentPostBody model module.
 * @module model/CommentPostBody
 * @version 0.1.8
 */
export class CommentPostBody {
  /**
   * Constructs a new <code>CommentPostBody</code>.
   * @alias module:model/CommentPostBody
   * @class
   * @param ad_id {String} 
   * @param advertiser_id {String} 
   * @param comment_id {String} 
   * @param comment_type {String} 
   * @param identity_id {String} 
   * @param identity_type {String} 
   * @param text {String} 
   * @param tiktok_item_id {String} 
   */
  constructor(ad_id, advertiser_id, comment_id, comment_type, identity_id, identity_type, text, tiktok_item_id) {
    this.ad_id = ad_id;
    this.advertiser_id = advertiser_id;
    this.comment_id = comment_id;
    this.comment_type = comment_type;
    this.identity_id = identity_id;
    this.identity_type = identity_type;
    this.text = text;
    this.tiktok_item_id = tiktok_item_id;
  }

  /**
   * Constructs a <code>CommentPostBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CommentPostBody} obj Optional instance to populate.
   * @return {module:model/CommentPostBody} The populated <code>CommentPostBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CommentPostBody();
      if (data.hasOwnProperty('ad_id'))
        obj.ad_id = ApiClient.convertToType(data['ad_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('comment_id'))
        obj.comment_id = ApiClient.convertToType(data['comment_id'], 'String');
      if (data.hasOwnProperty('comment_type'))
        obj.comment_type = ApiClient.convertToType(data['comment_type'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('text'))
        obj.text = ApiClient.convertToType(data['text'], 'String');
      if (data.hasOwnProperty('tiktok_item_id'))
        obj.tiktok_item_id = ApiClient.convertToType(data['tiktok_item_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} ad_id
 */
CommentPostBody.prototype.ad_id = undefined;

/**
 * @member {String} advertiser_id
 */
CommentPostBody.prototype.advertiser_id = undefined;

/**
 * @member {String} comment_id
 */
CommentPostBody.prototype.comment_id = undefined;

/**
 * @member {String} comment_type
 */
CommentPostBody.prototype.comment_type = undefined;

/**
 * @member {String} identity_id
 */
CommentPostBody.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
CommentPostBody.prototype.identity_type = undefined;

/**
 * @member {String} text
 */
CommentPostBody.prototype.text = undefined;

/**
 * @member {String} tiktok_item_id
 */
CommentPostBody.prototype.tiktok_item_id = undefined;

