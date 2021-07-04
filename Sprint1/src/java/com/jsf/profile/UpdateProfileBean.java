/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.profile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf.connection.ConnectionBean;

import com.jsf.login.LoginBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author josephpriolo
 */
@ManagedBean(name="updateProfileBean") @SessionScoped
public class UpdateProfileBean {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;
    private String dateOfBirth;
    private Integer income;
    
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getZipCode() {
        return zipCode;
    }
 
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public Integer getIncome() {
        return income;
    }
 
    public void setIncome(Integer income) {
        this.income = income;
    }
    
    public String updateProfileInfo() throws ClassNotFoundException {
        String navResult = "";
        
        try {
            Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
            userName = params.get("currentUser");
        } catch (Exception e) {
            userName = null;
        }
        
        
        String query = "INSERT INTO userInfo (userName, firstName, lastName, "
                + "email, zipcode, birthday, income) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        
        Connection cn = ConnectionBean.databaseConnect();
        
        if (cn != null)
        {
            try {
                ps = cn.prepareStatement(query);
                ps.setString(1, userName);
                ps.setString(2, firstName);
                ps.setString(3, lastName);
                ps.setString(4, email);
                ps.setString(5, zipCode);
                ps.setString(6, dateOfBirth);
                ps.setInt(7, income);
                int row = 0;
                row = ps.executeUpdate();
                if (row == 1)
                {
                    navResult = "successfulProfileUpdate";
                    //System.out.println(row);
                }
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
                navResult = "failedProfileUpdate";
            }
            
        } else {
            navResult = "failedProfileUpdate";
        }
        
        return navResult;
    }
}
