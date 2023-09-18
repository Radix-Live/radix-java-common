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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ValidatorVaultItem
 */
@JsonPropertyOrder({
  ValidatorVaultItem.JSON_PROPERTY_BALANCE,
  ValidatorVaultItem.JSON_PROPERTY_LAST_CHANGED_AT_STATE_VERSION,
  ValidatorVaultItem.JSON_PROPERTY_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class ValidatorVaultItem {
  public static final String JSON_PROPERTY_BALANCE = "balance";
  private String balance;

  public static final String JSON_PROPERTY_LAST_CHANGED_AT_STATE_VERSION = "last_changed_at_state_version";
  private Long lastChangedAtStateVersion;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public ValidatorVaultItem() {
  }

  public ValidatorVaultItem balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return balance
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(String balance) {
    this.balance = balance;
  }


  public ValidatorVaultItem lastChangedAtStateVersion(Long lastChangedAtStateVersion) {
    
    this.lastChangedAtStateVersion = lastChangedAtStateVersion;
    return this;
  }

   /**
   * Get lastChangedAtStateVersion
   * @return lastChangedAtStateVersion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_CHANGED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastChangedAtStateVersion() {
    return lastChangedAtStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_LAST_CHANGED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastChangedAtStateVersion(Long lastChangedAtStateVersion) {
    this.lastChangedAtStateVersion = lastChangedAtStateVersion;
  }


  public ValidatorVaultItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the address.
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorVaultItem validatorVaultItem = (ValidatorVaultItem) o;
    return Objects.equals(this.balance, validatorVaultItem.balance) &&
        Objects.equals(this.lastChangedAtStateVersion, validatorVaultItem.lastChangedAtStateVersion) &&
        Objects.equals(this.address, validatorVaultItem.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, lastChangedAtStateVersion, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorVaultItem {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    lastChangedAtStateVersion: ").append(toIndentedString(lastChangedAtStateVersion)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `balance` to the URL query string
    if (getBalance() != null) {
      try {
        joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_changed_at_state_version` to the URL query string
    if (getLastChangedAtStateVersion() != null) {
      try {
        joiner.add(String.format("%slast_changed_at_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastChangedAtStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
