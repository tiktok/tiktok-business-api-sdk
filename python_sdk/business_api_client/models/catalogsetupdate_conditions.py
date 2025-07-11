# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class CatalogsetupdateConditions(object):
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
        '_and': 'list[object]',
        '_or': 'list[object]'
    }

    attribute_map = {
        '_and': 'and',
        '_or': 'or'
    }

    def __init__(self, _and=None, _or=None):  # noqa: E501
        """CatalogsetupdateConditions - a model defined in Swagger"""  # noqa: E501
        self.__and = None
        self.__or = None
        self.discriminator = None
        if _and is not None:
            self._and = _and
        if _or is not None:
            self._or = _or

    @property
    def _and(self):
        """Gets the _and of this CatalogsetupdateConditions.  # noqa: E501


        :return: The _and of this CatalogsetupdateConditions.  # noqa: E501
        :rtype: list[object]
        """
        return self.__and

    @_and.setter
    def _and(self, _and):
        """Sets the _and of this CatalogsetupdateConditions.


        :param _and: The _and of this CatalogsetupdateConditions.  # noqa: E501
        :type: list[object]
        """

        self.__and = _and

    @property
    def _or(self):
        """Gets the _or of this CatalogsetupdateConditions.  # noqa: E501


        :return: The _or of this CatalogsetupdateConditions.  # noqa: E501
        :rtype: list[object]
        """
        return self.__or

    @_or.setter
    def _or(self, _or):
        """Sets the _or of this CatalogsetupdateConditions.


        :param _or: The _or of this CatalogsetupdateConditions.  # noqa: E501
        :type: list[object]
        """

        self.__or = _or

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
        if issubclass(CatalogsetupdateConditions, dict):
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
        if not isinstance(other, CatalogsetupdateConditions):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
