// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for PolicySetDefinitions GetAtManagementGroup. */
public final class PolicySetDefinitionsGetAtManagementGroupSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/getPolicySetDefinitionAtManagementGroup.json
     */
    /**
     * Sample code: Retrieve a policy set definition at management group level.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveAPolicySetDefinitionAtManagementGroupLevel(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicySetDefinitions()
            .getAtManagementGroupWithResponse("CostManagement", "MyManagementGroup", Context.NONE);
    }
}
