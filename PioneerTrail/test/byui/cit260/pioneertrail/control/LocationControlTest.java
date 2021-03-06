/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import org.junit.After;
import org.junit.AfterClass;
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
//    @Test
//    public void testOverComeObstacle() {
//
//        LocationControl locationControl = new LocationControl();
//
//        System.out.println("overComeObstacleValid");
//        int foodAmount = 100;
//        int peopleAlive = 5;
//        boolean hasProperGear = true;
//        int expResult = 1;
//        int result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//
//        System.out.println("overComeObstacleInvalid - first test");
//        foodAmount = 501;
//        peopleAlive = 5;
//        hasProperGear = false;
//        expResult = -1;
//        result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//
//        System.out.println("overComeObstacleInvalid - second test");
//        foodAmount = -1;
//        peopleAlive = 3;
//        hasProperGear = false;
//        expResult = -1;
//        result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//
//        System.out.println("overComeObstacleInvalid - third test");
//        foodAmount = 150;
//        peopleAlive = 1;
//        hasProperGear = true;
//        expResult = -2;
//        result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//
//        System.out.println("overComeObstacleBoundary - first test");
//        foodAmount = 200;
//        peopleAlive = 5;
//        hasProperGear = true;
//        expResult = 1;
//        result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//
//        System.out.println("overComeObstacleBoundary - second test");
//        foodAmount = 500;
//        peopleAlive = 2;
//        hasProperGear = true;
//        expResult = 1;
//        result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//
//        System.out.println("overComeObstacleBoundary - third test");
//        foodAmount = 500;
//        peopleAlive = 3;
//        hasProperGear = true;
//        expResult = 0;
//        result = locationControl.overComeObstacle(foodAmount, peopleAlive, hasProperGear);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of checkAfterHuntWeight method, of class LocationControl. Aimee
//     */
//    @Test
//    public void testcheckAfterHuntWeight() {
//
//        /* Test Case #1
//        
//         */
//        System.out.println("\tTest 1 Valid");
//        //input values for test case 1
//
//        int estimateResources = 100;
//        int gatherResources = 75;
//        int reduceFoodSupply = 10;
//
//        //create instance of LocationControl Class
//        //LocationControl instance = new LocationControl();
//        //expected output return value:
//        int expResult = 165;
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        //call function to run test
//        int result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight = " + result);
//
//        //compare expected return value to actual return value
//        assertEquals(expResult, result);
//
//        System.out.println("\tTest 2");
//        estimateResources = 501;
//        gatherResources = 75;
//        reduceFoodSupply = 10;
//        expResult = -1;
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight = " + result);
//
//        assertEquals(expResult, result);
//
//        System.out.println("\tTest 3");
//        estimateResources = 100;
//        gatherResources = 200;
//        reduceFoodSupply = 10;
//        expResult = -2;
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight=" + result);
//
//        assertEquals(expResult, result);
//
//        System.out.println("\tTest 4");
//        estimateResources = 100;
//        gatherResources = 75;
//        reduceFoodSupply = 35;
//        expResult = -3;
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight=" + result);
//
//        assertEquals(expResult, result);
//
//   
//        System.out.println("\tTest 5");
//        estimateResources = 0;
//        gatherResources = 75;
//        reduceFoodSupply = 10;
//        expResult = 65;
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight=" + result);
//
//        assertEquals(expResult, result);
//      
//        System.out.println("\tTest 6");
//        estimateResources = 100;
//        gatherResources = 150;
//        reduceFoodSupply = 10;
//        expResult = 240;
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight=" + result);
//
//        assertEquals(expResult, result);
//       
//        System.out.println("\tTest 7");
//        estimateResources = 100;
//        gatherResources = 75;
//        reduceFoodSupply = 30;
//        expResult = 145;
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("checkAfterHuntWeight (" + estimateResources + "," + gatherResources + "," + reduceFoodSupply + ")");
//
//        result = LocationControl.checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);
//
//        System.out.println("afterHuntWeight=" + result);
//
//        assertEquals(expResult, result);
//        /*
//     * Test of checkAfterHuntSuccess method, of class LocationControl.
//         */
//
//    }
}