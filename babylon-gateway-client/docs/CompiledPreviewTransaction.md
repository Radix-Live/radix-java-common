

# CompiledPreviewTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**previewTransactionHex** | **String** | A hex-encoded, compiled &#x60;RawPreviewTransaction&#x60;.  As of Cuttlefish, only &#x60;PreviewTransactionV2&#x60; is supported.  A &#x60;PreviewTransactionV2&#x60; can be created with a v2 transaction builder: * If using Rust, it can be created with a &#x60;TransactionV2Builder&#x60; using &#x60;build_preview_transaction()&#x60;   and then converted to hex with &#x60;preview_transaction.to_raw().unwrap().to_hex()&#x60; * If using the toolkit, you can create this using the v2 transaction builder.  Some subtleties: * Partial transactions can&#39;t be previewed. Instead, they must be wrapped inside a   transaction wrapper, so that the engine knows how to yield to them appropriately. * Currently the builder assumes that the signed partial transactions have real signatures.   This isn&#39;t strictly required, and we may create a builder in future which allows providing   public keys when building partial transactions for use in preview. * If you don&#39;t have signatures to hand, you can simply not sign the partial transactions,   and then use the &#x60;assume_all_signature_proofs&#x60; preview flag, although be advised that   this may result in the fee estimate being slightly lower during preview. * We may create more ergonomic builders for PreviewTransactions which allow use of   public keys to denote the signers of subintents. Let us know if this is important   for your use case.  |  |



