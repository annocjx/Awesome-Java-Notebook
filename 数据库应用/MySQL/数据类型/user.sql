-- 创建数据库
CREATE DATABASE IF NOT EXISTS db_user DEFAULT CHARACTER SET 'UTF8';

-- 打开数据库
USE db_user;

-- 创建用户表
CREATE TABLE IF NOT EXISTS user(
  id INT,
  username VARCHAR(20),
  password CHAR(30),
  email VARCHAR(50),
  age TINYINT,
  card CHAR(18),
  tel CHAR(11),
  salary float(8,2),
  married TINYINT(1),
  addr VARCHAR(100),
  sex ENUM('男','女','保密')
)ENGINE=INNODB CHARSET=UTF8;

-- 查看当前数据库的数据表
SHOW FULL TABLES FROM db_user;

-- 查看表的详细信息
SHOW CREATE TABLE user;

-- 三种方式查看指定数据表结构信息
DESC user;

DESCRIBE user;

SHOW COLUMNS FROM user;

-- 删除数据表
DROP TABLE IF EXISTS user;
