/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aimeejorgensen
 */
public class PurchaseSupplyViewTest {
    
    public PurchaseSupplyViewTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class PurchaseSupplyView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String[] inputs = null;
        PurchaseSupplyView instance = new PurchaseSupplyView();
        boolean expResult = false;
        boolean result = instance.doAction(inputs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of <error> method, of class PurchaseSupplyView.
     */
    @Test
    public void test<error>() {
        System.out.println("<error>");
        PurchaseSupplyView instance = new PurchaseSupplyView();
        instance.<error>();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
