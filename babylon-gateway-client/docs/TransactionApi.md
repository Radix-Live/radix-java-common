# TransactionApi

All URIs are relative to *https://gateway.radix.live*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountDepositPreValidation**](TransactionApi.md#accountDepositPreValidation) | **POST** /transaction/account-deposit-pre-validation | PreValidate deposit of resources to an account |
| [**transactionCommittedDetails**](TransactionApi.md#transactionCommittedDetails) | **POST** /transaction/committed-details | Get Committed Transaction Details |
| [**transactionConstruction**](TransactionApi.md#transactionConstruction) | **POST** /transaction/construction | Get Construction Metadata |
| [**transactionPreview**](TransactionApi.md#transactionPreview) | **POST** /transaction/preview | Preview Transaction |
| [**transactionPreviewV2**](TransactionApi.md#transactionPreviewV2) | **POST** /transaction/preview-v2 | Preview Transaction V2 |
| [**transactionStatus**](TransactionApi.md#transactionStatus) | **POST** /transaction/status | Get Transaction Status |
| [**transactionSubintentStatus**](TransactionApi.md#transactionSubintentStatus) | **POST** /transaction/subintent-status | Get Subintent Status |
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
        defaultClient.setBasePath("https://gateway.radix.live");

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
| **4XX** | Client-originated request error |  -  |


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
        defaultClient.setBasePath("https://gateway.radix.live");

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
| **4XX** | Client-originated request error |  -  |


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
        defaultClient.setBasePath("https://gateway.radix.live");

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

Preview a transaction against the latest network state, and returns the preview receipt. If the node has enabled it, you may be able to also preview against recent network state.  For V2 transactions (and beyond) the &#x60;/preview-v2&#x60; endpoint should be used instead.  This endpoint is effectively a proxy towards the Core API &#x60;/transaction/preview&#x60; endpoint. See the Core API documentation for more details. 

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
        defaultClient.setBasePath("https://gateway.radix.live");

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
| **4XX** | Client-originated request error |  -  |


## transactionPreviewV2

> TransactionPreviewV2Response transactionPreviewV2(transactionPreviewV2Request)

Preview Transaction V2

Previews a transaction against the latest network state, and returns the preview receipt. If the node has enabled it, you may be able to also preview against recent network state.  This endpoint supports V2 transactions (and beyond). If you still need to preview V1 transactions, you should use the &#x60;/preview&#x60; endpoint instead.  This endpoint is effectively a proxy towards the Core API &#x60;/transaction/preview-v2&#x60; endpoint. See the Core API documentation for more details. 

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
        defaultClient.setBasePath("https://gateway.radix.live");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionPreviewV2Request transactionPreviewV2Request = new TransactionPreviewV2Request(); // TransactionPreviewV2Request | 
        try {
            TransactionPreviewV2Response result = apiInstance.transactionPreviewV2(transactionPreviewV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionPreviewV2");
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
| **transactionPreviewV2Request** | [**TransactionPreviewV2Request**](TransactionPreviewV2Request.md)|  | |

### Return type

[**TransactionPreviewV2Response**](TransactionPreviewV2Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Preview |  -  |
| **4XX** | Client-originated request error |  -  |


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
        defaultClient.setBasePath("https://gateway.radix.live");

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
| **4XX** | Client-originated request error |  -  |


## transactionSubintentStatus

> TransactionSubintentStatusResponse transactionSubintentStatus(transactionSubintentStatusRequest)

Get Subintent Status

Returns if the given subintent has been finalized. 

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
        defaultClient.setBasePath("https://gateway.radix.live");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionSubintentStatusRequest transactionSubintentStatusRequest = new TransactionSubintentStatusRequest(); // TransactionSubintentStatusRequest | 
        try {
            TransactionSubintentStatusResponse result = apiInstance.transactionSubintentStatus(transactionSubintentStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionSubintentStatus");
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
| **transactionSubintentStatusRequest** | [**TransactionSubintentStatusRequest**](TransactionSubintentStatusRequest.md)|  | |

### Return type

[**TransactionSubintentStatusResponse**](TransactionSubintentStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction Status |  -  |
| **4XX** | Client-originated request error |  -  |


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
        defaultClient.setBasePath("https://gateway.radix.live");

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
| **4XX** | Client-originated request error |  -  |

