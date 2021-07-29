// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntimeRequest;

/** Samples for IntegrationRuntimes RemoveLinks. */
public final class IntegrationRuntimesRemoveLinksSamples {
    /**
     * Sample code: IntegrationRuntimes_Upgrade.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void integrationRuntimesUpgrade(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .integrationRuntimes()
            .removeLinksWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleIntegrationRuntime",
                new LinkedIntegrationRuntimeRequest().withLinkedFactoryName("exampleFactoryName-linked"),
                Context.NONE);
    }
}