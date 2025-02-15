# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class FilteringBcAssetGroupGet(object):
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
        'keyword': 'str'
    }

    attribute_map = {
        'keyword': 'keyword'
    }

    def __init__(self, keyword=None):  # noqa: E501
        """FilteringBcAssetGroupGet - a model defined in Swagger"""  # noqa: E501
        self._keyword = None
        self.discriminator = None
        self.keyword = keyword

    @property
    def keyword(self):
        """Gets the keyword of this FilteringBcAssetGroupGet.  # noqa: E501

        Keyword filter for retrieving asset group details.  # noqa: E501

        :return: The keyword of this FilteringBcAssetGroupGet.  # noqa: E501
        :rtype: str
        """
        return self._keyword

    @keyword.setter
    def keyword(self, keyword):
        """Sets the keyword of this FilteringBcAssetGroupGet.

        Keyword filter for retrieving asset group details.  # noqa: E501

        :param keyword: The keyword of this FilteringBcAssetGroupGet.  # noqa: E501
        :type: str
        """
        if keyword is None:
            raise ValueError("Invalid value for `keyword`, must not be `None`")  # noqa: E501

        self._keyword = keyword

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
        if issubclass(FilteringBcAssetGroupGet, dict):
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
        if not isinstance(other, FilteringBcAssetGroupGet):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
