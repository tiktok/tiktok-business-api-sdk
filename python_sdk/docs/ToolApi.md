"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.ToolApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_region**](ToolApi.md#search_region) | **GET** /open_api/v1.3/search/region/ | Get available locations by advertiser ID [Search Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1773644763581441)
[**tool_action_category**](ToolApi.md#tool_action_category) | **GET** /open_api/v1.3/tool/action_category/ | Get action categories [Tool action](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737166752522241)
[**tool_bid_recommend**](ToolApi.md#tool_bid_recommend) | **POST** /open_api/v1.3/tool/bid/recommend/ | Get a suggested bid [Tool Bid Recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737107845597186)
[**tool_brand_safety_partner_authorize_status**](ToolApi.md#tool_brand_safety_partner_authorize_status) | **GET** /open_api/v1.3/tool/brand_safety/partner/authorize/status/ | Get the authorization status of a Brand Safety partner [Tool Brand_safety Partner Authorize Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738456743621634)
[**tool_carrier**](ToolApi.md#tool_carrier) | **GET** /open_api/v1.3/tool/carrier/ | Get carriers [Tool carrier](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737168013095938)
[**tool_contextual_tag_get**](ToolApi.md#tool_contextual_tag_get) | **GET** /open_api/v1.3/tool/contextual_tag/get/ | Get available contextual tags [Tool Contextual_tag Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747118654465)
[**tool_contextual_tag_info**](ToolApi.md#tool_contextual_tag_info) | **GET** /open_api/v1.3/tool/contextual_tag/info/ | Get details of contextual tags [Tool Contextual_tag Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747180830722)
[**tool_device_model**](ToolApi.md#tool_device_model) | **GET** /open_api/v1.3/tool/device_model/ | Get device models [Tool device model](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172880570369)
[**tool_hashtag_get**](ToolApi.md#tool_hashtag_get) | **GET** /open_api/v1.3/tool/hashtag/get/ | Get targeting hashtags by ID [Tool Hashtag Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736280889167874)
[**tool_hashtag_recommend**](ToolApi.md#tool_hashtag_recommend) | **GET** /open_api/v1.3/tool/hashtag/recommend/ | Search for targeting hashtags [Tool Hashtag Recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736271339521025)
[**tool_interest_category**](ToolApi.md#tool_interest_category) | **GET** /open_api/v1.3/tool/interest_category/ | Get interest categories [Tool Interest category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174348712961)
[**tool_interest_keyword_get**](ToolApi.md#tool_interest_keyword_get) | **GET** /open_api/v1.3/tool/interest_keyword/get/ | Get additional interest categories by ID [Tool Interest_keyword Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1763590894544897)
[**tool_interest_keyword_recommend**](ToolApi.md#tool_interest_keyword_recommend) | **GET** /open_api/v1.3/tool/interest_keyword/recommend/ | Get interest keywords [Tool kyword recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737180852720642)
[**tool_language**](ToolApi.md#tool_language) | **GET** /open_api/v1.3/tool/language/ | Get languages [Tool Language](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737188554152962)
[**tool_open_url**](ToolApi.md#tool_open_url) | **GET** /open_api/v1.3/tool/open_url/ | Get a TikTok in-app link [Tool Open_url](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738457335681026)
[**tool_os_version**](ToolApi.md#tool_os_version) | **GET** /open_api/v1.3/tool/os_version/ | Get OS versions [Tool Os_version](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738308662898689)
[**tool_phone_region_code**](ToolApi.md#tool_phone_region_code) | **GET** /open_api/v1.3/tool/phone_region_code/ | Get region calling codes and region codes for phone numbers [Tool Phone_region_code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1774488637039618)
[**tool_region**](ToolApi.md#tool_region) | **GET** /open_api/v1.3/tool/region/ | Get available locations [Tool Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737189539571713)
[**tool_targeting_info**](ToolApi.md#tool_targeting_info) | **POST** /open_api/v1.3/tool/targeting/info/ | Obtain details about location targeting tags by ID [Tool Targeting Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1761237001980929)
[**tool_targeting_list**](ToolApi.md#tool_targeting_list) | **GET** /open_api/v1.3/tool/targeting/list/ | Get internet service providers [Tool Targeting List](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1762962378261506)
[**tool_targeting_search**](ToolApi.md#tool_targeting_search) | **POST** /open_api/v1.3/tool/targeting/search/ | Search for location targeting tags [Tool Targeting Search](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1761236883355649)
[**tool_timezone**](ToolApi.md#tool_timezone) | **GET** /open_api/v1.3/tool/timezone/ | Get time zones [Tool Timezone](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738455961470977)
[**tool_url_validate**](ToolApi.md#tool_url_validate) | **GET** /open_api/v1.3/tool/url_validate/ | Get the verification results of a URL [Tool Url_validate](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1774487686007810)
[**tool_vbo_status**](ToolApi.md#tool_vbo_status) | **GET** /open_api/v1.3/tool/vbo_status/ | Check Value-Based Optimization eligibility [Tool Vbo_status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1770016073586753)

# **search_region**
> InlineResponse200 search_region(advertiser_id, access_token, language=language)

Get available locations by advertiser ID [Search Region](https://ads.tiktok.com/marketing_api/docs?id=1773644763581441)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
language = 'language_example' # str | The language you want the returned region name to be translated into. Default value: en Currently, we only support zh, fr, es, ko, vi, en, hi, it, tr, ru, ja, id, de, ms, ar, and th Note: If you do not pass in one of the supported values above, it will return as the default en. (optional)

try:
    # Get available locations by advertiser ID [Search Region](https://ads.tiktok.com/marketing_api/docs?id=1773644763581441)
    api_response = api_instance.search_region(advertiser_id, access_token, language=language)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->search_region: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **language** | **str**| The language you want the returned region name to be translated into. Default value: en Currently, we only support zh, fr, es, ko, vi, en, hi, it, tr, ru, ja, id, de, ms, ar, and th Note: If you do not pass in one of the supported values above, it will return as the default en. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_action_category**
> InlineResponse200 tool_action_category(advertiser_id, access_token, special_industries=special_industries)

Get action categories [Tool action](https://ads.tiktok.com/marketing_api/docs?id=1737166752522241)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
special_industries = ['special_industries_example'] # list[str] | Ad categories. Enum values:`HOUSING`: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. `EMPLOYMENT`: Ads for job offers, internship, professional certification programs or other related opportunities. `CREDIT`: Ads for credit card offers, auto loans, long-term financing or other related opportunities.Note: This field is only supported for advertisers who are registered in America or Canada (optional)

try:
    # Get action categories [Tool action](https://ads.tiktok.com/marketing_api/docs?id=1737166752522241)
    api_response = api_instance.tool_action_category(advertiser_id, access_token, special_industries=special_industries)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_action_category: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **special_industries** | [**list[str]**](str.md)| Ad categories. Enum values:&#x60;HOUSING&#x60;: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. &#x60;EMPLOYMENT&#x60;: Ads for job offers, internship, professional certification programs or other related opportunities. &#x60;CREDIT&#x60;: Ads for credit card offers, auto loans, long-term financing or other related opportunities.Note: This field is only supported for advertisers who are registered in America or Canada | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_bid_recommend**
> InlineResponse200 tool_bid_recommend(access_token, body=body)

Get a suggested bid [Tool Bid Recommend](https://ads.tiktok.com/marketing_api/docs?id=1737107845597186)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BidRecommendBody() # BidRecommendBody |  (optional)

try:
    # Get a suggested bid [Tool Bid Recommend](https://ads.tiktok.com/marketing_api/docs?id=1737107845597186)
    api_response = api_instance.tool_bid_recommend(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_bid_recommend: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BidRecommendBody**](BidRecommendBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_brand_safety_partner_authorize_status**
> InlineResponse200 tool_brand_safety_partner_authorize_status(partner, advertiser_id, access_token)

Get the authorization status of a Brand Safety partner [Tool Brand_safety Partner Authorize Status](https://ads.tiktok.com/marketing_api/docs?id=1738456743621634)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
partner = 'partner_example' # str | Brand Safety post bid measurement partner. Enum values: Zefr.
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the authorization status of a Brand Safety partner [Tool Brand_safety Partner Authorize Status](https://ads.tiktok.com/marketing_api/docs?id=1738456743621634)
    api_response = api_instance.tool_brand_safety_partner_authorize_status(partner, advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_brand_safety_partner_authorize_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partner** | **str**| Brand Safety post bid measurement partner. Enum values: Zefr. | [required]
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_carrier**
> InlineResponse200 tool_carrier(advertiser_id, access_token)

Get carriers [Tool carrier](https://ads.tiktok.com/marketing_api/docs?id=1737168013095938)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get carriers [Tool carrier](https://ads.tiktok.com/marketing_api/docs?id=1737168013095938)
    api_response = api_instance.tool_carrier(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_carrier: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_contextual_tag_get**
> InlineResponse200 tool_contextual_tag_get(advertiser_id, objective_type, access_token, region_codes=region_codes, brand_safety_type=brand_safety_type, rf_campaign_type=rf_campaign_type)

Get available contextual tags [Tool Contextual_tag Get](https://ads.tiktok.com/marketing_api/docs?id=1747747118654465)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
objective_type = 'objective_type_example' # str | Advertising objective. Only supports REACH, VIDEO_VIEWS, RF_REACH.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
region_codes = ['region_codes_example'] # list[str] | Country or region codes. (optional)
brand_safety_type = 'brand_safety_type_example' # str | Brand safety type. Default value: STANDARD_INVENTORY. Enum values: EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and may contain some mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering. (optional)
rf_campaign_type = 'rf_campaign_type_example' # str | Note: When objective_type is specified as RF_REACH, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when objective_type is not specified as RF_REACH. Enum values: STANDARD (Reach & Frequency campaign), PULSE（TikTok Pulse campaign） (optional)

try:
    # Get available contextual tags [Tool Contextual_tag Get](https://ads.tiktok.com/marketing_api/docs?id=1747747118654465)
    api_response = api_instance.tool_contextual_tag_get(advertiser_id, objective_type, access_token, region_codes=region_codes, brand_safety_type=brand_safety_type, rf_campaign_type=rf_campaign_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_contextual_tag_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **objective_type** | **str**| Advertising objective. Only supports REACH, VIDEO_VIEWS, RF_REACH. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **region_codes** | [**list[str]**](str.md)| Country or region codes. | [optional] 
 **brand_safety_type** | **str**| Brand safety type. Default value: STANDARD_INVENTORY. Enum values: EXPANDED_INVENTORY: Use TikTok&#x27;s brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and may contain some mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok&#x27;s brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok&#x27;s brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering. | [optional] 
 **rf_campaign_type** | **str**| Note: When objective_type is specified as RF_REACH, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when objective_type is not specified as RF_REACH. Enum values: STANDARD (Reach &amp; Frequency campaign), PULSE（TikTok Pulse campaign） | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_contextual_tag_info**
> InlineResponse200 tool_contextual_tag_info(advertiser_id, contextual_tag_ids, access_token)

Get details of contextual tags [Tool Contextual_tag Info](https://ads.tiktok.com/marketing_api/docs?id=1747747180830722)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
contextual_tag_ids = ['contextual_tag_ids_example'] # list[str] | Contextual tag IDs.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get details of contextual tags [Tool Contextual_tag Info](https://ads.tiktok.com/marketing_api/docs?id=1747747180830722)
    api_response = api_instance.tool_contextual_tag_info(advertiser_id, contextual_tag_ids, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_contextual_tag_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **contextual_tag_ids** | [**list[str]**](str.md)| Contextual tag IDs. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_device_model**
> InlineResponse200 tool_device_model(advertiser_id, access_token)

Get device models [Tool device model](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get device models [Tool device model](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369)
    api_response = api_instance.tool_device_model(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_device_model: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_hashtag_get**
> InlineResponse200 tool_hashtag_get(advertiser_id, keyword_ids, access_token)

Get targeting hashtags by ID [Tool Hashtag Get](https://ads.tiktok.com/marketing_api/docs?id=1736280889167874)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
keyword_ids = ['keyword_ids_example'] # list[str] | List of keyword IDs
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get targeting hashtags by ID [Tool Hashtag Get](https://ads.tiktok.com/marketing_api/docs?id=1736280889167874)
    api_response = api_instance.tool_hashtag_get(advertiser_id, keyword_ids, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_hashtag_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **keyword_ids** | [**list[str]**](str.md)| List of keyword IDs | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_hashtag_recommend**
> InlineResponse200 tool_hashtag_recommend(advertiser_id, keywords, access_token, operator=operator)

Search for targeting hashtags [Tool Hashtag Recommend](https://ads.tiktok.com/marketing_api/docs?id=1736271339521025)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
keywords = ['keywords_example'] # list[str] | Keywords that you want to get recommended hashtags for. If you specify multiple unrelated keywords and set operator to AND, it is possible that no recommended hashtags are returned. Max size: 10.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
operator = 'AND' # str | The operator to be used between the keywords. Enum values: AND: Recommended hashtags will be generated based on all the keywords specified in keywords. OR: Recommended hashtags will be generated separately for each individual keyword in keywords. Default value: AND. (optional) (default to AND)

try:
    # Search for targeting hashtags [Tool Hashtag Recommend](https://ads.tiktok.com/marketing_api/docs?id=1736271339521025)
    api_response = api_instance.tool_hashtag_recommend(advertiser_id, keywords, access_token, operator=operator)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_hashtag_recommend: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **keywords** | [**list[str]**](str.md)| Keywords that you want to get recommended hashtags for. If you specify multiple unrelated keywords and set operator to AND, it is possible that no recommended hashtags are returned. Max size: 10. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **operator** | **str**| The operator to be used between the keywords. Enum values: AND: Recommended hashtags will be generated based on all the keywords specified in keywords. OR: Recommended hashtags will be generated separately for each individual keyword in keywords. Default value: AND. | [optional] [default to AND]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_interest_category**
> InlineResponse200 tool_interest_category(advertiser_id, access_token, version=version, placements=placements, special_industries=special_industries, language=language)

Get interest categories [Tool Interest category](https://ads.tiktok.com/marketing_api/docs?id=1737174348712961)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
version = 56 # int | Version of interest category. Enum values:`1`(`interest_category`), `2` (`interest_category_v2`)。Default: `2` (optional)
placements = ['placements_example'] # list[str] | The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). The interest categories available for different placements may be different, and the field only takes effect when `version` = `2`. (optional)
special_industries = ['special_industries_example'] # list[str] | Defines ad categories. Enum values:`HOUSING`: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. `EMPLOYMENT`: Ads for job offers, internship, professional certification programs or other related opportunities. `CREDIT`: Ads for credit card offers, auto loans, long-term financing or other related opportunities. Note: This field is only supported for advertisers who are registered in America or Canada (optional)
language = 'language_example' # str | Category name language in repsonse. Default value: `en`. Supported languages: `en`, ` zh`, ` ja`, ` de`, ` es`, ` fr`, ` id`, ` it`, ` ko`, ` ru`, ` th`, ` tr`, ` vi`, ` ar`, ` pt`, ` ms`.For details, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) (optional)

try:
    # Get interest categories [Tool Interest category](https://ads.tiktok.com/marketing_api/docs?id=1737174348712961)
    api_response = api_instance.tool_interest_category(advertiser_id, access_token, version=version, placements=placements, special_industries=special_industries, language=language)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_interest_category: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **version** | **int**| Version of interest category. Enum values:&#x60;1&#x60;(&#x60;interest_category&#x60;), &#x60;2&#x60; (&#x60;interest_category_v2&#x60;)。Default: &#x60;2&#x60; | [optional] 
 **placements** | [**list[str]**](str.md)| The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). The interest categories available for different placements may be different, and the field only takes effect when &#x60;version&#x60; &#x3D; &#x60;2&#x60;. | [optional] 
 **special_industries** | [**list[str]**](str.md)| Defines ad categories. Enum values:&#x60;HOUSING&#x60;: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. &#x60;EMPLOYMENT&#x60;: Ads for job offers, internship, professional certification programs or other related opportunities. &#x60;CREDIT&#x60;: Ads for credit card offers, auto loans, long-term financing or other related opportunities. Note: This field is only supported for advertisers who are registered in America or Canada | [optional] 
 **language** | **str**| Category name language in repsonse. Default value: &#x60;en&#x60;. Supported languages: &#x60;en&#x60;, &#x60; zh&#x60;, &#x60; ja&#x60;, &#x60; de&#x60;, &#x60; es&#x60;, &#x60; fr&#x60;, &#x60; id&#x60;, &#x60; it&#x60;, &#x60; ko&#x60;, &#x60; ru&#x60;, &#x60; th&#x60;, &#x60; tr&#x60;, &#x60; vi&#x60;, &#x60; ar&#x60;, &#x60; pt&#x60;, &#x60; ms&#x60;.For details, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_interest_keyword_get**
> InlineResponse200 tool_interest_keyword_get(advertiser_id, access_token, filtering=filtering, keyword_query=keyword_query)

Get additional interest categories by ID [Tool Interest_keyword Get](https://ads.tiktok.com/marketing_api/docs?id=1763590894544897)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = NULL # object | Filtering conditions. (optional)
keyword_query = NULL # list[object] | Information of the additional interest category you want to get. Max size = 50. (optional)

try:
    # Get additional interest categories by ID [Tool Interest_keyword Get](https://ads.tiktok.com/marketing_api/docs?id=1763590894544897)
    api_response = api_instance.tool_interest_keyword_get(advertiser_id, access_token, filtering=filtering, keyword_query=keyword_query)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_interest_keyword_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**object**](object.md)| Filtering conditions. | [optional] 
 **keyword_query** | [**list[object]**](object.md)| Information of the additional interest category you want to get. Max size &#x3D; 50. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_interest_keyword_recommend**
> InlineResponse200 tool_interest_keyword_recommend(advertiser_id, keyword, access_token, language=language, limit=limit, mode=mode, audience_type=audience_type)

Get interest keywords [Tool kyword recommend](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
keyword = 'keyword_example' # str | Seed keyword that you use to get recommended keywords. You can specify only one seed keyword
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
language = 'language_example' # str | Keyword language. Default value: `en`. Note that target audience languages are not limited by keyword languages. You can use English keywords to target audience that do not speak English. Supported languages: `fr`, `id`, `it`, `ja`, `ms`, `ar`, `vi`, `en`, `ru`, `es`, `th`, `tr`, `hi`, `zh`, `de`, `ko` (optional)
limit = 56 # int | Number of recommended keywords you want to get. Default value: 50. Value range: 1-50 (optional)
mode = 'mode_example' # str | Search mode. Enum values: `FUZZ_MATCH`, `SEMANTIC_RECOMMEND`. Default value: `FUZZ_MATCH` (optional)
audience_type = 'audience_type_example' # str | Audience type. Enum values: `GENERAL_INTEREST`: General interest. The audiences have a general, long-term interest in a video category. `PURCHASE_INTENTION`: Purchase intent. The audiences recent behavior suggests they may buy something related to a content category. Default value: `GENERAL_INTEREST` (optional)

try:
    # Get interest keywords [Tool kyword recommend](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642)
    api_response = api_instance.tool_interest_keyword_recommend(advertiser_id, keyword, access_token, language=language, limit=limit, mode=mode, audience_type=audience_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_interest_keyword_recommend: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **keyword** | **str**| Seed keyword that you use to get recommended keywords. You can specify only one seed keyword | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **language** | **str**| Keyword language. Default value: &#x60;en&#x60;. Note that target audience languages are not limited by keyword languages. You can use English keywords to target audience that do not speak English. Supported languages: &#x60;fr&#x60;, &#x60;id&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;ms&#x60;, &#x60;ar&#x60;, &#x60;vi&#x60;, &#x60;en&#x60;, &#x60;ru&#x60;, &#x60;es&#x60;, &#x60;th&#x60;, &#x60;tr&#x60;, &#x60;hi&#x60;, &#x60;zh&#x60;, &#x60;de&#x60;, &#x60;ko&#x60; | [optional] 
 **limit** | **int**| Number of recommended keywords you want to get. Default value: 50. Value range: 1-50 | [optional] 
 **mode** | **str**| Search mode. Enum values: &#x60;FUZZ_MATCH&#x60;, &#x60;SEMANTIC_RECOMMEND&#x60;. Default value: &#x60;FUZZ_MATCH&#x60; | [optional] 
 **audience_type** | **str**| Audience type. Enum values: &#x60;GENERAL_INTEREST&#x60;: General interest. The audiences have a general, long-term interest in a video category. &#x60;PURCHASE_INTENTION&#x60;: Purchase intent. The audiences recent behavior suggests they may buy something related to a content category. Default value: &#x60;GENERAL_INTEREST&#x60; | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_language**
> InlineResponse200 tool_language(advertiser_id, access_token)

Get languages [Tool Language](https://ads.tiktok.com/marketing_api/docs?id=1737188554152962)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get languages [Tool Language](https://ads.tiktok.com/marketing_api/docs?id=1737188554152962)
    api_response = api_instance.tool_language(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_language: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_open_url**
> InlineResponse200 tool_open_url(advertiser_id, url, url_type, access_token)

Get a TikTok in-app link [Tool Open_url](https://ads.tiktok.com/marketing_api/docs?id=1738457335681026)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
url = 'url_example' # str | Open URL that you want to get the internal link for.
url_type = 'url_type_example' # str | Type of the open TikTok URL. Enum: USER_PROFILE VIDEO: Video detail page HASHTAG_CHALLENGE: Hashtag challenge page MUSIC: Music page STICKER: Sticker (special effect) page STICKER_SHOOTER: Shoot a video with a sticker (special effect).
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get a TikTok in-app link [Tool Open_url](https://ads.tiktok.com/marketing_api/docs?id=1738457335681026)
    api_response = api_instance.tool_open_url(advertiser_id, url, url_type, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_open_url: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **url** | **str**| Open URL that you want to get the internal link for. | [required]
 **url_type** | **str**| Type of the open TikTok URL. Enum: USER_PROFILE VIDEO: Video detail page HASHTAG_CHALLENGE: Hashtag challenge page MUSIC: Music page STICKER: Sticker (special effect) page STICKER_SHOOTER: Shoot a video with a sticker (special effect). | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_os_version**
> InlineResponse200 tool_os_version(advertiser_id, os_type, access_token)

Get OS versions [Tool Os_version](https://ads.tiktok.com/marketing_api/docs?id=1738308662898689)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
os_type = 'os_type_example' # str | OS type. Enum values: ANDROID,IOS.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get OS versions [Tool Os_version](https://ads.tiktok.com/marketing_api/docs?id=1738308662898689)
    api_response = api_instance.tool_os_version(advertiser_id, os_type, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_os_version: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **os_type** | **str**| OS type. Enum values: ANDROID,IOS. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_phone_region_code**
> InlineResponse200 tool_phone_region_code(advertiser_id, access_token)

Get region calling codes and region codes for phone numbers [Tool Phone_region_code](https://ads.tiktok.com/marketing_api/docs?id=1774488637039618)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get region calling codes and region codes for phone numbers [Tool Phone_region_code](https://ads.tiktok.com/marketing_api/docs?id=1774488637039618)
    api_response = api_instance.tool_phone_region_code(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_phone_region_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_region**
> InlineResponse200 tool_region(advertiser_id, placements, objective_type, access_token, promotion_target_type=promotion_target_type, operating_system=operating_system, brand_safety_type=brand_safety_type, brand_safety_partner=brand_safety_partner, level_range=level_range, rf_campaign_type=rf_campaign_type)

Get available locations [Tool Region](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
placements = ['placements_example'] # list[str] | The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138)
objective_type = 'objective_type_example' # str | Your objective type. For enum values and descriptions, see [Objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561)
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
promotion_target_type = 'promotion_target_type_example' # str | Valid when `objective_type` is `LEAD_GENERATION`. The promotion type for Lead Generation objective. Enum values: `INSTANT_PAGE`：Instant Form. To create a fast-loading in-app TikTok Instant Form to collect more leads. `EXTERNAL_WEBSITE`：Website Form. To use a landing page that has the Website Form or the TikTok Instant Page that redirects to the website with the Website Form to collect more leads.Note: The field is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative (optional)
operating_system = 'operating_system_example' # str | Operating systems that you want to target. Enum values: `ANDROID`, `IOS` (optional)
brand_safety_type = 'brand_safety_type_example' # str | Brand safety type. Valid only when `placements` is set as `PLACEMENT_TIKTOK`. Default value: `NO_BRAND_SAFETY` (optional)
brand_safety_partner = 'brand_safety_partner_example' # str | Brand safety partner. Required when `brand_safety_type` is `THIRD_PARTY`, and `placements` needs to be set as `PLACEMENT_TIKTOK`. Enum values: `IAS`, `OPEN_SLATE`.Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative (optional)
level_range = 'level_range_example' # str | Location level you want to get. Enum values: `ALL`: all levels`TO_COUNTRY`: only country or region level `TO_PROVINCE`: country and province level; DMA and Metropolitan are at province level.`TO_CITY`: country, province, and city levels`TO_DISTRICT`: country, province, city, and district levels. (optional)
rf_campaign_type = 'rf_campaign_type_example' # str | When `objective_type` is specified as `RF_REACH`, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Enum values: `STANDARD` (Reach & Frequency campaign), `PULSE` (TikTok Pulse campaign). If you set this field as `PULSE`, only one location ID (`location_id`) will be returned.Note: Do not pass in this field when `objective_type` is not specified as `RF_REACH`. You need to pass the `location_id` value returned in this endpoint to `location_ids` when you use [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id=1738235338194945) to create a TikTok Pulse ad group. (optional)

try:
    # Get available locations [Tool Region](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713)
    api_response = api_instance.tool_region(advertiser_id, placements, objective_type, access_token, promotion_target_type=promotion_target_type, operating_system=operating_system, brand_safety_type=brand_safety_type, brand_safety_partner=brand_safety_partner, level_range=level_range, rf_campaign_type=rf_campaign_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_region: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **placements** | [**list[str]**](str.md)| The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) | [required]
 **objective_type** | **str**| Your objective type. For enum values and descriptions, see [Objectives](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585562434561) | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **promotion_target_type** | **str**| Valid when &#x60;objective_type&#x60; is &#x60;LEAD_GENERATION&#x60;. The promotion type for Lead Generation objective. Enum values: &#x60;INSTANT_PAGE&#x60;：Instant Form. To create a fast-loading in-app TikTok Instant Form to collect more leads. &#x60;EXTERNAL_WEBSITE&#x60;：Website Form. To use a landing page that has the Website Form or the TikTok Instant Page that redirects to the website with the Website Form to collect more leads.Note: The field is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative | [optional] 
 **operating_system** | **str**| Operating systems that you want to target. Enum values: &#x60;ANDROID&#x60;, &#x60;IOS&#x60; | [optional] 
 **brand_safety_type** | **str**| Brand safety type. Valid only when &#x60;placements&#x60; is set as &#x60;PLACEMENT_TIKTOK&#x60;. Default value: &#x60;NO_BRAND_SAFETY&#x60; | [optional] 
 **brand_safety_partner** | **str**| Brand safety partner. Required when &#x60;brand_safety_type&#x60; is &#x60;THIRD_PARTY&#x60;, and &#x60;placements&#x60; needs to be set as &#x60;PLACEMENT_TIKTOK&#x60;. Enum values: &#x60;IAS&#x60;, &#x60;OPEN_SLATE&#x60;.Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative | [optional] 
 **level_range** | **str**| Location level you want to get. Enum values: &#x60;ALL&#x60;: all levels&#x60;TO_COUNTRY&#x60;: only country or region level &#x60;TO_PROVINCE&#x60;: country and province level; DMA and Metropolitan are at province level.&#x60;TO_CITY&#x60;: country, province, and city levels&#x60;TO_DISTRICT&#x60;: country, province, city, and district levels. | [optional] 
 **rf_campaign_type** | **str**| When &#x60;objective_type&#x60; is specified as &#x60;RF_REACH&#x60;, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Enum values: &#x60;STANDARD&#x60; (Reach &amp; Frequency campaign), &#x60;PULSE&#x60; (TikTok Pulse campaign). If you set this field as &#x60;PULSE&#x60;, only one location ID (&#x60;location_id&#x60;) will be returned.Note: Do not pass in this field when &#x60;objective_type&#x60; is not specified as &#x60;RF_REACH&#x60;. You need to pass the &#x60;location_id&#x60; value returned in this endpoint to &#x60;location_ids&#x60; when you use [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738235338194945) to create a TikTok Pulse ad group. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_targeting_info**
> InlineResponse200 tool_targeting_info(access_token, body=body)

Obtain details about location targeting tags by ID [Tool Targeting Info](https://ads.tiktok.com/marketing_api/docs?id=1761237001980929)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.TargetingInfoBody() # TargetingInfoBody |  (optional)

try:
    # Obtain details about location targeting tags by ID [Tool Targeting Info](https://ads.tiktok.com/marketing_api/docs?id=1761237001980929)
    api_response = api_instance.tool_targeting_info(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_targeting_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**TargetingInfoBody**](TargetingInfoBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_targeting_list**
> InlineResponse200 tool_targeting_list(advertiser_id, location_ids, scene, access_token)

Get internet service providers [Tool Targeting List](https://ads.tiktok.com/marketing_api/docs?id=1762962378261506)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
location_ids = ['location_ids_example'] # list[str] | IDs of the locations that you want to get the supported ISP IDs for. Max size: 1000. To find out the list of location IDs, see Location IDs. Note: You need to pass location IDs at the country or region level. To get the available locations and corresponding IDs based on your placement and objective, use the /tool/region/ and the returned level for location IDs at the country or region level will be COUNTRY.
scene = 'scene_example' # str | The targeting type that the targeting tags are used for. The allowed enum values: ISP ( Internet Service Provider targeting).
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get internet service providers [Tool Targeting List](https://ads.tiktok.com/marketing_api/docs?id=1762962378261506)
    api_response = api_instance.tool_targeting_list(advertiser_id, location_ids, scene, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_targeting_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **location_ids** | [**list[str]**](str.md)| IDs of the locations that you want to get the supported ISP IDs for. Max size: 1000. To find out the list of location IDs, see Location IDs. Note: You need to pass location IDs at the country or region level. To get the available locations and corresponding IDs based on your placement and objective, use the /tool/region/ and the returned level for location IDs at the country or region level will be COUNTRY. | [required]
 **scene** | **str**| The targeting type that the targeting tags are used for. The allowed enum values: ISP ( Internet Service Provider targeting). | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_targeting_search**
> InlineResponse200 tool_targeting_search(access_token, body=body)

Search for location targeting tags [Tool Targeting Search](https://ads.tiktok.com/marketing_api/docs?id=1761236883355649)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.TargetingSearchBody() # TargetingSearchBody |  (optional)

try:
    # Search for location targeting tags [Tool Targeting Search](https://ads.tiktok.com/marketing_api/docs?id=1761236883355649)
    api_response = api_instance.tool_targeting_search(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_targeting_search: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**TargetingSearchBody**](TargetingSearchBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_timezone**
> InlineResponse200 tool_timezone(advertiser_id, access_token)

Get time zones [Tool Timezone](https://ads.tiktok.com/marketing_api/docs?id=1738455961470977)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get time zones [Tool Timezone](https://ads.tiktok.com/marketing_api/docs?id=1738455961470977)
    api_response = api_instance.tool_timezone(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_timezone: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_url_validate**
> InlineResponse200 tool_url_validate(advertiser_id, url, access_token)

Get the verification results of a URL [Tool Url_validate](https://ads.tiktok.com/marketing_api/docs?id=1774487686007810)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
url = 'url_example' # str | The URL that you want to get verification results for.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the verification results of a URL [Tool Url_validate](https://ads.tiktok.com/marketing_api/docs?id=1774487686007810)
    api_response = api_instance.tool_url_validate(advertiser_id, url, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_url_validate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **url** | **str**| The URL that you want to get verification results for. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tool_vbo_status**
> InlineResponse200 tool_vbo_status(advertiser_id, objective_type, promotion_type, placements, access_token, pixel_id=pixel_id, app_id=app_id, optimization_event=optimization_event, ios14_quota_type=ios14_quota_type, app_promotion_type=app_promotion_type, store_id=store_id, campaign_app_profile_page_state=campaign_app_profile_page_state, is_smart_performance_campaign=is_smart_performance_campaign, budget_optimize_on=budget_optimize_on, campaign_type=campaign_type)

Check Value-Based Optimization eligibility [Tool Vbo_status](https://ads.tiktok.com/marketing_api/docs?id=1770016073586753)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ToolApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
objective_type = 'objective_type_example' # str | Advertising objective. Set this field to APP_PROMOTION, WEB_CONVERSIONS, or PRODUCT_SALES. When you set this field to any other objective, vo_status will be NOT_SUPPORT because these objectives are not supported for VBO. For enum values and descriptions, see Objectives. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id.
promotion_type = 'promotion_type_example' # str | Promotion type and you can decide where you'd like to promote your products using this field. For enum values, see Enumeration - Promotion Type. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id.
placements = ['placements_example'] # list[str] | The apps where you want to deliver your ads. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. For Product Sales campaigns (objective_type = PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
pixel_id = 'pixel_id_example' # str | Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. Pixel ID. When you pass in this field, you need to specify optimization_event at the same time. To get Pixel IDs, use the /pixel/list/ endpoint. (optional)
app_id = 'app_id_example' # str | Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. The Application ID of the promoted app. To get App IDs, use the /app/list/ endpoint. (optional)
optimization_event = 'optimization_event_example' # str | Required when pixel_id is passed. Ignored when app_id is passed. Conversion event for the ad group. See Conversion events for more. (optional)
ios14_quota_type = 'ios14_quota_type_example' # str | Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. We recommend using campaign_type alone when you specify an iOS 14 Dedicated Campaign. campaign_type as REGULAR_CAMPAIGN or ios14_quota_type as UNOCCUPIED both indicate a non-iOS 14 Dedicated Campaign. campaign_type as IOS14_CAMPAIGN or ios14_quota_type as OCCUPIED both indicate an iOS 14 Dedicated Campaign. Whether the campaign will be counted towards the iOS 14 Dedicated Campaign quota. Enum values: OCCUPIED: The campaign is an iOS 14 Dedicated Campaign. UNOCCUPIED: The campaign is not an iOS 14 Dedicated Campaign. (optional)
app_promotion_type = 'app_promotion_type_example' # str | Required when objective_type is APP_PROMOTION. App promotion type. Enum values: APP_INSTALL: Get new users to install your app. APP_RETARGETING: Re-engage existing users to take action in your app. Note: Only the enum value APP_INSTALL can be used in an iOS14 Dedicated Campaign. (optional)
store_id = 'store_id_example' # str | Valid only when objective_type is PRODUCT_SALES. ID of the TikTok Shop. Note: To get the TikTok Shop ID, you can use /bc/asset/get/: When in the response asset_type is TIKTOK_SHOP, the returned asset_id is the TikTok Shop ID. (optional)
campaign_app_profile_page_state = 'campaign_app_profile_page_state_example' # str | Whether to use App Profile Page at the campaign level to optimize delivery. Enum values: ON, OFF. You can use the field only when objective_type is APP_PROMOTION and your campaign is an iOS14 Dedicated Campaign (ios14_quota_type =OCCUPIED). Otherwise, an error will occur. (optional)
is_smart_performance_campaign = true # bool | Whether the campaign is a Smart+ Campaign or not. Enum values: true, false. (optional)
budget_optimize_on = false # bool | Whether to enable Campaign Budget Optimization (CBO). Enum values: true, false. For details about CBO, see Campaign Budget Optimization. (optional) (default to false)
campaign_type = 'campaign_type_example' # str | Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. Campaign type. Enums values: REGULAR_CAMPAIGN: non-iOS 14 Dedicated Campaign. IOS14_CAMPAIGN: iOS 14 Dedicated Campaign. The value IOS14_CAMPAIGN can only be used when: objective_type is PRODUCT_SALES. objective_type is APP_PROMOTION and app_promotion_type is APP_INSTALL. (optional)

try:
    # Check Value-Based Optimization eligibility [Tool Vbo_status](https://ads.tiktok.com/marketing_api/docs?id=1770016073586753)
    api_response = api_instance.tool_vbo_status(advertiser_id, objective_type, promotion_type, placements, access_token, pixel_id=pixel_id, app_id=app_id, optimization_event=optimization_event, ios14_quota_type=ios14_quota_type, app_promotion_type=app_promotion_type, store_id=store_id, campaign_app_profile_page_state=campaign_app_profile_page_state, is_smart_performance_campaign=is_smart_performance_campaign, budget_optimize_on=budget_optimize_on, campaign_type=campaign_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ToolApi->tool_vbo_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **objective_type** | **str**| Advertising objective. Set this field to APP_PROMOTION, WEB_CONVERSIONS, or PRODUCT_SALES. When you set this field to any other objective, vo_status will be NOT_SUPPORT because these objectives are not supported for VBO. For enum values and descriptions, see Objectives. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id. | [required]
 **promotion_type** | **str**| Promotion type and you can decide where you&#x27;d like to promote your products using this field. For enum values, see Enumeration - Promotion Type. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id. | [required]
 **placements** | [**list[str]**](str.md)| The apps where you want to deliver your ads. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **pixel_id** | **str**| Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. Pixel ID. When you pass in this field, you need to specify optimization_event at the same time. To get Pixel IDs, use the /pixel/list/ endpoint. | [optional] 
 **app_id** | **str**| Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. The Application ID of the promoted app. To get App IDs, use the /app/list/ endpoint. | [optional] 
 **optimization_event** | **str**| Required when pixel_id is passed. Ignored when app_id is passed. Conversion event for the ad group. See Conversion events for more. | [optional] 
 **ios14_quota_type** | **str**| Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. We recommend using campaign_type alone when you specify an iOS 14 Dedicated Campaign. campaign_type as REGULAR_CAMPAIGN or ios14_quota_type as UNOCCUPIED both indicate a non-iOS 14 Dedicated Campaign. campaign_type as IOS14_CAMPAIGN or ios14_quota_type as OCCUPIED both indicate an iOS 14 Dedicated Campaign. Whether the campaign will be counted towards the iOS 14 Dedicated Campaign quota. Enum values: OCCUPIED: The campaign is an iOS 14 Dedicated Campaign. UNOCCUPIED: The campaign is not an iOS 14 Dedicated Campaign. | [optional] 
 **app_promotion_type** | **str**| Required when objective_type is APP_PROMOTION. App promotion type. Enum values: APP_INSTALL: Get new users to install your app. APP_RETARGETING: Re-engage existing users to take action in your app. Note: Only the enum value APP_INSTALL can be used in an iOS14 Dedicated Campaign. | [optional] 
 **store_id** | **str**| Valid only when objective_type is PRODUCT_SALES. ID of the TikTok Shop. Note: To get the TikTok Shop ID, you can use /bc/asset/get/: When in the response asset_type is TIKTOK_SHOP, the returned asset_id is the TikTok Shop ID. | [optional] 
 **campaign_app_profile_page_state** | **str**| Whether to use App Profile Page at the campaign level to optimize delivery. Enum values: ON, OFF. You can use the field only when objective_type is APP_PROMOTION and your campaign is an iOS14 Dedicated Campaign (ios14_quota_type &#x3D;OCCUPIED). Otherwise, an error will occur. | [optional] 
 **is_smart_performance_campaign** | **bool**| Whether the campaign is a Smart+ Campaign or not. Enum values: true, false. | [optional] 
 **budget_optimize_on** | **bool**| Whether to enable Campaign Budget Optimization (CBO). Enum values: true, false. For details about CBO, see Campaign Budget Optimization. | [optional] [default to false]
 **campaign_type** | **str**| Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. Campaign type. Enums values: REGULAR_CAMPAIGN: non-iOS 14 Dedicated Campaign. IOS14_CAMPAIGN: iOS 14 Dedicated Campaign. The value IOS14_CAMPAIGN can only be used when: objective_type is PRODUCT_SALES. objective_type is APP_PROMOTION and app_promotion_type is APP_INSTALL. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

