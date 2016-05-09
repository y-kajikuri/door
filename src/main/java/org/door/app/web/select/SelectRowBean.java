package org.door.app.web.select;

import java.time.LocalDateTime;

/**
 * DBから最新のセンサーの状態を取得するAPIのBeanクラス
 * @author y-kajikuri
 *
 */
public class SelectRowBean {

    public Integer doorId;
    public String doorName;
    public String doorStatus;
    public LocalDateTime registerDateTime;
}
