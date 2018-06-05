/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Cole
 */
public class LocationControlTest {

    public LocationControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of overComeObstacle method, of class LocationControl.
     */
    @Test
    public void testOverComeObstacle() {
        System.out.println("overComeObstacleValid");
        double foodAmount = 100.0;
        int peopleAlive = 5;
        int hasProperGear = 1;
        int expResult = 1;
        int result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstacleInvalid - first test");
        foodAmount = 501.0;
        peopleAlive = 5;
        hasProperGear = 0;
        expResult = -1;
        result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstacleInvalid - second test");
        foodAmount = -1.0;
        peopleAlive = 3;
        hasProperGear = 0;
        expResult = -1;
        result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstacleInvalid - third test");
        foodAmount = 150.0;
        peopleAlive = 1;
        hasProperGear = 1;
        expResult = -2;
        result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstacleBoundary - first test");
        foodAmount = 200.0;
        peopleAlive = 5;
        hasProperGear = 1;
        expResult = 1;
        result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstacleBoundary - second test");
        foodAmount = 500.0;
        peopleAlive = 2;
        hasProperGear = 1;
        expResult = 1;
        result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstacleBoundary - third test");
        foodAmount = 500.0;
        peopleAlive = 3;
        hasProperGear = 0;
        expResult = 0;
        result = LocationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkAfterHuntWeight method, of class LocationControl.  Aimee
     */
    @Test
    public void testcheckAfterHuntWeight() {
        
        /* Test Case #1
        
        */
        System.out.println("\tTest 1 Valid");
        //input values for test case 1
        
        int estimateResources = 100;
        int gatherResources =75;
        int reduceFoodSupply = 10;
        
        //create instance of LocationControl Class
        LocationControl instance = new LocationControl();
        
        //expected output return value:
        int expResult = 165;
        
        System.out.println("checkAfterHuntWeight = (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ",");
        
        //call function to run test
        int result = instance.checkAfterHuntWeight.(estimateResources, gatherResources, reduceFoodSupply);
        
        System.out.println("afterHuntWeight(" + result);
         
        //compare expected return value to actual return value
        assertEquals(expResult, result, 165);
   
    

        System.out.println("\tTest 2");
        estimateResources = 501;
        gatherResources =75;
        reduceFoodSupply = 10;
        expResult = 586;
        result = instance.checkafterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
   
        System.out.println("checkAfterHuntWeight = (" + estimateResources + "," + gatherResources + "," - reduceFoodSupply + ",");
        
        int result = instance.checkAfterHuntWeight.(estimateResources, gatherResources, reduceFoodSupply);
        
        System.out.println("afterHuntWeight(" + result);
        
        assertEquals(expResult, result, 586);
         
        
        
        
        System.out.println("\tTest 3");
        estimateResources = 100;
        gatherResources =200;
        reduceFoodSupply = 10;
        expResult = 310;
        result = instance.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
        
        System.out.println("checkAfterHuntWeight = (" + estimateResources + "," + gatherResources + "," - reduceFoodSupply + ",");
        
        int result = instance.checkAfterHuntWeight.(estimateResources, gatherResources, reduceFoodSupply);
        
        System.out.println("afterHuntWeight(" + result);
        
        assertEquals(expResult, result, 310);
        
        
   
    

        System.out.println("\tTest 4");
        estimateResources = 100;
        gatherResources =75;
        reduceFoodSupply = 35;
        expResult = 210;
        result = instance.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result, 210);
    /*
     * Test of checkAfterHuntSuccess method, of class LocationControl.
     */
    
    @Test
    public void testCheckAfterHuntSuccess() {
        System.out.println("checkAfterHuntSuccess");
        boolean estimateResources = true;
        boolean gatherResources = true;
        boolean reduceFoodSupply = true;
        boolean expResult = true;
        result = LocationControl.checkAfterHuntSuccess(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}