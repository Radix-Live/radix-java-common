

# ResourceChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceAddress** | **String** | The Bech32m-encoded human readable version of the resource address |  |
|**componentEntity** | [**EntityReference**](EntityReference.md) |  |  |
|**vaultEntity** | [**EntityReference**](EntityReference.md) |  |  |
|**amount** | **String** | The string-encoded decimal representing the XRD amount put or taken from the vault. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



