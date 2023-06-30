/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient";
import {InlineResponse200} from '../model/InlineResponse200';

/**
* Audience service.
* @module api/AudienceApi
* @version 0.1.1
*/
export class AudienceApi {

    /**
    * Constructs a new AudienceApi. 
    * @alias module:api/AudienceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the dmpCustomAudienceList operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)
     * @param {String} advertiser_id Advertiser ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.custom_audience_ids A list of Audience IDs. Length range is [1, 100]
     * @param {Number} opts.page Current page number. Default value: 1. Value range: ≥ 1
     * @param {Number} opts.page_size Page size. Defaults is 10. Value range: 1-100
     * @param {module:api/AudienceApi~dmpCustomAudienceListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceList(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling dmpCustomAudienceList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'custom_audience_ids': this.apiClient.buildCollectionParam(opts['custom_audience_ids'], 'multi'),'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/dmp/custom_audience/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}