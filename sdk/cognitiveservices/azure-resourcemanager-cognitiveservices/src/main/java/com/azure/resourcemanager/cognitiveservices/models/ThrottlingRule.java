// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ThrottlingRule model. */
@Fluent
public final class ThrottlingRule {
    /*
     * The key property.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * The renewalPeriod property.
     */
    @JsonProperty(value = "renewalPeriod")
    private Float renewalPeriod;

    /*
     * The count property.
     */
    @JsonProperty(value = "count")
    private Float count;

    /*
     * The minCount property.
     */
    @JsonProperty(value = "minCount")
    private Float minCount;

    /*
     * The dynamicThrottlingEnabled property.
     */
    @JsonProperty(value = "dynamicThrottlingEnabled")
    private Boolean dynamicThrottlingEnabled;

    /*
     * The matchPatterns property.
     */
    @JsonProperty(value = "matchPatterns")
    private List<RequestMatchPattern> matchPatterns;

    /**
     * Get the key property: The key property.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The key property.
     *
     * @param key the key value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the renewalPeriod property: The renewalPeriod property.
     *
     * @return the renewalPeriod value.
     */
    public Float renewalPeriod() {
        return this.renewalPeriod;
    }

    /**
     * Set the renewalPeriod property: The renewalPeriod property.
     *
     * @param renewalPeriod the renewalPeriod value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withRenewalPeriod(Float renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
        return this;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    public Float count() {
        return this.count;
    }

    /**
     * Set the count property: The count property.
     *
     * @param count the count value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withCount(Float count) {
        this.count = count;
        return this;
    }

    /**
     * Get the minCount property: The minCount property.
     *
     * @return the minCount value.
     */
    public Float minCount() {
        return this.minCount;
    }

    /**
     * Set the minCount property: The minCount property.
     *
     * @param minCount the minCount value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withMinCount(Float minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the dynamicThrottlingEnabled property: The dynamicThrottlingEnabled property.
     *
     * @return the dynamicThrottlingEnabled value.
     */
    public Boolean dynamicThrottlingEnabled() {
        return this.dynamicThrottlingEnabled;
    }

    /**
     * Set the dynamicThrottlingEnabled property: The dynamicThrottlingEnabled property.
     *
     * @param dynamicThrottlingEnabled the dynamicThrottlingEnabled value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withDynamicThrottlingEnabled(Boolean dynamicThrottlingEnabled) {
        this.dynamicThrottlingEnabled = dynamicThrottlingEnabled;
        return this;
    }

    /**
     * Get the matchPatterns property: The matchPatterns property.
     *
     * @return the matchPatterns value.
     */
    public List<RequestMatchPattern> matchPatterns() {
        return this.matchPatterns;
    }

    /**
     * Set the matchPatterns property: The matchPatterns property.
     *
     * @param matchPatterns the matchPatterns value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withMatchPatterns(List<RequestMatchPattern> matchPatterns) {
        this.matchPatterns = matchPatterns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchPatterns() != null) {
            matchPatterns().forEach(e -> e.validate());
        }
    }
}
