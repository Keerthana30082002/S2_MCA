CREATE DATABASE store;
USE store;

DROP TABLE Product;
CREATE TABLE Product(PdtId INT PRIMARY KEY, Pname VARCHAR(20), Price 
DOUBLE,Qtyinstock INT);

CREATE TABLE Sale(saleId INT PRIMARY KEY, Deliveryaddress VARCHAR(50));

CREATE TABLE Saleitem(saleId int,PdtId int,Qty int,foreign key(saleId) references Sale(saleId),foreign key(PdtId) references Product(PdtId),PRIMARY KEY(saleId,PdtId));
INSERT INTO Product (PdtId, Pname, Price, Qtyinstock ) VALUES (101,"pencil", 5, 10), 
(102,"pen", 3, 10);
INSERT INTO Sale(saleId,Deliveryaddress) VALUES(001,"home123"),(002,"home345");

create trigger updateAvailableQuantity
after insert on Saleitem
for each row
update Product set Qtyinstock=Product.Qtyinstock-new.Qty where PdtId=new.PdtId;

INSERT INTO Saleitem VALUES(001,102,8);
INSERT INTO Saleitem VALUES(002,101,3);
INSERT INTO Saleitem VALUES(002,102,1);