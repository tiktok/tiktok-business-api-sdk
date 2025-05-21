/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateAdvancedGestureImage model module.
 * @module model/CreativeportfoliocreateAdvancedGestureImage
 * @version 0.1.7
 */
export class CreativeportfoliocreateAdvancedGestureImage {
  /**
   * Constructs a new <code>CreativeportfoliocreateAdvancedGestureImage</code>.
   * @alias module:model/CreativeportfoliocreateAdvancedGestureImage
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreateAdvancedGestureImage</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateAdvancedGestureImage} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateAdvancedGestureImage} The populated <code>CreativeportfoliocreateAdvancedGestureImage</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateAdvancedGestureImage();
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} image_id
 */
CreativeportfoliocreateAdvancedGestureImage.prototype.image_id = undefined;

