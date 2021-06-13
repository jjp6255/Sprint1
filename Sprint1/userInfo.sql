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
DROP TABLE IF EXISTS userInfo;


CREATE TABLE userInfo(
       userName VARCHAR (50) not null,
       firstName VARCHAR (50) not null,
       lastName VARCHAR (50) not null,
       email VARCHAR (75) not null,
       zipcode VARCHAR (10),
       birthday DATE,
       income integer,
       PRIMARY KEY (username)
);


INSERT INTO userInfo (userName, firstName, lastName, email, zipcode, birthday, income)
       VALUES   ('tester1', 'John', 'Smith', 'js@gmail.com', '12345', '1980-05-01', 80000);