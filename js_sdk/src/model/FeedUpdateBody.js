/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CatalogfeedcreateScheduleParam} from './CatalogfeedcreateScheduleParam.js';

/**
 * The FeedUpdateBody model module.
 * @module model/FeedUpdateBody
 * @version 0.1.7
 */
export class FeedUpdateBody {
  /**
   * Constructs a new <code>FeedUpdateBody</code>.
   * @alias module:model/FeedUpdateBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param feed_id {String} 
   * @param feed_name {String} 
   * @param update_mode {String} 
   */
  constructor(bc_id, catalog_id, feed_id, feed_name, update_mode) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.feed_id = feed_id;
    this.feed_name = feed_name;
    this.update_mode = update_mode;
  }

  /**
   * Constructs a <code>FeedUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FeedUpdateBody} obj Optional instance to populate.
   * @return {module:model/FeedUpdateBody} The populated <code>FeedUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FeedUpdateBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('feed_id'))
        obj.feed_id = ApiClient.convertToType(data['feed_id'], 'String');
      if (data.hasOwnProperty('feed_name'))
        obj.feed_name = ApiClient.convertToType(data['feed_name'], 'String');
      if (data.hasOwnProperty('schedule_param'))
        obj.schedule_param = CatalogfeedcreateScheduleParam.constructFromObject(data['schedule_param']);
      if (data.hasOwnProperty('update_mode'))
        obj.update_mode = ApiClient.convertToType(data['update_mode'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
FeedUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
FeedUpdateBody.prototype.catalog_id = undefined;

/**
 * @member {String} feed_id
 */
FeedUpdateBody.prototype.feed_id = undefined;

/**
 * @member {String} feed_name
 */
FeedUpdateBody.prototype.feed_name = undefined;

/**
 * @member {module:model/CatalogfeedcreateScheduleParam} schedule_param
 */
FeedUpdateBody.prototype.schedule_param = undefined;

/**
 * @member {String} update_mode
 */
FeedUpdateBody.prototype.update_mode = undefined;

