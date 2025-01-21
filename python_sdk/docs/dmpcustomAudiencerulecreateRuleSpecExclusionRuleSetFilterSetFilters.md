# dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** | Required when exclusion_rule_set is passed. Filter field. Enum value: EVENT: To exclude the people who&#x27;ve carried out a certain action in the past few days as indicated by retention_days. | [required] 
**operator** | **str** | Required when exclusion_rule_set is passed. Filter operator between filter field and filter value. Enum value: EQ: equals. | [required] 
**parameter_filters** | [**list[dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters]**](dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters.md) | List of filters on URL keywords or parameters. Within parameter_filters, you can add a maximum of one URL keyword filter (with field set to URL) and 10 parameter filters (with field not set to URL) . If specified, these filters (parameter_filters) are combined with the action filter (as specified by field, operator and value) using default AND logic to form the exclusion rule. For example, if retention_days is 30 and filter_set is set to {\&quot;operator\&quot;: \&quot;OR\&quot;, \&quot;filters\&quot;:[{\&quot;field\&quot;:\&quot;EVENT\&quot;,\&quot;operator\&quot;:\&quot;EQ\&quot;, \&quot;value\&quot;:\&quot;PIXEL COMPLETE PAYMENT\&quot;},\&quot;parameter_filters\&quot;:[{\&quot;field\&quot;:\&quot;URL\&quot;,\&quot;operator\&quot;:\&quot;CONTAINS\&quot;,\&quot;value\&quot;:\&quot;us\&quot;}]]}, the exclusion rule will create an audience that excludes people who carried out the \&quot;Complete Payment\&quot; action on a webpage with \&quot;us\&quot; included in the page URL within the past 30 days on the website where the Pixel is installed. | [optional] 
**value** | **str** | Required when exclusion_rule_set is passed. Filter value. For enum values, see Enumeration - Filter Value. | [required] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

