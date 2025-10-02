/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdCreateBodyCreativeInfoImageInfo} from './SmartPlusAdCreateBodyCreativeInfoImageInfo.js';
import {SmartPlusAdCreateBodyCreativeInfoMusicInfo} from './SmartPlusAdCreateBodyCreativeInfoMusicInfo.js';
import {SmartPlusAdCreateBodyCreativeInfoVideoInfo} from './SmartPlusAdCreateBodyCreativeInfoVideoInfo.js';

/**
 * The SmartPlusAdCreateBodyCreativeInfo model module.
 * @module model/SmartPlusAdCreateBodyCreativeInfo
 * @version 0.1.8
 */
export class SmartPlusAdCreateBodyCreativeInfo {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyCreativeInfo</code>.
   * @alias module:model/SmartPlusAdCreateBodyCreativeInfo
   * @class
   * @param ad_format {String} 
   */
  constructor(ad_format) {
    this.ad_format = ad_format;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyCreativeInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyCreativeInfo} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyCreativeInfo} The populated <code>SmartPlusAdCreateBodyCreativeInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyCreativeInfo();
      if (data.hasOwnProperty('ad_format'))
        obj.ad_format = ApiClient.convertToType(data['ad_format'], 'String');
      if (data.hasOwnProperty('aigc_disclosure_type'))
        obj.aigc_disclosure_type = ApiClient.convertToType(data['aigc_disclosure_type'], 'String');
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('image_info'))
        obj.image_info = ApiClient.convertToType(data['image_info'], [SmartPlusAdCreateBodyCreativeInfoImageInfo]);
      if (data.hasOwnProperty('music_info'))
        obj.music_info = SmartPlusAdCreateBodyCreativeInfoMusicInfo.constructFromObject(data['music_info']);
      if (data.hasOwnProperty('tiktok_item_id'))
        obj.tiktok_item_id = ApiClient.convertToType(data['tiktok_item_id'], 'String');
      if (data.hasOwnProperty('video_info'))
        obj.video_info = SmartPlusAdCreateBodyCreativeInfoVideoInfo.constructFromObject(data['video_info']);
    }
    return obj;
  }
}

/**
 * @member {String} ad_format
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.ad_format = undefined;

/**
 * @member {String} aigc_disclosure_type
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.aigc_disclosure_type = undefined;

/**
 * @member {String} identity_authorized_bc_id
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_id
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.identity_type = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyCreativeInfoImageInfo>} image_info
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.image_info = undefined;

/**
 * @member {module:model/SmartPlusAdCreateBodyCreativeInfoMusicInfo} music_info
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.music_info = undefined;

/**
 * @member {String} tiktok_item_id
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.tiktok_item_id = undefined;

/**
 * @member {module:model/SmartPlusAdCreateBodyCreativeInfoVideoInfo} video_info
 */
SmartPlusAdCreateBodyCreativeInfo.prototype.video_info = undefined;

