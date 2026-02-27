/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxcreateVideoInfo model module.
 * @module model/CampaigngmvMaxcreateVideoInfo
 * @version 1.2.1
 */
export class CampaigngmvMaxcreateVideoInfo {
  /**
   * Constructs a new <code>CampaigngmvMaxcreateVideoInfo</code>.
   * @alias module:model/CampaigngmvMaxcreateVideoInfo
   * @class
   * @param video_id {String} 
   */
  constructor(video_id) {
    this.video_id = video_id;
  }

  /**
   * Constructs a <code>CampaigngmvMaxcreateVideoInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxcreateVideoInfo} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxcreateVideoInfo} The populated <code>CampaigngmvMaxcreateVideoInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxcreateVideoInfo();
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} video_id
 */
CampaigngmvMaxcreateVideoInfo.prototype.video_id = undefined;

