// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.administration.models.EntityStatus;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.Duration;
import java.time.OffsetDateTime;

/** The SubscriptionDescription model. */
@JacksonXmlRootElement(
        localName = "SubscriptionDescription",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class SubscriptionDescription {
    /*
     * ISO 8601 timespan duration of a peek-lock; that is, the amount of time
     * that the message is locked for other receivers. The maximum value for
     * LockDuration is 5 minutes; the default value is 1 minute.
     */
    @JacksonXmlProperty(
            localName = "LockDuration",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration lockDuration;

    /*
     * A value that indicates whether the subscription supports the concept of
     * sessions.
     */
    @JacksonXmlProperty(
            localName = "RequiresSession",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean requiresSession;

    /*
     * ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JacksonXmlProperty(
            localName = "DefaultMessageTimeToLive",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration defaultMessageTimeToLive;

    /*
     * A value that indicates whether this subscription has dead letter support
     * when a message expires.
     */
    @JacksonXmlProperty(
            localName = "DeadLetteringOnMessageExpiration",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean deadLetteringOnMessageExpiration;

    /*
     * A value that indicates whether this subscription has dead letter support
     * when a message expires.
     */
    @JacksonXmlProperty(
            localName = "DeadLetteringOnFilterEvaluationExceptions",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean deadLetteringOnFilterEvaluationExceptions;

    /*
     * The number of messages in the subscription.
     */
    @JacksonXmlProperty(
            localName = "MessageCount",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer messageCount;

    /*
     * The maximum delivery count. A message is automatically deadlettered
     * after this number of deliveries. Default value is 10.
     */
    @JacksonXmlProperty(
            localName = "MaxDeliveryCount",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer maxDeliveryCount;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JacksonXmlProperty(
            localName = "EnableBatchedOperations",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enableBatchedOperations;

    /*
     * Status of a Service Bus resource
     */
    @JacksonXmlProperty(
            localName = "Status",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private EntityStatus status;

    /*
     * The name of the recipient entity to which all the messages sent to the
     * subscription are forwarded to.
     */
    @JacksonXmlProperty(
            localName = "ForwardTo",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String forwardTo;

    /*
     * The exact time the subscription was created.
     */
    @JacksonXmlProperty(
            localName = "CreatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime createdAt;

    /*
     * The exact time a message was updated in the subscription.
     */
    @JacksonXmlProperty(
            localName = "UpdatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime updatedAt;

    /*
     * Last time a message was sent, or the last time there was a receive
     * request to this subscription.
     */
    @JacksonXmlProperty(
            localName = "AccessedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime accessedAt;

    /*
     * Details about the message counts in entity.
     */
    @JacksonXmlProperty(
            localName = "CountDetails",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private MessageCountDetails messageCountDetails;

    /*
     * Metadata associated with the subscription. Maximum number of characters
     * is 1024.
     */
    @JacksonXmlProperty(
            localName = "UserMetadata",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String userMetadata;

    /*
     * The name of the recipient entity to which all the messages sent to the
     * subscription are forwarded to.
     */
    @JacksonXmlProperty(
            localName = "ForwardDeadLetteredMessagesTo",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String forwardDeadLetteredMessagesTo;

    /*
     * ISO 8601 timeSpan idle interval after which the subscription is
     * automatically deleted. The minimum duration is 5 minutes.
     */
    @JacksonXmlProperty(
            localName = "AutoDeleteOnIdle",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration autoDeleteOnIdle;

    /*
     * Availability status of the entity
     */
    @JacksonXmlProperty(
            localName = "EntityAvailabilityStatus",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /**
     * Get the lockDuration property: ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1
     * minute.
     *
     * @return the lockDuration value.
     */
    public Duration getLockDuration() {
        return this.lockDuration;
    }

    /**
     * Set the lockDuration property: ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1
     * minute.
     *
     * @param lockDuration the lockDuration value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setLockDuration(Duration lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the requiresSession property: A value that indicates whether the subscription supports the concept of
     * sessions.
     *
     * @return the requiresSession value.
     */
    public Boolean isRequiresSession() {
        return this.requiresSession;
    }

    /**
     * Set the requiresSession property: A value that indicates whether the subscription supports the concept of
     * sessions.
     *
     * @param requiresSession the requiresSession value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }

    /**
     * Get the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the deadLetteringOnMessageExpiration property: A value that indicates whether this subscription has dead
     * letter support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    public Boolean isDeadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: A value that indicates whether this subscription has dead
     * letter support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get the deadLetteringOnFilterEvaluationExceptions property: A value that indicates whether this subscription has
     * dead letter support when a message expires.
     *
     * @return the deadLetteringOnFilterEvaluationExceptions value.
     */
    public Boolean isDeadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions;
    }

    /**
     * Set the deadLetteringOnFilterEvaluationExceptions property: A value that indicates whether this subscription has
     * dead letter support when a message expires.
     *
     * @param deadLetteringOnFilterEvaluationExceptions the deadLetteringOnFilterEvaluationExceptions value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setDeadLetteringOnFilterEvaluationExceptions(
            Boolean deadLetteringOnFilterEvaluationExceptions) {
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        return this;
    }

    /**
     * Get the messageCount property: The number of messages in the subscription.
     *
     * @return the messageCount value.
     */
    public Integer getMessageCount() {
        return this.messageCount;
    }

    /**
     * Set the messageCount property: The number of messages in the subscription.
     *
     * @param messageCount the messageCount value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. Default value is 10.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer getMaxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. Default value is 10.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public Boolean isEnableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the status property: Status of a Service Bus resource.
     *
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of a Service Bus resource.
     *
     * @param status the status value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the forwardTo property: The name of the recipient entity to which all the messages sent to the subscription
     * are forwarded to.
     *
     * @return the forwardTo value.
     */
    public String getForwardTo() {
        return this.forwardTo;
    }

    /**
     * Set the forwardTo property: The name of the recipient entity to which all the messages sent to the subscription
     * are forwarded to.
     *
     * @param forwardTo the forwardTo value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
        return this;
    }

    /**
     * Get the createdAt property: The exact time the subscription was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The exact time the subscription was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt property: The exact time a message was updated in the subscription.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The exact time a message was updated in the subscription.
     *
     * @param updatedAt the updatedAt value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * subscription.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime getAccessedAt() {
        return this.accessedAt;
    }

    /**
     * Set the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * subscription.
     *
     * @param accessedAt the accessedAt value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setAccessedAt(OffsetDateTime accessedAt) {
        this.accessedAt = accessedAt;
        return this;
    }

    /**
     * Get the messageCountDetails property: Details about the message counts in entity.
     *
     * @return the messageCountDetails value.
     */
    public MessageCountDetails getMessageCountDetails() {
        return this.messageCountDetails;
    }

    /**
     * Set the messageCountDetails property: Details about the message counts in entity.
     *
     * @param messageCountDetails the messageCountDetails value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setMessageCountDetails(MessageCountDetails messageCountDetails) {
        this.messageCountDetails = messageCountDetails;
        return this;
    }

    /**
     * Get the userMetadata property: Metadata associated with the subscription. Maximum number of characters is 1024.
     *
     * @return the userMetadata value.
     */
    public String getUserMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: Metadata associated with the subscription. Maximum number of characters is 1024.
     *
     * @param userMetadata the userMetadata value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get the forwardDeadLetteredMessagesTo property: The name of the recipient entity to which all the messages sent
     * to the subscription are forwarded to.
     *
     * @return the forwardDeadLetteredMessagesTo value.
     */
    public String getForwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Set the forwardDeadLetteredMessagesTo property: The name of the recipient entity to which all the messages sent
     * to the subscription are forwarded to.
     *
     * @param forwardDeadLetteredMessagesTo the forwardDeadLetteredMessagesTo value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the subscription is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the subscription is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @return the entityAvailabilityStatus value.
     */
    public EntityAvailabilityStatus getEntityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Set the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set.
     * @return the SubscriptionDescription object itself.
     */
    public SubscriptionDescription setEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
    }
}
