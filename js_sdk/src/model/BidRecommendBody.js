/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BidRecommendBody model module.
 * @module model/BidRecommendBody
 * @version 0.1.2
 */
export class BidRecommendBody {
  /**
   * Constructs a new <code>BidRecommendBody</code>.
   * @alias module:model/BidRecommendBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param location_ids {Array.<String>} IDs of the locations that you want to target.
   * @param objective_type {String} Campaign objective. The current API endpoint only supports Traffic and Website conversions objectives. For enum values and descriptions, see Objectives. Note: This API is being revamped to support larger function scope and more accurate result. Please stay tuned for updates.
   */
  constructor(advertiser_id, location_ids, objective_type) {
    this.advertiser_id = advertiser_id;
    this.location_ids = location_ids;
    this.objective_type = objective_type;
  }

  /**
   * Constructs a <code>BidRecommendBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BidRecommendBody} obj Optional instance to populate.
   * @return {module:model/BidRecommendBody} The populated <code>BidRecommendBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BidRecommendBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('external_action'))
        obj.external_action = ApiClient.convertToType(data['external_action'], 'String');
      if (data.hasOwnProperty('location_ids'))
        obj.location_ids = ApiClient.convertToType(data['location_ids'], ['String']);
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
BidRecommendBody.prototype.advertiser_id = undefined;

/**
 * Campaign ID.
 * @member {String} campaign_id
 * @default '"0"'
 */
BidRecommendBody.prototype.campaign_id = '"0"';

/**
 * Conversion event for the ad group.
 * @member {String} external_action
 */
BidRecommendBody.prototype.external_action = undefined;

/**
 * IDs of the locations that you want to target.
 * @member {Array.<String>} location_ids
 */
BidRecommendBody.prototype.location_ids = undefined;

/**
 * Campaign objective. The current API endpoint only supports Traffic and Website conversions objectives. For enum values and descriptions, see Objectives. Note: This API is being revamped to support larger function scope and more accurate result. Please stay tuned for updates.
 * @member {String} objective_type
 */
BidRecommendBody.prototype.objective_type = undefined;

