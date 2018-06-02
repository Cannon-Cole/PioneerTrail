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
        System.out.println("illnessHealValid");
        double foodAmount = 100.0;
        double mortalityRate = 75;
        double medicineAmount = 1;
        double expResult = 1.63;
        double result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("illnessHeal");
        foodAmount = 100.0;
        mortalityRate = 75;
        medicineAmount = 1;
        expResult = 1.63;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);
   
        System.out.println("illnessHealInvalid - first test");
        foodAmount = 501.0;
        mortalityRate = 100;
        medicineAmount = 0;
        expResult = -1;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);

        System.out.println("illnessHealInvalid - second test");
        foodAmount = 100.0;
        mortalityRate = 75;
        medicineAmount = 1;
        expResult = 1.63;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("illnessHealInvalid - third test");
        foodAmount = 150.0;
        mortalityRate = 50.0;
        medicineAmount = 0;
        expResult = -2;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);

        System.out.println("illnessHealBoundary - first test");
        foodAmount = 200;
        mortalityRate = 75;
        medicineAmount = 0;
        expResult = 2.66;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);

        System.out.println("illnessHealBoundary - second test");
        foodAmount = 225;
        mortalityRate = 125;
        medicineAmount = 0;
        expResult = 1.8;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1);

        System.out.println("illnessHealBoundary - third test");
        foodAmount = 500;
        mortalityRate = 100;
        medicineAmount = 1;
        expResult = 5.3;
        result = ActorControl.illnessHeal(foodAmount, mortalityRate, medicineAmount);
        assertEquals(expResult, result, 0.1); 
    }
    
}
