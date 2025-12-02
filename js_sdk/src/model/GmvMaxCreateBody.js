/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxcreateCustomAnchorVideoList} from './CampaigngmvMaxcreateCustomAnchorVideoList.js';
import {CampaigngmvMaxcreateIdentityList} from './CampaigngmvMaxcreateIdentityList.js';
import {CampaigngmvMaxcreateItemList} from './CampaigngmvMaxcreateItemList.js';
import {CampaigngmvMaxcreatePromotionDays} from './CampaigngmvMaxcreatePromotionDays.js';

/**
 * The GmvMaxCreateBody model module.
 * @module model/GmvMaxCreateBody
 * @version 0.1.9
 */
export class GmvMaxCreateBody {
  /**
   * Constructs a new <code>GmvMaxCreateBody</code>.
   * @alias module:model/GmvMaxCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_name {String} 
   * @param deep_bid_type {String} 
   * @param optimization_goal {String} 
   * @param request_id {String} 
   * @param schedule_start_time {String} 
   * @param schedule_type {String} 
   * @param shopping_ads_type {String} 
   * @param store_authorized_bc_id {String} 
   * @param store_id {String} 
   */
  constructor(advertiser_id, campaign_name, deep_bid_type, optimization_goal, request_id, schedule_start_time, schedule_type, shopping_ads_type, store_authorized_bc_id, store_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_name = campaign_name;
    this.deep_bid_type = deep_bid_type;
    this.optimization_goal = optimization_goal;
    this.request_id = request_id;
    this.schedule_start_time = schedule_start_time;
    this.schedule_type = schedule_type;
    this.shopping_ads_type = shopping_ads_type;
    this.store_authorized_bc_id = store_authorized_bc_id;
    this.store_id = store_id;
  }

  /**
   * Constructs a <code>GmvMaxCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GmvMaxCreateBody} obj Optional instance to populate.
   * @return {module:model/GmvMaxCreateBody} The populated <code>GmvMaxCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new GmvMaxCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('affiliate_posts_enabled'))
        obj.affiliate_posts_enabled = ApiClient.convertToType(data['affiliate_posts_enabled'], 'Boolean');
      if (data.hasOwnProperty('auto_budget_enabled'))
        obj.auto_budget_enabled = ApiClient.convertToType(data['auto_budget_enabled'], 'Boolean');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('custom_anchor_video_list'))
        obj.custom_anchor_video_list = ApiClient.convertToType(data['custom_anchor_video_list'], [CampaigngmvMaxcreateCustomAnchorVideoList]);
      if (data.hasOwnProperty('deep_bid_type'))
        obj.deep_bid_type = ApiClient.convertToType(data['deep_bid_type'], 'String');
      if (data.hasOwnProperty('identity_list'))
        obj.identity_list = ApiClient.convertToType(data['identity_list'], [CampaigngmvMaxcreateIdentityList]);
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('item_list'))
        obj.item_list = ApiClient.convertToType(data['item_list'], [CampaigngmvMaxcreateItemList]);
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('product_specific_type'))
        obj.product_specific_type = ApiClient.convertToType(data['product_specific_type'], 'String');
      if (data.hasOwnProperty('product_video_specific_type'))
        obj.product_video_specific_type = ApiClient.convertToType(data['product_video_specific_type'], 'String');
      if (data.hasOwnProperty('promotion_days'))
        obj.promotion_days = CampaigngmvMaxcreatePromotionDays.constructFromObject(data['promotion_days']);
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_type'))
        obj.shopping_ads_type = ApiClient.convertToType(data['shopping_ads_type'], 'String');
      if (data.hasOwnProperty('store_authorized_bc_id'))
        obj.store_authorized_bc_id = ApiClient.convertToType(data['store_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
GmvMaxCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} affiliate_posts_enabled
 */
GmvMaxCreateBody.prototype.affiliate_posts_enabled = undefined;

/**
 * @member {Boolean} auto_budget_enabled
 */
GmvMaxCreateBody.prototype.auto_budget_enabled = undefined;

/**
 * @member {Number} budget
 */
GmvMaxCreateBody.prototype.budget = undefined;

/**
 * @member {String} campaign_name
 */
GmvMaxCreateBody.prototype.campaign_name = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxcreateCustomAnchorVideoList>} custom_anchor_video_list
 */
GmvMaxCreateBody.prototype.custom_anchor_video_list = undefined;

/**
 * @member {String} deep_bid_type
 */
GmvMaxCreateBody.prototype.deep_bid_type = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxcreateIdentityList>} identity_list
 */
GmvMaxCreateBody.prototype.identity_list = undefined;

/**
 * @member {Array.<String>} item_group_ids
 */
GmvMaxCreateBody.prototype.item_group_ids = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxcreateItemList>} item_list
 */
GmvMaxCreateBody.prototype.item_list = undefined;

/**
 * @member {String} optimization_goal
 */
GmvMaxCreateBody.prototype.optimization_goal = undefined;

/**
 * @member {String} product_specific_type
 */
GmvMaxCreateBody.prototype.product_specific_type = undefined;

/**
 * @member {String} product_video_specific_type
 */
GmvMaxCreateBody.prototype.product_video_specific_type = undefined;

/**
 * @member {module:model/CampaigngmvMaxcreatePromotionDays} promotion_days
 */
GmvMaxCreateBody.prototype.promotion_days = undefined;

/**
 * @member {String} request_id
 */
GmvMaxCreateBody.prototype.request_id = undefined;

/**
 * @member {Number} roas_bid
 */
GmvMaxCreateBody.prototype.roas_bid = undefined;

/**
 * @member {String} schedule_end_time
 */
GmvMaxCreateBody.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
GmvMaxCreateBody.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
GmvMaxCreateBody.prototype.schedule_type = undefined;

/**
 * @member {String} shopping_ads_type
 */
GmvMaxCreateBody.prototype.shopping_ads_type = undefined;

/**
 * @member {String} store_authorized_bc_id
 */
GmvMaxCreateBody.prototype.store_authorized_bc_id = undefined;

/**
 * @member {String} store_id
 */
GmvMaxCreateBody.prototype.store_id = undefined;

