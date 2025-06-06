# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from business_api_client.api_client import ApiClient


class BcPaymentApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def advertiser_balance_get(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939106470913)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.advertiser_balance_get(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param str child_bc_id:
        :param object filtering:
        :param int page:
        :param int page_size:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.advertiser_balance_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.advertiser_balance_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
            return data

    def advertiser_balance_get_with_http_info(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939106470913)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.advertiser_balance_get_with_http_info(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param str child_bc_id:
        :param object filtering:
        :param int page:
        :param int page_size:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['bc_id', 'access_token', 'child_bc_id', 'filtering', 'page', 'page_size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method advertiser_balance_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'bc_id' is set
        if ('bc_id' not in params or
                params['bc_id'] is None):
            raise ValueError("Missing the required parameter `bc_id` when calling `advertiser_balance_get`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `advertiser_balance_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'bc_id' in params:
            query_params.append(('bc_id', params['bc_id']))  # noqa: E501
        if 'child_bc_id' in params:
            query_params.append(('child_bc_id', params['child_bc_id']))  # noqa: E501
        if 'filtering' in params:
            query_params.append(('filtering', params['filtering']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501

        header_params = {}
        if 'access_token' in params:
            header_params['Access-Token'] = params['access_token']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open_api/v1.3/advertiser/balance/get/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse200',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def advertiser_transaction_get(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939116353538)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.advertiser_transaction_get(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param object filtering:
        :param int page:
        :param int page_size:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.advertiser_transaction_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.advertiser_transaction_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
            return data

    def advertiser_transaction_get_with_http_info(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939116353538)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.advertiser_transaction_get_with_http_info(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param object filtering:
        :param int page:
        :param int page_size:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['bc_id', 'access_token', 'filtering', 'page', 'page_size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method advertiser_transaction_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'bc_id' is set
        if ('bc_id' not in params or
                params['bc_id'] is None):
            raise ValueError("Missing the required parameter `bc_id` when calling `advertiser_transaction_get`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `advertiser_transaction_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'bc_id' in params:
            query_params.append(('bc_id', params['bc_id']))  # noqa: E501
        if 'filtering' in params:
            query_params.append(('filtering', params['filtering']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501

        header_params = {}
        if 'access_token' in params:
            header_params['Access-Token'] = params['access_token']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open_api/v1.3/advertiser/transaction/get/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse200',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def bc_balance_get(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939128198145)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.bc_balance_get(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param str child_bc_id:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.bc_balance_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.bc_balance_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
            return data

    def bc_balance_get_with_http_info(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939128198145)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.bc_balance_get_with_http_info(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param str child_bc_id:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['bc_id', 'access_token', 'child_bc_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method bc_balance_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'bc_id' is set
        if ('bc_id' not in params or
                params['bc_id'] is None):
            raise ValueError("Missing the required parameter `bc_id` when calling `bc_balance_get`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `bc_balance_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'bc_id' in params:
            query_params.append(('bc_id', params['bc_id']))  # noqa: E501
        if 'child_bc_id' in params:
            query_params.append(('child_bc_id', params['child_bc_id']))  # noqa: E501

        header_params = {}
        if 'access_token' in params:
            header_params['Access-Token'] = params['access_token']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open_api/v1.3/bc/balance/get/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse200',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def bc_transaction_get(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939140408322)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.bc_transaction_get(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param object filtering:
        :param date start_date:
        :param date end_date:
        :param int page:
        :param int page_size:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.bc_transaction_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.bc_transaction_get_with_http_info(bc_id, access_token, **kwargs)  # noqa: E501
            return data

    def bc_transaction_get_with_http_info(self, bc_id, access_token, **kwargs):  # noqa: E501
        """Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939140408322)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.bc_transaction_get_with_http_info(bc_id, access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str bc_id: (required)
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param object filtering:
        :param date start_date:
        :param date end_date:
        :param int page:
        :param int page_size:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['bc_id', 'access_token', 'filtering', 'start_date', 'end_date', 'page', 'page_size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method bc_transaction_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'bc_id' is set
        if ('bc_id' not in params or
                params['bc_id'] is None):
            raise ValueError("Missing the required parameter `bc_id` when calling `bc_transaction_get`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `bc_transaction_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'bc_id' in params:
            query_params.append(('bc_id', params['bc_id']))  # noqa: E501
        if 'filtering' in params:
            query_params.append(('filtering', params['filtering']))  # noqa: E501
        if 'start_date' in params:
            query_params.append(('start_date', params['start_date']))  # noqa: E501
        if 'end_date' in params:
            query_params.append(('end_date', params['end_date']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501

        header_params = {}
        if 'access_token' in params:
            header_params['Access-Token'] = params['access_token']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open_api/v1.3/bc/transaction/get/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse200',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def bc_transfer(self, access_token, **kwargs):  # noqa: E501
        """Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id=1739939095321601)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.bc_transfer(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param BcTransferBody body:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.bc_transfer_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.bc_transfer_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def bc_transfer_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id=1739939095321601)  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.bc_transfer_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162). (required)
        :param BcTransferBody body:
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['access_token', 'body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method bc_transfer" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `bc_transfer`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}
        if 'access_token' in params:
            header_params['Access-Token'] = params['access_token']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open_api/v1.3/bc/transfer/', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse200',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
