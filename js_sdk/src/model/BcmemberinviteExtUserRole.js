/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcmemberinviteExtUserRole model module.
 * @module model/BcmemberinviteExtUserRole
 * @version 0.1.5
 */
export class BcmemberinviteExtUserRole {
  /**
   * Constructs a new <code>BcmemberinviteExtUserRole</code>.
   * @alias module:model/BcmemberinviteExtUserRole
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>BcmemberinviteExtUserRole</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcmemberinviteExtUserRole} obj Optional instance to populate.
   * @return {module:model/BcmemberinviteExtUserRole} The populated <code>BcmemberinviteExtUserRole</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcmemberinviteExtUserRole();
      if (data.hasOwnProperty('finance_role'))
        obj.finance_role = ApiClient.convertToType(data['finance_role'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} finance_role
 */
BcmemberinviteExtUserRole.prototype.finance_role = undefined;

