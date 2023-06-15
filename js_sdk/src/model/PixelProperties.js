/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';
import {PixelContent} from './PixelContent';

/**
 * The PixelProperties model module.
 * @module model/PixelProperties
 * @version 0.1.1
 */
export class PixelProperties {
  /**
   * Constructs a new <code>PixelProperties</code>.
   * Properties associated with the event
   * @alias module:model/PixelProperties
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelProperties</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelProperties} obj Optional instance to populate.
   * @return {module:model/PixelProperties} The populated <code>PixelProperties</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelProperties();
      if (data.hasOwnProperty('contents'))
        obj.contents = ApiClient.convertToType(data['contents'], [PixelContent]);
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('query'))
        obj.query = ApiClient.convertToType(data['query'], 'String');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'Number');
    }
    return obj;
  }
}

/**
 * Related items in a web event (e.g. items added in an Initiate Checkout event).
 * @member {Array.<module:model/PixelContent>} contents
 */
PixelProperties.prototype.contents = undefined;

/**
 * ISO 4217 code. Examples: EUR, USD, JPY. List of currencies currently supported: AED, ARS, AUD, BDT, BHD, BIF, BOB, BRL, CAD, CHF, CLP, CNY, COP, CRC, CZK, DKK, DZD, EGP, EUR, GBP, GTQ, HKD, HNL, HUF, IDR, ILS, INR, ISK, JPY, KES, KHR, KRW, KWD, KZT, MAD, MOP, MXN, MYR, NGN, NIO, NOK, NZD, OMR, PEN, PHP, PHP, PKR, PLN, PYG, QAR, RON, RUB, SAR, SEK, SGD, THB, TRY, TWD, UAH, USD, VES, VND, ZAR.
 * @member {String} currency
 */
PixelProperties.prototype.currency = undefined;

/**
 * Description of the item or page.
 * @member {String} description
 */
PixelProperties.prototype.description = undefined;

/**
 * The text string that was input by a user. For instance, if a person searches for a product on your website, you can forward the keyword being searched. If a person enters a coupon code at check out, you can forward the code.
 * @member {String} query
 */
PixelProperties.prototype.query = undefined;

/**
 * Value of the order or items sold. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.
 * @member {Number} value
 */
PixelProperties.prototype.value = undefined;

