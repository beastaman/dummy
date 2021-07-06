create table reservation (id int primary key auto_increment,
						  tableid int references tables(id),
                          userid int references user(id),
                          starttime datetime,
                          duration int, # minutes
                          unique key(tableid, userid, starttime));

alter table reservation auto_increment=4001;

insert into reservation (tableid, userid, starttime, duration) values
(2001, 3001, "2021-07-05 13:00:00", 100),
(2006, 3002, "2021-07-04 19:30:00", 120),
(2001, 3001, "2021-07-05 12:00:00", 45);