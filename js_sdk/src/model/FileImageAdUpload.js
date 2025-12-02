/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FileImageAdUpload model module.
 * @module model/FileImageAdUpload
 * @version 0.1.9
 */
export class FileImageAdUpload {
  /**
   * Constructs a new <code>FileImageAdUpload</code>.
   * @alias module:model/FileImageAdUpload
   * @class
   * @param advertiser_id {String} Advertiser ID
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>FileImageAdUpload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FileImageAdUpload} obj Optional instance to populate.
   * @return {module:model/FileImageAdUpload} The populated <code>FileImageAdUpload</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FileImageAdUpload();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('file_id'))
        obj.file_id = ApiClient.convertToType(data['file_id'], 'String');
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('image_file'))
        obj.image_file = ApiClient.convertToType(data['image_file'], 'Blob');
      if (data.hasOwnProperty('image_signature'))
        obj.image_signature = ApiClient.convertToType(data['image_signature'], 'String');
      if (data.hasOwnProperty('image_url'))
        obj.image_url = ApiClient.convertToType(data['image_url'], 'String');
      if (data.hasOwnProperty('upload_type'))
        obj.upload_type = ApiClient.convertToType(data['upload_type'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
FileImageAdUpload.prototype.advertiser_id = undefined;

/**
 * The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID.
 * @member {String} file_id
 */
FileImageAdUpload.prototype.file_id = undefined;

/**
 * Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off.
 * @member {String} file_name
 */
FileImageAdUpload.prototype.file_name = undefined;

/**
 * Picture file, required when upload_type is UPLOAD_BY_FILE.
 * @member {Blob} image_file
 */
FileImageAdUpload.prototype.image_file = undefined;

/**
 * Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE.
 * @member {String} image_signature
 */
FileImageAdUpload.prototype.image_signature = undefined;

/**
 * Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL.
 * @member {String} image_url
 */
FileImageAdUpload.prototype.image_url = undefined;

/**
 * Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID.
 * @member {String} upload_type
 */
FileImageAdUpload.prototype.upload_type = undefined;

