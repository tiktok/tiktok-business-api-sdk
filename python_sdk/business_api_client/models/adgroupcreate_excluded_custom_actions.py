# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class AdgroupcreateExcludedCustomActions(object):
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
        'code': 'str',
        'days': 'int'
    }

    attribute_map = {
        'code': 'code',
        'days': 'days'
    }

    def __init__(self, code=None, days=None):  # noqa: E501
        """AdgroupcreateExcludedCustomActions - a model defined in Swagger"""  # noqa: E501
        self._code = None
        self._days = None
        self.discriminator = None
        if code is not None:
            self.code = code
        if days is not None:
            self.days = days

    @property
    def code(self):
        """Gets the code of this AdgroupcreateExcludedCustomActions.  # noqa: E501

        The custom action used to filter out the audiences to be retargeted.  Enum values- `VIEW_PRODUCT`- The audience viewed the product. `ADD_TO_CART`- The audience added the product to the cart. `PURCHASE`- The audience purchased the product.  # noqa: E501

        :return: The code of this AdgroupcreateExcludedCustomActions.  # noqa: E501
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this AdgroupcreateExcludedCustomActions.

        The custom action used to filter out the audiences to be retargeted.  Enum values- `VIEW_PRODUCT`- The audience viewed the product. `ADD_TO_CART`- The audience added the product to the cart. `PURCHASE`- The audience purchased the product.  # noqa: E501

        :param code: The code of this AdgroupcreateExcludedCustomActions.  # noqa: E501
        :type: str
        """

        self._code = code

    @property
    def days(self):
        """Gets the days of this AdgroupcreateExcludedCustomActions.  # noqa: E501

        The time range used to filter out the audiences that completed the specified action.  # noqa: E501

        :return: The days of this AdgroupcreateExcludedCustomActions.  # noqa: E501
        :rtype: int
        """
        return self._days

    @days.setter
    def days(self, days):
        """Sets the days of this AdgroupcreateExcludedCustomActions.

        The time range used to filter out the audiences that completed the specified action.  # noqa: E501

        :param days: The days of this AdgroupcreateExcludedCustomActions.  # noqa: E501
        :type: int
        """

        self._days = days

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
        if issubclass(AdgroupcreateExcludedCustomActions, dict):
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
        if not isinstance(other, AdgroupcreateExcludedCustomActions):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
