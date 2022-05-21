# TokenApi

All URIs are relative to *http://localhost:5208*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenDerivePost**](TokenApi.md#tokenDerivePost) | **POST** /token/derive | Derive Token Identifier
[**tokenNativePost**](TokenApi.md#tokenNativePost) | **POST** /token/native | Get Native Token Info
[**tokenPost**](TokenApi.md#tokenPost) | **POST** /token | Get Token Info



## tokenDerivePost

> TokenDeriveResponse tokenDerivePost(tokenDeriveRequest)

Derive Token Identifier

Returns the Radix Resource Identifier of a token with the given symbol, created by an account with the given public key.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        TokenApi apiInstance = new TokenApi(defaultClient);
        TokenDeriveRequest tokenDeriveRequest = new TokenDeriveRequest(); // TokenDeriveRequest | 
        try {
            TokenDeriveResponse result = apiInstance.tokenDerivePost(tokenDeriveRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenApi#tokenDerivePost");
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
 **tokenDeriveRequest** | [**TokenDeriveRequest**](TokenDeriveRequest.md)|  |

### Return type

[**TokenDeriveResponse**](TokenDeriveResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token info |  -  |
| **500** | Gateway Error |  -  |


## tokenNativePost

> TokenNativeResponse tokenNativePost(tokenNativeRequest)

Get Native Token Info

Returns information about XRD, including its Radix Resource Identifier.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        TokenApi apiInstance = new TokenApi(defaultClient);
        TokenNativeRequest tokenNativeRequest = new TokenNativeRequest(); // TokenNativeRequest | 
        try {
            TokenNativeResponse result = apiInstance.tokenNativePost(tokenNativeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenApi#tokenNativePost");
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
 **tokenNativeRequest** | [**TokenNativeRequest**](TokenNativeRequest.md)|  |

### Return type

[**TokenNativeResponse**](TokenNativeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token info |  -  |
| **500** | Gateway Error |  -  |


## tokenPost

> TokenResponse tokenPost(tokenRequest)

Get Token Info

Returns information about any token, given its Radix Resource Identifier.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.TokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        TokenApi apiInstance = new TokenApi(defaultClient);
        TokenRequest tokenRequest = new TokenRequest(); // TokenRequest | 
        try {
            TokenResponse result = apiInstance.tokenPost(tokenRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenApi#tokenPost");
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
 **tokenRequest** | [**TokenRequest**](TokenRequest.md)|  |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token info |  -  |
| **500** | Gateway Error |  -  |

