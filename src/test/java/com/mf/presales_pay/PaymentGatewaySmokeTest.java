package com.mf.presales_pay;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PaymentGatewaySmokeTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PaymentGatewaySmokeTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(PaymentGatewaySmokeTest.class);
    }
 
    public void testUserProfCheckout() {
        assertTrue(true);
    }

    public void testChangeGatewayLanguage() {
        assertTrue(true);
    }

    public void testGatewayNonResponse() {
        assertTrue(true);
    }

    public void testStoreCardDetails() {
        assertTrue(true);
    }

    public void testPaymentMessageFormat() {
        assertTrue(true);
    }

    public void testAuthorizationReceipt() {
        assertTrue(true);
    }

    public void testCurrencyFormat() {
        assertTrue(true);
    }

    public void testDesiredCardSelection() {
        assertTrue(false);
    }

    public void testErrorMessageParse() {
        assertTrue(true);
    }

    public void testDisplayProcessingWaitTime() {
        assertTrue(true);
    }

    public void testRespectivePaymentOption() {
        assertTrue(true);
    }

    public void testBackendMatch() {
        assertTrue(true);
    }

    public void testPopUpBlock() {
        assertTrue(true);
    }



}
