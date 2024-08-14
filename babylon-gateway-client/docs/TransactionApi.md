# TransactionApi

All URIs are relative to *https://mainnet.radixdlt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountDepositPreValidation**](TransactionApi.md#accountDepositPreValidation) | **POST** /transaction/account-deposit-pre-validation | PreValidate deposit of resources to an account |
| [**transactionCommittedDetails**](TransactionApi.md#transactionCommittedDetails) | **POST** /transaction/committed-details | Get Committed Transaction Details |
| [**transactionConstruction**](TransactionApi.md#transactionConstruction) | **POST** /transaction/construction | Get Construction Metadata |
| [**transactionPreview**](TransactionApi.md#transactionPreview) | **POST** /transaction/preview | Preview Transaction |
| [**transactionStatus**](TransactionApi.md#transactionStatus) | **POST** /transaction/status | Get Transaction Status |
| [**transactionSubmit**](TransactionApi.md#transactionSubmit) | **POST** /transaction/submit | Submit Transaction |



## accountDepositPreValidation

> AccountDepositPreValidationResponse accountDepositPreValidation(accountDepositPreValidationRequest)

PreValidate deposit of resources to an account

Helper endpoint that allows pre-validation if a deposit of certain resources to a given account can succeed or not. It is only meant for pre-validation usage, it does not guarantee that execution will succeed. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        AccountDepositPreValidationRequest accountDepositPreValidationRequest = new AccountDepositPreValidationRequest(); // AccountDepositPreValidationRequest | 
        try {
            AccountDepositPreValidationResponse result = apiInstance.accountDepositPreValidation(accountDepositPreValidationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#accountDepositPreValidation");
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
| **accountDepositPreValidationRequest** | [**AccountDepositPreValidationRequest**](AccountDepositPreValidationRequest.md)|  | |

### Return type

[**AccountDepositPreValidationResponse**](AccountDepositPreValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pre-validation response, including all deciding factors that were used to generate that response. |  -  |
| **4XX** |  |  -  |


## transactionCommittedDetails

> TransactionCommittedDetailsResponse transactionCommittedDetails(transactionCommittedDetailsRequest)

Get Committed Transaction Details

Returns the committed details and receipt of the transaction for a given transaction identifier. Transaction identifiers which don&#39;t correspond to a committed transaction will return a &#x60;TransactionNotFoundError&#x60;. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionCommittedDetailsRequest transactionCommittedDetailsRequest = new TransactionCommittedDetailsRequest(); // TransactionCommittedDetailsRequest | 
        try {
            TransactionCommittedDetailsResponse result = apiInstance.transactionCommittedDetails(transactionCommittedDetailsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionCommittedDetails");
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
| **transactionCommittedDetailsRequest** | [**TransactionCommittedDetailsRequest**](TransactionCommittedDetailsRequest.md)|  | |

### Return type

[**TransactionCommittedDetailsResponse**](TransactionCommittedDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction Status |  -  |
| **4XX** |  |  -  |


## transactionConstruction

> TransactionConstructionResponse transactionConstruction()

Get Construction Metadata

Returns information needed to construct a new transaction including current &#x60;epoch&#x60; number. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        try {
            TransactionConstructionResponse result = apiInstance.transactionConstruction();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionConstruction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TransactionConstructionResponse**](TransactionConstructionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns information needed to construct transaction.  |  -  |


## transactionPreview

> TransactionPreviewResponse transactionPreview(transactionPreviewRequest)

Preview Transaction

Previews transaction against the network. This endpoint is effectively a proxy towards the Core API &#x60;/v0/transaction/preview&#x60; endpoint. See the Core API documentation for more details. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionPreviewRequest transactionPreviewRequest = new TransactionPreviewRequest(); // TransactionPreviewRequest | 
        try {
            TransactionPreviewResponse result = apiInstance.transactionPreview(transactionPreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionPreview");
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
| **200** | Successful Preview |  -  |
| **4XX** |  |  -  |


## transactionStatus

> TransactionStatusResponse transactionStatus(transactionStatusRequest)

Get Transaction Status

Returns overall transaction status and all of its known payloads based on supplied intent hash. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionStatusRequest transactionStatusRequest = new TransactionStatusRequest(); // TransactionStatusRequest | 
        try {
            TransactionStatusResponse result = apiInstance.transactionStatus(transactionStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionStatus");
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
| **200** | Transaction Status |  -  |
| **4XX** |  |  -  |


## transactionSubmit

> TransactionSubmitResponse transactionSubmit(transactionSubmitRequest)

Submit Transaction

Submits a signed transaction payload to the network. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionSubmitRequest transactionSubmitRequest = new TransactionSubmitRequest(); // TransactionSubmitRequest | 
        try {
            TransactionSubmitResponse result = apiInstance.transactionSubmit(transactionSubmitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionSubmit");
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
| **200** | Successful Submission |  -  |
| **4XX** |  |  -  |

