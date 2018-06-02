/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cole
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    /**
     * Test of illnessHeal method, of class ActorControl.
     */
    @Test
    public void testIllnessHeal() {
        System.out.println("illnessHeal");
        double foodAmount = 0.0;
        double mortalityRate = 0.0;
        double medicineAmount = 0.0;
        double expResult = 0.0;
        double result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
