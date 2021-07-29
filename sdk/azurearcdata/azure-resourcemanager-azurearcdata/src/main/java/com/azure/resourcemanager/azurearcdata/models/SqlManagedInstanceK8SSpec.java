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

/** The kubernetes spec information. */
@Fluent
public final class SqlManagedInstanceK8SSpec {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlManagedInstanceK8SSpec.class);

    /*
     * The kubernetes scheduling information.
     */
    @JsonProperty(value = "scheduling")
    private K8SScheduling scheduling;

    /*
     * This option specifies the number of SQL Managed Instance replicas that
     * will be deployed in your Kubernetes cluster for high availability
     * purposes. If sku.tier is BusinessCritical, allowed values are '2' or '3'
     * with default of '3'. If sku.tier is GeneralPurpose, replicas must be
     * '1'.
     */
    @JsonProperty(value = "replicas")
    private Integer replicas;

    /*
     * The kubernetes spec information.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the scheduling property: The kubernetes scheduling information.
     *
     * @return the scheduling value.
     */
    public K8SScheduling scheduling() {
        return this.scheduling;
    }

    /**
     * Set the scheduling property: The kubernetes scheduling information.
     *
     * @param scheduling the scheduling value to set.
     * @return the SqlManagedInstanceK8SSpec object itself.
     */
    public SqlManagedInstanceK8SSpec withScheduling(K8SScheduling scheduling) {
        this.scheduling = scheduling;
        return this;
    }

    /**
     * Get the replicas property: This option specifies the number of SQL Managed Instance replicas that will be
     * deployed in your Kubernetes cluster for high availability purposes. If sku.tier is BusinessCritical, allowed
     * values are '2' or '3' with default of '3'. If sku.tier is GeneralPurpose, replicas must be '1'.
     *
     * @return the replicas value.
     */
    public Integer replicas() {
        return this.replicas;
    }

    /**
     * Set the replicas property: This option specifies the number of SQL Managed Instance replicas that will be
     * deployed in your Kubernetes cluster for high availability purposes. If sku.tier is BusinessCritical, allowed
     * values are '2' or '3' with default of '3'. If sku.tier is GeneralPurpose, replicas must be '1'.
     *
     * @param replicas the replicas value to set.
     * @return the SqlManagedInstanceK8SSpec object itself.
     */
    public SqlManagedInstanceK8SSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * Get the additionalProperties property: The kubernetes spec information.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The kubernetes spec information.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SqlManagedInstanceK8SSpec object itself.
     */
    public SqlManagedInstanceK8SSpec withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (scheduling() != null) {
            scheduling().validate();
        }
    }
}