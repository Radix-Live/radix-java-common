/*
 * Babylon Gateway API - RCnet V3
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers. For simple use cases, you can typically use the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs-babylon.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  We give no guarantees that other endpoints will not change before Babylon mainnet launch, although changes are expected to be minimal. 
 *
 * The version of the OpenAPI document: 0.5.0
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
 * Gets or Sets MetadataValueType
 */
public enum MetadataValueType {
  
  STRING("String"),
  
  BOOL("Bool"),
  
  U8("U8"),
  
  U32("U32"),
  
  U64("U64"),
  
  I32("I32"),
  
  I64("I64"),
  
  DECIMAL("Decimal"),
  
  GLOBALADDRESS("GlobalAddress"),
  
  PUBLICKEY("PublicKey"),
  
  NONFUNGIBLEGLOBALID("NonFungibleGlobalId"),
  
  NONFUNGIBLELOCALID("NonFungibleLocalId"),
  
  INSTANT("Instant"),
  
  URL("Url"),
  
  ORIGIN("Origin"),
  
  PUBLICKEYHASH("PublicKeyHash"),
  
  STRINGARRAY("StringArray"),
  
  BOOLARRAY("BoolArray"),
  
  U8ARRAY("U8Array"),
  
  U32ARRAY("U32Array"),
  
  U64ARRAY("U64Array"),
  
  I32ARRAY("I32Array"),
  
  I64ARRAY("I64Array"),
  
  DECIMALARRAY("DecimalArray"),
  
  GLOBALADDRESSARRAY("GlobalAddressArray"),
  
  PUBLICKEYARRAY("PublicKeyArray"),
  
  NONFUNGIBLEGLOBALIDARRAY("NonFungibleGlobalIdArray"),
  
  NONFUNGIBLELOCALIDARRAY("NonFungibleLocalIdArray"),
  
  INSTANTARRAY("InstantArray"),
  
  URLARRAY("UrlArray"),
  
  ORIGINARRAY("OriginArray"),
  
  PUBLICKEYHASHARRAY("PublicKeyHashArray");

  private String value;

  MetadataValueType(String value) {
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
  public static MetadataValueType fromValue(String value) {
    for (MetadataValueType b : MetadataValueType.values()) {
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

