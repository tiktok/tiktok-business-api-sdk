/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The creativeportfoliocreateAdvancedGestureIcon model module.
 * @module model/creativeportfoliocreateAdvancedGestureIcon
 * @version 0.1.3
 */
export class creativeportfoliocreateAdvancedGestureIcon {
  /**
   * Constructs a new <code>creativeportfoliocreateAdvancedGestureIcon</code>.
   * @alias module:model/creativeportfoliocreateAdvancedGestureIcon
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>creativeportfoliocreateAdvancedGestureIcon</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/creativeportfoliocreateAdvancedGestureIcon} obj Optional instance to populate.
   * @return {module:model/creativeportfoliocreateAdvancedGestureIcon} The populated <code>creativeportfoliocreateAdvancedGestureIcon</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new creativeportfoliocreateAdvancedGestureIcon();
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} image_id
 */
creativeportfoliocreateAdvancedGestureIcon.prototype.image_id = undefined;

