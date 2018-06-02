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
public class LocationControlTest {

    public LocationControlTest() {
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
}