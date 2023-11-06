

# TimestampedValidatorSignature


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validatorKey** | [**EcdsaSecp256k1PublicKey**](EcdsaSecp256k1PublicKey.md) |  |  |
|**validatorAddress** | **String** | The Bech32m-encoded human readable version of the component address |  |
|**timestampMs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the unix timestamp in ms. |  |
|**signature** | [**EcdsaSecp256k1Signature**](EcdsaSecp256k1Signature.md) |  |  |



