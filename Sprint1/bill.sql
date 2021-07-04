/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  josephpriolo
 * Created: Jun 12, 2021
 */

USE capstone;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS bill;


CREATE TABLE bill(
       billID integer not null AUTO_INCREMENT PRIMARY KEY,
       userName VARCHAR (50) not null,
       billType VARCHAR (50) not null,
       billName VARCHAR (75),
       billAmount float,
       dueDate DATE,
       lengthOfLoan INTEGER,
       interestRate float,
       isRecurring boolean,
       FOREIGN KEY (userName) REFERENCES userCredential(userName)
);


INSERT INTO bill (userName, billType, billAmount, dueDate)
       VALUES   ('tester3', 'Credit Card', 120.50, '2021-07-01');