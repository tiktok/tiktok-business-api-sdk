/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxupdateVideoInfo model module.
 * @module model/CampaigngmvMaxupdateVideoInfo
 * @version 0.1.8
 */
export class CampaigngmvMaxupdateVideoInfo {
  /**
   * Constructs a new <code>CampaigngmvMaxupdateVideoInfo</code>.
   * @alias module:model/CampaigngmvMaxupdateVideoInfo
   * @class
   * @param video_id {String} 
   */
  constructor(video_id) {
    this.video_id = video_id;
  }

  /**
   * Constructs a <code>CampaigngmvMaxupdateVideoInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxupdateVideoInfo} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxupdateVideoInfo} The populated <code>CampaigngmvMaxupdateVideoInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxupdateVideoInfo();
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} video_id
 */
CampaigngmvMaxupdateVideoInfo.prototype.video_id = undefined;

