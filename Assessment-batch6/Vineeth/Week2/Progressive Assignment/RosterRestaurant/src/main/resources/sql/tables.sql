create table tables (id int primary key auto_increment,
					 branchid int references branch(id),
                     tableno int,
                     unique key(branchid, tableno));

alter table tables auto_increment=2001;

insert into tables (branchid, tableno) VALUES
(1001, 1),
(1001, 2),
(1001, 3),
(1001, 4),
(1002, 1),
(1002, 2),
(1002, 3),
(1003, 1),
(1003, 2),
(1003, 3),
(1003, 4);