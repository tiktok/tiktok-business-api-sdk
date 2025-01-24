# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class SavedAudienceCreateBody(object):
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
        'actions': 'list[DmpsavedAudiencecreateActions]',
        'advertiser_id': 'str',
        'age_groups': 'list[str]',
        'audience_ids': 'list[str]',
        'carrier_ids': 'list[str]',
        'device_model_ids': 'list[str]',
        'device_price_ranges': 'list[int]',
        'excluded_audience_ids': 'list[str]',
        'gender': 'str',
        'interest_category_ids': 'list[str]',
        'interest_keyword_ids': 'list[str]',
        'languages': 'list[str]',
        'location_ids': 'list[str]',
        'min_android_version': 'str',
        'min_ios_version': 'str',
        'network_types': 'list[str]',
        'operating_systems': 'list[str]',
        'saved_audience_name': 'str'
    }

    attribute_map = {
        'actions': 'actions',
        'advertiser_id': 'advertiser_id',
        'age_groups': 'age_groups',
        'audience_ids': 'audience_ids',
        'carrier_ids': 'carrier_ids',
        'device_model_ids': 'device_model_ids',
        'device_price_ranges': 'device_price_ranges',
        'excluded_audience_ids': 'excluded_audience_ids',
        'gender': 'gender',
        'interest_category_ids': 'interest_category_ids',
        'interest_keyword_ids': 'interest_keyword_ids',
        'languages': 'languages',
        'location_ids': 'location_ids',
        'min_android_version': 'min_android_version',
        'min_ios_version': 'min_ios_version',
        'network_types': 'network_types',
        'operating_systems': 'operating_systems',
        'saved_audience_name': 'saved_audience_name'
    }

    def __init__(self, actions=None, advertiser_id=None, age_groups=None, audience_ids=None, carrier_ids=None, device_model_ids=None, device_price_ranges=None, excluded_audience_ids=None, gender=None, interest_category_ids=None, interest_keyword_ids=None, languages=None, location_ids=None, min_android_version=None, min_ios_version=None, network_types=None, operating_systems=None, saved_audience_name=None):  # noqa: E501
        """SavedAudienceCreateBody - a model defined in Swagger"""  # noqa: E501
        self._actions = None
        self._advertiser_id = None
        self._age_groups = None
        self._audience_ids = None
        self._carrier_ids = None
        self._device_model_ids = None
        self._device_price_ranges = None
        self._excluded_audience_ids = None
        self._gender = None
        self._interest_category_ids = None
        self._interest_keyword_ids = None
        self._languages = None
        self._location_ids = None
        self._min_android_version = None
        self._min_ios_version = None
        self._network_types = None
        self._operating_systems = None
        self._saved_audience_name = None
        self.discriminator = None
        if actions is not None:
            self.actions = actions
        self.advertiser_id = advertiser_id
        if age_groups is not None:
            self.age_groups = age_groups
        if audience_ids is not None:
            self.audience_ids = audience_ids
        if carrier_ids is not None:
            self.carrier_ids = carrier_ids
        if device_model_ids is not None:
            self.device_model_ids = device_model_ids
        if device_price_ranges is not None:
            self.device_price_ranges = device_price_ranges
        if excluded_audience_ids is not None:
            self.excluded_audience_ids = excluded_audience_ids
        if gender is not None:
            self.gender = gender
        if interest_category_ids is not None:
            self.interest_category_ids = interest_category_ids
        if interest_keyword_ids is not None:
            self.interest_keyword_ids = interest_keyword_ids
        if languages is not None:
            self.languages = languages
        self.location_ids = location_ids
        if min_android_version is not None:
            self.min_android_version = min_android_version
        if min_ios_version is not None:
            self.min_ios_version = min_ios_version
        if network_types is not None:
            self.network_types = network_types
        if operating_systems is not None:
            self.operating_systems = operating_systems
        self.saved_audience_name = saved_audience_name

    @property
    def actions(self):
        """Gets the actions of this SavedAudienceCreateBody.  # noqa: E501

        A list of action category objects.  # noqa: E501

        :return: The actions of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[DmpsavedAudiencecreateActions]
        """
        return self._actions

    @actions.setter
    def actions(self, actions):
        """Sets the actions of this SavedAudienceCreateBody.

        A list of action category objects.  # noqa: E501

        :param actions: The actions of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[DmpsavedAudiencecreateActions]
        """

        self._actions = actions

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this SavedAudienceCreateBody.  # noqa: E501

        Advertiser ID.  # noqa: E501

        :return: The advertiser_id of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this SavedAudienceCreateBody.

        Advertiser ID.  # noqa: E501

        :param advertiser_id: The advertiser_id of this SavedAudienceCreateBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def age_groups(self):
        """Gets the age_groups of this SavedAudienceCreateBody.  # noqa: E501

        Age groups you want to target. For enum values, see Enumeration - Targeting Age Group.  # noqa: E501

        :return: The age_groups of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._age_groups

    @age_groups.setter
    def age_groups(self, age_groups):
        """Sets the age_groups of this SavedAudienceCreateBody.

        Age groups you want to target. For enum values, see Enumeration - Targeting Age Group.  # noqa: E501

        :param age_groups: The age_groups of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._age_groups = age_groups

    @property
    def audience_ids(self):
        """Gets the audience_ids of this SavedAudienceCreateBody.  # noqa: E501

        List of audience IDs. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.  # noqa: E501

        :return: The audience_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._audience_ids

    @audience_ids.setter
    def audience_ids(self, audience_ids):
        """Sets the audience_ids of this SavedAudienceCreateBody.

        List of audience IDs. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.  # noqa: E501

        :param audience_ids: The audience_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._audience_ids = audience_ids

    @property
    def carrier_ids(self):
        """Gets the carrier_ids of this SavedAudienceCreateBody.  # noqa: E501

        Carriers that you want to target. Use /tool/carrier/ endpoint to get a list of carriers. A carrier is valid only when the in_use field for the carrier is true. The carriers must be consistent with the location(s) that you want to target.  # noqa: E501

        :return: The carrier_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._carrier_ids

    @carrier_ids.setter
    def carrier_ids(self, carrier_ids):
        """Sets the carrier_ids of this SavedAudienceCreateBody.

        Carriers that you want to target. Use /tool/carrier/ endpoint to get a list of carriers. A carrier is valid only when the in_use field for the carrier is true. The carriers must be consistent with the location(s) that you want to target.  # noqa: E501

        :param carrier_ids: The carrier_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._carrier_ids = carrier_ids

    @property
    def device_model_ids(self):
        """Gets the device_model_ids of this SavedAudienceCreateBody.  # noqa: E501

        IDs of the device models that you want to target. Use /tool/device_model/ to get the complete list of device model IDs and their statuses, and only active devices (is_active = true in the response of /tool/device_model/) can be used to create ads. Note: Device model (device_model_ids) and device price (device_price_ranges) cannot be set at the same time.  # noqa: E501

        :return: The device_model_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._device_model_ids

    @device_model_ids.setter
    def device_model_ids(self, device_model_ids):
        """Sets the device_model_ids of this SavedAudienceCreateBody.

        IDs of the device models that you want to target. Use /tool/device_model/ to get the complete list of device model IDs and their statuses, and only active devices (is_active = true in the response of /tool/device_model/) can be used to create ads. Note: Device model (device_model_ids) and device price (device_price_ranges) cannot be set at the same time.  # noqa: E501

        :param device_model_ids: The device_model_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._device_model_ids = device_model_ids

    @property
    def device_price_ranges(self):
        """Gets the device_price_ranges of this SavedAudienceCreateBody.  # noqa: E501


        :return: The device_price_ranges of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[int]
        """
        return self._device_price_ranges

    @device_price_ranges.setter
    def device_price_ranges(self, device_price_ranges):
        """Sets the device_price_ranges of this SavedAudienceCreateBody.


        :param device_price_ranges: The device_price_ranges of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[int]
        """

        self._device_price_ranges = device_price_ranges

    @property
    def excluded_audience_ids(self):
        """Gets the excluded_audience_ids of this SavedAudienceCreateBody.  # noqa: E501

        List of audience IDs to be excluded. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.  # noqa: E501

        :return: The excluded_audience_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._excluded_audience_ids

    @excluded_audience_ids.setter
    def excluded_audience_ids(self, excluded_audience_ids):
        """Sets the excluded_audience_ids of this SavedAudienceCreateBody.

        List of audience IDs to be excluded. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.  # noqa: E501

        :param excluded_audience_ids: The excluded_audience_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._excluded_audience_ids = excluded_audience_ids

    @property
    def gender(self):
        """Gets the gender of this SavedAudienceCreateBody.  # noqa: E501

        Gender that you want to target. Enum values: GENDER_FEMALE,GENDER_MALE,GENDER_UNLIMITED  # noqa: E501

        :return: The gender of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """Sets the gender of this SavedAudienceCreateBody.

        Gender that you want to target. Enum values: GENDER_FEMALE,GENDER_MALE,GENDER_UNLIMITED  # noqa: E501

        :param gender: The gender of this SavedAudienceCreateBody.  # noqa: E501
        :type: str
        """

        self._gender = gender

    @property
    def interest_category_ids(self):
        """Gets the interest_category_ids of this SavedAudienceCreateBody.  # noqa: E501

        Interest classification. You can use /tool/target_recommend_tags/ to get a list of recommended interest categories based on your targeting regions and your industries, or use /tool/interest_category/ endpoint to get the complete list of interest categories. If the interest is specified, users who do not meet the interest target will be excluded during delivery. Do not specify if you wish to target everyone.  # noqa: E501

        :return: The interest_category_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._interest_category_ids

    @interest_category_ids.setter
    def interest_category_ids(self, interest_category_ids):
        """Sets the interest_category_ids of this SavedAudienceCreateBody.

        Interest classification. You can use /tool/target_recommend_tags/ to get a list of recommended interest categories based on your targeting regions and your industries, or use /tool/interest_category/ endpoint to get the complete list of interest categories. If the interest is specified, users who do not meet the interest target will be excluded during delivery. Do not specify if you wish to target everyone.  # noqa: E501

        :param interest_category_ids: The interest_category_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._interest_category_ids = interest_category_ids

    @property
    def interest_keyword_ids(self):
        """Gets the interest_keyword_ids of this SavedAudienceCreateBody.  # noqa: E501

        IDs of interest keywords that you want to use to target audience. You can use /tool/interest_keyword/recommend/ to get recommended interest keywords.  # noqa: E501

        :return: The interest_keyword_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._interest_keyword_ids

    @interest_keyword_ids.setter
    def interest_keyword_ids(self, interest_keyword_ids):
        """Sets the interest_keyword_ids of this SavedAudienceCreateBody.

        IDs of interest keywords that you want to use to target audience. You can use /tool/interest_keyword/recommend/ to get recommended interest keywords.  # noqa: E501

        :param interest_keyword_ids: The interest_keyword_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._interest_keyword_ids = interest_keyword_ids

    @property
    def languages(self):
        """Gets the languages of this SavedAudienceCreateBody.  # noqa: E501

        Codes of the languages that you want to target. You can get language codes via /tool/language/, and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.  # noqa: E501

        :return: The languages of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._languages

    @languages.setter
    def languages(self, languages):
        """Sets the languages of this SavedAudienceCreateBody.

        Codes of the languages that you want to target. You can get language codes via /tool/language/, and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.  # noqa: E501

        :param languages: The languages of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._languages = languages

    @property
    def location_ids(self):
        """Gets the location_ids of this SavedAudienceCreateBody.  # noqa: E501

        IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting.  # noqa: E501

        :return: The location_ids of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._location_ids

    @location_ids.setter
    def location_ids(self, location_ids):
        """Sets the location_ids of this SavedAudienceCreateBody.

        IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting.  # noqa: E501

        :param location_ids: The location_ids of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """
        if location_ids is None:
            raise ValueError("Invalid value for `location_ids`, must not be `None`")  # noqa: E501

        self._location_ids = location_ids

    @property
    def min_android_version(self):
        """Gets the min_android_version of this SavedAudienceCreateBody.  # noqa: E501

        Minimum device Android version. For enum values, see Enumeration - Minimum Android Version.  # noqa: E501

        :return: The min_android_version of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._min_android_version

    @min_android_version.setter
    def min_android_version(self, min_android_version):
        """Sets the min_android_version of this SavedAudienceCreateBody.

        Minimum device Android version. For enum values, see Enumeration - Minimum Android Version.  # noqa: E501

        :param min_android_version: The min_android_version of this SavedAudienceCreateBody.  # noqa: E501
        :type: str
        """

        self._min_android_version = min_android_version

    @property
    def min_ios_version(self):
        """Gets the min_ios_version of this SavedAudienceCreateBody.  # noqa: E501

        Minimum iOS version. For enum values, see Enumeration - Minimum iOS Version.  # noqa: E501

        :return: The min_ios_version of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._min_ios_version

    @min_ios_version.setter
    def min_ios_version(self, min_ios_version):
        """Sets the min_ios_version of this SavedAudienceCreateBody.

        Minimum iOS version. For enum values, see Enumeration - Minimum iOS Version.  # noqa: E501

        :param min_ios_version: The min_ios_version of this SavedAudienceCreateBody.  # noqa: E501
        :type: str
        """

        self._min_ios_version = min_ios_version

    @property
    def network_types(self):
        """Gets the network_types of this SavedAudienceCreateBody.  # noqa: E501

        Device connection types that you want to target. Default: unlimited. For enum values, see Enumeration - Connection Type.  # noqa: E501

        :return: The network_types of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._network_types

    @network_types.setter
    def network_types(self, network_types):
        """Sets the network_types of this SavedAudienceCreateBody.

        Device connection types that you want to target. Default: unlimited. For enum values, see Enumeration - Connection Type.  # noqa: E501

        :param network_types: The network_types of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._network_types = network_types

    @property
    def operating_systems(self):
        """Gets the operating_systems of this SavedAudienceCreateBody.  # noqa: E501

        Device operating systems that you want to target. Enum values: ANDROID, IOS. Only one value is allowed.  # noqa: E501

        :return: The operating_systems of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._operating_systems

    @operating_systems.setter
    def operating_systems(self, operating_systems):
        """Sets the operating_systems of this SavedAudienceCreateBody.

        Device operating systems that you want to target. Enum values: ANDROID, IOS. Only one value is allowed.  # noqa: E501

        :param operating_systems: The operating_systems of this SavedAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._operating_systems = operating_systems

    @property
    def saved_audience_name(self):
        """Gets the saved_audience_name of this SavedAudienceCreateBody.  # noqa: E501

        Saved Audience name. Character limit is 512 and cannot contain emoji.  # noqa: E501

        :return: The saved_audience_name of this SavedAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._saved_audience_name

    @saved_audience_name.setter
    def saved_audience_name(self, saved_audience_name):
        """Sets the saved_audience_name of this SavedAudienceCreateBody.

        Saved Audience name. Character limit is 512 and cannot contain emoji.  # noqa: E501

        :param saved_audience_name: The saved_audience_name of this SavedAudienceCreateBody.  # noqa: E501
        :type: str
        """
        if saved_audience_name is None:
            raise ValueError("Invalid value for `saved_audience_name`, must not be `None`")  # noqa: E501

        self._saved_audience_name = saved_audience_name

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
        if issubclass(SavedAudienceCreateBody, dict):
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
        if not isinstance(other, SavedAudienceCreateBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
