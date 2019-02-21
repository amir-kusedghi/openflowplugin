/*
 * Copyright (c) 2016 Pantheon Technologies s.r.o. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.openflowplugin.impl.protocol.serialization.match;

import org.opendaylight.openflowjava.protocol.api.util.OxmMatchConstants;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match;
import org.opendaylight.yangtools.yang.common.Uint8;

public class Icmpv4TypeEntrySerializer extends AbstractUint8EntrySerializer {
    public Icmpv4TypeEntrySerializer() {
        super(OxmMatchConstants.OPENFLOW_BASIC_CLASS, OxmMatchConstants.ICMPV4_TYPE);
    }

    @Override
    protected Uint8 extractEntry(final Match match) {
        final Icmpv4Match icmpMatch = match.getIcmpv4Match();
        return icmpMatch == null ? null : icmpMatch.getIcmpv4Type();
    }
}
