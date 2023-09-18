

# EcdsaSecp256k1Signature


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signatureHex** | **String** | A hex-encoded recoverable ECDSA Secp256k1 signature (65 bytes). The first byte is the recovery id, the remaining 64 bytes are the compact signature, ie &#x60;CONCAT(R, s)&#x60; where &#x60;R&#x60; and &#x60;s&#x60; are each 32-bytes in padded big-endian format. |  |



