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
