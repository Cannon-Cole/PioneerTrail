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
public class ActorControl {

    public static double illnessHeal(double foodAmount, double mortalityRate, double medicineAmount) {

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