

/* Create Tables */

CREATE TABLE DOOR
(
	DOOR_ID INT NOT NULL COMMENT 'ドアID : ひとつひとつのドアに割り当てられたID。
階数+ドアの番号となっている。
ドアの番号は、部屋の入り口から見て左回りに順番にインクリメント。
ex: 6階、入って一番右端にあるドアID => 61',
	DOOR_NAME VARCHAR(10) COMMENT 'ドア名 : ドアの名前。お気に入りの名前をつければ愛着が湧くはず。。。',
	MIN INT NOT NULL COMMENT '最小値 : ドアが閉まっていると判断する最小値',
	MAX INT NOT NULL COMMENT '最大値 : ドアが閉まっていると判断する最大値',
	PRIMARY KEY (DOOR_ID)
) COMMENT = 'ドア : ドアの情報を保持する。設置したセンサーの位置によって最小値、最大値を調整する。';


CREATE TABLE DOOR_SENSOR_LOG
(
	DOOR_SENSOR_LOG_ID INT NOT NULL AUTO_INCREMENT COMMENT 'ドアセンサーログID : 連番として自動採番される。',
	DOOR_ID INT NOT NULL COMMENT 'ドアID : ひとつひとつのドアに割り当てられたID。
階数+ドアの番号となっている。
ドアの番号は、部屋の入り口から見て左回りに順番にインクリメント。
ex: 6階、入って一番右端にあるドアID => 61',
	DOOR_STATUS BOOLEAN NOT NULL COMMENT 'ドアステータス : ドアが閉まっている時がfalse、空いている時がtrue',
	SENSOR_DISTANCE INT NOT NULL COMMENT 'センサー距離 : ドアとセンサーとの距離。センサーの位置によって空いている、閉まっているの判断基準が変わる。距離だけでは、判断できない。',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時',
	PRIMARY KEY (DOOR_SENSOR_LOG_ID)
) COMMENT = 'ドアセンサーログ : センサーが取得した距離データを保持する。
ドアIDと距離から、ドアが開いているかどうかの判定を行い、ドアステータスで管理している。';



/* Create Indexes */

CREATE INDEX INDEX_DOOR_ID_REGISTER_DATETIME ON DOOR_SENSOR_LOG (DOOR_ID ASC);



/* Create Foreign Keys */

ALTER TABLE DOOR_SENSOR_LOG
	ADD FOREIGN KEY (DOOR_ID)
	REFERENCES DOOR (DOOR_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



