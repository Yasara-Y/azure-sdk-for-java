// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Online deployment scaling configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "scaleType",
    defaultImpl = OnlineScaleSettings.class)
@JsonTypeName("OnlineScaleSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Default", value = DefaultScaleSettings.class),
    @JsonSubTypes.Type(name = "TargetUtilization", value = TargetUtilizationScaleSettings.class)
})
@Immutable
public class OnlineScaleSettings {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
