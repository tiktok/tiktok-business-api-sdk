/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The TermConfirmBody model module.
 * @module model/TermConfirmBody
 * @version 0.1.8
 */
export class TermConfirmBody {
  /**
   * Constructs a new <code>TermConfirmBody</code>.
   * @alias module:model/TermConfirmBody
   * @class
   * @param advertiser_id {String} 
   * @param term_type {String} 
   */
  constructor(advertiser_id, term_type) {
    this.advertiser_id = advertiser_id;
    this.term_type = term_type;
  }

  /**
   * Constructs a <code>TermConfirmBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TermConfirmBody} obj Optional instance to populate.
   * @return {module:model/TermConfirmBody} The populated <code>TermConfirmBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TermConfirmBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('term_type'))
        obj.term_type = ApiClient.convertToType(data['term_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
TermConfirmBody.prototype.advertiser_id = undefined;

/**
 * @member {String} term_type
 */
TermConfirmBody.prototype.term_type = undefined;

