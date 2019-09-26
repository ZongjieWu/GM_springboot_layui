/*
 Navicat Premium Data Transfer

 Source Server         : localhostDB
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : gm_springboot_layui

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 27/09/2019 00:02:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工',
  `wechat_public_openid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信公众号openid',
  `job_number` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工号',
  `department_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门表ID',
  `job_id` bigint(20) NULL DEFAULT NULL COMMENT '职位表ID',
  `employee_role_id` bigint(20) NULL DEFAULT NULL COMMENT '员工角色id',
  `head_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `pwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系地址',
  `id_card` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  `edu` int(2) NULL DEFAULT 0 COMMENT '学历0高中1专科2本科3硕士4博士',
  `native_place` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '籍贯',
  `nation` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '民族',
  `sex` int(2) NULL DEFAULT 0 COMMENT '性别0男1女',
  `marriage_status` int(2) NULL DEFAULT 0 COMMENT '0未婚1已婚',
  `graduate_school` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '毕业院校',
  `major` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `graduate_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '毕业时间',
  `job_type` int(2) NULL DEFAULT 0 COMMENT '0实习员工1正式员工',
  `status` int(2) NULL DEFAULT 0 COMMENT '0正常状态1离职(冻结)',
  `dimission_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '离职时间',
  `add_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '添加时间',
  `modify_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `phone`(`phone`) USING BTREE,
  UNIQUE INDEX `job_number`(`job_number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '3333', '5,10,24', 12, NULL, '', '333', '18720733211', '123456', '333', '333', '33', 3333, '3333', '333', 1, 0, '3333', '333', '3333', 1, 0, NULL, '2019-05-18 08:53:29', '2019-06-18 10:30:37');
INSERT INTO `employee` VALUES (2, NULL, '111', '11', 1111, NULL, '', '1111', '18720733212', '123456', '1111', '1111', '1111', 111, '1111', '11111', 0, 0, '1111', '111', '11111', 0, 1, '2019-05-18 10:53:24', '2019-05-18 08:57:53', '2019-05-18 10:53:24');
INSERT INTO `employee` VALUES (3, NULL, '1111111111111111111', '5,10,24', 12, NULL, '', '1111111111', '18720733213', '123456', '111111111', '111111111111', '1111111111111111', 1111111, '1', '111', 0, 0, '111', '1111', '11111', 0, 1, '2019-05-18 10:53:17', '2019-05-18 09:01:59', '2019-06-06 11:24:17');
INSERT INTO `employee` VALUES (5, NULL, '1111', '5,10,24', 12, NULL, '', '222222', '18720733214', '123456', '11', '11', '11', 111, '11', '11', 0, 0, '11', '11', '11', 0, 1, '2019-05-18 10:53:17', '2019-05-18 09:04:23', '2019-06-06 11:24:12');
INSERT INTO `employee` VALUES (7, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '11', '5,22', 10, NULL, '', '22', '18720733216', '123456', '11', '11', '11', 11, '11', '11', 1, 0, '11', '11', '111', 1, 0, '2019-05-18 10:37:14', '2019-05-18 09:13:37', '2019-05-23 11:25:03');
INSERT INTO `employee` VALUES (9, 'oyww358RAnTaTbqctM1MzU7ZsaQA', 'werwerwerw', '5', 2, 3, '', '员工2', '18720733333', '123456', '2012293155@qq.com', '江西省赣州市崇义县文英乡茶子丘组', '360725199712103410', 0, '', '', 0, 0, '', '', '', 0, 0, NULL, '2019-05-24 09:48:20', '2019-06-24 10:17:44');
INSERT INTO `employee` VALUES (10, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '20190524100715', '5,10', 10, NULL, '', '员工4', '18720733334', '123456', '2012293155@qq.com', '江西省赣州市崇义县', '360725199712103410', 3, '崇义', '', 1, 0, '', '', '', 1, 0, NULL, '2019-05-24 10:09:27', '2019-06-18 10:30:30');
INSERT INTO `employee` VALUES (11, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '20190524101035', '5,10,24', 11, NULL, '', '员工3', '18720733335', '123456', '2012293155@qq.com', '', '', 2, '', '', 0, 0, '', '', '', 1, 0, NULL, '2019-05-24 10:11:39', '2019-05-24 10:11:39');
INSERT INTO `employee` VALUES (12, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '20190524101321', '5,10,24', 14, NULL, '', '员工5', '18720733215', '123456', '2012293155@qq.com', '', '', 0, '', '', 0, 0, '', '', '', 0, 0, NULL, '2019-05-24 10:22:24', '2019-05-24 10:22:24');
INSERT INTO `employee` VALUES (13, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '000000', '', 16, 2, '', '厂长(张佳)', '18720733219', '123456', '123456', '', '', 0, '', '', 0, 0, '', '', '', 1, 0, NULL, NULL, '2019-06-18 10:29:44');
INSERT INTO `employee` VALUES (15, 'oyww358RAnTaTbqctM1MzU7ZsaQA', '201906060203', '5,23', 10, NULL, '', '员工6', '18720734565', '123456', '2012293155@qq.com', '', '', 0, '', '', 0, 0, '', '', '', 1, 0, NULL, '2019-06-06 15:03:29', '2019-06-06 15:03:47');
INSERT INTO `employee` VALUES (16, NULL, '', '', 1, NULL, '', '', '', NULL, '', '', '', 0, '', '', 0, 0, '', '', '', 0, 1, '2019-06-20 11:39:50', '2019-06-20 08:41:51', '2019-06-20 11:39:50');
INSERT INTO `employee` VALUES (17, NULL, '12312313', '3', 1, NULL, '', '123123123', '12312', NULL, '', '', '1111', 0, '', '', 0, 0, '', '', '', 0, 1, '2019-06-24 11:11:13', '2019-06-24 11:11:06', '2019-06-24 11:11:13');

-- ----------------------------
-- Table structure for employee_permission
-- ----------------------------
DROP TABLE IF EXISTS `employee_permission`;
CREATE TABLE `employee_permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工权限表',
  `parent_id` bigint(20) NULL DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `descript` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `request_path` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '请求路径',
  `sort` int(10) NULL DEFAULT NULL COMMENT '排序',
  `add_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '添加时间',
  `modify_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 85 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee_permission
-- ----------------------------
INSERT INTO `employee_permission` VALUES (1, 0, '部门/职位', 'department/job', NULL, NULL, '2019-06-15 14:55:16', '2019-06-15 16:33:25');
INSERT INTO `employee_permission` VALUES (3, 0, '人员管理', 'employeeManage', NULL, NULL, '2019-06-15 15:23:34', '2019-06-15 15:26:41');
INSERT INTO `employee_permission` VALUES (4, 0, '排班管理', 'arrangeManage', NULL, NULL, '2019-06-15 15:27:13', '2019-06-15 15:27:13');
INSERT INTO `employee_permission` VALUES (5, 0, '考勤管理', 'attendanceManage', NULL, NULL, '2019-06-15 15:42:33', '2019-06-15 15:42:33');
INSERT INTO `employee_permission` VALUES (6, 0, '请假管理', 'leaveManage', NULL, NULL, '2019-06-15 15:42:55', '2019-06-15 15:42:55');
INSERT INTO `employee_permission` VALUES (7, 0, '后台权限管理', 'backPermissionManage', NULL, NULL, '2019-06-15 15:43:51', '2019-06-15 15:43:51');
INSERT INTO `employee_permission` VALUES (8, 1, '部门管理', 'departmentManage', NULL, NULL, '2019-06-15 16:22:12', '2019-06-18 17:10:46');
INSERT INTO `employee_permission` VALUES (9, 1, '职位管理', 'jobManage', NULL, NULL, '2019-06-15 16:32:53', '2019-06-15 16:32:53');
INSERT INTO `employee_permission` VALUES (10, 3, '在职人员', 'onEmployee', NULL, NULL, '2019-06-15 16:44:58', '2019-06-15 16:44:58');
INSERT INTO `employee_permission` VALUES (11, 3, '离职员工', 'offEmployee', NULL, NULL, '2019-06-15 16:45:18', '2019-06-15 17:04:32');
INSERT INTO `employee_permission` VALUES (13, 4, '排班时间', 'arrangeTime', NULL, NULL, '2019-06-15 17:05:32', '2019-06-15 17:05:32');
INSERT INTO `employee_permission` VALUES (14, 4, '员工排班', 'employeeArrange', NULL, NULL, '2019-06-15 17:06:06', '2019-06-15 17:06:06');
INSERT INTO `employee_permission` VALUES (15, 4, '干部排班', 'leaderArrange', NULL, NULL, '2019-06-15 17:06:26', '2019-06-17 15:44:03');
INSERT INTO `employee_permission` VALUES (16, 5, '假期管理', 'holidayManage', NULL, NULL, '2019-06-15 17:07:00', '2019-06-15 17:07:09');
INSERT INTO `employee_permission` VALUES (17, 5, '考勤规则', 'attendanceRules', NULL, NULL, '2019-06-15 17:08:10', '2019-06-15 17:08:16');
INSERT INTO `employee_permission` VALUES (18, 5, '打卡记录', 'punchCardRecord', NULL, NULL, '2019-06-15 17:08:43', '2019-06-15 17:09:13');
INSERT INTO `employee_permission` VALUES (19, 5, '考勤统计', 'attendanceStatistics', NULL, NULL, '2019-06-15 17:09:55', '2019-06-15 17:10:05');
INSERT INTO `employee_permission` VALUES (20, 0, '补卡管理', 'reissueCardManage', NULL, NULL, '2019-06-15 17:10:52', '2019-06-15 17:10:52');
INSERT INTO `employee_permission` VALUES (21, 20, '补卡申请', 'reissueCardReply', NULL, NULL, '2019-06-15 17:12:10', '2019-06-15 17:12:10');
INSERT INTO `employee_permission` VALUES (22, 20, '补卡通过', 'reissueCardPass', NULL, NULL, '2019-06-15 17:12:44', '2019-06-15 17:13:31');
INSERT INTO `employee_permission` VALUES (23, 20, '补卡不通过', 'reissueCardUnPass', NULL, NULL, '2019-06-15 17:15:21', '2019-06-15 17:21:56');
INSERT INTO `employee_permission` VALUES (24, 6, '请假类型', 'leaveType', NULL, NULL, '2019-06-15 17:18:53', '2019-06-15 17:19:29');
INSERT INTO `employee_permission` VALUES (25, 6, '请假设置', 'leaveSet', NULL, NULL, '2019-06-15 17:20:00', '2019-06-15 17:20:00');
INSERT INTO `employee_permission` VALUES (26, 6, '请假审核', 'leaveCheck', NULL, NULL, '2019-06-15 17:22:36', '2019-06-15 17:22:36');
INSERT INTO `employee_permission` VALUES (27, 6, '审核通过', 'leavePass', NULL, NULL, '2019-06-15 17:23:37', '2019-06-15 17:24:00');
INSERT INTO `employee_permission` VALUES (28, 6, '审核不通过', 'leaveUnPass', NULL, NULL, '2019-06-15 17:24:34', '2019-06-15 17:24:34');
INSERT INTO `employee_permission` VALUES (29, 7, '管理员管理', 'managerManage', NULL, NULL, '2019-06-15 17:25:15', '2019-06-15 17:25:15');
INSERT INTO `employee_permission` VALUES (30, 7, '角色管理', 'roleManage', NULL, NULL, '2019-06-15 17:25:57', '2019-06-15 17:25:57');
INSERT INTO `employee_permission` VALUES (31, 7, '权限管理', 'permissionManage', NULL, NULL, '2019-06-15 17:26:28', '2019-06-15 17:26:35');
INSERT INTO `employee_permission` VALUES (32, 8, '添加', 'departmentManageAdd', NULL, NULL, NULL, '2019-06-17 17:07:09');
INSERT INTO `employee_permission` VALUES (38, 8, '修改', 'departmentManageUpdate', NULL, NULL, '2019-06-17 17:08:08', '2019-06-17 17:08:15');
INSERT INTO `employee_permission` VALUES (39, 8, '删除', 'departmentManageDelete', NULL, NULL, '2019-06-17 17:11:30', '2019-06-17 17:11:30');
INSERT INTO `employee_permission` VALUES (40, 4, '排班记录', 'arrangeRecord', NULL, NULL, '2019-06-18 14:49:58', '2019-06-19 14:20:16');
INSERT INTO `employee_permission` VALUES (41, 9, '职位添加', 'jobManageAdd', NULL, NULL, '2019-06-19 14:10:23', '2019-06-19 14:10:23');
INSERT INTO `employee_permission` VALUES (42, 9, '职位修改', 'jobManageUpdate', NULL, NULL, '2019-06-19 14:10:38', '2019-06-19 14:10:38');
INSERT INTO `employee_permission` VALUES (43, 9, '职位删除', 'jobManageDelete', NULL, NULL, '2019-06-19 14:10:57', '2019-06-19 14:10:57');
INSERT INTO `employee_permission` VALUES (44, 10, '添加', 'employeeManageAdd', NULL, NULL, '2019-06-19 14:12:48', '2019-06-19 14:13:25');
INSERT INTO `employee_permission` VALUES (45, 10, '修改', 'employeeManageUpdate', NULL, NULL, '2019-06-19 14:13:13', '2019-06-19 14:13:13');
INSERT INTO `employee_permission` VALUES (46, 10, '冻结', 'employeeManageFrost', NULL, NULL, '2019-06-19 14:14:02', '2019-06-19 16:45:53');
INSERT INTO `employee_permission` VALUES (47, 10, '批量冻结', 'employeeManageBatchFrost', NULL, NULL, '2019-06-19 14:14:34', '2019-06-19 15:07:00');
INSERT INTO `employee_permission` VALUES (48, 11, '添加', 'employeeManageAdd', NULL, NULL, '2019-06-19 14:15:09', '2019-06-19 16:24:12');
INSERT INTO `employee_permission` VALUES (49, 11, '修改', 'employeeManageUpdate', NULL, NULL, '2019-06-19 14:15:31', '2019-06-19 16:24:24');
INSERT INTO `employee_permission` VALUES (50, 11, '删除', 'employeeManageDelete', NULL, NULL, '2019-06-19 14:15:58', '2019-06-19 16:24:33');
INSERT INTO `employee_permission` VALUES (51, 13, '添加', 'arrangeTimeAdd', NULL, NULL, '2019-06-19 14:18:33', '2019-06-19 16:26:13');
INSERT INTO `employee_permission` VALUES (53, 13, '修改', 'arrangeTimeUpdate', NULL, NULL, '2019-06-19 14:19:12', '2019-06-19 16:26:20');
INSERT INTO `employee_permission` VALUES (54, 13, '删除', 'arrangeTimeDelete', NULL, NULL, '2019-06-19 14:19:29', '2019-06-19 16:26:28');
INSERT INTO `employee_permission` VALUES (55, 14, '添加', 'employeeArrangeAdd', NULL, NULL, '2019-06-19 14:29:14', '2019-06-19 14:29:14');
INSERT INTO `employee_permission` VALUES (56, 14, '修改', 'employeeArrangeUpdate', NULL, NULL, '2019-06-19 14:29:22', '2019-06-19 14:29:31');
INSERT INTO `employee_permission` VALUES (57, 15, '添加', 'leaderArrangeAdd', NULL, NULL, '2019-06-19 14:31:28', '2019-06-19 14:31:28');
INSERT INTO `employee_permission` VALUES (58, 15, '修改', 'leaderArrangeUpdate', NULL, NULL, '2019-06-19 14:31:50', '2019-06-19 14:31:50');
INSERT INTO `employee_permission` VALUES (60, 16, '添加', 'holidayManageAdd', NULL, NULL, '2019-06-19 14:34:30', '2019-06-19 14:34:30');
INSERT INTO `employee_permission` VALUES (61, 16, '修改', 'holidayManageUpdate', NULL, NULL, '2019-06-19 14:34:48', '2019-06-19 14:34:48');
INSERT INTO `employee_permission` VALUES (62, 16, '删除', 'holidayManageDelete', NULL, NULL, '2019-06-19 14:35:03', '2019-06-19 14:35:03');
INSERT INTO `employee_permission` VALUES (63, 17, '添加', 'attendanceRulesAdd', NULL, NULL, '2019-06-19 14:37:42', '2019-06-19 14:37:42');
INSERT INTO `employee_permission` VALUES (64, 17, '编辑', 'attendanceRulesUpdate', NULL, NULL, '2019-06-19 14:37:55', '2019-06-19 14:37:55');
INSERT INTO `employee_permission` VALUES (65, 17, '删除', 'attendanceRulesDelete', NULL, NULL, '2019-06-19 14:38:10', '2019-06-19 14:38:10');
INSERT INTO `employee_permission` VALUES (66, 18, '添加', 'punchCardRecordAdd', NULL, NULL, '2019-06-19 14:39:53', '2019-06-19 14:39:53');
INSERT INTO `employee_permission` VALUES (67, 18, '修改', 'punchCardRecordUpdate', NULL, NULL, '2019-06-19 14:40:07', '2019-06-19 14:40:07');
INSERT INTO `employee_permission` VALUES (68, 18, '删除', 'punchCardRecordDelete', NULL, NULL, '2019-06-19 14:40:19', '2019-06-19 14:40:19');
INSERT INTO `employee_permission` VALUES (69, 24, '添加', 'leaveTypeAdd', NULL, NULL, '2019-06-19 14:41:13', '2019-06-19 14:41:13');
INSERT INTO `employee_permission` VALUES (70, 24, '修改', 'leaveTypeUpdate', NULL, NULL, '2019-06-19 14:41:29', '2019-06-19 14:41:29');
INSERT INTO `employee_permission` VALUES (71, 24, '删除', 'leaveTypeDelete', NULL, NULL, '2019-06-19 14:41:44', '2019-06-19 14:41:44');
INSERT INTO `employee_permission` VALUES (72, 25, '修改', 'leaveSetUpdate', NULL, NULL, '2019-06-19 14:42:56', '2019-06-19 14:42:56');
INSERT INTO `employee_permission` VALUES (73, 29, '添加', 'managerManageAdd', NULL, NULL, '2019-06-19 14:53:33', '2019-06-19 14:53:33');
INSERT INTO `employee_permission` VALUES (74, 29, '编辑', 'managerManageUpdate', NULL, NULL, '2019-06-19 14:53:56', '2019-06-19 14:53:56');
INSERT INTO `employee_permission` VALUES (75, 29, '删除', 'managerManageDelete', NULL, NULL, '2019-06-19 14:54:18', '2019-06-19 14:54:18');
INSERT INTO `employee_permission` VALUES (76, 30, '添加', 'roleManageAdd', NULL, NULL, '2019-06-19 14:55:59', '2019-06-19 14:55:59');
INSERT INTO `employee_permission` VALUES (77, 30, '修改', 'roleManageUpdate', NULL, NULL, '2019-06-19 14:56:17', '2019-06-19 14:56:17');
INSERT INTO `employee_permission` VALUES (78, 30, '删除', 'roleManageDelete', NULL, NULL, '2019-06-19 14:56:24', '2019-06-19 14:56:32');
INSERT INTO `employee_permission` VALUES (79, 30, '设置权限', 'roleManageSetPermission', NULL, NULL, '2019-06-19 14:57:16', '2019-06-19 14:57:49');
INSERT INTO `employee_permission` VALUES (80, 31, '添加', 'permissionManageAdd', NULL, NULL, '2019-06-19 14:58:09', '2019-06-19 14:58:09');
INSERT INTO `employee_permission` VALUES (81, 31, '修改', 'permissionManageUpdate', NULL, NULL, '2019-06-19 14:58:20', '2019-06-19 14:58:20');
INSERT INTO `employee_permission` VALUES (82, 31, '删除', 'permissionManageDelete', NULL, NULL, '2019-06-19 14:58:34', '2019-06-19 14:58:34');
INSERT INTO `employee_permission` VALUES (83, 0, '调休管理', 'leaveInLieuManage', NULL, NULL, '2019-07-06 14:58:04', '2019-07-06 14:58:04');
INSERT INTO `employee_permission` VALUES (84, 83, '调休纪记录', 'leaveInLieuRecord', NULL, NULL, '2019-07-06 14:58:46', '2019-07-06 14:58:46');

-- ----------------------------
-- Table structure for employee_role
-- ----------------------------
DROP TABLE IF EXISTS `employee_role`;
CREATE TABLE `employee_role`  (
  `id` bigint(30) NOT NULL AUTO_INCREMENT COMMENT '员工角色id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `descript` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `add_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '添加时间',
  `modify_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee_role
-- ----------------------------
INSERT INTO `employee_role` VALUES (2, '厂长', NULL, '2019-06-15 17:56:00', '2019-06-15 17:56:00');
INSERT INTO `employee_role` VALUES (3, '人事', NULL, '2019-06-15 17:56:30', '2019-06-15 17:56:30');
INSERT INTO `employee_role` VALUES (4, '生产部部长', NULL, '2019-06-17 08:38:10', '2019-06-17 08:38:10');

-- ----------------------------
-- Table structure for employee_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `employee_role_permission`;
CREATE TABLE `employee_role_permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工角色权限id',
  `employee_role_id` bigint(20) NULL DEFAULT NULL COMMENT '员工角色id',
  `employee_permission_id` bigint(20) NULL DEFAULT NULL COMMENT '员工权限id',
  `add_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '添加时间',
  `modify_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2482 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee_role_permission
-- ----------------------------
INSERT INTO `employee_role_permission` VALUES (1212, NULL, 1, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1213, NULL, 8, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1214, NULL, 32, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1215, NULL, 38, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1216, NULL, 39, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1217, NULL, 9, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1218, NULL, 41, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1219, NULL, 42, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1220, NULL, 43, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1221, NULL, 3, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1222, NULL, 10, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1223, NULL, 44, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1224, NULL, 45, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1225, NULL, 46, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1226, NULL, 47, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1227, NULL, 11, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1228, NULL, 48, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1229, NULL, 49, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1230, NULL, 50, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1231, NULL, 4, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1232, NULL, 13, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1233, NULL, 51, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1234, NULL, 53, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1235, NULL, 54, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1236, NULL, 14, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1237, NULL, 55, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1238, NULL, 56, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1239, NULL, 15, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1240, NULL, 57, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1241, NULL, 58, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1242, NULL, 40, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (1243, NULL, 5, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2339, 3, 1, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2340, 3, 8, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2341, 3, 32, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2342, 3, 38, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2343, 3, 39, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2344, 3, 9, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2345, 3, 41, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2346, 3, 42, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2347, 3, 43, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2348, 3, 3, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2349, 3, 10, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2350, 3, 45, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2351, 3, 11, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2352, 3, 48, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2353, 3, 49, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2354, 3, 50, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2355, 3, 4, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2356, 3, 13, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2357, 3, 53, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2358, 3, 14, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2359, 3, 55, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2360, 3, 56, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2361, 3, 15, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2362, 3, 57, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2363, 3, 58, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2364, 3, 40, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2365, 3, 5, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2366, 3, 16, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2367, 3, 60, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2368, 3, 61, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2369, 3, 62, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2370, 3, 17, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2371, 3, 63, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2372, 3, 64, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2373, 3, 65, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2374, 3, 18, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2375, 3, 66, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2376, 3, 67, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2377, 3, 68, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2378, 3, 19, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2379, 3, 6, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2380, 3, 24, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2381, 3, 69, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2382, 3, 70, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2383, 3, 71, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2384, 3, 25, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2385, 3, 72, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2386, 3, 26, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2387, 3, 27, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2388, 3, 28, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2389, 3, 7, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2390, 3, 29, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2391, 3, 73, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2392, 3, 74, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2393, 3, 75, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2394, 3, 30, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2395, 3, 76, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2396, 3, 77, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2397, 3, 78, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2398, 3, 79, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2399, 3, 31, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2400, 3, 80, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2401, 3, 81, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2402, 3, 82, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2403, 3, 20, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2404, 3, 21, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2405, 3, 22, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2406, 3, 23, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2407, 2, 1, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2408, 2, 8, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2409, 2, 32, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2410, 2, 38, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2411, 2, 39, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2412, 2, 9, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2413, 2, 41, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2414, 2, 42, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2415, 2, 43, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2416, 2, 3, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2417, 2, 10, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2418, 2, 44, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2419, 2, 45, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2420, 2, 46, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2421, 2, 47, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2422, 2, 11, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2423, 2, 48, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2424, 2, 49, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2425, 2, 50, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2426, 2, 4, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2427, 2, 13, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2428, 2, 51, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2429, 2, 53, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2430, 2, 54, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2431, 2, 14, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2432, 2, 55, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2433, 2, 56, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2434, 2, 15, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2435, 2, 57, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2436, 2, 58, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2437, 2, 40, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2438, 2, 5, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2439, 2, 16, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2440, 2, 60, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2441, 2, 61, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2442, 2, 62, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2443, 2, 17, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2444, 2, 63, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2445, 2, 64, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2446, 2, 65, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2447, 2, 18, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2448, 2, 66, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2449, 2, 67, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2450, 2, 68, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2451, 2, 19, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2452, 2, 6, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2453, 2, 24, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2454, 2, 69, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2455, 2, 70, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2456, 2, 71, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2457, 2, 25, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2458, 2, 72, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2459, 2, 26, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2460, 2, 27, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2461, 2, 28, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2462, 2, 7, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2463, 2, 29, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2464, 2, 73, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2465, 2, 74, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2466, 2, 75, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2467, 2, 30, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2468, 2, 76, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2469, 2, 77, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2470, 2, 78, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2471, 2, 79, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2472, 2, 31, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2473, 2, 80, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2474, 2, 81, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2475, 2, 82, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2476, 2, 20, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2477, 2, 21, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2478, 2, 22, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2479, 2, 23, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2480, 2, 83, NULL, NULL);
INSERT INTO `employee_role_permission` VALUES (2481, 2, 84, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
