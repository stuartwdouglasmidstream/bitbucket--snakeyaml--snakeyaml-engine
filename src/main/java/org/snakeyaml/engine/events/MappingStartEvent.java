/**
 * Copyright (c) 2018, http://www.snakeyaml.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snakeyaml.engine.events;


import org.snakeyaml.engine.common.FlowStyle;
import org.snakeyaml.engine.exceptions.Mark;

/**
 * Marks the beginning of a mapping node.
 * <p>
 * This event is followed by a number of key value pairs. <br>
 * The pairs are not in any particular order. However, the value always directly
 * follows the corresponding key. <br>
 * After the key value pairs follows a {@link MappingEndEvent}.
 * </p>
 * <p>
 * There must be an even number of node events between the start and end event.
 * </p>
 *
 * @see MappingEndEvent
 */
public final class MappingStartEvent extends CollectionStartEvent {
    public MappingStartEvent(String anchor, String tag, boolean implicit, Mark startMark,
                             Mark endMark, FlowStyle flowStyle) {
        super(anchor, tag, implicit, startMark, endMark, flowStyle);
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.MappingStart == id;
    }
}