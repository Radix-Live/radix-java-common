

# TransactionDetailsOptIns


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rawHex** | **Boolean** | if set to &#x60;true&#x60;, raw transaction hex is returned. |  [optional] |
|**receiptStateChanges** | **Boolean** | if set to &#x60;true&#x60;, state changes inside receipt object are returned. |  [optional] |
|**receiptFeeSummary** | **Boolean** | if set to &#x60;true&#x60;, fee summary inside receipt object is returned. |  [optional] |
|**receiptFeeSource** | **Boolean** | if set to &#x60;true&#x60;, fee source inside receipt object is returned. |  [optional] |
|**receiptFeeDestination** | **Boolean** | if set to &#x60;true&#x60;, fee destination inside receipt object is returned. |  [optional] |
|**receiptCostingParameters** | **Boolean** | if set to &#x60;true&#x60;, costing parameters inside receipt object is returned. |  [optional] |
|**receiptEvents** | **Boolean** | if set to &#x60;true&#x60;, events inside receipt object is returned. |  [optional] |
|**receiptOutput** | **Boolean** | (true by default) if set to &#x60;true&#x60;, transaction receipt output is returned. |  [optional] |
|**affectedGlobalEntities** | **Boolean** | if set to &#x60;true&#x60;, all affected global entities by given transaction are returned. |  [optional] |
|**manifestInstructions** | **Boolean** | if set to &#x60;true&#x60;, manifest instructions for user transactions are returned. |  [optional] |
|**balanceChanges** | **Boolean** | if set to &#x60;true&#x60;, returns the fungible and non-fungible balance changes.  **Warning!** This opt-in might be missing for recently committed transactions, in that case a &#x60;null&#x60; value will be returned. Retry the request until non-null value is returned.  |  [optional] |



