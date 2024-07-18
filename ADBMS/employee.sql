create database exm;
use exm;
create table emp(eid int primary key,ename varchar(30),age int,salary int);
create table manager(mid int primary key,mname varchar(20));
create table dept(did int,budget int,mid int,foreign key(mid) references manager(mid),primary key(did,mid));
create table works(eid int,did int,category varchar(20),foreign key(eid )references emp(eid) ,foreign key(did) references dept(did),primary key(eid,did));

show  tables;
describe works;

insert into emp values(02,"haya",23,350000);
insert into works values(02,102,"full time");
insert into dept values(102,54600,11);
insert into manager values(11,"haya");

set sql_safe_updates=0;

select emp.ename,emp.age from emp join works on emp.eid=works.eid join dept on dept.did=works.did where dept.did=101;
select emp.ename,dept.did from emp join works on emp.eid=works.eid join dept on dept.did=works.did where emp.salary>30000;
insert into emp values(03,"lara",23,290000);
insert into works values(03,103,"full time");
insert into dept values(103,2000000,13);
insert into manager values(13,"minha");
select manager.mid,manager.mname from manager join dept on dept.mid=manager.mid where dept.budget>200000; 
select category, count(*)  from works group by category;
call  manager(11);


