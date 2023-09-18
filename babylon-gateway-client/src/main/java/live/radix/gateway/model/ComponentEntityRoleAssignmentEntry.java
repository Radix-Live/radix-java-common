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
import live.radix.gateway.model.ComponentEntityRoleAssignmentEntryAssignment;
import live.radix.gateway.model.RoleKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ComponentEntityRoleAssignmentEntry
 */
@JsonPropertyOrder({
  ComponentEntityRoleAssignmentEntry.JSON_PROPERTY_ROLE_KEY,
  ComponentEntityRoleAssignmentEntry.JSON_PROPERTY_ASSIGNMENT,
  ComponentEntityRoleAssignmentEntry.JSON_PROPERTY_UPDATER_ROLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class ComponentEntityRoleAssignmentEntry {
  public static final String JSON_PROPERTY_ROLE_KEY = "role_key";
  private RoleKey roleKey;

  public static final String JSON_PROPERTY_ASSIGNMENT = "assignment";
  private ComponentEntityRoleAssignmentEntryAssignment assignment;

  public static final String JSON_PROPERTY_UPDATER_ROLES = "updater_roles";
  private List<RoleKey> updaterRoles;

  public ComponentEntityRoleAssignmentEntry() {
  }

  public ComponentEntityRoleAssignmentEntry roleKey(RoleKey roleKey) {
    
    this.roleKey = roleKey;
    return this;
  }

   /**
   * Get roleKey
   * @return roleKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleKey getRoleKey() {
    return roleKey;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleKey(RoleKey roleKey) {
    this.roleKey = roleKey;
  }


  public ComponentEntityRoleAssignmentEntry assignment(ComponentEntityRoleAssignmentEntryAssignment assignment) {
    
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ComponentEntityRoleAssignmentEntryAssignment getAssignment() {
    return assignment;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignment(ComponentEntityRoleAssignmentEntryAssignment assignment) {
    this.assignment = assignment;
  }


  public ComponentEntityRoleAssignmentEntry updaterRoles(List<RoleKey> updaterRoles) {
    
    this.updaterRoles = updaterRoles;
    return this;
  }

  public ComponentEntityRoleAssignmentEntry addUpdaterRolesItem(RoleKey updaterRolesItem) {
    if (this.updaterRoles == null) {
      this.updaterRoles = new ArrayList<>();
    }
    this.updaterRoles.add(updaterRolesItem);
    return this;
  }

   /**
   * Get updaterRoles
   * @return updaterRoles
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATER_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RoleKey> getUpdaterRoles() {
    return updaterRoles;
  }


  @JsonProperty(JSON_PROPERTY_UPDATER_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdaterRoles(List<RoleKey> updaterRoles) {
    this.updaterRoles = updaterRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentEntityRoleAssignmentEntry componentEntityRoleAssignmentEntry = (ComponentEntityRoleAssignmentEntry) o;
    return Objects.equals(this.roleKey, componentEntityRoleAssignmentEntry.roleKey) &&
        Objects.equals(this.assignment, componentEntityRoleAssignmentEntry.assignment) &&
        Objects.equals(this.updaterRoles, componentEntityRoleAssignmentEntry.updaterRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleKey, assignment, updaterRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentEntityRoleAssignmentEntry {\n");
    sb.append("    roleKey: ").append(toIndentedString(roleKey)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    updaterRoles: ").append(toIndentedString(updaterRoles)).append("\n");
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

    // add `role_key` to the URL query string
    if (getRoleKey() != null) {
      joiner.add(getRoleKey().toUrlQueryString(prefix + "role_key" + suffix));
    }

    // add `assignment` to the URL query string
    if (getAssignment() != null) {
      joiner.add(getAssignment().toUrlQueryString(prefix + "assignment" + suffix));
    }

    // add `updater_roles` to the URL query string
    if (getUpdaterRoles() != null) {
      for (int i = 0; i < getUpdaterRoles().size(); i++) {
        if (getUpdaterRoles().get(i) != null) {
          joiner.add(getUpdaterRoles().get(i).toUrlQueryString(String.format("%supdater_roles%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

