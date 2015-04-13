INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('8', 'Augusta Longbottom', 'Grandmother', '321, First Street, Raleigh- 27606, USA', 'Raleigh', '27606', '94363659982');
INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('9', 'Nymphadora Tonks', 'Wife', '12, Grimmauld Place, London- 27605, England', 'England', '27605', '9363555752');
INSERT INTO `housing`.`student` (`id`, `password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`, `kin_id`) VALUES ('100540015', '123456', 'Neville', 'Longbottom', 'Student', 'Male', '9198942231', '321, First Street, Raleigh- 27606, USA', 'Raleigh', '27600', '1985-11-29', 'Freshman', 'American', 'No', 'None', 'Art', 'Placed', 'Herbology', '0');
INSERT INTO `housing`.`guest` (`id`, `fname`, `lname`, `type`, `gender`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('200540012', 'Remus', 'Lupin', 'Student', 'Male','12, Grimmauld Place, London-27605', 'London', '27605', '1972-11-29', 'Visitor', 'British', 'No', 'No', 'Defense Against Dark Arts');




INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('1', '1', '1');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('2', '2', '2');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('3', '3', '3');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('4', '4', '3');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('5', '3', '4');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('6', '4', '4');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('7', '5', '5');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('8', '5', '6');
INSERT INTO `housing`.`nearby` (`id`, `lot_id`, `house_id`) VALUES ('9', '6', '7');





INSERT INTO `housing`.`parking_spot_price` (`id`, `classification`, `price`) VALUES ('1', 'Handicapped', '25');
INSERT INTO `housing`.`parking_spot_price` (`id`, `classification`, `price`) VALUES ('2', 'Bike', '30');
INSERT INTO `housing`.`parking_spot_price` (`id`, `classification`, `price`) VALUES ('3', 'Small Car', '35');
INSERT INTO `housing`.`parking_spot_price` (`id`, `classification`, `price`) VALUES ('4', 'Large Car', '40');




INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('1', '1', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('2', '1', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('3', '1', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('4', '1', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('5', '2', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('6', '2', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('7', '2', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('8', '2', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('9', '2', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('10', '2', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('11', '3', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('12', '3', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('13', '3', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('14', '3', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('15', '3', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('16', '3', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('17', '4', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('18', '4', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('19', '4', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('20', '4', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('21', '5', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('22', '5', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('23', '5', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('24', '5', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('25', '5', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('26', '5', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('27', '5', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('28', '5', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('29', '6', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('30', '6', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('31', '6', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('32', '6', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('33', '6', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('34', '6', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('35', '6', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('36', '6', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('37', '6', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('38', '6', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('39', '6', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('40', '6', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('41', '7', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('42', '7', 'Handicapped');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('43', '7', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('44', '7', 'Bike');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('45', '7', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('46', '7', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('47', '7', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('48', '7', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('49', '7', 'Small Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('50', '7', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('51', '7', 'Large Car');
INSERT INTO `housing`.`parking_spot` (`id`, `lot_id`, `classification`) VALUES ('52', '7', 'Large Car');



INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('1', 'Dedicated');
INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('2', 'Dedicated');
INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('3', 'Dedicated');
INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('4', 'Dedicated');
INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('5', 'Dedicated');
INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('6', 'Dedicated');
INSERT INTO `housing`.`parking_lot` (`id`, `type`) VALUES ('7', 'General');





INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('1', '400', '1', '1','1');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('2', '400', '1', '2','2');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('3', '400', '1', '3','3');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('4', '400', '1', '4','4');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('5', '400', '1', '5','5');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('1', '450', '2', '6','6');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('2', '450', '2', '7','7');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('3', '450', '2', '8','8');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('1', '350', '3', '1','9');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('2', '350', '3', '2','10');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('3', '350', '3', '3','11');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('1', '350', '4', '4','12');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('2', '350', '4', '5','13');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('3', '350', '4', '6','14');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('4', '350', '4', '7','15');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('1', '375', '5', '8','16');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('2', '375', '5', '9','17');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('3', '375', '5', '10','18');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('1', '375', '6', '11','19');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('2', '375', '6', '12','20');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('3', '375', '6', '13','21');
INSERT INTO `housing`.`room` (`room_number`, `month_rate`, `house_id`, `place_number`,`id`) VALUES ('4', '375', '6', '14','22');






INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('1','1','100540001', '1', '2015-01-01', '2015-07-31', 'Semester','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('3','2','100540002', '9', '2015-01-01', '2015-07-31', 'Semester','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('1','3','100540003', '2', '2015-01-01', '2015-05-31', 'Monthly','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('1','4','100540004', '3', '2015-01-01', '2015-07-31', 'Monthly','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('5','5','100540005', '16', '2015-01-01', '2015-05-31', 'Monthly','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('5','6','100540006', '17', '2015-01-01', '2015-07-31', 'Semester','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('2','7','100540007', '6', '2015-01-01', '2015-07-31', 'Semester','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('4','8','200540001', '12', '2015-05-01', '2015-04-30', 'Monthly','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('4','9','200540002', '13', '2015-04-01', '2015-04-30', 'Monthly','current');
INSERT INTO `housing`.`lease` (`house_id`,`id`,`student_id`, `enter_date`, `leave_date`, `payment`,`status`) VALUES ('9','10','100540008', '2015-01-01', '2015-07-31', 'Semester','current');



INSERT INTO `housing`.`kin_info` (`id`, `name`, `relationship`, `addr`, `tel`) VALUES ('1', 'Sirius Black', 'Godfather', '12, Grimmauld Place', '9439560752');
INSERT INTO `housing`.`kin_info` (`id`, `name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('2', 'Lucius Malfoy', 'Father', '31 B, Malfoy Drive, New York- 27506, USA', 'New York', '27506', '9439560752');
INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('3', 'Aurthur Weasley', 'Father', '31 B, Weasley Road, Rome - 27456, Italy', 'Rome', '27456', '9436660752');
INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('4', 'Mr. Granger', 'Father', '32 A, Granger Road, Edinburg- 25556, Scotland', 'Edinburg', '25556', '9433360752');
INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('5', 'Igor Karkaroff', 'Headmaster', '32 A, Krum Road, Sofia- 2221, Bulgaria', 'Bulgaria', '2221', '94363530752');
INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('6', 'Bathilda Bagshot', 'Friend', '32 A, Bagshot Road, Zurich- 35221, Switzerland', 'Zurich', '35221', '94363595752');
INSERT INTO `housing`.`kin_info` (`id`,`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('7', 'Petunia Dursley', 'Wife', '32 A, Dursley Road, Raleigh- 27606, USA', 'Raleigh', '27606', '94363654752');



INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`,`type`) VALUES ('100540001', '2015-04-06', 'Water', 'Pending', 'No water','High');
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`,`type`) VALUES ('100540003', '2015-03-30', 'Internet', 'Complete', 'Internet not working','Medium');
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`,`type`) VALUES ('100540007', '2015-03-15', 'Cleaning', 'Complete', 'Cleaning','Low');
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`,`type`) VALUES ('200540002', '2015-04-02', 'Miscellaneous', 'Pending', 'Window broken','Low');




INSERT INTO `housing`.`staff` (`id`,`password`,`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('300540001','123456','Minerva', 'McGonagall', 'McGonagall Road, Delhi - 011, India', 'Delhi', '011', '1950-10-04', 'Female', 'Hall Manager', 'Gryffindor Hall');
INSERT INTO `housing`.`staff` (`id`,`password`,`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('300540002','123456','Severus', 'Snape', 'Snape Road, Lahore - 007, Pakistan', 'Lahore', '007', '1953-09-07', 'Male', 'Hall Manager', 'Slytherin Hall');
INSERT INTO `housing`.`staff` (`id`,`password`,`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('300540003','123456','Filius', 'Flitwick', 'Flitwick Road, Sydney - 050, Australia', 'Sydney', '050', '1960-10-06', 'Male', 'Hall Manager', 'Ravenclaw');
INSERT INTO `housing`.`staff` (`id`,`password`,`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('300540004','123456','Pomona', 'Sprout', 'Sprout Road, Berlin - 05963, Germany', 'Berlin', '05963', '1965-10-16', 'Female', 'Hall Manager', 'Hufflepuff');
INSERT INTO `housing`.`staff` (`id`,`password`,`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('300540005','123456','Albus', 'Dumbledore', 'Dumbledore Road, Gandhinagar - 382007, India', 'Gandhinagar', '382007', '1945-04-23', 'Male', 'Hall Manager', 'Hogwarts');




INSERT INTO `housing`.`guest` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('200540001', 'Viktor', 'Krum', 'Student', 'Male', '9198333567', '9198332233', '32 A, Krum Road, Sofia', 'Sofia', '2221', '1982-11-29', 'Visitor', 'Bulgarian', 'Yes', 'Placed', 'Coaching - Triwizard Cup');
INSERT INTO `housing`.`guest` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `courses`) VALUES ('200540002', 'Olympe', 'Maxime', 'Student', 'Female', '9197773567', '32 A, Maxime Road, Paris', 'Paris', '2331', '1970-05-19', 'Visitor', 'French', 'Yes', 'Guest Lecturer - Triwizard Cup');
UPDATE `housing`.`guest` SET `password`='123456' WHERE `id`='200540002';
UPDATE `housing`.`guest` SET `password`='123456' WHERE `id`='200540001';
UPDATE `housing`.`guest` SET `status`='Placed' WHERE `id`='200540002';
UPDATE `housing`.`guest` SET `addr`='32 A, Krum Road, Sofia - 2221, Bulgaria' WHERE `id`='200540001';
UPDATE `housing`.`guest` SET `addr`='32 A, Maxime Road, Paris - 2331, France' WHERE `id`='200540002';




INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('100540008','123456', 'Vernon', 'Dursley', 'Family', 'Male', '9198954357', '9198954786', '32 A, Dursley Road, Raleigh', 'Raleigh', '27606', '1975-11-29', 'Graduate', 'American', 'Yes', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540003','123456', 'Ron', 'Weasley', 'Student', 'Male', '9189567067', '31 B, Weasley Road, Rome', 'Rome', '27456', '1986-03-01', 'Freshman', 'Italian', 'No', 'None', 'Placed', 'Care of Magical Creatures');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540004','123456', 'Hermione', 'Granger', 'Student', 'Female', '9189568567', '32 A, Granger Road, Edinburg', 'Edinburg', '25556', '1986-09-19', 'Freshman', 'Scottish', 'No', 'None', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540005','123456', 'Fred', 'Weasley', 'Student', 'Male', '9133368567', '9133368511', '31 B, Weasley Road, Rome', 'Rome', '27456', '1982-10-20', 'Senior', 'Italian', 'No', 'None', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540006','123456', 'George', 'Weasley', 'Student', 'Male', '9133368568', '31 B, Weasley Road,Rome', 'Rome', '27456', '1982-10-20', 'Senior', 'Italian', 'No', 'None', 'Placed', 'Muggle Studies');
UPDATE `housing`.`student` SET `addr`='31 B, Malfoy Drive, New York' WHERE `id`='100540002';
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540007','123456', 'Bill', 'Weasley', 'Family', 'Male', '9198568567', '32 A, William Road, Brussels', 'Brussels', '2535', '1982-11-29', 'Graduate', 'Belgian', 'No', 'Difficulty in walking', 'Placed', 'Potions');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540001','123456', 'Harry', 'Potter', 'Student', 'Male', '9189327078', '9176326078', '31 B, Privet Drive, London - 27605, England', 'London', '27605', '1991-07-21', 'Freshman', ' British', 'No', 'None', 'Placed', 'Defence Against Dark Arts');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540002','123456', 'Draco', 'Malfoy', 'Student', 'Male', '9189327067', '31 B, Malfoy Drive, New York- 27506, USA', 'New York', '27506', '1990-06-05', 'Freshman', 'American', 'Yes', 'None', 'Placed', 'Muggle Studies');
UPDATE `housing`.`student` SET `addr`='31 B, Weasley Road, Rome - 27456, Italy' WHERE `id`='100540003';
UPDATE `housing`.`student` SET `addr`='32 A, Granger Road, Edinburg - 25556, Scotland' WHERE `id`='100540004';
UPDATE `housing`.`student` SET `addr`='31 B, Weasley Road, Rome - 27456, Italy' WHERE `id`='100540005';
UPDATE `housing`.`student` SET `addr`='31 B, Weasley Road,Rome - 27456, Italy' WHERE `id`='100540006';
UPDATE `housing`.`student` SET `addr`='32 A, William Road, Brussels - 2535, Belgium' WHERE `id`='100540007';
UPDATE `housing`.`student` SET `addr`='32 A, Dursley Road, Raleigh - 27606, USA' WHERE `id`='100540008';
UPDATE `housing`.`student` SET `addr`='31 B, Malfoy Drive, New York - 27506, USA' WHERE `id`='100540002';


UPDATE `housing`.`guest` SET `password`='123456' WHERE `id`='200540003'

INSERT INTO `housing`.`general_apartment` (`id`, `name`, `addr`, `tel`, `room_count`, `bath_count`, `rent`, `deposit`) VALUES ('3', 'Ravenclaw', '315, Gorman Crossings, Raleigh - 27606, NC', '919 540 003', '3', '3', '350', '400');
INSERT INTO `housing`.`general_apartment` (`id`, `name`, `addr`, `tel`, `room_count`, `bath_count`, `rent`, `deposit`) VALUES ('4', 'Ravenclaw', '315, Gorman Crossings, Raleigh - 27606, NC', '919 540 003', '4', '4', '350', '400');
INSERT INTO `housing`.`general_apartment` (`id`, `name`, `addr`, `tel`, `room_count`, `bath_count`, `rent`, `deposit`) VALUES ('5', 'Hufflepuff', '515, University Commons, Raleigh - 27606, NC', '919 540 004', '3', '3', '375', '450');
INSERT INTO `housing`.`general_apartment` (`id`, `name`, `addr`, `tel`, `room_count`, `bath_count`, `rent`, `deposit`) VALUES ('6', 'Hufflepuff', '515, University Commons, Raleigh - 27606, NC', '919 540 004', '4', '4', '375', '450');




INSERT INTO `housing`.`family_apartment` (`id`, `name`, `addr`, `tel`, `apt_num`, `bed_count`, `month_rate`, `deposit`) VALUES ('7', 'Hogwarts', '300, Wade Avenue, Raleigh - 27606, NC', '919 540 005', '105', '1', '450', '500');
INSERT INTO `housing`.`family_apartment` (`id`, `name`, `addr`, `tel`, `apt_num`, `bed_count`, `month_rate`, `deposit`) VALUES ('8', 'Hogwarts', '300, Wade Avenue, Raleigh - 27606, NC', '919 540 005', '106', '2', '550', '600');
INSERT INTO `housing`.`family_apartment` (`id`, `name`, `addr`, `tel`, `apt_num`, `bed_count`, `month_rate`, `deposit`) VALUES ('9', 'Hogwarts', '300, Wade Avenue, Raleigh - 27606, NC', '919 540 005', '107', '3', '700', '800');




INSERT INTO `housing`.`residence_hall` (`id`, `name`, `addr`, `room_count`, `tel`, `rent`, `deposit`,`specific`) VALUES ('1', 'Gryffindor Hall', '2751 Cates Avenue, Gryffindor Residence Hall, Raleigh, NC 27607', '5', '919 540 001', '400', '400','0');
INSERT INTO `housing`.`residence_hall` (`id`, `name`, `addr`, `room_count`, `tel`, `rent`, `deposit`,`specific`) VALUES ('2', 'Slytherin Hall', '210 Dan Allen Dr, Raleigh, NC 27695', '3', '919 540 002', '450', '500','1');

INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540010','123456', 'George', 'Weasley', 'Student', 'Male', '9133368568', '31 B, Weasley Road,Rome', 'Rome', '27456', '1982-10-20', 'Senior', 'Italian', 'No', 'None', 'Placed', 'Muggle Studies');
UPDATE `housing`.`student` SET `addr`='31 B, Malfoy Drive, New York' WHERE `id`='100540010';

INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('1', '1', '2015-01-01','check','current','2505');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('2', '2', '2015-01-01','check','current','2265');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('3', '6', '2015-01-01','credit','current','2440');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('4', '7', '2015-01-01','credit','current','2875');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('5', '8', '2015-01-01','cash','current','4415');


INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('6', '3', '2015-04-01','credit','current','435');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('7', '4', '2015-04-01','check','current','435');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('8', '5', '2015-04-01','cash','current','410');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('9', '8', '2015-04-01','check','current','385');
INSERT INTO `housing`.`invoice` (`id`, `lease_id`,`pay_date`,`pay_method`,`status`, `total`) VALUES ('10', '9', '2015-04-01','credit','current','385');





INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('1005408000','123456', 'Vernon', 'Dursley', 'Family', 'Male', '9198954357', '9198954786', '32 A, Dursley Road, Raleigh', 'Raleigh', '27606', '1975-11-29', 'Graduate', 'American', 'Yes', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('1005408001','123456', 'Vernon', 'Dursley', 'Family', 'Male', '9198954357', '9198954786', '32 A, Dursley Road, Raleigh', 'Raleigh', '27606', '1975-11-29', 'Graduate', 'American', 'Yes', 'Placed', 'Muggle Studies');

/*Link kin_info with student and guest*/

UPDATE `housing`.`student` SET `kin_id`='1' WHERE `id`='100540001';
UPDATE `housing`.`student` SET `kin_id`='2' WHERE `id`='100540002';
UPDATE `housing`.`student` SET `kin_id`='3' WHERE `id`='100540003';
UPDATE `housing`.`student` SET `kin_id`='4' WHERE `id`='100540004';
UPDATE `housing`.`student` SET `kin_id`='3' WHERE `id`='100540005';
UPDATE `housing`.`student` SET `kin_id`='3' WHERE `id`='100540006';
UPDATE `housing`.`student` SET `kin_id`='3' WHERE `id`='100540007';
UPDATE `housing`.`student` SET `kin_id`='7' WHERE `id`='100540008';
UPDATE `housing`.`guest` SET `kin_id`='5' WHERE `id`='200540001';
UPDATE `housing`.`guest` SET `kin_id`='6' WHERE `id`='200540002';

/*parking_spot availablity*/
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='1';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='3';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='6';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='9';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='14';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='19';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='23';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='27';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='31';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='34';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='52';
UPDATE `housing`.`parking_spot` SET `availability`='available' WHERE `id`='48';

/*Fill in NULL area*/
UPDATE `housing`.`guest` SET `alter_tel`='None' WHERE `id`='200540002';
UPDATE `housing`.`kin_info` SET `city`='None' WHERE `id`='1';
UPDATE `housing`.`kin_info` SET `post_code`='None' WHERE `id`='1';
UPDATE `housing`.`student` SET `alter_tel`='0', `comment`='Math' WHERE `id`='100540002';
UPDATE `housing`.`student` SET `alter_tel`='0', `comment`='Chess' WHERE `id`='100540003';
UPDATE `housing`.`student` SET `alter_tel`='0', `comment`='Math' WHERE `id`='100540004';
UPDATE `housing`.`student` SET `alter_tel`='0', `comment`='Art' WHERE `id`='100540006';
UPDATE `housing`.`student` SET `alter_tel`='0', `comment`='Math' WHERE `id`='100540007';
UPDATE `housing`.`student` SET `alter_tel`='0', `comment`='Chess' WHERE `id`='100540010';
UPDATE `housing`.`student` SET `comment`='Art' WHERE `id`='100540001';
UPDATE `housing`.`student` SET `comment`='Art' WHERE `id`='100540005';
UPDATE `housing`.`student` SET `comment`='Art' WHERE `id`='100540008';
UPDATE `housing`.`student` SET `need`='None', `comment`='Math' WHERE `id`='100540008';
UPDATE `housing`.`student` SET `comment`='Art' WHERE `id`='100540005';
UPDATE `housing`.`student` SET `comment`='Biology' WHERE `id`='100540006';


