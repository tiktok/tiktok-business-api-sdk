/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The MaterialStatusUpdateBody model module.
 * @module model/MaterialStatusUpdateBody
 * @version 0.1.9
 */
export class MaterialStatusUpdateBody {
  /**
   * Constructs a new <code>MaterialStatusUpdateBody</code>.
   * @alias module:model/MaterialStatusUpdateBody
   * @class
   * @param ad_group_id {String} Adgroup ID
   * @param advertiser_id {String} Advertiser ID
   * @param material_ids {Array.<String>} Material ID
   * @param material_status {String} Material status
   */
  constructor(ad_group_id, advertiser_id, material_ids, material_status) {
    this.ad_group_id = ad_group_id;
    this.advertiser_id = advertiser_id;
    this.material_ids = material_ids;
    this.material_status = material_status;
  }

  /**
   * Constructs a <code>MaterialStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MaterialStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/MaterialStatusUpdateBody} The populated <code>MaterialStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MaterialStatusUpdateBody();
      if (data.hasOwnProperty('ad_group_id'))
        obj.ad_group_id = ApiClient.convertToType(data['ad_group_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('material_ids'))
        obj.material_ids = ApiClient.convertToType(data['material_ids'], ['String']);
      if (data.hasOwnProperty('material_status'))
        obj.material_status = ApiClient.convertToType(data['material_status'], 'String');
    }
    return obj;
  }
}

/**
 * Adgroup ID
 * @member {String} ad_group_id
 */
MaterialStatusUpdateBody.prototype.ad_group_id = undefined;

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
MaterialStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * Material ID
 * @member {Array.<String>} material_ids
 */
MaterialStatusUpdateBody.prototype.material_ids = undefined;

/**
 * Material status
 * @member {String} material_status
 */
MaterialStatusUpdateBody.prototype.material_status = undefined;

