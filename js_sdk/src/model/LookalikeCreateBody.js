/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencelookalikecreateContextInfo} from './DmpcustomAudiencelookalikecreateContextInfo.js';
import {DmpcustomAudiencelookalikecreateLookalikeSpec} from './DmpcustomAudiencelookalikecreateLookalikeSpec.js';

/**
 * The LookalikeCreateBody model module.
 * @module model/LookalikeCreateBody
 * @version 0.1.7
 */
export class LookalikeCreateBody {
  /**
   * Constructs a new <code>LookalikeCreateBody</code>.
   * @alias module:model/LookalikeCreateBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param custom_audience_name {String} Audience name. Maximum of 128 characters.
   * @param lookalike_spec {module:model/DmpcustomAudiencelookalikecreateLookalikeSpec} 
   */
  constructor(advertiser_id, custom_audience_name, lookalike_spec) {
    this.advertiser_id = advertiser_id;
    this.custom_audience_name = custom_audience_name;
    this.lookalike_spec = lookalike_spec;
  }

  /**
   * Constructs a <code>LookalikeCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LookalikeCreateBody} obj Optional instance to populate.
   * @return {module:model/LookalikeCreateBody} The populated <code>LookalikeCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new LookalikeCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = DmpcustomAudiencelookalikecreateContextInfo.constructFromObject(data['context_info']);
      if (data.hasOwnProperty('custom_audience_name'))
        obj.custom_audience_name = ApiClient.convertToType(data['custom_audience_name'], 'String');
      if (data.hasOwnProperty('lookalike_spec'))
        obj.lookalike_spec = DmpcustomAudiencelookalikecreateLookalikeSpec.constructFromObject(data['lookalike_spec']);
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
LookalikeCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {module:model/DmpcustomAudiencelookalikecreateContextInfo} context_info
 */
LookalikeCreateBody.prototype.context_info = undefined;

/**
 * Audience name. Maximum of 128 characters.
 * @member {String} custom_audience_name
 */
LookalikeCreateBody.prototype.custom_audience_name = undefined;

/**
 * @member {module:model/DmpcustomAudiencelookalikecreateLookalikeSpec} lookalike_spec
 */
LookalikeCreateBody.prototype.lookalike_spec = undefined;

