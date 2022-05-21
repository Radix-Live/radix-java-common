# TransactionApi

All URIs are relative to *http://localhost:5208*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionBuildPost**](TransactionApi.md#transactionBuildPost) | **POST** /transaction/build | Build Transaction
[**transactionFinalizePost**](TransactionApi.md#transactionFinalizePost) | **POST** /transaction/finalize | Finalize Transaction
[**transactionRulesPost**](TransactionApi.md#transactionRulesPost) | **POST** /transaction/rules | Get Transaction Rules
[**transactionStatusPost**](TransactionApi.md#transactionStatusPost) | **POST** /transaction/status | Transaction Status
[**transactionSubmitPost**](TransactionApi.md#transactionSubmitPost) | **POST** /transaction/submit | Submit Transaction



## transactionBuildPost

> TransactionBuildResponse transactionBuildPost(transactionBuildRequest)

Build Transaction

Returns a built unsigned transaction payload, from a set of intended actions.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionBuildRequest transactionBuildRequest = new TransactionBuildRequest(); // TransactionBuildRequest | 
        try {
            TransactionBuildResponse result = apiInstance.transactionBuildPost(transactionBuildRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionBuildPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionBuildRequest** | [**TransactionBuildRequest**](TransactionBuildRequest.md)|  |

### Return type

[**TransactionBuildResponse**](TransactionBuildResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An unsigned transaction |  -  |
| **500** | Gateway Error |  -  |


## transactionFinalizePost

> TransactionFinalizeResponse transactionFinalizePost(transactionFinalizeRequest)

Finalize Transaction

Returns a signed transaction payload and transaction identifier, from an unsigned transaction payload and signature.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionFinalizeRequest transactionFinalizeRequest = new TransactionFinalizeRequest(); // TransactionFinalizeRequest | 
        try {
            TransactionFinalizeResponse result = apiInstance.transactionFinalizePost(transactionFinalizeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionFinalizePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionFinalizeRequest** | [**TransactionFinalizeRequest**](TransactionFinalizeRequest.md)|  |

### Return type

[**TransactionFinalizeResponse**](TransactionFinalizeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Final Signed Transaction |  -  |
| **500** | Gateway Error |  -  |


## transactionRulesPost

> TransactionRulesResponse transactionRulesPost(transactionRulesRequest)

Get Transaction Rules

Returns the current rules used to build and validate transactions in the Radix Engine.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionRulesRequest transactionRulesRequest = new TransactionRulesRequest(); // TransactionRulesRequest | 
        try {
            TransactionRulesResponse result = apiInstance.transactionRulesPost(transactionRulesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionRulesPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRulesRequest** | [**TransactionRulesRequest**](TransactionRulesRequest.md)|  |

### Return type

[**TransactionRulesResponse**](TransactionRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rules for transaction construction |  -  |
| **500** | Gateway Error |  -  |


## transactionStatusPost

> TransactionStatusResponse transactionStatusPost(transactionStatusRequest)

Transaction Status

Returns the status and contents of the transaction with the given transaction identifier. Transaction identifiers which aren&#39;t recognised as either belonging to a committed transaction or a transaction submitted through this Network Gateway may return a &#x60;TransactionNotFoundError&#x60;. Transaction identifiers relating to failed transactions will, after a delay, also be reported as a &#x60;TransactionNotFoundError&#x60;. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionStatusRequest** | [**TransactionStatusRequest**](TransactionStatusRequest.md)|  |

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
| **200** | Transaction Status |  -  |
| **500** | Gateway Error |  -  |


## transactionSubmitPost

> TransactionSubmitResponse transactionSubmitPost(transactionSubmitRequest)

Submit Transaction

Submits a signed transaction payload to the network. The transaction identifier from finalize or submit can then be used to track the transaction status. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionSubmitRequest** | [**TransactionSubmitRequest**](TransactionSubmitRequest.md)|  |

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
| **200** | Successful Submission |  -  |
| **500** | Gateway Error |  -  |

