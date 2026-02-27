/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SessionDeleteBody model module.
 * @module model/SessionDeleteBody
 * @version 1.2.1
 */
export class SessionDeleteBody {
  /**
   * Constructs a new <code>SessionDeleteBody</code>.
   * @alias module:model/SessionDeleteBody
   * @class
   * @param advertiser_id {String} 
   * @param session_id {String} 
   */
  constructor(advertiser_id, session_id) {
    this.advertiser_id = advertiser_id;
    this.session_id = session_id;
  }

  /**
   * Constructs a <code>SessionDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SessionDeleteBody} obj Optional instance to populate.
   * @return {module:model/SessionDeleteBody} The populated <code>SessionDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SessionDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('session_id'))
        obj.session_id = ApiClient.convertToType(data['session_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SessionDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {String} session_id
 */
SessionDeleteBody.prototype.session_id = undefined;

