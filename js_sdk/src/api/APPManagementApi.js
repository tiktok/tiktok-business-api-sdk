/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {AppCreateBody} from '../model/AppCreateBody.js';
import {AppUpdateBody} from '../model/AppUpdateBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* APPManagement service.
* @module api/APPManagementApi
* @version 0.1.5
*/
export class APPManagementApi {

    /**
    * Constructs a new APPManagementApi. 
    * @alias module:api/APPManagementApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the appCreate operation.
     * @callback moduleapi/APPManagementApi~appCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859280958466)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/AppCreateBody} opts.body 
     * @param {module:api/APPManagementApi~appCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling appCreate");
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
        '/open_api/v1.3/app/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the appInfo operation.
     * @callback moduleapi/APPManagementApi~appInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859272887297)
     * @param {String} advertiser_id 
     * @param {String} app_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/APPManagementApi~appInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appInfo(advertiser_id, app_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling appInfo");
      }
      // verify the required parameter 'app_id' is set
      if (app_id === undefined || app_id === null) {
        throw new Error("Missing the required parameter 'app_id' when calling appInfo");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling appInfo");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'app_id': app_id
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
        '/open_api/v1.3/app/info/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the appList operation.
     * @callback moduleapi/APPManagementApi~appListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859313270786)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.app_platform_ids List of app platform ID for filter purpose.
     * @param {module:api/APPManagementApi~appListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appList(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling appList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling appList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'app_platform_ids': this.apiClient.buildCollectionParam(opts['app_platform_ids'], 'multi')
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
        '/open_api/v1.3/app/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the appOptimizationEvent operation.
     * @callback moduleapi/APPManagementApi~appOptimizationEventCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859338750977)
     * @param {String} app_id Your App ID, obtained after successfully creating your app.
     * @param {String} advertiser_id Advertiser ID
     * @param {String} optimization_goal Optimization goal. For enum values, see Enumeration-Optimization Goal for more
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.placement The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don&#x27;t select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they&#x27;ve been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported.
     * @param {String} opts.placement_type 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。
     * @param {String} opts.objective Advertising Objective. For enum values, see Enumeration-Advertising Objective
     * @param {Boolean} opts.available_only Whether to return only available conversion events. The default value: True (only return available conversion events)
     * @param {Boolean} opts.is_skan Whether the app is using Skan features.
     * @param {String} opts.app_promotion_type App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used.
     * @param {module:api/APPManagementApi~appOptimizationEventCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appOptimizationEvent(app_id, advertiser_id, optimization_goal, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'app_id' is set
      if (app_id === undefined || app_id === null) {
        throw new Error("Missing the required parameter 'app_id' when calling appOptimizationEvent");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling appOptimizationEvent");
      }
      // verify the required parameter 'optimization_goal' is set
      if (optimization_goal === undefined || optimization_goal === null) {
        throw new Error("Missing the required parameter 'optimization_goal' when calling appOptimizationEvent");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling appOptimizationEvent");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'app_id': app_id,'advertiser_id': advertiser_id,'placement': this.apiClient.buildCollectionParam(opts['placement'], 'multi'),'placement_type': opts['placement_type'],'optimization_goal': optimization_goal,'objective': opts['objective'],'available_only': opts['available_only'],'is_skan': opts['is_skan'],'app_promotion_type': opts['app_promotion_type']
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
        '/open_api/v1.3/app/optimization_event/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the appOptimizationEventRetargeting operation.
     * @callback moduleapi/APPManagementApi~appOptimizationEventRetargetingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859371033601)
     * @param {String} app_id 
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/APPManagementApi~appOptimizationEventRetargetingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appOptimizationEventRetargeting(app_id, advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'app_id' is set
      if (app_id === undefined || app_id === null) {
        throw new Error("Missing the required parameter 'app_id' when calling appOptimizationEventRetargeting");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling appOptimizationEventRetargeting");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling appOptimizationEventRetargeting");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'app_id': app_id,'advertiser_id': advertiser_id
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
        '/open_api/v1.3/app/optimization_event/retargeting/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the appUpdate operation.
     * @callback moduleapi/APPManagementApi~appUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859300069378)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/AppUpdateBody} opts.body 
     * @param {module:api/APPManagementApi~appUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling appUpdate");
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
        '/open_api/v1.3/app/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}