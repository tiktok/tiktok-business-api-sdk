/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AssetUnassignBody model module.
 * @module model/AssetUnassignBody
 * @version 0.1.8
 */
export class AssetUnassignBody {
  /**
   * Constructs a new <code>AssetUnassignBody</code>.
   * @alias module:model/AssetUnassignBody
   * @class
   * @param asset_id {String} 
   * @param asset_type {String} 
   * @param bc_id {String} 
   * @param user_id {String} 
   */
  constructor(asset_id, asset_type, bc_id, user_id) {
    this.asset_id = asset_id;
    this.asset_type = asset_type;
    this.bc_id = bc_id;
    this.user_id = user_id;
  }

  /**
   * Constructs a <code>AssetUnassignBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetUnassignBody} obj Optional instance to populate.
   * @return {module:model/AssetUnassignBody} The populated <code>AssetUnassignBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetUnassignBody();
      if (data.hasOwnProperty('asset_id'))
        obj.asset_id = ApiClient.convertToType(data['asset_id'], 'String');
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('user_id'))
        obj.user_id = ApiClient.convertToType(data['user_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} asset_id
 */
AssetUnassignBody.prototype.asset_id = undefined;

/**
 * @member {String} asset_type
 */
AssetUnassignBody.prototype.asset_type = undefined;

/**
 * @member {String} bc_id
 */
AssetUnassignBody.prototype.bc_id = undefined;

/**
 * @member {String} user_id
 */
AssetUnassignBody.prototype.user_id = undefined;

