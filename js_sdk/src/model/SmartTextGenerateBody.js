/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartTextGenerateBody model module.
 * @module model/SmartTextGenerateBody
 * @version 0.1.8
 */
export class SmartTextGenerateBody {
  /**
   * Constructs a new <code>SmartTextGenerateBody</code>.
   * @alias module:model/SmartTextGenerateBody
   * @class
   * @param adgroup_id {String} 
   * @param advertiser_id {String} 
   */
  constructor(adgroup_id, advertiser_id) {
    this.adgroup_id = adgroup_id;
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>SmartTextGenerateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartTextGenerateBody} obj Optional instance to populate.
   * @return {module:model/SmartTextGenerateBody} The populated <code>SmartTextGenerateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartTextGenerateBody();
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('industry_id'))
        obj.industry_id = ApiClient.convertToType(data['industry_id'], 'String');
      if (data.hasOwnProperty('keywords'))
        obj.keywords = ApiClient.convertToType(data['keywords'], ['String']);
      if (data.hasOwnProperty('language'))
        obj.language = ApiClient.convertToType(data['language'], 'String');
      if (data.hasOwnProperty('limit'))
        obj.limit = ApiClient.convertToType(data['limit'], 'Number');
      if (data.hasOwnProperty('param_type'))
        obj.param_type = ApiClient.convertToType(data['param_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} adgroup_id
 */
SmartTextGenerateBody.prototype.adgroup_id = undefined;

/**
 * @member {String} advertiser_id
 */
SmartTextGenerateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} industry_id
 */
SmartTextGenerateBody.prototype.industry_id = undefined;

/**
 * @member {Array.<String>} keywords
 */
SmartTextGenerateBody.prototype.keywords = undefined;

/**
 * @member {String} language
 */
SmartTextGenerateBody.prototype.language = undefined;

/**
 * @member {Number} limit
 * @default 10
 */
SmartTextGenerateBody.prototype.limit = 10;

/**
 * @member {String} param_type
 * @default 'CUSTOMIZED'
 */
SmartTextGenerateBody.prototype.param_type = 'CUSTOMIZED';

