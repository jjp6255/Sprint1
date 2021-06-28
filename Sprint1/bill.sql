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
       billType VARCHAR (50) not null,
       billAmount float not null,
       dueDate DATE not null
);


INSERT INTO bill (billType, billAmount, dueDate)
       VALUES   ('Credit Card', 120.50, '2021-07-01');