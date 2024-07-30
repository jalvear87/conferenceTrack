/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.conference.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Alvear
 */
public class TopicsTest {
    
    public TopicsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of builder method, of class Topics.
     */
    @Test
    public void testBuilder() {
        System.out.println("builder");
        Topics.TopicsBuilder expResult = null;
        Topics.TopicsBuilder result = Topics.builder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Topics.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Topics instance = new Topics();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Topics.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Topics instance = new Topics();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Topics.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Topics instance = new Topics();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Topics.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        Topics instance = new Topics();
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Topics.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Topics instance = new Topics();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Topics.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Topics instance = new Topics();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Topics.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Topics instance = new Topics();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Topics.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Topics instance = new Topics();
        instance.setTitle("Java 17");
        String expResult = "Java 17";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
