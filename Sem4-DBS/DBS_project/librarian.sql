create table librarian(
lib_id number(5) not null,
lname varchar(100) not null,
password varchar(100) not null,
email varchar(100) not null,
ph_no number(10) not null,
primary key(lib_id)
);

insert into librarian values(101,'Bernard','dranreb','b@gmail.com',6665651001);
insert into librarian values(102,'Dolores','serolod','b@gmail.com',3433785691);
insert into librarian values(103,'Elliot','toille','e@gmail.com',8253192076);