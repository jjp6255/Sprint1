/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.login;

/**
 *
 * @author josephpriolo
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf.connection.ConnectionBean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

 
@ManagedBean @SessionScoped
public class LoginBean {
 
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
 
    public String validateUserLogin() throws ClassNotFoundException {
        String navResult = "";
       
        String query = "SELECT userName, password FROM userCredential WHERE userName = ? and password = ?";
        PreparedStatement ps = null;
        
        Connection cn = ConnectionBean.databaseConnect();
        
        if (cn != null)
        {
            try {
                ps = cn.prepareStatement(query);
                ps.setString(1, userName);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {
                    navResult = "success";
                } else{
                    navResult = "failure";
                }
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else{
            navResult = "failure";
        }

        return navResult;
    }
}
