

# ParsedLedgerTransactionIdentifiers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intentHash** | **String** | The hex-encoded intent hash for a user transaction, also known as the transaction id. This hash identifies the core content \&quot;intent\&quot; of the transaction. Each intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent.  |  [optional] |
|**intentHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;IntentHash&#x60;. |  [optional] |
|**signedIntentHash** | **String** | The hex-encoded signed intent hash for a user transaction. This hash identifies the transaction intent, plus additional signatures. This hash is signed by the notary, to create the submittable NotarizedTransaction.  |  [optional] |
|**signedIntentHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;SignedIntentHash&#x60;. |  [optional] |
|**payloadHash** | **String** | The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature.  |  [optional] |
|**payloadHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;. |  [optional] |
|**ledgerHash** | **String** | The hex-encoded ledger payload transaction hash. This is a wrapper for both user transactions, and system transactions such as genesis and round changes.  |  |
|**ledgerHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;LedgerPayloadHash&#x60;. |  |



