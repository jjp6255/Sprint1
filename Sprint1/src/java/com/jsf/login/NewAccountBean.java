/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf.connection.ConnectionBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephpriolo
 */
@ManagedBean @SessionScoped
public class NewAccountBean {
    
    private String userName;
    private String password;
    
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String addNewUser() throws ClassNotFoundException {
        String navResult = "";
        
        String query = "INSERT INTO userCredential (userName, password) VALUES (?, ?)";
        PreparedStatement ps = null;
        
        Connection cn = ConnectionBean.databaseConnect();
        
        if (cn != null)
        {
            try {
                ps = cn.prepareStatement(query);
                ps.setString(1, userName);
                ps.setString(2, password);
                int row = 0;
                row = ps.executeUpdate();
                if (row == 1)
                {
                    navResult = "successfulAccount";
                    //System.out.println(row);
                }
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
                navResult = "failedAccount";
            }
            
        } else {
            navResult = "failedAccount";
        }
        
        return navResult;
     }
}
