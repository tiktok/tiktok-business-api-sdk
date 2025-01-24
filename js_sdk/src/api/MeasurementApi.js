/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* Measurement service.
* @module api/MeasurementApi
* @version 0.1.3
*/
export class MeasurementApi {

    /**
    * Constructs a new MeasurementApi. 
    * @alias module:api/MeasurementApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the appList operation.
     * @callback moduleapi/MeasurementApi~appListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.app_platform_ids List of app platform ID for filter purpose
     * @param {module:api/MeasurementApi~appListCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback moduleapi/MeasurementApi~appOptimizationEventCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)
     * @param {String} app_id Your App ID, obtained after successfully creating your app
     * @param {String} advertiser_id Advertiser ID
     * @param {Array.<String>} placement Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138)
     * @param {String} optimization_goal Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) for more
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.objective Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138)
     * @param {Boolean} opts.available_only Whether to return only available conversion events. The default value: &#x60;True&#x60; (only return available conversion events)
     * @param {Boolean} opts.is_skan Whether the app is using Skan features
     * @param {String} opts.app_promotion_type App promotion type. Required when &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60;. Enum values: &#x60;APP_INSTALL&#x60;, &#x60;APP_RETARGETING&#x60;. Note: &#x60;APP_INSTALL&#x60; can be used in an iOS14 Dedicated Campaign, while &#x60;APP_RETARGETING&#x60; cannot be used
     * @param {module:api/MeasurementApi~appOptimizationEventCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    appOptimizationEvent(app_id, advertiser_id, placement, optimization_goal, Access_Token, opts, callback) {
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
      // verify the required parameter 'placement' is set
      if (placement === undefined || placement === null) {
        throw new Error("Missing the required parameter 'placement' when calling appOptimizationEvent");
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
        'app_id': app_id,'advertiser_id': advertiser_id,'placement': this.apiClient.buildCollectionParam(placement, 'multi'),'optimization_goal': optimization_goal,'objective': opts['objective'],'available_only': opts['available_only'],'is_skan': opts['is_skan'],'app_promotion_type': opts['app_promotion_type']
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

}