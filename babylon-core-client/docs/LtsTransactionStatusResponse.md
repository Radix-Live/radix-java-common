

# LtsTransactionStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intentStatus** | **LtsTransactionIntentStatus** |  |  |
|**statusDescription** | **String** | An explanation as to why the intent status is resolved as it is.  |  |
|**committedStateVersion** | **Long** |  |  [optional] |
|**invalidFromEpoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction will no longer be valid, and be permanently rejected. Only present if the intent status is InMempool or Unknown and we know about a payload.  |  [optional] |
|**knownPayloads** | [**List&lt;LtsTransactionPayloadDetails&gt;**](LtsTransactionPayloadDetails.md) |  |  |



