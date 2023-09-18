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
import live.radix.gateway.model.RoleAssignmentResolution;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ComponentEntityRoleAssignmentEntryAssignment
 */
@JsonPropertyOrder({
  ComponentEntityRoleAssignmentEntryAssignment.JSON_PROPERTY_RESOLUTION,
  ComponentEntityRoleAssignmentEntryAssignment.JSON_PROPERTY_EXPLICIT_RULE
})
@JsonTypeName("ComponentEntityRoleAssignmentEntry_assignment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class ComponentEntityRoleAssignmentEntryAssignment {
  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private RoleAssignmentResolution resolution;

  public static final String JSON_PROPERTY_EXPLICIT_RULE = "explicit_rule";
  private Object explicitRule;

  public ComponentEntityRoleAssignmentEntryAssignment() {
  }

  public ComponentEntityRoleAssignmentEntryAssignment resolution(RoleAssignmentResolution resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleAssignmentResolution getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResolution(RoleAssignmentResolution resolution) {
    this.resolution = resolution;
  }


  public ComponentEntityRoleAssignmentEntryAssignment explicitRule(Object explicitRule) {
    
    this.explicitRule = explicitRule;
    return this;
  }

   /**
   * Get explicitRule
   * @return explicitRule
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLICIT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExplicitRule() {
    return explicitRule;
  }


  @JsonProperty(JSON_PROPERTY_EXPLICIT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplicitRule(Object explicitRule) {
    this.explicitRule = explicitRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentEntityRoleAssignmentEntryAssignment componentEntityRoleAssignmentEntryAssignment = (ComponentEntityRoleAssignmentEntryAssignment) o;
    return Objects.equals(this.resolution, componentEntityRoleAssignmentEntryAssignment.resolution) &&
        Objects.equals(this.explicitRule, componentEntityRoleAssignmentEntryAssignment.explicitRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, explicitRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentEntityRoleAssignmentEntryAssignment {\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    explicitRule: ").append(toIndentedString(explicitRule)).append("\n");
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

    // add `resolution` to the URL query string
    if (getResolution() != null) {
      try {
        joiner.add(String.format("%sresolution%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResolution()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `explicit_rule` to the URL query string
    if (getExplicitRule() != null) {
      try {
        joiner.add(String.format("%sexplicit_rule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExplicitRule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

