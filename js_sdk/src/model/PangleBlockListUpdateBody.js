/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PangleBlockListUpdateBody model module.
 * @module model/PangleBlockListUpdateBody
 * @version 0.1.5
 */
export class PangleBlockListUpdateBody {
  /**
   * Constructs a new <code>PangleBlockListUpdateBody</code>.
   * @alias module:model/PangleBlockListUpdateBody
   * @class
   * @param advertiser_id {String} 
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>PangleBlockListUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PangleBlockListUpdateBody} obj Optional instance to populate.
   * @return {module:model/PangleBlockListUpdateBody} The populated <code>PangleBlockListUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PangleBlockListUpdateBody();
      if (data.hasOwnProperty('add_app_list'))
        obj.add_app_list = ApiClient.convertToType(data['add_app_list'], ['String']);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('clear_old_app'))
        obj.clear_old_app = ApiClient.convertToType(data['clear_old_app'], 'Boolean');
      if (data.hasOwnProperty('delete_app_list'))
        obj.delete_app_list = ApiClient.convertToType(data['delete_app_list'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} add_app_list
 */
PangleBlockListUpdateBody.prototype.add_app_list = undefined;

/**
 * @member {String} advertiser_id
 */
PangleBlockListUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} clear_old_app
 * @default false
 */
PangleBlockListUpdateBody.prototype.clear_old_app = false;

/**
 * @member {Array.<String>} delete_app_list
 */
PangleBlockListUpdateBody.prototype.delete_app_list = undefined;

