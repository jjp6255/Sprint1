/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.connection;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephpriolo
 */
public class ConnectionBeanTest {
    
    public ConnectionBeanTest() {
    }

    /**
     * Test of databaseConnect method, of class ConnectionBean.
     */
    @Test
    public void testDatabaseConnect() throws Exception {
        System.out.println("databaseConnect test");
        System.out.println("-----------------------");
        
        Connection expResult = null;
        Connection result = ConnectionBean.databaseConnect();
       
        System.out.println("testDatabaseConnect success case");
        try{
            assertNotEquals(expResult, result);
            System.out.println("     " + result + " passed");
        } catch (AssertionError e) {
            System.out.println("     " + result + " failed");
            throw e;
        }
        
        
        System.out.println();
    }
    
}
