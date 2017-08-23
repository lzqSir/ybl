-- version 1
CREATE TABLE `bk_user` (
  `id` bigint(20) NOT NULL COMMENT '用户ID',
  `dbid` int(11) NOT NULL COMMENT '数据库id，业务相关，用于分库',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `pwd` varchar(32) DEFAULT NULL COMMENT '登录密码',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `login_name` varchar(30) DEFAULT NULL COMMENT '登录名称',
  `nickname` varchar(100) DEFAULT NULL COMMENT '昵称',
  `province` varchar(45) DEFAULT NULL COMMENT '省会',
  `city` varchar(45) DEFAULT NULL COMMENT '城市',
  `country` varchar(45) DEFAULT NULL COMMENT '国家',
  `head_img_url` varchar(300) DEFAULT NULL COMMENT '头像',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别，0：男,1:女',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `login_times` int(11) NOT NULL DEFAULT '0' COMMENT '登录次数',
  `reg_ip` varchar(30) DEFAULT NULL COMMENT '注册IP',
  `reg_time` datetime NOT NULL COMMENT '注册时间',
  `last_login_ip` varchar(30) DEFAULT NULL COMMENT '最后登录IP',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '会员状态',
  `last_update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `bk_user_index_003` (`reg_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- version 2
CREATE TABLE `bk_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(64) NOT NULL COMMENT '角色名称',
  `role_desc` varchar(300) NOT NULL COMMENT '角色描述',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态,0:停用,1:正常',
  `created_by` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_updated_by` varchar(100) DEFAULT NULL COMMENT '更新者',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- version 3
CREATE TABLE `bk_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` bigint(20) NOT NULL COMMENT 'bkp_user_t.id',
  `role_id` bigint(20) NOT NULL COMMENT 'bkp_role_t.id',
  `created_by` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_updated_by` varchar(100) DEFAULT NULL COMMENT '更新者',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_bk_cloud_user_role_t` (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- version 4
CREATE TABLE `bk_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `permission_name` varchar(200) NOT NULL COMMENT '权限名称:新增用户',
  `permission_point` varchar(32) NOT NULL COMMENT '权限子节点描述(增删改查):a、d、m、s',
  `created_by` varchar(100) DEFAULT NULL COMMENT '创建者',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_bk_cloud_permission_t_permission_name` (`permission_name`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- version 5
CREATE TABLE `bk_role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `role_id` bigint(20) NOT NULL COMMENT 'bk_cloud_role_t.id',
  `permission_id` bigint(20) NOT NULL COMMENT 'bk_cloud_permission_t.id',
  `created_by` varchar(100) DEFAULT NULL COMMENT '创建者',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_bk_cloud_role_permission_t` (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关系表';



