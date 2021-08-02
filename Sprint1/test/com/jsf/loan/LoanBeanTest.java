/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.loan;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephpriolo
 */
public class LoanBeanTest {
    
    public LoanBeanTest() {
    }

    /**
     * Test of getLoanAmount method, of class LoanBean.
     */
    @Test
    public void testGetLoanAmount() {
        System.out.println("getLoanAmount test");
        System.out.println("-----------------------");
        LoanBean instance = new LoanBean();
        
        System.out.println("testGetLoanAmount success case");
        Double expResult = (Double) 10000.0;
        instance.setLoanAmount((Double) 10000.0);
        Double result = instance.getLoanAmount();
        try{
            assertEquals(expResult, result, 0);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetLoanAmount failure case");
        expResult = (Double) 10000.0;
        instance.setLoanAmount((Double) 1000.0);
        result = instance.getLoanAmount();
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
     * Test of setLoanAmount method, of class LoanBean.
     */
    @Test
    public void testSetLoanAmount() {
        System.out.println("setLoanAmount test");
        System.out.println("-----------------------");
        
        Double loanAmount = (Double) 5000.0;
        LoanBean instance = new LoanBean();
        instance.setLoanAmount(loanAmount);       
        System.out.println("testSetLoanAmount success case");
        try{
            assertEquals(loanAmount, instance.getLoanAmount(), 0);
            System.out.println("     " + instance.getLoanAmount() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getLoanAmount() + " failed");
            throw e;
        }
        
        loanAmount = (Double) 5200.0;
        instance.setLoanAmount(loanAmount);
        System.out.println("testSetLoanAmount failure case");
        try{
            assertNotEquals((Double)54.21, instance.getLoanAmount());
            System.out.println("     " + instance.getLoanAmount() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getLoanAmount() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getLoanLength method, of class LoanBean.
     */
    @Test
    public void testGetLoanLength() {
        System.out.println("getLoanLength test");
        System.out.println("-----------------------");
        LoanBean instance = new LoanBean();
        
        System.out.println("testGetLoanLength success case");
        Integer expResult = 20;
        instance.setLoanLength(20);
        Integer result = instance.getLoanLength();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetLoanLength failure case");
        expResult = 20;
        instance.setLoanLength(15);
        result = instance.getLoanLength();
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
     * Test of setLoanLength method, of class LoanBean.
     */
    @Test
    public void testSetLoanLength() {
        System.out.println("setLoanLength test");
        System.out.println("-----------------------");
        
        Integer loan = 10;
        LoanBean instance = new LoanBean();
        instance.setLoanLength(loan);       
        System.out.println("testSetLoanLength success case");
        try{
            assertEquals(loan, instance.getLoanLength());
            System.out.println("     " + instance.getLoanLength() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getLoanLength() + " failed");
            throw e;
        }
        
        loan = 20;
        instance.setLoanLength(loan);
        System.out.println("testSetLoanLength failure case");
        try{
            assertNotEquals("12", instance.getLoanLength());
            System.out.println("     " + instance.getLoanLength() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getLoanLength() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getInterestRate method, of class LoanBean.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate test");
        System.out.println("-----------------------");
        LoanBean instance = new LoanBean();
        
        System.out.println("testGetInterestRate success case");
        Double expResult = (Double) 3.45;
        instance.setInterestRate((Double) 3.45);
        Double result = instance.getInterestRate();
        try{
            assertEquals(expResult, result, 0);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetInterestRate failure case");
        expResult = (Double) 3.45;
        instance.setInterestRate((Double) 2.45);
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
     * Test of setInterestRate method, of class LoanBean.
     */
    @Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate test");
        System.out.println("-----------------------");
        
        Double intRate = (Double) 3.21;
        LoanBean instance = new LoanBean();
        instance.setInterestRate(intRate);       
        System.out.println("testSetInterestRate success case");
        try{
            assertEquals(intRate, instance.getInterestRate(), 0);
            System.out.println("     " + instance.getInterestRate() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getInterestRate() + " failed");
            throw e;
        }
        
        intRate = (Double) 3.21;
        instance.setInterestRate(intRate);
        System.out.println("testSetInterestRate failure case");
        try{
            assertNotEquals((Double)4.21, instance.getInterestRate());
            System.out.println("     " + instance.getInterestRate() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getInterestRate() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getMonthlyPayment method, of class LoanBean.
     */
    @Test
    public void testGetMonthlyPayment() {
        System.out.println("getMonthlyPayment test");
        System.out.println("-----------------------");
        LoanBean instance = new LoanBean();
        
        System.out.println("testGetMonthlyPayment success case");
        String expResult = "123";
        instance.setMonthlyPayment("123");
        String result = instance.getMonthlyPayment();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetMonthlyPayment failure case");
        expResult = "125";
        instance.setMonthlyPayment("152");
        result = instance.getMonthlyPayment();
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
     * Test of setMonthlyPayment method, of class LoanBean.
     */
    @Test
    public void testSetMonthlyPayment() {
        System.out.println("setMonthlyPayment test");
        System.out.println("-----------------------");
        
        String monthly = "500";
        LoanBean instance = new LoanBean();
        instance.setMonthlyPayment(monthly);       
        System.out.println("testSetMonthlyPayment success case");
        try{
            assertEquals(monthly, instance.getMonthlyPayment());
            System.out.println("     " + instance.getMonthlyPayment() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getMonthlyPayment() + " failed");
            throw e;
        }
        
        monthly = "300";
        instance.setMonthlyPayment(monthly);
        System.out.println("testSetMonthlyPayment failure case");
        try{
            assertNotEquals("30", instance.getMonthlyPayment());
            System.out.println("     " + instance.getMonthlyPayment() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getMonthlyPayment() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getTotalInterest method, of class LoanBean.
     */
    @Test
    public void testGetTotalInterest() {
        System.out.println("getTotalInterest test");
        System.out.println("-----------------------");
        LoanBean instance = new LoanBean();
        
        System.out.println("testGetTotalInterest success case");
        String expResult = "Loan";
        instance.setTotalInterest("Loan");
        String result = instance.getTotalInterest();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetTotalInterest failure case");
        expResult = "1200";
        instance.setTotalInterest("120");
        result = instance.getTotalInterest();
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
     * Test of setTotalInterest method, of class LoanBean.
     */
    @Test
    public void testSetTotalInterest() {
        System.out.println("setTotalInterest test");
        System.out.println("-----------------------");
        
        String totalInt = "200";
        LoanBean instance = new LoanBean();
        instance.setTotalInterest(totalInt);       
        System.out.println("testSetTotalInterest success case");
        try{
            assertEquals(totalInt, instance.getTotalInterest());
            System.out.println("     " + instance.getTotalInterest() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getTotalInterest() + " failed");
            throw e;
        }
        
        totalInt = "250";
        instance.setTotalInterest(totalInt);
        System.out.println("testSetTotalInterest failure case");
        try{
            assertNotEquals("25", instance.getTotalInterest());
            System.out.println("     " + instance.getTotalInterest() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getTotalInterest() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of calculatePayment method, of class LoanBean.
     */
    @Test
    public void testCalculatePayment() throws Exception {
        System.out.println("calculatePayment test");
        System.out.println("-----------------------");
        
        LoanBean instance = new LoanBean();
        instance.setLoanAmount(5000.0);
        instance.setInterestRate(4.5);
        instance.setLoanLength(60);
        instance.calculatePayment();
        
        System.out.println("testCalculatePayment success case");
        try{
            assertEquals("93.22", instance.getMonthlyPayment());
            System.out.println("     " + instance.getMonthlyPayment() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getMonthlyPayment() + " failed");
            throw e;
        }
        
        System.out.println("testCalculatePayment failure case");
        instance.setLoanAmount(500.0);
        instance.setInterestRate((Double)4.5);
        instance.setLoanLength(60);
        instance.calculatePayment();
        try{
            assertNotEquals("25", instance.getMonthlyPayment());
            System.out.println("     " + instance.getMonthlyPayment() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getMonthlyPayment() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }
    
}
