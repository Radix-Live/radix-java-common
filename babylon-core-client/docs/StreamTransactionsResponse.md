

# StreamTransactionsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**previousStateIdentifiers** | [**CommittedStateIdentifier**](CommittedStateIdentifier.md) |  |  [optional] |
|**fromStateVersion** | **Long** |  |  |
|**count** | **Integer** | An integer between &#x60;0&#x60; and &#x60;10000&#x60;, giving the total count of transactions in the returned response |  |
|**maxLedgerStateVersion** | **Long** |  |  |
|**transactions** | [**List&lt;CommittedTransaction&gt;**](CommittedTransaction.md) | A committed transactions list starting from the &#x60;from_state_version&#x60; (inclusive). |  |



