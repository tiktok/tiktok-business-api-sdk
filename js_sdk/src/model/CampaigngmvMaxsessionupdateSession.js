/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxsessionupdateSession model module.
 * @module model/CampaigngmvMaxsessionupdateSession
 * @version 1.2.1
 */
export class CampaigngmvMaxsessionupdateSession {
  /**
   * Constructs a new <code>CampaigngmvMaxsessionupdateSession</code>.
   * @alias module:model/CampaigngmvMaxsessionupdateSession
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxsessionupdateSession</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxsessionupdateSession} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxsessionupdateSession} The populated <code>CampaigngmvMaxsessionupdateSession</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxsessionupdateSession();
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} budget
 */
CampaigngmvMaxsessionupdateSession.prototype.budget = undefined;

/**
 * @member {String} schedule_end_time
 */
CampaigngmvMaxsessionupdateSession.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
CampaigngmvMaxsessionupdateSession.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
CampaigngmvMaxsessionupdateSession.prototype.schedule_type = undefined;

