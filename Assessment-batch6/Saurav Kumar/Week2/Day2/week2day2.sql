NOTE: name of foreign key and PK should be same(for join condition) -> column name should be same if exists, 

DQL: data query	(select)	
	1) selection : selecting few rows (entities)
	2) projection : selecting few columns 
	
select all * from student : (all -> with duplicates data) opposite of all -> distinct
select distinct area from student;
select area from student;
select all * from student;

Column alise:
select id 'user id', fname 'name' from student;

Table alisase: (temporary name to table)
select a.id 'user id', a.fname 'name' from student a;

Selections:
select a.id 'user id', a.fname 'name' from student a where a.id = 's101'or a.id = 's105';

Optimised query: executes at higher speed --> use sql operators and proper structures
	In, between, not, like, isnull
	
	select a.id 'user id', a.fname 'name' from student a where a.id In ( 's101', 's105');
	
	select a.id 'user id', a.fname 'name' from student a where a.id Not In ( 's101', 's105');
	
	select a.id 'user id', a.fname 'name' from student a where a.id between  's101' and 's105';

	select a.id 'user id', a.fname 'name' from student a where a.id not between  's101' and 's105';
	
	select a.id 'user id', a.fname 'name' from student a where a.fname like 'k%';
	
	select a.id 'user id', a.fname 'name' from student a where a.fname like '%k';
	
	select a.id 'user id', a.fname 'name' from student a where a.fname like '_a%'; (second char a)
	
	select a.id 'user id', a.fname 'name' from student a where UPPER(a.fname) like '_A%';
	

Functions : UPPER, LOWER, TRIM, LTRIM : 
	
	select a.id 'user id', UPPER(a.fname) 'name' , CONCAT(trim(a.fname) , '-' , trim(a.lname)) 'fullname' from student a where UPPER(a.fname) like '_A%';
	
	select a.id, a.fname, a.dob, (year(now()) - year(a.dob)) 'age' from student a;
	
	select a.id, a.fname, a.dob, (month(now()) - month(a.dob)) 'month diff', day(now()), day(a.dob) from student a;
	
	day(now()), day(a.dob)
	
	round, mod, 
	
	
	
select id, m1, m2, m3, testno, CASE 
WHEN m1 < 35 or m2 < 35 or m3 < 35 THEN 'Fail'
WHEN ((m1 + m2 + m3) / 3) < 50 THEN 'Pass'
WHEN ((m1 + m2 + m3) / 3) < 60 THEN 'Second class'
WHEN ((m1 + m2 + m3) / 3) < 74 THEN 'First class'
ELSE 'Distinction' END 'Result' from marks;
	
	
JOINS: INNER, OUTER, left, right, equi join, self, natural, cross, 
	   cartisian, theta join, natural, inner, outer, self
	   
	   Cartisian: selecting data from multiple tables without providing joining conditions. In this case,
				  take 1 row of 1st table and combines with all the rows of the 2nd table.
				  N*M tuples
				  
				  SELECT a.* , b.* from student a, marks b 
				  
				  SELECT a.* , b.* from student a, marks b where a.id = b.id; //theta join using where clasue
				  
				  SELECT * from student NATURAL JOIN marks; //natural
				  SELECT * from student a NATURAL JOIN marks b;
	
				  select a.*, b.* from student a JOIN marks b ON a.id = b.id; //theta

				  select a.*, b.* from student a JOIN marks b; //cartisian
				  
				  select a.*, b.* from student a INNER JOIN marks b ON a.id = b.id;
				  
				  select a.* from student a INNER JOIN marks b ON a.id = b.id;
				  
				  select * from student a INNER JOIN city;
				  
				  SELECT * from student NATURAL JOIN marks;

				
				  ---> name, total marks, city name
				  
				  select id, fname, (m1 + m2 + m3) 'total marks' , cname from student NATURAL JOIN marks
				  NATURAL Join connect NATURAL JOIN city;
				  
				  select a.id, a.fname, b.testno, b.m1 from student a INNER JOIN marks b ON (a.id = b.id);
				  
				  
				  select a.id, a.fname, b.testno, b.m1, d.cname from student a INNER JOIN marks b ON (a.id = b.id)
				  INNER JOIN connect c  ON (a.id = c.id) INNER JOIN city d ON (c.cid = d.cid);
				  

OUTER : LEFT OUTER, RIGHT OUTER, FULL OUTER

		LEFT: PK present, FK not present (data present in student, but not in marks)
		RIGHT : FK present, PK not present (do not allows this) : vary rare
		FULL : LEFT + RIGHT 
				  
		List of student who has taken frist test. (inner join)
			select a.id, a.fname, b.testno, (b.m1 + b.m2 + b.m3) 'total' from student a INNER JOIN marks b 
				ON (a.id = b.id and b.testno = 1) ;
		
		LOS who has not take first test. (outer) [when there is negation]
			select a.id, a.fname, b.testno, (b.m1 + b.m2 + b.m3) 'total' from student a LEFT OUTER JOIN marks b 
				ON (a.id = b.id and b.testno = 1) where b.testno IS NULL;
				
			select a.id, a.fname, ifnull (b.testno, 'Absent'), ifnull(b.m1 + b.m2 + b.m3 , '0') 'total' from student a LEFT OUTER JOIN marks b 
				ON (a.id = b.id and b.testno = 1) where b.testno IS NULL  ;
			
Aggregate fun, sub query, user defined function:



user --> java ---> db 
we need a driver: small program which communicate bw java and db: 
	1)	type1 : odbc (open db connectivity) 
	2)	type2 : network driver 
	3)	type3 : native driver (design for particular applications)
	4)	type4 : called as thin drivers (works on all the above types) 





























insert into check1 values (1 , 'user1') , (2 , 'user2');
				  
				  
				  
				  
				  

				  
				  
				  
				  














	
	

	
	

	