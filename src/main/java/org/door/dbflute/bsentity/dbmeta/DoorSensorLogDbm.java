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
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.door.dbflute.allcommon.*;
import org.door.dbflute.exentity.*;

/**
 * The DB meta of door_sensor_log. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DoorSensorLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DoorSensorLogDbm _instance = new DoorSensorLogDbm();
    private DoorSensorLogDbm() {}
    public static DoorSensorLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DoorSensorLog)et).getDoorSensorLogId(), (et, vl) -> ((DoorSensorLog)et).setDoorSensorLogId(cti(vl)), "doorSensorLogId");
        setupEpg(_epgMap, et -> ((DoorSensorLog)et).getDoorId(), (et, vl) -> ((DoorSensorLog)et).setDoorId(cti(vl)), "doorId");
        setupEpg(_epgMap, et -> ((DoorSensorLog)et).getDoorStatis(), (et, vl) -> ((DoorSensorLog)et).setDoorStatis((Boolean)vl), "doorStatis");
        setupEpg(_epgMap, et -> ((DoorSensorLog)et).getSensorDistance(), (et, vl) -> ((DoorSensorLog)et).setSensorDistance(cti(vl)), "sensorDistance");
        setupEpg(_epgMap, et -> ((DoorSensorLog)et).getRegisterDatetime(), (et, vl) -> ((DoorSensorLog)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((DoorSensorLog)et).getDoor(), (et, vl) -> ((DoorSensorLog)et).setDoor((OptionalEntity<Door>)vl), "door");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "door_sensor_log";
    protected final String _tableDispName = "DOOR_SENSOR_LOG";
    protected final String _tablePropertyName = "doorSensorLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("DOOR_SENSOR_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "ドアセンサーログ";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDoorSensorLogId = cci("DOOR_SENSOR_LOG_ID", "DOOR_SENSOR_LOG_ID", null, "ドアセンサーログID", Integer.class, "doorSensorLogId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDoorId = cci("DOOR_ID", "DOOR_ID", null, "ドアID", Integer.class, "doorId", null, false, false, true, "INT", 10, 0, null, false, null, null, "door", null, null, false);
    protected final ColumnInfo _columnDoorStatis = cci("DOOR_STATIS", "DOOR_STATIS", null, "ドアステータス", Boolean.class, "doorStatis", null, false, false, true, "BIT", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSensorDistance = cci("SENSOR_DISTANCE", "SENSOR_DISTANCE", null, "センサー距離", Integer.class, "sensorDistance", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);

    /**
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoorSensorLogId() { return _columnDoorSensorLogId; }
    /**
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoorId() { return _columnDoorId; }
    /**
     * (ドアステータス)DOOR_STATIS: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoorStatis() { return _columnDoorStatis; }
    /**
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSensorDistance() { return _columnSensorDistance; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDoorSensorLogId());
        ls.add(columnDoorId());
        ls.add(columnDoorStatis());
        ls.add(columnSensorDistance());
        ls.add(columnRegisterDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDoorSensorLogId()); }
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
    /**
     * (ドア)DOOR by my DOOR_ID, named 'door'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignDoor() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDoorId(), DoorDbm.getInstance().columnDoorId());
        return cfi("door_sensor_log_ibfk_1", "door", this, DoorDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "doorSensorLogList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.door.dbflute.exentity.DoorSensorLog"; }
    public String getConditionBeanTypeName() { return "org.door.dbflute.cbean.DoorSensorLogCB"; }
    public String getBehaviorTypeName() { return "org.door.dbflute.exbhv.DoorSensorLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DoorSensorLog> getEntityType() { return DoorSensorLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DoorSensorLog newEntity() { return new DoorSensorLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DoorSensorLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DoorSensorLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
