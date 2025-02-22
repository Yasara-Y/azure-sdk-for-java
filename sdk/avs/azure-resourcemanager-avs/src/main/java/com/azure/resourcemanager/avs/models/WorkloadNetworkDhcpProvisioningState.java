// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state. */
public final class WorkloadNetworkDhcpProvisioningState
    extends ExpandableStringEnum<WorkloadNetworkDhcpProvisioningState> {
    /** Static value Succeeded for WorkloadNetworkDhcpProvisioningState. */
    public static final WorkloadNetworkDhcpProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for WorkloadNetworkDhcpProvisioningState. */
    public static final WorkloadNetworkDhcpProvisioningState FAILED = fromString("Failed");

    /** Static value Building for WorkloadNetworkDhcpProvisioningState. */
    public static final WorkloadNetworkDhcpProvisioningState BUILDING = fromString("Building");

    /** Static value Deleting for WorkloadNetworkDhcpProvisioningState. */
    public static final WorkloadNetworkDhcpProvisioningState DELETING = fromString("Deleting");

    /** Static value Updating for WorkloadNetworkDhcpProvisioningState. */
    public static final WorkloadNetworkDhcpProvisioningState UPDATING = fromString("Updating");

    /** Static value Canceled for WorkloadNetworkDhcpProvisioningState. */
    public static final WorkloadNetworkDhcpProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a WorkloadNetworkDhcpProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkloadNetworkDhcpProvisioningState.
     */
    @JsonCreator
    public static WorkloadNetworkDhcpProvisioningState fromString(String name) {
        return fromString(name, WorkloadNetworkDhcpProvisioningState.class);
    }

    /**
     * Gets known WorkloadNetworkDhcpProvisioningState values.
     *
     * @return known WorkloadNetworkDhcpProvisioningState values.
     */
    public static Collection<WorkloadNetworkDhcpProvisioningState> values() {
        return values(WorkloadNetworkDhcpProvisioningState.class);
    }
}
