# StreamApi

All URIs are relative to *https://rcnet-v3.radixdlt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamTransactions**](StreamApi.md#streamTransactions) | **POST** /stream/transactions | Get Transactions Stream |



## streamTransactions

> StreamTransactionsResponse streamTransactions(streamTransactionsRequest)

Get Transactions Stream

Returns transactions which have been committed to the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://rcnet-v3.radixdlt.com");

        StreamApi apiInstance = new StreamApi(defaultClient);
        StreamTransactionsRequest streamTransactionsRequest = new StreamTransactionsRequest(); // StreamTransactionsRequest | 
        try {
            StreamTransactionsResponse result = apiInstance.streamTransactions(streamTransactionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamApi#streamTransactions");
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
| **200** | Transactions (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |

