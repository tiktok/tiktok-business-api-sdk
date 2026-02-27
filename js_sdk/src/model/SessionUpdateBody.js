/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxsessionupdateSession} from './CampaigngmvMaxsessionupdateSession.js';

/**
 * The SessionUpdateBody model module.
 * @module model/SessionUpdateBody
 * @version 1.2.1
 */
export class SessionUpdateBody {
  /**
   * Constructs a new <code>SessionUpdateBody</code>.
   * @alias module:model/SessionUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_id {String} 
   * @param session {module:model/CampaigngmvMaxsessionupdateSession} 
   * @param session_id {String} 
   * @param store_id {String} 
   */
  constructor(advertiser_id, campaign_id, session, session_id, store_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_id = campaign_id;
    this.session = session;
    this.session_id = session_id;
    this.store_id = store_id;
  }

  /**
   * Constructs a <code>SessionUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SessionUpdateBody} obj Optional instance to populate.
   * @return {module:model/SessionUpdateBody} The populated <code>SessionUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SessionUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('session'))
        obj.session = CampaigngmvMaxsessionupdateSession.constructFromObject(data['session']);
      if (data.hasOwnProperty('session_id'))
        obj.session_id = ApiClient.convertToType(data['session_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SessionUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} campaign_id
 */
SessionUpdateBody.prototype.campaign_id = undefined;

/**
 * @member {module:model/CampaigngmvMaxsessionupdateSession} session
 */
SessionUpdateBody.prototype.session = undefined;

/**
 * @member {String} session_id
 */
SessionUpdateBody.prototype.session_id = undefined;

/**
 * @member {String} store_id
 */
SessionUpdateBody.prototype.store_id = undefined;

