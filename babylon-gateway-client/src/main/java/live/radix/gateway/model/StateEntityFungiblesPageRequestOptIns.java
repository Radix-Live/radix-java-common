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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateEntityFungiblesPageRequestOptIns
 */
@JsonPropertyOrder({
  StateEntityFungiblesPageRequestOptIns.JSON_PROPERTY_EXPLICIT_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class StateEntityFungiblesPageRequestOptIns {
  public static final String JSON_PROPERTY_EXPLICIT_METADATA = "explicit_metadata";
  private List<String> explicitMetadata;

  public StateEntityFungiblesPageRequestOptIns() {
  }

  public StateEntityFungiblesPageRequestOptIns explicitMetadata(List<String> explicitMetadata) {
    
    this.explicitMetadata = explicitMetadata;
    return this;
  }

  public StateEntityFungiblesPageRequestOptIns addExplicitMetadataItem(String explicitMetadataItem) {
    if (this.explicitMetadata == null) {
      this.explicitMetadata = new ArrayList<>();
    }
    this.explicitMetadata.add(explicitMetadataItem);
    return this;
  }

   /**
   * Get explicitMetadata
   * @return explicitMetadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLICIT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExplicitMetadata() {
    return explicitMetadata;
  }


  @JsonProperty(JSON_PROPERTY_EXPLICIT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplicitMetadata(List<String> explicitMetadata) {
    this.explicitMetadata = explicitMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateEntityFungiblesPageRequestOptIns stateEntityFungiblesPageRequestOptIns = (StateEntityFungiblesPageRequestOptIns) o;
    return Objects.equals(this.explicitMetadata, stateEntityFungiblesPageRequestOptIns.explicitMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explicitMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityFungiblesPageRequestOptIns {\n");
    sb.append("    explicitMetadata: ").append(toIndentedString(explicitMetadata)).append("\n");
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

    // add `explicit_metadata` to the URL query string
    if (getExplicitMetadata() != null) {
      for (int i = 0; i < getExplicitMetadata().size(); i++) {
        try {
          joiner.add(String.format("%sexplicit_metadata%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExplicitMetadata().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

