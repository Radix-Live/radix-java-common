# MempoolApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mempoolListPost**](MempoolApi.md#mempoolListPost) | **POST** /mempool/list | Get Mempool List |
| [**mempoolTransactionPost**](MempoolApi.md#mempoolTransactionPost) | **POST** /mempool/transaction | Get Mempool Transaction |



## mempoolListPost

> MempoolListResponse mempoolListPost(mempoolListRequest)

Get Mempool List

Returns the hashes of all the transactions currently in the mempool

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.MempoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        MempoolApi apiInstance = new MempoolApi(defaultClient);
        MempoolListRequest mempoolListRequest = new MempoolListRequest(); // MempoolListRequest | 
        try {
            MempoolListResponse result = apiInstance.mempoolListPost(mempoolListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MempoolApi#mempoolListPost");
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
| **mempoolListRequest** | [**MempoolListRequest**](MempoolListRequest.md)|  | |

### Return type

[**MempoolListResponse**](MempoolListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mempool List Response |  -  |
| **500** | Server error |  -  |


## mempoolTransactionPost

> MempoolTransactionResponse mempoolTransactionPost(mempoolTransactionRequest)

Get Mempool Transaction

Returns the payload of a transaction currently in the mempool

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.MempoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        MempoolApi apiInstance = new MempoolApi(defaultClient);
        MempoolTransactionRequest mempoolTransactionRequest = new MempoolTransactionRequest(); // MempoolTransactionRequest | 
        try {
            MempoolTransactionResponse result = apiInstance.mempoolTransactionPost(mempoolTransactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MempoolApi#mempoolTransactionPost");
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
| **mempoolTransactionRequest** | [**MempoolTransactionRequest**](MempoolTransactionRequest.md)|  | |

### Return type

[**MempoolTransactionResponse**](MempoolTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mempool Transaction Response |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |

