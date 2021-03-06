/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.door.dbflute.cbean.nss;

import org.door.dbflute.cbean.cq.DoorSensorLogCQ;

/**
 * The nest select set-upper of door_sensor_log.
 * @author DBFlute(AutoGenerator)
 */
public class DoorSensorLogNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DoorSensorLogCQ _query;
    public DoorSensorLogNss(DoorSensorLogCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (ドア)DOOR by my DOOR_ID, named 'door'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DoorNss withDoor() {
        _query.xdoNss(() -> _query.queryDoor());
        return new DoorNss(_query.queryDoor());
    }
}
