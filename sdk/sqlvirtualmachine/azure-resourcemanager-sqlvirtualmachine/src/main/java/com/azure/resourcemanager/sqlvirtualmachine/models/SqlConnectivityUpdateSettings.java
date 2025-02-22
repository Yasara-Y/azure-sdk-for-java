// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set the access level and network port settings for SQL Server. */
@Fluent
public final class SqlConnectivityUpdateSettings {
    /*
     * SQL Server connectivity option.
     */
    @JsonProperty(value = "connectivityType")
    private ConnectivityType connectivityType;

    /*
     * SQL Server port.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * SQL Server sysadmin login to create.
     */
    @JsonProperty(value = "sqlAuthUpdateUserName")
    private String sqlAuthUpdateUsername;

    /*
     * SQL Server sysadmin login password.
     */
    @JsonProperty(value = "sqlAuthUpdatePassword")
    private String sqlAuthUpdatePassword;

    /**
     * Get the connectivityType property: SQL Server connectivity option.
     *
     * @return the connectivityType value.
     */
    public ConnectivityType connectivityType() {
        return this.connectivityType;
    }

    /**
     * Set the connectivityType property: SQL Server connectivity option.
     *
     * @param connectivityType the connectivityType value to set.
     * @return the SqlConnectivityUpdateSettings object itself.
     */
    public SqlConnectivityUpdateSettings withConnectivityType(ConnectivityType connectivityType) {
        this.connectivityType = connectivityType;
        return this;
    }

    /**
     * Get the port property: SQL Server port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: SQL Server port.
     *
     * @param port the port value to set.
     * @return the SqlConnectivityUpdateSettings object itself.
     */
    public SqlConnectivityUpdateSettings withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the sqlAuthUpdateUsername property: SQL Server sysadmin login to create.
     *
     * @return the sqlAuthUpdateUsername value.
     */
    public String sqlAuthUpdateUsername() {
        return this.sqlAuthUpdateUsername;
    }

    /**
     * Set the sqlAuthUpdateUsername property: SQL Server sysadmin login to create.
     *
     * @param sqlAuthUpdateUsername the sqlAuthUpdateUsername value to set.
     * @return the SqlConnectivityUpdateSettings object itself.
     */
    public SqlConnectivityUpdateSettings withSqlAuthUpdateUsername(String sqlAuthUpdateUsername) {
        this.sqlAuthUpdateUsername = sqlAuthUpdateUsername;
        return this;
    }

    /**
     * Get the sqlAuthUpdatePassword property: SQL Server sysadmin login password.
     *
     * @return the sqlAuthUpdatePassword value.
     */
    public String sqlAuthUpdatePassword() {
        return this.sqlAuthUpdatePassword;
    }

    /**
     * Set the sqlAuthUpdatePassword property: SQL Server sysadmin login password.
     *
     * @param sqlAuthUpdatePassword the sqlAuthUpdatePassword value to set.
     * @return the SqlConnectivityUpdateSettings object itself.
     */
    public SqlConnectivityUpdateSettings withSqlAuthUpdatePassword(String sqlAuthUpdatePassword) {
        this.sqlAuthUpdatePassword = sqlAuthUpdatePassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
