

# IntentHeaderV2

The metadata common to both transaction intents and subintents.  The `min_proposer_timestamp_inclusive` and `max_proposer_timestamp_exclusive` are both optional. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkId** | **Integer** | The logical id of the network |  |
|**startEpochInclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction can be submitted. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;.  |  |
|**endEpochExclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction will no longer be valid, and be rejected. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;.  |  |
|**minProposerTimestampInclusive** | [**ScryptoInstant**](ScryptoInstant.md) |  |  [optional] |
|**maxProposerTimestampExclusive** | [**ScryptoInstant**](ScryptoInstant.md) |  |  [optional] |
|**intentDiscriminator** | **String** | The string representation of an integer between &#x60;0&#x60; and &#x60;2^64 - 1&#x60;, which can be chosen to ensure that a unique intent can be created. It only needs to be unique for a particular intent content and epoch/timestamp, and can be safely selected randomly to very high probability.  This field was called &#x60;nonce&#x60; in the V1 models, but was a misleading name, as it got confused with a cryptographic nonce or an Ethereum-style nonce, and it is neither.  |  |



