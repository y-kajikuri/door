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
 * The base condition-query of door.
 * @author DBFlute(AutoGenerator)
 */
public class BsDoorCQ extends AbstractBsDoorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DoorCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDoorCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from door) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DoorCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DoorCIQ xcreateCIQ() {
        DoorCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DoorCIQ xnewCIQ() {
        return new DoorCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join door on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DoorCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DoorCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _doorId;
    public ConditionValue xdfgetDoorId()
    { if (_doorId == null) { _doorId = nCV(); }
      return _doorId; }
    protected ConditionValue xgetCValueDoorId() { return xdfgetDoorId(); }

    public Map<String, DoorSensorLogCQ> xdfgetDoorId_ExistsReferrer_DoorSensorLogList() { return xgetSQueMap("doorId_ExistsReferrer_DoorSensorLogList"); }
    public String keepDoorId_ExistsReferrer_DoorSensorLogList(DoorSensorLogCQ sq) { return xkeepSQue("doorId_ExistsReferrer_DoorSensorLogList", sq); }

    public Map<String, DoorSensorLogCQ> xdfgetDoorId_NotExistsReferrer_DoorSensorLogList() { return xgetSQueMap("doorId_NotExistsReferrer_DoorSensorLogList"); }
    public String keepDoorId_NotExistsReferrer_DoorSensorLogList(DoorSensorLogCQ sq) { return xkeepSQue("doorId_NotExistsReferrer_DoorSensorLogList", sq); }

    public Map<String, DoorSensorLogCQ> xdfgetDoorId_SpecifyDerivedReferrer_DoorSensorLogList() { return xgetSQueMap("doorId_SpecifyDerivedReferrer_DoorSensorLogList"); }
    public String keepDoorId_SpecifyDerivedReferrer_DoorSensorLogList(DoorSensorLogCQ sq) { return xkeepSQue("doorId_SpecifyDerivedReferrer_DoorSensorLogList", sq); }

    public Map<String, DoorSensorLogCQ> xdfgetDoorId_QueryDerivedReferrer_DoorSensorLogList() { return xgetSQueMap("doorId_QueryDerivedReferrer_DoorSensorLogList"); }
    public String keepDoorId_QueryDerivedReferrer_DoorSensorLogList(DoorSensorLogCQ sq) { return xkeepSQue("doorId_QueryDerivedReferrer_DoorSensorLogList", sq); }
    public Map<String, Object> xdfgetDoorId_QueryDerivedReferrer_DoorSensorLogListParameter() { return xgetSQuePmMap("doorId_QueryDerivedReferrer_DoorSensorLogList"); }
    public String keepDoorId_QueryDerivedReferrer_DoorSensorLogListParameter(Object pm) { return xkeepSQuePm("doorId_QueryDerivedReferrer_DoorSensorLogList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_DoorId_Asc() { regOBA("DOOR_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ドアID)DOOR_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_DoorId_Desc() { regOBD("DOOR_ID"); return this; }

    protected ConditionValue _doorName;
    public ConditionValue xdfgetDoorName()
    { if (_doorName == null) { _doorName = nCV(); }
      return _doorName; }
    protected ConditionValue xgetCValueDoorName() { return xdfgetDoorName(); }

    /** 
     * Add order-by as ascend. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_DoorName_Asc() { regOBA("DOOR_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ドア名)DOOR_NAME: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_DoorName_Desc() { regOBD("DOOR_NAME"); return this; }

    protected ConditionValue _min;
    public ConditionValue xdfgetMin()
    { if (_min == null) { _min = nCV(); }
      return _min; }
    protected ConditionValue xgetCValueMin() { return xdfgetMin(); }

    /** 
     * Add order-by as ascend. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_Min_Asc() { regOBA("MIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * (最小値)MIN: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_Min_Desc() { regOBD("MIN"); return this; }

    protected ConditionValue _max;
    public ConditionValue xdfgetMax()
    { if (_max == null) { _max = nCV(); }
      return _max; }
    protected ConditionValue xgetCValueMax() { return xdfgetMax(); }

    /** 
     * Add order-by as ascend. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_Max_Asc() { regOBA("MAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * (最大値)MAX: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsDoorCQ addOrderBy_Max_Desc() { regOBD("MAX"); return this; }

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
    public BsDoorCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsDoorCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DoorCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DoorCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DoorCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DoorCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DoorCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DoorCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DoorCQ> _myselfExistsMap;
    public Map<String, DoorCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DoorCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DoorCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DoorCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DoorCB.class.getName(); }
    protected String xCQ() { return DoorCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
