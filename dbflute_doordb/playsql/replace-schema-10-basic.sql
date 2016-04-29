

/* Create Tables */

CREATE TABLE DOOR
(
	DOOR_ID INT NOT NULL AUTO_INCREMENT COMMENT 'ドアID : ひとつひとつのドアに割り当てられたID。',
	DOOR_NAME VARCHAR(10) COMMENT 'ドア名 : ドアの名前。',
	MIN INT NOT NULL COMMENT '最小値 : ドアが閉まっていると判断する最小値',
	MAX INT NOT NULL COMMENT '最大値 : ドアが閉まっていると判断する最大値',
	PRIMARY KEY (DOOR_ID)
) COMMENT = 'ドア';


CREATE TABLE DOOR_SENSOR_LOG
(
	DOOR_SENSOR_LOG_ID INT NOT NULL AUTO_INCREMENT COMMENT 'ドアセンサーログID : 連番として自動採番される。',
	DOOR_ID INT NOT NULL COMMENT 'ドアID : ひとつひとつのドアに割り当てられたID。',
	DOOR_STATIS BOOLEAN NOT NULL COMMENT 'ドアステータス : ドアが閉まっている時がfalse、空いている時がtrue',
	SENSOR_DISTANCE INT NOT NULL COMMENT 'センサー距離 : ドアとセンサーとの距離。センサーの位置によって空いている、閉まっているの判断基準が変わる。距離だけでは、判断できない。',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時 : レコードが登録された日時',
	REGISTER_USER VARCHAR(200) NOT NULL COMMENT '登録ユーザー : レコードを登録したユーザー',
	PRIMARY KEY (DOOR_SENSOR_LOG_ID)
) COMMENT = 'ドアセンサーログ : 会員のプロフィールやアカウントなどの基本情報を保持する。基本的に物理削除はなく、退会したらステータスが退会会員になる。ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。';



/* Create Indexes */

CREATE INDEX INDEX_DOOR_ID_REGISTER_DATETIME ON DOOR_SENSOR_LOG (REGISTER_DATETIME DESC, DOOR_ID ASC);



/* Create Foreign Keys */

ALTER TABLE DOOR_SENSOR_LOG
	ADD FOREIGN KEY (DOOR_ID)
	REFERENCES DOOR (DOOR_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



