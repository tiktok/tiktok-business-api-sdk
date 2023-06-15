/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The AdAcoBodyMediaInfoVideoInfo model module.
 * @module model/AdAcoBodyMediaInfoVideoInfo
 * @version 0.1.1
 */
export class AdAcoBodyMediaInfoVideoInfo {
  /**
   * Constructs a new <code>AdAcoBodyMediaInfoVideoInfo</code>.
   * Video information, required when the material type is video.
   * @alias module:model/AdAcoBodyMediaInfoVideoInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyMediaInfoVideoInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyMediaInfoVideoInfo} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyMediaInfoVideoInfo} The populated <code>AdAcoBodyMediaInfoVideoInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyMediaInfoVideoInfo();
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
    }
    return obj;
  }
}

/**
 * Video name.
 * @member {String} file_name
 */
AdAcoBodyMediaInfoVideoInfo.prototype.file_name = undefined;

/**
 * Video ID. You can get the video ID when you upload a video using the [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449) endpoint. To ensure a smooth integration journey, we recommned that you use [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449)(`upload_type` = `UPLOAD_BY_VIDEO_ID`)to bind video ID with your advertiser ID.
 * @member {String} video_id
 */
AdAcoBodyMediaInfoVideoInfo.prototype.video_id = undefined;

