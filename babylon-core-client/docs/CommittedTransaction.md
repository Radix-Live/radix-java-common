

# CommittedTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultantStateIdentifiers** | [**CommittedStateIdentifier**](CommittedStateIdentifier.md) |  |  |
|**ledgerTransaction** | [**LedgerTransaction**](LedgerTransaction.md) |  |  |
|**receipt** | [**TransactionReceipt**](TransactionReceipt.md) |  |  |
|**balanceChanges** | [**CommittedTransactionBalanceChanges**](CommittedTransactionBalanceChanges.md) | All balance changes of a transaction (including those fee-related), aggregated by resource and global entity within which the change occurred. Only returned if available and enabled in &#x60;TransactionFormatOptions&#x60; on your request.  |  [optional] |
|**proposerTimestampMs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the proposer timestamp in ms. |  |



