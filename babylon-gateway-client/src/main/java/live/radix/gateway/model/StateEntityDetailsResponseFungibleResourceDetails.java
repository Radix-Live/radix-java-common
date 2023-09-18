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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.gateway.model.ComponentEntityRoleAssignments;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetails;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetailsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateEntityDetailsResponseFungibleResourceDetails
 */
@JsonPropertyOrder({
  StateEntityDetailsResponseFungibleResourceDetails.JSON_PROPERTY_ROLE_ASSIGNMENTS,
  StateEntityDetailsResponseFungibleResourceDetails.JSON_PROPERTY_DIVISIBILITY,
  StateEntityDetailsResponseFungibleResourceDetails.JSON_PROPERTY_TOTAL_SUPPLY,
  StateEntityDetailsResponseFungibleResourceDetails.JSON_PROPERTY_TOTAL_MINTED,
  StateEntityDetailsResponseFungibleResourceDetails.JSON_PROPERTY_TOTAL_BURNED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class StateEntityDetailsResponseFungibleResourceDetails extends StateEntityDetailsResponseItemDetails {
  public static final String JSON_PROPERTY_ROLE_ASSIGNMENTS = "role_assignments";
  private ComponentEntityRoleAssignments roleAssignments;

  public static final String JSON_PROPERTY_DIVISIBILITY = "divisibility";
  private Integer divisibility;

  public static final String JSON_PROPERTY_TOTAL_SUPPLY = "total_supply";
  private String totalSupply;

  public static final String JSON_PROPERTY_TOTAL_MINTED = "total_minted";
  private String totalMinted;

  public static final String JSON_PROPERTY_TOTAL_BURNED = "total_burned";
  private String totalBurned;

  public StateEntityDetailsResponseFungibleResourceDetails() {

  }

  public StateEntityDetailsResponseFungibleResourceDetails roleAssignments(ComponentEntityRoleAssignments roleAssignments) {
    
    this.roleAssignments = roleAssignments;
    return this;
  }

   /**
   * Get roleAssignments
   * @return roleAssignments
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ComponentEntityRoleAssignments getRoleAssignments() {
    return roleAssignments;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleAssignments(ComponentEntityRoleAssignments roleAssignments) {
    this.roleAssignments = roleAssignments;
  }


  public StateEntityDetailsResponseFungibleResourceDetails divisibility(Integer divisibility) {
    
    this.divisibility = divisibility;
    return this;
  }

   /**
   * Get divisibility
   * minimum: 0
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


  public StateEntityDetailsResponseFungibleResourceDetails totalSupply(String totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return totalSupply
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalSupply() {
    return totalSupply;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  public StateEntityDetailsResponseFungibleResourceDetails totalMinted(String totalMinted) {
    
    this.totalMinted = totalMinted;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return totalMinted
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_MINTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalMinted() {
    return totalMinted;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_MINTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalMinted(String totalMinted) {
    this.totalMinted = totalMinted;
  }


  public StateEntityDetailsResponseFungibleResourceDetails totalBurned(String totalBurned) {
    
    this.totalBurned = totalBurned;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return totalBurned
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_BURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalBurned() {
    return totalBurned;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_BURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalBurned(String totalBurned) {
    this.totalBurned = totalBurned;
  }

  @Override
  public StateEntityDetailsResponseFungibleResourceDetails type(StateEntityDetailsResponseItemDetailsType type) {
    this.setType(type);
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
    StateEntityDetailsResponseFungibleResourceDetails stateEntityDetailsResponseFungibleResourceDetails = (StateEntityDetailsResponseFungibleResourceDetails) o;
    return Objects.equals(this.roleAssignments, stateEntityDetailsResponseFungibleResourceDetails.roleAssignments) &&
        Objects.equals(this.divisibility, stateEntityDetailsResponseFungibleResourceDetails.divisibility) &&
        Objects.equals(this.totalSupply, stateEntityDetailsResponseFungibleResourceDetails.totalSupply) &&
        Objects.equals(this.totalMinted, stateEntityDetailsResponseFungibleResourceDetails.totalMinted) &&
        Objects.equals(this.totalBurned, stateEntityDetailsResponseFungibleResourceDetails.totalBurned) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleAssignments, divisibility, totalSupply, totalMinted, totalBurned, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityDetailsResponseFungibleResourceDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    roleAssignments: ").append(toIndentedString(roleAssignments)).append("\n");
    sb.append("    divisibility: ").append(toIndentedString(divisibility)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    totalMinted: ").append(toIndentedString(totalMinted)).append("\n");
    sb.append("    totalBurned: ").append(toIndentedString(totalBurned)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `role_assignments` to the URL query string
    if (getRoleAssignments() != null) {
      joiner.add(getRoleAssignments().toUrlQueryString(prefix + "role_assignments" + suffix));
    }

    // add `divisibility` to the URL query string
    if (getDivisibility() != null) {
      try {
        joiner.add(String.format("%sdivisibility%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDivisibility()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_supply` to the URL query string
    if (getTotalSupply() != null) {
      try {
        joiner.add(String.format("%stotal_supply%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalSupply()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_minted` to the URL query string
    if (getTotalMinted() != null) {
      try {
        joiner.add(String.format("%stotal_minted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalMinted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_burned` to the URL query string
    if (getTotalBurned() != null) {
      try {
        joiner.add(String.format("%stotal_burned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalBurned()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

