/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxupdatePromotionDaysCustomScheduleList} from './CampaigngmvMaxupdatePromotionDaysCustomScheduleList.js';

/**
 * The CampaigngmvMaxupdatePromotionDays model module.
 * @module model/CampaigngmvMaxupdatePromotionDays
 * @version 1.2.1
 */
export class CampaigngmvMaxupdatePromotionDays {
  /**
   * Constructs a new <code>CampaigngmvMaxupdatePromotionDays</code>.
   * @alias module:model/CampaigngmvMaxupdatePromotionDays
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxupdatePromotionDays</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxupdatePromotionDays} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxupdatePromotionDays} The populated <code>CampaigngmvMaxupdatePromotionDays</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxupdatePromotionDays();
      if (data.hasOwnProperty('auto_schedule_enabled'))
        obj.auto_schedule_enabled = ApiClient.convertToType(data['auto_schedule_enabled'], 'Boolean');
      if (data.hasOwnProperty('custom_schedule_list'))
        obj.custom_schedule_list = ApiClient.convertToType(data['custom_schedule_list'], [CampaigngmvMaxupdatePromotionDaysCustomScheduleList]);
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
 */
CampaigngmvMaxupdatePromotionDays.prototype.auto_schedule_enabled = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList>} custom_schedule_list
 */
CampaigngmvMaxupdatePromotionDays.prototype.custom_schedule_list = undefined;

/**
 * @member {Boolean} is_enabled
 */
CampaigngmvMaxupdatePromotionDays.prototype.is_enabled = undefined;

/**
 * @member {Number} roas_bid_multiplier
 */
CampaigngmvMaxupdatePromotionDays.prototype.roas_bid_multiplier = undefined;

