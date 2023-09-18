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
import live.radix.gateway.model.EntityMetadataItemValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Entity metadata key-value pair.
 */
@JsonPropertyOrder({
  EntityMetadataItem.JSON_PROPERTY_KEY,
  EntityMetadataItem.JSON_PROPERTY_VALUE,
  EntityMetadataItem.JSON_PROPERTY_IS_LOCKED,
  EntityMetadataItem.JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class EntityMetadataItem {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUE = "value";
  private EntityMetadataItemValue value;

  public static final String JSON_PROPERTY_IS_LOCKED = "is_locked";
  private Boolean isLocked;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION = "last_updated_at_state_version";
  private Long lastUpdatedAtStateVersion;

  public EntityMetadataItem() {
  }

  public EntityMetadataItem key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Entity metadata key.
   * @return key
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public EntityMetadataItem value(EntityMetadataItemValue value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityMetadataItemValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(EntityMetadataItemValue value) {
    this.value = value;
  }


  public EntityMetadataItem isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public EntityMetadataItem lastUpdatedAtStateVersion(Long lastUpdatedAtStateVersion) {
    
    this.lastUpdatedAtStateVersion = lastUpdatedAtStateVersion;
    return this;
  }

   /**
   * TBD
   * @return lastUpdatedAtStateVersion
  **/
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMetadataItem entityMetadataItem = (EntityMetadataItem) o;
    return Objects.equals(this.key, entityMetadataItem.key) &&
        Objects.equals(this.value, entityMetadataItem.value) &&
        Objects.equals(this.isLocked, entityMetadataItem.isLocked) &&
        Objects.equals(this.lastUpdatedAtStateVersion, entityMetadataItem.lastUpdatedAtStateVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, isLocked, lastUpdatedAtStateVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMetadataItem {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(getValue().toUrlQueryString(prefix + "value" + suffix));
    }

    // add `is_locked` to the URL query string
    if (isIsLocked() != null) {
      try {
        joiner.add(String.format("%sis_locked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsLocked()), "UTF-8").replaceAll("\\+", "%20")));
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
