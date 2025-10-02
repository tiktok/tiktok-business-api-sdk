/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PartnerAddBody model module.
 * @module model/PartnerAddBody
 * @version 0.1.8
 */
export class PartnerAddBody {
  /**
   * Constructs a new <code>PartnerAddBody</code>.
   * @alias module:model/PartnerAddBody
   * @class
   * @param asset_type {String} 
   * @param bc_id {String} 
   */
  constructor(asset_type, bc_id) {
    this.asset_type = asset_type;
    this.bc_id = bc_id;
  }

  /**
   * Constructs a <code>PartnerAddBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PartnerAddBody} obj Optional instance to populate.
   * @return {module:model/PartnerAddBody} The populated <code>PartnerAddBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PartnerAddBody();
      if (data.hasOwnProperty('advertiser_role'))
        obj.advertiser_role = ApiClient.convertToType(data['advertiser_role'], 'String');
      if (data.hasOwnProperty('asset_ids'))
        obj.asset_ids = ApiClient.convertToType(data['asset_ids'], ['String']);
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_role'))
        obj.catalog_role = ApiClient.convertToType(data['catalog_role'], 'String');
      if (data.hasOwnProperty('partner_id'))
        obj.partner_id = ApiClient.convertToType(data['partner_id'], 'String');
      if (data.hasOwnProperty('source_child_bc_id'))
        obj.source_child_bc_id = ApiClient.convertToType(data['source_child_bc_id'], 'String');
      if (data.hasOwnProperty('target_child_bc_id'))
        obj.target_child_bc_id = ApiClient.convertToType(data['target_child_bc_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_role
 * @default 'ANALYST'
 */
PartnerAddBody.prototype.advertiser_role = 'ANALYST';

/**
 * @member {Array.<String>} asset_ids
 */
PartnerAddBody.prototype.asset_ids = undefined;

/**
 * @member {String} asset_type
 */
PartnerAddBody.prototype.asset_type = undefined;

/**
 * @member {String} bc_id
 */
PartnerAddBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_role
 * @default 'AD_PROMOTE'
 */
PartnerAddBody.prototype.catalog_role = 'AD_PROMOTE';

/**
 * @member {String} partner_id
 */
PartnerAddBody.prototype.partner_id = undefined;

/**
 * @member {String} source_child_bc_id
 */
PartnerAddBody.prototype.source_child_bc_id = undefined;

/**
 * @member {String} target_child_bc_id
 */
PartnerAddBody.prototype.target_child_bc_id = undefined;

