/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixelTransferBody model module.
 * @module model/PixelTransferBody
 * @version 1.2.1
 */
export class PixelTransferBody {
  /**
   * Constructs a new <code>PixelTransferBody</code>.
   * @alias module:model/PixelTransferBody
   * @class
   * @param bc_id {String} 
   * @param pixel_code {String} 
   */
  constructor(bc_id, pixel_code) {
    this.bc_id = bc_id;
    this.pixel_code = pixel_code;
  }

  /**
   * Constructs a <code>PixelTransferBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelTransferBody} obj Optional instance to populate.
   * @return {module:model/PixelTransferBody} The populated <code>PixelTransferBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelTransferBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('pixel_code'))
        obj.pixel_code = ApiClient.convertToType(data['pixel_code'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
PixelTransferBody.prototype.bc_id = undefined;

/**
 * @member {String} pixel_code
 */
PixelTransferBody.prototype.pixel_code = undefined;

