/*
 * Copyright (c) 2016 Pantheon Technologies s.r.o. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.openflowplugin.impl.protocol.serialization.actions;

import io.netty.buffer.ByteBuf;
import org.opendaylight.openflowjava.protocol.impl.util.ActionConstants;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetQueueActionCase;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.queue.action._case.SetQueueAction;

public class SetQueueActionSerializer extends AbstractActionSerializer<SetQueueActionCase> {
    @Override
    public void serialize(SetQueueActionCase action, ByteBuf outBuffer) {
        super.serialize(action, outBuffer);
        final SetQueueAction setQueueAction = action.getSetQueueAction();
        outBuffer.writeInt(setQueueAction.getQueueId().intValue());
    }

    @Override
    protected int getLength() {
        return ActionConstants.GENERAL_ACTION_LENGTH;
    }

    @Override
    protected int getType() {
        return ActionConstants.SET_QUEUE_CODE;
    }
}
