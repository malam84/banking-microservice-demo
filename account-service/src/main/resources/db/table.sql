/***************************Create Table******************************/

CREATE TABLE account(
   id int NOT NULL AUTO_INCREMENT,
   accno int NOT NULL,
   acctype varchar(55),
   amt float,
   createdDate Date,
   status boolean,
   custId int,
   PRIMARY KEY (id)
 );