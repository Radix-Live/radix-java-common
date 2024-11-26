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


package live.radix.gateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.gateway.model.EntityMetadataCollection;
import live.radix.gateway.model.NonFungibleResourcesCollectionItem;
import live.radix.gateway.model.ResourceAggregationLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * NonFungibleResourcesCollectionItemGloballyAggregated
 */
@JsonPropertyOrder({
  NonFungibleResourcesCollectionItemGloballyAggregated.JSON_PROPERTY_AMOUNT,
  NonFungibleResourcesCollectionItemGloballyAggregated.JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
@JsonIgnoreProperties(
  value = "aggregation_level", // ignore manually set aggregation_level, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the aggregation_level to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "aggregation_level", visible = true)

public class NonFungibleResourcesCollectionItemGloballyAggregated extends NonFungibleResourcesCollectionItem {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION = "last_updated_at_state_version";
  private Long lastUpdatedAtStateVersion;

  public NonFungibleResourcesCollectionItemGloballyAggregated() {

  }

  public NonFungibleResourcesCollectionItemGloballyAggregated amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * The total amount of non-fungible IDs across all vaults.
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public NonFungibleResourcesCollectionItemGloballyAggregated lastUpdatedAtStateVersion(Long lastUpdatedAtStateVersion) {
    
    this.lastUpdatedAtStateVersion = lastUpdatedAtStateVersion;
    return this;
  }

  /**
   * The most recent state version underlying object was modified at.
   * minimum: 1
   * maximum: 100000000000000
   * @return lastUpdatedAtStateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastUpdatedAtStateVersion() {
    return lastUpdatedAtStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastUpdatedAtStateVersion(Long lastUpdatedAtStateVersion) {
    this.lastUpdatedAtStateVersion = lastUpdatedAtStateVersion;
  }

  @Override
  public NonFungibleResourcesCollectionItemGloballyAggregated aggregationLevel(ResourceAggregationLevel aggregationLevel) {
    this.setAggregationLevel(aggregationLevel);
    return this;
  }

  @Override
  public NonFungibleResourcesCollectionItemGloballyAggregated resourceAddress(String resourceAddress) {
    this.setResourceAddress(resourceAddress);
    return this;
  }

  @Override
  public NonFungibleResourcesCollectionItemGloballyAggregated explicitMetadata(EntityMetadataCollection explicitMetadata) {
    this.setExplicitMetadata(explicitMetadata);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonFungibleResourcesCollectionItemGloballyAggregated nonFungibleResourcesCollectionItemGloballyAggregated = (NonFungibleResourcesCollectionItemGloballyAggregated) o;
    return Objects.equals(this.amount, nonFungibleResourcesCollectionItemGloballyAggregated.amount) &&
        Objects.equals(this.lastUpdatedAtStateVersion, nonFungibleResourcesCollectionItemGloballyAggregated.lastUpdatedAtStateVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, lastUpdatedAtStateVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonFungibleResourcesCollectionItemGloballyAggregated {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lastUpdatedAtStateVersion: ").append(toIndentedString(lastUpdatedAtStateVersion)).append("\n");
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

    // add `aggregation_level` to the URL query string
    if (getAggregationLevel() != null) {
      try {
        joiner.add(String.format("%saggregation_level%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAggregationLevel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resource_address` to the URL query string
    if (getResourceAddress() != null) {
      try {
        joiner.add(String.format("%sresource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `explicit_metadata` to the URL query string
    if (getExplicitMetadata() != null) {
      joiner.add(getExplicitMetadata().toUrlQueryString(prefix + "explicit_metadata" + suffix));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_updated_at_state_version` to the URL query string
    if (getLastUpdatedAtStateVersion() != null) {
      try {
        joiner.add(String.format("%slast_updated_at_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastUpdatedAtStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

