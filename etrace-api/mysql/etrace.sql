/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost
 Source Database       : etrace

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : utf-8

 Date: 12/06/2021 19:19:57 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `api_token`
-- ----------------------------
DROP TABLE IF EXISTS `api_token`;
CREATE TABLE `api_token` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `cid` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_always_access` bit(1) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_7cia4eeb3klyl3mce3tvybuo1` (`user_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `app`
-- ----------------------------
DROP TABLE IF EXISTS `app`;
CREATE TABLE `app` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `app_id` varchar(255) NOT NULL,
  `app_name` varchar(255) DEFAULT NULL,
  `app_type` varchar(255) DEFAULT NULL,
  `critical` bit(1) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tenant` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_fo5tnbjkos6udvf57gdtr6ro2` (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `apply_token_log`
-- ----------------------------
DROP TABLE IF EXISTS `apply_token_log`;
CREATE TABLE `apply_token_log` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `apply_reason` varchar(255) DEFAULT NULL,
  `audit_opinion` varchar(255) DEFAULT NULL,
  `audit_status` int DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_advyj91lomm77svc7grmj6a71` (`user_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `chart`
-- ----------------------------
DROP TABLE IF EXISTS `chart`;
CREATE TABLE `chart` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `admin_visible` bit(1) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `favorite_count` bigint DEFAULT NULL,
  `global_id` varchar(255) NOT NULL,
  `is_star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `view_count` bigint DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `targets` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_b75w12kgnonflf1j6qk2gn4d6` (`global_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `app_name` varchar(255) DEFAULT NULL,
  `idc` varchar(255) DEFAULT NULL,
  `key` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `dashboard`
-- ----------------------------
DROP TABLE IF EXISTS `dashboard`;
CREATE TABLE `dashboard` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `admin_visible` bit(1) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `favorite_count` bigint DEFAULT NULL,
  `global_id` varchar(255) NOT NULL,
  `is_star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `view_count` bigint DEFAULT NULL,
  `chart_ids` varchar(255) DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `layout` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_flqkpqi3jhe0tap0xh9mgayn8` (`global_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `dashboard_app`
-- ----------------------------
DROP TABLE IF EXISTS `dashboard_app`;
CREATE TABLE `dashboard_app` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `admin_visible` bit(1) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `favorite_count` bigint DEFAULT NULL,
  `global_id` varchar(255) NOT NULL,
  `is_star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `view_count` bigint DEFAULT NULL,
  `critical` bit(1) DEFAULT NULL,
  `dashboard_ids` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `order` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_6qrm9hsfk4qg0c4lt04bsnm7v` (`global_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `datasource`
-- ----------------------------
DROP TABLE IF EXISTS `datasource`;
CREATE TABLE `datasource` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `graph`
-- ----------------------------
DROP TABLE IF EXISTS `graph`;
CREATE TABLE `graph` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `admin_visible` bit(1) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `favorite_count` bigint DEFAULT NULL,
  `global_id` varchar(255) NOT NULL,
  `is_star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `view_count` bigint DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `layout` varchar(255) DEFAULT NULL,
  `node_ids` varchar(255) DEFAULT NULL,
  `nodes` varchar(255) DEFAULT NULL,
  `relations` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `update_node_ids` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_cboxqslcmecsq46kux0teylg4` (`global_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `history_log`
-- ----------------------------
DROP TABLE IF EXISTS `history_log`;
CREATE TABLE `history_log` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `history` varchar(255) DEFAULT NULL,
  `history_id` bigint DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `limit_sql`
-- ----------------------------
DROP TABLE IF EXISTS `limit_sql`;
CREATE TABLE `limit_sql` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `limit_query_type` int DEFAULT NULL,
  `measurement` varchar(255) DEFAULT NULL,
  `sql` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `monitor_entity`
-- ----------------------------
DROP TABLE IF EXISTS `monitor_entity`;
CREATE TABLE `monitor_entity` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `children` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `database` varchar(255) DEFAULT NULL,
  `datasource_id` bigint DEFAULT NULL,
  `meta_link` varchar(255) DEFAULT NULL,
  `meta_placeholder` varchar(255) DEFAULT NULL,
  `meta_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_id` bigint NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `node`
-- ----------------------------
DROP TABLE IF EXISTS `node`;
CREATE TABLE `node` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `admin_visible` bit(1) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `favorite_count` bigint DEFAULT NULL,
  `global_id` varchar(255) NOT NULL,
  `is_star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `view_count` bigint DEFAULT NULL,
  `app_id` varchar(255) DEFAULT NULL,
  `chart_ids` varchar(255) DEFAULT NULL,
  `charts` varchar(255) DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `group_by` varchar(255) DEFAULT NULL,
  `layout` varchar(255) DEFAULT NULL,
  `node_type` int DEFAULT NULL,
  `single_node_config` varchar(255) DEFAULT NULL,
  `update_chart_ids` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_3lt6o0sqvk1mivrcnnupqv6pa` (`global_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `proxy_config`
-- ----------------------------
DROP TABLE IF EXISTS `proxy_config`;
CREATE TABLE `proxy_config` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `clusters` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `proxy_path` varchar(255) DEFAULT NULL,
  `rule` varchar(255) DEFAULT NULL,
  `server_name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type` int NOT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `search_key_word`
-- ----------------------------
DROP TABLE IF EXISTS `search_key_word`;
CREATE TABLE `search_key_word` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `search_key_word_correlation`
-- ----------------------------
DROP TABLE IF EXISTS `search_key_word_correlation`;
CREATE TABLE `search_key_word_correlation` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `correlation_coefficient` int NOT NULL,
  `correlation_keyword_id` bigint DEFAULT NULL,
  `keyword_id` bigint DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `search_list`
-- ----------------------------
DROP TABLE IF EXISTS `search_list`;
CREATE TABLE `search_list` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `list_type` int DEFAULT NULL,
  `maintainer_email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `search_list_record_mapping`
-- ----------------------------
DROP TABLE IF EXISTS `search_list_record_mapping`;
CREATE TABLE `search_list_record_mapping` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `list_id` bigint DEFAULT NULL,
  `record_id` bigint DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `search_record`
-- ----------------------------
DROP TABLE IF EXISTS `search_record`;
CREATE TABLE `search_record` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `click_index` int NOT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `dingtalk_number` varchar(255) DEFAULT NULL,
  `favorite_index` int NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `keyword_list` varchar(255) DEFAULT NULL,
  `maintainer_email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `owner_dingtalk_number` varchar(255) DEFAULT NULL,
  `owner_dingtalkame` varchar(255) DEFAULT NULL,
  `star` bit(1) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type` int DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `file_record_id` bigint DEFAULT NULL,
  `owner_ali_email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `search_record_keyword_mapping`
-- ----------------------------
DROP TABLE IF EXISTS `search_record_keyword_mapping`;
CREATE TABLE `search_record_keyword_mapping` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `keyword_id` bigint NOT NULL,
  `record_id` bigint NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', null, null, 'some111@abc.om', 'abc', 'admin', null, null), ('2', null, null, 'some222@abc.om', 'def', 'user', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `user_action`
-- ----------------------------
DROP TABLE IF EXISTS `user_action`;
CREATE TABLE `user_action` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `favorite_apps` varchar(255) DEFAULT NULL,
  `favorite_board_ids` varchar(255) DEFAULT NULL,
  `favorite_graph_ids` varchar(255) DEFAULT NULL,
  `favorite_list_ids` varchar(255) DEFAULT NULL,
  `favorite_node_ids` varchar(255) DEFAULT NULL,
  `favorite_record_ids` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `view_board_ids` varchar(255) DEFAULT NULL,
  `view_graph_ids` varchar(255) DEFAULT NULL,
  `view_node_ids` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `favorite_app_ids` varchar(255) DEFAULT NULL,
  `favorite_boards` varchar(255) DEFAULT NULL,
  `view_boards` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `user_config`
-- ----------------------------
DROP TABLE IF EXISTS `user_config`;
CREATE TABLE `user_config` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
--  Records of `user_role`
-- ----------------------------
BEGIN;
INSERT INTO `user_role` VALUES ('1', null, null, '[\"ROLE_ADMIN\"]', null, '1', null, null), ('2', null, null, '[\"ROLE_USER\"]', null, '2', null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
