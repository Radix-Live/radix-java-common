/*
 * Babylon Core API - RCnet v3.1
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  It is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  This version of the Core API belongs to the fourth release candidate of the Radix Babylon network (\"RCnet v3.1\").  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` are guaranteed to be forward compatible to Babylon mainnet launch (and beyond). We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code. 
 *
 * The version of the OpenAPI document: 0.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.core.model;

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
 * FungibleResourceManagerFieldDivisibilityValue
 */
@JsonPropertyOrder({
  FungibleResourceManagerFieldDivisibilityValue.JSON_PROPERTY_DIVISIBILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class FungibleResourceManagerFieldDivisibilityValue {
  public static final String JSON_PROPERTY_DIVISIBILITY = "divisibility";
  private Integer divisibility;

  public FungibleResourceManagerFieldDivisibilityValue() {
  }

  public FungibleResourceManagerFieldDivisibilityValue divisibility(Integer divisibility) {
    
    this.divisibility = divisibility;
    return this;
  }

   /**
   * Get divisibility
   * minimum: 0
   * maximum: 18
   * @return divisibility
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIVISIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDivisibility() {
    return divisibility;
  }


  @JsonProperty(JSON_PROPERTY_DIVISIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDivisibility(Integer divisibility) {
    this.divisibility = divisibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FungibleResourceManagerFieldDivisibilityValue fungibleResourceManagerFieldDivisibilityValue = (FungibleResourceManagerFieldDivisibilityValue) o;
    return Objects.equals(this.divisibility, fungibleResourceManagerFieldDivisibilityValue.divisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FungibleResourceManagerFieldDivisibilityValue {\n");
    sb.append("    divisibility: ").append(toIndentedString(divisibility)).append("\n");
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

    // add `divisibility` to the URL query string
    if (getDivisibility() != null) {
      try {
        joiner.add(String.format("%sdivisibility%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDivisibility()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

