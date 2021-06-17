/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  josephpriolo
 * Created: Jun 6, 2021
 */

USE capstone;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS userCredential;


CREATE TABLE userCredential (
       userName VARCHAR (50) not null,
       password VARCHAR (50) not null,
       PRIMARY KEY (username)
);


INSERT INTO userCredential (userName, password)
       VALUES   ('tester1', 'Qwerty1!'),
                ('tester2', 'ASDfghjkl2'),
                ('tester3', 'Password1');