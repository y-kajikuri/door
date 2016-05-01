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
package org.door.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.door.dbflute.allcommon.*;
import org.door.dbflute.cbean.*;
import org.door.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of door_sensor_log.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsDoorSensorLogCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsDoorSensorLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "door_sensor_log";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogId The value of doorSensorLogId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorSensorLogId_Equal(Integer doorSensorLogId) {
        doSetDoorSensorLogId_Equal(doorSensorLogId);
    }

    protected void doSetDoorSensorLogId_Equal(Integer doorSensorLogId) {
        regDoorSensorLogId(CK_EQ, doorSensorLogId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogId The value of doorSensorLogId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorSensorLogId_NotEqual(Integer doorSensorLogId) {
        doSetDoorSensorLogId_NotEqual(doorSensorLogId);
    }

    protected void doSetDoorSensorLogId_NotEqual(Integer doorSensorLogId) {
        regDoorSensorLogId(CK_NES, doorSensorLogId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogId The value of doorSensorLogId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorSensorLogId_GreaterThan(Integer doorSensorLogId) {
        regDoorSensorLogId(CK_GT, doorSensorLogId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogId The value of doorSensorLogId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorSensorLogId_LessThan(Integer doorSensorLogId) {
        regDoorSensorLogId(CK_LT, doorSensorLogId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogId The value of doorSensorLogId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorSensorLogId_GreaterEqual(Integer doorSensorLogId) {
        regDoorSensorLogId(CK_GE, doorSensorLogId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogId The value of doorSensorLogId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorSensorLogId_LessEqual(Integer doorSensorLogId) {
        regDoorSensorLogId(CK_LE, doorSensorLogId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of doorSensorLogId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of doorSensorLogId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDoorSensorLogId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDoorSensorLogId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of doorSensorLogId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of doorSensorLogId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDoorSensorLogId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDoorSensorLogId(), "DOOR_SENSOR_LOG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogIdList The collection of doorSensorLogId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoorSensorLogId_InScope(Collection<Integer> doorSensorLogIdList) {
        doSetDoorSensorLogId_InScope(doorSensorLogIdList);
    }

    protected void doSetDoorSensorLogId_InScope(Collection<Integer> doorSensorLogIdList) {
        regINS(CK_INS, cTL(doorSensorLogIdList), xgetCValueDoorSensorLogId(), "DOOR_SENSOR_LOG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @param doorSensorLogIdList The collection of doorSensorLogId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoorSensorLogId_NotInScope(Collection<Integer> doorSensorLogIdList) {
        doSetDoorSensorLogId_NotInScope(doorSensorLogIdList);
    }

    protected void doSetDoorSensorLogId_NotInScope(Collection<Integer> doorSensorLogIdList) {
        regINS(CK_NINS, cTL(doorSensorLogIdList), xgetCValueDoorSensorLogId(), "DOOR_SENSOR_LOG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setDoorSensorLogId_IsNull() { regDoorSensorLogId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setDoorSensorLogId_IsNotNull() { regDoorSensorLogId(CK_ISNN, DOBJ); }

    protected void regDoorSensorLogId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoorSensorLogId(), "DOOR_SENSOR_LOG_ID"); }
    protected abstract ConditionValue xgetCValueDoorSensorLogId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorId The value of doorId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_Equal(Integer doorId) {
        doSetDoorId_Equal(doorId);
    }

    protected void doSetDoorId_Equal(Integer doorId) {
        regDoorId(CK_EQ, doorId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorId The value of doorId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_NotEqual(Integer doorId) {
        doSetDoorId_NotEqual(doorId);
    }

    protected void doSetDoorId_NotEqual(Integer doorId) {
        regDoorId(CK_NES, doorId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorId The value of doorId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_GreaterThan(Integer doorId) {
        regDoorId(CK_GT, doorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorId The value of doorId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_LessThan(Integer doorId) {
        regDoorId(CK_LT, doorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorId The value of doorId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_GreaterEqual(Integer doorId) {
        regDoorId(CK_GE, doorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorId The value of doorId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_LessEqual(Integer doorId) {
        regDoorId(CK_LE, doorId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param minNumber The min number of doorId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of doorId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDoorId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDoorId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param minNumber The min number of doorId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of doorId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDoorId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDoorId(), "DOOR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorIdList The collection of doorId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoorId_InScope(Collection<Integer> doorIdList) {
        doSetDoorId_InScope(doorIdList);
    }

    protected void doSetDoorId_InScope(Collection<Integer> doorIdList) {
        regINS(CK_INS, cTL(doorIdList), xgetCValueDoorId(), "DOOR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ドアID)DOOR_ID: {IX, NotNull, INT(10), FK to door}
     * @param doorIdList The collection of doorId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoorId_NotInScope(Collection<Integer> doorIdList) {
        doSetDoorId_NotInScope(doorIdList);
    }

    protected void doSetDoorId_NotInScope(Collection<Integer> doorIdList) {
        regINS(CK_NINS, cTL(doorIdList), xgetCValueDoorId(), "DOOR_ID");
    }

    protected void regDoorId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoorId(), "DOOR_ID"); }
    protected abstract ConditionValue xgetCValueDoorId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアステータス)DOOR_STATUS: {NotNull, BIT}
     * @param doorStatus The value of doorStatus as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorStatus_Equal(Boolean doorStatus) {
        regDoorStatus(CK_EQ, doorStatus);
    }

    protected void regDoorStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoorStatus(), "DOOR_STATUS"); }
    protected abstract ConditionValue xgetCValueDoorStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistance The value of sensorDistance as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSensorDistance_Equal(Integer sensorDistance) {
        doSetSensorDistance_Equal(sensorDistance);
    }

    protected void doSetSensorDistance_Equal(Integer sensorDistance) {
        regSensorDistance(CK_EQ, sensorDistance);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistance The value of sensorDistance as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSensorDistance_NotEqual(Integer sensorDistance) {
        doSetSensorDistance_NotEqual(sensorDistance);
    }

    protected void doSetSensorDistance_NotEqual(Integer sensorDistance) {
        regSensorDistance(CK_NES, sensorDistance);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistance The value of sensorDistance as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSensorDistance_GreaterThan(Integer sensorDistance) {
        regSensorDistance(CK_GT, sensorDistance);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistance The value of sensorDistance as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSensorDistance_LessThan(Integer sensorDistance) {
        regSensorDistance(CK_LT, sensorDistance);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistance The value of sensorDistance as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSensorDistance_GreaterEqual(Integer sensorDistance) {
        regSensorDistance(CK_GE, sensorDistance);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistance The value of sensorDistance as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSensorDistance_LessEqual(Integer sensorDistance) {
        regSensorDistance(CK_LE, sensorDistance);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param minNumber The min number of sensorDistance. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sensorDistance. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSensorDistance_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSensorDistance_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param minNumber The min number of sensorDistance. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sensorDistance. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSensorDistance_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSensorDistance(), "SENSOR_DISTANCE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistanceList The collection of sensorDistance as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSensorDistance_InScope(Collection<Integer> sensorDistanceList) {
        doSetSensorDistance_InScope(sensorDistanceList);
    }

    protected void doSetSensorDistance_InScope(Collection<Integer> sensorDistanceList) {
        regINS(CK_INS, cTL(sensorDistanceList), xgetCValueSensorDistance(), "SENSOR_DISTANCE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (センサー距離)SENSOR_DISTANCE: {NotNull, INT(10)}
     * @param sensorDistanceList The collection of sensorDistance as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSensorDistance_NotInScope(Collection<Integer> sensorDistanceList) {
        doSetSensorDistance_NotInScope(sensorDistanceList);
    }

    protected void doSetSensorDistance_NotInScope(Collection<Integer> sensorDistanceList) {
        regINS(CK_NINS, cTL(sensorDistanceList), xgetCValueSensorDistance(), "SENSOR_DISTANCE");
    }

    protected void regSensorDistance(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSensorDistance(), "SENSOR_DISTANCE"); }
    protected abstract ConditionValue xgetCValueSensorDistance();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorSensorLogCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DoorSensorLogCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorSensorLogCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DoorSensorLogCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorSensorLogCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DoorSensorLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorSensorLogCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DoorSensorLogCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorSensorLogCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DoorSensorLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DoorSensorLogCB&gt;() {
     *     public void query(DoorSensorLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorSensorLogCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DoorSensorLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorSensorLogCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DoorSensorLogCQ sq);

    protected DoorSensorLogCB xcreateScalarConditionCB() {
        DoorSensorLogCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DoorSensorLogCB xcreateScalarConditionPartitionByCB() {
        DoorSensorLogCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DoorSensorLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DOOR_SENSOR_LOG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DoorSensorLogCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DoorSensorLogCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DoorSensorLogCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DOOR_SENSOR_LOG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DoorSensorLogCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DoorSensorLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DoorSensorLogCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected DoorSensorLogCB newMyCB() {
        return new DoorSensorLogCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DoorSensorLogCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
