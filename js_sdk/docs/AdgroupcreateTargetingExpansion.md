# js_sdk.AdgroupcreateTargetingExpansion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expansion_enabled** | **Boolean** | Whether to enable targeting expansion | [optional] 
**expansion_types** | **[String]** | The target audience types that you want to expand. Required when &#x60;expansion_enabled&#x60; is &#x60;true&#x60;. Target audience types that are eligible for expanding must already have a value or selection. Enum values- &#x60;AGE&#x60;&#x60;GENDER&#x60;&#x60;INTEREST_AND_BEHAVIOR&#x60;- This type includes &#x60;ad_tag_v2&#x60;, &#x60;video_action&#x60;,  &#x60;action_categories&#x60;, and &#x60;action_scene&#x60;. &#x60;CUSTOM_AUDIENCE&#x60;- This type includes &#x60;retargeting_tags&#x60; and &#x60;retargeting_tags_exclude&#x60;. | [optional] 
