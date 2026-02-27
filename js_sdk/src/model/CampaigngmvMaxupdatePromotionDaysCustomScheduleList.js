/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxupdatePromotionDaysCustomScheduleList model module.
 * @module model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList
 * @version 1.2.1
 */
export class CampaigngmvMaxupdatePromotionDaysCustomScheduleList {
  /**
   * Constructs a new <code>CampaigngmvMaxupdatePromotionDaysCustomScheduleList</code>.
   * @alias module:model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxupdatePromotionDaysCustomScheduleList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList} The populated <code>CampaigngmvMaxupdatePromotionDaysCustomScheduleList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxupdatePromotionDaysCustomScheduleList();
      if (data.hasOwnProperty('end_date'))
        obj.end_date = ApiClient.convertToType(data['end_date'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.start_date = ApiClient.convertToType(data['start_date'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} end_date
 */
CampaigngmvMaxupdatePromotionDaysCustomScheduleList.prototype.end_date = undefined;

/**
 * @member {String} schedule_type
 * @default 'STARTEND'
 */
CampaigngmvMaxupdatePromotionDaysCustomScheduleList.prototype.schedule_type = 'STARTEND';

/**
 * @member {String} start_date
 */
CampaigngmvMaxupdatePromotionDaysCustomScheduleList.prototype.start_date = undefined;

