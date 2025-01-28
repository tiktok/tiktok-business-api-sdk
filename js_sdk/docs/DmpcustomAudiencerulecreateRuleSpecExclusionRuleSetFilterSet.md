# js_sdk.DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**[DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters]**](DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.md) | Required when exclusion_rule_set is passed. An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1. | [required] 
**operator** | **String** | Required when exclusion_rule_set is passed. Operator between filters in the filters object array. Enum value: OR. Within each exclusion rule, you can only specify one object in filters. | [required] 
