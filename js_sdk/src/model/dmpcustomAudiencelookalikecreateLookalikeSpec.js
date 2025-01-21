/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The dmpcustomAudiencelookalikecreateLookalikeSpec model module.
 * @module model/dmpcustomAudiencelookalikecreateLookalikeSpec
 * @version 0.1.2
 */
export class dmpcustomAudiencelookalikecreateLookalikeSpec {
  /**
   * Constructs a new <code>dmpcustomAudiencelookalikecreateLookalikeSpec</code>.
   * @alias module:model/dmpcustomAudiencelookalikecreateLookalikeSpec
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>dmpcustomAudiencelookalikecreateLookalikeSpec</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudiencelookalikecreateLookalikeSpec} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudiencelookalikecreateLookalikeSpec} The populated <code>dmpcustomAudiencelookalikecreateLookalikeSpec</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudiencelookalikecreateLookalikeSpec();
      if (data.hasOwnProperty('audience_size'))
        obj.audience_size = ApiClient.convertToType(data['audience_size'], 'String');
      if (data.hasOwnProperty('include_source'))
        obj.include_source = ApiClient.convertToType(data['include_source'], 'Boolean');
      if (data.hasOwnProperty('location_ids'))
        obj.location_ids = ApiClient.convertToType(data['location_ids'], ['String']);
      if (data.hasOwnProperty('mobile_os'))
        obj.mobile_os = ApiClient.convertToType(data['mobile_os'], 'String');
      if (data.hasOwnProperty('placements'))
        obj.placements = ApiClient.convertToType(data['placements'], ['String']);
      if (data.hasOwnProperty('source_audience_id'))
        obj.source_audience_id = ApiClient.convertToType(data['source_audience_id'], 'String');
    }
    return obj;
  }
}

/**
 * Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD.
 * @member {String} audience_size
 */
dmpcustomAudiencelookalikecreateLookalikeSpec.prototype.audience_size = undefined;

/**
 * Whether to include the source audience in the new lookalike audience.
 * @member {Boolean} include_source
 */
dmpcustomAudiencelookalikecreateLookalikeSpec.prototype.include_source = undefined;

/**
 * IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations.
 * @member {Array.<String>} location_ids
 */
dmpcustomAudiencelookalikecreateLookalikeSpec.prototype.location_ids = undefined;

/**
 * Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details.
 * @member {String} mobile_os
 */
dmpcustomAudiencelookalikecreateLookalikeSpec.prototype.mobile_os = undefined;

/**
 * The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz & BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details.
 * @member {Array.<String>} placements
 */
dmpcustomAudiencelookalikecreateLookalikeSpec.prototype.placements = undefined;

/**
 * Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100.
 * @member {String} source_audience_id
 */
dmpcustomAudiencelookalikecreateLookalikeSpec.prototype.source_audience_id = undefined;

