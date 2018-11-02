/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.ActorModel;

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
//    @Test
//    public void testIllnessHeal() {
//        System.out.println("illnessHealValid");
//        double foodAmount = 100.0;
//        double mortalityRate = 75.0;
//        double medicineAmount = 1;
//        double expResult = 1.63;
//        double result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//
//        System.out.println("illnessHealInvalid - first test");
//        foodAmount = 501.0;
//        mortalityRate = 100.0;
//        medicineAmount = 0;
//        expResult = -1;
//        result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//
//        System.out.println("illnessHealInvalid - second test");
//        foodAmount = 100.0;
//        mortalityRate = 75.0;
//        medicineAmount = 1;
//        expResult = 1.63;
//        result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//
//        System.out.println("illnessHealInvalid - third test");
//        foodAmount = 150.0;
//        mortalityRate = 50.0;
//        medicineAmount = 0;
//        expResult = -2;
//        result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//
//        System.out.println("illnessHealBoundary - first test");
//        foodAmount = 200.0;
//        mortalityRate = 75.0;
//        medicineAmount = 0;
//        expResult = 2.66;
//        result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//
//        System.out.println("illnessHealBoundary - second test");
//        foodAmount = 225.0;
//        mortalityRate = 125.0;
//        medicineAmount = 0;
//        expResult = 1.8;
//        result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//
//        System.out.println("illnessHealBoundary - third test");
//        foodAmount = 500.0;
//        mortalityRate = 100.0;
//        medicineAmount = 1;
//        expResult = 5.3;
//        result = ActorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
//        assertEquals(expResult, result, 0.1);
//    }
//    
//    @Test
//    public void testFamilyStatusCheck() {
//        ActorModel[] family = ActorControl.createActors();
//        initializeFamily(family);
//        family[0].setHealth(15);
//        family[1].setHealth(14);
//        family[2].setHealth(15);
//        family[3].setHealth(16);
//        family[4].setHealth(15);
//        int result = ActorControl.checkFamilyStatus(family);
//        int expResult = 15;
//        System.out.println("familyStatusCheck - valid (1): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        initializeFamily(family);
//        family[0].setHealth(12);
//        family[1].setHealth(15);
//        family[2].setHealth(0);
//        family[3].setHealth(9);
//        family[4].setHealth(13);
//        result = ActorControl.checkFamilyStatus(family);
//        expResult = -1;
//        System.out.println("familyStatusCheck - invalid (2): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        initializeFamily(family);
//        family[0].setHealth(25);
//        family[1].setHealth(15);
//        family[2].setHealth(15);
//        family[3].setHealth(15);
//        family[4].setHealth(15);
//        result = ActorControl.checkFamilyStatus(family);
//        expResult = -2;
//        System.out.println("familyStatusCheck - invalid (3): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        initializeFamily(family);
//        family[0].setHealth(15);
//        family[1].setHealth(15);
//        family[1].setAlive(false);
//        family[2].setHealth(15);
//        family[2].setAlive(false);
//        family[3].setHealth(15);
//        family[3].setAlive(false);
//        family[4].setHealth(15);
//        family[4].setAlive(false);
//        result = ActorControl.checkFamilyStatus(family);
//        expResult = -3;
//        System.out.println("familyStatusCheck - invalid (4): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        initializeFamily(family);
//        family[0].setHealth(20);
//        family[1].setHealth(18);
//        family[2].setHealth(12);
//        family[3].setHealth(10);
//        family[4].setHealth(0);
//        family[4].setAlive(false);
//        result = ActorControl.checkFamilyStatus(family);
//        expResult = 15;
//        System.out.println("familyStatusCheck - boundary (5): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        initializeFamily(family);
//        family[0].setHealth(8);
//        family[1].setHealth(0);
//        family[1].setAlive(false);
//        family[2].setHealth(6);
//        family[3].setHealth(0);
//        family[3].setAlive(false);
//        family[4].setHealth(0);
//        family[4].setAlive(false);
//        result = ActorControl.checkFamilyStatus(family);
//        expResult = 7;
//        System.out.println("familyStatusCheck - boundary (6): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        initializeFamily(family);
//        family[0].setHealth(4);
//        family[1].setHealth(5);
//        family[2].setHealth(1);
//        family[3].setHealth(0);
//        family[3].setAlive(false);
//        family[4].setHealth(0);
//        family[4].setAlive(false);
//        result = ActorControl.checkFamilyStatus(family);
//        expResult = 3;
//        System.out.println("familyStatusCheck - boundary (7): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//    }
    
    private void initializeFamily(ActorModel[] family) {
        for (int i = 0; i < family.length; i++) {
            family[i].setHealth(20);
            family[i].setAlive(true);
        }
    }
}
