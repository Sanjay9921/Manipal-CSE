
drop table librarian;
drop table books;
CREATE TABLE librarian
(
	L_id number(10),
	Name varchar(20),
	Password varchar(20),
	Email varchar(20),
	Address varchar(20),
	City varchar(20),
	Contact_No number(10)
);

insert into librarian values(1,'Bernard','bernard','bernard','Bernard','Bernard',12345);
insert into librarian values(2,'Elliot','elliot','elliot','Elliot','elliot',67890);


create table books
(
B_id number(10),
title varchar(40),
author varchar(20),
publisher varchar(30),
Quantity number(10),
Issued number(10),
primary key(B_id));

insert into books values(1010,'Fund. of Comp. Sci.','Jake Paul','McGrawHill',10,0);
insert into books values(1053,'Data Structures','Sartaj Singh','Goyal',10,0);
insert into books values(1032,'Algorithms','Thomas Cormen','Penguin',10,0);
insert into books values(2041,'To Kill a Mockingbird','Harper Lee','Random House',10,0);
insert into books values(2063,'Macbeth','William Shakespeare','McGrawHill',10,0);
insert into books values(2075,'Fund. Of Psychology','Simon Baker','McGrawHill',10,0);
insert into books values(2083,'Database Concepts','Logan Paul','Goyal',10,0);
insert into books values(2093,'Literary Analysis','Aditi','Manipal Publication',10,0);
insert into books values(1029,'Rocket Science 101','E. Lon Monk','Manipal Publication',10,0);
insert into books values(1696,'Mass Transfer','Venkata Acharya','Manipal Publication',10,0);
insert into books values(1702,'Conduction','Pochinki','Goyal',10,0);
insert into books values(1333,'Mechanics for all','Vrinda Kaul','Goyal',10,0);
insert into books values(1414,'Intro to Neurobiology','Abinav Chaterjee','Penguin',10,0);
insert into books values(2199,'Data Mining','Megan James','Penguin',10,0);
insert into books values(1500,'Machine Learning for dummies','Andrew NG','Random House',10,0);