

# EncryptedTransactionMessageAllOf

A `PlaintextTransactionMessage` encrypted with \"Multi-party ECIES\" for a number of decryptors (public keys).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedHex** | **String** | The hex-encoded (128-bit) AES-GCM encrypted bytes of an SBOR-encoded &#x60;PlaintextTransactionMessage&#x60;. The bytes are serialized as the concatenation &#x60;Nonce/IV (12 bytes) || Cipher (variable length) || Tag/MAC (16 bytes)&#x60;:  |  |
|**curveDecryptorSets** | [**List&lt;EncryptedMessageCurveDecryptorSet&gt;**](EncryptedMessageCurveDecryptorSet.md) |  |  |



