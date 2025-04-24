/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateSlideDimension model module.
 * @module model/CreativeportfoliocreateSlideDimension
 * @version 0.1.3
 */
export class CreativeportfoliocreateSlideDimension {
  /**
   * Constructs a new <code>CreativeportfoliocreateSlideDimension</code>.
   * @alias module:model/CreativeportfoliocreateSlideDimension
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreateSlideDimension</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateSlideDimension} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateSlideDimension} The populated <code>CreativeportfoliocreateSlideDimension</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateSlideDimension();
      if (data.hasOwnProperty('dimension_height'))
        obj.dimension_height = ApiClient.convertToType(data['dimension_height'], 'Number');
      if (data.hasOwnProperty('dimension_width'))
        obj.dimension_width = ApiClient.convertToType(data['dimension_width'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} dimension_height
 */
CreativeportfoliocreateSlideDimension.prototype.dimension_height = undefined;

/**
 * @member {Number} dimension_width
 */
CreativeportfoliocreateSlideDimension.prototype.dimension_width = undefined;

