// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The PathsReadHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class PathsReadHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-lease-status property.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private String xMsLeaseStatus;

    /*
     * The Content-Range property.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The x-ms-lease-state property.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private String xMsLeaseState;

    /*
     * The x-ms-content-md5 property.
     */
    @JsonProperty(value = "x-ms-content-md5")
    private String xMsContentMd5;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-properties property.
     */
    @JsonProperty(value = "x-ms-properties")
    private String xMsProperties;

    /*
     * The x-ms-encryption-key-sha256 property.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String xMsEncryptionKeySha256;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /*
     * The x-ms-resource-type property.
     */
    @JsonProperty(value = "x-ms-resource-type")
    private String xMsResourceType;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private String contentMD5;

    /*
     * The Accept-Ranges property.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * The Cache-Control property.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Content-Disposition property.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * The Content-Encoding property.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * The x-ms-lease-duration property.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private String xMsLeaseDuration;

    /*
     * The Content-Length property.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Content-Language property.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PathsReadHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PathsReadHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.xMsLeaseStatus = rawHeaders.getValue("x-ms-lease-status");
        this.contentRange = rawHeaders.getValue("Content-Range");
        this.xMsLeaseState = rawHeaders.getValue("x-ms-lease-state");
        this.xMsContentMd5 = rawHeaders.getValue("x-ms-content-md5");
        String lastModified = rawHeaders.getValue("Last-Modified");
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsProperties = rawHeaders.getValue("x-ms-properties");
        this.xMsEncryptionKeySha256 = rawHeaders.getValue("x-ms-encryption-key-sha256");
        String xMsRequestServerEncrypted = rawHeaders.getValue("x-ms-request-server-encrypted");
        if (xMsRequestServerEncrypted != null) {
            this.xMsRequestServerEncrypted = Boolean.parseBoolean(xMsRequestServerEncrypted);
        }
        String date = rawHeaders.getValue("Date");
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        this.xMsResourceType = rawHeaders.getValue("x-ms-resource-type");
        this.contentMD5 = rawHeaders.getValue("Content-MD5");
        this.acceptRanges = rawHeaders.getValue("Accept-Ranges");
        this.cacheControl = rawHeaders.getValue("Cache-Control");
        this.eTag = rawHeaders.getValue("ETag");
        this.contentDisposition = rawHeaders.getValue("Content-Disposition");
        this.contentEncoding = rawHeaders.getValue("Content-Encoding");
        this.xMsLeaseDuration = rawHeaders.getValue("x-ms-lease-duration");
        String contentLength = rawHeaders.getValue("Content-Length");
        if (contentLength != null) {
            this.contentLength = Long.parseLong(contentLength);
        }
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.contentLanguage = rawHeaders.getValue("Content-Language");
        this.contentType = rawHeaders.getValue("Content-Type");
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     *
     * @return the xMsLeaseStatus value.
     */
    public String getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     *
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsLeaseStatus(String xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the contentRange property: The Content-Range property.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: The Content-Range property.
     *
     * @param contentRange the contentRange value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     *
     * @return the xMsLeaseState value.
     */
    public String getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     *
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsLeaseState(String xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the xMsContentMd5 property: The x-ms-content-md5 property.
     *
     * @return the xMsContentMd5 value.
     */
    public String getXMsContentMd5() {
        return this.xMsContentMd5;
    }

    /**
     * Set the xMsContentMd5 property: The x-ms-content-md5 property.
     *
     * @param xMsContentMd5 the xMsContentMd5 value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsContentMd5(String xMsContentMd5) {
        this.xMsContentMd5 = xMsContentMd5;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsProperties property: The x-ms-properties property.
     *
     * @return the xMsProperties value.
     */
    public String getXMsProperties() {
        return this.xMsProperties;
    }

    /**
     * Set the xMsProperties property: The x-ms-properties property.
     *
     * @param xMsProperties the xMsProperties value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsProperties(String xMsProperties) {
        this.xMsProperties = xMsProperties;
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @return the xMsEncryptionKeySha256 value.
     */
    public String getXMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @return the xMsRequestServerEncrypted value.
     */
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the date property: The Date property.
     *
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     *
     * @param date the date value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the xMsResourceType property: The x-ms-resource-type property.
     *
     * @return the xMsResourceType value.
     */
    public String getXMsResourceType() {
        return this.xMsResourceType;
    }

    /**
     * Set the xMsResourceType property: The x-ms-resource-type property.
     *
     * @param xMsResourceType the xMsResourceType value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsResourceType(String xMsResourceType) {
        this.xMsResourceType = xMsResourceType;
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     *
     * @return the contentMD5 value.
     */
    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the acceptRanges property: The Accept-Ranges property.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: The Accept-Ranges property.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     *
     * @return the xMsLeaseDuration value.
     */
    public String getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     *
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsLeaseDuration(String xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     *
     * @param contentLength the contentLength value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the PathsReadHeaders object itself.
     */
    public PathsReadHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
