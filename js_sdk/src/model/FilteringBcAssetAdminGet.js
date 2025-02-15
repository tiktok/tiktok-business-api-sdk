/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcAssetAdminGet model module.
 * @module model/FilteringBcAssetAdminGet
 * @version 0.1.4
 */
export class FilteringBcAssetAdminGet {
  /**
   * Constructs a new <code>FilteringBcAssetAdminGet</code>.
   * @alias module:model/FilteringBcAssetAdminGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcAssetAdminGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcAssetAdminGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcAssetAdminGet} The populated <code>FilteringBcAssetAdminGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcAssetAdminGet();
      if (data.hasOwnProperty('advertiser_show_status'))
        obj.advertiser_show_status = ApiClient.convertToType(data['advertiser_show_status'], 'String');
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('relation_status'))
        obj.relation_status = ApiClient.convertToType(data['relation_status'], 'String');
      if (data.hasOwnProperty('relation_type'))
        obj.relation_type = ApiClient.convertToType(data['relation_type'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser account show status.
 * @member {String} advertiser_show_status
 */
FilteringBcAssetAdminGet.prototype.advertiser_show_status = undefined;

/**
 * Keyword filter for asset search.
 * @member {String} keyword
 */
FilteringBcAssetAdminGet.prototype.keyword = undefined;

/**
 * Relation status of the asset.
 * @member {String} relation_status
 */
FilteringBcAssetAdminGet.prototype.relation_status = undefined;

/**
 * Relation type of the asset.
 * @member {String} relation_type
 */
FilteringBcAssetAdminGet.prototype.relation_type = undefined;

