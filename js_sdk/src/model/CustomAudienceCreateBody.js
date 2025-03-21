/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CustomAudienceCreateBody model module.
 * @module model/CustomAudienceCreateBody
 * @version 0.1.5
 */
export class CustomAudienceCreateBody {
  /**
   * Constructs a new <code>CustomAudienceCreateBody</code>.
   * @alias module:model/CustomAudienceCreateBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param calculate_type {String} Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type.
   * @param custom_audience_name {String} Audience name. Maximum of 128 characters.
   * @param file_paths {Array.<String>} List of file paths. The recommended size is <50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint.
   */
  constructor(advertiser_id, calculate_type, custom_audience_name, file_paths) {
    this.advertiser_id = advertiser_id;
    this.calculate_type = calculate_type;
    this.custom_audience_name = custom_audience_name;
    this.file_paths = file_paths;
  }

  /**
   * Constructs a <code>CustomAudienceCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAudienceCreateBody} obj Optional instance to populate.
   * @return {module:model/CustomAudienceCreateBody} The populated <code>CustomAudienceCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomAudienceCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('audience_enhancement'))
        obj.audience_enhancement = ApiClient.convertToType(data['audience_enhancement'], 'Boolean');
      if (data.hasOwnProperty('audience_sub_type'))
        obj.audience_sub_type = ApiClient.convertToType(data['audience_sub_type'], 'String');
      if (data.hasOwnProperty('calculate_type'))
        obj.calculate_type = ApiClient.convertToType(data['calculate_type'], 'String');
      if (data.hasOwnProperty('custom_audience_name'))
        obj.custom_audience_name = ApiClient.convertToType(data['custom_audience_name'], 'String');
      if (data.hasOwnProperty('file_paths'))
        obj.file_paths = ApiClient.convertToType(data['file_paths'], ['String']);
      if (data.hasOwnProperty('retention_in_days'))
        obj.retention_in_days = ApiClient.convertToType(data['retention_in_days'], 'Number');
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
CustomAudienceCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} audience_enhancement
 * @default false
 */
CustomAudienceCreateBody.prototype.audience_enhancement = false;

/**
 * Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL Normal audience. It can be used in non-R&F ads. REACH_FREQUENCY: Audience for Reach & Frequency. It can only be used in R&F ads. Default: NORMAL.
 * @member {String} audience_sub_type
 * @default 'NORMAL'
 */
CustomAudienceCreateBody.prototype.audience_sub_type = 'NORMAL';

/**
 * Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type.
 * @member {String} calculate_type
 */
CustomAudienceCreateBody.prototype.calculate_type = undefined;

/**
 * Audience name. Maximum of 128 characters.
 * @member {String} custom_audience_name
 */
CustomAudienceCreateBody.prototype.custom_audience_name = undefined;

/**
 * List of file paths. The recommended size is <50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint.
 * @member {Array.<String>} file_paths
 */
CustomAudienceCreateBody.prototype.file_paths = undefined;

/**
 * Number of days to retain the audience. Value range: [1, 365]. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.
 * @member {Number} retention_in_days
 */
CustomAudienceCreateBody.prototype.retention_in_days = undefined;

