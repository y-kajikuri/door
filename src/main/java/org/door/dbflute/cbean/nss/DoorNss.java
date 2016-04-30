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

import org.door.dbflute.cbean.cq.DoorCQ;

/**
 * The nest select set-upper of door.
 * @author DBFlute(AutoGenerator)
 */
public class DoorNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DoorCQ _query;
    public DoorNss(DoorCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (ドアセンサーログ)DOOR_SENSOR_LOG by my DOOR_ID, named 'doorSensorLogAsLatest'. <br>
     * 最新のドアのセンサーログ
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DoorSensorLogNss withDoorSensorLogAsLatest() {
        _query.xdoNss(() -> _query.queryDoorSensorLogAsLatest());
        return new DoorSensorLogNss(_query.queryDoorSensorLogAsLatest());
    }
}
