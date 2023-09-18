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
import java.util.ArrayList;
import java.util.List;
import live.radix.gateway.model.StateKeyValueStoreDataResponseItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateKeyValueStoreDataResponseAllOf
 */
@JsonPropertyOrder({
  StateKeyValueStoreDataResponseAllOf.JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS,
  StateKeyValueStoreDataResponseAllOf.JSON_PROPERTY_ENTRIES
})
@JsonTypeName("StateKeyValueStoreDataResponse_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class StateKeyValueStoreDataResponseAllOf {
  public static final String JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS = "key_value_store_address";
  private String keyValueStoreAddress;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<StateKeyValueStoreDataResponseItem> entries = new ArrayList<>();

  public StateKeyValueStoreDataResponseAllOf() {
  }

  public StateKeyValueStoreDataResponseAllOf keyValueStoreAddress(String keyValueStoreAddress) {
    
    this.keyValueStoreAddress = keyValueStoreAddress;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the address.
   * @return keyValueStoreAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKeyValueStoreAddress() {
    return keyValueStoreAddress;
  }


  @JsonProperty(JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyValueStoreAddress(String keyValueStoreAddress) {
    this.keyValueStoreAddress = keyValueStoreAddress;
  }


  public StateKeyValueStoreDataResponseAllOf entries(List<StateKeyValueStoreDataResponseItem> entries) {
    
    this.entries = entries;
    return this;
  }

  public StateKeyValueStoreDataResponseAllOf addEntriesItem(StateKeyValueStoreDataResponseItem entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StateKeyValueStoreDataResponseItem> getEntries() {
    return entries;
  }


  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntries(List<StateKeyValueStoreDataResponseItem> entries) {
    this.entries = entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateKeyValueStoreDataResponseAllOf stateKeyValueStoreDataResponseAllOf = (StateKeyValueStoreDataResponseAllOf) o;
    return Objects.equals(this.keyValueStoreAddress, stateKeyValueStoreDataResponseAllOf.keyValueStoreAddress) &&
        Objects.equals(this.entries, stateKeyValueStoreDataResponseAllOf.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyValueStoreAddress, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateKeyValueStoreDataResponseAllOf {\n");
    sb.append("    keyValueStoreAddress: ").append(toIndentedString(keyValueStoreAddress)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

    // add `key_value_store_address` to the URL query string
    if (getKeyValueStoreAddress() != null) {
      try {
        joiner.add(String.format("%skey_value_store_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeyValueStoreAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entries` to the URL query string
    if (getEntries() != null) {
      for (int i = 0; i < getEntries().size(); i++) {
        if (getEntries().get(i) != null) {
          joiner.add(getEntries().get(i).toUrlQueryString(String.format("%sentries%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

