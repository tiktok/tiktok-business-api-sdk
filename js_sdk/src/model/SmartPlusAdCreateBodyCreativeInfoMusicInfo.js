/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyCreativeInfoMusicInfo model module.
 * @module model/SmartPlusAdCreateBodyCreativeInfoMusicInfo
 * @version 0.1.9
 */
export class SmartPlusAdCreateBodyCreativeInfoMusicInfo {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyCreativeInfoMusicInfo</code>.
   * @alias module:model/SmartPlusAdCreateBodyCreativeInfoMusicInfo
   * @class
   * @param music_id {String} 
   */
  constructor(music_id) {
    this.music_id = music_id;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyCreativeInfoMusicInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyCreativeInfoMusicInfo} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyCreativeInfoMusicInfo} The populated <code>SmartPlusAdCreateBodyCreativeInfoMusicInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyCreativeInfoMusicInfo();
      if (data.hasOwnProperty('music_id'))
        obj.music_id = ApiClient.convertToType(data['music_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} music_id
 */
SmartPlusAdCreateBodyCreativeInfoMusicInfo.prototype.music_id = undefined;

