/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdMaterialStatusUpdateBody model module.
 * @module model/SmartPlusAdMaterialStatusUpdateBody
 * @version 0.1.9
 */
export class SmartPlusAdMaterialStatusUpdateBody {
  /**
   * Constructs a new <code>SmartPlusAdMaterialStatusUpdateBody</code>.
   * @alias module:model/SmartPlusAdMaterialStatusUpdateBody
   * @class
   * @param ad_material_ids {Array.<String>} 
   * @param advertiser_id {String} 
   * @param operation_status {String} 
   * @param smart_plus_ad_id {String} 
   */
  constructor(ad_material_ids, advertiser_id, operation_status, smart_plus_ad_id) {
    this.ad_material_ids = ad_material_ids;
    this.advertiser_id = advertiser_id;
    this.operation_status = operation_status;
    this.smart_plus_ad_id = smart_plus_ad_id;
  }

  /**
   * Constructs a <code>SmartPlusAdMaterialStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdMaterialStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdMaterialStatusUpdateBody} The populated <code>SmartPlusAdMaterialStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdMaterialStatusUpdateBody();
      if (data.hasOwnProperty('ad_material_ids'))
        obj.ad_material_ids = ApiClient.convertToType(data['ad_material_ids'], ['String']);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('smart_plus_ad_id'))
        obj.smart_plus_ad_id = ApiClient.convertToType(data['smart_plus_ad_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} ad_material_ids
 */
SmartPlusAdMaterialStatusUpdateBody.prototype.ad_material_ids = undefined;

/**
 * @member {String} advertiser_id
 */
SmartPlusAdMaterialStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} operation_status
 */
SmartPlusAdMaterialStatusUpdateBody.prototype.operation_status = undefined;

/**
 * @member {String} smart_plus_ad_id
 */
SmartPlusAdMaterialStatusUpdateBody.prototype.smart_plus_ad_id = undefined;

