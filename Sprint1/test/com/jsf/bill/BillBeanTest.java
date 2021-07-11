/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.bill;

import java.util.List;
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
        instance.setAccountName("test");
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
        instance.setUserName("tester3");
        instance.setAmountDue((float)78.12);
        instance.setAccountName("test");
        instance.setInterestRate((float)2.5);
        instance.setRemainingPayments(25);
        instance.setDueDate("2021-07-15");
        result = instance.addNewBill();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getBillType() + ", " + instance.getAmountDue() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getBillType() + ", " + instance.getAmountDue() + " failed");
            throw e;
        }
        
        
        
        System.out.println();
    }

    /**
     * Test of getAccountName method, of class BillBean.
     */
    @Test
    public void testGetAccountName() {
        System.out.println("getAccountName test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetAccountName success case");
        String expResult = "Chase";
        instance.setAccountName("Chase");
        String result = instance.getAccountName();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetAccountName failure case");
        expResult = "Chase";
        instance.setAccountName("CapitalOne");
        result = instance.getAccountName();
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
     * Test of setAccountName method, of class BillBean.
     */
    @Test
    public void testSetAccountName() {
        System.out.println("setAccountName test");
        System.out.println("-----------------------");
        
        String billName = "Chase";
        BillBean instance = new BillBean();
        instance.setAccountName(billName);       
        System.out.println("testSetAccountName success case");
        try{
            assertEquals(billName, instance.getAccountName());
            System.out.println("     " + instance.getAccountName() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getAccountName() + " failed");
            throw e;
        }
        
        billName = "CapitalOne";
        instance.setAccountName(billName);
        System.out.println("testSetAccountName failure case");
        try{
            assertNotEquals("Capital One", instance.getAccountName());
            System.out.println("     " + instance.getAccountName() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getAccountName() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getRemainingPayments method, of class BillBean.
     */
    @Test
    public void testGetRemainingPayments() {
        System.out.println("getRemainingPayments test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetRemainingPayments success case");
        Integer expResult = 20;
        instance.setRemainingPayments(20);
        Integer result = instance.getRemainingPayments();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetRemainingPayments failure case");
        expResult = 20;
        instance.setRemainingPayments(15);
        result = instance.getRemainingPayments();
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
     * Test of setRemainingPayments method, of class BillBean.
     */
    @Test
    public void testSetRemainingPayments() {
        System.out.println("setRemainingPayments test");
        System.out.println("-----------------------");
        
        Integer payments = 10;
        BillBean instance = new BillBean();
        instance.setRemainingPayments(payments);       
        System.out.println("testSetRemainingPayments success case");
        try{
            assertEquals(payments, instance.getRemainingPayments());
            System.out.println("     " + instance.getRemainingPayments() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getRemainingPayments() + " failed");
            throw e;
        }
        
        payments = 20;
        instance.setRemainingPayments(payments);
        System.out.println("testSetRemainingPayments failure case");
        try{
            assertNotEquals("12", instance.getRemainingPayments());
            System.out.println("     " + instance.getRemainingPayments() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getRemainingPayments() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getInterestRate method, of class BillBean.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetInterestRate success case");
        float expResult = (float) 3.45;
        instance.setInterestRate((float) 3.45);
        float result = instance.getInterestRate();
        try{
            assertEquals(expResult, result, 0);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetInterestRate failure case");
        expResult = (float) 3.45;
        instance.setInterestRate((float) 2.45);
        result = instance.getInterestRate();
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
     * Test of setInterestRate method, of class BillBean.
     */
    @Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate test");
        System.out.println("-----------------------");
        
        float interest = (float) 3.21;
        BillBean instance = new BillBean();
        instance.setInterestRate(interest);       
        System.out.println("testSetInterestRate success case");
        try{
            assertEquals(interest, instance.getInterestRate(), 0);
            System.out.println("     " + instance.getInterestRate() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getInterestRate() + " failed");
            throw e;
        }
        
        interest = (float) 3.21;
        instance.setInterestRate(interest);
        System.out.println("testSetInterestRate failure case");
        try{
            assertNotEquals((float)4.21, instance.getInterestRate());
            System.out.println("     " + instance.getInterestRate() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getInterestRate() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getIsRecurring method, of class BillBean.
     */
    @Test
    public void testGetIsRecurring() {
        System.out.println("getIsRecurring test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetIsRecurring success case");
        boolean expResult = true;
        instance.setIsRecurring(true);
        boolean result = instance.getIsRecurring();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetIsRecurring failure case");
        expResult = true;
        instance.setIsRecurring(false);
        result = instance.getIsRecurring();
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
     * Test of setIsRecurring method, of class BillBean.
     */
    @Test
    public void testSetIsRecurring() {
        System.out.println("setIsRecurring test");
        System.out.println("-----------------------");
        
        boolean isRecurring = true;
        BillBean instance = new BillBean();
        instance.setIsRecurring(isRecurring);       
        System.out.println("testSetIsRecurring success case");
        try{
            assertEquals(isRecurring, instance.getIsRecurring());
            System.out.println("     " + instance.getIsRecurring() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getIsRecurring() + " failed");
            throw e;
        }
        
        isRecurring = true;
        instance.setIsRecurring(isRecurring);
        System.out.println("testSetIsRecurring failure case");
        try{
            assertNotEquals(false, instance.getIsRecurring());
            System.out.println("     " + instance.getIsRecurring() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getIsRecurring() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of determineType method, of class BillBean.
     */
    @Test
    public void testDetermineType() {
        System.out.println("determineType test");
        System.out.println("-----------------------");
        
        System.out.println("testDetermineType success case");
        BillBean instance = new BillBean();
        instance.setBillType("Credit Card");
        String expResult = "newCreditCard";
        String result = instance.determineType();
        
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        instance.setBillType("Loan");
        expResult = "newLoan";
        result = instance.determineType();
        
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        instance.setBillType("Utility");
        expResult = "newUtility";
        result = instance.determineType();
        
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        instance.setBillType("Other");
        expResult = "newOther";
        result = instance.determineType();
        
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testDetermineType failure case");
        
        instance.setBillType("Mortgage");
        expResult = "failedNewBill";
        result = instance.determineType();
        
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " (Mortgage) failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + result + " (Mortgage) incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getUserName method, of class BillBean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName test");
        System.out.println("-----------------------");
        BillBean instance = new BillBean();
        
        System.out.println("testGetUserName success case");
        String expResult = "user";
        instance.setUserName("user");
        String result = instance.getUserName();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetUserName failure case");
        expResult = "user";
        instance.setUserName("uer");
        result = instance.getUserName();
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
     * Test of setUserName method, of class BillBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName test");
        System.out.println("-----------------------");
        
        String userName = "john";
        BillBean instance = new BillBean();
        instance.setUserName(userName);       
        System.out.println("testSetUserName success case");
        try{
            assertEquals(userName, instance.getUserName());
            System.out.println("     " + instance.getUserName() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getUserName() + " failed");
            throw e;
        }
        
        userName = "john";
        instance.setUserName(userName);
        System.out.println("testSetUserName failure case");
        try{
            assertNotEquals("jn", instance.getUserName());
            System.out.println("     " + instance.getUserName() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getUserName() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getBillList method, of class BillBean.
     */
    @Test
    public void testGetBillList() throws Exception {
        System.out.println("getBillList test");
        System.out.println("-----------------------");
        
        BillBean instance = new BillBean();
        List<BillBean> expResult = null;
        System.out.println("testGetBillList success case");       
        instance.setUserName("tester6");
        List<BillBean> result = instance.getBillList();
        
        try{
            assertNotEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetBillList failure case");
        instance.setUserName("test");
        result = instance.getBillList();
        try{
            assertNotEquals(expResult, result);
            System.out.println("     " + result + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + result + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }
    
}
