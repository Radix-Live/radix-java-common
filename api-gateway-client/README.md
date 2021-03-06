# api-gateway-client

Radix Gateway API  

**The source code is automatically generated from `gateway-api-spec.copy.yaml`**

- API version: 1.1.4.1-L  

- Build date: 2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]

This API is designed to enable clients to efficiently query information on the RadixDLT ledger, and allow clients to simply build and submit transactions to the network.

The API is designed for use by the Radix Foundation's [Desktop Wallet](https://wallet.radixdlt.com/) and [Explorer](https://explorer.radixdlt.com/), and replaces the original Olympia \"Archive Node API\".

# Gateway API Overview

The Gateway API is separated into distinct groupings:

* `/gateway` - Information about the Gateway API status
* `/account/_*` - To query account-related information
* `/token/_*` - To query token-related information
* `/validator/_*` and `/validators` - To query validator-related information
* `/transaction/_*` - To build, finalize and submit transactions, and to read the status and content of submitted and on-ledger transactions.
* `/custom/_*` - Additional endpoints that are an unofficial extensions to the Gateway API and available only at some API providers (e.g. `https://radix.live`),
          or as a custom build from a [forked repository](https://github.com/Radix-Live/radixdlt-network-gateway)

The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/radixdlt-network-gateway), which is configured to read from full node/s to extract and index data from the network.

# Gateway API Format

The API is designed in a JSON-RPC style, using HTTP as a transport layer, which means that:

* All requests are POST requests.
* Any error is returned with an HTTP status code of 500, with a returned error object.
  * The error object contains an HTTP-like `code`
  * The error object also contains a structured/typed `details` sub-object, with a `type` discriminator, allowing for structured error interpretation in clients.

# Comparison to other Radix APIs

* [Core API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/core/api.yaml) - The Core API is a low level API exposed by full nodes, and designed for use on internal networks. It is primarily designed for network integrations such as exchanges, ledger analytics providers, or hosted ledger data dashboards. The Core API provides endpoints for reading the mempool, constructing transactions and also exposes a stream of committed transactions.

* [System API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/system/api.yaml) - The System API is a private API exposed by full nodes to read system status.

The Gateway API offers a much wider range of query options and is more performant than the Core API. It is built on top of the Core API, ingesting data via the Core API transaction stream into a relational database.

The Gateway API transaction/construction endpoints operate with the concept of \"actions\" - these are higher-levels of intent compared with the Core API, which makes it easier for clients to use. The Core API should be used if you require more power/flexiblity for managing UTXOs, or submitting transactions which can't be mapped to a Gateway API action.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>live.radix</groupId>
  <artifactId>api-gateway-client</artifactId>
  <version>1.1.4.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "live.radix:api-gateway-client:1.1.4.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/api-gateway-client-1.1.4.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import live.radix.gateway.*;
import live.radix.gateway.auth.*;
import live.radix.gateway.model.*;
import live.radix.gateway.client.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");
        
        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountBalancesRequest accountBalancesRequest = new AccountBalancesRequest(); // AccountBalancesRequest | 
        try {
            AccountBalancesResponse result = apiInstance.accountBalancesPost(accountBalancesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountBalancesPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:5208*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountBalancesPost**](docs/AccountApi.md#accountBalancesPost) | **POST** /account/balances | Get Account Balances
*AccountApi* | [**accountDerivePost**](docs/AccountApi.md#accountDerivePost) | **POST** /account/derive | Derive Account Identifier
*AccountApi* | [**accountStakesPost**](docs/AccountApi.md#accountStakesPost) | **POST** /account/stakes | Get Stake Positions
*AccountApi* | [**accountTransactionsPost**](docs/AccountApi.md#accountTransactionsPost) | **POST** /account/transactions | Get Account Transactions
*AccountApi* | [**accountUnstakesPost**](docs/AccountApi.md#accountUnstakesPost) | **POST** /account/unstakes | Get Unstake Positions
*BatchTransactionsApi* | [**customTransactionsBatchSinceAccountTransactionsPost**](docs/BatchTransactionsApi.md#customTransactionsBatchSinceAccountTransactionsPost) | **POST** /custom/transactions-batch/since-account-transactions | Batch Polling of new Transactions
*BatchTransactionsApi* | [**customTransactionsBatchSinceLedgerStatePost**](docs/BatchTransactionsApi.md#customTransactionsBatchSinceLedgerStatePost) | **POST** /custom/transactions-batch/since-ledger-state | Batch request transactions for multiple accounts.
*StatusApi* | [**gatewayPost**](docs/StatusApi.md#gatewayPost) | **POST** /gateway | Get Gateway Info
*TokenApi* | [**tokenDerivePost**](docs/TokenApi.md#tokenDerivePost) | **POST** /token/derive | Derive Token Identifier
*TokenApi* | [**tokenNativePost**](docs/TokenApi.md#tokenNativePost) | **POST** /token/native | Get Native Token Info
*TokenApi* | [**tokenPost**](docs/TokenApi.md#tokenPost) | **POST** /token | Get Token Info
*TransactionApi* | [**transactionBuildPost**](docs/TransactionApi.md#transactionBuildPost) | **POST** /transaction/build | Build Transaction
*TransactionApi* | [**transactionFinalizePost**](docs/TransactionApi.md#transactionFinalizePost) | **POST** /transaction/finalize | Finalize Transaction
*TransactionApi* | [**transactionRecentPost**](docs/TransactionApi.md#transactionRecentPost) | **POST** /transaction/recent | Get Recent Transactions
*TransactionApi* | [**transactionRulesPost**](docs/TransactionApi.md#transactionRulesPost) | **POST** /transaction/rules | Get Transaction Rules
*TransactionApi* | [**transactionStatusPost**](docs/TransactionApi.md#transactionStatusPost) | **POST** /transaction/status | Transaction Status
*TransactionApi* | [**transactionSubmitPost**](docs/TransactionApi.md#transactionSubmitPost) | **POST** /transaction/submit | Submit Transaction
*ValidatorApi* | [**validatorDerivePost**](docs/ValidatorApi.md#validatorDerivePost) | **POST** /validator/derive | Get Validator Identifier
*ValidatorApi* | [**validatorPost**](docs/ValidatorApi.md#validatorPost) | **POST** /validator | Get Validator
*ValidatorApi* | [**validatorStakesPost**](docs/ValidatorApi.md#validatorStakesPost) | **POST** /validator/stakes | Get Validator Stakes
*ValidatorApi* | [**validatorsPost**](docs/ValidatorApi.md#validatorsPost) | **POST** /validators | Get Validators


## Documentation for Models

 - [AccountBalances](docs/AccountBalances.md)
 - [AccountBalancesRequest](docs/AccountBalancesRequest.md)
 - [AccountBalancesResponse](docs/AccountBalancesResponse.md)
 - [AccountDeriveRequest](docs/AccountDeriveRequest.md)
 - [AccountDeriveResponse](docs/AccountDeriveResponse.md)
 - [AccountIdentifier](docs/AccountIdentifier.md)
 - [AccountStakeEntry](docs/AccountStakeEntry.md)
 - [AccountStakesRequest](docs/AccountStakesRequest.md)
 - [AccountStakesResponse](docs/AccountStakesResponse.md)
 - [AccountTransactionInfo](docs/AccountTransactionInfo.md)
 - [AccountTransactionPair](docs/AccountTransactionPair.md)
 - [AccountTransactionsRequest](docs/AccountTransactionsRequest.md)
 - [AccountTransactionsResponse](docs/AccountTransactionsResponse.md)
 - [AccountUnstakeEntry](docs/AccountUnstakeEntry.md)
 - [AccountUnstakesRequest](docs/AccountUnstakesRequest.md)
 - [AccountUnstakesResponse](docs/AccountUnstakesResponse.md)
 - [Action](docs/Action.md)
 - [BelowMinimumStakeError](docs/BelowMinimumStakeError.md)
 - [BelowMinimumStakeErrorAllOf](docs/BelowMinimumStakeErrorAllOf.md)
 - [BurnTokens](docs/BurnTokens.md)
 - [BurnTokensAllOf](docs/BurnTokensAllOf.md)
 - [CannotStakeError](docs/CannotStakeError.md)
 - [CannotStakeErrorAllOf](docs/CannotStakeErrorAllOf.md)
 - [CouldNotConstructFeesError](docs/CouldNotConstructFeesError.md)
 - [CouldNotConstructFeesErrorAllOf](docs/CouldNotConstructFeesErrorAllOf.md)
 - [CreateTokenDefinition](docs/CreateTokenDefinition.md)
 - [CreateTokenDefinitionAllOf](docs/CreateTokenDefinitionAllOf.md)
 - [EpochRange](docs/EpochRange.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GatewayApiVersions](docs/GatewayApiVersions.md)
 - [GatewayError](docs/GatewayError.md)
 - [GatewayResponse](docs/GatewayResponse.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [InternalServerErrorAllOf](docs/InternalServerErrorAllOf.md)
 - [InvalidAccountAddressError](docs/InvalidAccountAddressError.md)
 - [InvalidAccountAddressErrorAllOf](docs/InvalidAccountAddressErrorAllOf.md)
 - [InvalidActionError](docs/InvalidActionError.md)
 - [InvalidActionErrorAllOf](docs/InvalidActionErrorAllOf.md)
 - [InvalidPublicKeyError](docs/InvalidPublicKeyError.md)
 - [InvalidPublicKeyErrorAllOf](docs/InvalidPublicKeyErrorAllOf.md)
 - [InvalidRequestError](docs/InvalidRequestError.md)
 - [InvalidRequestErrorAllOf](docs/InvalidRequestErrorAllOf.md)
 - [InvalidSignatureError](docs/InvalidSignatureError.md)
 - [InvalidSignatureErrorAllOf](docs/InvalidSignatureErrorAllOf.md)
 - [InvalidTokenRRIError](docs/InvalidTokenRRIError.md)
 - [InvalidTokenRRIErrorAllOf](docs/InvalidTokenRRIErrorAllOf.md)
 - [InvalidTokenSymbolError](docs/InvalidTokenSymbolError.md)
 - [InvalidTokenSymbolErrorAllOf](docs/InvalidTokenSymbolErrorAllOf.md)
 - [InvalidTransactionError](docs/InvalidTransactionError.md)
 - [InvalidTransactionErrorAllOf](docs/InvalidTransactionErrorAllOf.md)
 - [InvalidValidatorAddressError](docs/InvalidValidatorAddressError.md)
 - [InvalidValidatorAddressErrorAllOf](docs/InvalidValidatorAddressErrorAllOf.md)
 - [LedgerState](docs/LedgerState.md)
 - [MessageTooLongError](docs/MessageTooLongError.md)
 - [MessageTooLongErrorAllOf](docs/MessageTooLongErrorAllOf.md)
 - [MintTokens](docs/MintTokens.md)
 - [MintTokensAllOf](docs/MintTokensAllOf.md)
 - [NetworkIdentifier](docs/NetworkIdentifier.md)
 - [NetworkNotSupportedError](docs/NetworkNotSupportedError.md)
 - [NetworkNotSupportedErrorAllOf](docs/NetworkNotSupportedErrorAllOf.md)
 - [NotEnoughNativeTokensForFeesError](docs/NotEnoughNativeTokensForFeesError.md)
 - [NotEnoughNativeTokensForFeesErrorAllOf](docs/NotEnoughNativeTokensForFeesErrorAllOf.md)
 - [NotEnoughTokensForStakeError](docs/NotEnoughTokensForStakeError.md)
 - [NotEnoughTokensForTransferError](docs/NotEnoughTokensForTransferError.md)
 - [NotEnoughTokensForTransferErrorAllOf](docs/NotEnoughTokensForTransferErrorAllOf.md)
 - [NotEnoughTokensForUnstakeError](docs/NotEnoughTokensForUnstakeError.md)
 - [NotEnoughTokensForUnstakeErrorAllOf](docs/NotEnoughTokensForUnstakeErrorAllOf.md)
 - [NotSyncedUpError](docs/NotSyncedUpError.md)
 - [NotSyncedUpErrorAllOf](docs/NotSyncedUpErrorAllOf.md)
 - [PartialLedgerStateIdentifier](docs/PartialLedgerStateIdentifier.md)
 - [PublicKey](docs/PublicKey.md)
 - [RecentTransactionsRequest](docs/RecentTransactionsRequest.md)
 - [RecentTransactionsResponse](docs/RecentTransactionsResponse.md)
 - [RegisterValidator](docs/RegisterValidator.md)
 - [RegisterValidatorAllOf](docs/RegisterValidatorAllOf.md)
 - [Signature](docs/Signature.md)
 - [StakeTokens](docs/StakeTokens.md)
 - [StakeTokensAllOf](docs/StakeTokensAllOf.md)
 - [TargetLedgerState](docs/TargetLedgerState.md)
 - [Token](docs/Token.md)
 - [TokenAmount](docs/TokenAmount.md)
 - [TokenDeriveRequest](docs/TokenDeriveRequest.md)
 - [TokenDeriveResponse](docs/TokenDeriveResponse.md)
 - [TokenIdentifier](docs/TokenIdentifier.md)
 - [TokenInfo](docs/TokenInfo.md)
 - [TokenNativeRequest](docs/TokenNativeRequest.md)
 - [TokenNativeResponse](docs/TokenNativeResponse.md)
 - [TokenNotFoundError](docs/TokenNotFoundError.md)
 - [TokenNotFoundErrorAllOf](docs/TokenNotFoundErrorAllOf.md)
 - [TokenProperties](docs/TokenProperties.md)
 - [TokenRequest](docs/TokenRequest.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TransactionBuild](docs/TransactionBuild.md)
 - [TransactionBuildRequest](docs/TransactionBuildRequest.md)
 - [TransactionBuildResponse](docs/TransactionBuildResponse.md)
 - [TransactionFinalizeRequest](docs/TransactionFinalizeRequest.md)
 - [TransactionFinalizeResponse](docs/TransactionFinalizeResponse.md)
 - [TransactionIdentifier](docs/TransactionIdentifier.md)
 - [TransactionInfo](docs/TransactionInfo.md)
 - [TransactionMetadata](docs/TransactionMetadata.md)
 - [TransactionNotFoundError](docs/TransactionNotFoundError.md)
 - [TransactionNotFoundErrorAllOf](docs/TransactionNotFoundErrorAllOf.md)
 - [TransactionRules](docs/TransactionRules.md)
 - [TransactionRulesRequest](docs/TransactionRulesRequest.md)
 - [TransactionRulesResponse](docs/TransactionRulesResponse.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionStatusRequest](docs/TransactionStatusRequest.md)
 - [TransactionStatusResponse](docs/TransactionStatusResponse.md)
 - [TransactionSubmitRequest](docs/TransactionSubmitRequest.md)
 - [TransactionSubmitResponse](docs/TransactionSubmitResponse.md)
 - [TransactionsSinceHashBatchRequest](docs/TransactionsSinceHashBatchRequest.md)
 - [TransactionsSinceHashBatchResponse](docs/TransactionsSinceHashBatchResponse.md)
 - [TransactionsSinceStateBatchRequest](docs/TransactionsSinceStateBatchRequest.md)
 - [TransactionsSinceStateBatchResponse](docs/TransactionsSinceStateBatchResponse.md)
 - [TransferTokens](docs/TransferTokens.md)
 - [TransferTokensAllOf](docs/TransferTokensAllOf.md)
 - [UnregisterValidator](docs/UnregisterValidator.md)
 - [UnstakeTokens](docs/UnstakeTokens.md)
 - [UnstakeTokensAllOf](docs/UnstakeTokensAllOf.md)
 - [ValidationErrorsAtPath](docs/ValidationErrorsAtPath.md)
 - [Validator](docs/Validator.md)
 - [ValidatorAccountStake](docs/ValidatorAccountStake.md)
 - [ValidatorDeriveRequest](docs/ValidatorDeriveRequest.md)
 - [ValidatorDeriveResponse](docs/ValidatorDeriveResponse.md)
 - [ValidatorForkSignal](docs/ValidatorForkSignal.md)
 - [ValidatorIdentifier](docs/ValidatorIdentifier.md)
 - [ValidatorInfo](docs/ValidatorInfo.md)
 - [ValidatorProperties](docs/ValidatorProperties.md)
 - [ValidatorRequest](docs/ValidatorRequest.md)
 - [ValidatorResponse](docs/ValidatorResponse.md)
 - [ValidatorStakesRequest](docs/ValidatorStakesRequest.md)
 - [ValidatorStakesResponse](docs/ValidatorStakesResponse.md)
 - [ValidatorUptime](docs/ValidatorUptime.md)
 - [ValidatorsRequest](docs/ValidatorsRequest.md)
 - [ValidatorsResponse](docs/ValidatorsResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



