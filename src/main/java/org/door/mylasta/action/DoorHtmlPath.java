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
package org.door.mylasta.action;

import org.lastaflute.web.response.next.HtmlNext;

/**
 * The path definition of HTML.
 * @author FreeGen
 */
public interface DoorHtmlPath {

    /** The path of the HTML: /error/show_errors.html */
    HtmlNext path_Error_ShowErrorsHtml = new HtmlNext("/error/show_errors.html");

    /** The path of the HTML: /insert/insert.html */
    HtmlNext path_Insert_InsertHtml = new HtmlNext("/insert/insert.html");

    /** The path of the HTML: /status/status.html */
    HtmlNext path_Status_StatusHtml = new HtmlNext("/status/status.html");
}
