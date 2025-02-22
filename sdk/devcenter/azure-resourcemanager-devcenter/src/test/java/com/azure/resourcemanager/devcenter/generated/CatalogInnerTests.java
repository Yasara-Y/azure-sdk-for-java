// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogInner;
import com.azure.resourcemanager.devcenter.models.GitCatalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CatalogInnerTests {
    @Test
    public void testDeserialize() {
        CatalogInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"onpc\",\"lastSyncTime\":\"2021-03-01T18:55:03Z\",\"gitHub\":{\"uri\":\"hslkevleggzf\",\"branch\":\"hfmvfaxkffe\",\"secretIdentifier\":\"th\",\"path\":\"m\"},\"adoGit\":{\"uri\":\"v\",\"branch\":\"xmzsbbzogg\",\"secretIdentifier\":\"rxwburv\",\"path\":\"xjnspy\"}},\"id\":\"tko\",\"name\":\"nkoukn\",\"type\":\"udwtiukbl\"}")
                .toObject(CatalogInner.class);
        Assertions.assertEquals("hslkevleggzf", model.gitHub().uri());
        Assertions.assertEquals("hfmvfaxkffe", model.gitHub().branch());
        Assertions.assertEquals("th", model.gitHub().secretIdentifier());
        Assertions.assertEquals("m", model.gitHub().path());
        Assertions.assertEquals("v", model.adoGit().uri());
        Assertions.assertEquals("xmzsbbzogg", model.adoGit().branch());
        Assertions.assertEquals("rxwburv", model.adoGit().secretIdentifier());
        Assertions.assertEquals("xjnspy", model.adoGit().path());
    }

    @Test
    public void testSerialize() {
        CatalogInner model =
            new CatalogInner()
                .withGitHub(
                    new GitCatalog()
                        .withUri("hslkevleggzf")
                        .withBranch("hfmvfaxkffe")
                        .withSecretIdentifier("th")
                        .withPath("m"))
                .withAdoGit(
                    new GitCatalog()
                        .withUri("v")
                        .withBranch("xmzsbbzogg")
                        .withSecretIdentifier("rxwburv")
                        .withPath("xjnspy"));
        model = BinaryData.fromObject(model).toObject(CatalogInner.class);
        Assertions.assertEquals("hslkevleggzf", model.gitHub().uri());
        Assertions.assertEquals("hfmvfaxkffe", model.gitHub().branch());
        Assertions.assertEquals("th", model.gitHub().secretIdentifier());
        Assertions.assertEquals("m", model.gitHub().path());
        Assertions.assertEquals("v", model.adoGit().uri());
        Assertions.assertEquals("xmzsbbzogg", model.adoGit().branch());
        Assertions.assertEquals("rxwburv", model.adoGit().secretIdentifier());
        Assertions.assertEquals("xjnspy", model.adoGit().path());
    }
}
