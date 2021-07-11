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
import java.sql.Types;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author josephpriolo
 */
@ManagedBean(name="billBean") @SessionScoped
public class BillBean {
    
    private String userName;
    private String billType;
    private float amountDue;
    private String dueDate;
    private String accountName;
    private Integer remainingPayments;
    private float interestRate;
    private boolean isRecurring;
    
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
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
    
    public String getAccountName() {
        return accountName;
    }
 
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public Integer getRemainingPayments() {
        return remainingPayments;
    }
 
    public void setRemainingPayments(Integer remainingPayments) {
        this.remainingPayments = remainingPayments;
    }
    
    public float getInterestRate() {
        return interestRate;
    }
 
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    
    public boolean getIsRecurring() {
        return isRecurring;
    }
 
    public void setIsRecurring(boolean isRecurring) {
        this.isRecurring = isRecurring;
    }
    
    public String addNewBill() throws ClassNotFoundException {
       String navResult = "failedNewBill";
       
       String query = "INSERT INTO bill (userName, billType, billName, "
               + "billAmount, dueDate, lengthOfLoan, interestRate, isRecurring) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        
        Connection cn = ConnectionBean.databaseConnect();
        
        if (cn != null)
        {
            try {
                ps = cn.prepareStatement(query);
                
                //cannot be null
                ps.setString(1, userName);
              
                //cannot be null
                ps.setString(2, billType);
                      
                if (!accountName.isEmpty()) {
                    ps.setString(3, accountName);
                } else {
                    ps.setNull(3, Types.NULL);
                }
                
                //will not be null
                ps.setFloat(4, amountDue);
                
                if (!dueDate.isEmpty()) {
                    ps.setString(5, dueDate);
                } else {
                    ps.setNull(5, Types.NULL);
                }
               
                if (remainingPayments != null) {
                    ps.setInt(6, remainingPayments);
                } else {
                    ps.setNull(6, Types.NULL);
                }
                
                //will not be null
                ps.setFloat(7, interestRate);
                
                //will not be null
                ps.setBoolean(8, isRecurring);
                    
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
    
    public String determineType() {
               
        try {
            Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap(); 
            userName = params.get("currentUser");
        }
        catch (Exception e){
            userName = null;
        }        

        String type = "";
        
        if (billType.matches("Credit Card")) {
            type = "newCreditCard";
        } else if (billType.matches("Loan")) {
            type = "newLoan";
        } else if (billType.matches("Utility")) {
            type = "newUtility";
        } else if (billType.matches("Other")) {
            type = "newOther";
        } else {
            type = "failedNewBill";
        }
        
        return type;
    }
    
    
    public List<BillBean> getBillList()throws SQLException, ClassNotFoundException{

        List<BillBean> bills = new ArrayList<BillBean>();
        
        Connection cn = ConnectionBean.databaseConnect();

        if(cn == null) {
                throw new SQLException("Can't get database connection");
        }

        PreparedStatement ps = cn.prepareStatement("SELECT * from bill where userName = '" + this.userName + "'");

        try{
            //get data from database        
            ResultSet result = ps.executeQuery();
            while (result.next()){
                BillBean bill = new BillBean();
                bill.setBillType(result.getString("billName"));
                bill.setAmountDue(result.getFloat("billAmount"));
                bill.setDueDate((String)result.getString("dueDate"));
                bills.add(bill);
            }
        }
        catch(Exception e1){
            // Log the exception.
        }
        finally{
            try{
                ps.close();
                cn.close();
            }
            catch(Exception e2){
                // Log the exception.
            }
        }
        return bills; 
    }
}
