# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class BcassetGroupcreateAssets(object):
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
        'asset_id': 'str',
        'asset_type': 'str'
    }

    attribute_map = {
        'asset_id': 'asset_id',
        'asset_type': 'asset_type'
    }

    def __init__(self, asset_id=None, asset_type='ADVERTISER'):  # noqa: E501
        """BcassetGroupcreateAssets - a model defined in Swagger"""  # noqa: E501
        self._asset_id = None
        self._asset_type = None
        self.discriminator = None
        self.asset_id = asset_id
        if asset_type is not None:
            self.asset_type = asset_type

    @property
    def asset_id(self):
        """Gets the asset_id of this BcassetGroupcreateAssets.  # noqa: E501


        :return: The asset_id of this BcassetGroupcreateAssets.  # noqa: E501
        :rtype: str
        """
        return self._asset_id

    @asset_id.setter
    def asset_id(self, asset_id):
        """Sets the asset_id of this BcassetGroupcreateAssets.


        :param asset_id: The asset_id of this BcassetGroupcreateAssets.  # noqa: E501
        :type: str
        """
        if asset_id is None:
            raise ValueError("Invalid value for `asset_id`, must not be `None`")  # noqa: E501

        self._asset_id = asset_id

    @property
    def asset_type(self):
        """Gets the asset_type of this BcassetGroupcreateAssets.  # noqa: E501


        :return: The asset_type of this BcassetGroupcreateAssets.  # noqa: E501
        :rtype: str
        """
        return self._asset_type

    @asset_type.setter
    def asset_type(self, asset_type):
        """Sets the asset_type of this BcassetGroupcreateAssets.


        :param asset_type: The asset_type of this BcassetGroupcreateAssets.  # noqa: E501
        :type: str
        """

        self._asset_type = asset_type

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
        if issubclass(BcassetGroupcreateAssets, dict):
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
        if not isinstance(other, BcassetGroupcreateAssets):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
