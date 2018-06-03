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
     * Test of checkAfterHuntWeight method, of class LocationControl.
     */
    @Test
    public void testCheckAfterHuntWeight() {
        System.out.println("checkAfterHuntWeightValid");
        int estimateResources = 100;
        int gatherResources =75;
        int reduceFoodSupply = 10;
        int expResult = 185;
        int result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result);
   
    }

           System.out.println("checkAfterHuntWeightInvalid - first test");
        int estimateResources = 501;
        int gatherResources =75;
        int reduceFoodSupply = 10;
        int expResult = -1;
        int result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result);
   
    }
       System.out.println("checkAfterHuntWeightInvalid - second test");
        int estimateResources = 100;
        int gatherResources =200;
        int reduceFoodSupply = 10;
        int expResult = -2;
        int result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result);
   
    }

       System.out.println("checkAfterHuntWeightInvalid - third test";
        int estimateResources = 100;
        int gatherResources =75;
        int reduceFoodSupply = 35;
        int expResult = -3;
        int result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result);
   
    }


    /*
        
       
   
    */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Test of checkAfterHuntSuccess method, of class LocationControl.
     */
    @Test
    public void testCheckAfterHuntSuccess() {
        System.out.println("checkAfterHuntSuccess");
        boolean estimateResources = false;
        boolean gatherResources = false;
        boolean reduceFoodSupply = false;
        boolean expResult = false;
        boolean result = LocationControl.checkAfterHuntSuccess(estimateResources, gatherResources, reduceFoodSupply);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}