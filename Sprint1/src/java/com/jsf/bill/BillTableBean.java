/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.bill;

import com.jsf.connection.ConnectionBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author josephpriolo
 */
@ManagedBean(name="billTableBean") @SessionScoped
public class BillTableBean {
    public String getBillList()throws SQLException, ClassNotFoundException{

        List<BillBean> bills = new ArrayList<BillBean>();

        
        Connection cn = ConnectionBean.databaseConnect();

        if(cn == null) {
                throw new SQLException("Can't get database connection");
        }

        PreparedStatement ps = cn.prepareStatement("SELECT billName from bill");

        try{
            //get data from database        
            ResultSet result = ps.executeQuery();
            while (result.next()){
                BillBean bill = new BillBean();
                bill.setBillType(result.getString("billName"));
        System.out.println(bill.getBillType());
                //billRow.setMaxActiveUsers(result.getString("MaxActiveUsers"));
                bills.add(bill);
            }
        }
        catch(Exception e1){
            System.out.println("Error 1");
        }
        finally{
            try{
                ps.close();
                cn.close();
            }
            catch(Exception e2){
                System.out.println("Error 2");
            }
        }
        return "table"; 
    }
}
