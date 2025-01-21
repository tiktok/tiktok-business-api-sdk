/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The creativeportfoliocreateAdvancedAudioInfo model module.
 * @module model/creativeportfoliocreateAdvancedAudioInfo
 * @version 0.1.3
 */
export class creativeportfoliocreateAdvancedAudioInfo {
  /**
   * Constructs a new <code>creativeportfoliocreateAdvancedAudioInfo</code>.
   * @alias module:model/creativeportfoliocreateAdvancedAudioInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>creativeportfoliocreateAdvancedAudioInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/creativeportfoliocreateAdvancedAudioInfo} obj Optional instance to populate.
   * @return {module:model/creativeportfoliocreateAdvancedAudioInfo} The populated <code>creativeportfoliocreateAdvancedAudioInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new creativeportfoliocreateAdvancedAudioInfo();
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} video_id
 */
creativeportfoliocreateAdvancedAudioInfo.prototype.video_id = undefined;

