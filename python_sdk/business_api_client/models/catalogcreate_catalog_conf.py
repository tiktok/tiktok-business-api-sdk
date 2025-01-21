# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class catalogcreateCatalogConf(object):
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
        'business_platform': 'str',
        'channel': 'str',
        'currency': 'str',
        'region_code': 'str'
    }

    attribute_map = {
        'business_platform': 'business_platform',
        'channel': 'channel',
        'currency': 'currency',
        'region_code': 'region_code'
    }

    def __init__(self, business_platform=None, channel=None, currency=None, region_code=None):  # noqa: E501
        """catalogcreateCatalogConf - a model defined in Swagger"""  # noqa: E501
        self._business_platform = None
        self._channel = None
        self._currency = None
        self._region_code = None
        self.discriminator = None
        if business_platform is not None:
            self.business_platform = business_platform
        if channel is not None:
            self.channel = channel
        self.currency = currency
        self.region_code = region_code

    @property
    def business_platform(self):
        """Gets the business_platform of this catalogcreateCatalogConf.  # noqa: E501


        :return: The business_platform of this catalogcreateCatalogConf.  # noqa: E501
        :rtype: str
        """
        return self._business_platform

    @business_platform.setter
    def business_platform(self, business_platform):
        """Sets the business_platform of this catalogcreateCatalogConf.


        :param business_platform: The business_platform of this catalogcreateCatalogConf.  # noqa: E501
        :type: str
        """

        self._business_platform = business_platform

    @property
    def channel(self):
        """Gets the channel of this catalogcreateCatalogConf.  # noqa: E501


        :return: The channel of this catalogcreateCatalogConf.  # noqa: E501
        :rtype: str
        """
        return self._channel

    @channel.setter
    def channel(self, channel):
        """Sets the channel of this catalogcreateCatalogConf.


        :param channel: The channel of this catalogcreateCatalogConf.  # noqa: E501
        :type: str
        """

        self._channel = channel

    @property
    def currency(self):
        """Gets the currency of this catalogcreateCatalogConf.  # noqa: E501


        :return: The currency of this catalogcreateCatalogConf.  # noqa: E501
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this catalogcreateCatalogConf.


        :param currency: The currency of this catalogcreateCatalogConf.  # noqa: E501
        :type: str
        """
        if currency is None:
            raise ValueError("Invalid value for `currency`, must not be `None`")  # noqa: E501

        self._currency = currency

    @property
    def region_code(self):
        """Gets the region_code of this catalogcreateCatalogConf.  # noqa: E501


        :return: The region_code of this catalogcreateCatalogConf.  # noqa: E501
        :rtype: str
        """
        return self._region_code

    @region_code.setter
    def region_code(self, region_code):
        """Sets the region_code of this catalogcreateCatalogConf.


        :param region_code: The region_code of this catalogcreateCatalogConf.  # noqa: E501
        :type: str
        """
        if region_code is None:
            raise ValueError("Invalid value for `region_code`, must not be `None`")  # noqa: E501

        self._region_code = region_code

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
        if issubclass(catalogcreateCatalogConf, dict):
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
        if not isinstance(other, catalogcreateCatalogConf):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
