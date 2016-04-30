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
package org.door.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.door.dbflute.exbhv.*;
import org.door.dbflute.exentity.*;

/**
 * The referrer loader of (ドアセンサーログ)DOOR_SENSOR_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     DOOR_SENSOR_LOG_ID
 *
 * [column]
 *     DOOR_SENSOR_LOG_ID, DOOR_ID, DOOR_STATIS, SENSOR_DISTANCE, REGISTER_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DOOR_SENSOR_LOG_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     DOOR
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     door
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfDoorSensorLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DoorSensorLog> _selectedList;
    protected BehaviorSelector _selector;
    protected DoorSensorLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDoorSensorLog ready(List<DoorSensorLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DoorSensorLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DoorSensorLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfDoor _foreignDoorLoader;
    public LoaderOfDoor pulloutDoor() {
        if (_foreignDoorLoader == null)
        { _foreignDoorLoader = new LoaderOfDoor().ready(myBhv().pulloutDoor(_selectedList), _selector); }
        return _foreignDoorLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DoorSensorLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
