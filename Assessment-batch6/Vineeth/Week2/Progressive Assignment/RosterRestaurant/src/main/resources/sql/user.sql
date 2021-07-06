create table user (id int primary key auto_increment,
				   email varchar(50) unique key,
                   password varchar(50),
                   fname varchar(30),
                   lname varchar(30),
                   phone varchar(15));

alter table user auto_increment=3001;

insert into user (email, password, fname, lname, phone) VALUES
('u1@example.com', 'pass1', 'User', '1', '1111111111'),
('u2@example.com', 'pass2', 'User', '2', '2222222222');