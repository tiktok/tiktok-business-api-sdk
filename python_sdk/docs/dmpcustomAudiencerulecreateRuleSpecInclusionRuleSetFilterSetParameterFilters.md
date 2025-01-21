# dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** | Required when parameter_filters within inclusion_rule_set is passed. Filter condition. Use this field to specify whether to filter URL keywords, or Web Event parameters reported via the Pixel. Enum value: URL: URL keywords. CONTENT_TYPE: the parameter content_type. PRICE: the parameter price. VALUE: the parameter value. CONTENT_ID: the parameter content_id. CONTENT_CATEGORY: the parameter content_category. | [required] 
**operator** | **str** | Required when parameter_filters within inclusion_rule_set is passed. Filter operator between filter condition and filter value. Enum value: CONTAINS: contains. DOES_NOT_CONTAIN: doesn&#x27;t contain. EQ: equals. IS_LESS_THAN: is less than. IS_GREATER_THAN: is greater than. IS_LESS_THAN_OR_EQUAL_TO: is less than or equal to. IS_GRETER_THAN_OR_EQUAL_TO: is greater than or equal to. The allowed values vary based on the field value: If field is set to URL, operator can only be set to CONTAINS, DOES_NOT_CONTAIN, or EQ. If field is not set to URL, operator can be set to CONTAINS, DOES_NOT_CONTAINS, EQ, IS_LESS_THAN, IS_GREATER_THAN, IS_LESS_THAN_OR_EQUAL_TO, or IS_GREATER_THAN_OR_EQUAL_TO. | [required] 
**values** | **list[str]** | Required when parameter_filters within inclusion_rule_set is passed. A list of filter values. Max size: 10. Length limit for each value: 100 characters. If you specify multiple values, the values will be combined using OR logic. | [required] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

