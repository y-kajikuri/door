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
package org.door.app.web.base;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalObject;
import org.dbflute.optional.OptionalThing;
import org.door.app.logic.context.AccessContextLogic;
import org.lastaflute.db.dbflute.accesscontext.AccessContextArranger;
import org.lastaflute.web.LastaAction;
import org.lastaflute.web.servlet.request.RequestManager;

/**
 * @author jflute
 */
public abstract class DoorBaseAction extends LastaAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The application type for HarBoR, e.g. used by access context. */
    protected static final String APP_TYPE = "DOR"; // #change_it_first

    /** The user type for Member, e.g. used by access context. */
    protected static final String USER_TYPE = "M"; // #change_it_first

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private RequestManager requestManager;
    @Resource
    private AccessContextLogic accessContextLogic;

    // ===================================================================================
    //                                                                      Access Context
    //                                                                      ==============

    protected AccessContextArranger newAccessContextArranger() { // for framework
        return resource -> {
            return accessContextLogic.create(resource, () -> myUserType(), () -> myAppType());
        };
    }

    // ===================================================================================
    //                                                                           User Info
    //                                                                           =========
    protected String myAppType() { // for framework
        return APP_TYPE;
    }

    protected OptionalThing<String> myUserType() { // for framework
        return OptionalObject.of(USER_TYPE); // #app_customize return empty if login is unused
    }
}