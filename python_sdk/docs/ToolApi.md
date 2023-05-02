"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.ToolApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_action_category**](ToolApi.md#tool_action_category) | **GET** /open_api/v1.3/tool/action_category/ | Get action categories [Tool action](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737166752522241)
[**tool_carrier**](ToolApi.md#tool_carrier) | **GET** /open_api/v1.3/tool/carrier/ | Get carriers [Tool carrier](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737168013095938)
[**tool_device_model**](ToolApi.md#tool_device_model) | **GET** /open_api/v1.3/tool/device_model/ | Get device models [Tool device model](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172880570369)
[**tool_interest_category**](ToolApi.md#tool_interest_category) | **GET** /open_api/v1.3/tool/interest_category/ | Get interest categories [Tool Interest category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174348712961)
[**tool_interest_keyword_recommend**](ToolApi.md#tool_interest_keyword_recommend) | **GET** /open_api/v1.3/tool/interest_keyword/recommend/ | Get interest keywords [Tool kyword recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737180852720642)
[**tool_language**](ToolApi.md#tool_language) | **GET** /open_api/v1.3/tool/language/ | Get languages [Tool Language](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737188554152962)
[**tool_region**](ToolApi.md#tool_region) | **GET** /open_api/v1.3/tool/region/ | Get available locations [Tool Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737189539571713)

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

