CREATE DATABASE kkj;
use kkj;

 CREATE TABLE Product(PdtId varchar(4) primary key,PName varchar(20), Price double,Quantity int);
 
call Insertproduct(1001,"Pen",10.5,10);
call Insertproduct(1002,"Pencil",5.75,15); 
call Insertproduct(1003,"Book",25,5);
 select * from Product;