

# StreamTransactionsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**previousStateIdentifiers** | [**CommittedStateIdentifier**](CommittedStateIdentifier.md) | Identifiers for the state on top of which the returned transactions were executed (ie &#x60;from_state_version - 1&#x60;). This should be used for sanity-checking that you&#39;re reading from the ledger history you&#39;re expecting. If this is field is missing, the previous state does not exists (&#x60;from_state_version&#x60; is 0).  |  [optional] |
|**fromStateVersion** | **Long** |  |  |
|**count** | **Integer** | An integer between &#x60;0&#x60; and &#x60;10000&#x60;, giving the total count of transactions in the returned response |  |
|**maxLedgerStateVersion** | **Long** |  |  |
|**transactions** | [**List&lt;CommittedTransaction&gt;**](CommittedTransaction.md) | A committed transactions list starting from the &#x60;from_state_version&#x60; (inclusive). |  |
|**proofs** | [**List&lt;LedgerProof&gt;**](LedgerProof.md) | A ledger proof list starting from &#x60;from_state_version&#x60; (inclusive) stored by this node. |  [optional] |



