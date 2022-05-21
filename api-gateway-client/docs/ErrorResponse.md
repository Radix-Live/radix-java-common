

# ErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | A numeric code corresponding to the given error type, roughly aligned with HTTP Status Code semantics (eg 400/404/500). | 
**message** | **String** | A human-readable error message. | 
**details** | [**GatewayError**](GatewayError.md) |  |  [optional]
**traceId** | **String** | A GUID to be used when reporting errors, to allow correlation with the Gateway API&#39;s error logs. |  [optional]



