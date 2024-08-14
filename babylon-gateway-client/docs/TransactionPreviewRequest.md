

# TransactionPreviewRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manifest** | **String** | A text-representation of a transaction manifest |  |
|**blobsHex** | **List&lt;String&gt;** | An array of hex-encoded blob data (optional) |  [optional] |
|**startEpochInclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the transaction starts being valid |  |
|**endEpochExclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the transaction is no longer valid |  |
|**notaryPublicKey** | [**PublicKey**](PublicKey.md) | The notary public key to use (optional) |  [optional] |
|**notaryIsSignatory** | **Boolean** | Whether the notary should count as a signatory (optional, default false) |  [optional] |
|**tipPercentage** | **Integer** | An integer between &#x60;0&#x60; and &#x60;65535&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to 1% of the fee. |  |
|**nonce** | **Long** | A decimal-string-encoded integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, used to ensure the transaction intent is unique. |  |
|**signerPublicKeys** | [**List&lt;PublicKey&gt;**](PublicKey.md) | A list of public keys to be used as transaction signers |  |
|**flags** | [**TransactionPreviewRequestFlags**](TransactionPreviewRequestFlags.md) |  |  |



