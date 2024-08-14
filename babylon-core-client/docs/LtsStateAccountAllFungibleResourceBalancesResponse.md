

# LtsStateAccountAllFungibleResourceBalancesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateVersion** | **Long** |  |  |
|**ledgerHeaderSummary** | [**LedgerHeaderSummary**](LedgerHeaderSummary.md) | The excerpt from the ledger header committed at the &#x60;state_version&#x60;. |  |
|**accountAddress** | **String** | The Bech32m-encoded human readable version of the account&#39;s address |  |
|**fungibleResourceBalances** | [**List&lt;LtsFungibleResourceBalance&gt;**](LtsFungibleResourceBalance.md) | A list containing all resource balances for the requested account. |  |



