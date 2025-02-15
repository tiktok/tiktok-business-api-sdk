# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class BillingGroupCreateBody(object):
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
        'advertiser_ids': 'list[str]',
        'bc_id': 'str',
        'billing_group_emails': 'list[str]',
        'billing_group_name': 'str',
        'billing_group_type': 'str',
        'is_primary': 'bool'
    }

    attribute_map = {
        'advertiser_ids': 'advertiser_ids',
        'bc_id': 'bc_id',
        'billing_group_emails': 'billing_group_emails',
        'billing_group_name': 'billing_group_name',
        'billing_group_type': 'billing_group_type',
        'is_primary': 'is_primary'
    }

    def __init__(self, advertiser_ids=None, bc_id=None, billing_group_emails=None, billing_group_name=None, billing_group_type='AUCTION', is_primary=False):  # noqa: E501
        """BillingGroupCreateBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_ids = None
        self._bc_id = None
        self._billing_group_emails = None
        self._billing_group_name = None
        self._billing_group_type = None
        self._is_primary = None
        self.discriminator = None
        self.advertiser_ids = advertiser_ids
        self.bc_id = bc_id
        if billing_group_emails is not None:
            self.billing_group_emails = billing_group_emails
        self.billing_group_name = billing_group_name
        if billing_group_type is not None:
            self.billing_group_type = billing_group_type
        if is_primary is not None:
            self.is_primary = is_primary

    @property
    def advertiser_ids(self):
        """Gets the advertiser_ids of this BillingGroupCreateBody.  # noqa: E501


        :return: The advertiser_ids of this BillingGroupCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._advertiser_ids

    @advertiser_ids.setter
    def advertiser_ids(self, advertiser_ids):
        """Sets the advertiser_ids of this BillingGroupCreateBody.


        :param advertiser_ids: The advertiser_ids of this BillingGroupCreateBody.  # noqa: E501
        :type: list[str]
        """
        if advertiser_ids is None:
            raise ValueError("Invalid value for `advertiser_ids`, must not be `None`")  # noqa: E501

        self._advertiser_ids = advertiser_ids

    @property
    def bc_id(self):
        """Gets the bc_id of this BillingGroupCreateBody.  # noqa: E501


        :return: The bc_id of this BillingGroupCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._bc_id

    @bc_id.setter
    def bc_id(self, bc_id):
        """Sets the bc_id of this BillingGroupCreateBody.


        :param bc_id: The bc_id of this BillingGroupCreateBody.  # noqa: E501
        :type: str
        """
        if bc_id is None:
            raise ValueError("Invalid value for `bc_id`, must not be `None`")  # noqa: E501

        self._bc_id = bc_id

    @property
    def billing_group_emails(self):
        """Gets the billing_group_emails of this BillingGroupCreateBody.  # noqa: E501


        :return: The billing_group_emails of this BillingGroupCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._billing_group_emails

    @billing_group_emails.setter
    def billing_group_emails(self, billing_group_emails):
        """Sets the billing_group_emails of this BillingGroupCreateBody.


        :param billing_group_emails: The billing_group_emails of this BillingGroupCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._billing_group_emails = billing_group_emails

    @property
    def billing_group_name(self):
        """Gets the billing_group_name of this BillingGroupCreateBody.  # noqa: E501


        :return: The billing_group_name of this BillingGroupCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._billing_group_name

    @billing_group_name.setter
    def billing_group_name(self, billing_group_name):
        """Sets the billing_group_name of this BillingGroupCreateBody.


        :param billing_group_name: The billing_group_name of this BillingGroupCreateBody.  # noqa: E501
        :type: str
        """
        if billing_group_name is None:
            raise ValueError("Invalid value for `billing_group_name`, must not be `None`")  # noqa: E501

        self._billing_group_name = billing_group_name

    @property
    def billing_group_type(self):
        """Gets the billing_group_type of this BillingGroupCreateBody.  # noqa: E501


        :return: The billing_group_type of this BillingGroupCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._billing_group_type

    @billing_group_type.setter
    def billing_group_type(self, billing_group_type):
        """Sets the billing_group_type of this BillingGroupCreateBody.


        :param billing_group_type: The billing_group_type of this BillingGroupCreateBody.  # noqa: E501
        :type: str
        """

        self._billing_group_type = billing_group_type

    @property
    def is_primary(self):
        """Gets the is_primary of this BillingGroupCreateBody.  # noqa: E501


        :return: The is_primary of this BillingGroupCreateBody.  # noqa: E501
        :rtype: bool
        """
        return self._is_primary

    @is_primary.setter
    def is_primary(self, is_primary):
        """Sets the is_primary of this BillingGroupCreateBody.


        :param is_primary: The is_primary of this BillingGroupCreateBody.  # noqa: E501
        :type: bool
        """

        self._is_primary = is_primary

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
        if issubclass(BillingGroupCreateBody, dict):
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
        if not isinstance(other, BillingGroupCreateBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
