/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencefileuploadContextInfo} from './DmpcustomAudiencefileuploadContextInfo.js';

/**
 * The ShareCancelBody model module.
 * @module model/ShareCancelBody
 * @version 0.1.3
 */
export class ShareCancelBody {
  /**
   * Constructs a new <code>ShareCancelBody</code>.
   * @alias module:model/ShareCancelBody
   * @class
   * @param advertiser_id {String} The advertiser ID that performed the operation.
   * @param custom_audience_id {String} The audience ID that you want to stop sharing.
   * @param shared_advertiser_id {String} The advertiser ID you want to stop sharing with. You only need to pass this field if you want to stop sharing audiences with an advertiser.
   */
  constructor(advertiser_id, custom_audience_id, shared_advertiser_id) {
    this.advertiser_id = advertiser_id;
    this.custom_audience_id = custom_audience_id;
    this.shared_advertiser_id = shared_advertiser_id;
  }

  /**
   * Constructs a <code>ShareCancelBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ShareCancelBody} obj Optional instance to populate.
   * @return {module:model/ShareCancelBody} The populated <code>ShareCancelBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ShareCancelBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = DmpcustomAudiencefileuploadContextInfo.constructFromObject(data['context_info']);
      if (data.hasOwnProperty('custom_audience_id'))
        obj.custom_audience_id = ApiClient.convertToType(data['custom_audience_id'], 'String');
      if (data.hasOwnProperty('shared_advertiser_id'))
        obj.shared_advertiser_id = ApiClient.convertToType(data['shared_advertiser_id'], 'String');
    }
    return obj;
  }
}

/**
 * The advertiser ID that performed the operation.
 * @member {String} advertiser_id
 */
ShareCancelBody.prototype.advertiser_id = undefined;

/**
 * @member {module:model/DmpcustomAudiencefileuploadContextInfo} context_info
 */
ShareCancelBody.prototype.context_info = undefined;

/**
 * The audience ID that you want to stop sharing.
 * @member {String} custom_audience_id
 */
ShareCancelBody.prototype.custom_audience_id = undefined;

/**
 * The advertiser ID you want to stop sharing with. You only need to pass this field if you want to stop sharing audiences with an advertiser.
 * @member {String} shared_advertiser_id
 */
ShareCancelBody.prototype.shared_advertiser_id = undefined;

