# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class BcassetGroupcreateMembers(object):
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
        'asset_roles': 'dict(str, str)',
        'member_id': 'str'
    }

    attribute_map = {
        'asset_roles': 'asset_roles',
        'member_id': 'member_id'
    }

    def __init__(self, asset_roles=None, member_id=None):  # noqa: E501
        """BcassetGroupcreateMembers - a model defined in Swagger"""  # noqa: E501
        self._asset_roles = None
        self._member_id = None
        self.discriminator = None
        if asset_roles is not None:
            self.asset_roles = asset_roles
        self.member_id = member_id

    @property
    def asset_roles(self):
        """Gets the asset_roles of this BcassetGroupcreateMembers.  # noqa: E501


        :return: The asset_roles of this BcassetGroupcreateMembers.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._asset_roles

    @asset_roles.setter
    def asset_roles(self, asset_roles):
        """Sets the asset_roles of this BcassetGroupcreateMembers.


        :param asset_roles: The asset_roles of this BcassetGroupcreateMembers.  # noqa: E501
        :type: dict(str, str)
        """

        self._asset_roles = asset_roles

    @property
    def member_id(self):
        """Gets the member_id of this BcassetGroupcreateMembers.  # noqa: E501


        :return: The member_id of this BcassetGroupcreateMembers.  # noqa: E501
        :rtype: str
        """
        return self._member_id

    @member_id.setter
    def member_id(self, member_id):
        """Sets the member_id of this BcassetGroupcreateMembers.


        :param member_id: The member_id of this BcassetGroupcreateMembers.  # noqa: E501
        :type: str
        """
        if member_id is None:
            raise ValueError("Invalid value for `member_id`, must not be `None`")  # noqa: E501

        self._member_id = member_id

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
        if issubclass(BcassetGroupcreateMembers, dict):
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
        if not isinstance(other, BcassetGroupcreateMembers):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
