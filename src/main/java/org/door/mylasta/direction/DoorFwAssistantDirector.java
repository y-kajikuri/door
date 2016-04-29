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
package org.door.mylasta.direction;

import javax.annotation.Resource;

import org.door.mylasta.direction.sponsor.DoorActionAdjustmentProvider;
import org.door.mylasta.direction.sponsor.DoorApiFailureHook;
import org.door.mylasta.direction.sponsor.DoorCookieResourceProvider;
import org.door.mylasta.direction.sponsor.DoorCurtainBeforeHook;
import org.door.mylasta.direction.sponsor.DoorJsonResourceProvider;
import org.door.mylasta.direction.sponsor.DoorListedClassificationProvider;
import org.door.mylasta.direction.sponsor.DoorMailDeliveryDepartmentCreator;
import org.door.mylasta.direction.sponsor.DoorSecurityResourceProvider;
import org.door.mylasta.direction.sponsor.DoorTimeResourceProvider;
import org.door.mylasta.direction.sponsor.DoorUserLocaleProcessProvider;
import org.door.mylasta.direction.sponsor.DoorUserTimeZoneProcessProvider;
import org.lastaflute.core.direction.CachedFwAssistantDirector;
import org.lastaflute.core.direction.FwAssistDirection;
import org.lastaflute.core.direction.FwCoreDirection;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.core.security.OneWayCryptographer;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.direction.FwDbDirection;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;

/**
 * @author jflute
 */
public class DoorFwAssistantDirector extends CachedFwAssistantDirector {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private DoorConfig doorConfig;

    // ===================================================================================
    //                                                                              Assist
    //                                                                              ======
    @Override
    protected void prepareAssistDirection(FwAssistDirection direction) {
        direction.directConfig(nameList -> nameList.add("door_config.properties"), "door_env.properties");
    }

    // ===================================================================================
    //                                                                               Core
    //                                                                              ======
    @Override
    protected void prepareCoreDirection(FwCoreDirection direction) {
        // this configuration is on door_env.properties because this is true only when development
        direction.directDevelopmentHere(doorConfig.isDevelopmentHere());

        // titles of the application for logging are from configurations
        direction.directLoggingTitle(doorConfig.getDomainTitle(), doorConfig.getEnvironmentTitle());

        // this configuration is on sea_env.properties because it has no influence to production
        // even if you set true manually and forget to set false back
        direction.directFrameworkDebug(doorConfig.isFrameworkDebug()); // basically false

        // you can add your own process when your application is booting
        direction.directCurtainBefore(createCurtainBeforeHook());

        direction.directSecurity(createSecurityResourceProvider());
        direction.directTime(createTimeResourceProvider());
        direction.directJson(createJsonResourceProvider());
        direction.directMail(createMailDeliveryDepartmentCreator().create());
    }

    protected DoorCurtainBeforeHook createCurtainBeforeHook() {
        return new DoorCurtainBeforeHook();
    }

    protected DoorSecurityResourceProvider createSecurityResourceProvider() { // #change_it_first
        final InvertibleCryptographer inver = InvertibleCryptographer.createAesCipher("door:dockside:");
        final OneWayCryptographer oneWay = OneWayCryptographer.createSha256Cryptographer();
        return new DoorSecurityResourceProvider(inver, oneWay);
    }

    protected DoorTimeResourceProvider createTimeResourceProvider() {
        return new DoorTimeResourceProvider(doorConfig);
    }

    protected DoorJsonResourceProvider createJsonResourceProvider() {
        return new DoorJsonResourceProvider();
    }

    protected DoorMailDeliveryDepartmentCreator createMailDeliveryDepartmentCreator() {
        return new DoorMailDeliveryDepartmentCreator(doorConfig);
    }

    // ===================================================================================
    //                                                                                 DB
    //                                                                                ====
    @Override
    protected void prepareDbDirection(FwDbDirection direction) {
        direction.directClassification(createListedClassificationProvider());
    }

    protected ListedClassificationProvider createListedClassificationProvider() {
        return new DoorListedClassificationProvider();
    }

    // ===================================================================================
    //                                                                                Web
    //                                                                               =====
    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        direction.directRequest(createUserLocaleProcessProvider(), createUserTimeZoneProcessProvider());
        direction.directCookie(createCookieResourceProvider());
        direction.directAdjustment(createActionAdjustmentProvider());
        direction.directMessage(nameList -> nameList.add("door_message"), "door_label");
        direction.directApiCall(createApiFailureHook());
        direction.directHtmlRendering(createHtmlRenderingProvider());
    }

    protected DoorUserLocaleProcessProvider createUserLocaleProcessProvider() {
        return new DoorUserLocaleProcessProvider();
    }

    protected DoorUserTimeZoneProcessProvider createUserTimeZoneProcessProvider() {
        return new DoorUserTimeZoneProcessProvider();
    }

    protected DoorCookieResourceProvider createCookieResourceProvider() { // #change_it_first
        final InvertibleCryptographer cr = InvertibleCryptographer.createAesCipher("dockside:door:");
        return new DoorCookieResourceProvider(doorConfig, cr);
    }

    protected DoorActionAdjustmentProvider createActionAdjustmentProvider() {
        return new DoorActionAdjustmentProvider();
    }

    protected DoorApiFailureHook createApiFailureHook() {
        return new DoorApiFailureHook();
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(doorConfig.isDevelopmentHere());
    }
}
