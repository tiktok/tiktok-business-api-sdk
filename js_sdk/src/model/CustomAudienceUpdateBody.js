/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudienceapplyContextInfo} from './DmpcustomAudienceapplyContextInfo.js';

/**
 * The CustomAudienceUpdateBody model module.
 * @module model/CustomAudienceUpdateBody
 * @version 0.1.3
 */
export class CustomAudienceUpdateBody {
  /**
   * Constructs a new <code>CustomAudienceUpdateBody</code>.
   * @alias module:model/CustomAudienceUpdateBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param custom_audience_id {String} Custom audience ID.
   */
  constructor(advertiser_id, custom_audience_id) {
    this.advertiser_id = advertiser_id;
    this.custom_audience_id = custom_audience_id;
  }

  /**
   * Constructs a <code>CustomAudienceUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAudienceUpdateBody} obj Optional instance to populate.
   * @return {module:model/CustomAudienceUpdateBody} The populated <code>CustomAudienceUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomAudienceUpdateBody();
      if (data.hasOwnProperty('action'))
        obj.action = ApiClient.convertToType(data['action'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('audience_enhancement'))
        obj.audience_enhancement = ApiClient.convertToType(data['audience_enhancement'], 'Boolean');
      if (data.hasOwnProperty('audience_sub_type'))
        obj.audience_sub_type = ApiClient.convertToType(data['audience_sub_type'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = DmpcustomAudienceapplyContextInfo.constructFromObject(data['context_info']);
      if (data.hasOwnProperty('custom_audience_id'))
        obj.custom_audience_id = ApiClient.convertToType(data['custom_audience_id'], 'String');
      if (data.hasOwnProperty('custom_audience_name'))
        obj.custom_audience_name = ApiClient.convertToType(data['custom_audience_name'], 'String');
      if (data.hasOwnProperty('file_paths'))
        obj.file_paths = ApiClient.convertToType(data['file_paths'], ['String']);
    }
    return obj;
  }
}

/**
 * Modification type. This field is valid when file_paths is passed. Enum values: APPEND: Upload files to expand the Customer File audience. Only data not included in the original file will be added. REMOVE: Upload files to remove the Customer File audience. Only the data that coincide with the original file will be removed. REPLACE: Upload files to replace the Customer File audience. All the data in the original file will be replaced. Default value: REPLACE. Note: The APPEND, REMOVE and REPLACE operations will fail if the audience size is less than 1,000 after the operation.
 * @member {String} action
 * @default 'REPLACE'
 */
CustomAudienceUpdateBody.prototype.action = 'REPLACE';

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
CustomAudienceUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} audience_enhancement
 */
CustomAudienceUpdateBody.prototype.audience_enhancement = undefined;

/**
 * Audience sub type, indicating the type of ads that the audience can be used for. The allowed enum value: REACH_FREQUENCY(To enable the audience to be used in Reach & Frequency campaigns). It means you can only convert audience sub type from NORMAL to REACH_FREQUENCY, but not the other way round. Note: If you update this field, changes to other data fields will be ignored. If you want to update a Lookalike audience, you cannot change the audience_sub_type to REACH_FREQUENCY. Otherwise, an error will occur.
 * @member {String} audience_sub_type
 */
CustomAudienceUpdateBody.prototype.audience_sub_type = undefined;

/**
 * @member {module:model/DmpcustomAudienceapplyContextInfo} context_info
 */
CustomAudienceUpdateBody.prototype.context_info = undefined;

/**
 * Custom audience ID.
 * @member {String} custom_audience_id
 */
CustomAudienceUpdateBody.prototype.custom_audience_id = undefined;

/**
 * New name for the audience. Length limit: 128 characters. You must pass in either this field or file_paths.
 * @member {String} custom_audience_name
 */
CustomAudienceUpdateBody.prototype.custom_audience_name = undefined;

/**
 * The files you upload to update the Customer File audience. You must pass in either this field or custom_audience_name. The recommended size is <50 per request to ensure stability. Once you pass in this field, you can specify the modification type (APPEND, REMOVE or REPLACE) via action. The files must be encrypted with the same encryption method/type with the audience that you want to update.
 * @member {Array.<String>} file_paths
 */
CustomAudienceUpdateBody.prototype.file_paths = undefined;

