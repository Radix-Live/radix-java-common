

# TransactionPreviewRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**atLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**manifest** | **String** | A text-representation of a transaction manifest |  |
|**blobsHex** | **List&lt;String&gt;** | An array of hex-encoded blob data (optional) |  [optional] |
|**startEpochInclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the transaction starts being valid |  |
|**endEpochExclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the transaction is no longer valid |  |
|**notaryPublicKey** | [**PublicKey**](PublicKey.md) | The notary public key to use (optional) |  [optional] |
|**notaryIsSignatory** | **Boolean** | Whether the notary should count as a signatory (optional, default false) |  [optional] |
|**tipPercentage** | **Integer** | An integer between &#x60;0&#x60; and &#x60;65535&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to 1% of the fee. |  |
|**nonce** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, chosen to allow a unique intent to be created (to enable submitting an otherwise identical/duplicate intent).  |  |
|**signerPublicKeys** | [**List&lt;PublicKey&gt;**](PublicKey.md) | A list of public keys to be used as transaction signers |  |
|**message** | [**TransactionMessage**](TransactionMessage.md) | An optional transaction message. Only affects the costing. |  [optional] |
|**flags** | [**TransactionPreviewRequestFlags**](TransactionPreviewRequestFlags.md) |  |  |



