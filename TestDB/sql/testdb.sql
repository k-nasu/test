drop database if exists testdb_nasu;
create database testdb_nasu;
use testdb_nasu;

create table test_table(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into test_table values(1,"taro","123");
insert into test_table values(2,"taro","456");
insert into test_table values(3,"taro","789");
