create table user (
userid varchar(30) primary key,
userpassword varchar(30),
status varchar(5)
);

insert into user values 
('u1@gmail.com' , 'password1' , 'admin'), 
('u2@gmail.com' , 'password2' , 'user');

commit;

1) create database connection 
2) create POJO for user table
3) create dao to read data
4) create controller


MVC: model view controller

Model: (dao class) reading data from db
view: (login.jsp) user interface  (html page for login)
controller: (servlet) takes control from the login page and call dao, based on the output of dao, controller will call different views(jsp pages)




