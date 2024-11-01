/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13creativeportfoliocreateAdvancedGestureIcon model module.
 * @module model/OpenApiv13creativeportfoliocreateAdvancedGestureIcon
 * @version 0.1.2
 */
export class OpenApiv13creativeportfoliocreateAdvancedGestureIcon {
  /**
   * Constructs a new <code>OpenApiv13creativeportfoliocreateAdvancedGestureIcon</code>.
   * @alias module:model/OpenApiv13creativeportfoliocreateAdvancedGestureIcon
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13creativeportfoliocreateAdvancedGestureIcon</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13creativeportfoliocreateAdvancedGestureIcon} obj Optional instance to populate.
   * @return {module:model/OpenApiv13creativeportfoliocreateAdvancedGestureIcon} The populated <code>OpenApiv13creativeportfoliocreateAdvancedGestureIcon</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13creativeportfoliocreateAdvancedGestureIcon();
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} image_id
 */
OpenApiv13creativeportfoliocreateAdvancedGestureIcon.prototype.image_id = undefined;

