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

import org.door.mylasta.action.DoorUserBean;

/**
 * @author jflute
 */
public class DoorHeaderBean {

    private static final DoorHeaderBean EMPTY_INSTANCE = new DoorHeaderBean();

    public final Integer memberId;
    public final String memberName;
    public final boolean isLogin;

    private DoorHeaderBean() {
        this.memberId = null;
        this.memberName = null;
        this.isLogin = false;
    }

    public DoorHeaderBean(DoorUserBean userBean) {
        this.memberId = userBean.getMemberId();
        this.memberName = userBean.getMemberName();
        this.isLogin = true;
    }

    public static DoorHeaderBean empty() {
        return EMPTY_INSTANCE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(memberId);
        sb.append(",");
        sb.append(memberName);
        if (isLogin) {
            sb.append(", login");
        }
        sb.append("}");
        return sb.toString();
    }
}
