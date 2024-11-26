/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.0-L
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package live.radix.gateway.client;

import com.fasterxml.jackson.core.type.TypeReference;

import live.radix.gateway.ApiException;
import live.radix.gateway.ApiClient;
import live.radix.gateway.BaseApi;
import live.radix.gateway.Configuration;
import live.radix.gateway.Pair;

import live.radix.gateway.model.ErrorResponse;
import live.radix.gateway.model.ResourceHoldersRequest;
import live.radix.gateway.model.ResourceHoldersResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ExtensionsApi extends BaseApi {

  public ExtensionsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ExtensionsApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Get Resource Holders Page
   * A paginated endpoint to discover which global entities hold the most of a given resource. More specifically, it returns a page of global entities which hold the given resource, ordered descending by the total fungible balance / total count of non-fungibles stored in vaults in the state tree of that entity (excluding unclaimed royalty balances). This endpoint operates only at the **current state version**, it is not possible to browse historical data. Because of that, it is not possible to offer stable pagination as data constantly changes. Balances might change between pages being read, which might result in gaps or some entries being returned twice. Under default Gateway configuration, up to 100 entries are returned per response. This can be increased up to 1000 entries per page with the &#x60;limit_per_page&#x60; parameter. 
   * @param resourceHoldersRequest  (required)
   * @return ResourceHoldersResponse
   * @throws ApiException if fails to make API call
   */
  public ResourceHoldersResponse resourceHoldersPage(ResourceHoldersRequest resourceHoldersRequest) throws ApiException {
    return this.resourceHoldersPage(resourceHoldersRequest, Collections.emptyMap());
  }


  /**
   * Get Resource Holders Page
   * A paginated endpoint to discover which global entities hold the most of a given resource. More specifically, it returns a page of global entities which hold the given resource, ordered descending by the total fungible balance / total count of non-fungibles stored in vaults in the state tree of that entity (excluding unclaimed royalty balances). This endpoint operates only at the **current state version**, it is not possible to browse historical data. Because of that, it is not possible to offer stable pagination as data constantly changes. Balances might change between pages being read, which might result in gaps or some entries being returned twice. Under default Gateway configuration, up to 100 entries are returned per response. This can be increased up to 1000 entries per page with the &#x60;limit_per_page&#x60; parameter. 
   * @param resourceHoldersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ResourceHoldersResponse
   * @throws ApiException if fails to make API call
   */
  public ResourceHoldersResponse resourceHoldersPage(ResourceHoldersRequest resourceHoldersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = resourceHoldersRequest;
    
    // verify the required parameter 'resourceHoldersRequest' is set
    if (resourceHoldersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceHoldersRequest' when calling resourceHoldersPage");
    }
    
    // create path and map variables
    String localVarPath = "/extensions/resource-holders/page";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ResourceHoldersResponse> localVarReturnType = new TypeReference<ResourceHoldersResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
