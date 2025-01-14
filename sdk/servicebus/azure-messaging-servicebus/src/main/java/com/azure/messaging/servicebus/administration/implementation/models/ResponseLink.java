// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The ResponseLink model. */
@JacksonXmlRootElement(localName = "link", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class ResponseLink {
    /*
     * The URL of the GET request
     */
    @JacksonXmlProperty(localName = "href", isAttribute = true)
    private String href;

    /*
     * What the link href is relative to
     */
    @JacksonXmlProperty(localName = "rel", isAttribute = true)
    private String rel;

    /**
     * Get the href property: The URL of the GET request.
     *
     * @return the href value.
     */
    public String getHref() {
        return this.href;
    }

    /**
     * Set the href property: The URL of the GET request.
     *
     * @param href the href value to set.
     * @return the ResponseLink object itself.
     */
    public ResponseLink setHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the rel property: What the link href is relative to.
     *
     * @return the rel value.
     */
    public String getRel() {
        return this.rel;
    }

    /**
     * Set the rel property: What the link href is relative to.
     *
     * @param rel the rel value to set.
     * @return the ResponseLink object itself.
     */
    public ResponseLink setRel(String rel) {
        this.rel = rel;
        return this;
    }
}
