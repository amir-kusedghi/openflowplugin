/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.openflowplugin.api.openflow.device;

import org.opendaylight.mdsal.singleton.common.api.ServiceGroupIdentifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yangtools.yang.binding.KeyedInstanceIdentifier;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * API defining basic device information.
 */
public interface DeviceInfo extends XidSequencer {

    /**
     * Getter.
     * @return id of encapsulated node
     */
    NodeId getNodeId();

    /**
     * Getter.
     * @return {@link Node} instance identifier
     */
    KeyedInstanceIdentifier<Node, NodeKey> getNodeInstanceIdentifier();

    /**
     * Getter.
     * @return version
     */
    short getVersion();

    /**
     * Getter.
     * @return datapathId
     */
    Uint64 getDatapathId();

    /**
     * Getter.
     * @return clustering service identifier
     */
    ServiceGroupIdentifier getServiceIdentifier();

    /**
     * Many uses in log, this will make code more readable.
     * @return string representation of nodeId
     */
    @Deprecated
    default String getLOGValue() {
        return getNodeId().getValue();
    }

}
