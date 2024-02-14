drop table student;
drop table faculty;

create table student(
s_id number(10),
sname varchar(20),
dept_name varchar(20),
address varchar(20),
year number(5), 
contact number(10),
primary key(s_id)
);


insert into student values(1,'Matthew','Comp. Sci.','Block 14',2,11111);
insert into student values(2,'Mark','IT','Block 15',3,22222);
insert into student values(5,'Luke','Literature','Block 15',1,33333);
insert into student values(7,'John','Bible Studies','Block 16',1,44444);
insert into student values(8,'Mary','Psychology','Block 22',2,55555);
insert into student values(9,'Obanga','Comp. Sci','Block 9',2,66666);
insert into student values(12,'Priyadarshini','IT','Block 13',4,77777);
insert into student values(14,'Merlyn','Literature','Block 21',3,88888);
insert into student values(11,'Kriti','Psychology','Block 12',3,99999);
insert into student values(20,'Veronica','Bible Studies','Block 11',3,101010);
insert into student values(13,'Natasha','IT','Block 3',2,111111);


create table faculty(
f_id number(10),
fname varchar(20),
dept_name varchar(20),
address varchar(20),
salary number(10),
primary key(f_id)
);


insert into faculty values(10501, 'Jesus', 'Comp. Sci.', 'Manipal', 170000);
insert into faculty values(10405, 'Paul', 'IT', 'Mangalore', 180000);
insert into faculty values(10306, 'Judas', 'Bible Studies', 'Vatican City', 150000);
insert into faculty values(10207, 'Peter', 'Literature', 'Bangalore', 190000);
insert into faculty values(10108, 'Arjun', 'Psychology', 'Colaba', 180000);

