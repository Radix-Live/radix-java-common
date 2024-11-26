

# IntentCoreV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intentHeader** | [**IntentHeaderV2**](IntentHeaderV2.md) |  |  |
|**childrenSpecifiers** | **List&lt;String&gt;** |  |  |
|**blobsHex** | **Map&lt;String, String&gt;** | A map of the hex-encoded blob hash, to hex-encoded blob content. Only returned if enabled in &#x60;TransactionFormatOptions&#x60; on your request. |  [optional] |
|**message** | [**TransactionMessage**](TransactionMessage.md) | The optional transaction message. Only returned if present and enabled in &#x60;TransactionFormatOptions&#x60; on your request. |  [optional] |
|**instructions** | **String** | The decompiled transaction manifest instructions. Only returned if enabled in &#x60;TransactionFormatOptions&#x60; on your request. |  [optional] |



