/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient";
import {AdvertiserCreateBody} from '../model/AdvertiserCreateBody';
import {Filtering} from '../model/Filtering';
import {InlineResponse200} from '../model/InlineResponse200';

/**
* BC service.
* @module api/BCApi
* @version 0.1.0
*/
export class BCApi {

    /**
    * Constructs a new BCApi. 
    * @alias module:api/BCApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the bcAdvertiserCreate operation.
     * @callback moduleapi/BCApi~bcAdvertiserCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/AdvertiserCreateBody} opts.body BC advertiser create body parameters
     * @param {module:api/BCApi~bcAdvertiserCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcAdvertiserCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcAdvertiserCreate");
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
        '/open_api/v1.3/bc/advertiser/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the bcAssetGet operation.
     * @callback moduleapi/BCApi~bcAssetGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)
     * @param {String} bc_id Business Center ID
     * @param {String} asset_type Type of asset that you want to get. Enum values: &#x60;CATALOG&#x60;, &#x60;ADVERTISER&#x60;, &#x60;PIXEL&#x60;, &#x60;LEAD&#x60;, &#x60;TT_ACCOUNT&#x60;(corresponds to &#x60;BC_AUTH_TT&#x60;, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097), &#x60;TIKTOK_SHOP&#x60; (TikTok shop) , &#x60;STOREFRONT&#x60;( TikTok Storefront (third-party store))
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/Filtering} opts.filtering Filtering conditions. Use either &#x60;user_id&#x60; or &#x60;user_email&#x60; as filter.Note: You cannot use &#x60;user_id&#x60; and &#x60;user_email&#x60; at the same time.If you do not specify any filter values, the system will pass in to the &#x60;user_id&#x60; field the user ID of the TikTok for Business account that gives you the authentication code (&#x60;auth_code&#x60;)
     * @param {Number} opts.page Current page number. Default value: 1
     * @param {Number} opts.page_size Page size, in the range of 1-50. Default value: 10
     * @param {module:api/BCApi~bcAssetGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcAssetGet(bc_id, asset_type, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'bc_id' is set
      if (bc_id === undefined || bc_id === null) {
        throw new Error("Missing the required parameter 'bc_id' when calling bcAssetGet");
      }
      // verify the required parameter 'asset_type' is set
      if (asset_type === undefined || asset_type === null) {
        throw new Error("Missing the required parameter 'asset_type' when calling bcAssetGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcAssetGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'bc_id': bc_id,'asset_type': asset_type,'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/bc/asset/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the bcGet operation.
     * @callback moduleapi/BCApi~bcGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.bc_id The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in
     * @param {Number} opts.page Current number of pages. Default value: 1. Value range : ≥ 1
     * @param {Number} opts.page_size Page size. Default value: 10. Value range: 1-50
     * @param {module:api/BCApi~bcGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcGet(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'bc_id': opts['bc_id'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/bc/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the bcImageUpload operation.
     * @callback moduleapi/BCApi~bcImageUploadCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.bc_id 
     * @param {Blob} opts.image_file 
     * @param {module:api/BCApi~bcImageUploadCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcImageUpload(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcImageUpload");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        'bc_id': opts['bc_id'],'image_file': opts['image_file']
      };

      let authNames = [];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/bc/image/upload/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}