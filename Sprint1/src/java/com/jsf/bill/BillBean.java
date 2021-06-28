/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.bill;

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
public class BillBean {
    
    private String billType;
    private float amountDue;
    private String dueDate;
    
    public String getBillType() {
        return billType;
    }
 
    public void setBillType(String billType) {
        this.billType = billType;
    }
    
    public float getAmountDue() {
        return amountDue;
    }
 
    public void setAmountDue(float amountDue) {
        this.amountDue = amountDue;
    }
    
    public String getDueDate() {
        return dueDate;
    }
 
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    public String addNewBill() throws ClassNotFoundException {
       String navResult = "failedNewBill";
       
       String query = "INSERT INTO bill (billType, billAmount, dueDate) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        
        Connection cn = ConnectionBean.databaseConnect();
        
        if (cn != null)
        {
            try {
                ps = cn.prepareStatement(query);
                ps.setString(1, billType);
                ps.setFloat(2, amountDue);
                ps.setString(3, dueDate);
                int row = 0;
                row = ps.executeUpdate();
                if (row == 1)
                {
                    navResult = "successfulNewBill";
                    //System.out.println(row);
                }
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BillBean.class.getName()).log(Level.SEVERE, null, ex);
                navResult = "failedNewBill";
            }
            
        } else {
            navResult = "failedNewBill";
        }
       
       return navResult;
    }
    
}
