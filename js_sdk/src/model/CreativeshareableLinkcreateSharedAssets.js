/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeshareableLinkcreateSharedAssets model module.
 * @module model/CreativeshareableLinkcreateSharedAssets
 * @version 1.2.1
 */
export class CreativeshareableLinkcreateSharedAssets {
  /**
   * Constructs a new <code>CreativeshareableLinkcreateSharedAssets</code>.
   * @alias module:model/CreativeshareableLinkcreateSharedAssets
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeshareableLinkcreateSharedAssets</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeshareableLinkcreateSharedAssets} obj Optional instance to populate.
   * @return {module:model/CreativeshareableLinkcreateSharedAssets} The populated <code>CreativeshareableLinkcreateSharedAssets</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeshareableLinkcreateSharedAssets();
      if (data.hasOwnProperty('asset_id'))
        obj.asset_id = ApiClient.convertToType(data['asset_id'], 'String');
      if (data.hasOwnProperty('asset_name'))
        obj.asset_name = ApiClient.convertToType(data['asset_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} asset_id
 */
CreativeshareableLinkcreateSharedAssets.prototype.asset_id = undefined;

/**
 * @member {String} asset_name
 */
CreativeshareableLinkcreateSharedAssets.prototype.asset_name = undefined;

