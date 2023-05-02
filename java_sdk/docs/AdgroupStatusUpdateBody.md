# AdgroupStatusUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupIds** | **List&lt;String&gt;** | The ID of the ad group(s) to be operated. The allowed quantity range is &#x60;1-20&#x60;. |[required]  
**advertiserId** | **String** | Advertiser ID |[required]  
**operationStatus** | **String** | The operation being made.Enum values- &#x60;DELETE&#x60; (delete),&#x60; DISABLE&#x60; (pause), &#x60;ENABLE&#x60; (enable). The status of deleted ads cannot be modified. |[required]  
