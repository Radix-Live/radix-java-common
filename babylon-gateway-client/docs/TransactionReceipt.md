

# TransactionReceipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TransactionStatus** |  |  [optional] |
|**feeSummary** | **Object** | This type is defined in the Core API as &#x60;FeeSummary&#x60;. See the Core API documentation for more details.  |  [optional] |
|**costingParameters** | **Object** |  |  [optional] |
|**feeDestination** | **Object** | This type is defined in the Core API as &#x60;FeeDestination&#x60;. See the Core API documentation for more details.  |  [optional] |
|**feeSource** | **Object** | This type is defined in the Core API as &#x60;FeeSource&#x60;. See the Core API documentation for more details.  |  [optional] |
|**stateUpdates** | **Object** | This type is defined in the Core API as &#x60;StateUpdates&#x60;. See the Core API documentation for more details.  |  [optional] |
|**nextEpoch** | **Object** | Information (number and active validator list) about new epoch if occured. This type is defined in the Core API as &#x60;NextEpoch&#x60;. See the Core API documentation for more details.  |  [optional] |
|**output** | **Object** | The manifest line-by-line engine return data (only present if &#x60;status&#x60; is &#x60;CommittedSuccess&#x60;). This type is defined in the Core API as &#x60;SborData&#x60;. See the Core API documentation for more details.  |  [optional] |
|**events** | [**List&lt;EventsItem&gt;**](EventsItem.md) | Events emitted by a transaction. |  [optional] |
|**errorMessage** | **String** | Error message (only present if status is &#x60;Failed&#x60; or &#x60;Rejected&#x60;) |  [optional] |



