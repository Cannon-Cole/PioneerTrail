/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import static java.lang.Boolean.TRUE;
import static java.lang.Boolean.FALSE;

/**
 *
 * @author Cole, Derek,
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
        } else {
            return 0;
        }
    }

    public static int checkAfterHuntWeight(int estimateResources, int gatherResources, int reduceFoodSupply) {

        int afterHuntWeight = (estimateResources + gatherResources - reduceFoodSupply);

        if (estimateResources < 0 || estimateResources > 500) {
            return -1;
        }

        if (gatherResources < 5 || gatherResources > 150) {
            return -2;
        }

        if (reduceFoodSupply < 0 || reduceFoodSupply > 30) {
            return -3;
        } else {
            return afterHuntWeight;
        }
    }

    public static boolean checkAfterHuntSuccess(int estimateResources, int gatherResources, int reduceFoodSupply) {

        int afterHuntWeight = checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);

        if (afterHuntWeight >= 0 && afterHuntWeight <= 500) {
            return true;
        }

        return false;
    }
}

/*public static double illnessHeal(double foodAmount, double mortalityRate, double medicineAmount) {

        double healChance = 0;

        if (foodAmount <= 0 || foodAmount > 500) {
            return -1;
        }

        if (mortalityRate < 75 || mortalityRate > 125) {
            return -2;
        }

        if (medicineAmount < 0) {
            return -3;
        }

        if (medicineAmount > 0) {
            healChance = .3;
        }

        double liveOrDie = foodAmount / mortalityRate + healChance;

        if (liveOrDie >= 0.5) {
            return liveOrDie;
        }

        else {
            return 0;
        }

    }
}
*/
