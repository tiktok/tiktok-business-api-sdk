/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcadvertisercreateQualificationInfo model module.
 * @module model/BcadvertisercreateQualificationInfo
 * @version 0.1.9
 */
export class BcadvertisercreateQualificationInfo {
  /**
   * Constructs a new <code>BcadvertisercreateQualificationInfo</code>.
   * Qualification information.  Required when your Business Center type is &#x60;AGENCY&#x60;. &lt;p&gt;&lt;span style&#x3D;\&quot;color:darkred\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;&lt;/span&gt;: Do not specify this object when your Business Center type is &#x60;DIRECT&#x60;, or an error will occur.
   * @alias module:model/BcadvertisercreateQualificationInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>BcadvertisercreateQualificationInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcadvertisercreateQualificationInfo} obj Optional instance to populate.
   * @return {module:model/BcadvertisercreateQualificationInfo} The populated <code>BcadvertisercreateQualificationInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcadvertisercreateQualificationInfo();
      if (data.hasOwnProperty('license_image_id'))
        obj.license_image_id = ApiClient.convertToType(data['license_image_id'], 'String');
      if (data.hasOwnProperty('license_no'))
        obj.license_no = ApiClient.convertToType(data['license_no'], 'String');
      if (data.hasOwnProperty('promotion_link'))
        obj.promotion_link = ApiClient.convertToType(data['promotion_link'], 'String');
      if (data.hasOwnProperty('qualification_image_ids'))
        obj.qualification_image_ids = ApiClient.convertToType(data['qualification_image_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * Qualified Document picture ID, see [Upload a business certificate](https://ads.tiktok.com/marketing_api/docs?id=1739938996913218). Note: This field is required for ad accounts that are registered in the Chinese mainland or Hong Kong
 * @member {String} license_image_id
 */
BcadvertisercreateQualificationInfo.prototype.license_image_id = undefined;

/**
 * Business license number. This field is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico
 * @member {String} license_no
 */
BcadvertisercreateQualificationInfo.prototype.license_no = undefined;

/**
 * Promotion link. Required when your Business Center type is `AGENCY`. Length cannot exceed 255 characters
 * @member {String} promotion_link
 */
BcadvertisercreateQualificationInfo.prototype.promotion_link = undefined;

/**
 * Other Qualified Documents picture ID. See [Upload a business certificate](https://ads.tiktok.com/marketing_api/docs?id=1739938996913218). Note: This field is required if the ad account or the Business Center is registered in France, Brazil, or Mexico
 * @member {Array.<String>} qualification_image_ids
 */
BcadvertisercreateQualificationInfo.prototype.qualification_image_ids = undefined;

