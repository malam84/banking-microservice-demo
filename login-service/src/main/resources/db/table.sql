/*******************************Create Table**********************************/
CREATE TABLE user (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    email varchar(255),
    dob DATE, 
    PRIMARY KEY (id)
);