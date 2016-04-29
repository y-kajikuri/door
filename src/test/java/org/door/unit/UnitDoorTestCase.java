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
package org.door.unit;

import java.util.List;
import java.util.Map;

import org.dbflute.utflute.lastaflute.WebContainerTestCase;

/**
 * Use like this:
 * <pre>
 * YourTest extends {@link UnitDoorTestCase} {
 * 
 *     public void test_yourMethod() {
 *         <span style="color: #3F7E5E">// ## Arrange ##</span>
 *         YourAction action = new YourAction();
 *         <span style="color: #FD4747">inject</span>(action);
 * 
 *         <span style="color: #3F7E5E">// ## Act ##</span>
 *         action.submit();
 * 
 *         <span style="color: #3F7E5E">// ## Assert ##</span>
 *         assertTrue(action...);
 *     }
 * }
 * </pre>
 * @author jflute
 */
public abstract class UnitDoorTestCase extends WebContainerTestCase {

    protected <ELEMENT> List<ELEMENT> requiredBeans(Map<String, Object> htmlData, Class<ELEMENT> beanType) {
        @SuppressWarnings("unchecked")
        List<ELEMENT> beans = (List<ELEMENT>) htmlData.get("beans");
        assertNotNull(beans);
        assertHasAnyElement(beans);
        assertTrue(beanType.isAssignableFrom(beans.get(0).getClass()));
        return beans;
    }
}
