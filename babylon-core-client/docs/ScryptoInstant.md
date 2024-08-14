

# ScryptoInstant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unixTimestampSeconds** | **String** | A decimal string-encoded 64-bit signed integer, marking the unix timestamp in seconds.  Note: this field accurately represents the full range of possible on-ledger values (i.e. &#x60;-2^63 &lt;&#x3D; seconds &lt; 2^63&#x60;). This is contrary to the &#x60;InstantMs&#x60; type used in other places of this API.  |  |
|**dateTime** | **String** | The RFC 3339 / ISO 8601 string representation of the timestamp. Will always use \&quot;Z\&quot; (denoting UTC) and a second-precision (i.e. *skipping* the &#x60;.000&#x60; milliseconds part). E.g.: &#x60;2023-01-26T18:30:09Z&#x60;.  Note: This field will *not* be present if the actual on-ledger &#x60;unix_timestamp_seconds&#x60; value is outside the basic range supported by the RFC 3339 / ISO 8601 standard, which starts at year 1583 (i.e. the beginning of the Gregorian calendar) and ends at year 9999 (inclusive).  |  [optional] |



