package org.door.app.web.status;

import org.door.mylasta.action.DoorHtmlPath;
import org.lastaflute.web.Execute;
import org.lastaflute.web.LastaAction;
import org.lastaflute.web.response.HtmlResponse;

public class StatusAction extends LastaAction implements DoorHtmlPath {

    @Execute
    /**
     * トイレの状態を表示するためのアクションメソッド
     * JSPをつくるのが面倒だったのでただのhtmlを返してます。
     * API実行はhtmlからjsでjsonを取得してます。
     * @return
     */
    public HtmlResponse index() {
        return asHtml(path_Status_StatusHtml);
    }
}
