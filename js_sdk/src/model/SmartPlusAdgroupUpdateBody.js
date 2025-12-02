/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdgroupCreateBodyTargetingSpec} from './SmartPlusAdgroupCreateBodyTargetingSpec.js';

/**
 * The SmartPlusAdgroupUpdateBody model module.
 * @module model/SmartPlusAdgroupUpdateBody
 * @version 0.1.9
 */
export class SmartPlusAdgroupUpdateBody {
  /**
   * Constructs a new <code>SmartPlusAdgroupUpdateBody</code>.
   * @alias module:model/SmartPlusAdgroupUpdateBody
   * @class
   * @param adgroup_id {String} 
   * @param advertiser_id {String} 
   */
  constructor(adgroup_id, advertiser_id) {
    this.adgroup_id = adgroup_id;
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>SmartPlusAdgroupUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdgroupUpdateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdgroupUpdateBody} The populated <code>SmartPlusAdgroupUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdgroupUpdateBody();
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('adgroup_name'))
        obj.adgroup_name = ApiClient.convertToType(data['adgroup_name'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('bid_price'))
        obj.bid_price = ApiClient.convertToType(data['bid_price'], 'Number');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('comment_disabled'))
        obj.comment_disabled = ApiClient.convertToType(data['comment_disabled'], 'Boolean');
      if (data.hasOwnProperty('conversion_bid_price'))
        obj.conversion_bid_price = ApiClient.convertToType(data['conversion_bid_price'], 'Number');
      if (data.hasOwnProperty('dayparting'))
        obj.dayparting = ApiClient.convertToType(data['dayparting'], 'String');
      if (data.hasOwnProperty('min_budget'))
        obj.min_budget = ApiClient.convertToType(data['min_budget'], 'Number');
      if (data.hasOwnProperty('movie_premiere_date'))
        obj.movie_premiere_date = ApiClient.convertToType(data['movie_premiere_date'], 'String');
      if (data.hasOwnProperty('pacing'))
        obj.pacing = ApiClient.convertToType(data['pacing'], 'String');
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('share_disabled'))
        obj.share_disabled = ApiClient.convertToType(data['share_disabled'], 'Boolean');
      if (data.hasOwnProperty('suggestion_audience_enabled'))
        obj.suggestion_audience_enabled = ApiClient.convertToType(data['suggestion_audience_enabled'], 'Boolean');
      if (data.hasOwnProperty('targeting_optimization_mode'))
        obj.targeting_optimization_mode = ApiClient.convertToType(data['targeting_optimization_mode'], 'String');
      if (data.hasOwnProperty('targeting_spec'))
        obj.targeting_spec = SmartPlusAdgroupCreateBodyTargetingSpec.constructFromObject(data['targeting_spec']);
    }
    return obj;
  }
}

/**
 * @member {String} adgroup_id
 */
SmartPlusAdgroupUpdateBody.prototype.adgroup_id = undefined;

/**
 * @member {String} adgroup_name
 */
SmartPlusAdgroupUpdateBody.prototype.adgroup_name = undefined;

/**
 * @member {String} advertiser_id
 */
SmartPlusAdgroupUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Number} bid_price
 */
SmartPlusAdgroupUpdateBody.prototype.bid_price = undefined;

/**
 * @member {Number} budget
 */
SmartPlusAdgroupUpdateBody.prototype.budget = undefined;

/**
 * @member {Boolean} comment_disabled
 */
SmartPlusAdgroupUpdateBody.prototype.comment_disabled = undefined;

/**
 * @member {Number} conversion_bid_price
 */
SmartPlusAdgroupUpdateBody.prototype.conversion_bid_price = undefined;

/**
 * @member {String} dayparting
 */
SmartPlusAdgroupUpdateBody.prototype.dayparting = undefined;

/**
 * @member {Number} min_budget
 */
SmartPlusAdgroupUpdateBody.prototype.min_budget = undefined;

/**
 * @member {String} movie_premiere_date
 */
SmartPlusAdgroupUpdateBody.prototype.movie_premiere_date = undefined;

/**
 * @member {String} pacing
 */
SmartPlusAdgroupUpdateBody.prototype.pacing = undefined;

/**
 * @member {Number} roas_bid
 */
SmartPlusAdgroupUpdateBody.prototype.roas_bid = undefined;

/**
 * @member {String} schedule_end_time
 */
SmartPlusAdgroupUpdateBody.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
SmartPlusAdgroupUpdateBody.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
SmartPlusAdgroupUpdateBody.prototype.schedule_type = undefined;

/**
 * @member {Boolean} share_disabled
 */
SmartPlusAdgroupUpdateBody.prototype.share_disabled = undefined;

/**
 * @member {Boolean} suggestion_audience_enabled
 */
SmartPlusAdgroupUpdateBody.prototype.suggestion_audience_enabled = undefined;

/**
 * @member {String} targeting_optimization_mode
 */
SmartPlusAdgroupUpdateBody.prototype.targeting_optimization_mode = undefined;

/**
 * @member {module:model/SmartPlusAdgroupCreateBodyTargetingSpec} targeting_spec
 */
SmartPlusAdgroupUpdateBody.prototype.targeting_spec = undefined;

