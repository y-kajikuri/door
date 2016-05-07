package org.door.app.web.select;

/**
 * DBから最新のセンサーの状態を取得するAPIのFormクラス
 * @author y-kajikuri
 */
public class SelectForm {

    /** ドアId。指定したらドアの状態だけを取得できる。 (NullAllowed) */
    public String doorId;
}
