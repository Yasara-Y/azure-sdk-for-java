// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.EnvironmentContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentContainerDataInner;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainerData;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainers;
import com.azure.resourcemanager.machinelearning.models.ListViewType;

public final class EnvironmentContainersImpl implements EnvironmentContainers {
    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentContainersImpl.class);

    private final EnvironmentContainersClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public EnvironmentContainersImpl(
        EnvironmentContainersClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EnvironmentContainerData> list(String resourceGroupName, String workspaceName) {
        PagedIterable<EnvironmentContainerDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new EnvironmentContainerDataImpl(inner1, this.manager()));
    }

    public PagedIterable<EnvironmentContainerData> list(
        String resourceGroupName, String workspaceName, String skip, ListViewType listViewType, Context context) {
        PagedIterable<EnvironmentContainerDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, skip, listViewType, context);
        return Utils.mapPage(inner, inner1 -> new EnvironmentContainerDataImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String name) {
        this.serviceClient().delete(resourceGroupName, workspaceName, name);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, name, context);
    }

    public EnvironmentContainerData get(String resourceGroupName, String workspaceName, String name) {
        EnvironmentContainerDataInner inner = this.serviceClient().get(resourceGroupName, workspaceName, name);
        if (inner != null) {
            return new EnvironmentContainerDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EnvironmentContainerData> getWithResponse(
        String resourceGroupName, String workspaceName, String name, Context context) {
        Response<EnvironmentContainerDataInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EnvironmentContainerDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EnvironmentContainerData getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, name, Context.NONE).getValue();
    }

    public Response<EnvironmentContainerData> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, name, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, name, context);
    }

    private EnvironmentContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public EnvironmentContainerDataImpl define(String name) {
        return new EnvironmentContainerDataImpl(name, this.manager());
    }
}
