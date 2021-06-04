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
        LoginBean instance = new LoginBean();
        String expResult = "user";
        instance.setUserName("user");
        String result = instance.getUserName();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setUserName method, of class LoginBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName test");
        String userName = "john";
        LoginBean instance = new LoginBean();
        instance.setUserName(userName);
        assertEquals(userName, instance.getUserName());
    }

    /**
     * Test of getPassword method, of class LoginBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword test");
        LoginBean instance = new LoginBean();
        String expResult = "password1";
        instance.setPassword("password1");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class LoginBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword test");
        String password = "pass1!#";
        LoginBean instance = new LoginBean();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of validateUserLogin method, of class LoginBean.
     */
    @Test
    public void testValidateUserLogin() {
        System.out.println("validateUserLogin test");
        LoginBean instance = new LoginBean();
        instance.setUserName("admin");
        instance.setPassword("password");
        String expResult = "success";
        String result = instance.validateUserLogin();
        assertEquals(expResult, result);
        
        instance.setUserName("admin");
        instance.setPassword("passwrd");
        expResult = "failure";
        result = instance.validateUserLogin();
        assertEquals(expResult, result);
        
        instance.setUserName("adn");
        instance.setPassword("password");
        expResult = "failure";
        result = instance.validateUserLogin();
        assertEquals(expResult, result);
    }
    
}
