package org.door.app.web.select;

import javax.annotation.Resource;

import org.door.dbflute.exbhv.DoorBhv;
import org.door.dbflute.exentity.Door;
import org.door.mylasta.action.DoorHtmlPath;
import org.lastaflute.web.Execute;
import org.lastaflute.web.LastaAction;

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
    public voud index() {

        asHtml(path_Insert_InsertHtml).renderWith(data -> {
            // data.register("bean", bean);
        });
    }

    private Door selectDoorStatus() {
        doorBhv.selectList(cb -> {
            cb.specify().columnDoorId();
            cb.specify().columnDoorName();
        });
    }

}
