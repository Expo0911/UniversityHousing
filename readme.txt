<<<<<<< HEAD
=======
Instruction on how to use our website and database;

Step1: install MyEclipse, MySQL, Tomcat 7.0 or higher on your computer, MySQLWorkBench(for better testing)
       http://tomcat.apache.org
       problems will occur if you do not use Tomcat

Step2: import Existing project called "UnivHousing" in MyEclipse

Step3: in Mysql create database called "housing", paste all the information from “UnivHousing/db/housing.sql” and “UnivHousing/db/testData.sql” in Mysql, then our test database will be set.

Step4: run the project in MyEclispe as MyEclipse Server Application, in the console you will see for example the "Server startup in 6704ms", which means you can now use the server system we build

Step5: you may now copy the URL from the first line of MyEclispe Web Browser and paste it into your Safari or chrome or IE, for example in my computer it is "http://10.139.62.72:8080/UnivHousing/"

Step6: begin testing, in your web explorer you will see the initial page and you can login as guest/student/supervise, remember that the initial password has been set as "123456", you only need the Unity id or approval id to login (find them in Database, you can use SELECT s.id FROM student s).

Step7: now you can test the system as you wish (for new request, like new lease, new ticket, new termination, when you submit, there is no response notice when you have successfully submitted, but you can view them in the view options, some forms will be empty if you do not submit new request or if you do not load our test data)

Have a nice day : )


CSC540 Database project by Team 6: 
shou3, yhuang34, ldong6, sxu11
>>>>>>> master

