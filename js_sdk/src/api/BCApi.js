/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {AdvertiserCreateBody} from '../model/AdvertiserCreateBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* BC service.
* @module api/BCApi
* @version 0.1.3
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
     * Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)
     * @param {String} bc_id 
     * @param {String} asset_type 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.child_bc_id 
     * @param {Object} opts.filtering 
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
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
        'bc_id': bc_id,'asset_type': asset_type,'child_bc_id': opts['child_bc_id'],'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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
     * Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.bc_id 
     * @param {String} opts.scene  (default to <.>)
     * @param {Object} opts.filtering 
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
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
        'bc_id': opts['bc_id'],'scene': opts['scene'],'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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