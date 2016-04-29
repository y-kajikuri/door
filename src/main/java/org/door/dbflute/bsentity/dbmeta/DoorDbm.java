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
package org.door.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.door.dbflute.allcommon.*;
import org.door.dbflute.exentity.*;

/**
 * The DB meta of door. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DoorDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DoorDbm _instance = new DoorDbm();
    private DoorDbm() {}
    public static DoorDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Door)et).getDoorId(), (et, vl) -> ((Door)et).setDoorId(cti(vl)), "doorId");
        setupEpg(_epgMap, et -> ((Door)et).getDoorName(), (et, vl) -> ((Door)et).setDoorName((String)vl), "doorName");
        setupEpg(_epgMap, et -> ((Door)et).getMin(), (et, vl) -> ((Door)et).setMin(cti(vl)), "min");
        setupEpg(_epgMap, et -> ((Door)et).getMax(), (et, vl) -> ((Door)et).setMax(cti(vl)), "max");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "door";
    protected final String _tableDispName = "DOOR";
    protected final String _tablePropertyName = "door";
    protected final TableSqlName _tableSqlName = new TableSqlName("DOOR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "ドア";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDoorId = cci("DOOR_ID", "DOOR_ID", null, "ドアID", Integer.class, "doorId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, "doorSensorLogList", null, false);
    protected final ColumnInfo _columnDoorName = cci("DOOR_NAME", "DOOR_NAME", null, "ドア名", String.class, "doorName", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMin = cci("MIN", "MIN", null, "最小値", Integer.class, "min", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMax = cci("MAX", "MAX", null, "最大値", Integer.class, "max", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoorId() { return _columnDoorId; }
    /**
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoorName() { return _columnDoorName; }
    /**
     * (最小値)MIN: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMin() { return _columnMin; }
    /**
     * (最大値)MAX: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMax() { return _columnMax; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDoorId());
        ls.add(columnDoorName());
        ls.add(columnMin());
        ls.add(columnMax());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDoorId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (ドアセンサーログ)DOOR_SENSOR_LOG by DOOR_ID, named 'doorSensorLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDoorSensorLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDoorId(), DoorSensorLogDbm.getInstance().columnDoorId());
        return cri("door_sensor_log_ibfk_1", "doorSensorLogList", this, DoorSensorLogDbm.getInstance(), mp, false, "door");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.door.dbflute.exentity.Door"; }
    public String getConditionBeanTypeName() { return "org.door.dbflute.cbean.DoorCB"; }
    public String getBehaviorTypeName() { return "org.door.dbflute.exbhv.DoorBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Door> getEntityType() { return Door.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Door newEntity() { return new Door(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Door)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Door)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
