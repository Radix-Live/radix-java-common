

# SystemCostingParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionCostUnitPrice** | **String** | The string-encoded decimal representing the XRD price of a single cost unit of transaction execution. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**executionCostUnitLimit** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum amount of cost units available for the transaction execution. |  |
|**executionCostUnitLoan** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum number of cost units which can be used before fee is locked from a vault. |  |
|**finalizationCostUnitPrice** | **String** | The string-encoded decimal representing the XRD price of a single cost unit of transaction finalization. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**finalizationCostUnitLimit** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum amount of cost units available for the transaction finalization. |  |
|**xrdUsdPrice** | **String** | The string-encoded decimal representing what amount of XRD is consumed by a Royalty of 1 USD. This is fixed for a given protocol version, so is not an accurate representation of the XRD price. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdStoragePrice** | **String** | The string-encoded decimal representing the price of 1 byte of state storage, expressed in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdArchiveStoragePrice** | **String** | The string-encoded decimal representing the price of 1 byte of archive storage, expressed in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



