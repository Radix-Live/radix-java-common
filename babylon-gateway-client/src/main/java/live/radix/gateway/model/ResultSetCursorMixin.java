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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ResultSetCursorMixin
 */
@JsonPropertyOrder({
  ResultSetCursorMixin.JSON_PROPERTY_TOTAL_COUNT,
  ResultSetCursorMixin.JSON_PROPERTY_NEXT_CURSOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class ResultSetCursorMixin {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private JsonNullable<Long> totalCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private JsonNullable<String> nextCursor = JsonNullable.<String>undefined();

  public ResultSetCursorMixin() {
  }

  public ResultSetCursorMixin totalCount(Long totalCount) {
    this.totalCount = JsonNullable.<Long>of(totalCount);
    
    return this;
  }

   /**
   * Total number of items in underlying collection, fragment of which is available in &#x60;items&#x60; collection.
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getTotalCount() {
        return totalCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getTotalCount_JsonNullable() {
    return totalCount;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  public void setTotalCount_JsonNullable(JsonNullable<Long> totalCount) {
    this.totalCount = totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = JsonNullable.<Long>of(totalCount);
  }


  public ResultSetCursorMixin nextCursor(String nextCursor) {
    this.nextCursor = JsonNullable.<String>of(nextCursor);
    
    return this;
  }

   /**
   * If specified, contains a cursor to query next page of the &#x60;items&#x60; collection.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getNextCursor() {
        return nextCursor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNextCursor_JsonNullable() {
    return nextCursor;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  public void setNextCursor_JsonNullable(JsonNullable<String> nextCursor) {
    this.nextCursor = nextCursor;
  }

  public void setNextCursor(String nextCursor) {
    this.nextCursor = JsonNullable.<String>of(nextCursor);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSetCursorMixin resultSetCursorMixin = (ResultSetCursorMixin) o;
    return equalsNullable(this.totalCount, resultSetCursorMixin.totalCount) &&
        equalsNullable(this.nextCursor, resultSetCursorMixin.nextCursor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(totalCount), hashCodeNullable(nextCursor));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSetCursorMixin {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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

    // add `total_count` to the URL query string
    if (getTotalCount() != null) {
      try {
        joiner.add(String.format("%stotal_count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `next_cursor` to the URL query string
    if (getNextCursor() != null) {
      try {
        joiner.add(String.format("%snext_cursor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextCursor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

