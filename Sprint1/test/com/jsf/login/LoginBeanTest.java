/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.login;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author josephpriolo
 */
public class LoginBeanTest {
    
    public LoginBeanTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getUserName method, of class LoginBean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class LoginBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        LoginBean instance = new LoginBean();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginBean instance = new LoginBean();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateUserLogin method, of class LoginBean.
     */
    @Test
    public void testValidateUserLogin() {
        System.out.println("validateUserLogin");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.validateUserLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
