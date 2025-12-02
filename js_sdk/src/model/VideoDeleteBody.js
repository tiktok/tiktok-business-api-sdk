/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The VideoDeleteBody model module.
 * @module model/VideoDeleteBody
 * @version 0.1.9
 */
export class VideoDeleteBody {
  /**
   * Constructs a new <code>VideoDeleteBody</code>.
   * @alias module:model/VideoDeleteBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param catalog_video_ids {Array.<String>} 
   */
  constructor(bc_id, catalog_id, catalog_video_ids) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.catalog_video_ids = catalog_video_ids;
  }

  /**
   * Constructs a <code>VideoDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/VideoDeleteBody} obj Optional instance to populate.
   * @return {module:model/VideoDeleteBody} The populated <code>VideoDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new VideoDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('catalog_video_ids'))
        obj.catalog_video_ids = ApiClient.convertToType(data['catalog_video_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
VideoDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
VideoDeleteBody.prototype.catalog_id = undefined;

/**
 * @member {Array.<String>} catalog_video_ids
 */
VideoDeleteBody.prototype.catalog_video_ids = undefined;

