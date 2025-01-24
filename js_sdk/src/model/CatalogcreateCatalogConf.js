/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CatalogcreateCatalogConf model module.
 * @module model/CatalogcreateCatalogConf
 * @version 0.1.3
 */
export class CatalogcreateCatalogConf {
  /**
   * Constructs a new <code>CatalogcreateCatalogConf</code>.
   * @alias module:model/CatalogcreateCatalogConf
   * @class
   * @param currency {String} 
   * @param region_code {String} 
   */
  constructor(currency, region_code) {
    this.currency = currency;
    this.region_code = region_code;
  }

  /**
   * Constructs a <code>CatalogcreateCatalogConf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogcreateCatalogConf} obj Optional instance to populate.
   * @return {module:model/CatalogcreateCatalogConf} The populated <code>CatalogcreateCatalogConf</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogcreateCatalogConf();
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
CatalogcreateCatalogConf.prototype.business_platform = undefined;

/**
 * @member {String} channel
 */
CatalogcreateCatalogConf.prototype.channel = undefined;

/**
 * @member {String} currency
 */
CatalogcreateCatalogConf.prototype.currency = undefined;

/**
 * @member {String} region_code
 */
CatalogcreateCatalogConf.prototype.region_code = undefined;

