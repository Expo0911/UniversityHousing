SET FOREIGN_KEY_CHECKS=0;




DROP TABLE IF EXISTS `family_apartment`;
CREATE TABLE `family_apartment` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `addr` varchar(255) default NULL,
  `tel` varchar(20) default NULL,
  `vacancy` int(1) NOT NULL default 0,
  `apt_num` int(11) NOT NULL default 0,
  `bed_count` int(11) NOT NULL default 0,
  `month_rate` float NOT NULL default 0,
  `deposit` float NOT NULL default 0,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `family_member`;
CREATE TABLE `family_member` (
  `id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL default 0,
  `name` varchar(255) default NULL,
  `birth_date` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `general_apartment`;
CREATE TABLE `general_apartment` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `addr` varchar(255) default NULL,
  `tel` varchar(255) default NULL,
  `room_count` int(11) NOT NULL default 0,
  `bath_count` int(11) NOT NULL default 0,
  `rent` float NOT NULL default 0,
  `deposit` float NOT NULL default 0,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `invoice`;
CREATE TABLE `invoice` (
  `id` int(11) NOT NULL auto_increment,
  `due_date` datetime default NULL,
  `lease_id` int(11) NOT NULL default 0,
  `pay_date` datetime default NULL,
  `pay_method` varchar(50) default NULL,
  `status` varchar(20) default NULL,
  `penalty` float NOT NULL default 0,
  `damage_charge` float NOT NULL default 0,
  `late_fee` float NOT NULL default 0,
  `total` float(255,0) NOT NULL default 0,
  PRIMARY KEY  (`id`),
  FOREIGN KEY (`lease_id`) REFERENCES `housing`.`lease` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TRIGGER `housing`.`invoice_BEFORE_INSERT` BEFORE INSERT ON `invoice` FOR EACH ROW
	set NEW.total=NEW.penalty+NEW.damage_charge+NEW.late_fee;
CREATE TRIGGER `housing`.`invoice_BEFORE_UPDATE` BEFORE UPDATE ON `invoice` FOR EACH ROW
	set NEW.total=NEW.penalty+NEW.damage_charge+NEW.late_fee;


DROP TABLE IF EXISTS `kin_info`;
CREATE TABLE `kin_info` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `relationship` varchar(255) default NULL,
  `addr` varchar(255),
  `city` varchar(50) default NULL,
  `post_code` varchar(10) default NULL,
  `tel` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `lease`;
CREATE TABLE `lease` (
  `id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL default 0,
  `house_id` int(11) NOT NULL default 0,
  `room_id` int(11) NOT NULL default 0,
  `room_num` varchar(50) default NULL,
  `duration` varchar(50) default NULL,
  `enter_date` datetime default NULL,
  `leave_date` datetime default NULL,
  `deposit` double NOT NULL default 0,
  `payment` varchar(50) default NULL,
  `penalty` double NOT NULL default 0,
  `status` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TRIGGER `housing`.`lease_BEFORE_INSERT` BEFORE INSERT ON `lease` FOR EACH ROW
	set NEW.duration=datediff(NEW.leave_date,NEW.enter_date);



DROP TABLE IF EXISTS `lease_request`;
CREATE TABLE `lease_request` (
  `id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL default 0,
  `preference1` varchar(50) default NULL,
  `preference2` varchar(50) default NULL,
  `preference3` varchar(50) default NULL,
  `payment_method` varchar(50) default NULL,
  `status` varchar(40) default NULL,
  `start_date` datetime default NULL,
  `end_date` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `nearby`;
CREATE TABLE `nearby` (
  `id` int(11) NOT NULL auto_increment,
  `lot_id` int(11) NOT NULL,
  `house_id` int(11) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `parking_lot`;
CREATE TABLE `parking_lot` (
  `id` int(11) NOT NULL auto_increment,
  `type` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





DROP TABLE IF EXISTS `parking_spot_occupy`;
CREATE TABLE `parking_spot_occupy`(
 `id` int(11) NOT NULL auto_increment,
 `parking_spot_id` int(11) NOT NULL,
 `student_id` int(11) NOT NULL,
 PRIMARY KEY(`id`),
 UNIQUE(`parking_spot_id`),
 UNIQUE(`student_id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 


DROP TABLE IF EXISTS `parking_spot_price`;
CREATE TABLE `parking_spot_price`(
 `id` int(11) NOT NULL auto_increment,
 `classification` varchar(40) NOT NULL,
 `price` float NOT NULL default 0,
 PRIMARY KEY(`id`),
 UNIQUE(`classification`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 



DROP TABLE IF EXISTS `parking_spot`;
CREATE TABLE `parking_spot` (
  `id` int(11) NOT NULL auto_increment,
  `lot_id` int(11) NOT NULL default 0,
  `classification` varchar(40) default NULL,
  `fee` float NOT NULL default 0,
  `availability` int(1) NOT NULL default 0,
  `start_date` datetime default NULL,
  `end_date` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;






DROP TABLE IF EXISTS `residence_hall`;
CREATE TABLE `residence_hall` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `addr` varchar(255),
  `room_count` int(11) NOT NULL default 0,
  `tel` varchar(20) default NULL,
  `manager_id` int(11) NOT NULL default 0,
  `rent` float NOT NULL default 0,
  `deposit` float NOT NULL default 0,
  `specific` int(11) NOT NULL default 0,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





DROP TABLE IF EXISTS room;
CREATE TABLE room (
id int(11) NOT NULL auto_increment,
room_number varchar(50) default NULL,
month_rate float NOT NULL default 0,
`vacancy` int(1) NOT NULL default 0,
house_id int(11) NOT NULL default 0,
place_number int(11) NOT NULL default 0,
PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `id` int(11) NOT NULL auto_increment,
  `password` varchar(20) default NULL,
  `fname` varchar(20) default NULL,
  `lname` varchar(20) default NULL,
  `addr` varchar(255),
  `city` varchar(50) default NULL,
  `post_code` varchar(10) default NULL,
  `birth_date` datetime default NULL,
  `gender` varchar(10) default NULL,
  `position` varchar(255) default NULL,
  `work_at` varchar(255) default NULL COMMENT 'housing office or hall',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL auto_increment,
  `password` varchar(50) default NULL,
  `fname` varchar(50) default NULL,
  `lname` varchar(50) default NULL,
  `type` varchar(255) default NULL COMMENT 'student type',
  `gender` varchar(10) default NULL,
  `tel` varchar(20) default NULL,
  `alter_tel` varchar(20) default NULL,
  `addr` varchar(255),
  `city` varchar(255) default NULL,
  `post_code` varchar(10) default NULL,
  `birth_date` datetime default NULL,
  `category` varchar(255) default NULL,
  `nation` varchar(40) default NULL,
  `smoker` varchar(40) default NULL,
  `need` varchar(255) COMMENT 'special need',
  `comment` varchar(255),
  `status` varchar(10) default NULL,
  `courses` varchar(255),
  `kin_id` int(11) NOT NULL default 0 COMMENT 'emergency contact',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `guest`;
CREATE TABLE `guest` (
  `id` int(11) NOT NULL auto_increment,
  `password` varchar(50) default NULL,
  `fname` varchar(50) default NULL,
  `lname` varchar(50) default NULL,
  `type` varchar(255) default NULL COMMENT 'student type',
  `gender` varchar(10) default NULL,
  `tel` varchar(20) default NULL,
  `alter_tel` varchar(20) default NULL,
  `addr` varchar(255),
  `city` varchar(255) default NULL,
  `post_code` varchar(10) default NULL,
  `birth_date` datetime default NULL,
  `category` varchar(255) default NULL,
  `nation` varchar(40) default NULL,
  `smoker` varchar(40) default NULL,
  `need` varchar(255) COMMENT 'special need',
  `comment` varchar(255),
  `status` varchar(10) default NULL,
  `courses` varchar(255),
  `kin_id` int(11) NOT NULL default 0 COMMENT 'emergency contact',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `termin_req`;
CREATE TABLE `termin_req` (
  `id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL default 0,
  `lease_id` int(11) NOT NULL default 0,
  `reason` varchar(255),
  `date` datetime default NULL,
  `status` varchar(40) default NULL,
  `inspection_date` datetime default NULL,
  `extra_fee` float(255,0) NOT NULL default 0,
  PRIMARY KEY  (`id`),
  FOREIGN KEY (`lease_id`) REFERENCES `housing`.`lease` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;






DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `id` int(11) NOT NULL auto_increment,
  `type` varchar(20) default NULL COMMENT 'serverity',
  `student_id` int(11) NOT NULL default 0,
  `date` datetime default NULL,
  `issue` varchar(255),
  `status` varchar(20),
  `comment` varchar(255),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





DROP TABLE IF EXISTS `parking_request`;
CREATE TABLE `parking_request` (
  `id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL default 0,  
  `nearby` int(1) NOT NULL default 0,  
  `classification` varchar(20) default NULL,
  `status` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `housing_interest`;
CREATE TABLE `housing_interest`(
	`id` int(11) NOT NULL auto_increment,
	`house_id` int(11) NOT NULL,
	`interests` varchar(20) NOT NULL,
	PRIMARY KEY  (`id`),
	UNIQUE(`house_id`)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
