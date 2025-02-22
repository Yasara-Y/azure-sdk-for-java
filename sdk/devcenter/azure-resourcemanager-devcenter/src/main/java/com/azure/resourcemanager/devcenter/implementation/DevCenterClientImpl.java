// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.devcenter.fluent.AttachedNetworksClient;
import com.azure.resourcemanager.devcenter.fluent.CatalogsClient;
import com.azure.resourcemanager.devcenter.fluent.DevBoxDefinitionsClient;
import com.azure.resourcemanager.devcenter.fluent.DevCenterClient;
import com.azure.resourcemanager.devcenter.fluent.DevCentersClient;
import com.azure.resourcemanager.devcenter.fluent.EnvironmentTypesClient;
import com.azure.resourcemanager.devcenter.fluent.GalleriesClient;
import com.azure.resourcemanager.devcenter.fluent.ImageVersionsClient;
import com.azure.resourcemanager.devcenter.fluent.ImagesClient;
import com.azure.resourcemanager.devcenter.fluent.NetworkConnectionsClient;
import com.azure.resourcemanager.devcenter.fluent.OperationStatusesClient;
import com.azure.resourcemanager.devcenter.fluent.OperationsClient;
import com.azure.resourcemanager.devcenter.fluent.PoolsClient;
import com.azure.resourcemanager.devcenter.fluent.ProjectAllowedEnvironmentTypesClient;
import com.azure.resourcemanager.devcenter.fluent.ProjectEnvironmentTypesClient;
import com.azure.resourcemanager.devcenter.fluent.ProjectsClient;
import com.azure.resourcemanager.devcenter.fluent.SchedulesClient;
import com.azure.resourcemanager.devcenter.fluent.SkusClient;
import com.azure.resourcemanager.devcenter.fluent.UsagesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the DevCenterClientImpl type. */
@ServiceClient(builder = DevCenterClientBuilder.class)
public final class DevCenterClientImpl implements DevCenterClient {
    /**
     * Unique identifier of the Azure subscription. This is a GUID-formatted string (e.g.
     * 00000000-0000-0000-0000-000000000000).
     */
    private final String subscriptionId;

    /**
     * Gets Unique identifier of the Azure subscription. This is a GUID-formatted string (e.g.
     * 00000000-0000-0000-0000-000000000000).
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The DevCentersClient object to access its operations. */
    private final DevCentersClient devCenters;

    /**
     * Gets the DevCentersClient object to access its operations.
     *
     * @return the DevCentersClient object.
     */
    public DevCentersClient getDevCenters() {
        return this.devCenters;
    }

    /** The ProjectsClient object to access its operations. */
    private final ProjectsClient projects;

    /**
     * Gets the ProjectsClient object to access its operations.
     *
     * @return the ProjectsClient object.
     */
    public ProjectsClient getProjects() {
        return this.projects;
    }

    /** The AttachedNetworksClient object to access its operations. */
    private final AttachedNetworksClient attachedNetworks;

    /**
     * Gets the AttachedNetworksClient object to access its operations.
     *
     * @return the AttachedNetworksClient object.
     */
    public AttachedNetworksClient getAttachedNetworks() {
        return this.attachedNetworks;
    }

    /** The GalleriesClient object to access its operations. */
    private final GalleriesClient galleries;

    /**
     * Gets the GalleriesClient object to access its operations.
     *
     * @return the GalleriesClient object.
     */
    public GalleriesClient getGalleries() {
        return this.galleries;
    }

    /** The ImagesClient object to access its operations. */
    private final ImagesClient images;

    /**
     * Gets the ImagesClient object to access its operations.
     *
     * @return the ImagesClient object.
     */
    public ImagesClient getImages() {
        return this.images;
    }

    /** The ImageVersionsClient object to access its operations. */
    private final ImageVersionsClient imageVersions;

    /**
     * Gets the ImageVersionsClient object to access its operations.
     *
     * @return the ImageVersionsClient object.
     */
    public ImageVersionsClient getImageVersions() {
        return this.imageVersions;
    }

    /** The CatalogsClient object to access its operations. */
    private final CatalogsClient catalogs;

    /**
     * Gets the CatalogsClient object to access its operations.
     *
     * @return the CatalogsClient object.
     */
    public CatalogsClient getCatalogs() {
        return this.catalogs;
    }

    /** The EnvironmentTypesClient object to access its operations. */
    private final EnvironmentTypesClient environmentTypes;

    /**
     * Gets the EnvironmentTypesClient object to access its operations.
     *
     * @return the EnvironmentTypesClient object.
     */
    public EnvironmentTypesClient getEnvironmentTypes() {
        return this.environmentTypes;
    }

    /** The ProjectAllowedEnvironmentTypesClient object to access its operations. */
    private final ProjectAllowedEnvironmentTypesClient projectAllowedEnvironmentTypes;

    /**
     * Gets the ProjectAllowedEnvironmentTypesClient object to access its operations.
     *
     * @return the ProjectAllowedEnvironmentTypesClient object.
     */
    public ProjectAllowedEnvironmentTypesClient getProjectAllowedEnvironmentTypes() {
        return this.projectAllowedEnvironmentTypes;
    }

    /** The ProjectEnvironmentTypesClient object to access its operations. */
    private final ProjectEnvironmentTypesClient projectEnvironmentTypes;

    /**
     * Gets the ProjectEnvironmentTypesClient object to access its operations.
     *
     * @return the ProjectEnvironmentTypesClient object.
     */
    public ProjectEnvironmentTypesClient getProjectEnvironmentTypes() {
        return this.projectEnvironmentTypes;
    }

    /** The DevBoxDefinitionsClient object to access its operations. */
    private final DevBoxDefinitionsClient devBoxDefinitions;

    /**
     * Gets the DevBoxDefinitionsClient object to access its operations.
     *
     * @return the DevBoxDefinitionsClient object.
     */
    public DevBoxDefinitionsClient getDevBoxDefinitions() {
        return this.devBoxDefinitions;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The OperationStatusesClient object to access its operations. */
    private final OperationStatusesClient operationStatuses;

    /**
     * Gets the OperationStatusesClient object to access its operations.
     *
     * @return the OperationStatusesClient object.
     */
    public OperationStatusesClient getOperationStatuses() {
        return this.operationStatuses;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The SkusClient object to access its operations. */
    private final SkusClient skus;

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    public SkusClient getSkus() {
        return this.skus;
    }

    /** The PoolsClient object to access its operations. */
    private final PoolsClient pools;

    /**
     * Gets the PoolsClient object to access its operations.
     *
     * @return the PoolsClient object.
     */
    public PoolsClient getPools() {
        return this.pools;
    }

    /** The SchedulesClient object to access its operations. */
    private final SchedulesClient schedules;

    /**
     * Gets the SchedulesClient object to access its operations.
     *
     * @return the SchedulesClient object.
     */
    public SchedulesClient getSchedules() {
        return this.schedules;
    }

    /** The NetworkConnectionsClient object to access its operations. */
    private final NetworkConnectionsClient networkConnections;

    /**
     * Gets the NetworkConnectionsClient object to access its operations.
     *
     * @return the NetworkConnectionsClient object.
     */
    public NetworkConnectionsClient getNetworkConnections() {
        return this.networkConnections;
    }

    /**
     * Initializes an instance of DevCenterClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Unique identifier of the Azure subscription. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param endpoint server parameter.
     */
    DevCenterClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2022-09-01-preview";
        this.devCenters = new DevCentersClientImpl(this);
        this.projects = new ProjectsClientImpl(this);
        this.attachedNetworks = new AttachedNetworksClientImpl(this);
        this.galleries = new GalleriesClientImpl(this);
        this.images = new ImagesClientImpl(this);
        this.imageVersions = new ImageVersionsClientImpl(this);
        this.catalogs = new CatalogsClientImpl(this);
        this.environmentTypes = new EnvironmentTypesClientImpl(this);
        this.projectAllowedEnvironmentTypes = new ProjectAllowedEnvironmentTypesClientImpl(this);
        this.projectEnvironmentTypes = new ProjectEnvironmentTypesClientImpl(this);
        this.devBoxDefinitions = new DevBoxDefinitionsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.operationStatuses = new OperationStatusesClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.skus = new SkusClientImpl(this);
        this.pools = new PoolsClientImpl(this);
        this.schedules = new SchedulesClientImpl(this);
        this.networkConnections = new NetworkConnectionsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DevCenterClientImpl.class);
}
