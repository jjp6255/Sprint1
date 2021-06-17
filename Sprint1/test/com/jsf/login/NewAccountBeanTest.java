/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.login;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephpriolo
 */
public class NewAccountBeanTest {
    
    public NewAccountBeanTest() {
    }

    /**
     * Test of getUserName method, of class NewAccountBean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName test");
        System.out.println("-----------------------");
        
        NewAccountBean instance = new NewAccountBean();
        
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
     * Test of setUserName method, of class NewAccountBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName test");
        System.out.println("-----------------------");
        
        String userName = "john";
        NewAccountBean instance = new NewAccountBean();
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
     * Test of getPassword method, of class NewAccountBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword test");
        System.out.println("-----------------------");
        
        NewAccountBean instance = new NewAccountBean();
        System.out.println("testGetPassword success case");
        String expResult = "Password1";
        instance.setPassword("Password1");
        String result = instance.getPassword();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetPassword failure case");
        expResult = "Password1";
        instance.setPassword("password");
        result = instance.getPassword();
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
     * Test of setPassword method, of class NewAccountBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword test");
        System.out.println("-----------------------");
        String password = "Password1!#";
        NewAccountBean instance = new NewAccountBean();
        instance.setPassword(password);
        System.out.println("testSetPassword success case");
        instance.setPassword(password);
        try{
            assertEquals("Password1!#", instance.getPassword());
            System.out.println("     " + instance.getPassword() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getPassword() + " failed");
            throw e;
        }
        
        System.out.println("testSetPassword failure case");
        instance.setPassword("qwerty");
        try{
            assertNotEquals("Password1!#", instance.getPassword());
            System.out.println("     " + instance.getPassword() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getPassword() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of addNewUser method, of class NewAccountBean.
     */
    @Test
    public void testAddNewUser() throws Exception {
        System.out.println("addNewUser test");
        System.out.println("-----------------------");
        NewAccountBean instance = new NewAccountBean();
               
        System.out.println("testAddNewUser success case");
        String expResult = "successfulAccount";
        instance.setUserName("testerX");
        instance.setPassword("Password1!#");
        String result = instance.addNewUser();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getUserName() + ", " + instance.getPassword() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getUserName() + ", " + instance.getPassword() + " failed");
            throw e;
        }
        
        System.out.println("testAddNewUser failure case");
        expResult = "failedAccount";
        instance.setUserName("testerX");
        instance.setPassword("password");
         result = instance.addNewUser();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getUserName() + ", " + instance.getPassword() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getUserName() + ", " + instance.getPassword() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }
    
}
