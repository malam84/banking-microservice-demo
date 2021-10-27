/************************Create Tabe************************/

CREATE TABLE customer (
    id int NOT NULL AUTO_INCREMENT,
    customerName varchar(255),
    email varchar(255) ,
    address varchar(255),
    country varchar(255),
    dob DATE, 
    phone int,
    userid int,
    PRIMARY KEY (id)
);