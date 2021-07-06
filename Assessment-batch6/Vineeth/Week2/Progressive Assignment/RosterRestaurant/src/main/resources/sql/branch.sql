drop database roster;
create database roster;
use roster;

create table branch (id int primary key auto_increment,
					 name varchar(30),
                     open datetime,
                     close datetime,
                     address varchar(30));
                     
alter table branch auto_increment = 1001; 

insert into branch (name, open, close, address) values
("Branch 1", "1970-01-01 11:30:00", "1970-01-01 23:00:00", "Address 1"),
("Branch 2", "1970-01-01 10:00:00", "1970-01-01 22:00:00", "Address 2"),
("Branch 3", "1970-01-01 07:30:00", "1970-01-01 18:00:00", "Address 3");
