/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {AssetShareBody} from '../model/AssetShareBody.js';
import {CreativeAssetDeleteBody} from '../model/CreativeAssetDeleteBody.js';
import {FilteringCreativePortfolioList} from '../model/FilteringCreativePortfolioList.js';
import {ImageEditBody} from '../model/ImageEditBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {PlayableDeleteBody} from '../model/PlayableDeleteBody.js';
import {PlayableSaveBody} from '../model/PlayableSaveBody.js';
import {PortfolioCreateBody} from '../model/PortfolioCreateBody.js';
import {ShareableLinkCreateBody} from '../model/ShareableLinkCreateBody.js';
import {SmartTextGenerateBody} from '../model/SmartTextGenerateBody.js';

/**
* CreativeManagement service.
* @module api/CreativeManagementApi
* @version 0.1.7
*/
export class CreativeManagementApi {

    /**
    * Constructs a new CreativeManagementApi. 
    * @alias module:api/CreativeManagementApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the creativeAssetDelete operation.
     * @callback moduleapi/CreativeManagementApi~creativeAssetDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1797202997456897)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CreativeAssetDeleteBody} opts.body 
     * @param {module:api/CreativeManagementApi~creativeAssetDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativeAssetDelete(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativeAssetDelete");
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
        '/open_api/v1.3/creative/asset/delete/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativeAssetShare operation.
     * @callback moduleapi/CreativeManagementApi~creativeAssetShareCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1773192725768193)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/AssetShareBody} opts.body 
     * @param {module:api/CreativeManagementApi~creativeAssetShareCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativeAssetShare(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativeAssetShare");
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
        '/open_api/v1.3/creative/asset/share/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativeImageEdit operation.
     * @callback moduleapi/CreativeManagementApi~creativeImageEditCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id&#x3D;1739067107903489)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/ImageEditBody} opts.body 
     * @param {module:api/CreativeManagementApi~creativeImageEditCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativeImageEdit(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativeImageEdit");
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
        '/open_api/v1.3/creative/image/edit/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativePortfolioCreate operation.
     * @callback moduleapi/CreativeManagementApi~creativePortfolioCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739091950439426)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/PortfolioCreateBody} opts.body 
     * @param {module:api/CreativeManagementApi~creativePortfolioCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativePortfolioCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativePortfolioCreate");
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
        '/open_api/v1.3/creative/portfolio/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativePortfolioGet operation.
     * @callback moduleapi/CreativeManagementApi~creativePortfolioGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739092113671170)
     * @param {String} advertiser_id 
     * @param {String} creative_portfolio_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CreativeManagementApi~creativePortfolioGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativePortfolioGet(advertiser_id, creative_portfolio_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling creativePortfolioGet");
      }
      // verify the required parameter 'creative_portfolio_id' is set
      if (creative_portfolio_id === undefined || creative_portfolio_id === null) {
        throw new Error("Missing the required parameter 'creative_portfolio_id' when calling creativePortfolioGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativePortfolioGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'creative_portfolio_id': creative_portfolio_id
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
        '/open_api/v1.3/creative/portfolio/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativePortfolioList operation.
     * @callback moduleapi/CreativeManagementApi~creativePortfolioListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id&#x3D;1766324010279938)
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/FilteringCreativePortfolioList} opts.filtering 
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:api/CreativeManagementApi~creativePortfolioListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativePortfolioList(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling creativePortfolioList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativePortfolioList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/creative/portfolio/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativeShareableLinkCreate operation.
     * @callback moduleapi/CreativeManagementApi~creativeShareableLinkCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/ShareableLinkCreateBody} opts.body 
     * @param {module:api/CreativeManagementApi~creativeShareableLinkCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativeShareableLinkCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativeShareableLinkCreate");
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
        '/open_api/v1.3/creative/shareable_link/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the creativeSmartTextGenerate operation.
     * @callback moduleapi/CreativeManagementApi~creativeSmartTextGenerateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id&#x3D;1739084248002626)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SmartTextGenerateBody} opts.body 
     * @param {module:api/CreativeManagementApi~creativeSmartTextGenerateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    creativeSmartTextGenerate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling creativeSmartTextGenerate");
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
        '/open_api/v1.3/creative/smart_text/generate/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the discoveryDetail operation.
     * @callback moduleapi/CreativeManagementApi~discoveryDetailCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119047070721)
     * @param {String} hashtag_id 
     * @param {String} discovery_type 
     * @param {String} country_code 
     * @param {String} date_range 
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CreativeManagementApi~discoveryDetailCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    discoveryDetail(hashtag_id, discovery_type, country_code, date_range, advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'hashtag_id' is set
      if (hashtag_id === undefined || hashtag_id === null) {
        throw new Error("Missing the required parameter 'hashtag_id' when calling discoveryDetail");
      }
      // verify the required parameter 'discovery_type' is set
      if (discovery_type === undefined || discovery_type === null) {
        throw new Error("Missing the required parameter 'discovery_type' when calling discoveryDetail");
      }
      // verify the required parameter 'country_code' is set
      if (country_code === undefined || country_code === null) {
        throw new Error("Missing the required parameter 'country_code' when calling discoveryDetail");
      }
      // verify the required parameter 'date_range' is set
      if (date_range === undefined || date_range === null) {
        throw new Error("Missing the required parameter 'date_range' when calling discoveryDetail");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling discoveryDetail");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling discoveryDetail");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'hashtag_id': hashtag_id,'discovery_type': discovery_type,'country_code': country_code,'date_range': date_range,'advertiser_id': advertiser_id
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
        '/open_api/v1.3/discovery/detail/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the discoveryTrendingList operation.
     * @callback moduleapi/CreativeManagementApi~discoveryTrendingListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119032526849)
     * @param {String} discovery_type 
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.country_code  (default to <.>)
     * @param {String} opts.category_name  (default to <.>)
     * @param {String} opts.date_range  (default to <.>)
     * @param {module:api/CreativeManagementApi~discoveryTrendingListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    discoveryTrendingList(discovery_type, advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'discovery_type' is set
      if (discovery_type === undefined || discovery_type === null) {
        throw new Error("Missing the required parameter 'discovery_type' when calling discoveryTrendingList");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling discoveryTrendingList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling discoveryTrendingList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'discovery_type': discovery_type,'country_code': opts['country_code'],'category_name': opts['category_name'],'date_range': opts['date_range'],'advertiser_id': advertiser_id
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
        '/open_api/v1.3/discovery/trending_list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the playableDelete operation.
     * @callback moduleapi/CreativeManagementApi~playableDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1737733368940546)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/PlayableDeleteBody} opts.body 
     * @param {module:api/CreativeManagementApi~playableDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    playableDelete(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling playableDelete");
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
        '/open_api/v1.3/playable/delete/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the playableGet operation.
     * @callback moduleapi/CreativeManagementApi~playableGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732758495234)
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.playable_id 
     * @param {String} opts.playable_url 
     * @param {String} opts.playable_name 
     * @param {String} opts.status 
     * @param {String} opts.operation_status  (default to <.>)
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:api/CreativeManagementApi~playableGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    playableGet(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling playableGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling playableGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'playable_id': opts['playable_id'],'playable_url': opts['playable_url'],'playable_name': opts['playable_name'],'status': opts['status'],'operation_status': opts['operation_status'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/playable/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the playableSave operation.
     * @callback moduleapi/CreativeManagementApi~playableSaveCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732203851777)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/PlayableSaveBody} opts.body 
     * @param {module:api/CreativeManagementApi~playableSaveCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    playableSave(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling playableSave");
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
        '/open_api/v1.3/playable/save/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the playableUpload operation.
     * @callback moduleapi/CreativeManagementApi~playableUploadCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1737730926765057)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.advertiser_id 
     * @param {String} opts.file_id 
     * @param {Blob} opts.playable_package 
     * @param {String} opts.upload_type 
     * @param {module:api/CreativeManagementApi~playableUploadCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    playableUpload(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling playableUpload");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        'advertiser_id': opts['advertiser_id'],'file_id': opts['file_id'],'playable_package': opts['playable_package'],'upload_type': opts['upload_type']
      };

      let authNames = [];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/playable/upload/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the playableValidate operation.
     * @callback moduleapi/CreativeManagementApi~playableValidateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732054892545)
     * @param {String} advertiser_id 
     * @param {String} playable_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CreativeManagementApi~playableValidateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    playableValidate(advertiser_id, playable_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling playableValidate");
      }
      // verify the required parameter 'playable_id' is set
      if (playable_id === undefined || playable_id === null) {
        throw new Error("Missing the required parameter 'playable_id' when calling playableValidate");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling playableValidate");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'playable_id': playable_id
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
        '/open_api/v1.3/playable/validate/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}