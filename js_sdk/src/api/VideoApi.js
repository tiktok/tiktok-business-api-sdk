/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {IdentityList} from '../model/IdentityList.js';
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* Video service.
* @module api/VideoApi
* @version 1.2.1
*/
export class VideoApi {

    /**
    * Constructs a new VideoApi. 
    * @alias module:api/VideoApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the gmvMaxVideoGet operation.
     * @callback moduleapi/VideoApi~gmvMaxVideoGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)
     * @param {String} advertiser_id 
     * @param {String} store_id 
     * @param {String} store_authorized_bc_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.spu_id_list 
     * @param {Array.<module:model/IdentityList>} opts.identity_list 
     * @param {Boolean} opts.need_auth_code_video 
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {Boolean} opts.custom_posts_eligible 
     * @param {String} opts.sort_field 
     * @param {String} opts.sort_type  (default to <.>)
     * @param {String} opts.keyword 
     * @param {module:api/VideoApi~gmvMaxVideoGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxVideoGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxVideoGet");
      }
      // verify the required parameter 'store_id' is set
      if (store_id === undefined || store_id === null) {
        throw new Error("Missing the required parameter 'store_id' when calling gmvMaxVideoGet");
      }
      // verify the required parameter 'store_authorized_bc_id' is set
      if (store_authorized_bc_id === undefined || store_authorized_bc_id === null) {
        throw new Error("Missing the required parameter 'store_authorized_bc_id' when calling gmvMaxVideoGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxVideoGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'store_id': store_id,'store_authorized_bc_id': store_authorized_bc_id,'spu_id_list': this.apiClient.buildCollectionParam(opts['spu_id_list'], 'multi'),'identity_list': this.apiClient.buildCollectionParam(opts['identity_list'], 'multi'),'need_auth_code_video': opts['need_auth_code_video'],'page': opts['page'],'page_size': opts['page_size'],'custom_posts_eligible': opts['custom_posts_eligible'],'sort_field': opts['sort_field'],'sort_type': opts['sort_type'],'keyword': opts['keyword']
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
        '/open_api/v1.3/gmv_max/video/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}