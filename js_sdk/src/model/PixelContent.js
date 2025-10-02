/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixelContent model module.
 * @module model/PixelContent
 * @version 0.1.8
 */
export class PixelContent {
  /**
   * Constructs a new <code>PixelContent</code>.
   * @alias module:model/PixelContent
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelContent} obj Optional instance to populate.
   * @return {module:model/PixelContent} The populated <code>PixelContent</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelContent();
      if (data.hasOwnProperty('content_category'))
        obj.content_category = ApiClient.convertToType(data['content_category'], 'String');
      if (data.hasOwnProperty('content_id'))
        obj.content_id = ApiClient.convertToType(data['content_id'], 'String');
      if (data.hasOwnProperty('content_name'))
        obj.content_name = ApiClient.convertToType(data['content_name'], 'String');
      if (data.hasOwnProperty('content_type'))
        obj.content_type = ApiClient.convertToType(data['content_type'], 'String');
      if (data.hasOwnProperty('price'))
        obj.price = ApiClient.convertToType(data['price'], 'Number');
      if (data.hasOwnProperty('quantity'))
        obj.quantity = ApiClient.convertToType(data['quantity'], 'Number');
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'String');
    }
    return obj;
  }
}

/**
 * Category of the page/product.
 * @member {String} content_category
 */
PixelContent.prototype.content_category = undefined;

/**
 * ID of the product item. Example `1077218`
 * @member {String} content_id
 */
PixelContent.prototype.content_id = undefined;

/**
 * Name of the page/product.
 * @member {String} content_name
 */
PixelContent.prototype.content_name = undefined;

/**
 * The content_type object propertys value must be set to either `product`, or `product_group`, depending on how you will configure your data feed when you set up your product catalog. If you will be tracking events associated with individual products, set the value to `product`. If you are tracking events associated with product groups, set it to `product_group` instead.
 * @member {String} content_type
 */
PixelContent.prototype.content_type = undefined;

/**
 * The price of the item. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.
 * @member {Number} price
 */
PixelContent.prototype.price = undefined;

/**
 * The number of the item. 
 * @member {Number} quantity
 */
PixelContent.prototype.quantity = undefined;

/**
 * Status of an order, item, or service. Note: Depending on your use of status, Events API may be required in order to share status changes to TikTok.
 * @member {String} status
 */
PixelContent.prototype.status = undefined;

