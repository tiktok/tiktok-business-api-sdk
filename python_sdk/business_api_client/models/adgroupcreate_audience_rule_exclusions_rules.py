# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class AdgroupcreateAudienceRuleExclusionsRules(object):
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
        'event_sources': 'list[AdgroupcreateAudienceRuleExclusionsEventSources]',
        'filter': 'AdgroupcreateAudienceRuleExclusionsFilter',
        'retention': 'str'
    }

    attribute_map = {
        'event_sources': 'event_sources',
        'filter': 'filter',
        'retention': 'retention'
    }

    def __init__(self, event_sources=None, filter=None, retention=None):  # noqa: E501
        """AdgroupcreateAudienceRuleExclusionsRules - a model defined in Swagger"""  # noqa: E501
        self._event_sources = None
        self._filter = None
        self._retention = None
        self.discriminator = None
        if event_sources is not None:
            self.event_sources = event_sources
        if filter is not None:
            self.filter = filter
        if retention is not None:
            self.retention = retention

    @property
    def event_sources(self):
        """Gets the event_sources of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501


        :return: The event_sources of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501
        :rtype: list[AdgroupcreateAudienceRuleExclusionsEventSources]
        """
        return self._event_sources

    @event_sources.setter
    def event_sources(self, event_sources):
        """Sets the event_sources of this AdgroupcreateAudienceRuleExclusionsRules.


        :param event_sources: The event_sources of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501
        :type: list[AdgroupcreateAudienceRuleExclusionsEventSources]
        """

        self._event_sources = event_sources

    @property
    def filter(self):
        """Gets the filter of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501


        :return: The filter of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501
        :rtype: AdgroupcreateAudienceRuleExclusionsFilter
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """Sets the filter of this AdgroupcreateAudienceRuleExclusionsRules.


        :param filter: The filter of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501
        :type: AdgroupcreateAudienceRuleExclusionsFilter
        """

        self._filter = filter

    @property
    def retention(self):
        """Gets the retention of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501


        :return: The retention of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501
        :rtype: str
        """
        return self._retention

    @retention.setter
    def retention(self, retention):
        """Sets the retention of this AdgroupcreateAudienceRuleExclusionsRules.


        :param retention: The retention of this AdgroupcreateAudienceRuleExclusionsRules.  # noqa: E501
        :type: str
        """

        self._retention = retention

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
        if issubclass(AdgroupcreateAudienceRuleExclusionsRules, dict):
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
        if not isinstance(other, AdgroupcreateAudienceRuleExclusionsRules):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
