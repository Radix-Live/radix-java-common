/*
 * Radix Gateway API
 * This API is designed to enable clients to efficiently query information on the RadixDLT ledger, and allow clients to simply build and submit transactions to the network.  The API is designed for use by the Radix Foundation's [Desktop Wallet](https://wallet.radixdlt.com/) and [Explorer](https://explorer.radixdlt.com/), and replaces the original Olympia \"Archive Node API\".  # Gateway API Overview  The Gateway API is separated into distinct groupings:  * `/gateway` - Information about the Gateway API status * `/account/_*` - To query account-related information * `/token/_*` - To query token-related information * `/validator/_*` and `/validators` - To query validator-related information * `/transaction/_*` - To build, finalize and submit transactions, and to read the status and content of submitted and on-ledger transactions. * `/custom/_*` - Additional endpoints that are an unofficial extensions to the Gateway API and available only at some API providers (e.g. `https://radix.live`),           or as a custom build from a [forked repository](https://github.com/Radix-Live/radixdlt-network-gateway)  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/radixdlt-network-gateway), which is configured to read from full node/s to extract and index data from the network.  # Gateway API Format  The API is designed in a JSON-RPC style, using HTTP as a transport layer, which means that:  * All requests are POST requests. * Any error is returned with an HTTP status code of 500, with a returned error object.   * The error object contains an HTTP-like `code`   * The error object also contains a structured/typed `details` sub-object, with a `type` discriminator, allowing for structured error interpretation in clients.  # Comparison to other Radix APIs  * [Core API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/core/api.yaml) - The Core API is a low level API exposed by full nodes, and designed for use on internal networks. It is primarily designed for network integrations such as exchanges, ledger analytics providers, or hosted ledger data dashboards. The Core API provides endpoints for reading the mempool, constructing transactions and also exposes a stream of committed transactions.  * [System API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/system/api.yaml) - The System API is a private API exposed by full nodes to read system status.  The Gateway API offers a much wider range of query options and is more performant than the Core API. It is built on top of the Core API, ingesting data via the Core API transaction stream into a relational database.  The Gateway API transaction/construction endpoints operate with the concept of \"actions\" - these are higher-levels of intent compared with the Core API, which makes it easier for clients to use. The Core API should be used if you require more power/flexiblity for managing UTXOs, or submitting transactions which can't be mapped to a Gateway API action. 
 *
 * The version of the OpenAPI document: 1.1.4.1-L
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
import live.radix.gateway.Configuration;
import live.radix.gateway.model.*;
import live.radix.gateway.Pair;

import live.radix.gateway.model.ErrorResponse;
import live.radix.gateway.model.ValidatorDeriveRequest;
import live.radix.gateway.model.ValidatorDeriveResponse;
import live.radix.gateway.model.ValidatorRequest;
import live.radix.gateway.model.ValidatorResponse;
import live.radix.gateway.model.ValidatorStakesRequest;
import live.radix.gateway.model.ValidatorStakesResponse;
import live.radix.gateway.model.ValidatorsRequest;
import live.radix.gateway.model.ValidatorsResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]")
public class ValidatorApi {
  private ApiClient apiClient;

  public ValidatorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ValidatorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Validator Identifier
   * Returns the validator address associated with the given public key.
   * @param validatorDeriveRequest  (required)
   * @return ValidatorDeriveResponse
   * @throws ApiException if fails to make API call
   */
  public ValidatorDeriveResponse validatorDerivePost(ValidatorDeriveRequest validatorDeriveRequest) throws ApiException {
    Object localVarPostBody = validatorDeriveRequest;
    
    // verify the required parameter 'validatorDeriveRequest' is set
    if (validatorDeriveRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'validatorDeriveRequest' when calling validatorDerivePost");
    }
    
    // create path and map variables
    String localVarPath = "/validator/derive";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ValidatorDeriveResponse> localVarReturnType = new TypeReference<ValidatorDeriveResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
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
  /**
   * Get Validator
   * Returns information about a validator, given a validator address. If a validator address is valid, but has not appeared on ledger as a validator, this endpoint still returns a successful response. 
   * @param validatorRequest  (required)
   * @return ValidatorResponse
   * @throws ApiException if fails to make API call
   */
  public ValidatorResponse validatorPost(ValidatorRequest validatorRequest) throws ApiException {
    Object localVarPostBody = validatorRequest;
    
    // verify the required parameter 'validatorRequest' is set
    if (validatorRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'validatorRequest' when calling validatorPost");
    }
    
    // create path and map variables
    String localVarPath = "/validator";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ValidatorResponse> localVarReturnType = new TypeReference<ValidatorResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
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
  /**
   * Get Validator Stakes
   * Returns paginated results about the delegated stakes from accounts to a validator. The results are totalled by account, and ordered by account age (oldest to newest). 
   * @param validatorStakesRequest  (required)
   * @return ValidatorStakesResponse
   * @throws ApiException if fails to make API call
   */
  public ValidatorStakesResponse validatorStakesPost(ValidatorStakesRequest validatorStakesRequest) throws ApiException {
    Object localVarPostBody = validatorStakesRequest;
    
    // verify the required parameter 'validatorStakesRequest' is set
    if (validatorStakesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'validatorStakesRequest' when calling validatorStakesPost");
    }
    
    // create path and map variables
    String localVarPath = "/validator/stakes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ValidatorStakesResponse> localVarReturnType = new TypeReference<ValidatorStakesResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
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
  /**
   * Get Validators
   * Returns information about all validators.
   * @param validatorsRequest  (required)
   * @return ValidatorsResponse
   * @throws ApiException if fails to make API call
   */
  public ValidatorsResponse validatorsPost(ValidatorsRequest validatorsRequest) throws ApiException {
    Object localVarPostBody = validatorsRequest;
    
    // verify the required parameter 'validatorsRequest' is set
    if (validatorsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'validatorsRequest' when calling validatorsPost");
    }
    
    // create path and map variables
    String localVarPath = "/validators";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ValidatorsResponse> localVarReturnType = new TypeReference<ValidatorsResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
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
}
