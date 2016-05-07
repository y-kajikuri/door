package org.door.app.web.select;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.door.dbflute.exbhv.DoorBhv;
import org.door.dbflute.exentity.Door;
import org.door.mylasta.action.DoorHtmlPath;
import org.lastaflute.web.Execute;
import org.lastaflute.web.LastaAction;
import org.lastaflute.web.response.JsonResponse;

/**
 * DBから最新のセンサーの状態を取得するAPIのActionクラス
 * @author y-kajikuri
 */
public class SelectAction extends LastaAction implements DoorHtmlPath {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private DoorBhv doorBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<List<SelectRowBean>> index(SelectForm form) {
        ListResultBean<Door> doorList = selectDoorStatusList(form);
        List<SelectRowBean> beans = mappingToRowList(doorList);
        return asJson(beans);
    }

    private ListResultBean<Door> selectDoorStatusList(SelectForm form) {
        return doorBhv.selectList(cb -> {
            cb.specify().columnDoorId();
            cb.specify().columnDoorName();
            cb.setupSelect_DoorSensorLogAsLatest();
            cb.specify().specifyDoorSensorLogAsLatest().columnDoorStatus();
            if (!isEmpty(form.doorId)) {
                cb.acceptPK(Integer.parseInt(form.doorId));
            }
        });
    }

    private List<SelectRowBean> mappingToRowList(ListResultBean<Door> doorList) {
        List<SelectRowBean> beans = new ArrayList<>();
        doorList.forEach(door -> {
            beans.add(convertToBean(door));
        });
        return beans;
    }

    private SelectRowBean convertToBean(Door door) {
        SelectRowBean bean = new SelectRowBean();
        bean.doorId = door.getDoorId();
        bean.doorName = door.getDoorName();
        door.getDoorSensorLogAsLatest().ifPresent(log -> {
            bean.doorStatus = log.getDoorStatus() ? "空いてるよー" : "閉まってるよー";
        });
        return bean;
    }

    public static final boolean isEmpty(final String text) {
        return text == null || text.length() == 0;
    }
}
