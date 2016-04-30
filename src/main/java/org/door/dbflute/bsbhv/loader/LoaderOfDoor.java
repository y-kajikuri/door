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
import org.dbflute.bhv.referrer.*;
import org.door.dbflute.exbhv.*;
import org.door.dbflute.exentity.*;
import org.door.dbflute.cbean.*;

/**
 * The referrer loader of (ドア)DOOR as TABLE. <br>
 * <pre>
 * [primary key]
 *     DOOR_ID
 *
 * [column]
 *     DOOR_ID, DOOR_NAME, MIN, MAX
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DOOR_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     DOOR_SENSOR_LOG(AsLatest)
 *
 * [referrer table]
 *     DOOR_SENSOR_LOG
 *
 * [foreign property]
 *     doorSensorLogAsLatest
 *
 * [referrer property]
 *     doorSensorLogList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfDoor {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Door> _selectedList;
    protected BehaviorSelector _selector;
    protected DoorBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDoor ready(List<Door> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DoorBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DoorBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DoorSensorLog> _referrerDoorSensorLog;

    /**
     * Load referrer of doorSensorLogList by the set-upper of referrer. <br>
     * (ドアセンサーログ)DOOR_SENSOR_LOG by DOOR_ID, named 'doorSensorLogList'.
     * <pre>
     * <span style="color: #0000C0">doorBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">doorList</span>, <span style="color: #553000">doorLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">doorLoader</span>.<span style="color: #CC4747">loadDoorSensorLog</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Door door : <span style="color: #553000">doorList</span>) {
     *     ... = door.<span style="color: #CC4747">getDoorSensorLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDoorId_InScope(pkList);
     * cb.query().addOrderBy_DoorId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfDoorSensorLog> loadDoorSensorLog(ReferrerConditionSetupper<DoorSensorLogCB> refCBLambda) {
        myBhv().loadDoorSensorLog(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerDoorSensorLog = refLs);
        return hd -> hd.handle(new LoaderOfDoorSensorLog().ready(_referrerDoorSensorLog, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfDoorSensorLog _foreignDoorSensorLogAsLatestLoader;
    public LoaderOfDoorSensorLog pulloutDoorSensorLogAsLatest() {
        if (_foreignDoorSensorLogAsLatestLoader == null)
        { _foreignDoorSensorLogAsLatestLoader = new LoaderOfDoorSensorLog().ready(myBhv().pulloutDoorSensorLogAsLatest(_selectedList), _selector); }
        return _foreignDoorSensorLogAsLatestLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Door> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
