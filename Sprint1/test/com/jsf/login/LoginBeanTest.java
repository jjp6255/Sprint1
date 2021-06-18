/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.login;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephpriolo
 */
public class LoginBeanTest {
    
    public LoginBeanTest() {
    }

    /**
     * Test of getUserName method, of class LoginBean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName test");
        System.out.println("-----------------------");
        LoginBean instance = new LoginBean();
        
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
     * Test of setUserName method, of class LoginBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName test");
        System.out.println("-----------------------");
        
        String userName = "john";
        LoginBean instance = new LoginBean();
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
     * Test of getPassword method, of class LoginBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword test");
        System.out.println("-----------------------");
        LoginBean instance = new LoginBean();
        
        System.out.println("testGetPassword success case");
        String expResult = "password1";
        instance.setPassword("password1");
        String result = instance.getPassword();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetPassword failure case");
        expResult = "password1";
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
     * Test of setPassword method, of class LoginBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword test");
        System.out.println("-----------------------");
        String password = "pass1!#";
        LoginBean instance = new LoginBean();
        
        System.out.println("testSetPassword success case");
        instance.setPassword(password);
        try{
            assertEquals("pass1!#", instance.getPassword());
            System.out.println("     " + instance.getPassword() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getPassword() + " failed");
            throw e;
        }
        
        System.out.println("testSetPassword failure case");
        instance.setPassword("qwerty");
        try{
            assertNotEquals("pass1!#", instance.getPassword());
            System.out.println("     " + instance.getPassword() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getPassword() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of validateUserLogin method, of class LoginBean.
     */
    @Test
    public void testValidateUserLogin() throws Exception {
        System.out.println("validateUserLogin test");
        System.out.println("--------------------------");
        LoginBean instance = new LoginBean();
        
        System.out.println("validateUserLogin success case");
        String expResult = "success";
        instance.setUserName("tester3");
        instance.setPassword("Password1");
        String result = instance.validateUserLogin();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " case passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " case failed");
            throw e;
        }
        
        
        System.out.println("validateUserLogin failure case");
        expResult = "failure";
        instance.setUserName("tester3");
        instance.setPassword("pass");
        result = instance.validateUserLogin();
        assertEquals(expResult, result);
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " case passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " case failed");
            throw e;
        }
        System.out.println();
    }
    
}
