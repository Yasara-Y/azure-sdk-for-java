// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CustomLabelClassificationResult model. */
@Fluent
public final class CustomLabelClassificationResult extends CustomResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<CustomLabelClassificationResultDocumentsItem> documents;

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<CustomLabelClassificationResultDocumentsItem> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the CustomLabelClassificationResult object itself.
     */
    public CustomLabelClassificationResult setDocuments(List<CustomLabelClassificationResultDocumentsItem> documents) {
        this.documents = documents;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomLabelClassificationResult setErrors(List<DocumentError> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomLabelClassificationResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomLabelClassificationResult setProjectName(String projectName) {
        super.setProjectName(projectName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomLabelClassificationResult setDeploymentName(String deploymentName) {
        super.setDeploymentName(deploymentName);
        return this;
    }
}
