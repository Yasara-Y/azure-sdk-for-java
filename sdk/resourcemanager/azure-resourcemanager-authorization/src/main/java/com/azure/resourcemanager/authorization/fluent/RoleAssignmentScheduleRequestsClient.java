// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleAssignmentScheduleRequestInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleAssignmentScheduleRequestsClient. */
public interface RoleAssignmentScheduleRequestsClient {
    /**
     * Creates a role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleAssignmentScheduleRequestName A GUID for the role assignment to create. The name must be unique and
     *     different for each role assignment.
     * @param parameters Parameters for the role assignment schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleAssignmentScheduleRequestInner>> createWithResponseAsync(
        String scope, String roleAssignmentScheduleRequestName, RoleAssignmentScheduleRequestInner parameters);

    /**
     * Creates a role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleAssignmentScheduleRequestName A GUID for the role assignment to create. The name must be unique and
     *     different for each role assignment.
     * @param parameters Parameters for the role assignment schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleAssignmentScheduleRequestInner> createAsync(
        String scope, String roleAssignmentScheduleRequestName, RoleAssignmentScheduleRequestInner parameters);

    /**
     * Creates a role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleAssignmentScheduleRequestName A GUID for the role assignment to create. The name must be unique and
     *     different for each role assignment.
     * @param parameters Parameters for the role assignment schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleAssignmentScheduleRequestInner create(
        String scope, String roleAssignmentScheduleRequestName, RoleAssignmentScheduleRequestInner parameters);

    /**
     * Creates a role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleAssignmentScheduleRequestName A GUID for the role assignment to create. The name must be unique and
     *     different for each role assignment.
     * @param parameters Parameters for the role assignment schedule request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleAssignmentScheduleRequestInner> createWithResponse(
        String scope,
        String roleAssignmentScheduleRequestName,
        RoleAssignmentScheduleRequestInner parameters,
        Context context);

    /**
     * Get the specified role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request.
     * @param roleAssignmentScheduleRequestName The name (guid) of the role assignment schedule request to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule request along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleAssignmentScheduleRequestInner>> getWithResponseAsync(
        String scope, String roleAssignmentScheduleRequestName);

    /**
     * Get the specified role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request.
     * @param roleAssignmentScheduleRequestName The name (guid) of the role assignment schedule request to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleAssignmentScheduleRequestInner> getAsync(String scope, String roleAssignmentScheduleRequestName);

    /**
     * Get the specified role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request.
     * @param roleAssignmentScheduleRequestName The name (guid) of the role assignment schedule request to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleAssignmentScheduleRequestInner get(String scope, String roleAssignmentScheduleRequestName);

    /**
     * Get the specified role assignment schedule request.
     *
     * @param scope The scope of the role assignment schedule request.
     * @param roleAssignmentScheduleRequestName The name (guid) of the role assignment schedule request to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleAssignmentScheduleRequestInner> getWithResponse(
        String scope, String roleAssignmentScheduleRequestName, Context context);

    /**
     * Gets role assignment schedule requests for a scope.
     *
     * @param scope The scope of the role assignments schedule requests.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedule
     *     requests at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedule
     *     requests at, above or below the scope for the specified principal. Use $filter=asRequestor() to return all
     *     role assignment schedule requests requested by the current user. Use $filter=asTarget() to return all role
     *     assignment schedule requests created for the current user. Use $filter=asApprover() to return all role
     *     assignment schedule requests where the current user is an approver.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedule requests for a scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleAssignmentScheduleRequestInner> listForScopeAsync(String scope, String filter);

    /**
     * Gets role assignment schedule requests for a scope.
     *
     * @param scope The scope of the role assignments schedule requests.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedule requests for a scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleAssignmentScheduleRequestInner> listForScopeAsync(String scope);

    /**
     * Gets role assignment schedule requests for a scope.
     *
     * @param scope The scope of the role assignments schedule requests.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedule requests for a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleAssignmentScheduleRequestInner> listForScope(String scope);

    /**
     * Gets role assignment schedule requests for a scope.
     *
     * @param scope The scope of the role assignments schedule requests.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedule
     *     requests at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedule
     *     requests at, above or below the scope for the specified principal. Use $filter=asRequestor() to return all
     *     role assignment schedule requests requested by the current user. Use $filter=asTarget() to return all role
     *     assignment schedule requests created for the current user. Use $filter=asApprover() to return all role
     *     assignment schedule requests where the current user is an approver.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedule requests for a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleAssignmentScheduleRequestInner> listForScope(String scope, String filter, Context context);

    /**
     * Cancels a pending role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to cancel.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> cancelWithResponseAsync(String scope, String roleAssignmentScheduleRequestName);

    /**
     * Cancels a pending role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to cancel.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> cancelAsync(String scope, String roleAssignmentScheduleRequestName);

    /**
     * Cancels a pending role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to cancel.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String scope, String roleAssignmentScheduleRequestName);

    /**
     * Cancels a pending role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to cancel.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to cancel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> cancelWithResponse(String scope, String roleAssignmentScheduleRequestName, Context context);

    /**
     * Validates a new role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to validate.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to validate.
     * @param parameters Parameters for the role assignment schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleAssignmentScheduleRequestInner>> validateWithResponseAsync(
        String scope, String roleAssignmentScheduleRequestName, RoleAssignmentScheduleRequestInner parameters);

    /**
     * Validates a new role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to validate.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to validate.
     * @param parameters Parameters for the role assignment schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleAssignmentScheduleRequestInner> validateAsync(
        String scope, String roleAssignmentScheduleRequestName, RoleAssignmentScheduleRequestInner parameters);

    /**
     * Validates a new role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to validate.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to validate.
     * @param parameters Parameters for the role assignment schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleAssignmentScheduleRequestInner validate(
        String scope, String roleAssignmentScheduleRequestName, RoleAssignmentScheduleRequestInner parameters);

    /**
     * Validates a new role assignment schedule request.
     *
     * @param scope The scope of the role assignment request to validate.
     * @param roleAssignmentScheduleRequestName The name of the role assignment request to validate.
     * @param parameters Parameters for the role assignment schedule request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment schedule request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleAssignmentScheduleRequestInner> validateWithResponse(
        String scope,
        String roleAssignmentScheduleRequestName,
        RoleAssignmentScheduleRequestInner parameters,
        Context context);
}
