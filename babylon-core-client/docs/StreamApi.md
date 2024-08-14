# StreamApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamProofsPost**](StreamApi.md#streamProofsPost) | **POST** /stream/proofs | Stream Proofs |
| [**streamTransactionsPost**](StreamApi.md#streamTransactionsPost) | **POST** /stream/transactions | Get Committed Transactions |



## streamProofsPost

> StreamProofsResponse streamProofsPost(streamProofsRequest)

Stream Proofs

Returns a stream of proofs committed to the node&#39;s ledger.  NOTE: This endpoint may return different results on different nodes: * Each node may persist different subset of signatures on a given proofs, as long as enough of the validator set has signed. * Inside an epoch, different nodes may receive and persist / keep different proofs, subject to constraints on gaps between proofs.  Proofs during an epoch can also be garbage collected by the node after the fact. Therefore proofs may disappear from this stream.  Some proofs (such as during genesis and protocol update enactment) are created on a node and don&#39;t include signatures.  This stream accepts four different options in the request: * All proofs forward (from state version) * All end-of-epoch proofs (from epoch number) * All end-of-epoch proofs triggering a protocol update * All node-injected proofs enacting genesis or a protocol update (for protocol update name, from state version)  The end-of-epoch proofs can be used to \&quot;trustlessly\&quot; verify the validator set for a given epoch. By tracking the fact that validators for epoch N sign the next validator set for epoch N + 1, this chain of proofs can be used to provide proof of the current validator set from a hardcoded start.  When a validator set is known for a given epoch, this can be used to verify the various transaction hash trees in the epoch, and to prove other data.  NOTE: This endpoint was built after agreeing the new Radix convention for paged APIs. Its models therefore follow the new convention, rather than attempting to align with existing loose Core API conventions. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StreamApi apiInstance = new StreamApi(defaultClient);
        StreamProofsRequest streamProofsRequest = new StreamProofsRequest(); // StreamProofsRequest | 
        try {
            StreamProofsResponse result = apiInstance.streamProofsPost(streamProofsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamApi#streamProofsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **streamProofsRequest** | [**StreamProofsRequest**](StreamProofsRequest.md)|  | |

### Return type

[**StreamProofsResponse**](StreamProofsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stream proofs response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## streamTransactionsPost

> StreamTransactionsResponse streamTransactionsPost(streamTransactionsRequest)

Get Committed Transactions

Returns the list of committed transactions. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StreamApi apiInstance = new StreamApi(defaultClient);
        StreamTransactionsRequest streamTransactionsRequest = new StreamTransactionsRequest(); // StreamTransactionsRequest | 
        try {
            StreamTransactionsResponse result = apiInstance.streamTransactionsPost(streamTransactionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamApi#streamTransactionsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **streamTransactionsRequest** | [**StreamTransactionsRequest**](StreamTransactionsRequest.md)|  | |

### Return type

[**StreamTransactionsResponse**](StreamTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Committed transactions response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |

