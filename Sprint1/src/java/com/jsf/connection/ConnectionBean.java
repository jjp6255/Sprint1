/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.connection;

import com.jsf.login.LoginBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephpriolo
 */
public class ConnectionBean {
    
    public static Connection databaseConnect() throws ClassNotFoundException {
 
         Connection conn = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone?serverTimezone=UTC", "root", null); 
            //System.out.println("Database Connected");
         } catch (SQLException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
         }
        return conn;
     }
}
