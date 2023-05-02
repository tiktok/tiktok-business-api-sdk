# FilteringReportIntegratedGet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field_name** | **str** | Filter field name. | [optional] 
**filter_type** | **str** | Filter type. Enum values- &#x60;IN&#x60;- Contains. When the filter type is this item, the filtered value needs to be a valid JSON array character string. &#x60;MATCH&#x60;- Fuzzy matching, equivalent to &#x60;like&#x60; operations in MySQL. &#x60;GREATER_EQUAL&#x60;- Greater than or equal to. &#x60;GREATER_THAN&#x60;- Greater than. &#x60;LOWER_EQUAL&#x60;- Less than or equal to.&#x60;LOWER_THAN&#x60;- Less than. &#x60;BETWEEN&#x60;- Between. When the filter type is this item, the filtered value needs to be a valid JSON array of 2-element string. | [optional] 
**filter_value** | **str** | The value to filter. When filter_type is &#x60;IN&#x60;, filter_value needs to be a valid JSON array character string. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

