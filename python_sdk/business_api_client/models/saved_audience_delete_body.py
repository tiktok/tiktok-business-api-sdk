# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class SavedAudienceDeleteBody(object):
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
        'saved_audience_ids': 'list[str]'
    }

    attribute_map = {
        'advertiser_id': 'advertiser_id',
        'saved_audience_ids': 'saved_audience_ids'
    }

    def __init__(self, advertiser_id=None, saved_audience_ids=None):  # noqa: E501
        """SavedAudienceDeleteBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_id = None
        self._saved_audience_ids = None
        self.discriminator = None
        self.advertiser_id = advertiser_id
        self.saved_audience_ids = saved_audience_ids

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this SavedAudienceDeleteBody.  # noqa: E501

        Advertiser ID.  # noqa: E501

        :return: The advertiser_id of this SavedAudienceDeleteBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this SavedAudienceDeleteBody.

        Advertiser ID.  # noqa: E501

        :param advertiser_id: The advertiser_id of this SavedAudienceDeleteBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def saved_audience_ids(self):
        """Gets the saved_audience_ids of this SavedAudienceDeleteBody.  # noqa: E501

        IDs of Saved Audiences that you want to delete. Max size = 100.  # noqa: E501

        :return: The saved_audience_ids of this SavedAudienceDeleteBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._saved_audience_ids

    @saved_audience_ids.setter
    def saved_audience_ids(self, saved_audience_ids):
        """Sets the saved_audience_ids of this SavedAudienceDeleteBody.

        IDs of Saved Audiences that you want to delete. Max size = 100.  # noqa: E501

        :param saved_audience_ids: The saved_audience_ids of this SavedAudienceDeleteBody.  # noqa: E501
        :type: list[str]
        """
        if saved_audience_ids is None:
            raise ValueError("Invalid value for `saved_audience_ids`, must not be `None`")  # noqa: E501

        self._saved_audience_ids = saved_audience_ids

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
        if issubclass(SavedAudienceDeleteBody, dict):
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
        if not isinstance(other, SavedAudienceDeleteBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
