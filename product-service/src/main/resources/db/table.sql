CREATE TABLE product(
    id int NOT NULL AUTO_INCREMENT,
    prod_name varchar(50),
    prod_category varchar(50),
    min_amt float,
    max_amt float,
    min_period int,
    max_period int,
    prod_status boolean,
    created_date DATE,
    PRIMARY KEY (id)
)

ALTER TABLE product ADD COLUMN prod_category VARCHAR(50) AFTER prod_name;