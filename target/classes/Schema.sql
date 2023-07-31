 drop table if exists USERS;

CREATE TABLE IF NOT EXISTS USERS (
id INT PRIMARY KEY auto_increment,
name VARCHAR(20)
);

INSERT INTO USERS (name) VALUES ('a');
INSERT INTO USERS (name) VALUES ('b');
INSERT INTO USERS (name) VALUES ('c');
INSERT INTO USERS (name) VALUES ('d');