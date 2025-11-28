/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {CampaignCreateBody} from '../model/CampaignCreateBody.js';
import {CampaignStatusUpdateBody} from '../model/CampaignStatusUpdateBody.js';
import {CampaignUpdateBody} from '../model/CampaignUpdateBody.js';
import {CustomAnchorVideoList} from '../model/CustomAnchorVideoList.js';
import {FilteringCampaignGet} from '../model/FilteringCampaignGet.js';
import {FilteringSmartPlusCampaignGet} from '../model/FilteringSmartPlusCampaignGet.js';
import {GmvMaxCreateBody} from '../model/GmvMaxCreateBody.js';
import {GmvMaxUpdateBody} from '../model/GmvMaxUpdateBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {SessionCreateBody} from '../model/SessionCreateBody.js';
import {SessionDeleteBody} from '../model/SessionDeleteBody.js';
import {SessionUpdateBody} from '../model/SessionUpdateBody.js';
import {SmartPlusCampaignCreateBody} from '../model/SmartPlusCampaignCreateBody.js';
import {SmartPlusCampaignStatusUpdateBody} from '../model/SmartPlusCampaignStatusUpdateBody.js';
import {SmartPlusCampaignUpdateBody} from '../model/SmartPlusCampaignUpdateBody.js';

/**
* CampaignCreation service.
* @module api/CampaignCreationApi
* @version 0.1.8
*/
export class CampaignCreationApi {

    /**
    * Constructs a new CampaignCreationApi. 
    * @alias module:api/CampaignCreationApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the campaignCreate operation.
     * @callback moduleapi/CampaignCreationApi~campaignCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CampaignCreateBody} opts.body Campaign create body parameters
     * @param {module:api/CampaignCreationApi~campaignCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignCreate");
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
        '/open_api/v1.3/campaign/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGet operation.
     * @callback moduleapi/CampaignCreationApi~campaignGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/FilteringCampaignGet} opts.filtering Filtering Parameters
     * @param {Number} opts.page Current page
     * @param {Number} opts.page_size Page size
     * @param {Array.<String>} opts.fields Supported values include&#x60;campaign_id &#x60;, &#x60; campaign_name &#x60;, &#x60; advertiser_id &#x60;, &#x60;budget &#x60;, &#x60;budget_mode &#x60;, &#x60;status &#x60;, &#x60;operation_status&#x60;, &#x60;objective &#x60;, &#x60;objective_type &#x60;, &#x60;create_time &#x60;, &#x60;modify_time&#x60;, &#x60;is_new_structure&#x60;, &#x60;campaign_app_profile_page_state&#x60; , &#x60;special_industries&#x60;, &#x60;secondary_status&#x60;.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default.
     * @param {module:api/CampaignCreationApi~campaignGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGet(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling campaignGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size'],'fields': this.apiClient.buildCollectionParam(opts['fields'], 'multi')
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
        '/open_api/v1.3/campaign/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxCreate operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000988713089)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/GmvMaxCreateBody} opts.body 
     * @param {module:api/CampaignCreationApi~campaignGmvMaxCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxCreate");
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
        '/open_api/v1.3/campaign/gmv_max/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxInfo operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000968821762)
     * @param {String} advertiser_id 
     * @param {String} campaign_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CampaignCreationApi~campaignGmvMaxInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxInfo(advertiser_id, campaign_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling campaignGmvMaxInfo");
      }
      // verify the required parameter 'campaign_id' is set
      if (campaign_id === undefined || campaign_id === null) {
        throw new Error("Missing the required parameter 'campaign_id' when calling campaignGmvMaxInfo");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxInfo");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'campaign_id': campaign_id
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
        '/open_api/v1.3/campaign/gmv_max/info/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxSessionCreate operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxSessionCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246967275522)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SessionCreateBody} opts.body 
     * @param {module:api/CampaignCreationApi~campaignGmvMaxSessionCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxSessionCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxSessionCreate");
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
        '/open_api/v1.3/campaign/gmv_max/session/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxSessionDelete operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxSessionDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246983475217)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SessionDeleteBody} opts.body 
     * @param {module:api/CampaignCreationApi~campaignGmvMaxSessionDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxSessionDelete(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxSessionDelete");
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
        '/open_api/v1.3/campaign/gmv_max/session/delete/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxSessionGet operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxSessionGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247031331842)
     * @param {String} advertiser_id 
     * @param {Array.<String>} session_ids 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CampaignCreationApi~campaignGmvMaxSessionGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxSessionGet(advertiser_id, session_ids, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling campaignGmvMaxSessionGet");
      }
      // verify the required parameter 'session_ids' is set
      if (session_ids === undefined || session_ids === null) {
        throw new Error("Missing the required parameter 'session_ids' when calling campaignGmvMaxSessionGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxSessionGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'session_ids': this.apiClient.buildCollectionParam(session_ids, 'multi')
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
        '/open_api/v1.3/campaign/gmv_max/session/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxSessionList operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxSessionListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246996436162)
     * @param {String} campaign_id 
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CampaignCreationApi~campaignGmvMaxSessionListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxSessionList(campaign_id, advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'campaign_id' is set
      if (campaign_id === undefined || campaign_id === null) {
        throw new Error("Missing the required parameter 'campaign_id' when calling campaignGmvMaxSessionList");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling campaignGmvMaxSessionList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxSessionList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'campaign_id': campaign_id,'advertiser_id': advertiser_id
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
        '/open_api/v1.3/campaign/gmv_max/session/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxSessionUpdate operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxSessionUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247009119233)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SessionUpdateBody} opts.body 
     * @param {module:api/CampaignCreationApi~campaignGmvMaxSessionUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxSessionUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxSessionUpdate");
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
        '/open_api/v1.3/campaign/gmv_max/session/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignGmvMaxUpdate operation.
     * @callback moduleapi/CampaignCreationApi~campaignGmvMaxUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001009002497)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/GmvMaxUpdateBody} opts.body 
     * @param {module:api/CampaignCreationApi~campaignGmvMaxUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignGmvMaxUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignGmvMaxUpdate");
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
        '/open_api/v1.3/campaign/gmv_max/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignStatusUpdate operation.
     * @callback moduleapi/CampaignCreationApi~campaignStatusUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CampaignStatusUpdateBody} opts.body Campaign status update body parameters
     * @param {module:api/CampaignCreationApi~campaignStatusUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignStatusUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignStatusUpdate");
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
        '/open_api/v1.3/campaign/status/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the campaignUpdate operation.
     * @callback moduleapi/CampaignCreationApi~campaignUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CampaignUpdateBody} opts.body Campaign update body parameters
     * @param {module:api/CampaignCreationApi~campaignUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    campaignUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling campaignUpdate");
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
        '/open_api/v1.3/campaign/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the gmvMaxBidRecommend operation.
     * @callback moduleapi/CampaignCreationApi~gmvMaxBidRecommendCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001024720897)
     * @param {String} advertiser_id 
     * @param {String} store_id 
     * @param {String} shopping_ads_type 
     * @param {String} optimization_goal 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.item_group_ids 
     * @param {String} opts.identity_id 
     * @param {module:api/CampaignCreationApi~gmvMaxBidRecommendCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxBidRecommend(advertiser_id, store_id, shopping_ads_type, optimization_goal, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxBidRecommend");
      }
      // verify the required parameter 'store_id' is set
      if (store_id === undefined || store_id === null) {
        throw new Error("Missing the required parameter 'store_id' when calling gmvMaxBidRecommend");
      }
      // verify the required parameter 'shopping_ads_type' is set
      if (shopping_ads_type === undefined || shopping_ads_type === null) {
        throw new Error("Missing the required parameter 'shopping_ads_type' when calling gmvMaxBidRecommend");
      }
      // verify the required parameter 'optimization_goal' is set
      if (optimization_goal === undefined || optimization_goal === null) {
        throw new Error("Missing the required parameter 'optimization_goal' when calling gmvMaxBidRecommend");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxBidRecommend");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'store_id': store_id,'shopping_ads_type': shopping_ads_type,'optimization_goal': optimization_goal,'item_group_ids': this.apiClient.buildCollectionParam(opts['item_group_ids'], 'multi'),'identity_id': opts['identity_id']
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
        '/open_api/v1.3/gmv_max/bid/recommend/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the gmvMaxCustomAnchorVideoListGet operation.
     * @callback moduleapi/CampaignCreationApi~gmvMaxCustomAnchorVideoListGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1830215925061633)
     * @param {Number} advertiser_id 
     * @param {Number} campaign_custom_anchor_video_id 
     * @param {Array.<module:model/CustomAnchorVideoList>} custom_anchor_video_list 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CampaignCreationApi~gmvMaxCustomAnchorVideoListGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxCustomAnchorVideoListGet(advertiser_id, campaign_custom_anchor_video_id, custom_anchor_video_list, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxCustomAnchorVideoListGet");
      }
      // verify the required parameter 'campaign_custom_anchor_video_id' is set
      if (campaign_custom_anchor_video_id === undefined || campaign_custom_anchor_video_id === null) {
        throw new Error("Missing the required parameter 'campaign_custom_anchor_video_id' when calling gmvMaxCustomAnchorVideoListGet");
      }
      // verify the required parameter 'custom_anchor_video_list' is set
      if (custom_anchor_video_list === undefined || custom_anchor_video_list === null) {
        throw new Error("Missing the required parameter 'custom_anchor_video_list' when calling gmvMaxCustomAnchorVideoListGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxCustomAnchorVideoListGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'campaign_custom_anchor_video_id': campaign_custom_anchor_video_id,'custom_anchor_video_list': this.apiClient.buildCollectionParam(custom_anchor_video_list, 'multi')
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
        '/open_api/v1.3/gmv_max/custom_anchor_video_list/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the gmvMaxOccupiedCustomShopAdsList operation.
     * @callback moduleapi/CampaignCreationApi~gmvMaxOccupiedCustomShopAdsListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001136924674)
     * @param {String} advertiser_id 
     * @param {String} store_id 
     * @param {Array.<String>} asset_ids 
     * @param {String} occupied_asset_type 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/CampaignCreationApi~gmvMaxOccupiedCustomShopAdsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxOccupiedCustomShopAdsList(advertiser_id, store_id, asset_ids, occupied_asset_type, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxOccupiedCustomShopAdsList");
      }
      // verify the required parameter 'store_id' is set
      if (store_id === undefined || store_id === null) {
        throw new Error("Missing the required parameter 'store_id' when calling gmvMaxOccupiedCustomShopAdsList");
      }
      // verify the required parameter 'asset_ids' is set
      if (asset_ids === undefined || asset_ids === null) {
        throw new Error("Missing the required parameter 'asset_ids' when calling gmvMaxOccupiedCustomShopAdsList");
      }
      // verify the required parameter 'occupied_asset_type' is set
      if (occupied_asset_type === undefined || occupied_asset_type === null) {
        throw new Error("Missing the required parameter 'occupied_asset_type' when calling gmvMaxOccupiedCustomShopAdsList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxOccupiedCustomShopAdsList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'store_id': store_id,'asset_ids': this.apiClient.buildCollectionParam(asset_ids, 'multi'),'occupied_asset_type': occupied_asset_type
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
        '/open_api/v1.3/gmv_max/occupied_custom_shop_ads/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the smartPlusCampaignCreate operation.
     * @callback moduleapi/CampaignCreationApi~smartPlusCampaignCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new campaign [Smart Plus Campaign Create]
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SmartPlusCampaignCreateBody} opts.body 
     * @param {module:api/CampaignCreationApi~smartPlusCampaignCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    smartPlusCampaignCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling smartPlusCampaignCreate");
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
        '/open_api/v1.3/smart_plus/campaign/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the smartPlusCampaignGet operation.
     * @callback moduleapi/CampaignCreationApi~smartPlusCampaignGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve campaign details [Smart Plus Campaign Get]
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.fields 
     * @param {module:model/FilteringSmartPlusCampaignGet} opts.filtering 
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:api/CampaignCreationApi~smartPlusCampaignGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    smartPlusCampaignGet(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling smartPlusCampaignGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling smartPlusCampaignGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'fields': this.apiClient.buildCollectionParam(opts['fields'], 'multi'),'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/smart_plus/campaign/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the smartPlusCampaignStatusUpdate operation.
     * @callback moduleapi/CampaignCreationApi~smartPlusCampaignStatusUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update campaign status [Smart Plus Campaign Status Update]
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SmartPlusCampaignStatusUpdateBody} opts.body 
     * @param {module:api/CampaignCreationApi~smartPlusCampaignStatusUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    smartPlusCampaignStatusUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling smartPlusCampaignStatusUpdate");
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
        '/open_api/v1.3/smart_plus/campaign/status/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the smartPlusCampaignUpdate operation.
     * @callback moduleapi/CampaignCreationApi~smartPlusCampaignUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an existing campaign [Smart Plus Campaign Update]
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SmartPlusCampaignUpdateBody} opts.body 
     * @param {module:api/CampaignCreationApi~smartPlusCampaignUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    smartPlusCampaignUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling smartPlusCampaignUpdate");
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
        '/open_api/v1.3/smart_plus/campaign/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}