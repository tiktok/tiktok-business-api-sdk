/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxcreateIdentityInfo model module.
 * @module model/CampaigngmvMaxcreateIdentityInfo
 * @version 0.1.8
 */
export class CampaigngmvMaxcreateIdentityInfo {
  /**
   * Constructs a new <code>CampaigngmvMaxcreateIdentityInfo</code>.
   * @alias module:model/CampaigngmvMaxcreateIdentityInfo
   * @class
   * @param identity_id {String} 
   * @param identity_type {String} 
   */
  constructor(identity_id, identity_type) {
    this.identity_id = identity_id;
    this.identity_type = identity_type;
  }

  /**
   * Constructs a <code>CampaigngmvMaxcreateIdentityInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxcreateIdentityInfo} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxcreateIdentityInfo} The populated <code>CampaigngmvMaxcreateIdentityInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxcreateIdentityInfo();
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_authorized_shop_id'))
        obj.identity_authorized_shop_id = ApiClient.convertToType(data['identity_authorized_shop_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} identity_authorized_bc_id
 */
CampaigngmvMaxcreateIdentityInfo.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_authorized_shop_id
 */
CampaigngmvMaxcreateIdentityInfo.prototype.identity_authorized_shop_id = undefined;

/**
 * @member {String} identity_id
 */
CampaigngmvMaxcreateIdentityInfo.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
CampaigngmvMaxcreateIdentityInfo.prototype.identity_type = undefined;

/**
 * @member {String} store_id
 */
CampaigngmvMaxcreateIdentityInfo.prototype.store_id = undefined;

