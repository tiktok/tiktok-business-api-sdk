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
 * The AssetGroupUpdateBody model module.
 * @module model/AssetGroupUpdateBody
 * @version 0.1.8
 */
export class AssetGroupUpdateBody {
  /**
   * Constructs a new <code>AssetGroupUpdateBody</code>.
   * @alias module:model/AssetGroupUpdateBody
   * @class
   * @param asset_group_id {String} 
   * @param bc_id {String} 
   * @param update_entity {String} 
   */
  constructor(asset_group_id, bc_id, update_entity) {
    this.asset_group_id = asset_group_id;
    this.bc_id = bc_id;
    this.update_entity = update_entity;
  }

  /**
   * Constructs a <code>AssetGroupUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetGroupUpdateBody} obj Optional instance to populate.
   * @return {module:model/AssetGroupUpdateBody} The populated <code>AssetGroupUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetGroupUpdateBody();
      if (data.hasOwnProperty('action'))
        obj.action = ApiClient.convertToType(data['action'], 'String');
      if (data.hasOwnProperty('asset_group_id'))
        obj.asset_group_id = ApiClient.convertToType(data['asset_group_id'], 'String');
      if (data.hasOwnProperty('asset_group_name'))
        obj.asset_group_name = ApiClient.convertToType(data['asset_group_name'], 'String');
      if (data.hasOwnProperty('assets'))
        obj.assets = ApiClient.convertToType(data['assets'], [BcassetGroupcreateAssets]);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('members'))
        obj.members = ApiClient.convertToType(data['members'], [BcassetGroupcreateMembers]);
      if (data.hasOwnProperty('update_entity'))
        obj.update_entity = ApiClient.convertToType(data['update_entity'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} action
 */
AssetGroupUpdateBody.prototype.action = undefined;

/**
 * @member {String} asset_group_id
 */
AssetGroupUpdateBody.prototype.asset_group_id = undefined;

/**
 * @member {String} asset_group_name
 */
AssetGroupUpdateBody.prototype.asset_group_name = undefined;

/**
 * @member {Array.<module:model/BcassetGroupcreateAssets>} assets
 */
AssetGroupUpdateBody.prototype.assets = undefined;

/**
 * @member {String} bc_id
 */
AssetGroupUpdateBody.prototype.bc_id = undefined;

/**
 * @member {Array.<module:model/BcassetGroupcreateMembers>} members
 */
AssetGroupUpdateBody.prototype.members = undefined;

/**
 * @member {String} update_entity
 */
AssetGroupUpdateBody.prototype.update_entity = undefined;

