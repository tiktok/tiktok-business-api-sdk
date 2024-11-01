# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class LookalikeUpdateBody(object):
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
        'advertiser_id': 'str',
        'context_info': 'OpenApiv13dmpcustomAudiencefileuploadContextInfo',
        'custom_audience_ids': 'list[str]'
    }

    attribute_map = {
        'advertiser_id': 'advertiser_id',
        'context_info': 'context_info',
        'custom_audience_ids': 'custom_audience_ids'
    }

    def __init__(self, advertiser_id=None, context_info=None, custom_audience_ids=None):  # noqa: E501
        """LookalikeUpdateBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_id = None
        self._context_info = None
        self._custom_audience_ids = None
        self.discriminator = None
        self.advertiser_id = advertiser_id
        if context_info is not None:
            self.context_info = context_info
        self.custom_audience_ids = custom_audience_ids

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this LookalikeUpdateBody.  # noqa: E501

        Advertiser ID.  # noqa: E501

        :return: The advertiser_id of this LookalikeUpdateBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this LookalikeUpdateBody.

        Advertiser ID.  # noqa: E501

        :param advertiser_id: The advertiser_id of this LookalikeUpdateBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def context_info(self):
        """Gets the context_info of this LookalikeUpdateBody.  # noqa: E501


        :return: The context_info of this LookalikeUpdateBody.  # noqa: E501
        :rtype: OpenApiv13dmpcustomAudiencefileuploadContextInfo
        """
        return self._context_info

    @context_info.setter
    def context_info(self, context_info):
        """Sets the context_info of this LookalikeUpdateBody.


        :param context_info: The context_info of this LookalikeUpdateBody.  # noqa: E501
        :type: OpenApiv13dmpcustomAudiencefileuploadContextInfo
        """

        self._context_info = context_info

    @property
    def custom_audience_ids(self):
        """Gets the custom_audience_ids of this LookalikeUpdateBody.  # noqa: E501

        A list of custom audience IDs.  # noqa: E501

        :return: The custom_audience_ids of this LookalikeUpdateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._custom_audience_ids

    @custom_audience_ids.setter
    def custom_audience_ids(self, custom_audience_ids):
        """Sets the custom_audience_ids of this LookalikeUpdateBody.

        A list of custom audience IDs.  # noqa: E501

        :param custom_audience_ids: The custom_audience_ids of this LookalikeUpdateBody.  # noqa: E501
        :type: list[str]
        """
        if custom_audience_ids is None:
            raise ValueError("Invalid value for `custom_audience_ids`, must not be `None`")  # noqa: E501

        self._custom_audience_ids = custom_audience_ids

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
        if issubclass(LookalikeUpdateBody, dict):
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
        if not isinstance(other, LookalikeUpdateBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
