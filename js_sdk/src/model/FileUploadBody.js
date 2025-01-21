/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {dmpcustomAudiencefileuploadContextInfo} from './dmpcustomAudiencefileuploadContextInfo.js';

/**
 * The FileUploadBody model module.
 * @module model/FileUploadBody
 * @version 0.1.2
 */
export class FileUploadBody {
  /**
   * Constructs a new <code>FileUploadBody</code>.
   * @alias module:model/FileUploadBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param calculate_type {String} Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type.
   * @param file {Blob} Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt.
   * @param file_signature {String} The file's MD5, which is used for server-side verification.
   */
  constructor(advertiser_id, calculate_type, file, file_signature) {
    this.advertiser_id = advertiser_id;
    this.calculate_type = calculate_type;
    this.file = file;
    this.file_signature = file_signature;
  }

  /**
   * Constructs a <code>FileUploadBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FileUploadBody} obj Optional instance to populate.
   * @return {module:model/FileUploadBody} The populated <code>FileUploadBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FileUploadBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('calculate_type'))
        obj.calculate_type = ApiClient.convertToType(data['calculate_type'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = dmpcustomAudiencefileuploadContextInfo.constructFromObject(data['context_info']);
      if (data.hasOwnProperty('file'))
        obj.file = ApiClient.convertToType(data['file'], 'Blob');
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('file_signature'))
        obj.file_signature = ApiClient.convertToType(data['file_signature'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
FileUploadBody.prototype.advertiser_id = undefined;

/**
 * Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type.
 * @member {String} calculate_type
 */
FileUploadBody.prototype.calculate_type = undefined;

/**
 * @member {module:model/dmpcustomAudiencefileuploadContextInfo} context_info
 */
FileUploadBody.prototype.context_info = undefined;

/**
 * Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt.
 * @member {Blob} file
 */
FileUploadBody.prototype.file = undefined;

/**
 * FileName.
 * @member {String} file_name
 */
FileUploadBody.prototype.file_name = undefined;

/**
 * The file's MD5, which is used for server-side verification.
 * @member {String} file_signature
 */
FileUploadBody.prototype.file_signature = undefined;

