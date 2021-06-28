/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.bill;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephpriolo
 */
public class BillBeanTest {
    
    public BillBeanTest() {
    }

    /**
     * Test of getBillType method, of class BillBean.
     */
    @Test
    public void testGetBillType() {
        System.out.println("getBillType test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetBillType success case");
        String expResult = "Loan";
        instance.setBillType("Loan");
        String result = instance.getBillType();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetBillType failure case");
        expResult = "Utility";
        instance.setBillType("Utlity");
        result = instance.getBillType();
        try{
            assertNotEquals(expResult, result);
            System.out.println("     " + result + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + result + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of setBillType method, of class BillBean.
     */
    @Test
    public void testSetBillType() {
        System.out.println("setBillType test");
        System.out.println("-----------------------");
        
        String billType = "Credit Card";
        BillBean instance = new BillBean();
        instance.setBillType(billType);       
        System.out.println("testSetBillType success case");
        try{
            assertEquals(billType, instance.getBillType());
            System.out.println("     " + instance.getBillType() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getBillType() + " failed");
            throw e;
        }
        
        billType = "Credit Card";
        instance.setBillType(billType);
        System.out.println("testSetBillType failure case");
        try{
            assertNotEquals("CreditCard", instance.getBillType());
            System.out.println("     " + instance.getBillType() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getBillType() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getAmountDue method, of class BillBean.
     */
    @Test
    public void testGetAmountDue() {
        System.out.println("getAmountDue test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetAmountDue success case");
        float expResult = (float) 123.45;
        instance.setAmountDue((float) 123.45);
        float result = instance.getAmountDue();
        try{
            assertEquals(expResult, result, 0);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetAmountDue failure case");
        expResult = (float) 123.45;
        instance.setAmountDue((float) 12.45);
        result = instance.getAmountDue();
        try{
            assertNotEquals(expResult, result);
            System.out.println("     " + result + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + result + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of setAmountDue method, of class BillBean.
     */
    @Test
    public void testSetAmountDue() {
        System.out.println("setAmountDue test");
        System.out.println("-----------------------");
        
        float amountDue = (float) 543.21;
        BillBean instance = new BillBean();
        instance.setAmountDue(amountDue);       
        System.out.println("testSetAmountDue success case");
        try{
            assertEquals(amountDue, instance.getAmountDue(), 0);
            System.out.println("     " + instance.getAmountDue() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getAmountDue() + " failed");
            throw e;
        }
        
        amountDue = (float) 543.21;
        instance.setAmountDue(amountDue);
        System.out.println("testSetAmountDue failure case");
        try{
            assertNotEquals((float)54.21, instance.getAmountDue());
            System.out.println("     " + instance.getAmountDue() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getAmountDue() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getDueDate method, of class BillBean.
     */
    @Test
    public void testGetDueDate() {
        System.out.println("getDueDate test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetDueDate success case");
        String expResult = "2021-08-15";
        instance.setDueDate("2021-08-15");
        String result = instance.getDueDate();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetDueDate failure case");
        expResult = "2021-08-15";
        instance.setDueDate("2021-08-16");
        result = instance.getDueDate();
        try{
            assertNotEquals(expResult, result);
            System.out.println("     " + result + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + result + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of setDueDate method, of class BillBean.
     */
    @Test
    public void testSetDueDate() {
        System.out.println("setDueDate test");
        System.out.println("-----------------------");
        
        String dueDate = "2021-08-01";
        BillBean instance = new BillBean();
        instance.setDueDate(dueDate);       
        System.out.println("testSetDueDate success case");
        try{
            assertEquals(dueDate, instance.getDueDate());
            System.out.println("     " + instance.getDueDate() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getDueDate() + " failed");
            throw e;
        }
        
        dueDate = "2021-08-01";
        instance.setBillType(dueDate);
        System.out.println("testSetDueDate failure case");
        try{
            assertNotEquals("2021-08-02", instance.getBillType());
            System.out.println("     " + instance.getBillType() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getBillType() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of addNewBill method, of class BillBean.
     */
    @Test
    public void testAddNewBill() throws Exception {
        System.out.println("addNewBill test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testAddNewBill failure case");
        String expResult = "failedNewBill";
        
        instance.setAmountDue((float)78.12);
        instance.setDueDate("2021-07-15");
        String result = instance.addNewBill();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getBillType() + ", " + instance.getAmountDue() + ", " + instance.getDueDate() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getBillType() + ", " + instance.getAmountDue() + ", " + instance.getDueDate() + " incorrectly passed");
            throw e;
        }
        
        System.out.println("testAddNewBill success case");
        expResult = "successfulNewBill";
        instance.setBillType("Loan");
        instance.setAmountDue((float)78.12);
        instance.setDueDate("2021-07-15");
        result = instance.addNewBill();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getBillType() + ", " + instance.getAmountDue() + ", " + instance.getDueDate() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getBillType() + ", " + instance.getAmountDue() + ", " + instance.getDueDate() + " failed");
            throw e;
        }
        
        
        
        System.out.println();
    }
    
}
