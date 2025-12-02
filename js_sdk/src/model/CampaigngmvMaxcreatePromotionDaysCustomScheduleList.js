/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxcreatePromotionDaysCustomScheduleList model module.
 * @module model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList
 * @version 0.1.9
 */
export class CampaigngmvMaxcreatePromotionDaysCustomScheduleList {
  /**
   * Constructs a new <code>CampaigngmvMaxcreatePromotionDaysCustomScheduleList</code>.
   * @alias module:model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList
   * @class
   * @param end_date {String} 
   * @param start_date {String} 
   */
  constructor(end_date, start_date) {
    this.end_date = end_date;
    this.start_date = start_date;
  }

  /**
   * Constructs a <code>CampaigngmvMaxcreatePromotionDaysCustomScheduleList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList} The populated <code>CampaigngmvMaxcreatePromotionDaysCustomScheduleList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxcreatePromotionDaysCustomScheduleList();
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
CampaigngmvMaxcreatePromotionDaysCustomScheduleList.prototype.end_date = undefined;

/**
 * @member {String} schedule_type
 * @default 'STARTEND'
 */
CampaigngmvMaxcreatePromotionDaysCustomScheduleList.prototype.schedule_type = 'STARTEND';

/**
 * @member {String} start_date
 */
CampaigngmvMaxcreatePromotionDaysCustomScheduleList.prototype.start_date = undefined;

