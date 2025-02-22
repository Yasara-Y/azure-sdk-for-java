// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the HTTP requests for authentication and authorization requests made against
 * ContainerApp Service Authentication/Authorization.
 */
@Fluent
public final class HttpSettings {
    /*
     * <code>false</code> if the authentication/authorization responses not having the HTTPS scheme are permissible;
     * otherwise, <code>true</code>.
     */
    @JsonProperty(value = "requireHttps")
    private Boolean requireHttps;

    /*
     * The configuration settings of the paths HTTP requests.
     */
    @JsonProperty(value = "routes")
    private HttpSettingsRoutes routes;

    /*
     * The configuration settings of a forward proxy used to make the requests.
     */
    @JsonProperty(value = "forwardProxy")
    private ForwardProxy forwardProxy;

    /** Creates an instance of HttpSettings class. */
    public HttpSettings() {
    }

    /**
     * Get the requireHttps property: &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not
     * having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the requireHttps value.
     */
    public Boolean requireHttps() {
        return this.requireHttps;
    }

    /**
     * Set the requireHttps property: &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not
     * having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param requireHttps the requireHttps value to set.
     * @return the HttpSettings object itself.
     */
    public HttpSettings withRequireHttps(Boolean requireHttps) {
        this.requireHttps = requireHttps;
        return this;
    }

    /**
     * Get the routes property: The configuration settings of the paths HTTP requests.
     *
     * @return the routes value.
     */
    public HttpSettingsRoutes routes() {
        return this.routes;
    }

    /**
     * Set the routes property: The configuration settings of the paths HTTP requests.
     *
     * @param routes the routes value to set.
     * @return the HttpSettings object itself.
     */
    public HttpSettings withRoutes(HttpSettingsRoutes routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the forwardProxy property: The configuration settings of a forward proxy used to make the requests.
     *
     * @return the forwardProxy value.
     */
    public ForwardProxy forwardProxy() {
        return this.forwardProxy;
    }

    /**
     * Set the forwardProxy property: The configuration settings of a forward proxy used to make the requests.
     *
     * @param forwardProxy the forwardProxy value to set.
     * @return the HttpSettings object itself.
     */
    public HttpSettings withForwardProxy(ForwardProxy forwardProxy) {
        this.forwardProxy = forwardProxy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().validate();
        }
        if (forwardProxy() != null) {
            forwardProxy().validate();
        }
    }
}
