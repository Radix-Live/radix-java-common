

# SubintentV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded subintent hash for a subintent, also known as the partial transaction id. This hash identifies the subintent. Each subintent can only be *successfully* committed once, but unlike a transaction intent, could be committed as a failure zero or more times first. This hash gets signed by any signatories on subintent.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;SubintentHash&#x60;. |  |
|**intentCore** | [**IntentCoreV2**](IntentCoreV2.md) |  |  |



