/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AssetShareBody model module.
 * @module model/AssetShareBody
 * @version 0.1.8
 */
export class AssetShareBody {
  /**
   * Constructs a new <code>AssetShareBody</code>.
   * @alias module:model/AssetShareBody
   * @class
   * @param advertiser_id {String} 
   * @param material_ids {Array.<String>} 
   * @param shared_advertiser_ids {Array.<String>} 
   */
  constructor(advertiser_id, material_ids, shared_advertiser_ids) {
    this.advertiser_id = advertiser_id;
    this.material_ids = material_ids;
    this.shared_advertiser_ids = shared_advertiser_ids;
  }

  /**
   * Constructs a <code>AssetShareBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssetShareBody} obj Optional instance to populate.
   * @return {module:model/AssetShareBody} The populated <code>AssetShareBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssetShareBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('material_ids'))
        obj.material_ids = ApiClient.convertToType(data['material_ids'], ['String']);
      if (data.hasOwnProperty('shared_advertiser_ids'))
        obj.shared_advertiser_ids = ApiClient.convertToType(data['shared_advertiser_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
AssetShareBody.prototype.advertiser_id = undefined;

/**
 * @member {String} asset_type
 * @default 'VIDEO'
 */
AssetShareBody.prototype.asset_type = 'VIDEO';

/**
 * @member {Array.<String>} material_ids
 */
AssetShareBody.prototype.material_ids = undefined;

/**
 * @member {Array.<String>} shared_advertiser_ids
 */
AssetShareBody.prototype.shared_advertiser_ids = undefined;

