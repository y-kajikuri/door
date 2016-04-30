package org.door.app.web.insert;

import javax.annotation.Resource;

import org.door.dbflute.exbhv.DoorBhv;
import org.door.dbflute.exbhv.DoorSensorLogBhv;
import org.door.dbflute.exentity.Door;
import org.door.dbflute.exentity.DoorSensorLog;
import org.door.mylasta.action.DoorHtmlPath;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.web.Execute;
import org.lastaflute.web.LastaAction;
import org.lastaflute.web.response.HtmlResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author y-kajikuri
 */
public class InsertAction extends LastaAction implements DoorHtmlPath {

    private static final Logger logger = LoggerFactory.getLogger(InsertAction.class);
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private DoorSensorLogBhv doorSensorLogBhv;
    @Resource
    private DoorBhv doorBhv;
    @Resource
    private TimeManager timeManager;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public HtmlResponse index(InsertForm form) {
        insertSensorLog(form);
        InsertRowBean bean = setBean();
        return asHtml(path_Insert_InsertHtml).renderWith(data -> {
            data.register("bean", bean);
        });
    }

    public void insertSensorLog(InsertForm form) {
        Integer doorId = form.doorId;
        Integer distance = form.distance;
        logger.debug("doorId: {}, distance: {}", doorId, distance);

        DoorSensorLog log = new DoorSensorLog();
        log.setDoorId(doorId);
        log.setDoorStatis(isDoorOpen(doorId, distance));
        log.setSensorDistance(distance);
        log.setRegisterDatetime(timeManager.currentDateTime());
        doorSensorLogBhv.insert(log);
    }

    private boolean isDoorOpen(int doorId, int distance) {
        Door door = doorBhv.selectEntity(cb -> {
            cb.specify().columnMin();
            cb.specify().columnMax();
            cb.acceptPK(doorId);
        }).get();
        return (distance < door.getMin().intValue() && door.getMax().intValue() < distance);
    }

    private InsertRowBean setBean() {
        InsertRowBean bean = new InsertRowBean();
        bean.messege = "OK";
        return bean;
    }
}
