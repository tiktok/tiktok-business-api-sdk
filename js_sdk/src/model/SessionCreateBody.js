/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxsessioncreateSession} from './CampaigngmvMaxsessioncreateSession.js';

/**
 * The SessionCreateBody model module.
 * @module model/SessionCreateBody
 * @version 1.2.1
 */
export class SessionCreateBody {
  /**
   * Constructs a new <code>SessionCreateBody</code>.
   * @alias module:model/SessionCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_id {String} 
   * @param session {module:model/CampaigngmvMaxsessioncreateSession} 
   * @param store_id {String} 
   */
  constructor(advertiser_id, campaign_id, session, store_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_id = campaign_id;
    this.session = session;
    this.store_id = store_id;
  }

  /**
   * Constructs a <code>SessionCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SessionCreateBody} obj Optional instance to populate.
   * @return {module:model/SessionCreateBody} The populated <code>SessionCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SessionCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('session'))
        obj.session = CampaigngmvMaxsessioncreateSession.constructFromObject(data['session']);
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SessionCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} campaign_id
 */
SessionCreateBody.prototype.campaign_id = undefined;

/**
 * @member {module:model/CampaigngmvMaxsessioncreateSession} session
 */
SessionCreateBody.prototype.session = undefined;

/**
 * @member {String} store_id
 */
SessionCreateBody.prototype.store_id = undefined;

