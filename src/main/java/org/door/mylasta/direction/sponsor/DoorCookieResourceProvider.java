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
package org.door.mylasta.direction.sponsor;

import org.door.mylasta.direction.DoorConfig;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.web.servlet.cookie.CookieResourceProvider;

/**
 * @author jflute
 */
public class DoorCookieResourceProvider implements CookieResourceProvider {

    protected final DoorConfig doorConfig;
    protected final InvertibleCryptographer cookieCipher;

    public DoorCookieResourceProvider(DoorConfig doorConfig, InvertibleCryptographer cookieCipher) {
        this.doorConfig = doorConfig;
        this.cookieCipher = cookieCipher;
    }

    public String provideDefaultPath() {
        return doorConfig.getCookieDefaultPath();
    }

    public Integer provideDefaultExpire() {
        return doorConfig.getCookieDefaultExpireAsInteger();
    }

    public InvertibleCryptographer provideCipher() {
        return cookieCipher;
    }
}
