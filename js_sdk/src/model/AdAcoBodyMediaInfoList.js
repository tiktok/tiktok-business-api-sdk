/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdAcoBodyMediaInfo} from './AdAcoBodyMediaInfo.js';

/**
 * The AdAcoBodyMediaInfoList model module.
 * @module model/AdAcoBodyMediaInfoList
 * @version 0.1.3
 */
export class AdAcoBodyMediaInfoList {
  /**
   * Constructs a new <code>AdAcoBodyMediaInfoList</code>.
   * @alias module:model/AdAcoBodyMediaInfoList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyMediaInfoList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyMediaInfoList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyMediaInfoList} The populated <code>AdAcoBodyMediaInfoList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyMediaInfoList();
      if (data.hasOwnProperty('media_info'))
        obj.media_info = AdAcoBodyMediaInfo.constructFromObject(data['media_info']);
    }
    return obj;
  }
}

/**
 * @member {module:model/AdAcoBodyMediaInfo} media_info
 */
AdAcoBodyMediaInfoList.prototype.media_info = undefined;

