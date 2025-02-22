// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a notebook workspace resource. */
@Immutable
public final class NotebookWorkspaceProperties {
    /*
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "notebookServerEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String notebookServerEndpoint;

    /*
     * Status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

    /**
     * Get the status property: Status of the notebook workspace. Possible values are: Creating, Online, Deleting,
     * Failed, Updating.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
