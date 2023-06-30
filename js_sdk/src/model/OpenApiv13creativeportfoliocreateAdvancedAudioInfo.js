/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The OpenApiv13creativeportfoliocreateAdvancedAudioInfo model module.
 * @module model/OpenApiv13creativeportfoliocreateAdvancedAudioInfo
 * @version 0.1.1
 */
export class OpenApiv13creativeportfoliocreateAdvancedAudioInfo {
  /**
   * Constructs a new <code>OpenApiv13creativeportfoliocreateAdvancedAudioInfo</code>.
   * @alias module:model/OpenApiv13creativeportfoliocreateAdvancedAudioInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13creativeportfoliocreateAdvancedAudioInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13creativeportfoliocreateAdvancedAudioInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13creativeportfoliocreateAdvancedAudioInfo} The populated <code>OpenApiv13creativeportfoliocreateAdvancedAudioInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13creativeportfoliocreateAdvancedAudioInfo();
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} video_id
 */
OpenApiv13creativeportfoliocreateAdvancedAudioInfo.prototype.video_id = undefined;

