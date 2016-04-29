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
package org.door.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.door.dbflute.allcommon.DBMetaInstanceHandler;
import org.door.dbflute.exentity.*;

/**
 * The entity of (ドア)DOOR as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *     
 * 
 * [referrer table]
 *     DOOR_SENSOR_LOG
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     doorSensorLogList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer doorId = entity.getDoorId();
 * String doorName = entity.getDoorName();
 * Integer min = entity.getMin();
 * Integer max = entity.getMax();
 * entity.setDoorId(doorId);
 * entity.setDoorName(doorName);
 * entity.setMin(min);
 * entity.setMax(max);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDoor extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _doorId;

    /** (ドア名)DOOR_NAME: {VARCHAR(10)} */
    protected String _doorName;

    /** (最小値)MIN: {NotNull, INT(10)} */
    protected Integer _min;

    /** (最大値)MAX: {NotNull, INT(10)} */
    protected Integer _max;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "door";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_doorId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (ドアセンサーログ)DOOR_SENSOR_LOG by DOOR_ID, named 'doorSensorLogList'. */
    protected List<DoorSensorLog> _doorSensorLogList;

    /**
     * [get] (ドアセンサーログ)DOOR_SENSOR_LOG by DOOR_ID, named 'doorSensorLogList'.
     * @return The entity list of referrer property 'doorSensorLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DoorSensorLog> getDoorSensorLogList() {
        if (_doorSensorLogList == null) { _doorSensorLogList = newReferrerList(); }
        return _doorSensorLogList;
    }

    /**
     * [set] (ドアセンサーログ)DOOR_SENSOR_LOG by DOOR_ID, named 'doorSensorLogList'.
     * @param doorSensorLogList The entity list of referrer property 'doorSensorLogList'. (NullAllowed)
     */
    public void setDoorSensorLogList(List<DoorSensorLog> doorSensorLogList) {
        _doorSensorLogList = doorSensorLogList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsDoor) {
            BsDoor other = (BsDoor)obj;
            if (!xSV(_doorId, other._doorId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _doorId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_doorSensorLogList != null) { for (DoorSensorLog et : _doorSensorLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "doorSensorLogList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_doorId));
        sb.append(dm).append(xfND(_doorName));
        sb.append(dm).append(xfND(_min));
        sb.append(dm).append(xfND(_max));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_doorSensorLogList != null && !_doorSensorLogList.isEmpty())
        { sb.append(dm).append("doorSensorLogList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Door clone() {
        return (Door)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10)} <br>
     * ひとつひとつのドアに割り当てられたID。
     * @return The value of the column 'DOOR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDoorId() {
        checkSpecifiedProperty("doorId");
        return _doorId;
    }

    /**
     * [set] (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10)} <br>
     * ひとつひとつのドアに割り当てられたID。
     * @param doorId The value of the column 'DOOR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDoorId(Integer doorId) {
        registerModifiedProperty("doorId");
        _doorId = doorId;
    }

    /**
     * [get] (ドア名)DOOR_NAME: {VARCHAR(10)} <br>
     * ドアの名前。
     * @return The value of the column 'DOOR_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDoorName() {
        checkSpecifiedProperty("doorName");
        return convertEmptyToNull(_doorName);
    }

    /**
     * [set] (ドア名)DOOR_NAME: {VARCHAR(10)} <br>
     * ドアの名前。
     * @param doorName The value of the column 'DOOR_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDoorName(String doorName) {
        registerModifiedProperty("doorName");
        _doorName = doorName;
    }

    /**
     * [get] (最小値)MIN: {NotNull, INT(10)} <br>
     * ドアが閉まっていると判断する最小値
     * @return The value of the column 'MIN'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMin() {
        checkSpecifiedProperty("min");
        return _min;
    }

    /**
     * [set] (最小値)MIN: {NotNull, INT(10)} <br>
     * ドアが閉まっていると判断する最小値
     * @param min The value of the column 'MIN'. (basically NotNull if update: for the constraint)
     */
    public void setMin(Integer min) {
        registerModifiedProperty("min");
        _min = min;
    }

    /**
     * [get] (最大値)MAX: {NotNull, INT(10)} <br>
     * ドアが閉まっていると判断する最大値
     * @return The value of the column 'MAX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMax() {
        checkSpecifiedProperty("max");
        return _max;
    }

    /**
     * [set] (最大値)MAX: {NotNull, INT(10)} <br>
     * ドアが閉まっていると判断する最大値
     * @param max The value of the column 'MAX'. (basically NotNull if update: for the constraint)
     */
    public void setMax(Integer max) {
        registerModifiedProperty("max");
        _max = max;
    }
}