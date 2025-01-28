# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class AdcreateDisclaimerClickableTexts(object):
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
        'text': 'str',
        'url': 'str'
    }

    attribute_map = {
        'text': 'text',
        'url': 'url'
    }

    def __init__(self, text=None, url=None):  # noqa: E501
        """AdcreateDisclaimerClickableTexts - a model defined in Swagger"""  # noqa: E501
        self._text = None
        self._url = None
        self.discriminator = None
        if text is not None:
            self.text = text
        if url is not None:
            self.url = url

    @property
    def text(self):
        """Gets the text of this AdcreateDisclaimerClickableTexts.  # noqa: E501

        The disclaimer text. Length limit- 40 characters.  # noqa: E501

        :return: The text of this AdcreateDisclaimerClickableTexts.  # noqa: E501
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this AdcreateDisclaimerClickableTexts.

        The disclaimer text. Length limit- 40 characters.  # noqa: E501

        :param text: The text of this AdcreateDisclaimerClickableTexts.  # noqa: E501
        :type: str
        """

        self._text = text

    @property
    def url(self):
        """Gets the url of this AdcreateDisclaimerClickableTexts.  # noqa: E501

        The URL for the clickable disclaimer. When users tap each text, they will be redirected to the URL and see more disclaimer details.  # noqa: E501

        :return: The url of this AdcreateDisclaimerClickableTexts.  # noqa: E501
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this AdcreateDisclaimerClickableTexts.

        The URL for the clickable disclaimer. When users tap each text, they will be redirected to the URL and see more disclaimer details.  # noqa: E501

        :param url: The url of this AdcreateDisclaimerClickableTexts.  # noqa: E501
        :type: str
        """

        self._url = url

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
        if issubclass(AdcreateDisclaimerClickableTexts, dict):
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
        if not isinstance(other, AdcreateDisclaimerClickableTexts):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
