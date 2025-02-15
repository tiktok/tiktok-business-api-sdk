/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AssetDeleteBody model module.
 * @module model/AssetDeleteBody
 * @version 0.1.4
 */
export class AssetDeleteBody {
  /**
   * Constructs a new <code>AssetDeleteBody</code>.
   * @alias module:model/AssetDeleteBody
   * @class
   * @param asset_ids {Array.<String>} 
   * @param asset_type {String} 
   * @param bc_id {String} 
   * @param partner_id {String} 
   */
  constructor(asset_ids, asset_type, bc_id, partner_id) {
    this.asset_ids = asset_ids;
    this.asset_type = asset_type;
    this.bc_id = bc_id;
    this.partner_id = partner_id;
  }

  /**
   * Constructs a <code>AssetDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetDeleteBody} obj Optional instance to populate.
   * @return {module:model/AssetDeleteBody} The populated <code>AssetDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetDeleteBody();
      if (data.hasOwnProperty('asset_ids'))
        obj.asset_ids = ApiClient.convertToType(data['asset_ids'], ['String']);
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('partner_id'))
        obj.partner_id = ApiClient.convertToType(data['partner_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} asset_ids
 */
AssetDeleteBody.prototype.asset_ids = undefined;

/**
 * @member {String} asset_type
 */
AssetDeleteBody.prototype.asset_type = undefined;

/**
 * @member {String} bc_id
 */
AssetDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} partner_id
 */
AssetDeleteBody.prototype.partner_id = undefined;

