

# TransactionHeader


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkId** | **Integer** | The logical id of the network |  |
|**startEpochInclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction can be submitted. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;.  |  |
|**endEpochExclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction will no longer be valid, and be rejected. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;.  |  |
|**nonce** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, chosen to allow a unique intent to be created (to enable submitting an otherwise identical/duplicate intent).  |  |
|**notaryPublicKey** | [**PublicKey**](PublicKey.md) |  |  |
|**notaryIsSignatory** | **Boolean** | Specifies whether the notary public key should be included in the transaction signers list |  |
|**tipPercentage** | **Integer** | An integer between &#x60;0&#x60; and &#x60;255&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to 1% of the fee. |  |



