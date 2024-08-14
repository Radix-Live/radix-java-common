# StatisticsApi

All URIs are relative to *https://mainnet.radixdlt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validatorsUptime**](StatisticsApi.md#validatorsUptime) | **POST** /statistics/validators/uptime | Get Validators Uptime |



## validatorsUptime

> ValidatorsUptimeResponse validatorsUptime(validatorsUptimeRequest)

Get Validators Uptime

Returns validators uptime data for time range limited by &#x60;from_state_version&#x60; and &#x60;at_state_version&#x60;. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        StatisticsApi apiInstance = new StatisticsApi(defaultClient);
        ValidatorsUptimeRequest validatorsUptimeRequest = new ValidatorsUptimeRequest(); // ValidatorsUptimeRequest | 
        try {
            ValidatorsUptimeResponse result = apiInstance.validatorsUptime(validatorsUptimeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#validatorsUptime");
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
| **validatorsUptimeRequest** | [**ValidatorsUptimeRequest**](ValidatorsUptimeRequest.md)|  | |

### Return type

[**ValidatorsUptimeResponse**](ValidatorsUptimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validators Uptime |  -  |
| **4XX** |  |  -  |

