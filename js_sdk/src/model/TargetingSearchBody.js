/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The TargetingSearchBody model module.
 * @module model/TargetingSearchBody
 * @version 0.1.7
 */
export class TargetingSearchBody {
  /**
   * Constructs a new <code>TargetingSearchBody</code>.
   * @alias module:model/TargetingSearchBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param keywords {Array.<String>} The keywords that you use to search for targeting tags. Length limit: 1 when search_type is FUZZY_SEARCH. 1,000 when search_type is BATCH_REGION_SEARCH or BATCH_ZIPCODE_SEARCH. If you set search_type as BATCH_ZIPCODE_SEARCH, you need to pass zip codes or postal codes as keywords because this search type only supports exact search. For US zip code targeting, provide the five-digit US zip codes as keywords. Example: [\"10001\",\"10002\"]. For Canadian postal code targeting, provide the three-character Forward Sortation Area (FSA) portions of Canadian postal codes as keywords. Example: [\"A0A\",\"A0B\"].
   * @param objective_type {String} Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.
   * @param placements {Array.<String>} The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to fuzzy search for a zip code ID to be used for zip code targeting in the US or a postal code ID to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.
   * @param search_type {String} The type of search you want to perform. Enum values: FUZZY_SEARCH: To fuzzy search for a single location ID, a zip code ID, or a postal code ID. For this search type, you can only pass one keyword to keywords and a maximum of 100 results will be returned. BATCH_REGION_SEARCH: To search for location IDs in batch. Fuzzy search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword a maximum of 5 results ordered by relevance will be returned. BATCH_ZIPCODE_SEARCH: To search for zip code IDs or postal code IDs in batch. Exact search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword one result or no result will be returned. Note: The enum values BATCH_ZIPCODE_SEARCH and BATCH_REGION_SEARCH can only be used to search for IDs of zip codes (or postal codes) or locations in the US or Canada. In contrast, you can use FUZZY_SEARCH to search for a single ID of a zip code (or postal code) or location in the US or Canada or in another country.
   */
  constructor(advertiser_id, keywords, objective_type, placements, search_type) {
    this.advertiser_id = advertiser_id;
    this.keywords = keywords;
    this.objective_type = objective_type;
    this.placements = placements;
    this.search_type = search_type;
  }

  /**
   * Constructs a <code>TargetingSearchBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TargetingSearchBody} obj Optional instance to populate.
   * @return {module:model/TargetingSearchBody} The populated <code>TargetingSearchBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TargetingSearchBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('brand_safety_partner'))
        obj.brand_safety_partner = ApiClient.convertToType(data['brand_safety_partner'], 'String');
      if (data.hasOwnProperty('brand_safety_type'))
        obj.brand_safety_type = ApiClient.convertToType(data['brand_safety_type'], 'String');
      if (data.hasOwnProperty('geo_types'))
        obj.geo_types = ApiClient.convertToType(data['geo_types'], ['String']);
      if (data.hasOwnProperty('keywords'))
        obj.keywords = ApiClient.convertToType(data['keywords'], ['String']);
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('operating_system'))
        obj.operating_system = ApiClient.convertToType(data['operating_system'], 'String');
      if (data.hasOwnProperty('placements'))
        obj.placements = ApiClient.convertToType(data['placements'], ['String']);
      if (data.hasOwnProperty('promotion_type'))
        obj.promotion_type = ApiClient.convertToType(data['promotion_type'], 'String');
      if (data.hasOwnProperty('region_codes'))
        obj.region_codes = ApiClient.convertToType(data['region_codes'], ['String']);
      if (data.hasOwnProperty('search_type'))
        obj.search_type = ApiClient.convertToType(data['search_type'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
TargetingSearchBody.prototype.advertiser_id = undefined;

/**
 * Required only when brand_safety_type is THIRD_PARTY. Brand safety partner. Enum values: IAS, OPEN_SLATE(The partner is named DoubleVerify on TikTok Ads Manager because the partner has been acquired by DoubleVerify). Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.
 * @member {String} brand_safety_partner
 */
TargetingSearchBody.prototype.brand_safety_partner = undefined;

/**
 * Brand safety type. Valid only when placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.
 * @member {String} brand_safety_type
 */
TargetingSearchBody.prototype.brand_safety_type = undefined;

/**
 * The types of locations that you want to filter the results by. Enum values: COUNTRY (country or region), PROVINCE (province), CITY (city or county), DISTRICT (district or city), DMA (DMA), ZIP_CODE (zip code or postal code). When you specify search_type as FUZZY_SEARCH, the allowed enum values for this field are ZIP_CODE, COUNTRY, PROVINCE, CITY, DISTRICT, and DMA. When you specify search_type as BATCH_ZIPCODE_SEARCH, the allowed enum value for this field is ZIP_CODE. When you specify search_type as BATCH_REGION_SEARCH, the allowed enum values for this field are COUNTRY, PROVINCE, CITY, DISTRICT, and DMA.
 * @member {Array.<String>} geo_types
 */
TargetingSearchBody.prototype.geo_types = undefined;

/**
 * The keywords that you use to search for targeting tags. Length limit: 1 when search_type is FUZZY_SEARCH. 1,000 when search_type is BATCH_REGION_SEARCH or BATCH_ZIPCODE_SEARCH. If you set search_type as BATCH_ZIPCODE_SEARCH, you need to pass zip codes or postal codes as keywords because this search type only supports exact search. For US zip code targeting, provide the five-digit US zip codes as keywords. Example: [\"10001\",\"10002\"]. For Canadian postal code targeting, provide the three-character Forward Sortation Area (FSA) portions of Canadian postal codes as keywords. Example: [\"A0A\",\"A0B\"].
 * @member {Array.<String>} keywords
 */
TargetingSearchBody.prototype.keywords = undefined;

/**
 * Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.
 * @member {String} objective_type
 */
TargetingSearchBody.prototype.objective_type = undefined;

/**
 * Device operating system that you want to target. Enum values: ANDROID, IOS.
 * @member {String} operating_system
 */
TargetingSearchBody.prototype.operating_system = undefined;

/**
 * The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to fuzzy search for a zip code ID to be used for zip code targeting in the US or a postal code ID to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.
 * @member {Array.<String>} placements
 */
TargetingSearchBody.prototype.placements = undefined;

/**
 * Promotion type and you can decide where you'd like to promote your products using this field. You need to specify the field when advertising objective (objective_type) for your campaign is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. For enum values, see Enumeration - Promotion Type.
 * @member {String} promotion_type
 */
TargetingSearchBody.prototype.promotion_type = undefined;

/**
 * The codes of targeted countries or regions that you want to filter the results by. When you specify search_type as BATCH_ZIPCODE_SEARCH or BATCH_REGION_SEARCH, this field is required and needs to be set as US (the US) or CA (Canada). When you specify search_type as FUZZY_SEARCH, this field is optional and you can pass any supported country or region code to this field. To find out the complete list of country or region codes, see Location code.
 * @member {Array.<String>} region_codes
 */
TargetingSearchBody.prototype.region_codes = undefined;

/**
 * The type of search you want to perform. Enum values: FUZZY_SEARCH: To fuzzy search for a single location ID, a zip code ID, or a postal code ID. For this search type, you can only pass one keyword to keywords and a maximum of 100 results will be returned. BATCH_REGION_SEARCH: To search for location IDs in batch. Fuzzy search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword a maximum of 5 results ordered by relevance will be returned. BATCH_ZIPCODE_SEARCH: To search for zip code IDs or postal code IDs in batch. Exact search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword one result or no result will be returned. Note: The enum values BATCH_ZIPCODE_SEARCH and BATCH_REGION_SEARCH can only be used to search for IDs of zip codes (or postal codes) or locations in the US or Canada. In contrast, you can use FUZZY_SEARCH to search for a single ID of a zip code (or postal code) or location in the US or Canada or in another country.
 * @member {String} search_type
 */
TargetingSearchBody.prototype.search_type = undefined;

