

# TransactionSubintentStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ledgerState** | [**LedgerState**](LedgerState.md) |  |  |
|**subintentStatus** | **SubintentStatus** |  |  |
|**subintentStatusDescription** | **String** | An additional description to clarify the &#x60;subintent_status&#x60;.  |  |
|**finalizedAtStateVersion** | **Long** | The state version when the subintent was finalized (committed as a success). This field is only present if the status is &#x60;CommittedSuccess&#x60;.  |  [optional] |
|**finalizedAtTransactionIntentHash** | **String** | Bech32m-encoded hash. |  [optional] |



