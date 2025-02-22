// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual Machine image for Windows AML Compute. */
@Fluent
public final class VirtualMachineImage {
    /*
     * Virtual Machine image path
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Virtual Machine image path.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Virtual Machine image path.
     *
     * @param id the id value to set.
     * @return the VirtualMachineImage object itself.
     */
    public VirtualMachineImage withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model VirtualMachineImage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineImage.class);
}
