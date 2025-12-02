/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdAppealBody model module.
 * @module model/SmartPlusAdAppealBody
 * @version 0.1.9
 */
export class SmartPlusAdAppealBody {
  /**
   * Constructs a new <code>SmartPlusAdAppealBody</code>.
   * @alias module:model/SmartPlusAdAppealBody
   * @class
   * @param advertiser_id {String} 
   * @param smart_plus_ad_id {String} 
   */
  constructor(advertiser_id, smart_plus_ad_id) {
    this.advertiser_id = advertiser_id;
    this.smart_plus_ad_id = smart_plus_ad_id;
  }

  /**
   * Constructs a <code>SmartPlusAdAppealBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdAppealBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdAppealBody} The populated <code>SmartPlusAdAppealBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdAppealBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('appeal_reason'))
        obj.appeal_reason = ApiClient.convertToType(data['appeal_reason'], 'String');
      if (data.hasOwnProperty('attachment_list'))
        obj.attachment_list = ApiClient.convertToType(data['attachment_list'], ['String']);
      if (data.hasOwnProperty('smart_plus_ad_id'))
        obj.smart_plus_ad_id = ApiClient.convertToType(data['smart_plus_ad_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SmartPlusAdAppealBody.prototype.advertiser_id = undefined;

/**
 * @member {String} appeal_reason
 */
SmartPlusAdAppealBody.prototype.appeal_reason = undefined;

/**
 * @member {Array.<String>} attachment_list
 */
SmartPlusAdAppealBody.prototype.attachment_list = undefined;

/**
 * @member {String} smart_plus_ad_id
 */
SmartPlusAdAppealBody.prototype.smart_plus_ad_id = undefined;

