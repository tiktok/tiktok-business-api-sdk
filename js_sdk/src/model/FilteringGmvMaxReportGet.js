/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringGmvMaxReportGet model module.
 * @module model/FilteringGmvMaxReportGet
 * @version 0.1.9
 */
export class FilteringGmvMaxReportGet {
  /**
   * Constructs a new <code>FilteringGmvMaxReportGet</code>.
   * @alias module:model/FilteringGmvMaxReportGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringGmvMaxReportGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringGmvMaxReportGet} obj Optional instance to populate.
   * @return {module:model/FilteringGmvMaxReportGet} The populated <code>FilteringGmvMaxReportGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringGmvMaxReportGet();
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('campaign_statuses'))
        obj.campaign_statuses = ApiClient.convertToType(data['campaign_statuses'], ['String']);
      if (data.hasOwnProperty('creative_delivery_statuses'))
        obj.creative_delivery_statuses = ApiClient.convertToType(data['creative_delivery_statuses'], ['String']);
      if (data.hasOwnProperty('creative_types'))
        obj.creative_types = ApiClient.convertToType(data['creative_types'], ['String']);
      if (data.hasOwnProperty('gmv_max_promotion_types'))
        obj.gmv_max_promotion_types = ApiClient.convertToType(data['gmv_max_promotion_types'], ['String']);
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('item_ids'))
        obj.item_ids = ApiClient.convertToType(data['item_ids'], ['String']);
      if (data.hasOwnProperty('room_ids'))
        obj.room_ids = ApiClient.convertToType(data['room_ids'], ['String']);
      if (data.hasOwnProperty('search_word'))
        obj.search_word = ApiClient.convertToType(data['search_word'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringGmvMaxReportGet.prototype.campaign_ids = undefined;

/**
 * @member {String} campaign_name
 */
FilteringGmvMaxReportGet.prototype.campaign_name = undefined;

/**
 * @member {Array.<String>} campaign_statuses
 */
FilteringGmvMaxReportGet.prototype.campaign_statuses = undefined;

/**
 * @member {Array.<String>} creative_delivery_statuses
 */
FilteringGmvMaxReportGet.prototype.creative_delivery_statuses = undefined;

/**
 * @member {Array.<String>} creative_types
 */
FilteringGmvMaxReportGet.prototype.creative_types = undefined;

/**
 * @member {Array.<String>} gmv_max_promotion_types
 */
FilteringGmvMaxReportGet.prototype.gmv_max_promotion_types = undefined;

/**
 * @member {Array.<String>} item_group_ids
 */
FilteringGmvMaxReportGet.prototype.item_group_ids = undefined;

/**
 * @member {Array.<String>} item_ids
 */
FilteringGmvMaxReportGet.prototype.item_ids = undefined;

/**
 * @member {Array.<String>} room_ids
 */
FilteringGmvMaxReportGet.prototype.room_ids = undefined;

/**
 * @member {String} search_word
 */
FilteringGmvMaxReportGet.prototype.search_word = undefined;

