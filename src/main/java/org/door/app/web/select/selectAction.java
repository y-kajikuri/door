package org.door.app.web.select;

import javax.annotation.Resource;

import org.door.app.web.insert.InsertForm;
import org.door.dbflute.exbhv.DoorBhv;
import org.door.mylasta.action.DoorHtmlPath;
import org.lastaflute.web.Execute;
import org.lastaflute.web.LastaAction;
import org.lastaflute.web.response.HtmlResponse;

public class selectAction extends LastaAction implements DoorHtmlPath {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private DoorBhv doorBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public HtmlResponse index(InsertForm form) {

        return asHtml(path_Insert_InsertHtml).renderWith(data -> {
            data.register("bean", bean);
        });
    }

}
