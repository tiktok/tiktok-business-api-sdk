/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateAdvancedAudioInfo model module.
 * @module model/CreativeportfoliocreateAdvancedAudioInfo
 * @version 1.2.1
 */
export class CreativeportfoliocreateAdvancedAudioInfo {
  /**
   * Constructs a new <code>CreativeportfoliocreateAdvancedAudioInfo</code>.
   * @alias module:model/CreativeportfoliocreateAdvancedAudioInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreateAdvancedAudioInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateAdvancedAudioInfo} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateAdvancedAudioInfo} The populated <code>CreativeportfoliocreateAdvancedAudioInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateAdvancedAudioInfo();
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} video_id
 */
CreativeportfoliocreateAdvancedAudioInfo.prototype.video_id = undefined;

