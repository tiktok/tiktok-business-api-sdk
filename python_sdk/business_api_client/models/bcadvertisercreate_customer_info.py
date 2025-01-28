# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class BcadvertisercreateCustomerInfo(object):
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
        'company': 'str',
        'industry': 'int',
        'registered_area': 'str'
    }

    attribute_map = {
        'company': 'company',
        'industry': 'industry',
        'registered_area': 'registered_area'
    }

    def __init__(self, company=None, industry=None, registered_area=None):  # noqa: E501
        """BcadvertisercreateCustomerInfo - a model defined in Swagger"""  # noqa: E501
        self._company = None
        self._industry = None
        self._registered_area = None
        self.discriminator = None
        if company is not None:
            self.company = company
        if industry is not None:
            self.industry = industry
        if registered_area is not None:
            self.registered_area = registered_area

    @property
    def company(self):
        """Gets the company of this BcadvertisercreateCustomerInfo.  # noqa: E501

        Ad Account company name. Length cannot exceed 255 characters  # noqa: E501

        :return: The company of this BcadvertisercreateCustomerInfo.  # noqa: E501
        :rtype: str
        """
        return self._company

    @company.setter
    def company(self, company):
        """Sets the company of this BcadvertisercreateCustomerInfo.

        Ad Account company name. Length cannot exceed 255 characters  # noqa: E501

        :param company: The company of this BcadvertisercreateCustomerInfo.  # noqa: E501
        :type: str
        """

        self._company = company

    @property
    def industry(self):
        """Gets the industry of this BcadvertisercreateCustomerInfo.  # noqa: E501

        Ad Account industry ID. The value range is shown in [Appendix-Industries](https://ads.tiktok.com/marketing_api/docs?id=1739357589575681)  # noqa: E501

        :return: The industry of this BcadvertisercreateCustomerInfo.  # noqa: E501
        :rtype: int
        """
        return self._industry

    @industry.setter
    def industry(self, industry):
        """Sets the industry of this BcadvertisercreateCustomerInfo.

        Ad Account industry ID. The value range is shown in [Appendix-Industries](https://ads.tiktok.com/marketing_api/docs?id=1739357589575681)  # noqa: E501

        :param industry: The industry of this BcadvertisercreateCustomerInfo.  # noqa: E501
        :type: int
        """

        self._industry = industry

    @property
    def registered_area(self):
        """Gets the registered_area of this BcadvertisercreateCustomerInfo.  # noqa: E501

        Ad Account registration code. The value range is shown in [Appendix-Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)  # noqa: E501

        :return: The registered_area of this BcadvertisercreateCustomerInfo.  # noqa: E501
        :rtype: str
        """
        return self._registered_area

    @registered_area.setter
    def registered_area(self, registered_area):
        """Sets the registered_area of this BcadvertisercreateCustomerInfo.

        Ad Account registration code. The value range is shown in [Appendix-Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)  # noqa: E501

        :param registered_area: The registered_area of this BcadvertisercreateCustomerInfo.  # noqa: E501
        :type: str
        """

        self._registered_area = registered_area

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
        if issubclass(BcadvertisercreateCustomerInfo, dict):
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
        if not isinstance(other, BcadvertisercreateCustomerInfo):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
