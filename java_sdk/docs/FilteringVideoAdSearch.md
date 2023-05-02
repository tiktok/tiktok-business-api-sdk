# FilteringVideoAdSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayable** | **Boolean** | Enum values: \\n False(default value): Search in all materials \\n True: Search in the materials displayed on the platform. |  [optional]
**height** | **Integer** | Video height. |  [optional]
**materialIds** | **List&lt;String&gt;** | A list of material IDs. At most 100 IDs can be included in the list. |  [optional]
**ratio** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Video aspect ratio, e.g.: [1.7, 2.5]. Use 1.7 to search for videos with aspect ratio between 1.65-1.75, i.e. the precision floating point is 0.05. |  [optional]
**videoIds** | **List&lt;String&gt;** | A list of video IDs. At most 100 IDs can be included in the list. |  [optional]
**width** | **Integer** | Video width. |  [optional]
