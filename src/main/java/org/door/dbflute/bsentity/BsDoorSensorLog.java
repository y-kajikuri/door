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

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.door.dbflute.allcommon.EntityDefinedCommonColumn;
import org.door.dbflute.allcommon.DBMetaInstanceHandler;
import org.door.dbflute.exentity.*;

/**
 * The entity of (ドアセンサーログ)DOOR_SENSOR_LOG as TABLE. <br>
 * 会員のプロフィールやアカウントなどの基本情報を保持する。<br>
 * 基本的に物理削除はなく、退会したらステータスが退会会員になる。<br>
 * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
 * <pre>
 * [primary-key]
 *     DOOR_SENSOR_LOG_ID
 * 
 * [column]
 *     DOOR_SENSOR_LOG_ID, DOOR_ID, DOOR_STATIS, SENSOR_DISTATNCE, REGISTER_DATETIME, REGISTER_USER
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer doorSensorLogId = entity.getDoorSensorLogId();
 * Integer doorId = entity.getDoorId();
 * Boolean doorStatis = entity.getDoorStatis();
 * Integer sensorDistatnce = entity.getSensorDistatnce();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * entity.setDoorSensorLogId(doorSensorLogId);
 * entity.setDoorId(doorId);
 * entity.setDoorStatis(doorStatis);
 * entity.setSensorDistatnce(sensorDistatnce);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDoorSensorLog extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _doorSensorLogId;

    /** (ドアID)DOOR_ID: {IX+, NotNull, INT(10), FK to door} */
    protected Integer _doorId;

    /** (ドアステータス)DOOR_STATIS: {NotNull, BIT} */
    protected Boolean _doorStatis;

    /** (センサー距離)SENSOR_DISTATNCE: {NotNull, INT(10)} */
    protected Integer _sensorDistatnce;

    /** (登録日時)REGISTER_DATETIME: {IX+, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "door_sensor_log";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_doorSensorLogId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (ドア)DOOR by my DOOR_ID, named 'door'. */
    protected OptionalEntity<Door> _door;

    /**
     * [get] (ドア)DOOR by my DOOR_ID, named 'door'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'door'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Door> getDoor() {
        if (_door == null) { _door = OptionalEntity.relationEmpty(this, "door"); }
        return _door;
    }

    /**
     * [set] (ドア)DOOR by my DOOR_ID, named 'door'.
     * @param door The entity of foreign property 'door'. (NullAllowed)
     */
    public void setDoor(OptionalEntity<Door> door) {
        _door = door;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsDoorSensorLog) {
            BsDoorSensorLog other = (BsDoorSensorLog)obj;
            if (!xSV(_doorSensorLogId, other._doorSensorLogId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _doorSensorLogId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_door != null && _door.isPresent())
        { sb.append(li).append(xbRDS(_door, "door")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_doorSensorLogId));
        sb.append(dm).append(xfND(_doorId));
        sb.append(dm).append(xfND(_doorStatis));
        sb.append(dm).append(xfND(_sensorDistatnce));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_door != null && _door.isPresent())
        { sb.append(dm).append("door"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DoorSensorLog clone() {
        return (DoorSensorLog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)} <br>
     * 連番として自動採番される。
     * @return The value of the column 'DOOR_SENSOR_LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDoorSensorLogId() {
        checkSpecifiedProperty("doorSensorLogId");
        return _doorSensorLogId;
    }

    /**
     * [set] (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)} <br>
     * 連番として自動採番される。
     * @param doorSensorLogId The value of the column 'DOOR_SENSOR_LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDoorSensorLogId(Integer doorSensorLogId) {
        registerModifiedProperty("doorSensorLogId");
        _doorSensorLogId = doorSensorLogId;
    }

    /**
     * [get] (ドアID)DOOR_ID: {IX+, NotNull, INT(10), FK to door} <br>
     * ひとつひとつのドアに割り当てられたID。
     * @return The value of the column 'DOOR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDoorId() {
        checkSpecifiedProperty("doorId");
        return _doorId;
    }

    /**
     * [set] (ドアID)DOOR_ID: {IX+, NotNull, INT(10), FK to door} <br>
     * ひとつひとつのドアに割り当てられたID。
     * @param doorId The value of the column 'DOOR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDoorId(Integer doorId) {
        registerModifiedProperty("doorId");
        _doorId = doorId;
    }

    /**
     * [get] (ドアステータス)DOOR_STATIS: {NotNull, BIT} <br>
     * ドアが閉まっている時がfalse、空いている時がtrue
     * @return The value of the column 'DOOR_STATIS'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDoorStatis() {
        checkSpecifiedProperty("doorStatis");
        return _doorStatis;
    }

    /**
     * [set] (ドアステータス)DOOR_STATIS: {NotNull, BIT} <br>
     * ドアが閉まっている時がfalse、空いている時がtrue
     * @param doorStatis The value of the column 'DOOR_STATIS'. (basically NotNull if update: for the constraint)
     */
    public void setDoorStatis(Boolean doorStatis) {
        registerModifiedProperty("doorStatis");
        _doorStatis = doorStatis;
    }

    /**
     * [get] (センサー距離)SENSOR_DISTATNCE: {NotNull, INT(10)} <br>
     * ドアとセンサーとの距離。センサーの位置によって空いている、閉まっているの判断基準が変わる。距離だけでは、判断できない。
     * @return The value of the column 'SENSOR_DISTATNCE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSensorDistatnce() {
        checkSpecifiedProperty("sensorDistatnce");
        return _sensorDistatnce;
    }

    /**
     * [set] (センサー距離)SENSOR_DISTATNCE: {NotNull, INT(10)} <br>
     * ドアとセンサーとの距離。センサーの位置によって空いている、閉まっているの判断基準が変わる。距離だけでは、判断できない。
     * @param sensorDistatnce The value of the column 'SENSOR_DISTATNCE'. (basically NotNull if update: for the constraint)
     */
    public void setSensorDistatnce(Integer sensorDistatnce) {
        registerModifiedProperty("sensorDistatnce");
        _sensorDistatnce = sensorDistatnce;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {IX+, NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {IX+, NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }
}
