/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {BcassetGroupcreateAssets} from './BcassetGroupcreateAssets.js';
import {BcassetGroupcreateMembers} from './BcassetGroupcreateMembers.js';

/**
 * The AssetGroupCreateBody model module.
 * @module model/AssetGroupCreateBody
 * @version 0.1.8
 */
export class AssetGroupCreateBody {
  /**
   * Constructs a new <code>AssetGroupCreateBody</code>.
   * @alias module:model/AssetGroupCreateBody
   * @class
   * @param asset_group_name {String} 
   * @param assets {Array.<module:model/BcassetGroupcreateAssets>} 
   * @param bc_id {String} 
   * @param members {Array.<module:model/BcassetGroupcreateMembers>} 
   */
  constructor(asset_group_name, assets, bc_id, members) {
    this.asset_group_name = asset_group_name;
    this.assets = assets;
    this.bc_id = bc_id;
    this.members = members;
  }

  /**
   * Constructs a <code>AssetGroupCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetGroupCreateBody} obj Optional instance to populate.
   * @return {module:model/AssetGroupCreateBody} The populated <code>AssetGroupCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetGroupCreateBody();
      if (data.hasOwnProperty('asset_group_name'))
        obj.asset_group_name = ApiClient.convertToType(data['asset_group_name'], 'String');
      if (data.hasOwnProperty('assets'))
        obj.assets = ApiClient.convertToType(data['assets'], [BcassetGroupcreateAssets]);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('members'))
        obj.members = ApiClient.convertToType(data['members'], [BcassetGroupcreateMembers]);
    }
    return obj;
  }
}

/**
 * @member {String} asset_group_name
 */
AssetGroupCreateBody.prototype.asset_group_name = undefined;

/**
 * @member {Array.<module:model/BcassetGroupcreateAssets>} assets
 */
AssetGroupCreateBody.prototype.assets = undefined;

/**
 * @member {String} bc_id
 */
AssetGroupCreateBody.prototype.bc_id = undefined;

/**
 * @member {Array.<module:model/BcassetGroupcreateMembers>} members
 */
AssetGroupCreateBody.prototype.members = undefined;

