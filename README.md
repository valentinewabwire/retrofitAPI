# retrofitAPI
Communication between localhost and mobile app.

USE this SQL on DB:
<br>

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    email varchar(200) NOT NULL,
    password text NOT NULL,
    name varchar(500) NOT NULL,
    school varchar(1000) NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (id)
);
