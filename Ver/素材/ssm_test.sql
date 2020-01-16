/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : shuji_test

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2019-09-18 16:20:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(255) DEFAULT NULL,
  `bimage` varchar(255) NOT NULL,
  `bprice` float(10,2) NOT NULL,
  `bweight` float DEFAULT NULL,
  `description` varchar(255) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('2', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('3', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('4', '山东公共基础', '/img/shandonggonggongjichu.jpg', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('5', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('6', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('7', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');
INSERT INTO `book` VALUES ('8', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('9', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('10', '山东公共基础', '/img/shandonggonggongjichu.jpg', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('11', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('12', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('13', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('14', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');
INSERT INTO `book` VALUES ('15', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('16', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('17', '山东公共基础', '/img/shandonggonggongjichu.jpg', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('18', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('19', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('20', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('21', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');
INSERT INTO `book` VALUES ('22', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('23', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('24', '山东公共基础', '/img/shandonggonggongjichu.jpg', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('25', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('26', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('27', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('28', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');
INSERT INTO `book` VALUES ('29', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('30', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('31', '山东公共基础', '/img/shandonggonggongjichu', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('32', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('33', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('34', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('35', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');
INSERT INTO `book` VALUES ('36', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('37', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('38', '山东公共基础', '/img/shandonggonggongjichu', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('39', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('40', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('41', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('42', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');
INSERT INTO `book` VALUES ('43', '申论', '/img/shenlun.jpg', '99.00', '800', '公务员必考', '1');
INSERT INTO `book` VALUES ('44', '公共基础', '/img/gonggongjichu.jpg', '99.00', '790', '公务员必考', '1');
INSERT INTO `book` VALUES ('45', '山东公共基础', '/img/shandonggonggongjichu', '99.00', '890', '公务员必考', '1');
INSERT INTO `book` VALUES ('46', '小升初数学', '/img/xiaoshengchu_shuxue.jpg', '48.00', '300', '小升初数学参考教材', '3');
INSERT INTO `book` VALUES ('47', '小升初', '/img/xiaoshengchu_wuli.jpg', '30.00', '250', '小升初物理参考教材', '3');
INSERT INTO `book` VALUES ('48', '小升初数学命题解读', '/img/xiaoshengchu_shuxue_mingti.jpg', '58.00', '500', '数学命题解读', '3');
INSERT INTO `book` VALUES ('49', '初升高英语', '/img/chushenggao_yingyu.jpg', '66.00', '660', '英语必读书籍', '4');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(32) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '公务员');
INSERT INTO `category` VALUES ('2', '专升本');
INSERT INTO `category` VALUES ('3', '小升初');
INSERT INTO `category` VALUES ('4', '初升高');
INSERT INTO `category` VALUES ('5', '专业技能');
INSERT INTO `category` VALUES ('6', '考研');
INSERT INTO `category` VALUES ('8', '高考');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(32) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `code` varchar(64) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhangsan', '123', '张三', 'zhangsan@itcast.cn', '2019-08-30', '1', null, null, null);
INSERT INTO `user` VALUES ('2', 'lisi', '123', '李四', 'lisi@itheima.cn', null, null, null, null, null);
