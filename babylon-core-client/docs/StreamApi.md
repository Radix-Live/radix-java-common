# StreamApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamTransactionsPost**](StreamApi.md#streamTransactionsPost) | **POST** /stream/transactions | Get Committed Transactions |



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

