/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.2-L
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets NativeResourceKind
 */
public enum NativeResourceKind {
  
  XRD("Xrd"),
  
  PACKAGE_OWNER_BADGE("PackageOwnerBadge"),
  
  ACCOUNT_OWNER_BADGE("AccountOwnerBadge"),
  
  IDENTITY_OWNER_BADGE("IdentityOwnerBadge"),
  
  VALIDATOR_OWNER_BADGE("ValidatorOwnerBadge"),
  
  SECP256K1_SIGNATURE_RESOURCE("Secp256k1SignatureResource"),
  
  ED25519_SIGNATURE_RESOURCE("Ed25519SignatureResource"),
  
  GLOBAL_CALLER_RESOURCE("GlobalCallerResource"),
  
  PACKAGE_OF_DIRECT_CALLER_RESOURCE("PackageOfDirectCallerResource"),
  
  SYSTEM_EXECUTION_RESOURCE("SystemExecutionResource"),
  
  VALIDATOR_LIQUID_STAKE_UNIT("ValidatorLiquidStakeUnit"),
  
  VALIDATOR_CLAIM_NFT("ValidatorClaimNft"),
  
  ONE_RESOURCE_POOL_UNIT("OneResourcePoolUnit"),
  
  TWO_RESOURCE_POOL_UNIT("TwoResourcePoolUnit"),
  
  MULTI_RESOURCE_POOL_UNIT("MultiResourcePoolUnit"),
  
  ACCESS_CONTROLLER_RECOVERY_BADGE("AccessControllerRecoveryBadge");

  private String value;

  NativeResourceKind(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NativeResourceKind fromValue(String value) {
    for (NativeResourceKind b : NativeResourceKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }
}

