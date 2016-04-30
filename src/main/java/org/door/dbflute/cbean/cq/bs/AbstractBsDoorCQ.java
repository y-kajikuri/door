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
 * The abstract condition-query of door.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsDoorCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsDoorCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "door";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
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
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
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
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     * @param doorId The value of doorId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_GreaterThan(Integer doorId) {
        regDoorId(CK_GT, doorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     * @param doorId The value of doorId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_LessThan(Integer doorId) {
        regDoorId(CK_LT, doorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     * @param doorId The value of doorId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_GreaterEqual(Integer doorId) {
        regDoorId(CK_GE, doorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     * @param doorId The value of doorId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoorId_LessEqual(Integer doorId) {
        regDoorId(CK_LE, doorId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
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
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     * @param minNumber The min number of doorId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of doorId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDoorId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDoorId(), "DOOR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
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
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     * @param doorIdList The collection of doorId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoorId_NotInScope(Collection<Integer> doorIdList) {
        doSetDoorId_NotInScope(doorIdList);
    }

    protected void doSetDoorId_NotInScope(Collection<Integer> doorIdList) {
        regINS(CK_NINS, cTL(doorIdList), xgetCValueDoorId(), "DOOR_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DOOR_ID from door_sensor_log where ...)} <br>
     * (ドアセンサーログ)door_sensor_log by DOOR_ID, named 'doorSensorLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsDoorSensorLog</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DoorSensorLogList for 'exists'. (NotNull)
     */
    public void existsDoorSensorLog(SubQuery<DoorSensorLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDoorId_ExistsReferrer_DoorSensorLogList(cb.query());
        registerExistsReferrer(cb.query(), "DOOR_ID", "DOOR_ID", pp, "doorSensorLogList");
    }
    public abstract String keepDoorId_ExistsReferrer_DoorSensorLogList(DoorSensorLogCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DOOR_ID from door_sensor_log where ...)} <br>
     * (ドアセンサーログ)door_sensor_log by DOOR_ID, named 'doorSensorLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsDoorSensorLog</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DoorId_NotExistsReferrer_DoorSensorLogList for 'not exists'. (NotNull)
     */
    public void notExistsDoorSensorLog(SubQuery<DoorSensorLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDoorId_NotExistsReferrer_DoorSensorLogList(cb.query());
        registerNotExistsReferrer(cb.query(), "DOOR_ID", "DOOR_ID", pp, "doorSensorLogList");
    }
    public abstract String keepDoorId_NotExistsReferrer_DoorSensorLogList(DoorSensorLogCQ sq);

    public void xsderiveDoorSensorLogList(String fn, SubQuery<DoorSensorLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDoorId_SpecifyDerivedReferrer_DoorSensorLogList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DOOR_ID", "DOOR_ID", pp, "doorSensorLogList", al, op);
    }
    public abstract String keepDoorId_SpecifyDerivedReferrer_DoorSensorLogList(DoorSensorLogCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from door_sensor_log where ...)} <br>
     * (ドアセンサーログ)door_sensor_log by DOOR_ID, named 'doorSensorLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedDoorSensorLog()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     logCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DoorSensorLogCB> derivedDoorSensorLog() {
        return xcreateQDRFunctionDoorSensorLogList();
    }
    protected HpQDRFunction<DoorSensorLogCB> xcreateQDRFunctionDoorSensorLogList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveDoorSensorLogList(fn, sq, rd, vl, op));
    }
    public void xqderiveDoorSensorLogList(String fn, SubQuery<DoorSensorLogCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorSensorLogCB cb = new DoorSensorLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDoorId_QueryDerivedReferrer_DoorSensorLogList(cb.query()); String prpp = keepDoorId_QueryDerivedReferrer_DoorSensorLogListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DOOR_ID", "DOOR_ID", sqpp, "doorSensorLogList", rd, vl, prpp, op);
    }
    public abstract String keepDoorId_QueryDerivedReferrer_DoorSensorLogList(DoorSensorLogCQ sq);
    public abstract String keepDoorId_QueryDerivedReferrer_DoorSensorLogListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     */
    public void setDoorId_IsNull() { regDoorId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10), FK to DOOR_SENSOR_LOG}
     */
    public void setDoorId_IsNotNull() { regDoorId(CK_ISNN, DOBJ); }

    protected void regDoorId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoorId(), "DOOR_ID"); }
    protected abstract ConditionValue xgetCValueDoorId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     * @param doorName The value of doorName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoorName_Equal(String doorName) {
        doSetDoorName_Equal(fRES(doorName));
    }

    protected void doSetDoorName_Equal(String doorName) {
        regDoorName(CK_EQ, doorName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)} <br>
     * <pre>e.g. setDoorName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param doorName The value of doorName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDoorName_LikeSearch(String doorName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDoorName_LikeSearch(doorName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)} <br>
     * <pre>e.g. setDoorName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param doorName The value of doorName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDoorName_LikeSearch(String doorName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(doorName), xgetCValueDoorName(), "DOOR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     * @param doorName The value of doorName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDoorName_NotLikeSearch(String doorName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDoorName_NotLikeSearch(doorName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     * @param doorName The value of doorName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDoorName_NotLikeSearch(String doorName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(doorName), xgetCValueDoorName(), "DOOR_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     */
    public void setDoorName_IsNull() { regDoorName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     */
    public void setDoorName_IsNullOrEmpty() { regDoorName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     */
    public void setDoorName_IsNotNull() { regDoorName(CK_ISNN, DOBJ); }

    protected void regDoorName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoorName(), "DOOR_NAME"); }
    protected abstract ConditionValue xgetCValueDoorName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param min The value of min as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMin_Equal(Integer min) {
        doSetMin_Equal(min);
    }

    protected void doSetMin_Equal(Integer min) {
        regMin(CK_EQ, min);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param min The value of min as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMin_NotEqual(Integer min) {
        doSetMin_NotEqual(min);
    }

    protected void doSetMin_NotEqual(Integer min) {
        regMin(CK_NES, min);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param min The value of min as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMin_GreaterThan(Integer min) {
        regMin(CK_GT, min);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param min The value of min as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMin_LessThan(Integer min) {
        regMin(CK_LT, min);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param min The value of min as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMin_GreaterEqual(Integer min) {
        regMin(CK_GE, min);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param min The value of min as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMin_LessEqual(Integer min) {
        regMin(CK_LE, min);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param minNumber The min number of min. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of min. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMin_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMin_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param minNumber The min number of min. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of min. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMin_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMin(), "MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param minList The collection of min as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMin_InScope(Collection<Integer> minList) {
        doSetMin_InScope(minList);
    }

    protected void doSetMin_InScope(Collection<Integer> minList) {
        regINS(CK_INS, cTL(minList), xgetCValueMin(), "MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @param minList The collection of min as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMin_NotInScope(Collection<Integer> minList) {
        doSetMin_NotInScope(minList);
    }

    protected void doSetMin_NotInScope(Collection<Integer> minList) {
        regINS(CK_NINS, cTL(minList), xgetCValueMin(), "MIN");
    }

    protected void regMin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMin(), "MIN"); }
    protected abstract ConditionValue xgetCValueMin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param max The value of max as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMax_Equal(Integer max) {
        doSetMax_Equal(max);
    }

    protected void doSetMax_Equal(Integer max) {
        regMax(CK_EQ, max);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param max The value of max as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMax_NotEqual(Integer max) {
        doSetMax_NotEqual(max);
    }

    protected void doSetMax_NotEqual(Integer max) {
        regMax(CK_NES, max);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param max The value of max as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMax_GreaterThan(Integer max) {
        regMax(CK_GT, max);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param max The value of max as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMax_LessThan(Integer max) {
        regMax(CK_LT, max);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param max The value of max as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMax_GreaterEqual(Integer max) {
        regMax(CK_GE, max);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param max The value of max as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMax_LessEqual(Integer max) {
        regMax(CK_LE, max);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param minNumber The min number of max. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of max. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMax_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMax_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param minNumber The min number of max. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of max. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMax_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMax(), "MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param maxList The collection of max as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMax_InScope(Collection<Integer> maxList) {
        doSetMax_InScope(maxList);
    }

    protected void doSetMax_InScope(Collection<Integer> maxList) {
        regINS(CK_INS, cTL(maxList), xgetCValueMax(), "MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @param maxList The collection of max as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMax_NotInScope(Collection<Integer> maxList) {
        doSetMax_NotInScope(maxList);
    }

    protected void doSetMax_NotInScope(Collection<Integer> maxList) {
        regINS(CK_NINS, cTL(maxList), xgetCValueMax(), "MAX");
    }

    protected void regMax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMax(), "MAX"); }
    protected abstract ConditionValue xgetCValueMax();

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
    public HpSLCFunction<DoorCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DoorCB.class);
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
    public HpSLCFunction<DoorCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DoorCB.class);
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
    public HpSLCFunction<DoorCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DoorCB.class);
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
    public HpSLCFunction<DoorCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DoorCB.class);
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
    public HpSLCFunction<DoorCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DoorCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DoorCB&gt;() {
     *     public void query(DoorCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DoorCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DoorCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DoorCQ sq);

    protected DoorCB xcreateScalarConditionCB() {
        DoorCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DoorCB xcreateScalarConditionPartitionByCB() {
        DoorCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DoorCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorCB cb = new DoorCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DOOR_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DoorCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DoorCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DoorCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DoorCB cb = new DoorCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DOOR_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DoorCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DoorCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DoorCB cb = new DoorCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DoorCQ sq);

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
    protected DoorCB newMyCB() {
        return new DoorCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DoorCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
