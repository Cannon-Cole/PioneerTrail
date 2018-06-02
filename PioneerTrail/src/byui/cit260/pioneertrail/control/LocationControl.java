/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

/**
 *
 * @author aimeejorgensen
 */
public class LocationControl {

    public static int overComeObstacle(double foodAmount, int peopleAlive, int hasProperGear) {

        if (foodAmount <= 0 || foodAmount > 500) {
            return -1;
        }

        if (peopleAlive < 2 || peopleAlive > 5) {
            return -2;
        }

        double overcame = (foodAmount / peopleAlive) * hasProperGear;

        if (overcame >= 5) {
            return 1;
        }

        else {
            return 0;
        }
    }
   
}