/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {BcmemberinviteExtUserRole} from './BcmemberinviteExtUserRole.js';

/**
 * The MemberUpdateBody model module.
 * @module model/MemberUpdateBody
 * @version 0.1.7
 */
export class MemberUpdateBody {
  /**
   * Constructs a new <code>MemberUpdateBody</code>.
   * @alias module:model/MemberUpdateBody
   * @class
   * @param bc_id {String} 
   * @param user_id {String} 
   */
  constructor(bc_id, user_id) {
    this.bc_id = bc_id;
    this.user_id = user_id;
  }

  /**
   * Constructs a <code>MemberUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MemberUpdateBody} obj Optional instance to populate.
   * @return {module:model/MemberUpdateBody} The populated <code>MemberUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MemberUpdateBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('child_bc_id'))
        obj.child_bc_id = ApiClient.convertToType(data['child_bc_id'], 'String');
      if (data.hasOwnProperty('ext_user_role'))
        obj.ext_user_role = BcmemberinviteExtUserRole.constructFromObject(data['ext_user_role']);
      if (data.hasOwnProperty('user_id'))
        obj.user_id = ApiClient.convertToType(data['user_id'], 'String');
      if (data.hasOwnProperty('user_name'))
        obj.user_name = ApiClient.convertToType(data['user_name'], 'String');
      if (data.hasOwnProperty('user_role'))
        obj.user_role = ApiClient.convertToType(data['user_role'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
MemberUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} child_bc_id
 */
MemberUpdateBody.prototype.child_bc_id = undefined;

/**
 * @member {module:model/BcmemberinviteExtUserRole} ext_user_role
 */
MemberUpdateBody.prototype.ext_user_role = undefined;

/**
 * @member {String} user_id
 */
MemberUpdateBody.prototype.user_id = undefined;

/**
 * @member {String} user_name
 */
MemberUpdateBody.prototype.user_name = undefined;

/**
 * @member {String} user_role
 */
MemberUpdateBody.prototype.user_role = undefined;

