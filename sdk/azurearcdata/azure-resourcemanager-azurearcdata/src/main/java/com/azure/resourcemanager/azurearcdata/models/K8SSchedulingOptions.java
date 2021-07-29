// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * The kubernetes scheduling options. It describes restrictions used to help Kubernetes select appropriate nodes to host
 * the database service.
 */
@Fluent
public final class K8SSchedulingOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(K8SSchedulingOptions.class);

    /*
     * The kubernetes resource limits and requests used to restrict or reserve
     * resource usage.
     */
    @JsonProperty(value = "resources")
    private K8SResourceRequirements resources;

    /*
     * The kubernetes scheduling options. It describes restrictions used to
     * help Kubernetes select appropriate nodes to host the database service
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the resources property: The kubernetes resource limits and requests used to restrict or reserve resource
     * usage.
     *
     * @return the resources value.
     */
    public K8SResourceRequirements resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The kubernetes resource limits and requests used to restrict or reserve resource
     * usage.
     *
     * @param resources the resources value to set.
     * @return the K8SSchedulingOptions object itself.
     */
    public K8SSchedulingOptions withResources(K8SResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the additionalProperties property: The kubernetes scheduling options. It describes restrictions used to help
     * Kubernetes select appropriate nodes to host the database service.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The kubernetes scheduling options. It describes restrictions used to help
     * Kubernetes select appropriate nodes to host the database service.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the K8SSchedulingOptions object itself.
     */
    public K8SSchedulingOptions withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resources() != null) {
            resources().validate();
        }
    }
}