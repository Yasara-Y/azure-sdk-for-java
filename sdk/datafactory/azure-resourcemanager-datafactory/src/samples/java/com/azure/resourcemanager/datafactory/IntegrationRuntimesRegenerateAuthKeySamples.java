// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeAuthKeyName;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeRegenerateKeyParameters;

/** Samples for IntegrationRuntimes RegenerateAuthKey. */
public final class IntegrationRuntimesRegenerateAuthKeySamples {
    /**
     * Sample code: IntegrationRuntimes_RegenerateAuthKey.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void integrationRuntimesRegenerateAuthKey(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .integrationRuntimes()
            .regenerateAuthKeyWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleIntegrationRuntime",
                new IntegrationRuntimeRegenerateKeyParameters().withKeyName(IntegrationRuntimeAuthKeyName.AUTH_KEY2),
                Context.NONE);
    }
}