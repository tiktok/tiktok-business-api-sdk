/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {ExclusiveAuthorizationCreateBody} from '../model/ExclusiveAuthorizationCreateBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* Store service.
* @module api/StoreApi
* @version 1.2.1
*/
export class StoreApi {

    /**
    * Constructs a new StoreApi. 
    * @alias module:api/StoreApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the gmvMaxExclusiveAuthorizationCreate operation.
     * @callback moduleapi/StoreApi~gmvMaxExclusiveAuthorizationCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001200356354)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/ExclusiveAuthorizationCreateBody} opts.body 
     * @param {module:api/StoreApi~gmvMaxExclusiveAuthorizationCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxExclusiveAuthorizationCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxExclusiveAuthorizationCreate");
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
        '/open_api/v1.3/gmv_max/exclusive_authorization/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the gmvMaxExclusiveAuthorizationGet operation.
     * @callback moduleapi/StoreApi~gmvMaxExclusiveAuthorizationGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001184635905)
     * @param {String} advertiser_id 
     * @param {String} store_id 
     * @param {String} store_authorized_bc_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/StoreApi~gmvMaxExclusiveAuthorizationGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxExclusiveAuthorizationGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxExclusiveAuthorizationGet");
      }
      // verify the required parameter 'store_id' is set
      if (store_id === undefined || store_id === null) {
        throw new Error("Missing the required parameter 'store_id' when calling gmvMaxExclusiveAuthorizationGet");
      }
      // verify the required parameter 'store_authorized_bc_id' is set
      if (store_authorized_bc_id === undefined || store_authorized_bc_id === null) {
        throw new Error("Missing the required parameter 'store_authorized_bc_id' when calling gmvMaxExclusiveAuthorizationGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxExclusiveAuthorizationGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'store_id': store_id,'store_authorized_bc_id': store_authorized_bc_id
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
        '/open_api/v1.3/gmv_max/exclusive_authorization/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the gmvMaxStoreList operation.
     * @callback moduleapi/StoreApi~gmvMaxStoreListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001044479041)
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/StoreApi~gmvMaxStoreListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxStoreList(advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxStoreList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxStoreList");
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
        '/open_api/v1.3/gmv_max/store/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the gmvMaxStoreShopAdUsageCheck operation.
     * @callback moduleapi/StoreApi~gmvMaxStoreShopAdUsageCheckCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001084174338)
     * @param {String} advertiser_id 
     * @param {String} store_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/StoreApi~gmvMaxStoreShopAdUsageCheckCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxStoreShopAdUsageCheck(advertiser_id, store_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxStoreShopAdUsageCheck");
      }
      // verify the required parameter 'store_id' is set
      if (store_id === undefined || store_id === null) {
        throw new Error("Missing the required parameter 'store_id' when calling gmvMaxStoreShopAdUsageCheck");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxStoreShopAdUsageCheck");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'store_id': store_id
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
        '/open_api/v1.3/gmv_max/store/shop_ad_usage_check/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}