/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AssetAssignBody model module.
 * @module model/AssetAssignBody
 * @version 0.1.7
 */
export class AssetAssignBody {
  /**
   * Constructs a new <code>AssetAssignBody</code>.
   * @alias module:model/AssetAssignBody
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
   * Constructs a <code>AssetAssignBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetAssignBody} obj Optional instance to populate.
   * @return {module:model/AssetAssignBody} The populated <code>AssetAssignBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetAssignBody();
      if (data.hasOwnProperty('advertiser_role'))
        obj.advertiser_role = ApiClient.convertToType(data['advertiser_role'], 'String');
      if (data.hasOwnProperty('asset_id'))
        obj.asset_id = ApiClient.convertToType(data['asset_id'], 'String');
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_role'))
        obj.catalog_role = ApiClient.convertToType(data['catalog_role'], 'String');
      if (data.hasOwnProperty('form_library_role'))
        obj.form_library_role = ApiClient.convertToType(data['form_library_role'], 'String');
      if (data.hasOwnProperty('store_role'))
        obj.store_role = ApiClient.convertToType(data['store_role'], 'String');
      if (data.hasOwnProperty('tt_account_roles'))
        obj.tt_account_roles = ApiClient.convertToType(data['tt_account_roles'], ['String']);
      if (data.hasOwnProperty('user_id'))
        obj.user_id = ApiClient.convertToType(data['user_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_role
 */
AssetAssignBody.prototype.advertiser_role = undefined;

/**
 * @member {String} asset_id
 */
AssetAssignBody.prototype.asset_id = undefined;

/**
 * @member {String} asset_type
 */
AssetAssignBody.prototype.asset_type = undefined;

/**
 * @member {String} bc_id
 */
AssetAssignBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_role
 */
AssetAssignBody.prototype.catalog_role = undefined;

/**
 * @member {String} form_library_role
 */
AssetAssignBody.prototype.form_library_role = undefined;

/**
 * @member {String} store_role
 */
AssetAssignBody.prototype.store_role = undefined;

/**
 * @member {Array.<String>} tt_account_roles
 */
AssetAssignBody.prototype.tt_account_roles = undefined;

/**
 * @member {String} user_id
 */
AssetAssignBody.prototype.user_id = undefined;

