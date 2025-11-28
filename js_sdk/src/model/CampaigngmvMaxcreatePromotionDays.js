/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxcreatePromotionDaysCustomScheduleList} from './CampaigngmvMaxcreatePromotionDaysCustomScheduleList.js';

/**
 * The CampaigngmvMaxcreatePromotionDays model module.
 * @module model/CampaigngmvMaxcreatePromotionDays
 * @version 0.1.8
 */
export class CampaigngmvMaxcreatePromotionDays {
  /**
   * Constructs a new <code>CampaigngmvMaxcreatePromotionDays</code>.
   * @alias module:model/CampaigngmvMaxcreatePromotionDays
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxcreatePromotionDays</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxcreatePromotionDays} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxcreatePromotionDays} The populated <code>CampaigngmvMaxcreatePromotionDays</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxcreatePromotionDays();
      if (data.hasOwnProperty('auto_schedule_enabled'))
        obj.auto_schedule_enabled = ApiClient.convertToType(data['auto_schedule_enabled'], 'Boolean');
      if (data.hasOwnProperty('custom_schedule_list'))
        obj.custom_schedule_list = ApiClient.convertToType(data['custom_schedule_list'], [CampaigngmvMaxcreatePromotionDaysCustomScheduleList]);
      if (data.hasOwnProperty('is_enabled'))
        obj.is_enabled = ApiClient.convertToType(data['is_enabled'], 'Boolean');
      if (data.hasOwnProperty('roas_bid_multiplier'))
        obj.roas_bid_multiplier = ApiClient.convertToType(data['roas_bid_multiplier'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Boolean} auto_schedule_enabled
 * @default true
 */
CampaigngmvMaxcreatePromotionDays.prototype.auto_schedule_enabled = true;

/**
 * @member {Array.<module:model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList>} custom_schedule_list
 */
CampaigngmvMaxcreatePromotionDays.prototype.custom_schedule_list = undefined;

/**
 * @member {Boolean} is_enabled
 * @default true
 */
CampaigngmvMaxcreatePromotionDays.prototype.is_enabled = true;

/**
 * @member {Number} roas_bid_multiplier
 * @default 90
 */
CampaigngmvMaxcreatePromotionDays.prototype.roas_bid_multiplier = 90;

