# StatusApi

All URIs are relative to *http://localhost:5208*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gatewayPost**](StatusApi.md#gatewayPost) | **POST** /gateway | Get Gateway Info



## gatewayPost

> GatewayResponse gatewayPost(body)

Get Gateway Info

Returns the Gateway API version, network and current ledger state.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        StatusApi apiInstance = new StatusApi(defaultClient);
        Object body = null; // Object | 
        try {
            GatewayResponse result = apiInstance.gatewayPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#gatewayPost");
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
 **body** | **Object**|  |

### Return type

[**GatewayResponse**](GatewayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Network |  -  |
| **500** | Gateway Error |  -  |

