/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyCreativeInfoVideoInfo model module.
 * @module model/SmartPlusAdCreateBodyCreativeInfoVideoInfo
 * @version 0.1.9
 */
export class SmartPlusAdCreateBodyCreativeInfoVideoInfo {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyCreativeInfoVideoInfo</code>.
   * @alias module:model/SmartPlusAdCreateBodyCreativeInfoVideoInfo
   * @class
   * @param video_id {String} 
   */
  constructor(video_id) {
    this.video_id = video_id;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyCreativeInfoVideoInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyCreativeInfoVideoInfo} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyCreativeInfoVideoInfo} The populated <code>SmartPlusAdCreateBodyCreativeInfoVideoInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyCreativeInfoVideoInfo();
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} file_name
 */
SmartPlusAdCreateBodyCreativeInfoVideoInfo.prototype.file_name = undefined;

/**
 * @member {String} video_id
 */
SmartPlusAdCreateBodyCreativeInfoVideoInfo.prototype.video_id = undefined;

