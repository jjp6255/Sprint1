/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.profile;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephpriolo
 */
public class UpdateProfileBeanTest {
    
    public UpdateProfileBeanTest() {
    }

    /**
     * Test of getUserName method, of class UpdateProfileBean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
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
     * Test of setUserName method, of class UpdateProfileBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName test");
        System.out.println("-----------------------");
        
        String userName = "john";
        UpdateProfileBean instance = new UpdateProfileBean();
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
     * Test of getFirstName method, of class UpdateProfileBean.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testGetFirstName success case");
        String expResult = "user";
        instance.setFirstName("user");
        String result = instance.getFirstName();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetFirstName failure case");
        expResult = "user";
        instance.setFirstName("uer");
        result = instance.getFirstName();
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
     * Test of setFirstName method, of class UpdateProfileBean.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName test");
        System.out.println("-----------------------");
        
        String firstName = "john";
        UpdateProfileBean instance = new UpdateProfileBean();
        instance.setFirstName(firstName);
        System.out.println("testSetFirstName success case");
        try{
            assertEquals(firstName, instance.getFirstName());
            System.out.println("     " + instance.getFirstName() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getFirstName() + " failed");
            throw e;
        }
        
        firstName = "john";
        instance.setFirstName(firstName);
        System.out.println("testSetFirstName failure case");
        try{
            assertNotEquals("jn", instance.getFirstName());
            System.out.println("     " + instance.getFirstName() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getFirstName() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getLastName method, of class UpdateProfileBean.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testGetLastName success case");
        String expResult = "smith";
        instance.setLastName("smith");
        String result = instance.getLastName();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetLastName failure case");
        expResult = "smith";
        instance.setLastName("smth");
        result = instance.getLastName();
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
     * Test of setLastName method, of class UpdateProfileBean.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName test");
        System.out.println("-----------------------");
        
        String lastName = "smith";
        UpdateProfileBean instance = new UpdateProfileBean();
        instance.setLastName(lastName);
        System.out.println("testSetLastName success case");
        try{
            assertEquals(lastName, instance.getLastName());
            System.out.println("     " + instance.getLastName() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getLastName() + " failed");
            throw e;
        }
        
        lastName = "smith";
        instance.setLastName(lastName);
        System.out.println("testSetLastName failure case");
        try{
            assertNotEquals("smth", instance.getLastName());
            System.out.println("     " + instance.getLastName() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getLastName() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getEmail method, of class UpdateProfileBean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testGetEmail success case");
        String expResult = "user@gmail.com";
        instance.setEmail("user@gmail.com");
        String result = instance.getEmail();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetEmail failure case");
        expResult = "user@gmail.com";
        instance.setEmail("uer@gmail.com");
        result = instance.getEmail();
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
     * Test of setEmail method, of class UpdateProfileBean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail test");
        System.out.println("-----------------------");
        
        String email = "user@gmail.com";
        UpdateProfileBean instance = new UpdateProfileBean();
        instance.setEmail(email);
        System.out.println("testSetEmail success case");
        try{
            assertEquals(email, instance.getEmail());
            System.out.println("     " + instance.getEmail() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getEmail() + " failed");
            throw e;
        }
        
        email = "user@gmail.com";
        instance.setEmail(email);
        System.out.println("testSetEmail failure case");
        try{
            assertNotEquals("usr@gmail.com", instance.getEmail());
            System.out.println("     " + instance.getEmail() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getEmail() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getZipCode method, of class UpdateProfileBean.
     */
    @Test
    public void testGetZipCode() {
        System.out.println("getZipCode test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testGetZipCode success case");
        String expResult = "12345-1234";
        instance.setZipCode("12345-1234");
        String result = instance.getZipCode();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetZipCode failure case");
        expResult = "12345-1234";
        instance.setZipCode("123-12");
        result = instance.getZipCode();
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
     * Test of setZipCode method, of class UpdateProfileBean.
     */
    @Test
    public void testSetZipCode() {
        System.out.println("setZipCode test");
        System.out.println("-----------------------");
        
        String zipCode = "12345-1234";
        UpdateProfileBean instance = new UpdateProfileBean();
        instance.setZipCode(zipCode);
        System.out.println("testSetZipCode success case");
        try{
            assertEquals(zipCode, instance.getZipCode());
            System.out.println("     " + instance.getZipCode() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getZipCode() + " failed");
            throw e;
        }
        
        zipCode = "12345-1234";
        instance.setZipCode(zipCode);
        System.out.println("testSetZipCode failure case");
        try{
            assertNotEquals("123-12", instance.getZipCode());
            System.out.println("     " + instance.getZipCode() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getZipCode() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getDateOfBirth method, of class UpdateProfileBean.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testGetDateOfBirth success case");
        String expResult = "1990-01-01";
        instance.setDateOfBirth("1990-01-01");
        String result = instance.getDateOfBirth();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetDateOfBirth failure case");
        expResult = "1990-01-01";
        instance.setDateOfBirth("1992-01-01");
        result = instance.getDateOfBirth();
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
     * Test of setDateOfBirth method, of class UpdateProfileBean.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth test");
        System.out.println("-----------------------");
        
        String dateOfBirth = "1990-01-01";
        UpdateProfileBean instance = new UpdateProfileBean();
        instance.setDateOfBirth(dateOfBirth);
        System.out.println("testSetDateOfBirth success case");
        try{
            assertEquals(dateOfBirth, instance.getDateOfBirth());
            System.out.println("     " + instance.getDateOfBirth() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getDateOfBirth() + " failed");
            throw e;
        }
        
        dateOfBirth = "1990-01-01";
        instance.setDateOfBirth(dateOfBirth);
        System.out.println("testSetDateOfBirth failure case");
        try{
            assertNotEquals("1990-02-01", instance.getDateOfBirth());
            System.out.println("     " + instance.getDateOfBirth() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getDateOfBirth() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of getIncome method, of class UpdateProfileBean.
     */
    @Test
    public void testGetIncome() {
        System.out.println("getIncome test");
        System.out.println("-----------------------");
        
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testGetIncome success case");
        Integer expResult = 45000;
        instance.setIncome(45000);
        Integer result = instance.getIncome();
        try{
            assertEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        System.out.println("testGetIncome failure case");
        expResult = 62500;
        instance.setIncome(65200);
        result = instance.getIncome();
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
     * Test of setIncome method, of class UpdateProfileBean.
     */
    @Test
    public void testSetIncome() {
        System.out.println("setIncome test");
        System.out.println("-----------------------");
        
        Integer income = 51000;
        UpdateProfileBean instance = new UpdateProfileBean();
        instance.setIncome(income);
        System.out.println("testSetIncome success case");
        try{
            assertEquals(income, instance.getIncome());
            System.out.println("     " + instance.getIncome() + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getIncome() + " failed");
            throw e;
        }
        
        income = 78000;
        instance.setIncome(income);
        System.out.println("testSetIncome failure case");
        try{
            assertNotEquals("780", instance.getIncome());
            System.out.println("     " + instance.getIncome() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getIncome() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
    }

    /**
     * Test of updateProfileInfo method, of class UpdateProfileBean.
     */
    @Test
    public void testUpdateProfileInfo() throws Exception {
        System.out.println("updateProfileInfo test");
        System.out.println("-----------------------");
        UpdateProfileBean instance = new UpdateProfileBean();
        
        System.out.println("testUpdateProfileInfo success case");
        String expResult = "successfulProfileUpdate";
        instance.setUserName("testerX");
        instance.setFirstName("Adam");
        instance.setLastName("Brown");
        instance.setEmail("ab@user.com");
        instance.setZipCode("54321-4321");
        instance.setDateOfBirth("1980-05-03");
        instance.setIncome(56000);
        String result = instance.updateProfileInfo();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getUserName() + " update passed");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getUserName() + " update failed");
            throw e;
        }
        
        System.out.println("testUpdateProfileInfo failure case");
        expResult = "failedProfileUpdate";
        instance.setUserName("tester_");
        instance.setFirstName("Adam");
        instance.setLastName("Brown");
        instance.setEmail("ab@user.com");
        instance.setZipCode("54321-432134");
        instance.setDateOfBirth("03-01-1999");
        instance.setIncome(56000);
        result = instance.updateProfileInfo();      
        try{
            assertEquals(expResult, result);
            System.out.println("     " + instance.getUserName() + " failed as expected");
        } catch (AssertionError e) {
            System.out.println("     " + instance.getUserName() + " incorrectly passed");
            throw e;
        }
        
        System.out.println();
        
    }
    
}
