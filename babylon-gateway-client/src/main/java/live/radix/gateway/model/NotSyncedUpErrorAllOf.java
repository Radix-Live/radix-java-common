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
 * NotSyncedUpErrorAllOf
 */
@JsonPropertyOrder({
  NotSyncedUpErrorAllOf.JSON_PROPERTY_REQUEST_TYPE,
  NotSyncedUpErrorAllOf.JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS,
  NotSyncedUpErrorAllOf.JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS
})
@JsonTypeName("NotSyncedUpError_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class NotSyncedUpErrorAllOf {
  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private String requestType;

  public static final String JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS = "current_sync_delay_seconds";
  private Long currentSyncDelaySeconds;

  public static final String JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS = "max_allowed_sync_delay_seconds";
  private Long maxAllowedSyncDelaySeconds;

  public NotSyncedUpErrorAllOf() {
  }

  public NotSyncedUpErrorAllOf requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * The request type that triggered this exception.
   * @return requestType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestType() {
    return requestType;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public NotSyncedUpErrorAllOf currentSyncDelaySeconds(Long currentSyncDelaySeconds) {
    
    this.currentSyncDelaySeconds = currentSyncDelaySeconds;
    return this;
  }

   /**
   * The current delay between the Gateway DB and the network ledger round timestamp.
   * @return currentSyncDelaySeconds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCurrentSyncDelaySeconds() {
    return currentSyncDelaySeconds;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentSyncDelaySeconds(Long currentSyncDelaySeconds) {
    this.currentSyncDelaySeconds = currentSyncDelaySeconds;
  }


  public NotSyncedUpErrorAllOf maxAllowedSyncDelaySeconds(Long maxAllowedSyncDelaySeconds) {
    
    this.maxAllowedSyncDelaySeconds = maxAllowedSyncDelaySeconds;
    return this;
  }

   /**
   * The maximum allowed delay between the Gateway DB and the network ledger round timestamp for this &#x60;request_type&#x60;.
   * @return maxAllowedSyncDelaySeconds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMaxAllowedSyncDelaySeconds() {
    return maxAllowedSyncDelaySeconds;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxAllowedSyncDelaySeconds(Long maxAllowedSyncDelaySeconds) {
    this.maxAllowedSyncDelaySeconds = maxAllowedSyncDelaySeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotSyncedUpErrorAllOf notSyncedUpErrorAllOf = (NotSyncedUpErrorAllOf) o;
    return Objects.equals(this.requestType, notSyncedUpErrorAllOf.requestType) &&
        Objects.equals(this.currentSyncDelaySeconds, notSyncedUpErrorAllOf.currentSyncDelaySeconds) &&
        Objects.equals(this.maxAllowedSyncDelaySeconds, notSyncedUpErrorAllOf.maxAllowedSyncDelaySeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, currentSyncDelaySeconds, maxAllowedSyncDelaySeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotSyncedUpErrorAllOf {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    currentSyncDelaySeconds: ").append(toIndentedString(currentSyncDelaySeconds)).append("\n");
    sb.append("    maxAllowedSyncDelaySeconds: ").append(toIndentedString(maxAllowedSyncDelaySeconds)).append("\n");
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

    // add `request_type` to the URL query string
    if (getRequestType() != null) {
      try {
        joiner.add(String.format("%srequest_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `current_sync_delay_seconds` to the URL query string
    if (getCurrentSyncDelaySeconds() != null) {
      try {
        joiner.add(String.format("%scurrent_sync_delay_seconds%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrentSyncDelaySeconds()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_allowed_sync_delay_seconds` to the URL query string
    if (getMaxAllowedSyncDelaySeconds() != null) {
      try {
        joiner.add(String.format("%smax_allowed_sync_delay_seconds%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxAllowedSyncDelaySeconds()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

