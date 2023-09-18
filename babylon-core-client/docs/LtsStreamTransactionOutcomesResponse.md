

# LtsStreamTransactionOutcomesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromStateVersion** | **Long** |  |  |
|**count** | **Integer** | An integer between &#x60;0&#x60; and &#x60;10000&#x60;, giving the total count of transactions in the returned response |  |
|**maxLedgerStateVersion** | **Long** |  |  |
|**committedTransactionOutcomes** | [**List&lt;LtsCommittedTransactionOutcome&gt;**](LtsCommittedTransactionOutcome.md) | A committed transaction outcomes list starting from the &#x60;from_state_version&#x60; (inclusive). |  |



