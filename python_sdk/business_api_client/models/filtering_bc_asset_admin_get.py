# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class FilteringBcAssetAdminGet(object):
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
        'advertiser_show_status': 'str',
        'keyword': 'str',
        'relation_status': 'str',
        'relation_type': 'str'
    }

    attribute_map = {
        'advertiser_show_status': 'advertiser_show_status',
        'keyword': 'keyword',
        'relation_status': 'relation_status',
        'relation_type': 'relation_type'
    }

    def __init__(self, advertiser_show_status=None, keyword=None, relation_status=None, relation_type=None):  # noqa: E501
        """FilteringBcAssetAdminGet - a model defined in Swagger"""  # noqa: E501
        self._advertiser_show_status = None
        self._keyword = None
        self._relation_status = None
        self._relation_type = None
        self.discriminator = None
        if advertiser_show_status is not None:
            self.advertiser_show_status = advertiser_show_status
        if keyword is not None:
            self.keyword = keyword
        if relation_status is not None:
            self.relation_status = relation_status
        if relation_type is not None:
            self.relation_type = relation_type

    @property
    def advertiser_show_status(self):
        """Gets the advertiser_show_status of this FilteringBcAssetAdminGet.  # noqa: E501

        Advertiser account show status.  # noqa: E501

        :return: The advertiser_show_status of this FilteringBcAssetAdminGet.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_show_status

    @advertiser_show_status.setter
    def advertiser_show_status(self, advertiser_show_status):
        """Sets the advertiser_show_status of this FilteringBcAssetAdminGet.

        Advertiser account show status.  # noqa: E501

        :param advertiser_show_status: The advertiser_show_status of this FilteringBcAssetAdminGet.  # noqa: E501
        :type: str
        """

        self._advertiser_show_status = advertiser_show_status

    @property
    def keyword(self):
        """Gets the keyword of this FilteringBcAssetAdminGet.  # noqa: E501

        Keyword filter for asset search.  # noqa: E501

        :return: The keyword of this FilteringBcAssetAdminGet.  # noqa: E501
        :rtype: str
        """
        return self._keyword

    @keyword.setter
    def keyword(self, keyword):
        """Sets the keyword of this FilteringBcAssetAdminGet.

        Keyword filter for asset search.  # noqa: E501

        :param keyword: The keyword of this FilteringBcAssetAdminGet.  # noqa: E501
        :type: str
        """

        self._keyword = keyword

    @property
    def relation_status(self):
        """Gets the relation_status of this FilteringBcAssetAdminGet.  # noqa: E501

        Relation status of the asset.  # noqa: E501

        :return: The relation_status of this FilteringBcAssetAdminGet.  # noqa: E501
        :rtype: str
        """
        return self._relation_status

    @relation_status.setter
    def relation_status(self, relation_status):
        """Sets the relation_status of this FilteringBcAssetAdminGet.

        Relation status of the asset.  # noqa: E501

        :param relation_status: The relation_status of this FilteringBcAssetAdminGet.  # noqa: E501
        :type: str
        """

        self._relation_status = relation_status

    @property
    def relation_type(self):
        """Gets the relation_type of this FilteringBcAssetAdminGet.  # noqa: E501

        Relation type of the asset.  # noqa: E501

        :return: The relation_type of this FilteringBcAssetAdminGet.  # noqa: E501
        :rtype: str
        """
        return self._relation_type

    @relation_type.setter
    def relation_type(self, relation_type):
        """Sets the relation_type of this FilteringBcAssetAdminGet.

        Relation type of the asset.  # noqa: E501

        :param relation_type: The relation_type of this FilteringBcAssetAdminGet.  # noqa: E501
        :type: str
        """

        self._relation_type = relation_type

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
        if issubclass(FilteringBcAssetAdminGet, dict):
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
        if not isinstance(other, FilteringBcAssetAdminGet):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
