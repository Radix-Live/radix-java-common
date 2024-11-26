

# PreviewFlags


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**useFreeCredit** | **Boolean** | If enabled, a large simulated pool of XRD is marked as locked.  This mode can be used to estimate fees. To get a reliable estimate, we recommend that your transaction is as close as possible to the real transaction. For example: - You should still use a lock fee command, but you can set it to lock a fee of 0. - You should include the public keys that will sign the transaction, so the cost of   signature verification and payload size can be accounted for.  |  [optional] |
|**assumeAllSignatureProofs** | **Boolean** | If enabled, each manifest processor&#39;s auth zone will be given a simulated proof of every signature, which can be used to pass signature access rules.  This can be used to preview transactions even if the required signatures are not known ahead of time.  See the documentation on [advanced access rules](https://docs.radixdlt.com/docs/advanced-accessrules#signature-requirements) for more information.  |  [optional] |
|**skipEpochCheck** | **Boolean** | If enabled, the various runtime epoch-related verifications are skipped: - The &#x60;start_epoch_inclusive&#x60; and &#x60;end_epoch_exclusive&#x60; parameters, if specified, are ignored. - The duplicate intent checks (which rely on the expiry epoch) are also ignored.  However, if the start and end epoch are provided, they must still be statically valid. We recommend using a value of &#x60;start_epoch_inclusive &#x3D; 1&#x60; and &#x60;end_epoch_exclusive &#x3D; 2&#x60; in this case.  |  [optional] |
|**disableAuthChecks** | **Boolean** | If enabled, all authorization checks are skipped during execution.  This could be used to e.g.: * Preview protocol update style transactions. * Mint resources for previewing trades with resources you don&#39;t own.   If doing this, be warned: only resources which were potentially mintable/burnable   at creation time will be mintable/burnable, due to feature flags on the resource.  Warning: this mode of operation is quite a departure from normal operation: * Calculated fees will likely be lower than a standard execution. * This mode can subtly break invariants some dApp code might rely on, or result in unexpected   behaviour, so the execution result might not be valid for your needs. For example,   if this flag was used to mint pool units to preview a redemption (or some dApp interaction which   behind the scenes redeemed them), they&#39;d redeem for less than they&#39;re currently worth,   because the blueprint code relies on the total supply of the pool units to calculate their   redemption worth, and you&#39;ve just inflated the total supply through the mint operation.  |  [optional] |



