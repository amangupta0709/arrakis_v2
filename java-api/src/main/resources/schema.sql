DROP TABLE IF EXISTS User;

CREATE TABLE User (
    ID int NOT NULL PRIMARY KEY,
    Name  varchar(32) NOT NULL ,
    Email varchar(255),
    Role  varchar(32) NOT NULL
);

DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
    ID int NOT NULL PRIMARY KEY,
    BookName varchar(32) NOT NULL
);

DROP TABLE IF EXISTS BookUser;

CREATE TABLE BookUser (
    BookID int FOREIGN KEY REFERENCES Book(ID),
    UserID int FOREIGN KEY REFERENCES User(ID)
);

DROP TABLE IF EXISTS Security;

CREATE TABLE Security (
    ID int NOT NULL PRIMARY KEY,
    ISIN varchar(255),
    CUSIP  varchar(255),
    Issuer varchar(255) NOT NULL,
    MaturityDate date NOT NULL ,
    Coupon float NOT NULL ,
    Type varchar(32) NOT NULL,
    FaceValue int NOT NULL ,
    Status varchar(32) NOT NULL
);

DROP TABLE IF EXISTS CounterParty;

CREATE TABLE CounterParty (

   ID int NOT NULL PRIMARY KEY,
   Name varchar(255) NOT NULL
);

DROP TABLE IF EXISTS Trade;

CREATE TABLE Trade (
    ID int NOT NULL PRIMARY KEY,
    BookID int FOREIGN KEY REFERENCES Book(ID),
    CounterPartyID int  FOREIGN KEY REFERENCES CounterParty(ID),
    SecurityID int NOT NULL FOREIGN KEY REFERENCES Security(ID),
    Quantity int,
    Status varchar(32),
    Price float,
    Buy_Sell varchar(4) NOT NULL,
    TradeDate date NOT NULL ,
    SettelmentDate date NOT NULL ,
    CONSTRAINT TradeDate CHECK TradeDate > SettelmentDate
);
--DROP TABLE IF EXISTS owners;
--
--CREATE TABLE owners (
--    owner_id INT NOT NULL primary key,
--    name VARCHAR(250) NOT NULL
--);
--
--DROP TABLE IF EXISTS dogs;
--
--CREATE TABLE dogs (
--    dog_id INT NOT NULL,
--    name VARCHAR(250) NOT NULL,
--    age INT NOT NULL,
--    owner_id INT NOT NULL,
--    FOREIGN key
--        (owner_id) REFERENCES owners (owner_id)
--);
--
--create view dogs_n_owners as
--select d.dog_id as id, o.name as dog_owner, d.name as dog
--from dogs as d inner join owners as o on d.owner_id = o.owner_id;
