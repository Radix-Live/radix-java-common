

# TransactionSubintentDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subintentHash** | **String** | Bech32m-encoded hash. |  |
|**manifestInstructions** | **String** | A text-representation of a subintent manifest. This field will be present only for user transactions and when explicitly opted-in using the &#x60;manifest_instructions&#x60; flag.  |  [optional] |
|**message** | **Object** | The optional subintent message. This type is defined in the Core API as &#x60;TransactionMessage&#x60;. See the Core API documentation for more details.  |  [optional] |
|**childSubintentHashes** | **List&lt;String&gt;** | The subintent hash of each child of the subintent. |  [optional] |



