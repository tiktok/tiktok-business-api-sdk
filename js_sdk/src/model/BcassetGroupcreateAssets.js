/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcassetGroupcreateAssets model module.
 * @module model/BcassetGroupcreateAssets
 * @version 1.2.1
 */
export class BcassetGroupcreateAssets {
  /**
   * Constructs a new <code>BcassetGroupcreateAssets</code>.
   * @alias module:model/BcassetGroupcreateAssets
   * @class
   * @param asset_id {String} 
   */
  constructor(asset_id) {
    this.asset_id = asset_id;
  }

  /**
   * Constructs a <code>BcassetGroupcreateAssets</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcassetGroupcreateAssets} obj Optional instance to populate.
   * @return {module:model/BcassetGroupcreateAssets} The populated <code>BcassetGroupcreateAssets</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcassetGroupcreateAssets();
      if (data.hasOwnProperty('asset_id'))
        obj.asset_id = ApiClient.convertToType(data['asset_id'], 'String');
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} asset_id
 */
BcassetGroupcreateAssets.prototype.asset_id = undefined;

/**
 * @member {String} asset_type
 * @default 'ADVERTISER'
 */
BcassetGroupcreateAssets.prototype.asset_type = 'ADVERTISER';

