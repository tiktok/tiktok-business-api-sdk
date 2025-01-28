/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The TargetingInfoBody model module.
 * @module model/TargetingInfoBody
 * @version 0.1.3
 */
export class TargetingInfoBody {
  /**
   * Constructs a new <code>TargetingInfoBody</code>.
   * @alias module:model/TargetingInfoBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param targeting_ids {Array.<String>} Targeting tag IDs. You can pass in location IDs, zip code IDs or postal code IDs, a combination of location IDs, zip code IDs or postal code IDs, or ISP IDs. Max size: 1,000. You can get location IDs, zip code IDs, or postal code IDs via geo_id returned from /tool/targeting/search/, or get location IDs via location_id returned from /tool/region/. You can get ISP IDs via isp_id returned from /tool/targeting/list/.
   */
  constructor(advertiser_id, targeting_ids) {
    this.advertiser_id = advertiser_id;
    this.targeting_ids = targeting_ids;
  }

  /**
   * Constructs a <code>TargetingInfoBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TargetingInfoBody} obj Optional instance to populate.
   * @return {module:model/TargetingInfoBody} The populated <code>TargetingInfoBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TargetingInfoBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('brand_safety_partner'))
        obj.brand_safety_partner = ApiClient.convertToType(data['brand_safety_partner'], 'String');
      if (data.hasOwnProperty('brand_safety_type'))
        obj.brand_safety_type = ApiClient.convertToType(data['brand_safety_type'], 'String');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('operating_system'))
        obj.operating_system = ApiClient.convertToType(data['operating_system'], 'String');
      if (data.hasOwnProperty('placements'))
        obj.placements = ApiClient.convertToType(data['placements'], ['String']);
      if (data.hasOwnProperty('promotion_type'))
        obj.promotion_type = ApiClient.convertToType(data['promotion_type'], 'String');
      if (data.hasOwnProperty('scene'))
        obj.scene = ApiClient.convertToType(data['scene'], 'String');
      if (data.hasOwnProperty('targeting_ids'))
        obj.targeting_ids = ApiClient.convertToType(data['targeting_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
TargetingInfoBody.prototype.advertiser_id = undefined;

/**
 * Required only when brand_safety_type is THIRD_PARTY. Brand safety partner. Enum values: IAS, OPEN_SLATE(The partner is named DoubleVerify on TikTok Ads Manager because the partner has been acquired by DoubleVerify). Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.
 * @member {String} brand_safety_partner
 */
TargetingInfoBody.prototype.brand_safety_partner = undefined;

/**
 * Brand safety type. Valid only when scene is set as GEO and placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.
 * @member {String} brand_safety_type
 */
TargetingInfoBody.prototype.brand_safety_type = undefined;

/**
 * Required when scene is set as GEO. Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.
 * @member {String} objective_type
 */
TargetingInfoBody.prototype.objective_type = undefined;

/**
 * Valid only when scene is set as GEO. Device operating system that you want to target. Enum values: ANDROID, IOS.
 * @member {String} operating_system
 */
TargetingInfoBody.prototype.operating_system = undefined;

/**
 * Required when scene is set as GEO. The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to get information about zip code IDs to be used for zip code targeting in the US or postal code IDs to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.
 * @member {Array.<String>} placements
 */
TargetingInfoBody.prototype.placements = undefined;

/**
 * Required when scene is set as GEO and objective_type is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. Promotion type and you can decide where you'd like to promote your products using this field. For enum values, see Enumeration - Promotion Type.
 * @member {String} promotion_type
 */
TargetingInfoBody.prototype.promotion_type = undefined;

/**
 * The targeting type that the specified targeting_ids is used for. Enum values: GEO: Geographical targeting, which consists of administrative region targeting and zip code targeting (or postal code targeting). ISP : Internet Service Provider targeting. Default value: GEO.
 * @member {String} scene
 * @default 'GEO'
 */
TargetingInfoBody.prototype.scene = 'GEO';

/**
 * Targeting tag IDs. You can pass in location IDs, zip code IDs or postal code IDs, a combination of location IDs, zip code IDs or postal code IDs, or ISP IDs. Max size: 1,000. You can get location IDs, zip code IDs, or postal code IDs via geo_id returned from /tool/targeting/search/, or get location IDs via location_id returned from /tool/region/. You can get ISP IDs via isp_id returned from /tool/targeting/list/.
 * @member {Array.<String>} targeting_ids
 */
TargetingInfoBody.prototype.targeting_ids = undefined;

