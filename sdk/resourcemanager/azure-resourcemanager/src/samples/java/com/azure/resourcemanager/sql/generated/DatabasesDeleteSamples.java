// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for Databases Delete. */
public final class DatabasesDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-10-01-preview/examples/DeleteDatabase.json
     */
    /**
     * Sample code: Deletes a database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletesADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .delete("Default-SQL-SouthEastAsia", "testsvr", "testdb", Context.NONE);
    }
}
