# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec(object):
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
        'audience_size': 'str',
        'include_source': 'bool',
        'location_ids': 'list[str]',
        'mobile_os': 'str',
        'placements': 'list[str]',
        'source_audience_id': 'str'
    }

    attribute_map = {
        'audience_size': 'audience_size',
        'include_source': 'include_source',
        'location_ids': 'location_ids',
        'mobile_os': 'mobile_os',
        'placements': 'placements',
        'source_audience_id': 'source_audience_id'
    }

    def __init__(self, audience_size=None, include_source=None, location_ids=None, mobile_os=None, placements=None, source_audience_id=None):  # noqa: E501
        """OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec - a model defined in Swagger"""  # noqa: E501
        self._audience_size = None
        self._include_source = None
        self._location_ids = None
        self._mobile_os = None
        self._placements = None
        self._source_audience_id = None
        self.discriminator = None
        if audience_size is not None:
            self.audience_size = audience_size
        if include_source is not None:
            self.include_source = include_source
        if location_ids is not None:
            self.location_ids = location_ids
        if mobile_os is not None:
            self.mobile_os = mobile_os
        if placements is not None:
            self.placements = placements
        if source_audience_id is not None:
            self.source_audience_id = source_audience_id

    @property
    def audience_size(self):
        """Gets the audience_size of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501

        Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD.  # noqa: E501

        :return: The audience_size of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :rtype: str
        """
        return self._audience_size

    @audience_size.setter
    def audience_size(self, audience_size):
        """Sets the audience_size of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.

        Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD.  # noqa: E501

        :param audience_size: The audience_size of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :type: str
        """

        self._audience_size = audience_size

    @property
    def include_source(self):
        """Gets the include_source of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501

        Whether to include the source audience in the new lookalike audience.  # noqa: E501

        :return: The include_source of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :rtype: bool
        """
        return self._include_source

    @include_source.setter
    def include_source(self, include_source):
        """Sets the include_source of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.

        Whether to include the source audience in the new lookalike audience.  # noqa: E501

        :param include_source: The include_source of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :type: bool
        """

        self._include_source = include_source

    @property
    def location_ids(self):
        """Gets the location_ids of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501

        IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations.  # noqa: E501

        :return: The location_ids of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :rtype: list[str]
        """
        return self._location_ids

    @location_ids.setter
    def location_ids(self, location_ids):
        """Sets the location_ids of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.

        IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations.  # noqa: E501

        :param location_ids: The location_ids of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :type: list[str]
        """

        self._location_ids = location_ids

    @property
    def mobile_os(self):
        """Gets the mobile_os of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501

        Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details.  # noqa: E501

        :return: The mobile_os of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :rtype: str
        """
        return self._mobile_os

    @mobile_os.setter
    def mobile_os(self, mobile_os):
        """Sets the mobile_os of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.

        Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details.  # noqa: E501

        :param mobile_os: The mobile_os of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :type: str
        """

        self._mobile_os = mobile_os

    @property
    def placements(self):
        """Gets the placements of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501

        The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz & BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details.  # noqa: E501

        :return: The placements of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :rtype: list[str]
        """
        return self._placements

    @placements.setter
    def placements(self, placements):
        """Sets the placements of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.

        The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz & BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details.  # noqa: E501

        :param placements: The placements of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :type: list[str]
        """

        self._placements = placements

    @property
    def source_audience_id(self):
        """Gets the source_audience_id of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501

        Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100.  # noqa: E501

        :return: The source_audience_id of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :rtype: str
        """
        return self._source_audience_id

    @source_audience_id.setter
    def source_audience_id(self, source_audience_id):
        """Sets the source_audience_id of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.

        Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100.  # noqa: E501

        :param source_audience_id: The source_audience_id of this OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.  # noqa: E501
        :type: str
        """

        self._source_audience_id = source_audience_id

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
        if issubclass(OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec, dict):
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
        if not isinstance(other, OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
