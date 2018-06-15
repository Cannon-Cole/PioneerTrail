/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

/**
 *
 * @author Cole, Derek, Aimee
 */
public class ActorControl {

    public static int[] illnessHealCheck(double foodAmount, double mortalityRate, double medicineAmount) {

        int returnArray[] = new int[4];

        /* array indexes:
        0 - 0-3 how much foodAmount (higher is better)
        1 - 0-3 how high mortalityRate (lower is better)
        2 - 0/1 is medicine available
        3 - errors if found
        */

        if (foodAmount <= 0 || foodAmount > 500)
            returnArray[3] = -1;

        if (mortalityRate < 75 || mortalityRate > 125)
            returnArray[3] = -2;

        if (medicineAmount < 0)
            returnArray[3] = -3;
        
        //range 1-500, tipping points 100 200 300
        returnArray[0] = (int) foodAmount / 100;
        if (returnArray[0] > 3)
            returnArray[0] = 3;

        //range 75-125, tipping points 85 110
        returnArray[1] = (int) (mortalityRate - 60) / 25;
        if (returnArray[1] > 2)
            returnArray[1] = 2;

        if (medicineAmount > 0) {
            returnArray[2] = 1;
        } else {
            returnArray[2] = 0;
        }

        return returnArray;

    }
    
    public static double illnessHealApply(double foodAmount, double mortalityRate, double medicineAmount) {

        if (foodAmount <= 0 || foodAmount > 500)
            return -1;

        if (mortalityRate < 75 || mortalityRate > 125)
            return -2;

        if (medicineAmount < 0)
            return -3;
        
        double healChance = 0;

        if (medicineAmount > 0) {
            healChance = .3;
        }

        double liveOrDie = foodAmount / mortalityRate + healChance;

        if (liveOrDie >= 0.5) {
            return liveOrDie;
        } else {
            return 0;
        }

    }

    public void moveActor() {

        System.out.println("*** moveactor() called ***");
    }

}