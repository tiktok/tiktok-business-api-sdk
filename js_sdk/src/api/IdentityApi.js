/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {IdentityCreateBody} from '../model/IdentityCreateBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* Identity service.
* @module api/IdentityApi
* @version 0.1.8
*/
export class IdentityApi {

    /**
    * Constructs a new IdentityApi. 
    * @alias module:api/IdentityApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the gmvMaxIdentityGet operation.
     * @callback moduleapi/IdentityApi~gmvMaxIdentityGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max identity info [Smart Plus GMV Max Identity Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001101474882)
     * @param {String} advertiser_id 
     * @param {String} store_id 
     * @param {String} store_authorized_bc_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/IdentityApi~gmvMaxIdentityGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxIdentityGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxIdentityGet");
      }
      // verify the required parameter 'store_id' is set
      if (store_id === undefined || store_id === null) {
        throw new Error("Missing the required parameter 'store_id' when calling gmvMaxIdentityGet");
      }
      // verify the required parameter 'store_authorized_bc_id' is set
      if (store_authorized_bc_id === undefined || store_authorized_bc_id === null) {
        throw new Error("Missing the required parameter 'store_authorized_bc_id' when calling gmvMaxIdentityGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxIdentityGet");
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
        '/open_api/v1.3/gmv_max/identity/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the identityCreate operation.
     * @callback moduleapi/IdentityApi~identityCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740654203526146)
     * https://ads.tiktok.com/marketing_api/search?s&#x3D;identity%2Fcreate%2F&amp;type&#x3D;0&amp;version&#x3D;1.3
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/IdentityCreateBody} opts.body Identity create body parameters.
     * @param {module:api/IdentityApi~identityCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    identityCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling identityCreate");
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
        '/open_api/v1.3/identity/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the identityGet operation.
     * @callback moduleapi/IdentityApi~identityGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740218420781057)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.identity_type Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details.
     * @param {String} opts.identity_authorized_bc_id Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT.
     * @param {Number} opts.page Page number.
     * @param {Number} opts.page_size Number of results on each page.
     * @param {module:api/IdentityApi~identityGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    identityGet(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling identityGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling identityGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'identity_type': opts['identity_type'],'identity_authorized_bc_id': opts['identity_authorized_bc_id'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/identity/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the identityVideoInfo operation.
     * @callback moduleapi/IdentityApi~identityVideoInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)
     * https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {String} advertiser_id Advertiser ID
     * @param {String} identity_type Identity type. Enum: &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;, &#x60;BC_AUTH_TT&#x60;. See [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097) for details.
     * @param {String} identity_id Identity ID
     * @param {String} item_id TikTok post ID
     * @param {Object} opts Optional parameters
     * @param {String} opts.identity_authorized_bc_id The identity ID of a TikTok account that a Business Center is authorized to access. Required when&#x60; identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;. 
     * @param {module:api/IdentityApi~identityVideoInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    identityVideoInfo(Access_Token, advertiser_id, identity_type, identity_id, item_id, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling identityVideoInfo");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling identityVideoInfo");
      }
      // verify the required parameter 'identity_type' is set
      if (identity_type === undefined || identity_type === null) {
        throw new Error("Missing the required parameter 'identity_type' when calling identityVideoInfo");
      }
      // verify the required parameter 'identity_id' is set
      if (identity_id === undefined || identity_id === null) {
        throw new Error("Missing the required parameter 'identity_id' when calling identityVideoInfo");
      }
      // verify the required parameter 'item_id' is set
      if (item_id === undefined || item_id === null) {
        throw new Error("Missing the required parameter 'item_id' when calling identityVideoInfo");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'identity_type': identity_type,'identity_id': identity_id,'identity_authorized_bc_id': opts['identity_authorized_bc_id'],'item_id': item_id
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
        '/open_api/v1.3/identity/video/info/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}