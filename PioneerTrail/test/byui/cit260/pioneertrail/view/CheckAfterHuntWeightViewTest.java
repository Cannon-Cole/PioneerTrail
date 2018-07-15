/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pioneertrail.PioneerTrail;

/**
 *
 * @author aimeejorgensen
 */
public class CheckAfterHuntWeightViewTest {
    
    public CheckAfterHuntWeightViewTest() {
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
     * Test of doAction method, of class CheckAfterHuntWeightView.
     */
    @Test
    public void testDoAction() {
        PrintWriter output = PioneerTrail.getOutFile();
        output.println("doAction");
        String[] inputs = null;
        CheckAfterHuntWeightView instance = null;
        boolean expResult = false;
        boolean result = instance.doAction(inputs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
