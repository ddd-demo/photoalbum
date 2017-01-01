/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.13-log : Database - photoalbum
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`photoalbum` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `photoalbum`;

/*Table structure for table `album` */

DROP TABLE IF EXISTS `album`;

CREATE TABLE `album` (
  `id` varchar(255) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NUMBER` int(11) DEFAULT NULL,
  `USER_ID` varchar(19) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `album` */

insert  into `album`(`id`,`NAME`,`DESCRIPTION`,`NUMBER`,`USER_ID`) values ('58f8165f-7f8b-4a1d-b34b-3f91522b14e5','2','2',2,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
