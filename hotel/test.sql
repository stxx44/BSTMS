/*
Navicat MySQL Data Transfer

Source Server         : hotel
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2019-12-30 16:28:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_customer`
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `cno` int(10) NOT NULL,
  `cname` varchar(20) default NULL,
  `gender` varchar(4) default NULL,
  `idcard` varchar(20) default NULL,
  `phone` varchar(20) default NULL,
  `intergral` int(10) default NULL,
  PRIMARY KEY  (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES ('101', 'tom', '男', '21012319981230134', '13666666666', '10');

-- ----------------------------
-- Table structure for `tb_emp`
-- ----------------------------
DROP TABLE IF EXISTS `tb_emp`;
CREATE TABLE `tb_emp` (
  `empno` int(10) NOT NULL auto_increment,
  `ename` varchar(20) NOT NULL,
  `gender` varchar(4) default NULL,
  `birth` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  `account` varchar(20) default NULL,
  `phone` varchar(20) default NULL,
  `state` int(1) default '0',
  `roleid` int(11) default '0',
  PRIMARY KEY  (`empno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_emp
-- ----------------------------
INSERT INTO `tb_emp` VALUES ('1', 'admin', '男', '1992-02-12', '123456', 'admin', '13678951234', '0', '1');
INSERT INTO `tb_emp` VALUES ('2', 'tom', null, null, '123', 'tom', null, '0', '0');
INSERT INTO `tb_emp` VALUES ('3', 'jack', '男', '1998-01-02', '123456', 'jack', '123456878', '0', '0');
INSERT INTO `tb_emp` VALUES ('4', '2', '2', '2', '2', '2', '2', '0', '0');
INSERT INTO `tb_emp` VALUES ('5', '3', '3', '3', '3', '3', '3', '0', '0');

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `ono` int(10) NOT NULL auto_increment,
  `cno` int(10) default NULL,
  `rno` int(10) default NULL,
  `startTime` varchar(20) default NULL,
  `endTime` varchar(20) default NULL,
  `ostate` int(1) default NULL,
  `empno` int(10) default NULL,
  PRIMARY KEY  (`ono`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('1001', '101', '3', '2019-12-30', '2019-12-31', '1', '3');

-- ----------------------------
-- Table structure for `tb_room`
-- ----------------------------
DROP TABLE IF EXISTS `tb_room`;
CREATE TABLE `tb_room` (
  `rno` int(10) NOT NULL auto_increment,
  `tno` int(10) default NULL,
  `rstate` int(1) default NULL,
  `remark` varchar(100) default NULL,
  `rnum` varchar(10) default NULL,
  PRIMARY KEY  (`rno`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_room
-- ----------------------------
INSERT INTO `tb_room` VALUES ('2', '2', '0', '6666', '202');
INSERT INTO `tb_room` VALUES ('3', '2', '1', '备注3', '203');
INSERT INTO `tb_room` VALUES ('4', '2', '0', '111', '204');
INSERT INTO `tb_room` VALUES ('5', '1', '0', '2222', '205');
INSERT INTO `tb_room` VALUES ('6', '2', '0', '22', '206');
INSERT INTO `tb_room` VALUES ('7', '1', '0', '3333444', '207');
INSERT INTO `tb_room` VALUES ('8', '1', '0', '777', '208');
INSERT INTO `tb_room` VALUES ('11', '1', '0', '111', '211');

-- ----------------------------
-- Table structure for `tb_type`
-- ----------------------------
DROP TABLE IF EXISTS `tb_type`;
CREATE TABLE `tb_type` (
  `tno` int(10) NOT NULL auto_increment,
  `tname` varchar(20) default NULL,
  `price` double(16,2) default NULL,
  `totalNum` int(3) default NULL,
  `restNum` int(3) default NULL,
  PRIMARY KEY  (`tno`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_type
-- ----------------------------
INSERT INTO `tb_type` VALUES ('2', '标准间', '150.00', '8', '8');
