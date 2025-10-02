/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PartnerDeleteBody model module.
 * @module model/PartnerDeleteBody
 * @version 0.1.8
 */
export class PartnerDeleteBody {
  /**
   * Constructs a new <code>PartnerDeleteBody</code>.
   * @alias module:model/PartnerDeleteBody
   * @class
   * @param bc_id {String} 
   * @param partner_id {String} 
   */
  constructor(bc_id, partner_id) {
    this.bc_id = bc_id;
    this.partner_id = partner_id;
  }

  /**
   * Constructs a <code>PartnerDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PartnerDeleteBody} obj Optional instance to populate.
   * @return {module:model/PartnerDeleteBody} The populated <code>PartnerDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PartnerDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('partner_id'))
        obj.partner_id = ApiClient.convertToType(data['partner_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
PartnerDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} partner_id
 */
PartnerDeleteBody.prototype.partner_id = undefined;

