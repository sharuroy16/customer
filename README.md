# customer
Sample java web project on Spring MVC, Hibernate, Spring Data JAP and Java Servlet JSP - CRUD operations

Check out for more information on the project:

https://www.sharudoestech.com/how-to-build-a-java-web-application-using-spring-framework-part-1-3-tools-installation/

Technologies/Tools:

1: Eclipse IDE — Oxygen (Release 4.15)
2: MySQL Server — Version 8.0.20
3: MySQL Workbench 8.0.20 for GUI
4: Spring MVC framework 5.1
5: Hibernate framework 5.4
6: Java 8 (jdk-13 and jre1.8.0_231)
7: Apache Tomcat 9
8: Spring Data JPA 2.1.5 (Java Persistence API)
9: Java Servlet 3.1 and Java Servlet JSP 2.3.1

Pre-requisites:

1: Correct Database details in persistance.xml file.

Tables

CREATE DATABASE customer;
use customer;

CREATE TABLE logindetails (
  id int NOT NULL AUTO_INCREMENT,
  username varchar(100) NOT NULL unique,
  userpassword varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into logindetails values(1, 'jane', 'jane123');
commit;

select * from logindetails;

Reach out to me at: https://www.sharudoestech.com/

