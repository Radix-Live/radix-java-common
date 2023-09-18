

# FeeSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionCostUnitsConsumed** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the amount of cost units consumed by the transaction execution. |  |
|**finalizationCostUnitsConsumed** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the amount of cost units consumed by the transaction finalization. |  |
|**xrdTotalExecutionCost** | **String** | The string-encoded decimal representing the total amount of XRD burned in the transaction as part of execution costs. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdTotalFinalizationCost** | **String** | The string-encoded decimal representing the total amount of XRD burned in the transaction as part of finalization costs. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdTotalRoyaltyCost** | **String** | The string-encoded decimal representing the total amount of XRD paid in royalties as part of the transaction. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdTotalStorageCost** | **String** | The string-encoded decimal representing the total amount of XRD paid in state expansion costs as part of the transaction. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**xrdTotalTippingCost** | **String** | The string-encoded decimal representing the total amount of XRD tipped to validators in the transaction. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



