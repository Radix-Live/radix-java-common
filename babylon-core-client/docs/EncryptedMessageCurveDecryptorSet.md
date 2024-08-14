

# EncryptedMessageCurveDecryptorSet

A decryptor set for a particular ECDSA curve type. The (128-bit) AES-GCM symmetric key is encrypted separately for each decryptor public key via (256-bit) AES-KeyWrap. AES-KeyWrap uses a key derived via a KDF (Key Derivation Function) using a shared secret. For each decryptor public key, we create a shared curve point `G` via static Diffie-Helman between the decryptor public key, and a per-transaction ephemeral public key for that curve type. We then use that shared secret with a key derivation function to create the (256-bit) KEK (Key Encrypting Key): `KEK = HKDF(hash: Blake2b, secret: x co-ord of G, salt: [], length: 256 bits)`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dhEphemeralPublicKey** | [**PublicKey**](PublicKey.md) | The ephemeral Diffie-Helman public key for a particular ECDSA curve type (see its &#x60;key_type&#x60;). |  |
|**decryptors** | [**List&lt;EncryptedMessageDecryptor&gt;**](EncryptedMessageDecryptor.md) |  |  |



