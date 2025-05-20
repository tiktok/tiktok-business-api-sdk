/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The LinkUpdateBody model module.
 * @module model/LinkUpdateBody
 * @version 0.1.7
 */
export class LinkUpdateBody {
  /**
   * Constructs a new <code>LinkUpdateBody</code>.
   * @alias module:model/LinkUpdateBody
   * @class
   * @param advertiser_ids {Array.<String>} 
   * @param bc_id {String} 
   * @param pixel_code {String} 
   * @param relation_status {String} 
   */
  constructor(advertiser_ids, bc_id, pixel_code, relation_status) {
    this.advertiser_ids = advertiser_ids;
    this.bc_id = bc_id;
    this.pixel_code = pixel_code;
    this.relation_status = relation_status;
  }

  /**
   * Constructs a <code>LinkUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LinkUpdateBody} obj Optional instance to populate.
   * @return {module:model/LinkUpdateBody} The populated <code>LinkUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new LinkUpdateBody();
      if (data.hasOwnProperty('advertiser_ids'))
        obj.advertiser_ids = ApiClient.convertToType(data['advertiser_ids'], ['String']);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('pixel_code'))
        obj.pixel_code = ApiClient.convertToType(data['pixel_code'], 'String');
      if (data.hasOwnProperty('relation_status'))
        obj.relation_status = ApiClient.convertToType(data['relation_status'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} advertiser_ids
 */
LinkUpdateBody.prototype.advertiser_ids = undefined;

/**
 * @member {String} bc_id
 */
LinkUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} pixel_code
 */
LinkUpdateBody.prototype.pixel_code = undefined;

/**
 * @member {String} relation_status
 */
LinkUpdateBody.prototype.relation_status = undefined;

