# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class TargetingSearchBody(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'advertiser_id': 'str',
        'brand_safety_partner': 'str',
        'brand_safety_type': 'str',
        'geo_types': 'list[str]',
        'keywords': 'list[str]',
        'objective_type': 'str',
        'operating_system': 'str',
        'placements': 'list[str]',
        'promotion_type': 'str',
        'region_codes': 'list[str]',
        'search_type': 'str'
    }

    attribute_map = {
        'advertiser_id': 'advertiser_id',
        'brand_safety_partner': 'brand_safety_partner',
        'brand_safety_type': 'brand_safety_type',
        'geo_types': 'geo_types',
        'keywords': 'keywords',
        'objective_type': 'objective_type',
        'operating_system': 'operating_system',
        'placements': 'placements',
        'promotion_type': 'promotion_type',
        'region_codes': 'region_codes',
        'search_type': 'search_type'
    }

    def __init__(self, advertiser_id=None, brand_safety_partner=None, brand_safety_type=None, geo_types=None, keywords=None, objective_type=None, operating_system=None, placements=None, promotion_type=None, region_codes=None, search_type=None):  # noqa: E501
        """TargetingSearchBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_id = None
        self._brand_safety_partner = None
        self._brand_safety_type = None
        self._geo_types = None
        self._keywords = None
        self._objective_type = None
        self._operating_system = None
        self._placements = None
        self._promotion_type = None
        self._region_codes = None
        self._search_type = None
        self.discriminator = None
        self.advertiser_id = advertiser_id
        if brand_safety_partner is not None:
            self.brand_safety_partner = brand_safety_partner
        if brand_safety_type is not None:
            self.brand_safety_type = brand_safety_type
        if geo_types is not None:
            self.geo_types = geo_types
        self.keywords = keywords
        self.objective_type = objective_type
        if operating_system is not None:
            self.operating_system = operating_system
        self.placements = placements
        if promotion_type is not None:
            self.promotion_type = promotion_type
        if region_codes is not None:
            self.region_codes = region_codes
        self.search_type = search_type

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this TargetingSearchBody.  # noqa: E501

        Advertiser ID.  # noqa: E501

        :return: The advertiser_id of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this TargetingSearchBody.

        Advertiser ID.  # noqa: E501

        :param advertiser_id: The advertiser_id of this TargetingSearchBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def brand_safety_partner(self):
        """Gets the brand_safety_partner of this TargetingSearchBody.  # noqa: E501

        Required only when brand_safety_type is THIRD_PARTY. Brand safety partner. Enum values: IAS, OPEN_SLATE(The partner is named DoubleVerify on TikTok Ads Manager because the partner has been acquired by DoubleVerify). Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  # noqa: E501

        :return: The brand_safety_partner of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._brand_safety_partner

    @brand_safety_partner.setter
    def brand_safety_partner(self, brand_safety_partner):
        """Sets the brand_safety_partner of this TargetingSearchBody.

        Required only when brand_safety_type is THIRD_PARTY. Brand safety partner. Enum values: IAS, OPEN_SLATE(The partner is named DoubleVerify on TikTok Ads Manager because the partner has been acquired by DoubleVerify). Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  # noqa: E501

        :param brand_safety_partner: The brand_safety_partner of this TargetingSearchBody.  # noqa: E501
        :type: str
        """

        self._brand_safety_partner = brand_safety_partner

    @property
    def brand_safety_type(self):
        """Gets the brand_safety_type of this TargetingSearchBody.  # noqa: E501

        Brand safety type. Valid only when placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.  # noqa: E501

        :return: The brand_safety_type of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._brand_safety_type

    @brand_safety_type.setter
    def brand_safety_type(self, brand_safety_type):
        """Sets the brand_safety_type of this TargetingSearchBody.

        Brand safety type. Valid only when placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.  # noqa: E501

        :param brand_safety_type: The brand_safety_type of this TargetingSearchBody.  # noqa: E501
        :type: str
        """

        self._brand_safety_type = brand_safety_type

    @property
    def geo_types(self):
        """Gets the geo_types of this TargetingSearchBody.  # noqa: E501

        The types of locations that you want to filter the results by. Enum values: COUNTRY (country or region), PROVINCE (province), CITY (city or county), DISTRICT (district or city), DMA (DMA), ZIP_CODE (zip code or postal code). When you specify search_type as FUZZY_SEARCH, the allowed enum values for this field are ZIP_CODE, COUNTRY, PROVINCE, CITY, DISTRICT, and DMA. When you specify search_type as BATCH_ZIPCODE_SEARCH, the allowed enum value for this field is ZIP_CODE. When you specify search_type as BATCH_REGION_SEARCH, the allowed enum values for this field are COUNTRY, PROVINCE, CITY, DISTRICT, and DMA.  # noqa: E501

        :return: The geo_types of this TargetingSearchBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._geo_types

    @geo_types.setter
    def geo_types(self, geo_types):
        """Sets the geo_types of this TargetingSearchBody.

        The types of locations that you want to filter the results by. Enum values: COUNTRY (country or region), PROVINCE (province), CITY (city or county), DISTRICT (district or city), DMA (DMA), ZIP_CODE (zip code or postal code). When you specify search_type as FUZZY_SEARCH, the allowed enum values for this field are ZIP_CODE, COUNTRY, PROVINCE, CITY, DISTRICT, and DMA. When you specify search_type as BATCH_ZIPCODE_SEARCH, the allowed enum value for this field is ZIP_CODE. When you specify search_type as BATCH_REGION_SEARCH, the allowed enum values for this field are COUNTRY, PROVINCE, CITY, DISTRICT, and DMA.  # noqa: E501

        :param geo_types: The geo_types of this TargetingSearchBody.  # noqa: E501
        :type: list[str]
        """

        self._geo_types = geo_types

    @property
    def keywords(self):
        """Gets the keywords of this TargetingSearchBody.  # noqa: E501

        The keywords that you use to search for targeting tags. Length limit: 1 when search_type is FUZZY_SEARCH. 1,000 when search_type is BATCH_REGION_SEARCH or BATCH_ZIPCODE_SEARCH. If you set search_type as BATCH_ZIPCODE_SEARCH, you need to pass zip codes or postal codes as keywords because this search type only supports exact search. For US zip code targeting, provide the five-digit US zip codes as keywords. Example: [\"10001\",\"10002\"]. For Canadian postal code targeting, provide the three-character Forward Sortation Area (FSA) portions of Canadian postal codes as keywords. Example: [\"A0A\",\"A0B\"].  # noqa: E501

        :return: The keywords of this TargetingSearchBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._keywords

    @keywords.setter
    def keywords(self, keywords):
        """Sets the keywords of this TargetingSearchBody.

        The keywords that you use to search for targeting tags. Length limit: 1 when search_type is FUZZY_SEARCH. 1,000 when search_type is BATCH_REGION_SEARCH or BATCH_ZIPCODE_SEARCH. If you set search_type as BATCH_ZIPCODE_SEARCH, you need to pass zip codes or postal codes as keywords because this search type only supports exact search. For US zip code targeting, provide the five-digit US zip codes as keywords. Example: [\"10001\",\"10002\"]. For Canadian postal code targeting, provide the three-character Forward Sortation Area (FSA) portions of Canadian postal codes as keywords. Example: [\"A0A\",\"A0B\"].  # noqa: E501

        :param keywords: The keywords of this TargetingSearchBody.  # noqa: E501
        :type: list[str]
        """
        if keywords is None:
            raise ValueError("Invalid value for `keywords`, must not be `None`")  # noqa: E501

        self._keywords = keywords

    @property
    def objective_type(self):
        """Gets the objective_type of this TargetingSearchBody.  # noqa: E501

        Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.  # noqa: E501

        :return: The objective_type of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._objective_type

    @objective_type.setter
    def objective_type(self, objective_type):
        """Sets the objective_type of this TargetingSearchBody.

        Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.  # noqa: E501

        :param objective_type: The objective_type of this TargetingSearchBody.  # noqa: E501
        :type: str
        """
        if objective_type is None:
            raise ValueError("Invalid value for `objective_type`, must not be `None`")  # noqa: E501

        self._objective_type = objective_type

    @property
    def operating_system(self):
        """Gets the operating_system of this TargetingSearchBody.  # noqa: E501

        Device operating system that you want to target. Enum values: ANDROID, IOS.  # noqa: E501

        :return: The operating_system of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._operating_system

    @operating_system.setter
    def operating_system(self, operating_system):
        """Sets the operating_system of this TargetingSearchBody.

        Device operating system that you want to target. Enum values: ANDROID, IOS.  # noqa: E501

        :param operating_system: The operating_system of this TargetingSearchBody.  # noqa: E501
        :type: str
        """

        self._operating_system = operating_system

    @property
    def placements(self):
        """Gets the placements of this TargetingSearchBody.  # noqa: E501

        The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to fuzzy search for a zip code ID to be used for zip code targeting in the US or a postal code ID to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.  # noqa: E501

        :return: The placements of this TargetingSearchBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._placements

    @placements.setter
    def placements(self, placements):
        """Sets the placements of this TargetingSearchBody.

        The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to fuzzy search for a zip code ID to be used for zip code targeting in the US or a postal code ID to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.  # noqa: E501

        :param placements: The placements of this TargetingSearchBody.  # noqa: E501
        :type: list[str]
        """
        if placements is None:
            raise ValueError("Invalid value for `placements`, must not be `None`")  # noqa: E501

        self._placements = placements

    @property
    def promotion_type(self):
        """Gets the promotion_type of this TargetingSearchBody.  # noqa: E501

        Promotion type and you can decide where you'd like to promote your products using this field. You need to specify the field when advertising objective (objective_type) for your campaign is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. For enum values, see Enumeration - Promotion Type.  # noqa: E501

        :return: The promotion_type of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._promotion_type

    @promotion_type.setter
    def promotion_type(self, promotion_type):
        """Sets the promotion_type of this TargetingSearchBody.

        Promotion type and you can decide where you'd like to promote your products using this field. You need to specify the field when advertising objective (objective_type) for your campaign is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. For enum values, see Enumeration - Promotion Type.  # noqa: E501

        :param promotion_type: The promotion_type of this TargetingSearchBody.  # noqa: E501
        :type: str
        """

        self._promotion_type = promotion_type

    @property
    def region_codes(self):
        """Gets the region_codes of this TargetingSearchBody.  # noqa: E501

        The codes of targeted countries or regions that you want to filter the results by. When you specify search_type as BATCH_ZIPCODE_SEARCH or BATCH_REGION_SEARCH, this field is required and needs to be set as US (the US) or CA (Canada). When you specify search_type as FUZZY_SEARCH, this field is optional and you can pass any supported country or region code to this field. To find out the complete list of country or region codes, see Location code.  # noqa: E501

        :return: The region_codes of this TargetingSearchBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._region_codes

    @region_codes.setter
    def region_codes(self, region_codes):
        """Sets the region_codes of this TargetingSearchBody.

        The codes of targeted countries or regions that you want to filter the results by. When you specify search_type as BATCH_ZIPCODE_SEARCH or BATCH_REGION_SEARCH, this field is required and needs to be set as US (the US) or CA (Canada). When you specify search_type as FUZZY_SEARCH, this field is optional and you can pass any supported country or region code to this field. To find out the complete list of country or region codes, see Location code.  # noqa: E501

        :param region_codes: The region_codes of this TargetingSearchBody.  # noqa: E501
        :type: list[str]
        """

        self._region_codes = region_codes

    @property
    def search_type(self):
        """Gets the search_type of this TargetingSearchBody.  # noqa: E501

        The type of search you want to perform. Enum values: FUZZY_SEARCH: To fuzzy search for a single location ID, a zip code ID, or a postal code ID. For this search type, you can only pass one keyword to keywords and a maximum of 100 results will be returned. BATCH_REGION_SEARCH: To search for location IDs in batch. Fuzzy search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword a maximum of 5 results ordered by relevance will be returned. BATCH_ZIPCODE_SEARCH: To search for zip code IDs or postal code IDs in batch. Exact search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword one result or no result will be returned. Note: The enum values BATCH_ZIPCODE_SEARCH and BATCH_REGION_SEARCH can only be used to search for IDs of zip codes (or postal codes) or locations in the US or Canada. In contrast, you can use FUZZY_SEARCH to search for a single ID of a zip code (or postal code) or location in the US or Canada or in another country.  # noqa: E501

        :return: The search_type of this TargetingSearchBody.  # noqa: E501
        :rtype: str
        """
        return self._search_type

    @search_type.setter
    def search_type(self, search_type):
        """Sets the search_type of this TargetingSearchBody.

        The type of search you want to perform. Enum values: FUZZY_SEARCH: To fuzzy search for a single location ID, a zip code ID, or a postal code ID. For this search type, you can only pass one keyword to keywords and a maximum of 100 results will be returned. BATCH_REGION_SEARCH: To search for location IDs in batch. Fuzzy search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword a maximum of 5 results ordered by relevance will be returned. BATCH_ZIPCODE_SEARCH: To search for zip code IDs or postal code IDs in batch. Exact search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword one result or no result will be returned. Note: The enum values BATCH_ZIPCODE_SEARCH and BATCH_REGION_SEARCH can only be used to search for IDs of zip codes (or postal codes) or locations in the US or Canada. In contrast, you can use FUZZY_SEARCH to search for a single ID of a zip code (or postal code) or location in the US or Canada or in another country.  # noqa: E501

        :param search_type: The search_type of this TargetingSearchBody.  # noqa: E501
        :type: str
        """
        if search_type is None:
            raise ValueError("Invalid value for `search_type`, must not be `None`")  # noqa: E501

        self._search_type = search_type

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(TargetingSearchBody, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, TargetingSearchBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other