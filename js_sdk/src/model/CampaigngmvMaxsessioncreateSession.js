/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxsessioncreateSessionProductList} from './CampaigngmvMaxsessioncreateSessionProductList.js';

/**
 * The CampaigngmvMaxsessioncreateSession model module.
 * @module model/CampaigngmvMaxsessioncreateSession
 * @version 0.1.8
 */
export class CampaigngmvMaxsessioncreateSession {
  /**
   * Constructs a new <code>CampaigngmvMaxsessioncreateSession</code>.
   * @alias module:model/CampaigngmvMaxsessioncreateSession
   * @class
   * @param budget {Number} 
   * @param product_list {Array.<module:model/CampaigngmvMaxsessioncreateSessionProductList>} 
   */
  constructor(budget, product_list) {
    this.budget = budget;
    this.product_list = product_list;
  }

  /**
   * Constructs a <code>CampaigngmvMaxsessioncreateSession</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxsessioncreateSession} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxsessioncreateSession} The populated <code>CampaigngmvMaxsessioncreateSession</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxsessioncreateSession();
      if (data.hasOwnProperty('bid_type'))
        obj.bid_type = ApiClient.convertToType(data['bid_type'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('item_id'))
        obj.item_id = ApiClient.convertToType(data['item_id'], 'String');
      if (data.hasOwnProperty('product_list'))
        obj.product_list = ApiClient.convertToType(data['product_list'], [CampaigngmvMaxsessioncreateSessionProductList]);
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bid_type
 */
CampaigngmvMaxsessioncreateSession.prototype.bid_type = undefined;

/**
 * @member {Number} budget
 */
CampaigngmvMaxsessioncreateSession.prototype.budget = undefined;

/**
 * @member {String} item_id
 */
CampaigngmvMaxsessioncreateSession.prototype.item_id = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxsessioncreateSessionProductList>} product_list
 */
CampaigngmvMaxsessioncreateSession.prototype.product_list = undefined;

/**
 * @member {String} schedule_end_time
 */
CampaigngmvMaxsessioncreateSession.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
CampaigngmvMaxsessioncreateSession.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
CampaigngmvMaxsessioncreateSession.prototype.schedule_type = undefined;

