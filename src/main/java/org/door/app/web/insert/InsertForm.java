package org.door.app.web.insert;

/**
 * センサーから値をDBに追加するAPIのFormクラス
 * @author y-kajikuri
 */
public class InsertForm {

    /** ドアId。センサーが付いているドア固有のId。(NotNull) */
    public Integer doorId;
    /** センサーとドアの距離。(NotNull) */
    public Integer distance;
}
