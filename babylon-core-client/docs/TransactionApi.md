# TransactionApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transactionCallPreviewPost**](TransactionApi.md#transactionCallPreviewPost) | **POST** /transaction/call-preview | Scrypto Call Preview |
| [**transactionParsePost**](TransactionApi.md#transactionParsePost) | **POST** /transaction/parse | Parse Transaction Payload |
| [**transactionPreviewPost**](TransactionApi.md#transactionPreviewPost) | **POST** /transaction/preview | Transaction Preview |
| [**transactionReceiptPost**](TransactionApi.md#transactionReceiptPost) | **POST** /transaction/receipt | Get Transaction Receipt |
| [**transactionStatusPost**](TransactionApi.md#transactionStatusPost) | **POST** /transaction/status | Get Transaction Status |
| [**transactionSubmitPost**](TransactionApi.md#transactionSubmitPost) | **POST** /transaction/submit | Transaction Submit |



## transactionCallPreviewPost

> TransactionCallPreviewResponse transactionCallPreviewPost(transactionCallPreviewRequest)

Scrypto Call Preview

Preview a scrypto function or method call against the latest network state. Returns the result of the scrypto function or method call. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionCallPreviewRequest transactionCallPreviewRequest = new TransactionCallPreviewRequest(); // TransactionCallPreviewRequest | 
        try {
            TransactionCallPreviewResponse result = apiInstance.transactionCallPreviewPost(transactionCallPreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionCallPreviewPost");
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
| **transactionCallPreviewRequest** | [**TransactionCallPreviewRequest**](TransactionCallPreviewRequest.md)|  | |

### Return type

[**TransactionCallPreviewResponse**](TransactionCallPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of the scrypto function call |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## transactionParsePost

> TransactionParseResponse transactionParsePost(transactionParseRequest)

Parse Transaction Payload

Extracts the contents and hashes of various types of transaction payloads, or sub-payloads.

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionParseRequest transactionParseRequest = new TransactionParseRequest(); // TransactionParseRequest | 
        try {
            TransactionParseResponse result = apiInstance.transactionParsePost(transactionParseRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionParsePost");
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
| **transactionParseRequest** | [**TransactionParseRequest**](TransactionParseRequest.md)|  | |

### Return type

[**TransactionParseResponse**](TransactionParseResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction Parse Response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## transactionPreviewPost

> TransactionPreviewResponse transactionPreviewPost(transactionPreviewRequest)

Transaction Preview

Preview a transaction against the latest network state, and returns the preview receipt. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionPreviewRequest transactionPreviewRequest = new TransactionPreviewRequest(); // TransactionPreviewRequest | 
        try {
            TransactionPreviewResponse result = apiInstance.transactionPreviewPost(transactionPreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionPreviewPost");
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
| **transactionPreviewRequest** | [**TransactionPreviewRequest**](TransactionPreviewRequest.md)|  | |

### Return type

[**TransactionPreviewResponse**](TransactionPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction preview response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## transactionReceiptPost

> TransactionReceiptResponse transactionReceiptPost(transactionReceiptRequest)

Get Transaction Receipt

Gets the transaction receipt for a committed transaction. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionReceiptRequest transactionReceiptRequest = new TransactionReceiptRequest(); // TransactionReceiptRequest | 
        try {
            TransactionReceiptResponse result = apiInstance.transactionReceiptPost(transactionReceiptRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionReceiptPost");
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
| **transactionReceiptRequest** | [**TransactionReceiptRequest**](TransactionReceiptRequest.md)|  | |

### Return type

[**TransactionReceiptResponse**](TransactionReceiptResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Committed transaction found response |  -  |
| **400** | Client error |  -  |
| **404** | Committed transaction not found response |  -  |
| **500** | Server error |  -  |


## transactionStatusPost

> TransactionStatusResponse transactionStatusPost(transactionStatusRequest)

Get Transaction Status

Shares the node&#39;s knowledge of any payloads associated with the given intent hash. Generally there will be a single payload for a given intent, but it&#39;s theoretically possible there may be multiple. This knowledge is summarised into a status for the intent. This summarised status in the response is likely sufficient for most clients. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionStatusRequest transactionStatusRequest = new TransactionStatusRequest(); // TransactionStatusRequest | 
        try {
            TransactionStatusResponse result = apiInstance.transactionStatusPost(transactionStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionStatusPost");
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
| **transactionStatusRequest** | [**TransactionStatusRequest**](TransactionStatusRequest.md)|  | |

### Return type

[**TransactionStatusResponse**](TransactionStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction status response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## transactionSubmitPost

> TransactionSubmitResponse transactionSubmitPost(transactionSubmitRequest)

Transaction Submit

Submits a notarized transaction to the network. Returns whether the transaction submission was already included in the node&#39;s mempool. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionSubmitRequest transactionSubmitRequest = new TransactionSubmitRequest(); // TransactionSubmitRequest | 
        try {
            TransactionSubmitResponse result = apiInstance.transactionSubmitPost(transactionSubmitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionSubmitPost");
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
| **transactionSubmitRequest** | [**TransactionSubmitRequest**](TransactionSubmitRequest.md)|  | |

### Return type

[**TransactionSubmitResponse**](TransactionSubmitResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction Submit Response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |

