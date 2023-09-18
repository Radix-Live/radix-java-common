

# CostingParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionCostUnitPrice** | **String** | The string-encoded decimal representing the XRD price of a single cost unit of transaction execution. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**executionCostUnitLimit** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum amount of cost units available for the transaction execution. |  |
|**executionCostUnitLoan** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the number of execution cost units loaned from system. |  |
|**finalizationCostUnitPrice** | **String** | The string-encoded decimal representing the XRD price of a single cost unit of transaction finalization. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**finalizationCostUnitLimit** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum amount of cost units available for the transaction finalization. |  |
|**xrdUsdPrice** | **String** | The string-encoded decimal representing the price of 1 USD, expressed in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdStoragePrice** | **String** | The string-encoded decimal representing the price of 1 byte of storage, expressed in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**tipPercentage** | **Integer** | An integer between &#x60;0&#x60; and &#x60;255&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to 1% of the fee. |  |



