

# TransactionIntent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded intent hash for a user transaction, also known as the transaction id. This hash identifies the core content \&quot;intent\&quot; of the transaction. Each intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;IntentHash&#x60;. |  |
|**header** | [**TransactionHeader**](TransactionHeader.md) |  |  |
|**instructions** | **String** | The decompiled transaction manifest instructions. Only returned if enabled in &#x60;TransactionFormatOptions&#x60; on your request. |  [optional] |
|**blobsHex** | **Map&lt;String, String&gt;** | A map of the hex-encoded blob hash, to hex-encoded blob content. Only returned if enabled in &#x60;TransactionFormatOptions&#x60; on your request. |  [optional] |
|**message** | [**TransactionMessage**](TransactionMessage.md) | The optional transaction message. Only returned if present and enabled in &#x60;TransactionFormatOptions&#x60; on your request. |  [optional] |



