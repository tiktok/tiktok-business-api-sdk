# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class FeedDeleteBody(object):
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
        'bc_id': 'str',
        'catalog_id': 'str',
        'feed_id': 'str'
    }

    attribute_map = {
        'bc_id': 'bc_id',
        'catalog_id': 'catalog_id',
        'feed_id': 'feed_id'
    }

    def __init__(self, bc_id=None, catalog_id=None, feed_id=None):  # noqa: E501
        """FeedDeleteBody - a model defined in Swagger"""  # noqa: E501
        self._bc_id = None
        self._catalog_id = None
        self._feed_id = None
        self.discriminator = None
        self.bc_id = bc_id
        self.catalog_id = catalog_id
        self.feed_id = feed_id

    @property
    def bc_id(self):
        """Gets the bc_id of this FeedDeleteBody.  # noqa: E501


        :return: The bc_id of this FeedDeleteBody.  # noqa: E501
        :rtype: str
        """
        return self._bc_id

    @bc_id.setter
    def bc_id(self, bc_id):
        """Sets the bc_id of this FeedDeleteBody.


        :param bc_id: The bc_id of this FeedDeleteBody.  # noqa: E501
        :type: str
        """
        if bc_id is None:
            raise ValueError("Invalid value for `bc_id`, must not be `None`")  # noqa: E501

        self._bc_id = bc_id

    @property
    def catalog_id(self):
        """Gets the catalog_id of this FeedDeleteBody.  # noqa: E501


        :return: The catalog_id of this FeedDeleteBody.  # noqa: E501
        :rtype: str
        """
        return self._catalog_id

    @catalog_id.setter
    def catalog_id(self, catalog_id):
        """Sets the catalog_id of this FeedDeleteBody.


        :param catalog_id: The catalog_id of this FeedDeleteBody.  # noqa: E501
        :type: str
        """
        if catalog_id is None:
            raise ValueError("Invalid value for `catalog_id`, must not be `None`")  # noqa: E501

        self._catalog_id = catalog_id

    @property
    def feed_id(self):
        """Gets the feed_id of this FeedDeleteBody.  # noqa: E501


        :return: The feed_id of this FeedDeleteBody.  # noqa: E501
        :rtype: str
        """
        return self._feed_id

    @feed_id.setter
    def feed_id(self, feed_id):
        """Sets the feed_id of this FeedDeleteBody.


        :param feed_id: The feed_id of this FeedDeleteBody.  # noqa: E501
        :type: str
        """
        if feed_id is None:
            raise ValueError("Invalid value for `feed_id`, must not be `None`")  # noqa: E501

        self._feed_id = feed_id

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
        if issubclass(FeedDeleteBody, dict):
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
        if not isinstance(other, FeedDeleteBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
