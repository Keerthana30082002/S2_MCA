create database university;
use university;
drop table section;
create table STUDENT(Name varchar(10),Student_number int primary key,Class int,Major varchar(20));
create table COURSE (Course_name varchar(30),Course_number varchar(20) primary key,Credit_hours int, Department varchar(15));
create table SECTION (Section_identifier int primary key,Course_number varchar(20),Semester varchar(10),Year int,Instructor varchar(15),foreign key (Course_number) references COURSE(Course_number));
create table GRADE_REPORT(Student_number int,Section_identifier int,Grade varchar(10),foreign key(Student_number)references STUDENT(Student_number),foreign key(Section_identifier)references Section(Section_identifier),primary key(Student_number,Section_identifier));
create table PREREQUISITE (Course_number varchar(20) ,Prerequisite_number varchar(20),foreign key (Course_number) references COURSE(Course_number),foreign key (Prerequisite_number) references COURSE(Course_number),primary key(Course_number,Prerequisite_number));
-- 02
insert into STUDENT values("Smith",17,1,"CS"),("Brown",8,2,"CS");
insert into COURSE values("Intro to Computer Science","CS1310",4,"CS"),("DataStructures","CS3320",4,"CS"),("Discrete Mathamatics","MATH2410",3,"MATH"),("Database","CS3380",3,"CS");
insert into SECTION values(85,"MATH2410","Fall",07,"King"),(92,"CS1310","Fall",07,"Anderson"),(102,"CS3320","Spring",08,"Knuth"),(112,"MATH2410","Fall",08,"Chang"),(119,"CS1310","Fall",08,"Anderson"),(135,"CS3380","Fall",08,"Stone");
insert into GRADE_REPORT values(17,112,"B"),(17,119,"C"),(8,85,"A"),(8,92,"A"),(8,102,"B"),(8,135,"A");
insert into PREREQUISITE values("CS3380","CS3320"),("CS3380","MATH2410"),("CS3320","CS1310");
set sql_safe_updates=0;
select c.course_name,g.grade from student s inner join grade_report g on s.Student_number=g.Student_number inner join section se on se.Section_identifier=g.Section_identifier inner join course c on se.Course_number=c.Course_number where s.Name="Smith";
select s.Name,g.Grade from student s inner join grade_report g on s.Student_number=g.Student_number inner join section se on g.Section_identifier=se.Section_identifier inner join course c on c.Course_number=se.Course_number where c.Course_name="Database" and se.Semester="Fall" and se.Year=08;
select Course_name from course c where Course_number in(select p.Prerequisite_number from prerequisite p join course c on p.Course_number=p.Course_number where p.Course_number=(select Course_number from Course where Course_name="Database")); 
create view seniors as select * from student where Class=2;
select Name from seniors;
select c.Course_name from course c join section s on c.Course_number=s.Course_number where s.Instructor="King";
select s.Course_number,s.Semester,s.Year,count(g.Student_number) as No_of_students from SECTION s join GRADE_REPORT g on s.Section_identifier=g.Section_identifier where s.Instructor="King" group by g.Section_identifier;
select s.Name,c.Course_name,c.Course_number,c.Credit_hours,se.Semester,se.Year,g.Grade from student s join grade_report g on s.Student_number = g.Student_number join section se on g.Section_identifier = se.Section_identifier join course c on se.Course_number = c.Course_number where s.Class=2 and s.Major="CS";
insert into STUDENT values("Johnson",25,1,"Math");
select * from student where Student_number=25;
update STUDENT set  Class=2 where Name="Smith";
select * from student where Name="Smith";
insert into COURSE values("Knowledge Engineering","CS4390",3,"CS");
select * from course where Course_number="CS4390";
delete from student where Name="Smith" and Student_number=17;
select * from student;



