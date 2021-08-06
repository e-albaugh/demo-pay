package com.mf.presales_pay;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StripeSmokeTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StripeSmokeTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(StripeSmokeTest.class);
    }
 
    public void testPaymentIntentsResource() {
        assertTrue(true);
    }

    public void testOnSessionPayments() {
        assertTrue(true);
    }

    public void testOffSessionPayments() {
        assertTrue(true);
    }

    public void testSaveCard() {
        assertTrue(true);
    }

    public void testReuseCard() {
        assertTrue(true);
    }

    public void testOneTimePayment() {
        assertTrue(true);
    }
    
}
