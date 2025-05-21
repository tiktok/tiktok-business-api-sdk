/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdUploadBody model module.
 * @module model/AdUploadBody
 * @version 0.1.7
 */
export class AdUploadBody {
  /**
   * Constructs a new <code>AdUploadBody</code>.
   * @alias module:model/AdUploadBody
   * @class
   * @param advertiser_id {String} Advertiser ID
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>AdUploadBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdUploadBody} obj Optional instance to populate.
   * @return {module:model/AdUploadBody} The populated <code>AdUploadBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdUploadBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('auto_bind_enabled'))
        obj.auto_bind_enabled = ApiClient.convertToType(data['auto_bind_enabled'], 'Boolean');
      if (data.hasOwnProperty('auto_fix_enabled'))
        obj.auto_fix_enabled = ApiClient.convertToType(data['auto_fix_enabled'], 'Boolean');
      if (data.hasOwnProperty('file_id'))
        obj.file_id = ApiClient.convertToType(data['file_id'], 'String');
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('flaw_detect'))
        obj.flaw_detect = ApiClient.convertToType(data['flaw_detect'], 'Boolean');
      if (data.hasOwnProperty('is_third_party'))
        obj.is_third_party = ApiClient.convertToType(data['is_third_party'], 'Boolean');
      if (data.hasOwnProperty('upload_type'))
        obj.upload_type = ApiClient.convertToType(data['upload_type'], 'String');
      if (data.hasOwnProperty('video_file'))
        obj.video_file = ApiClient.convertToType(data['video_file'], 'Blob');
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
      if (data.hasOwnProperty('video_signature'))
        obj.video_signature = ApiClient.convertToType(data['video_signature'], 'String');
      if (data.hasOwnProperty('video_url'))
        obj.video_url = ApiClient.convertToType(data['video_url'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
AdUploadBody.prototype.advertiser_id = undefined;

/**
 * Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect = True and auto_fix_enabled = True.
 * @member {Boolean} auto_bind_enabled
 */
AdUploadBody.prototype.auto_bind_enabled = undefined;

/**
 * Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled = False, then well return an error message with flaw types indicated. \\n auto_fix_enabled =True, then well automatically fix all the issues and return fix_task_id and flaw_types.
 * @member {Boolean} auto_fix_enabled
 */
AdUploadBody.prototype.auto_fix_enabled = undefined;

/**
 * The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID.
 * @member {String} file_id
 */
AdUploadBody.prototype.file_id = undefined;

/**
 * Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again.
 * @member {String} file_name
 */
AdUploadBody.prototype.file_name = undefined;

/**
 * Whether to automatically detect an issue in your video. Default value is False.
 * @member {Boolean} flaw_detect
 */
AdUploadBody.prototype.flaw_detect = undefined;

/**
 * The video is third party or not.
 * @member {Boolean} is_third_party
 */
AdUploadBody.prototype.is_third_party = undefined;

/**
 * Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID.
 * @member {String} upload_type
 */
AdUploadBody.prototype.upload_type = undefined;

/**
 * Video file. Required when upload_type is UPLOAD_BY_FILE.
 * @member {Blob} video_file
 */
AdUploadBody.prototype.video_file = undefined;

/**
 * Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID.
 * @member {String} video_id
 */
AdUploadBody.prototype.video_id = undefined;

/**
 * Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE.
 * @member {String} video_signature
 */
AdUploadBody.prototype.video_signature = undefined;

/**
 * Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file.
 * @member {String} video_url
 */
AdUploadBody.prototype.video_url = undefined;

