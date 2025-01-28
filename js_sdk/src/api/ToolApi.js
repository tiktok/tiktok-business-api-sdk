/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {BidRecommendBody} from '../model/BidRecommendBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {TargetingInfoBody} from '../model/TargetingInfoBody.js';
import {TargetingSearchBody} from '../model/TargetingSearchBody.js';

/**
* Tool service.
* @module api/ToolApi
* @version 0.1.3
*/
export class ToolApi {

    /**
    * Constructs a new ToolApi. 
    * @alias module:api/ToolApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the searchRegion operation.
     * @callback moduleapi/ToolApi~searchRegionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get available locations by advertiser ID [Search Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1773644763581441)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.language The language you want the returned region name to be translated into. Default value: en Currently, we only support zh, fr, es, ko, vi, en, hi, it, tr, ru, ja, id, de, ms, ar, and th Note: If you do not pass in one of the supported values above, it will return as the default en. (default to <.>)
     * @param {module:api/ToolApi~searchRegionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    searchRegion(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling searchRegion");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling searchRegion");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'language': opts['language']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/search/region/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolActionCategory operation.
     * @callback moduleapi/ToolApi~toolActionCategoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get action categories [Tool action](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737166752522241)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.special_industries Ad categories. Enum values:&#x60;HOUSING&#x60;: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. &#x60;EMPLOYMENT&#x60;: Ads for job offers, internship, professional certification programs or other related opportunities. &#x60;CREDIT&#x60;: Ads for credit card offers, auto loans, long-term financing or other related opportunities.Note: This field is only supported for advertisers who are registered in America or Canada
     * @param {module:api/ToolApi~toolActionCategoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolActionCategory(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolActionCategory");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolActionCategory");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'special_industries': this.apiClient.buildCollectionParam(opts['special_industries'], 'multi')
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/action_category/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolBidRecommend operation.
     * @callback moduleapi/ToolApi~toolBidRecommendCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a suggested bid [Tool Bid Recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737107845597186)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/BidRecommendBody} opts.body 
     * @param {module:api/ToolApi~toolBidRecommendCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolBidRecommend(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolBidRecommend");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/bid/recommend/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolBrandSafetyPartnerAuthorizeStatus operation.
     * @callback moduleapi/ToolApi~toolBrandSafetyPartnerAuthorizeStatusCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the authorization status of a Brand Safety partner [Tool Brand_safety Partner Authorize Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738456743621634)
     * @param {String} partner Brand Safety post bid measurement partner. Enum values: Zefr.
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolBrandSafetyPartnerAuthorizeStatusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolBrandSafetyPartnerAuthorizeStatus(partner, advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'partner' is set
      if (partner === undefined || partner === null) {
        throw new Error("Missing the required parameter 'partner' when calling toolBrandSafetyPartnerAuthorizeStatus");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolBrandSafetyPartnerAuthorizeStatus");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolBrandSafetyPartnerAuthorizeStatus");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'partner': partner,'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/brand_safety/partner/authorize/status/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolCarrier operation.
     * @callback moduleapi/ToolApi~toolCarrierCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get carriers [Tool carrier](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737168013095938)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolCarrierCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolCarrier(advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolCarrier");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolCarrier");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/carrier/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolContextualTagGet operation.
     * @callback moduleapi/ToolApi~toolContextualTagGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get available contextual tags [Tool Contextual_tag Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747118654465)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} objective_type Advertising objective. Only supports REACH, VIDEO_VIEWS, RF_REACH.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.region_codes Country or region codes.
     * @param {String} opts.brand_safety_type Brand safety type. Default value: STANDARD_INVENTORY. Enum values: EXPANDED_INVENTORY: Use TikTok&#x27;s brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and may contain some mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok&#x27;s brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok&#x27;s brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.
     * @param {String} opts.rf_campaign_type Note: When objective_type is specified as RF_REACH, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when objective_type is not specified as RF_REACH. Enum values: STANDARD (Reach &amp; Frequency campaign), PULSE（TikTok Pulse campaign）
     * @param {module:api/ToolApi~toolContextualTagGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolContextualTagGet(advertiser_id, objective_type, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolContextualTagGet");
      }
      // verify the required parameter 'objective_type' is set
      if (objective_type === undefined || objective_type === null) {
        throw new Error("Missing the required parameter 'objective_type' when calling toolContextualTagGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolContextualTagGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'objective_type': objective_type,'region_codes': this.apiClient.buildCollectionParam(opts['region_codes'], 'multi'),'brand_safety_type': opts['brand_safety_type'],'rf_campaign_type': opts['rf_campaign_type']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/contextual_tag/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolContextualTagInfo operation.
     * @callback moduleapi/ToolApi~toolContextualTagInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get details of contextual tags [Tool Contextual_tag Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747180830722)
     * @param {String} advertiser_id Advertiser ID.
     * @param {Array.<String>} contextual_tag_ids Contextual tag IDs.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolContextualTagInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolContextualTagInfo(advertiser_id, contextual_tag_ids, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolContextualTagInfo");
      }
      // verify the required parameter 'contextual_tag_ids' is set
      if (contextual_tag_ids === undefined || contextual_tag_ids === null) {
        throw new Error("Missing the required parameter 'contextual_tag_ids' when calling toolContextualTagInfo");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolContextualTagInfo");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'contextual_tag_ids': this.apiClient.buildCollectionParam(contextual_tag_ids, 'multi')
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/contextual_tag/info/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolDeviceModel operation.
     * @callback moduleapi/ToolApi~toolDeviceModelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get device models [Tool device model](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172880570369)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolDeviceModelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolDeviceModel(advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolDeviceModel");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolDeviceModel");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/device_model/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolHashtagGet operation.
     * @callback moduleapi/ToolApi~toolHashtagGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get targeting hashtags by ID [Tool Hashtag Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736280889167874)
     * @param {String} advertiser_id Advertiser ID
     * @param {Array.<String>} keyword_ids List of keyword IDs
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolHashtagGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolHashtagGet(advertiser_id, keyword_ids, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolHashtagGet");
      }
      // verify the required parameter 'keyword_ids' is set
      if (keyword_ids === undefined || keyword_ids === null) {
        throw new Error("Missing the required parameter 'keyword_ids' when calling toolHashtagGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolHashtagGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'keyword_ids': this.apiClient.buildCollectionParam(keyword_ids, 'multi')
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/hashtag/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolHashtagRecommend operation.
     * @callback moduleapi/ToolApi~toolHashtagRecommendCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search for targeting hashtags [Tool Hashtag Recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736271339521025)
     * @param {String} advertiser_id Advertiser ID.
     * @param {Array.<String>} keywords Keywords that you want to get recommended hashtags for. If you specify multiple unrelated keywords and set operator to AND, it is possible that no recommended hashtags are returned. Max size: 10.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.operator The operator to be used between the keywords. Enum values: AND: Recommended hashtags will be generated based on all the keywords specified in keywords. OR: Recommended hashtags will be generated separately for each individual keyword in keywords. Default value: AND. (default to <.>)
     * @param {module:api/ToolApi~toolHashtagRecommendCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolHashtagRecommend(advertiser_id, keywords, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolHashtagRecommend");
      }
      // verify the required parameter 'keywords' is set
      if (keywords === undefined || keywords === null) {
        throw new Error("Missing the required parameter 'keywords' when calling toolHashtagRecommend");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolHashtagRecommend");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'keywords': this.apiClient.buildCollectionParam(keywords, 'multi'),'operator': opts['operator']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/hashtag/recommend/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolInterestCategory operation.
     * @callback moduleapi/ToolApi~toolInterestCategoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get interest categories [Tool Interest category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174348712961)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Number} opts.version Version of interest category. Enum values:&#x60;1&#x60;(&#x60;interest_category&#x60;), &#x60;2&#x60; (&#x60;interest_category_v2&#x60;)。Default: &#x60;2&#x60;
     * @param {Array.<String>} opts.placements The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). The interest categories available for different placements may be different, and the field only takes effect when &#x60;version&#x60; &#x3D; &#x60;2&#x60;.
     * @param {Array.<String>} opts.special_industries Defines ad categories. Enum values:&#x60;HOUSING&#x60;: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. &#x60;EMPLOYMENT&#x60;: Ads for job offers, internship, professional certification programs or other related opportunities. &#x60;CREDIT&#x60;: Ads for credit card offers, auto loans, long-term financing or other related opportunities. Note: This field is only supported for advertisers who are registered in America or Canada
     * @param {String} opts.language Category name language in repsonse. Default value: &#x60;en&#x60;. Supported languages: &#x60;en&#x60;, &#x60; zh&#x60;, &#x60; ja&#x60;, &#x60; de&#x60;, &#x60; es&#x60;, &#x60; fr&#x60;, &#x60; id&#x60;, &#x60; it&#x60;, &#x60; ko&#x60;, &#x60; ru&#x60;, &#x60; th&#x60;, &#x60; tr&#x60;, &#x60; vi&#x60;, &#x60; ar&#x60;, &#x60; pt&#x60;, &#x60; ms&#x60;.For details, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138)
     * @param {module:api/ToolApi~toolInterestCategoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolInterestCategory(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolInterestCategory");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolInterestCategory");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'version': opts['version'],'placements': this.apiClient.buildCollectionParam(opts['placements'], 'multi'),'special_industries': this.apiClient.buildCollectionParam(opts['special_industries'], 'multi'),'language': opts['language']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/interest_category/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolInterestKeywordGet operation.
     * @callback moduleapi/ToolApi~toolInterestKeywordGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get additional interest categories by ID [Tool Interest_keyword Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1763590894544897)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Object} opts.filtering Filtering conditions.
     * @param {Array.<Object>} opts.keyword_query Information of the additional interest category you want to get. Max size &#x3D; 50.
     * @param {module:api/ToolApi~toolInterestKeywordGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolInterestKeywordGet(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolInterestKeywordGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolInterestKeywordGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'filtering': opts['filtering'],'keyword_query': this.apiClient.buildCollectionParam(opts['keyword_query'], 'multi')
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/interest_keyword/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolInterestKeywordRecommend operation.
     * @callback moduleapi/ToolApi~toolInterestKeywordRecommendCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get interest keywords [Tool kyword recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737180852720642)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} keyword Seed keyword that you use to get recommended keywords. You can specify only one seed keyword
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.language Keyword language. Default value: &#x60;en&#x60;. Note that target audience languages are not limited by keyword languages. You can use English keywords to target audience that do not speak English. Supported languages: &#x60;fr&#x60;, &#x60;id&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;ms&#x60;, &#x60;ar&#x60;, &#x60;vi&#x60;, &#x60;en&#x60;, &#x60;ru&#x60;, &#x60;es&#x60;, &#x60;th&#x60;, &#x60;tr&#x60;, &#x60;hi&#x60;, &#x60;zh&#x60;, &#x60;de&#x60;, &#x60;ko&#x60;
     * @param {Number} opts.limit Number of recommended keywords you want to get. Default value: 50. Value range: 1-50
     * @param {String} opts.mode Search mode. Enum values: &#x60;FUZZ_MATCH&#x60;, &#x60;SEMANTIC_RECOMMEND&#x60;. Default value: &#x60;FUZZ_MATCH&#x60;
     * @param {String} opts.audience_type Audience type. Enum values: &#x60;GENERAL_INTEREST&#x60;: General interest. The audiences have a general, long-term interest in a video category. &#x60;PURCHASE_INTENTION&#x60;: Purchase intent. The audiences recent behavior suggests they may buy something related to a content category. Default value: &#x60;GENERAL_INTEREST&#x60;
     * @param {module:api/ToolApi~toolInterestKeywordRecommendCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolInterestKeywordRecommend(advertiser_id, keyword, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolInterestKeywordRecommend");
      }
      // verify the required parameter 'keyword' is set
      if (keyword === undefined || keyword === null) {
        throw new Error("Missing the required parameter 'keyword' when calling toolInterestKeywordRecommend");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolInterestKeywordRecommend");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'keyword': keyword,'language': opts['language'],'limit': opts['limit'],'mode': opts['mode'],'audience_type': opts['audience_type']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/interest_keyword/recommend/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolLanguage operation.
     * @callback moduleapi/ToolApi~toolLanguageCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get languages [Tool Language](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737188554152962)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolLanguageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolLanguage(advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolLanguage");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolLanguage");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/language/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolOpenUrl operation.
     * @callback moduleapi/ToolApi~toolOpenUrlCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a TikTok in-app link [Tool Open_url](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738457335681026)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} url Open URL that you want to get the internal link for.
     * @param {String} url_type Type of the open TikTok URL. Enum: USER_PROFILE VIDEO: Video detail page HASHTAG_CHALLENGE: Hashtag challenge page MUSIC: Music page STICKER: Sticker (special effect) page STICKER_SHOOTER: Shoot a video with a sticker (special effect).
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolOpenUrlCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolOpenUrl(advertiser_id, url, url_type, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolOpenUrl");
      }
      // verify the required parameter 'url' is set
      if (url === undefined || url === null) {
        throw new Error("Missing the required parameter 'url' when calling toolOpenUrl");
      }
      // verify the required parameter 'url_type' is set
      if (url_type === undefined || url_type === null) {
        throw new Error("Missing the required parameter 'url_type' when calling toolOpenUrl");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolOpenUrl");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'url': url,'url_type': url_type
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/open_url/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolOsVersion operation.
     * @callback moduleapi/ToolApi~toolOsVersionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get OS versions [Tool Os_version](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738308662898689)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} os_type OS type. Enum values: ANDROID,IOS.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolOsVersionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolOsVersion(advertiser_id, os_type, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolOsVersion");
      }
      // verify the required parameter 'os_type' is set
      if (os_type === undefined || os_type === null) {
        throw new Error("Missing the required parameter 'os_type' when calling toolOsVersion");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolOsVersion");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'os_type': os_type
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/os_version/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolPhoneRegionCode operation.
     * @callback moduleapi/ToolApi~toolPhoneRegionCodeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get region calling codes and region codes for phone numbers [Tool Phone_region_code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1774488637039618)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolPhoneRegionCodeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolPhoneRegionCode(advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolPhoneRegionCode");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolPhoneRegionCode");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/phone_region_code/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolRegion operation.
     * @callback moduleapi/ToolApi~toolRegionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get available locations [Tool Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737189539571713)
     * @param {String} advertiser_id Advertiser ID
     * @param {Array.<String>} placements The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138)
     * @param {String} objective_type Your objective type. For enum values and descriptions, see [Objectives](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585562434561)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.promotion_target_type Valid when &#x60;objective_type&#x60; is &#x60;LEAD_GENERATION&#x60;. The promotion type for Lead Generation objective. Enum values: &#x60;INSTANT_PAGE&#x60;：Instant Form. To create a fast-loading in-app TikTok Instant Form to collect more leads. &#x60;EXTERNAL_WEBSITE&#x60;：Website Form. To use a landing page that has the Website Form or the TikTok Instant Page that redirects to the website with the Website Form to collect more leads.Note: The field is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative
     * @param {String} opts.operating_system Operating systems that you want to target. Enum values: &#x60;ANDROID&#x60;, &#x60;IOS&#x60;
     * @param {String} opts.brand_safety_type Brand safety type. Valid only when &#x60;placements&#x60; is set as &#x60;PLACEMENT_TIKTOK&#x60;. Default value: &#x60;NO_BRAND_SAFETY&#x60;
     * @param {String} opts.brand_safety_partner Brand safety partner. Required when &#x60;brand_safety_type&#x60; is &#x60;THIRD_PARTY&#x60;, and &#x60;placements&#x60; needs to be set as &#x60;PLACEMENT_TIKTOK&#x60;. Enum values: &#x60;IAS&#x60;, &#x60;OPEN_SLATE&#x60;.Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative
     * @param {String} opts.level_range Location level you want to get. Enum values: &#x60;ALL&#x60;: all levels&#x60;TO_COUNTRY&#x60;: only country or region level &#x60;TO_PROVINCE&#x60;: country and province level; DMA and Metropolitan are at province level.&#x60;TO_CITY&#x60;: country, province, and city levels&#x60;TO_DISTRICT&#x60;: country, province, city, and district levels.
     * @param {String} opts.rf_campaign_type When &#x60;objective_type&#x60; is specified as &#x60;RF_REACH&#x60;, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Enum values: &#x60;STANDARD&#x60; (Reach &amp; Frequency campaign), &#x60;PULSE&#x60; (TikTok Pulse campaign). If you set this field as &#x60;PULSE&#x60;, only one location ID (&#x60;location_id&#x60;) will be returned.Note: Do not pass in this field when &#x60;objective_type&#x60; is not specified as &#x60;RF_REACH&#x60;. You need to pass the &#x60;location_id&#x60; value returned in this endpoint to &#x60;location_ids&#x60; when you use [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738235338194945) to create a TikTok Pulse ad group.
     * @param {module:api/ToolApi~toolRegionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolRegion(advertiser_id, placements, objective_type, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolRegion");
      }
      // verify the required parameter 'placements' is set
      if (placements === undefined || placements === null) {
        throw new Error("Missing the required parameter 'placements' when calling toolRegion");
      }
      // verify the required parameter 'objective_type' is set
      if (objective_type === undefined || objective_type === null) {
        throw new Error("Missing the required parameter 'objective_type' when calling toolRegion");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolRegion");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'placements': this.apiClient.buildCollectionParam(placements, 'multi'),'objective_type': objective_type,'promotion_target_type': opts['promotion_target_type'],'operating_system': opts['operating_system'],'brand_safety_type': opts['brand_safety_type'],'brand_safety_partner': opts['brand_safety_partner'],'level_range': opts['level_range'],'rf_campaign_type': opts['rf_campaign_type']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/region/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolTargetingInfo operation.
     * @callback moduleapi/ToolApi~toolTargetingInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Obtain details about location targeting tags by ID [Tool Targeting Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1761237001980929)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/TargetingInfoBody} opts.body 
     * @param {module:api/ToolApi~toolTargetingInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolTargetingInfo(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolTargetingInfo");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/targeting/info/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolTargetingList operation.
     * @callback moduleapi/ToolApi~toolTargetingListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get internet service providers [Tool Targeting List](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1762962378261506)
     * @param {String} advertiser_id Advertiser ID.
     * @param {Array.<String>} location_ids IDs of the locations that you want to get the supported ISP IDs for. Max size: 1000. To find out the list of location IDs, see Location IDs. Note: You need to pass location IDs at the country or region level. To get the available locations and corresponding IDs based on your placement and objective, use the /tool/region/ and the returned level for location IDs at the country or region level will be COUNTRY.
     * @param {String} scene The targeting type that the targeting tags are used for. The allowed enum values: ISP ( Internet Service Provider targeting).
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolTargetingListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolTargetingList(advertiser_id, location_ids, scene, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolTargetingList");
      }
      // verify the required parameter 'location_ids' is set
      if (location_ids === undefined || location_ids === null) {
        throw new Error("Missing the required parameter 'location_ids' when calling toolTargetingList");
      }
      // verify the required parameter 'scene' is set
      if (scene === undefined || scene === null) {
        throw new Error("Missing the required parameter 'scene' when calling toolTargetingList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolTargetingList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'location_ids': this.apiClient.buildCollectionParam(location_ids, 'multi'),'scene': scene
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/targeting/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolTargetingSearch operation.
     * @callback moduleapi/ToolApi~toolTargetingSearchCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search for location targeting tags [Tool Targeting Search](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1761236883355649)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/TargetingSearchBody} opts.body 
     * @param {module:api/ToolApi~toolTargetingSearchCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolTargetingSearch(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolTargetingSearch");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/targeting/search/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolTimezone operation.
     * @callback moduleapi/ToolApi~toolTimezoneCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get time zones [Tool Timezone](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738455961470977)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolTimezoneCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolTimezone(advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolTimezone");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolTimezone");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/timezone/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolUrlValidate operation.
     * @callback moduleapi/ToolApi~toolUrlValidateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the verification results of a URL [Tool Url_validate](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1774487686007810)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} url The URL that you want to get verification results for.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ToolApi~toolUrlValidateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolUrlValidate(advertiser_id, url, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolUrlValidate");
      }
      // verify the required parameter 'url' is set
      if (url === undefined || url === null) {
        throw new Error("Missing the required parameter 'url' when calling toolUrlValidate");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolUrlValidate");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'url': url
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/url_validate/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the toolVboStatus operation.
     * @callback moduleapi/ToolApi~toolVboStatusCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Check Value-Based Optimization eligibility [Tool Vbo_status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1770016073586753)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} objective_type Advertising objective. Set this field to APP_PROMOTION, WEB_CONVERSIONS, or PRODUCT_SALES. When you set this field to any other objective, vo_status will be NOT_SUPPORT because these objectives are not supported for VBO. For enum values and descriptions, see Objectives. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id.
     * @param {String} promotion_type Promotion type and you can decide where you&#x27;d like to promote your products using this field. For enum values, see Enumeration - Promotion Type. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id.
     * @param {Array.<String>} placements The apps where you want to deliver your ads. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.pixel_id Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. Pixel ID. When you pass in this field, you need to specify optimization_event at the same time. To get Pixel IDs, use the /pixel/list/ endpoint.
     * @param {String} opts.app_id Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. The Application ID of the promoted app. To get App IDs, use the /app/list/ endpoint.
     * @param {String} opts.optimization_event Required when pixel_id is passed. Ignored when app_id is passed. Conversion event for the ad group. See Conversion events for more.
     * @param {String} opts.ios14_quota_type Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. We recommend using campaign_type alone when you specify an iOS 14 Dedicated Campaign. campaign_type as REGULAR_CAMPAIGN or ios14_quota_type as UNOCCUPIED both indicate a non-iOS 14 Dedicated Campaign. campaign_type as IOS14_CAMPAIGN or ios14_quota_type as OCCUPIED both indicate an iOS 14 Dedicated Campaign. Whether the campaign will be counted towards the iOS 14 Dedicated Campaign quota. Enum values: OCCUPIED: The campaign is an iOS 14 Dedicated Campaign. UNOCCUPIED: The campaign is not an iOS 14 Dedicated Campaign.
     * @param {String} opts.app_promotion_type Required when objective_type is APP_PROMOTION. App promotion type. Enum values: APP_INSTALL: Get new users to install your app. APP_RETARGETING: Re-engage existing users to take action in your app. Note: Only the enum value APP_INSTALL can be used in an iOS14 Dedicated Campaign.
     * @param {String} opts.store_id Valid only when objective_type is PRODUCT_SALES. ID of the TikTok Shop. Note: To get the TikTok Shop ID, you can use /bc/asset/get/: When in the response asset_type is TIKTOK_SHOP, the returned asset_id is the TikTok Shop ID.
     * @param {String} opts.campaign_app_profile_page_state Whether to use App Profile Page at the campaign level to optimize delivery. Enum values: ON, OFF. You can use the field only when objective_type is APP_PROMOTION and your campaign is an iOS14 Dedicated Campaign (ios14_quota_type &#x3D;OCCUPIED). Otherwise, an error will occur.
     * @param {Boolean} opts.is_smart_performance_campaign Whether the campaign is a Smart+ Campaign or not. Enum values: true, false.
     * @param {Boolean} opts.budget_optimize_on Whether to enable Campaign Budget Optimization (CBO). Enum values: true, false. For details about CBO, see Campaign Budget Optimization. (default to <.>)
     * @param {String} opts.campaign_type Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. Campaign type. Enums values: REGULAR_CAMPAIGN: non-iOS 14 Dedicated Campaign. IOS14_CAMPAIGN: iOS 14 Dedicated Campaign. The value IOS14_CAMPAIGN can only be used when: objective_type is PRODUCT_SALES. objective_type is APP_PROMOTION and app_promotion_type is APP_INSTALL.
     * @param {module:api/ToolApi~toolVboStatusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    toolVboStatus(advertiser_id, objective_type, promotion_type, placements, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling toolVboStatus");
      }
      // verify the required parameter 'objective_type' is set
      if (objective_type === undefined || objective_type === null) {
        throw new Error("Missing the required parameter 'objective_type' when calling toolVboStatus");
      }
      // verify the required parameter 'promotion_type' is set
      if (promotion_type === undefined || promotion_type === null) {
        throw new Error("Missing the required parameter 'promotion_type' when calling toolVboStatus");
      }
      // verify the required parameter 'placements' is set
      if (placements === undefined || placements === null) {
        throw new Error("Missing the required parameter 'placements' when calling toolVboStatus");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling toolVboStatus");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'objective_type': objective_type,'promotion_type': promotion_type,'placements': this.apiClient.buildCollectionParam(placements, 'multi'),'pixel_id': opts['pixel_id'],'app_id': opts['app_id'],'optimization_event': opts['optimization_event'],'ios14_quota_type': opts['ios14_quota_type'],'app_promotion_type': opts['app_promotion_type'],'store_id': opts['store_id'],'campaign_app_profile_page_state': opts['campaign_app_profile_page_state'],'is_smart_performance_campaign': opts['is_smart_performance_campaign'],'budget_optimize_on': opts['budget_optimize_on'],'campaign_type': opts['campaign_type']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/tool/vbo_status/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}