<<<<<<< HEAD
set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_nasu;
create database logindb_nasu;
use logindb_nasu;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1, "taro","123"),
(2, "jiro","123"),
(3, "hanako","123"),
(4, "saburo","123");
=======
set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_nasu;
create database logindb_nasu;
use logindb_nasu;

create table_user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro","123");
(2,"jiro","123");
(3,"hanako","123");
(4,"saburo","123");
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
