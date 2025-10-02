/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {BcmemberinviteExtUserRole} from './BcmemberinviteExtUserRole.js';

/**
 * The MemberInviteBody model module.
 * @module model/MemberInviteBody
 * @version 0.1.8
 */
export class MemberInviteBody {
  /**
   * Constructs a new <code>MemberInviteBody</code>.
   * @alias module:model/MemberInviteBody
   * @class
   * @param asset_ids {Array.<String>} 
   * @param bc_id {String} 
   * @param emails {Array.<String>} 
   */
  constructor(asset_ids, bc_id, emails) {
    this.asset_ids = asset_ids;
    this.bc_id = bc_id;
    this.emails = emails;
  }

  /**
   * Constructs a <code>MemberInviteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MemberInviteBody} obj Optional instance to populate.
   * @return {module:model/MemberInviteBody} The populated <code>MemberInviteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MemberInviteBody();
      if (data.hasOwnProperty('advertiser_role'))
        obj.advertiser_role = ApiClient.convertToType(data['advertiser_role'], 'String');
      if (data.hasOwnProperty('asset_ids'))
        obj.asset_ids = ApiClient.convertToType(data['asset_ids'], ['String']);
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('emails'))
        obj.emails = ApiClient.convertToType(data['emails'], ['String']);
      if (data.hasOwnProperty('ext_user_role'))
        obj.ext_user_role = BcmemberinviteExtUserRole.constructFromObject(data['ext_user_role']);
      if (data.hasOwnProperty('user_role'))
        obj.user_role = ApiClient.convertToType(data['user_role'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_role
 * @default 'ANALYST'
 */
MemberInviteBody.prototype.advertiser_role = 'ANALYST';

/**
 * @member {Array.<String>} asset_ids
 */
MemberInviteBody.prototype.asset_ids = undefined;

/**
 * @member {String} asset_type
 * @default 'ADVERTISER'
 */
MemberInviteBody.prototype.asset_type = 'ADVERTISER';

/**
 * @member {String} bc_id
 */
MemberInviteBody.prototype.bc_id = undefined;

/**
 * @member {Array.<String>} emails
 */
MemberInviteBody.prototype.emails = undefined;

/**
 * @member {module:model/BcmemberinviteExtUserRole} ext_user_role
 */
MemberInviteBody.prototype.ext_user_role = undefined;

/**
 * @member {String} user_role
 * @default 'STANDARD'
 */
MemberInviteBody.prototype.user_role = 'STANDARD';

