create table students6(
id int primary key,  
name varchar(20) not null,
email varchar(20) unique,
age int,
marks decimal
)
insert into students6 values(5,'rahul','r1@gmail.com',21,78.1);
insert into students6 values(2,'radha','radha@gmail.com',17,98);
insert into students6 values(3,'hamsa','hamsa@gmail.com',25,65);
insert into students6 values(4,'rani','rani@gmail.com',22,99);

select * from students6
select * from students6 where age>21
update students6 set email='rahul@gmail.com' where id=5
delete * from students6 where age<18
select * from students6  order by marks  limit 2 offset 2


create table students8(
id int primary key,
name varchar(20),
age int
)
create table courses1(
courseid int,
student_id int,
course_name varchar(20)
)

insert into students8 values(1,'Rahul',22);
insert into students8 values(2,'Priya',21);
insert into students8 values(3,'Akash',23);

insert into courses1 values(101,1,'java');
insert into courses1 values(102,2,'python');
insert into courses1 values(103,1,'sql');

select s.name,c.course_name from students8 s join courses1 c on  s.id=c.student_id



