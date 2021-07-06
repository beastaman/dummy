create table student (
id varchar(6) primary key, 
fname varchar(30) not null,
lname varchar(12),
dob date,
area varchar(30),
phoneNo varchar(12));

create table marks (
id varchar(6) references student(id),
testno int check (testno between 1 and 6),
m1 int check (m1 between 0 and 100),
m2 int check (m2 between 0 and 100),
m3 int check (m3 between 0 and 100),
primary key(id,testno)
);

create table state (sid varchar(6) primary key, sname varchar(20) not null);

create table city (
cid varchar(6) primary key , 
cname varchar(15) not null,
sid varchar(6) references state(sid)
);

create table connect (
id varchar(6) references student(id),
cid varchar(6) references city(cid) 
);

alter table student add phoneNo varchar(12);

alter table student drop column phoneNo;
(yy/mm/dd)--> date


insert into student values 
('s104' , 'Kohli' , 'Tendulkar' , '1999/01/01' ,'delhi' , '9871310263') , 
('s105' , 'Kapil5' , 'Dev' , '1999/01/01' ,'punjab' , '987310263'),
('s106' , 'Kapil1' , 'Dev' , '1999/01/01' ,'punjab' , '987310263'),
('s107' , 'Kapil2' , 'Dev' , '1999/01/01' ,'punjab' , '987310263'),
('s108' , 'Kapil3' , 'Dev' , '1999/01/01' ,'punjab' , '987310263'),
('s109' , 'Kapil4' , 'Dev' , '1999/01/01' ,'punjab' , '987310263');

insert into marks values 
('s101' , 2 , '33' , '54' , '75'),
('s101' , 3 , '34' , '45' , '55'),
('s102' , 1 , '67' , '45' , '35'),
('s102' , 2 , '51' , '86' , '76'),
('s102' , 3 , '51' , '45' , '43');


insert into state values
('s1' , 'delhi'),
('s2' , 'mumbai'),
('s3' , 'goa'),
('s4' , 'up');

insert into city values 
('c1' , 'Lucknow' , 's3'),
('c2' , 'Delhi' , 's1');

insert into connect values 
('s101' , 'c1'),
('s102' , 'c1'),
('s103' , 'c2'),
('s104' , 'c2');
