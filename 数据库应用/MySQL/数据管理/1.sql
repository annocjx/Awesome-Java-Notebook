-- 添加记录
-- INSERT [INTO] table_name[(id,...)] {VALUE|VALUES}(VALUES...);
CREATE DATABASE IF NOT EXISTS king DEFAULT CHARACTER SET 'UTF8';
USE king;
CREATE TABLE IF NOT EXISTS user(
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT '编号',
  username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
  age TINYINT UNSIGNED DEFAULT 18 COMMENT '年龄',
  email VARCHAR(50) NOT NULL UNIQUE DEFAULT 'user@qq.com' COMMENT '邮箱'
)ENGINE=INNODB CHARSET=UTF8;
-- 不指定字段名称 的插入方式
INSERT user VALUE(1,'king',24,'12@qq.com');

INSERT user VALUES(NULL,'queen',25,'queen@qq.com');
INSERT user VALUES(NULL,'lili',25,'lili@qq.com');

-- 列出指定字段
INSERT user(username,email) VALUES('rose','rose@qq.com');
INSERT user(username) VALUES('rose1');

-- 一次插入多条记录
-- INSERT tbl_name[(...)] VALUES(...),(...),(...);
INSERT user VALUES(NULL,'a',DEFAULT,DEFAULT),
(NULL,'b',56,'b@qq.com'),
(NULL,'c',15,'c@qq.com');

-- INSERT ... SET 插入形式
-- INSERT tbl_name SET 字段名=值;
INSERT user SET username = 'd',age = 45 ,email='d@qq.com';

-- INSERT .. SELECT
-- INSERT tbl_name[(...)] SELECT 字段名称 ... FROM 表名 [WHERE 条件]
CREATE TABLE test(
  a VARCHAR(20)
);
INSERT test VALUES('AA'),('BB'),('CC');

INSERT user(username) SELECT a FROM test;

-- 修改记录

-- 删除记录

-- 查询记录
