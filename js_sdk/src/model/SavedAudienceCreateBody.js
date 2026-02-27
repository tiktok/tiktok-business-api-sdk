/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpsavedAudiencecreateActions} from './DmpsavedAudiencecreateActions.js';

/**
 * The SavedAudienceCreateBody model module.
 * @module model/SavedAudienceCreateBody
 * @version 1.2.1
 */
export class SavedAudienceCreateBody {
  /**
   * Constructs a new <code>SavedAudienceCreateBody</code>.
   * @alias module:model/SavedAudienceCreateBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param location_ids {Array.<String>} IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting.
   * @param saved_audience_name {String} Saved Audience name. Character limit is 512 and cannot contain emoji.
   */
  constructor(advertiser_id, location_ids, saved_audience_name) {
    this.advertiser_id = advertiser_id;
    this.location_ids = location_ids;
    this.saved_audience_name = saved_audience_name;
  }

  /**
   * Constructs a <code>SavedAudienceCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SavedAudienceCreateBody} obj Optional instance to populate.
   * @return {module:model/SavedAudienceCreateBody} The populated <code>SavedAudienceCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SavedAudienceCreateBody();
      if (data.hasOwnProperty('actions'))
        obj.actions = ApiClient.convertToType(data['actions'], [DmpsavedAudiencecreateActions]);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('age_groups'))
        obj.age_groups = ApiClient.convertToType(data['age_groups'], ['String']);
      if (data.hasOwnProperty('audience_ids'))
        obj.audience_ids = ApiClient.convertToType(data['audience_ids'], ['String']);
      if (data.hasOwnProperty('carrier_ids'))
        obj.carrier_ids = ApiClient.convertToType(data['carrier_ids'], ['String']);
      if (data.hasOwnProperty('device_model_ids'))
        obj.device_model_ids = ApiClient.convertToType(data['device_model_ids'], ['String']);
      if (data.hasOwnProperty('device_price_ranges'))
        obj.device_price_ranges = ApiClient.convertToType(data['device_price_ranges'], ['Number']);
      if (data.hasOwnProperty('excluded_audience_ids'))
        obj.excluded_audience_ids = ApiClient.convertToType(data['excluded_audience_ids'], ['String']);
      if (data.hasOwnProperty('gender'))
        obj.gender = ApiClient.convertToType(data['gender'], 'String');
      if (data.hasOwnProperty('interest_category_ids'))
        obj.interest_category_ids = ApiClient.convertToType(data['interest_category_ids'], ['String']);
      if (data.hasOwnProperty('interest_keyword_ids'))
        obj.interest_keyword_ids = ApiClient.convertToType(data['interest_keyword_ids'], ['String']);
      if (data.hasOwnProperty('languages'))
        obj.languages = ApiClient.convertToType(data['languages'], ['String']);
      if (data.hasOwnProperty('location_ids'))
        obj.location_ids = ApiClient.convertToType(data['location_ids'], ['String']);
      if (data.hasOwnProperty('min_android_version'))
        obj.min_android_version = ApiClient.convertToType(data['min_android_version'], 'String');
      if (data.hasOwnProperty('min_ios_version'))
        obj.min_ios_version = ApiClient.convertToType(data['min_ios_version'], 'String');
      if (data.hasOwnProperty('network_types'))
        obj.network_types = ApiClient.convertToType(data['network_types'], ['String']);
      if (data.hasOwnProperty('operating_systems'))
        obj.operating_systems = ApiClient.convertToType(data['operating_systems'], ['String']);
      if (data.hasOwnProperty('saved_audience_name'))
        obj.saved_audience_name = ApiClient.convertToType(data['saved_audience_name'], 'String');
    }
    return obj;
  }
}

/**
 * A list of action category objects.
 * @member {Array.<module:model/DmpsavedAudiencecreateActions>} actions
 */
SavedAudienceCreateBody.prototype.actions = undefined;

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
SavedAudienceCreateBody.prototype.advertiser_id = undefined;

/**
 * Age groups you want to target. For enum values, see Enumeration - Targeting Age Group.
 * @member {Array.<String>} age_groups
 */
SavedAudienceCreateBody.prototype.age_groups = undefined;

/**
 * List of audience IDs. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.
 * @member {Array.<String>} audience_ids
 */
SavedAudienceCreateBody.prototype.audience_ids = undefined;

/**
 * Carriers that you want to target. Use /tool/carrier/ endpoint to get a list of carriers. A carrier is valid only when the in_use field for the carrier is true. The carriers must be consistent with the location(s) that you want to target.
 * @member {Array.<String>} carrier_ids
 */
SavedAudienceCreateBody.prototype.carrier_ids = undefined;

/**
 * IDs of the device models that you want to target. Use /tool/device_model/ to get the complete list of device model IDs and their statuses, and only active devices (is_active = true in the response of /tool/device_model/) can be used to create ads. Note: Device model (device_model_ids) and device price (device_price_ranges) cannot be set at the same time.
 * @member {Array.<String>} device_model_ids
 */
SavedAudienceCreateBody.prototype.device_model_ids = undefined;

/**
 * @member {Array.<Number>} device_price_ranges
 */
SavedAudienceCreateBody.prototype.device_price_ranges = undefined;

/**
 * List of audience IDs to be excluded. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.
 * @member {Array.<String>} excluded_audience_ids
 */
SavedAudienceCreateBody.prototype.excluded_audience_ids = undefined;

/**
 * Gender that you want to target. Enum values: GENDER_FEMALE,GENDER_MALE,GENDER_UNLIMITED
 * @member {String} gender
 */
SavedAudienceCreateBody.prototype.gender = undefined;

/**
 * Interest classification. You can use /tool/target_recommend_tags/ to get a list of recommended interest categories based on your targeting regions and your industries, or use /tool/interest_category/ endpoint to get the complete list of interest categories. If the interest is specified, users who do not meet the interest target will be excluded during delivery. Do not specify if you wish to target everyone.
 * @member {Array.<String>} interest_category_ids
 */
SavedAudienceCreateBody.prototype.interest_category_ids = undefined;

/**
 * IDs of interest keywords that you want to use to target audience. You can use /tool/interest_keyword/recommend/ to get recommended interest keywords.
 * @member {Array.<String>} interest_keyword_ids
 */
SavedAudienceCreateBody.prototype.interest_keyword_ids = undefined;

/**
 * Codes of the languages that you want to target. You can get language codes via /tool/language/, and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.
 * @member {Array.<String>} languages
 */
SavedAudienceCreateBody.prototype.languages = undefined;

/**
 * IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting.
 * @member {Array.<String>} location_ids
 */
SavedAudienceCreateBody.prototype.location_ids = undefined;

/**
 * Minimum device Android version. For enum values, see Enumeration - Minimum Android Version.
 * @member {String} min_android_version
 */
SavedAudienceCreateBody.prototype.min_android_version = undefined;

/**
 * Minimum iOS version. For enum values, see Enumeration - Minimum iOS Version.
 * @member {String} min_ios_version
 */
SavedAudienceCreateBody.prototype.min_ios_version = undefined;

/**
 * Device connection types that you want to target. Default: unlimited. For enum values, see Enumeration - Connection Type.
 * @member {Array.<String>} network_types
 */
SavedAudienceCreateBody.prototype.network_types = undefined;

/**
 * Device operating systems that you want to target. Enum values: ANDROID, IOS. Only one value is allowed.
 * @member {Array.<String>} operating_systems
 */
SavedAudienceCreateBody.prototype.operating_systems = undefined;

/**
 * Saved Audience name. Character limit is 512 and cannot contain emoji.
 * @member {String} saved_audience_name
 */
SavedAudienceCreateBody.prototype.saved_audience_name = undefined;

