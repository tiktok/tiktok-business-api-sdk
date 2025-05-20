/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PlayableUploadBody model module.
 * @module model/PlayableUploadBody
 * @version 0.1.7
 */
export class PlayableUploadBody {
  /**
   * Constructs a new <code>PlayableUploadBody</code>.
   * @alias module:model/PlayableUploadBody
   * @class
   * @param advertiser_id {String} 
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>PlayableUploadBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PlayableUploadBody} obj Optional instance to populate.
   * @return {module:model/PlayableUploadBody} The populated <code>PlayableUploadBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PlayableUploadBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('file_id'))
        obj.file_id = ApiClient.convertToType(data['file_id'], 'String');
      if (data.hasOwnProperty('playable_package'))
        obj.playable_package = ApiClient.convertToType(data['playable_package'], 'Blob');
      if (data.hasOwnProperty('upload_type'))
        obj.upload_type = ApiClient.convertToType(data['upload_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
PlayableUploadBody.prototype.advertiser_id = undefined;

/**
 * @member {String} file_id
 */
PlayableUploadBody.prototype.file_id = undefined;

/**
 * @member {Blob} playable_package
 */
PlayableUploadBody.prototype.playable_package = undefined;

/**
 * @member {String} upload_type
 */
PlayableUploadBody.prototype.upload_type = undefined;

