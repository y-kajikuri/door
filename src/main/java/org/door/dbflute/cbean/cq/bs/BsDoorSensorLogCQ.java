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

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.door.dbflute.cbean.cq.ciq.*;
import org.door.dbflute.cbean.*;
import org.door.dbflute.cbean.cq.*;

/**
 * The base condition-query of door_sensor_log.
 * @author DBFlute(AutoGenerator)
 */
public class BsDoorSensorLogCQ extends AbstractBsDoorSensorLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DoorSensorLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDoorSensorLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from door_sensor_log) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DoorSensorLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DoorSensorLogCIQ xcreateCIQ() {
        DoorSensorLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DoorSensorLogCIQ xnewCIQ() {
        return new DoorSensorLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join door_sensor_log on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DoorSensorLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DoorSensorLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _doorSensorLogId;
    public ConditionValue xdfgetDoorSensorLogId()
    { if (_doorSensorLogId == null) { _doorSensorLogId = nCV(); }
      return _doorSensorLogId; }
    protected ConditionValue xgetCValueDoorSensorLogId() { return xdfgetDoorSensorLogId(); }

    /** 
     * Add order-by as ascend. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_DoorSensorLogId_Asc() { regOBA("DOOR_SENSOR_LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ドアセンサーログID)DOOR_SENSOR_LOG_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_DoorSensorLogId_Desc() { regOBD("DOOR_SENSOR_LOG_ID"); return this; }

    protected ConditionValue _doorId;
    public ConditionValue xdfgetDoorId()
    { if (_doorId == null) { _doorId = nCV(); }
      return _doorId; }
    protected ConditionValue xgetCValueDoorId() { return xdfgetDoorId(); }

    /** 
     * Add order-by as ascend. <br>
     * (ドアID)DOOR_ID: {IX+, NotNull, INT(10), FK to door}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_DoorId_Asc() { regOBA("DOOR_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ドアID)DOOR_ID: {IX+, NotNull, INT(10), FK to door}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_DoorId_Desc() { regOBD("DOOR_ID"); return this; }

    protected ConditionValue _doorStatis;
    public ConditionValue xdfgetDoorStatis()
    { if (_doorStatis == null) { _doorStatis = nCV(); }
      return _doorStatis; }
    protected ConditionValue xgetCValueDoorStatis() { return xdfgetDoorStatis(); }

    /** 
     * Add order-by as ascend. <br>
     * (ドアステータス)DOOR_STATIS: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_DoorStatis_Asc() { regOBA("DOOR_STATIS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ドアステータス)DOOR_STATIS: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_DoorStatis_Desc() { regOBD("DOOR_STATIS"); return this; }

    protected ConditionValue _sensorDistatnce;
    public ConditionValue xdfgetSensorDistatnce()
    { if (_sensorDistatnce == null) { _sensorDistatnce = nCV(); }
      return _sensorDistatnce; }
    protected ConditionValue xgetCValueSensorDistatnce() { return xdfgetSensorDistatnce(); }

    /** 
     * Add order-by as ascend. <br>
     * (センサー距離)SENSOR_DISTATNCE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_SensorDistatnce_Asc() { regOBA("SENSOR_DISTATNCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (センサー距離)SENSOR_DISTATNCE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_SensorDistatnce_Desc() { regOBD("SENSOR_DISTATNCE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsDoorSensorLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DoorSensorLogCQ bq = (DoorSensorLogCQ)bqs;
        DoorSensorLogCQ uq = (DoorSensorLogCQ)uqs;
        if (bq.hasConditionQueryDoor()) {
            uq.queryDoor().reflectRelationOnUnionQuery(bq.queryDoor(), uq.queryDoor());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (ドア)DOOR by my DOOR_ID, named 'door'.
     * @return The instance of condition-query. (NotNull)
     */
    public DoorCQ queryDoor() {
        return xdfgetConditionQueryDoor();
    }
    public DoorCQ xdfgetConditionQueryDoor() {
        String prop = "door";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryDoor()); xsetupOuterJoinDoor(); }
        return xgetQueRlMap(prop);
    }
    protected DoorCQ xcreateQueryDoor() {
        String nrp = xresolveNRP("door_sensor_log", "door"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DoorCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "door", nrp);
    }
    protected void xsetupOuterJoinDoor() { xregOutJo("door"); }
    public boolean hasConditionQueryDoor() { return xhasQueRlMap("door"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DoorSensorLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DoorSensorLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DoorSensorLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DoorSensorLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DoorSensorLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DoorSensorLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DoorSensorLogCQ> _myselfExistsMap;
    public Map<String, DoorSensorLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DoorSensorLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DoorSensorLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DoorSensorLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DoorSensorLogCB.class.getName(); }
    protected String xCQ() { return DoorSensorLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
