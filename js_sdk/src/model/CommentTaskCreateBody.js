/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CommentTaskCreateBody model module.
 * @module model/CommentTaskCreateBody
 * @version 0.1.7
 */
export class CommentTaskCreateBody {
  /**
   * Constructs a new <code>CommentTaskCreateBody</code>.
   * @alias module:model/CommentTaskCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param end_time {String} 
   * @param search_field {String} 
   * @param search_value {String} 
   * @param start_time {String} 
   */
  constructor(advertiser_id, end_time, search_field, search_value, start_time) {
    this.advertiser_id = advertiser_id;
    this.end_time = end_time;
    this.search_field = search_field;
    this.search_value = search_value;
    this.start_time = start_time;
  }

  /**
   * Constructs a <code>CommentTaskCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CommentTaskCreateBody} obj Optional instance to populate.
   * @return {module:model/CommentTaskCreateBody} The populated <code>CommentTaskCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CommentTaskCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('comment_ids'))
        obj.comment_ids = ApiClient.convertToType(data['comment_ids'], ['String']);
      if (data.hasOwnProperty('comment_status'))
        obj.comment_status = ApiClient.convertToType(data['comment_status'], ['String']);
      if (data.hasOwnProperty('comment_type'))
        obj.comment_type = ApiClient.convertToType(data['comment_type'], ['String']);
      if (data.hasOwnProperty('end_time'))
        obj.end_time = ApiClient.convertToType(data['end_time'], 'String');
      if (data.hasOwnProperty('lang'))
        obj.lang = ApiClient.convertToType(data['lang'], 'String');
      if (data.hasOwnProperty('search_field'))
        obj.search_field = ApiClient.convertToType(data['search_field'], 'String');
      if (data.hasOwnProperty('search_value'))
        obj.search_value = ApiClient.convertToType(data['search_value'], 'String');
      if (data.hasOwnProperty('sort_field'))
        obj.sort_field = ApiClient.convertToType(data['sort_field'], 'String');
      if (data.hasOwnProperty('sort_type'))
        obj.sort_type = ApiClient.convertToType(data['sort_type'], 'String');
      if (data.hasOwnProperty('start_time'))
        obj.start_time = ApiClient.convertToType(data['start_time'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
CommentTaskCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} comment_ids
 */
CommentTaskCreateBody.prototype.comment_ids = undefined;

/**
 * @member {Array.<String>} comment_status
 */
CommentTaskCreateBody.prototype.comment_status = undefined;

/**
 * @member {Array.<String>} comment_type
 */
CommentTaskCreateBody.prototype.comment_type = undefined;

/**
 * @member {String} end_time
 */
CommentTaskCreateBody.prototype.end_time = undefined;

/**
 * @member {String} lang
 * @default 'EN'
 */
CommentTaskCreateBody.prototype.lang = 'EN';

/**
 * @member {String} search_field
 */
CommentTaskCreateBody.prototype.search_field = undefined;

/**
 * @member {String} search_value
 */
CommentTaskCreateBody.prototype.search_value = undefined;

/**
 * @member {String} sort_field
 * @default 'CREATE_TIME'
 */
CommentTaskCreateBody.prototype.sort_field = 'CREATE_TIME';

/**
 * @member {String} sort_type
 * @default 'DESC'
 */
CommentTaskCreateBody.prototype.sort_type = 'DESC';

/**
 * @member {String} start_time
 */
CommentTaskCreateBody.prototype.start_time = undefined;

