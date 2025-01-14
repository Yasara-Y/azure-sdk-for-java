// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrivateEndpoint;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequest;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkConnectionApprovalRequestTests {
    @Test
    public void testDeserialize() {
        PrivateLinkConnectionApprovalRequest model =
            BinaryData
                .fromString(
                    "{\"privateLinkServiceConnectionState\":{\"status\":\"ydfce\",\"description\":\"vlhv\",\"actionsRequired\":\"dyftumrtwna\"},\"privateEndpoint\":{\"id\":\"lbiw\"}}")
                .toObject(PrivateLinkConnectionApprovalRequest.class);
        Assertions.assertEquals("ydfce", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("vlhv", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dyftumrtwna", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("lbiw", model.privateEndpoint().id());
    }

    @Test
    public void testSerialize() {
        PrivateLinkConnectionApprovalRequest model =
            new PrivateLinkConnectionApprovalRequest()
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkConnectionState()
                        .withStatus("ydfce")
                        .withDescription("vlhv")
                        .withActionsRequired("dyftumrtwna"))
                .withPrivateEndpoint(new PrivateEndpoint().withId("lbiw"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkConnectionApprovalRequest.class);
        Assertions.assertEquals("ydfce", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("vlhv", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dyftumrtwna", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("lbiw", model.privateEndpoint().id());
    }
}
