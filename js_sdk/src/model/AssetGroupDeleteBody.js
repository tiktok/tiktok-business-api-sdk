/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AssetGroupDeleteBody model module.
 * @module model/AssetGroupDeleteBody
 * @version 1.2.1
 */
export class AssetGroupDeleteBody {
  /**
   * Constructs a new <code>AssetGroupDeleteBody</code>.
   * @alias module:model/AssetGroupDeleteBody
   * @class
   * @param asset_group_ids {Array.<String>} 
   * @param bc_id {String} 
   */
  constructor(asset_group_ids, bc_id) {
    this.asset_group_ids = asset_group_ids;
    this.bc_id = bc_id;
  }

  /**
   * Constructs a <code>AssetGroupDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetGroupDeleteBody} obj Optional instance to populate.
   * @return {module:model/AssetGroupDeleteBody} The populated <code>AssetGroupDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetGroupDeleteBody();
      if (data.hasOwnProperty('asset_group_ids'))
        obj.asset_group_ids = ApiClient.convertToType(data['asset_group_ids'], ['String']);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} asset_group_ids
 */
AssetGroupDeleteBody.prototype.asset_group_ids = undefined;

/**
 * @member {String} bc_id
 */
AssetGroupDeleteBody.prototype.bc_id = undefined;

