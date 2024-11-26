

# LtsTransactionSubmitPriorityThresholdNotMetErrorDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tipPercentage** | **Integer** | NOTE: This is kept for backwards compatibility, but we recommend using &#x60;tip_proportion&#x60; instead.  Tip percentage of the submitted (and rejected) transaction. For V2 transactions specifying basis point tips, the amount is rounded down.  |  |
|**minTipPercentageRequired** | **Integer** | NOTE: This is kept for backwards compatibility, but we recommend using &#x60;min_tip_proportion_required&#x60; instead.  A lower bound for tip percentage at current mempool state. Anything lower than this will very likely result in a mempool rejection. A missing value means there is no tip that can guarantee submission.  |  [optional] |
|**tipProportion** | **String** | The string-encoded decimal tip proportion of the submitted (and rejected) transaction.  This field will always be present on Cuttlefish nodes, but is marked as not-required for Cuttlefish launch, to avoid a dependency on clients to update after the node is updated.  |  [optional] |
|**minTipProportionRequired** | **String** | A lower bound for tip proportion at current mempool state. Anything lower than this will very likely result in a mempool rejection. A missing value means there is no tip that can guarantee submission.  |  [optional] |



