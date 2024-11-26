

# TransactionPreviewRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**optIns** | [**TransactionPreviewOptIns**](TransactionPreviewOptIns.md) |  |  [optional] |
|**manifest** | **String** | A text-representation of a transaction manifest |  |
|**blobsHex** | **List&lt;String&gt;** | An array of hex-encoded blob data, if referenced by the manifest. |  [optional] |
|**startEpochInclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the transaction startsbeing valid. If omitted, the current epoch will be used.  |  [optional] |
|**endEpochExclusive** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the transaction is no longer valid. If omitted, a maximum epoch (relative to the &#x60;start_epoch_inclusive&#x60;) will be used.  |  [optional] |
|**notaryPublicKey** | [**PublicKey**](PublicKey.md) |  |  [optional] |
|**notaryIsSignatory** | **Boolean** | Whether the notary should be used as a signer (optional). If not provided, this defaults to false.  |  [optional] |
|**tipPercentage** | **Integer** | An integer between &#x60;0&#x60; and &#x60;65535&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to a 1% fee. If not provided, this defaults to 0.  |  [optional] |
|**nonce** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, chosen to allow a unique intent to be created (to enable submitting an otherwise identical/duplicate intent). If not provided, this defaults to 0.  |  [optional] |
|**signerPublicKeys** | [**List&lt;PublicKey&gt;**](PublicKey.md) | A list of public keys to be used as transaction signers. If not provided, this defaults to an empty array.  |  [optional] |
|**message** | **Object** | An optional transaction message. Only affects the costing. This type is defined in the Core API as &#x60;TransactionMessage&#x60;. See the Core API documentation for more details.  |  [optional] |
|**flags** | [**PreviewFlags**](PreviewFlags.md) |  |  [optional] |



