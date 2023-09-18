

# TransactionReceipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **Object** | The status of the transaction. |  [optional] |
|**feeSummary** | **Object** | Fees paid, Only present if the &#x60;status&#x60; is not &#x60;Rejected&#x60;. |  [optional] |
|**costingParameters** | **Object** |  |  [optional] |
|**feeDestination** | **Object** | Only present if the &#x60;status&#x60; is not &#x60;Rejected&#x60;. |  [optional] |
|**feeSource** | **Object** | Only present if the &#x60;status&#x60; is not &#x60;Rejected&#x60;. |  [optional] |
|**stateUpdates** | **Object** | Transaction state updates (only present if status is Succeeded or Failed). |  [optional] |
|**nextEpoch** | **Object** | Information (number and active validator list) about new epoch if occured. |  [optional] |
|**output** | **Object** | The manifest line-by-line engine return data (only present if &#x60;status&#x60; is &#x60;Succeeded&#x60;). |  [optional] |
|**events** | **Object** | Events emitted by a transaction. |  [optional] |
|**errorMessage** | **String** | Error message (only present if status is &#x60;Failed&#x60; or &#x60;Rejected&#x60;) |  [optional] |



