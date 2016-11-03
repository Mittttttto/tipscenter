/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : yuyu

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2016-03-28 16:11:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pwd` varchar(255) DEFAULT NULL,
  `lastlogin` date DEFAULT NULL COMMENT '最后一次登录',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `time` datetime DEFAULT NULL COMMENT '回复时间',
  `cid` bigint(20) DEFAULT NULL COMMENT '回复用户id',
  `content` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `recid` bigint(20) DEFAULT NULL COMMENT '回复的用户id   若无则为-1',
  `iid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `state` int(1) DEFAULT '0' COMMENT '状态       0  未回复    1  已回复     3删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '2016-03-28 15:33:00', '1', '这个机子有点贵   降个价吧', '-1', '1459147931761925', '1');
INSERT INTO `comment` VALUES ('2', '2016-03-28 15:44:42', '1', '这个价格有点美丽，会不会质量有问题', '-1', '1459147845472905', '1');
INSERT INTO `comment` VALUES ('3', '2016-03-28 15:45:19', '3', '不要担心 ，质量没有问题，与其等他降价，还不如早点出手', '1', '1459147845472905', '1');
INSERT INTO `comment` VALUES ('4', '2016-03-28 15:46:11', '1', '好，我下单了哦', '3', '1459147845472905', '0');
INSERT INTO `comment` VALUES ('5', '2016-03-28 15:50:46', '1', '这个熊有点可爱的', '-1', '1459148481416563', '1');
INSERT INTO `comment` VALUES ('6', '2016-03-28 15:52:53', '3', '你好，能降价嘛？', '-1', '1459147931761925', '1');
INSERT INTO `comment` VALUES ('7', '2016-03-28 15:54:15', '3', '在么？', '-1', '1459147931761925', '1');

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机',
  `cid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `recivername` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `state` int(1) DEFAULT '0' COMMENT '1 为删除   0为未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES ('1', '测试数据', '15757175517', '1', '毛文涛', '0');
INSERT INTO `contact` VALUES ('2', '测试数据2', '1212121212', '1', '测试数据222', '1');
INSERT INTO `contact` VALUES ('9', '杭州市', '16767165516', '1', '毛文涛', '0');
INSERT INTO `contact` VALUES ('10', '测试数据', '15757175517', '1', '测试数据测试', '0');
INSERT INTO `contact` VALUES ('11', '下城区', '15757157121', '3', '毛文涛', '0');
INSERT INTO `contact` VALUES ('12', '江干区 杭电', '11268361234', '3', '毛文涛', '0');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户名',
  `mobile` varchar(11) CHARACTER SET utf8 DEFAULT NULL COMMENT '电话',
  `email` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '联系邮箱',
  `pwd` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'mao', '15757175517', '376901333@qq.com', 'mao111');
INSERT INTO `customer` VALUES ('2', 'zhuo', '15757175517', '376901333@qq.com', 'mao111');
INSERT INTO `customer` VALUES ('3', 'li', '15757175517', '376901333@qq.com', 'mao1111');

-- ----------------------------
-- Table structure for favorite
-- ----------------------------
DROP TABLE IF EXISTS `favorite`;
CREATE TABLE `favorite` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `iid` bigint(20) DEFAULT NULL COMMENT '商品id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of favorite
-- ----------------------------
INSERT INTO `favorite` VALUES ('2', '3', '1459147668934330');
INSERT INTO `favorite` VALUES ('3', '1', '1459147845472905');
INSERT INTO `favorite` VALUES ('4', '1', '1459147931761925');
INSERT INTO `favorite` VALUES ('5', '3', '1459149093339377');

-- ----------------------------
-- Table structure for findpwd
-- ----------------------------
DROP TABLE IF EXISTS `findpwd`;
CREATE TABLE `findpwd` (
  `id` bigint(255) NOT NULL,
  `cid` bigint(255) DEFAULT NULL COMMENT '用户id',
  `deadtime` datetime DEFAULT NULL COMMENT '死亡时间',
  `findcode` varchar(255) DEFAULT NULL COMMENT '找回密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of findpwd
-- ----------------------------
INSERT INTO `findpwd` VALUES ('0', '1', '2016-03-23 19:40:19', '887383');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` bigint(22) NOT NULL COMMENT '商品id',
  `description` varchar(255) DEFAULT NULL COMMENT '商品详情',
  `state` int(2) DEFAULT NULL COMMENT '商品状态    0 在架  1 竞拍中   2 已售   3 下架  4 流拍  5交易中 ',
  `cid` bigint(22) DEFAULT NULL COMMENT '发布者的id',
  `picurl` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `counttime` int(11) DEFAULT '0' COMMENT '计时时间',
  `nowprice` int(11) DEFAULT NULL COMMENT '现在的价格（拍卖）',
  `holderid` bigint(11) DEFAULT NULL COMMENT '叫价台阶',
  `oldprice` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '商品名',
  `contact` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `minipicurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1459147668934330', '<p>红米2A ，性价比高高的。大家快来看看</p>', '2', '1', '/upload/5/36181ecd-7b94-4aa9-bf90-06f155859c84_TB1U2ymLpXXXXcoXFXX0cmw8VXX_032137.jpg_430x430q90.jpg', '0', '800', '3', '20', '2016-03-28 14:47:48', '小米2A', '178781651521', '杭州', '/upload/mini_pic/106daa06-b615-4fcc-927a-419d0de68340_50_50.jpg');
INSERT INTO `item` VALUES ('1459147743267255', '<p>小米4 &nbsp; 性能杠杠的</p>', '1', '3', '/upload/6/ea28f97c-e765-42cd-acbe-3c218e2dcce8_TB1chlFJXXXXXcXXVXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '3', '900', null, '2200', '2016-03-28 14:49:03', '小米4', '189891988819', '杭州', '/upload/mini_pic/97587cd0-57f6-4c90-9cd7-1d3372217afb_50_50.jpg');
INSERT INTO `item` VALUES ('1459147845472905', '<p>5s，经典设计，苹果出品。</p>', '1', '3', '/upload/6/c54ac86e-6721-45d4-885d-5245db9d99df_TB1968lFVXXXXckXVXXQ456_XXX_052815.jpg_430x430q90.jpg', '3', '1002', '1', '2000', '2016-03-28 14:50:45', '苹果5S', '15757175517', '杭州', '/upload/mini_pic/4e4bf0e5-1013-4e6c-9767-d95e8d2c59f7_50_50.jpg');
INSERT INTO `item` VALUES ('1459147931761925', '<p>有轻微损耗，home键不灵。</p>', '0', '3', '/upload/11/61a067c0-ecc4-46be-b3b2-ef290db32785_TB1aY.WJVXXXXX_XXXX.Rd.FFXX_093420.jpg_430x430q90.jpg', '0', '3700', null, '5000', '2016-03-28 14:52:11', '苹果6s', '19090187712', '北京', '/upload/mini_pic/5bb21343-6f8e-4497-88d2-9e1cf267d06f_50_50.jpg');
INSERT INTO `item` VALUES ('1459148240611122', '<p>大号熊宝贝 &nbsp;期待你带回家</p>', '0', '2', '/upload/7/24848149-59d5-4d22-9925-0eab27fbb7c6_TB2NNh3cXXXXXa6XpXXXXXXXXXX_!!1649131717.jpg_430x430q90.jpg', '0', '200', null, '500', '2016-03-28 14:57:20', '熊宝贝', '1898917721', '上海', '/upload/mini_pic/d9076f07-9b69-4b10-9735-1571339b4995_50_50.jpg');
INSERT INTO `item` VALUES ('1459148348130743', '<p>临保产品，没有需求的朋友不要下单</p>', '0', '2', '/upload/10/348f91c0-92ea-461a-b45e-bb2b5f184f85_TB2J5FPaVXXXXafXpXXXXXXXXXX_!!880496338.jpg_430x430q90.jpg', '0', '40', null, '80', '2016-03-28 14:59:08', '洗衣液20瓶', '18981972123', '北京', '/upload/mini_pic/52b0a314-9594-413b-b1ae-ae3c02e55fe9_50_50.jpg');
INSERT INTO `item` VALUES ('1459148421001757', '<p>S6 &nbsp;屏幕有划痕</p>', '1', '1', '/upload/9/fe8aa00e-374a-4fb9-9652-0c987b27f83e_TB2wmRJfFXXXXbGXpXXXXXXXXXX_!!551995190.jpg_430x430q90.jpg', '3', '2300', null, '4000', '2016-03-28 15:00:21', '三星S6', '19090797192', '上海', '/upload/mini_pic/fcffeef6-d92e-4b1e-b614-802898d5511e_50_50.jpg');
INSERT INTO `item` VALUES ('1459148481416563', '<p>我的大雄在哪里啊</p>', '2', '2', '/upload/4/882e022f-cfa8-4d7b-b5c4-bcb84ec42b24_TB1f.XkIXXXXXaGXFXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '0', '20', '1', '20', '2016-03-28 15:01:21', '哆来A梦', '16768125123', '杭州', '/upload/mini_pic/efb28a1b-c2b2-4669-ab09-ab6d4ed4d9d2_50_50.jpg');
INSERT INTO `item` VALUES ('1459148698718326', '<p>p8，国人骄傲</p>', '1', '2', '/upload/4/492b7f4a-2d7b-4ec4-8201-2249b24aa03c_TB2ANJlgFXXXXc2XXXXXXXXXXXX_!!1114511827.jpg_430x430q90.jpg', '7', '1200', null, '3000', '2016-03-28 15:04:58', '华为p8九成新', '178781523512', '杭州', '/upload/mini_pic/2d4fa21d-3c1b-44cc-97a3-0c739c64cf61_50_50.jpg');
INSERT INTO `item` VALUES ('1459148825285387', '<p>大屏手机 ，有点不好用 ，大家看着给吧</p>', '3', '1', '/upload/14/bc72f724-22ce-41b2-bb94-db8743b54ac5_TB2QkR1cVXXXXbpXpXXXXXXXXXX_!!1779341691.jpg_430x430q90.jpg', '3', '500', null, '2000', '2016-03-28 15:07:05', '华为x2', '128931237123', '杭州', '/upload/mini_pic/28eae238-3125-4291-99e7-92a1d49d0bcf_50_50.jpg');
INSERT INTO `item` VALUES ('1459148887558542', '<p>清风纸巾10打，限同城交易</p>', '0', '3', '/upload/1/e8fe6d47-e4ed-4559-bb59-3a49e4bcf517_TB17d3lKFXXXXataXXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '0', '10', null, '40', '2016-03-28 15:08:07', '清风纸巾10打，限同城交易', '127837182963', '杭州', '/upload/mini_pic/a246ae70-b81e-4eb6-b042-ceb38faaa951_50_50.jpg');
INSERT INTO `item` VALUES ('1459149028840624', '<p>小小的哈士奇送给你最爱的宝贝吧</p>', '1', '3', '/upload/4/fc5e98f6-138d-4ef1-9ba5-4b7d4426a5e0_TB2ctR1gVXXXXcmXpXXXXXXXXXX_!!1733418301.jpg_430x430q90.jpg', '7', '10', null, '80', '2016-03-28 15:10:28', '哈士奇玩具', '127837182963', '上海', '/upload/mini_pic/9c277096-acbe-4c92-9b12-eaf05008415c_50_50.jpg');
INSERT INTO `item` VALUES ('1459149093339377', '<p>快带回家给小朋友们吧</p>', '2', '1', '/upload/12/91cf21a6-1ae9-494c-b35e-ab975bbae09f_TB2qa5QjFXXXXbuXpXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '0', '25', '3', '20', '2016-03-28 15:11:33', '熊出没玩具', '1239871982', '杭州', '/upload/mini_pic/5310ce29-e545-4b14-96ae-705330a3769f_50_50.jpg');

-- ----------------------------
-- Table structure for itempic
-- ----------------------------
DROP TABLE IF EXISTS `itempic`;
CREATE TABLE `itempic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图片id',
  `iid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `picurl` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `ismain` int(1) DEFAULT '0' COMMENT '是否为主图 1为 主图',
  `minipicurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of itempic
-- ----------------------------
INSERT INTO `itempic` VALUES ('33', '1459147668934330', '/upload/5/36181ecd-7b94-4aa9-bf90-06f155859c84_TB1U2ymLpXXXXcoXFXX0cmw8VXX_032137.jpg_430x430q90.jpg', '1', '/upload/mini_pic/106daa06-b615-4fcc-927a-419d0de68340_50_50.jpg');
INSERT INTO `itempic` VALUES ('34', '1459147668934330', '/upload/5/78e7fd6c-6673-40b1-a3ab-5e8cc79c1f04_TB2h2fejFXXXXbPXpXXXXXXXXXX_!!1714128138.jpg_430x430q90.jpg', '0', '/upload/mini_pic/86d0cafc-1243-437e-bf04-b760275ca504_50_50.jpg');
INSERT INTO `itempic` VALUES ('35', '1459147668934330', '/upload/4/424cd173-4dc1-4e20-a0a7-235b3d7e4bff_TB2tLrujFXXXXcvXXXXXXXXXXXX_!!1714128138.jpg_430x430q90.jpg', '0', '/upload/mini_pic/d0bfe662-1dde-490b-8ac5-415cc2c4cb01_50_50.jpg');
INSERT INTO `itempic` VALUES ('36', '1459147743267255', '/upload/6/ea28f97c-e765-42cd-acbe-3c218e2dcce8_TB1chlFJXXXXXcXXVXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '1', '/upload/mini_pic/97587cd0-57f6-4c90-9cd7-1d3372217afb_50_50.jpg');
INSERT INTO `itempic` VALUES ('37', '1459147743267255', '/upload/8/9338c234-4da8-49ce-bb9a-5b0108326b03_TB1FKqBFVXXXXbtXVXXha9P9XXX_035231.jpg_430x430q90.jpg', '0', '/upload/mini_pic/555d22fc-c08b-4cda-9631-c09215a2f2a8_50_50.jpg');
INSERT INTO `itempic` VALUES ('38', '1459147743267255', '/upload/1/6ce028dc-d09b-4268-8b4e-9b3b4a581cc7_TB2a4ztcVXXXXcoXXXXXXXXXXXX_!!1718094179.png_430x430q90.jpg', '0', '/upload/mini_pic/42ff0c3e-238a-4838-89d4-3517ace951ef_50_50.jpg');
INSERT INTO `itempic` VALUES ('39', '1459147743267255', '/upload/12/74f4e119-6333-4475-a206-25738c5f19b9_TB2mqzncVXXXXaUXpXXXXXXXXXX_!!1718094179.png_430x430q90.jpg', '0', '/upload/mini_pic/f2f42b0a-7354-4218-87ba-79a7a29ed4d2_50_50.jpg');
INSERT INTO `itempic` VALUES ('40', '1459147845472905', '/upload/8/6c5aa4e4-720a-4b59-a8c2-9dd26690f6b2_T16ri0XCNhXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '0', '/upload/mini_pic/34ef38e7-1204-486a-a33e-07b2633ba4b1_50_50.jpg');
INSERT INTO `itempic` VALUES ('41', '1459147845472905', '/upload/6/c54ac86e-6721-45d4-885d-5245db9d99df_TB1968lFVXXXXckXVXXQ456_XXX_052815.jpg_430x430q90.jpg', '1', '/upload/mini_pic/4e4bf0e5-1013-4e6c-9767-d95e8d2c59f7_50_50.jpg');
INSERT INTO `itempic` VALUES ('42', '1459147845472905', '/upload/0/653e5e1e-56cc-4bbd-ad3c-98b736394b52_TB29T5JeVXXXXb5XXXXXXXXXXXX_!!263726286.jpg_430x430q90.jpg', '0', '/upload/mini_pic/f483bfab-67b1-48d8-bc98-6b4f1342c363_50_50.jpg');
INSERT INTO `itempic` VALUES ('43', '1459147931761925', '/upload/11/61a067c0-ecc4-46be-b3b2-ef290db32785_TB1aY.WJVXXXXX_XXXX.Rd.FFXX_093420.jpg_430x430q90.jpg', '1', '/upload/mini_pic/5bb21343-6f8e-4497-88d2-9e1cf267d06f_50_50.jpg');
INSERT INTO `itempic` VALUES ('44', '1459147931761925', '/upload/2/adece889-d690-47c2-8d15-c470802f98d9_TB2gJNDfFXXXXaZXXXXXXXXXXXX_!!263726286.jpg_430x430q90.jpg', '0', '/upload/mini_pic/9c87c7fa-6412-4f1f-9fe9-9af443c22c56_50_50.jpg');
INSERT INTO `itempic` VALUES ('45', '1459147931761925', '/upload/5/5dc411be-28f2-46fa-beac-27137dad0780_TB2Qq0gfFXXXXbrXpXXXXXXXXXX_!!263726286.jpg_430x430q90.jpg', '0', '/upload/mini_pic/235c0bad-c470-4cf7-816f-7ae7518e0e9c_50_50.jpg');
INSERT INTO `itempic` VALUES ('46', '1459148240611122', '/upload/7/24848149-59d5-4d22-9925-0eab27fbb7c6_TB2NNh3cXXXXXa6XpXXXXXXXXXX_!!1649131717.jpg_430x430q90.jpg', '1', '/upload/mini_pic/d9076f07-9b69-4b10-9735-1571339b4995_50_50.jpg');
INSERT INTO `itempic` VALUES ('47', '1459148240611122', '/upload/4/569612a6-3cdb-4624-97ce-00f4560c8712_TB2sKungFXXXXacXpXXXXXXXXXX_!!1649131717.jpg_430x430q90.jpg', '0', '/upload/mini_pic/be1cf78e-4b00-4eba-afbe-2337f3dc89e6_50_50.jpg');
INSERT INTO `itempic` VALUES ('48', '1459148240611122', '/upload/7/d8702ab7-9022-4d51-97c9-1cef597f4f92_TB2yjKXcXXXXXXBXXXXXXXXXXXX_!!1649131717.jpg_430x430q90.jpg', '0', '/upload/mini_pic/bfbe0e12-8d28-4085-a145-2f65bb3fe9b5_50_50.jpg');
INSERT INTO `itempic` VALUES ('49', '1459148348130743', '/upload/7/9a6eee74-eea1-48ee-8dc5-65d0544108d4_TB1XNcNJFXXXXcyXFXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '0', '/upload/mini_pic/96764aeb-a20d-494c-b164-c3cfa001bfff_50_50.jpg');
INSERT INTO `itempic` VALUES ('50', '1459148348130743', '/upload/8/4aac9f10-c779-4531-89ef-94334cc59721_TB2FTA1gpXXXXcmXpXXXXXXXXXX_!!880496338.jpg_430x430q90.jpg', '0', '/upload/mini_pic/b9cbfa1f-16a6-48da-bc98-7bef9674a804_50_50.jpg');
INSERT INTO `itempic` VALUES ('51', '1459148348130743', '/upload/10/348f91c0-92ea-461a-b45e-bb2b5f184f85_TB2J5FPaVXXXXafXpXXXXXXXXXX_!!880496338.jpg_430x430q90.jpg', '1', '/upload/mini_pic/52b0a314-9594-413b-b1ae-ae3c02e55fe9_50_50.jpg');
INSERT INTO `itempic` VALUES ('52', '1459148421001757', '/upload/14/d869098f-69ca-48bd-aa7d-fa3640511321_TB1es0ZJXXXXXceXFXXZk3v9FXX_044956.jpg_430x430q90.jpg', '0', '/upload/mini_pic/4c52b14b-9d1d-4b14-a7f6-06e5d3bd03eb_50_50.jpg');
INSERT INTO `itempic` VALUES ('53', '1459148421001757', '/upload/8/939d2d87-b56c-4736-a1eb-d3c4070276fc_TB2ND8HfFXXXXcaXpXXXXXXXXXX_!!551995190.jpg_430x430q90.jpg', '0', '/upload/mini_pic/46dcfab8-af51-4b17-8407-719d8c84ff95_50_50.jpg');
INSERT INTO `itempic` VALUES ('54', '1459148421001757', '/upload/9/fe8aa00e-374a-4fb9-9652-0c987b27f83e_TB2wmRJfFXXXXbGXpXXXXXXXXXX_!!551995190.jpg_430x430q90.jpg', '1', '/upload/mini_pic/fcffeef6-d92e-4b1e-b614-802898d5511e_50_50.jpg');
INSERT INTO `itempic` VALUES ('55', '1459148481416563', '/upload/4/882e022f-cfa8-4d7b-b5c4-bcb84ec42b24_TB1f.XkIXXXXXaGXFXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '1', '/upload/mini_pic/efb28a1b-c2b2-4669-ab09-ab6d4ed4d9d2_50_50.jpg');
INSERT INTO `itempic` VALUES ('56', '1459148481416563', '/upload/9/b77f4cb0-14c1-480a-a602-31a5213ef871_TB1j42_GVXXXXcxXpXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '0', '/upload/mini_pic/c709de42-b184-48c9-a312-dfaa6aff3b14_50_50.jpg');
INSERT INTO `itempic` VALUES ('57', '1459148481416563', '/upload/9/2d229fbf-621c-4bd3-bcb6-b2710c33cb6f_TB2kFJfcXXXXXX0XXXXXXXXXXXX_!!1650770904.jpg_430x430q90.jpg', '0', '/upload/mini_pic/e5e5f17f-a767-4b13-972b-8de6c623d0ed_50_50.jpg');
INSERT INTO `itempic` VALUES ('58', '1459148481416563', '/upload/3/f26e1594-d272-4b8a-b66f-e3d03a59dc0e_TB2wnDLbXXXXXaBXpXXXXXXXXXX_!!1650770904.jpg_430x430q90.jpg', '0', '/upload/mini_pic/df29e852-50ff-4db9-a469-b94ccd5382de_50_50.jpg');
INSERT INTO `itempic` VALUES ('59', '1459148698718326', '/upload/8/263b68a3-3a94-4155-aa1e-5774fe566ba1_TB1ct60IpXXXXXVXFXXO8eD8pXX_023327.jpg_430x430q90.jpg', '0', '/upload/mini_pic/4b5363c0-ccc6-4946-b369-f302b7f89283_50_50.jpg');
INSERT INTO `itempic` VALUES ('60', '1459148698718326', '/upload/2/14e37488-1721-4a6c-a506-80176ad29f7d_TB1NGNGKpXXXXX_XVXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '0', '/upload/mini_pic/70cd3341-081d-4406-a213-f0f0e54339d2_50_50.jpg');
INSERT INTO `itempic` VALUES ('61', '1459148698718326', '/upload/8/2bd78bb7-d94c-4530-ad82-2a06ef54fd9a_TB27cs7gpXXXXcsXpXXXXXXXXXX_!!1114511827.jpg_430x430q90.jpg', '0', '/upload/mini_pic/b5a2f840-4068-4316-8ebd-280b2da92888_50_50.jpg');
INSERT INTO `itempic` VALUES ('62', '1459148698718326', '/upload/4/492b7f4a-2d7b-4ec4-8201-2249b24aa03c_TB2ANJlgFXXXXc2XXXXXXXXXXXX_!!1114511827.jpg_430x430q90.jpg', '1', '/upload/mini_pic/2d4fa21d-3c1b-44cc-97a3-0c739c64cf61_50_50.jpg');
INSERT INTO `itempic` VALUES ('63', '1459148825285387', '/upload/14/06d11d88-02ab-4bbe-80fc-409a131e346b_TB2I5FZcVXXXXbyXpXXXXXXXXXX_!!1779341691.jpg_430x430q90.jpg', '0', '/upload/mini_pic/fa9faad9-0f63-4360-97fc-63dd5bd71489_50_50.jpg');
INSERT INTO `itempic` VALUES ('64', '1459148825285387', '/upload/11/542853ab-92f5-4ea9-bdce-f496bca28e73_TB2OV6zhXXXXXbfXXXXXXXXXXXX_!!1779341691.jpg_430x430q90.jpg', '0', '/upload/mini_pic/6300dded-68ff-40aa-bff8-774860e0e143_50_50.jpg');
INSERT INTO `itempic` VALUES ('65', '1459148825285387', '/upload/14/bc72f724-22ce-41b2-bb94-db8743b54ac5_TB2QkR1cVXXXXbpXpXXXXXXXXXX_!!1779341691.jpg_430x430q90.jpg', '1', '/upload/mini_pic/28eae238-3125-4291-99e7-92a1d49d0bcf_50_50.jpg');
INSERT INTO `itempic` VALUES ('66', '1459148887558542', '/upload/1/e8fe6d47-e4ed-4559-bb59-3a49e4bcf517_TB17d3lKFXXXXataXXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg', '1', '/upload/mini_pic/a246ae70-b81e-4eb6-b042-ceb38faaa951_50_50.jpg');
INSERT INTO `itempic` VALUES ('67', '1459148887558542', '/upload/13/316bee90-8cea-4dc1-a8c4-bb2637db154b_TB2LDsrhFXXXXXfXXXXXXXXXXXX_!!725677994.jpg_430x430q90.jpg', '0', '/upload/mini_pic/eb466829-6532-4a92-8067-2cd8196e0039_50_50.jpg');
INSERT INTO `itempic` VALUES ('68', '1459148887558542', '/upload/10/4c7b33f3-12ec-4f91-816d-dbc44093e503_TB2ToHdipXXXXbZXXXXXXXXXXXX_!!725677994.jpg_430x430q90.jpg', '0', '/upload/mini_pic/ca8e9a22-7f8e-470c-8700-a38d15442e7c_50_50.jpg');
INSERT INTO `itempic` VALUES ('69', '1459149028840624', '/upload/9/ffaa7c44-c2aa-41e7-b11f-57d95deb141b_T2m3F6Xo4cXXXXXXXX_!!1733418301.jpg_430x430q90.jpg', '0', '/upload/mini_pic/2bb306ca-78e9-4282-a11d-70c8dbf90b72_50_50.jpg');
INSERT INTO `itempic` VALUES ('70', '1459149028840624', '/upload/4/fc5e98f6-138d-4ef1-9ba5-4b7d4426a5e0_TB2ctR1gVXXXXcmXpXXXXXXXXXX_!!1733418301.jpg_430x430q90.jpg', '1', '/upload/mini_pic/9c277096-acbe-4c92-9b12-eaf05008415c_50_50.jpg');
INSERT INTO `itempic` VALUES ('71', '1459149028840624', '/upload/4/53030e6d-0450-4dcc-b958-8056303f77f7_TB2OR87gVXXXXbjXpXXXXXXXXXX_!!1733418301.jpg_430x430q90.jpg', '0', '/upload/mini_pic/fbc51831-5d40-44e7-be45-9aa61233f963_50_50.jpg');
INSERT INTO `itempic` VALUES ('72', '1459149093339377', '/upload/15/f6a0cbbb-556e-417c-a20b-b95da6aba2b7_TB2bcUAgFXXXXasXpXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '0', '/upload/mini_pic/bd90c9db-427d-4ab4-bb7a-f92cedba2083_50_50.jpg');
INSERT INTO `itempic` VALUES ('73', '1459149093339377', '/upload/12/91cf21a6-1ae9-494c-b35e-ab975bbae09f_TB2qa5QjFXXXXbuXpXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '1', '/upload/mini_pic/5310ce29-e545-4b14-96ae-705330a3769f_50_50.jpg');
INSERT INTO `itempic` VALUES ('74', '1459149093339377', '/upload/11/22615c5d-e37f-4618-a1da-b9a9155a4424_TB2unkffVXXXXbpXXXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '0', '/upload/mini_pic/8ddc7f81-386d-463a-94b7-58ab5501a980_50_50.jpg');
INSERT INTO `itempic` VALUES ('75', '1459149093339377', '/upload/9/216d44d5-dfb4-4a8b-b39d-8148026d7bf3_TB2YWcpfVXXXXXMXXXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '0', '/upload/mini_pic/2e00e58b-6fca-486b-8343-dd3462d021d5_50_50.jpg');
INSERT INTO `itempic` VALUES ('76', '1459149470200642', '/upload/12/3ca097bc-33a0-4985-a361-10fbd6588012_TB2qa5QjFXXXXbuXpXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '1', '/upload/mini_pic/502b59d4-6403-4dc2-89f5-76cc45b69a09_50_50.jpg');
INSERT INTO `itempic` VALUES ('77', '1459149501984409', '/upload/11/ce4e496b-bf2b-4b12-b928-a643cd470ffd_TB2unkffVXXXXbpXXXXXXXXXXXX_!!2147787052.jpg_430x430q90.jpg', '1', '/upload/mini_pic/04580a7c-3701-4800-a359-2b6af107308a_50_50.jpg');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `contactid` bigint(20) DEFAULT '0' COMMENT '联系地址 id',
  `state` int(1) DEFAULT NULL COMMENT '是否退换货   0未被下单   1为竞价未结束  2未支付  3为付款成功  4竞价失败 ',
  `time` datetime DEFAULT NULL,
  `iid` bigint(20) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '3', '11', '3', '2016-03-28 15:23:38', '1459147668934330', null);
INSERT INTO `order` VALUES ('2', '1', null, '1', '2016-03-28 15:44:20', '1459147845472905', null);
INSERT INTO `order` VALUES ('3', '3', '12', '3', '2016-03-28 15:47:23', '1459149093339377', null);
INSERT INTO `order` VALUES ('4', '1', '9', '3', '2016-03-28 15:50:23', '1459148481416563', null);

-- ----------------------------
-- Table structure for return
-- ----------------------------
DROP TABLE IF EXISTS `return`;
CREATE TABLE `return` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) DEFAULT NULL,
  `time` date DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL COMMENT '退货内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of return
-- ----------------------------

-- ----------------------------
-- Table structure for searchreg
-- ----------------------------
DROP TABLE IF EXISTS `searchreg`;
CREATE TABLE `searchreg` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `searchtext` varchar(255) DEFAULT NULL,
  `cid` bigint(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of searchreg
-- ----------------------------
INSERT INTO `searchreg` VALUES ('1', 'apple', '1', '2016-03-28 15:01:28');
INSERT INTO `searchreg` VALUES ('2', 'rice', '1', '2016-03-28 15:01:34');
INSERT INTO `searchreg` VALUES ('3', '苹果', '1', '2016-03-28 15:02:42');
INSERT INTO `searchreg` VALUES ('4', '杭州', '1', '2016-03-28 15:03:19');
INSERT INTO `searchreg` VALUES ('5', '苹果', '1', '2016-03-28 15:03:19');
INSERT INTO `searchreg` VALUES ('6', '苹果5s', '1', '2016-03-28 15:03:39');
INSERT INTO `searchreg` VALUES ('7', '熊', '3', '2016-03-28 15:47:10');
