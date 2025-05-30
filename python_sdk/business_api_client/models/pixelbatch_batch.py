# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class PixelbatchBatch(object):
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
        'context': 'PixelContext',
        'event': 'str',
        'event_id': 'str',
        'properties': 'PixelProperties',
        'timestamp': 'str',
        'type': 'str'
    }

    attribute_map = {
        'context': 'context',
        'event': 'event',
        'event_id': 'event_id',
        'properties': 'properties',
        'timestamp': 'timestamp',
        'type': 'type'
    }

    def __init__(self, context=None, event=None, event_id=None, properties=None, timestamp=None, type=None):  # noqa: E501
        """PixelbatchBatch - a model defined in Swagger"""  # noqa: E501
        self._context = None
        self._event = None
        self._event_id = None
        self._properties = None
        self._timestamp = None
        self._type = None
        self.discriminator = None
        if context is not None:
            self.context = context
        if event is not None:
            self.event = event
        if event_id is not None:
            self.event_id = event_id
        if properties is not None:
            self.properties = properties
        if timestamp is not None:
            self.timestamp = timestamp
        if type is not None:
            self.type = type

    @property
    def context(self):
        """Gets the context of this PixelbatchBatch.  # noqa: E501


        :return: The context of this PixelbatchBatch.  # noqa: E501
        :rtype: PixelContext
        """
        return self._context

    @context.setter
    def context(self, context):
        """Sets the context of this PixelbatchBatch.


        :param context: The context of this PixelbatchBatch.  # noqa: E501
        :type: PixelContext
        """

        self._context = context

    @property
    def event(self):
        """Gets the event of this PixelbatchBatch.  # noqa: E501

        Conversion event name. Please refer to the above `Supported web events` section for accepted event names.  # noqa: E501

        :return: The event of this PixelbatchBatch.  # noqa: E501
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event):
        """Sets the event of this PixelbatchBatch.

        Conversion event name. Please refer to the above `Supported web events` section for accepted event names.  # noqa: E501

        :param event: The event of this PixelbatchBatch.  # noqa: E501
        :type: str
        """

        self._event = event

    @property
    def event_id(self):
        """Gets the event_id of this PixelbatchBatch.  # noqa: E501

        {Any hashed ID that can identify a unique user/session and do not contain `_`}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber   # noqa: E501

        :return: The event_id of this PixelbatchBatch.  # noqa: E501
        :rtype: str
        """
        return self._event_id

    @event_id.setter
    def event_id(self, event_id):
        """Sets the event_id of this PixelbatchBatch.

        {Any hashed ID that can identify a unique user/session and do not contain `_`}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber   # noqa: E501

        :param event_id: The event_id of this PixelbatchBatch.  # noqa: E501
        :type: str
        """

        self._event_id = event_id

    @property
    def properties(self):
        """Gets the properties of this PixelbatchBatch.  # noqa: E501


        :return: The properties of this PixelbatchBatch.  # noqa: E501
        :rtype: PixelProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this PixelbatchBatch.


        :param properties: The properties of this PixelbatchBatch.  # noqa: E501
        :type: PixelProperties
        """

        self._properties = properties

    @property
    def timestamp(self):
        """Gets the timestamp of this PixelbatchBatch.  # noqa: E501

        Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.  # noqa: E501

        :return: The timestamp of this PixelbatchBatch.  # noqa: E501
        :rtype: str
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this PixelbatchBatch.

        Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.  # noqa: E501

        :param timestamp: The timestamp of this PixelbatchBatch.  # noqa: E501
        :type: str
        """

        self._timestamp = timestamp

    @property
    def type(self):
        """Gets the type of this PixelbatchBatch.  # noqa: E501

        Currently only accepting value track  # noqa: E501

        :return: The type of this PixelbatchBatch.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this PixelbatchBatch.

        Currently only accepting value track  # noqa: E501

        :param type: The type of this PixelbatchBatch.  # noqa: E501
        :type: str
        """

        self._type = type

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
        if issubclass(PixelbatchBatch, dict):
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
        if not isinstance(other, PixelbatchBatch):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
