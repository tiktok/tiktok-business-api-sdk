/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The catalogcreateCatalogConf model module.
 * @module model/catalogcreateCatalogConf
 * @version 0.1.3
 */
export class catalogcreateCatalogConf {
  /**
   * Constructs a new <code>catalogcreateCatalogConf</code>.
   * @alias module:model/catalogcreateCatalogConf
   * @class
   * @param currency {String} 
   * @param region_code {String} 
   */
  constructor(currency, region_code) {
    this.currency = currency;
    this.region_code = region_code;
  }

  /**
   * Constructs a <code>catalogcreateCatalogConf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/catalogcreateCatalogConf} obj Optional instance to populate.
   * @return {module:model/catalogcreateCatalogConf} The populated <code>catalogcreateCatalogConf</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new catalogcreateCatalogConf();
      if (data.hasOwnProperty('business_platform'))
        obj.business_platform = ApiClient.convertToType(data['business_platform'], 'String');
      if (data.hasOwnProperty('channel'))
        obj.channel = ApiClient.convertToType(data['channel'], 'String');
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('region_code'))
        obj.region_code = ApiClient.convertToType(data['region_code'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} business_platform
 */
catalogcreateCatalogConf.prototype.business_platform = undefined;

/**
 * @member {String} channel
 */
catalogcreateCatalogConf.prototype.channel = undefined;

/**
 * @member {String} currency
 */
catalogcreateCatalogConf.prototype.currency = undefined;

/**
 * @member {String} region_code
 */
catalogcreateCatalogConf.prototype.region_code = undefined;

