# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class FilteringAdGet(object):
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
        'ad_ids': 'list[str]',
        'adgroup_ids': 'list[str]',
        'billing_events': 'list[str]',
        'campaign_ids': 'list[str]',
        'creation_filter_end_time': 'str',
        'creation_filter_start_time': 'str',
        'objective_type': 'str',
        'primary_status': 'str',
        'secondary_status': 'str'
    }

    attribute_map = {
        'ad_ids': 'ad_ids',
        'adgroup_ids': 'adgroup_ids',
        'billing_events': 'billing_events',
        'campaign_ids': 'campaign_ids',
        'creation_filter_end_time': 'creation_filter_end_time',
        'creation_filter_start_time': 'creation_filter_start_time',
        'objective_type': 'objective_type',
        'primary_status': 'primary_status',
        'secondary_status': 'secondary_status'
    }

    def __init__(self, ad_ids=None, adgroup_ids=None, billing_events=None, campaign_ids=None, creation_filter_end_time=None, creation_filter_start_time=None, objective_type=None, primary_status=None, secondary_status=None):  # noqa: E501
        """FilteringAdGet - a model defined in Swagger"""  # noqa: E501
        self._ad_ids = None
        self._adgroup_ids = None
        self._billing_events = None
        self._campaign_ids = None
        self._creation_filter_end_time = None
        self._creation_filter_start_time = None
        self._objective_type = None
        self._primary_status = None
        self._secondary_status = None
        self.discriminator = None
        if ad_ids is not None:
            self.ad_ids = ad_ids
        if adgroup_ids is not None:
            self.adgroup_ids = adgroup_ids
        if billing_events is not None:
            self.billing_events = billing_events
        if campaign_ids is not None:
            self.campaign_ids = campaign_ids
        if creation_filter_end_time is not None:
            self.creation_filter_end_time = creation_filter_end_time
        if creation_filter_start_time is not None:
            self.creation_filter_start_time = creation_filter_start_time
        if objective_type is not None:
            self.objective_type = objective_type
        if primary_status is not None:
            self.primary_status = primary_status
        if secondary_status is not None:
            self.secondary_status = secondary_status

    @property
    def ad_ids(self):
        """Gets the ad_ids of this FilteringAdGet.  # noqa: E501

        A list of Ad ID，quantity- `1-100`  # noqa: E501

        :return: The ad_ids of this FilteringAdGet.  # noqa: E501
        :rtype: list[str]
        """
        return self._ad_ids

    @ad_ids.setter
    def ad_ids(self, ad_ids):
        """Sets the ad_ids of this FilteringAdGet.

        A list of Ad ID，quantity- `1-100`  # noqa: E501

        :param ad_ids: The ad_ids of this FilteringAdGet.  # noqa: E501
        :type: list[str]
        """

        self._ad_ids = ad_ids

    @property
    def adgroup_ids(self):
        """Gets the adgroup_ids of this FilteringAdGet.  # noqa: E501

        A list of Ad group ID, quantity- `1-100`  # noqa: E501

        :return: The adgroup_ids of this FilteringAdGet.  # noqa: E501
        :rtype: list[str]
        """
        return self._adgroup_ids

    @adgroup_ids.setter
    def adgroup_ids(self, adgroup_ids):
        """Sets the adgroup_ids of this FilteringAdGet.

        A list of Ad group ID, quantity- `1-100`  # noqa: E501

        :param adgroup_ids: The adgroup_ids of this FilteringAdGet.  # noqa: E501
        :type: list[str]
        """

        self._adgroup_ids = adgroup_ids

    @property
    def billing_events(self):
        """Gets the billing_events of this FilteringAdGet.  # noqa: E501

        Billing events. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).  # noqa: E501

        :return: The billing_events of this FilteringAdGet.  # noqa: E501
        :rtype: list[str]
        """
        return self._billing_events

    @billing_events.setter
    def billing_events(self, billing_events):
        """Sets the billing_events of this FilteringAdGet.

        Billing events. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).  # noqa: E501

        :param billing_events: The billing_events of this FilteringAdGet.  # noqa: E501
        :type: list[str]
        """

        self._billing_events = billing_events

    @property
    def campaign_ids(self):
        """Gets the campaign_ids of this FilteringAdGet.  # noqa: E501

        A list of Campaign IDs, quantity- `1-100`  # noqa: E501

        :return: The campaign_ids of this FilteringAdGet.  # noqa: E501
        :rtype: list[str]
        """
        return self._campaign_ids

    @campaign_ids.setter
    def campaign_ids(self, campaign_ids):
        """Sets the campaign_ids of this FilteringAdGet.

        A list of Campaign IDs, quantity- `1-100`  # noqa: E501

        :param campaign_ids: The campaign_ids of this FilteringAdGet.  # noqa: E501
        :type: list[str]
        """

        self._campaign_ids = campaign_ids

    @property
    def creation_filter_end_time(self):
        """Gets the creation_filter_end_time of this FilteringAdGet.  # noqa: E501

        Filter by higher range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created earlier than this time will be returned.  # noqa: E501

        :return: The creation_filter_end_time of this FilteringAdGet.  # noqa: E501
        :rtype: str
        """
        return self._creation_filter_end_time

    @creation_filter_end_time.setter
    def creation_filter_end_time(self, creation_filter_end_time):
        """Sets the creation_filter_end_time of this FilteringAdGet.

        Filter by higher range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created earlier than this time will be returned.  # noqa: E501

        :param creation_filter_end_time: The creation_filter_end_time of this FilteringAdGet.  # noqa: E501
        :type: str
        """

        self._creation_filter_end_time = creation_filter_end_time

    @property
    def creation_filter_start_time(self):
        """Gets the creation_filter_start_time of this FilteringAdGet.  # noqa: E501

        Filter by lower range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created later than this time will be returned. Suggestion A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.  # noqa: E501

        :return: The creation_filter_start_time of this FilteringAdGet.  # noqa: E501
        :rtype: str
        """
        return self._creation_filter_start_time

    @creation_filter_start_time.setter
    def creation_filter_start_time(self, creation_filter_start_time):
        """Sets the creation_filter_start_time of this FilteringAdGet.

        Filter by lower range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created later than this time will be returned. Suggestion A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.  # noqa: E501

        :param creation_filter_start_time: The creation_filter_start_time of this FilteringAdGet.  # noqa: E501
        :type: str
        """

        self._creation_filter_start_time = creation_filter_start_time

    @property
    def objective_type(self):
        """Gets the objective_type of this FilteringAdGet.  # noqa: E501

        Advertising Objective. For enum values, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). Note- Whether you choose `WEB_CONVERSIONS` or  `CONVERSIONS` as the objective filter, we will return data of both `WEB_CONVERSIONS` and  `CONVERSIONS`.  # noqa: E501

        :return: The objective_type of this FilteringAdGet.  # noqa: E501
        :rtype: str
        """
        return self._objective_type

    @objective_type.setter
    def objective_type(self, objective_type):
        """Sets the objective_type of this FilteringAdGet.

        Advertising Objective. For enum values, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). Note- Whether you choose `WEB_CONVERSIONS` or  `CONVERSIONS` as the objective filter, we will return data of both `WEB_CONVERSIONS` and  `CONVERSIONS`.  # noqa: E501

        :param objective_type: The objective_type of this FilteringAdGet.  # noqa: E501
        :type: str
        """

        self._objective_type = objective_type

    @property
    def primary_status(self):
        """Gets the primary_status of this FilteringAdGet.  # noqa: E501

        Primary status. For enum values, see [Enumeration -Primary status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).  # noqa: E501

        :return: The primary_status of this FilteringAdGet.  # noqa: E501
        :rtype: str
        """
        return self._primary_status

    @primary_status.setter
    def primary_status(self, primary_status):
        """Sets the primary_status of this FilteringAdGet.

        Primary status. For enum values, see [Enumeration -Primary status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).  # noqa: E501

        :param primary_status: The primary_status of this FilteringAdGet.  # noqa: E501
        :type: str
        """

        self._primary_status = primary_status

    @property
    def secondary_status(self):
        """Gets the secondary_status of this FilteringAdGet.  # noqa: E501

        Ad status（secondary status). For enum values, see [Enumeration - Ad Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). his field is not returned in the sandbox environment because the ad is not actually delivered. [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id=1757239620352002) to learn about the valid values you can pass in via `secondary_status` for the primary status you specify.  # noqa: E501

        :return: The secondary_status of this FilteringAdGet.  # noqa: E501
        :rtype: str
        """
        return self._secondary_status

    @secondary_status.setter
    def secondary_status(self, secondary_status):
        """Sets the secondary_status of this FilteringAdGet.

        Ad status（secondary status). For enum values, see [Enumeration - Ad Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). his field is not returned in the sandbox environment because the ad is not actually delivered. [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id=1757239620352002) to learn about the valid values you can pass in via `secondary_status` for the primary status you specify.  # noqa: E501

        :param secondary_status: The secondary_status of this FilteringAdGet.  # noqa: E501
        :type: str
        """

        self._secondary_status = secondary_status

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
        if issubclass(FilteringAdGet, dict):
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
        if not isinstance(other, FilteringAdGet):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
