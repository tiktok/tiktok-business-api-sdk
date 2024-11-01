# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class CustomAudienceCreateBody(object):
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
        'audience_enhancement': 'bool',
        'audience_sub_type': 'str',
        'calculate_type': 'str',
        'custom_audience_name': 'str',
        'file_paths': 'list[str]',
        'retention_in_days': 'int'
    }

    attribute_map = {
        'advertiser_id': 'advertiser_id',
        'audience_enhancement': 'audience_enhancement',
        'audience_sub_type': 'audience_sub_type',
        'calculate_type': 'calculate_type',
        'custom_audience_name': 'custom_audience_name',
        'file_paths': 'file_paths',
        'retention_in_days': 'retention_in_days'
    }

    def __init__(self, advertiser_id=None, audience_enhancement=False, audience_sub_type='NORMAL', calculate_type=None, custom_audience_name=None, file_paths=None, retention_in_days=None):  # noqa: E501
        """CustomAudienceCreateBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_id = None
        self._audience_enhancement = None
        self._audience_sub_type = None
        self._calculate_type = None
        self._custom_audience_name = None
        self._file_paths = None
        self._retention_in_days = None
        self.discriminator = None
        self.advertiser_id = advertiser_id
        if audience_enhancement is not None:
            self.audience_enhancement = audience_enhancement
        if audience_sub_type is not None:
            self.audience_sub_type = audience_sub_type
        self.calculate_type = calculate_type
        self.custom_audience_name = custom_audience_name
        self.file_paths = file_paths
        if retention_in_days is not None:
            self.retention_in_days = retention_in_days

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this CustomAudienceCreateBody.  # noqa: E501

        Advertiser ID.  # noqa: E501

        :return: The advertiser_id of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this CustomAudienceCreateBody.

        Advertiser ID.  # noqa: E501

        :param advertiser_id: The advertiser_id of this CustomAudienceCreateBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def audience_enhancement(self):
        """Gets the audience_enhancement of this CustomAudienceCreateBody.  # noqa: E501


        :return: The audience_enhancement of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: bool
        """
        return self._audience_enhancement

    @audience_enhancement.setter
    def audience_enhancement(self, audience_enhancement):
        """Sets the audience_enhancement of this CustomAudienceCreateBody.


        :param audience_enhancement: The audience_enhancement of this CustomAudienceCreateBody.  # noqa: E501
        :type: bool
        """

        self._audience_enhancement = audience_enhancement

    @property
    def audience_sub_type(self):
        """Gets the audience_sub_type of this CustomAudienceCreateBody.  # noqa: E501

        Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL Normal audience. It can be used in non-R&F ads. REACH_FREQUENCY: Audience for Reach & Frequency. It can only be used in R&F ads. Default: NORMAL.  # noqa: E501

        :return: The audience_sub_type of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._audience_sub_type

    @audience_sub_type.setter
    def audience_sub_type(self, audience_sub_type):
        """Sets the audience_sub_type of this CustomAudienceCreateBody.

        Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL Normal audience. It can be used in non-R&F ads. REACH_FREQUENCY: Audience for Reach & Frequency. It can only be used in R&F ads. Default: NORMAL.  # noqa: E501

        :param audience_sub_type: The audience_sub_type of this CustomAudienceCreateBody.  # noqa: E501
        :type: str
        """

        self._audience_sub_type = audience_sub_type

    @property
    def calculate_type(self):
        """Gets the calculate_type of this CustomAudienceCreateBody.  # noqa: E501

        Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type.  # noqa: E501

        :return: The calculate_type of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._calculate_type

    @calculate_type.setter
    def calculate_type(self, calculate_type):
        """Sets the calculate_type of this CustomAudienceCreateBody.

        Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type.  # noqa: E501

        :param calculate_type: The calculate_type of this CustomAudienceCreateBody.  # noqa: E501
        :type: str
        """
        if calculate_type is None:
            raise ValueError("Invalid value for `calculate_type`, must not be `None`")  # noqa: E501

        self._calculate_type = calculate_type

    @property
    def custom_audience_name(self):
        """Gets the custom_audience_name of this CustomAudienceCreateBody.  # noqa: E501

        Audience name. Maximum of 128 characters.  # noqa: E501

        :return: The custom_audience_name of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._custom_audience_name

    @custom_audience_name.setter
    def custom_audience_name(self, custom_audience_name):
        """Sets the custom_audience_name of this CustomAudienceCreateBody.

        Audience name. Maximum of 128 characters.  # noqa: E501

        :param custom_audience_name: The custom_audience_name of this CustomAudienceCreateBody.  # noqa: E501
        :type: str
        """
        if custom_audience_name is None:
            raise ValueError("Invalid value for `custom_audience_name`, must not be `None`")  # noqa: E501

        self._custom_audience_name = custom_audience_name

    @property
    def file_paths(self):
        """Gets the file_paths of this CustomAudienceCreateBody.  # noqa: E501

        List of file paths. The recommended size is <50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint.  # noqa: E501

        :return: The file_paths of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._file_paths

    @file_paths.setter
    def file_paths(self, file_paths):
        """Sets the file_paths of this CustomAudienceCreateBody.

        List of file paths. The recommended size is <50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint.  # noqa: E501

        :param file_paths: The file_paths of this CustomAudienceCreateBody.  # noqa: E501
        :type: list[str]
        """
        if file_paths is None:
            raise ValueError("Invalid value for `file_paths`, must not be `None`")  # noqa: E501

        self._file_paths = file_paths

    @property
    def retention_in_days(self):
        """Gets the retention_in_days of this CustomAudienceCreateBody.  # noqa: E501

        Number of days to retain the audience. Value range: [1, 365]. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.  # noqa: E501

        :return: The retention_in_days of this CustomAudienceCreateBody.  # noqa: E501
        :rtype: int
        """
        return self._retention_in_days

    @retention_in_days.setter
    def retention_in_days(self, retention_in_days):
        """Sets the retention_in_days of this CustomAudienceCreateBody.

        Number of days to retain the audience. Value range: [1, 365]. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.  # noqa: E501

        :param retention_in_days: The retention_in_days of this CustomAudienceCreateBody.  # noqa: E501
        :type: int
        """

        self._retention_in_days = retention_in_days

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
        if issubclass(CustomAudienceCreateBody, dict):
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
        if not isinstance(other, CustomAudienceCreateBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
