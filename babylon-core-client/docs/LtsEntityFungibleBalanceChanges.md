

# LtsEntityFungibleBalanceChanges


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityAddress** | **String** | The Bech32m-encoded human readable version of the entity&#39;s address |  |
|**feeBalanceChange** | [**LtsFungibleResourceBalanceChange**](LtsFungibleResourceBalanceChange.md) |  |  [optional] |
|**feeBalanceChanges** | [**List&lt;LtsFeeFungibleResourceBalanceChange&gt;**](LtsFeeFungibleResourceBalanceChange.md) | If present, this field indicates fee-related balance changes, for example:  - Payment of the fee (including tip and royalty) - Distribution of royalties - Distribution of the fee and tip to the consensus-manager, for distributing to the relevant   validator/s at end of epoch  See https://www.radixdlt.com/blog/how-fees-work-in-babylon for further information on how fee payment works at Babylon.  |  |
|**nonFeeBalanceChanges** | [**List&lt;LtsFungibleResourceBalanceChange&gt;**](LtsFungibleResourceBalanceChange.md) |  |  |



