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
     * Test of overComeObstacles method, of class LocationControl.
     */
    @Test
    public void testOverComeObstacles() {
        System.out.println("overComeObstaclesValid");
        double foodAmount = 100.0;
        int peopleAlive = 5;
        int hasProperGear = 1;
        int expResult = 1;
        int result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstaclesInvalid - first test");
        foodAmount = 501.0;
        peopleAlive = 5;
        hasProperGear = 0;
        expResult = -1;
        result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstaclesInvalid - second test");
        foodAmount = -1.0;
        peopleAlive = 3;
        hasProperGear = 0;
        expResult = -1;
        result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstaclesInvalid - third test");
        foodAmount = 150.0;
        peopleAlive = 1;
        hasProperGear = 1;
        expResult = -2;
        result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstaclesBoundary - first test");
        foodAmount = 200.0;
        peopleAlive = 5;
        hasProperGear = 1;
        expResult = 1;
        result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstaclesBoundary - second test");
        foodAmount = 500.0;
        peopleAlive = 2;
        hasProperGear = 1;
        expResult = 1;
        result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);

        System.out.println("overComeObstaclesBoundary - third test");
        foodAmount = 500.0;
        peopleAlive = 3;
        hasProperGear = 0;
        expResult = 0;
        result = LocationControl.overComeObstacles(foodAmount, peopleAlive, hasProperGear);
        assertEquals(expResult, result);
    }
}