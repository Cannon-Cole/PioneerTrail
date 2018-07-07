/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.ActorModel;
import byui.cit260.pioneertrail.model.ActorEnum;
import byui.cit260.pioneertrail.view.FamilyStatusView;
import exceptions.ActorControlException;

/**
 *
 * @author Cole, Derek, Aimee
 */
public class ActorControl {

    public static ActorModel[] createActors() {

        ActorModel[] family = new ActorModel[5];

        for (int i = 0; i < family.length; i++) {
            family[i] = new ActorModel();
            family[i].setHealth(20);
            family[i].setStrength(20);
            family[i].setAlive(true);
        }

        family[ActorEnum.Father.ordinal()].setName("Brigham");
        family[ActorEnum.Mother.ordinal()].setName("Sarah");
        family[ActorEnum.Child1.ordinal()].setName("Hyrum");
        family[ActorEnum.Child2.ordinal()].setName("Anna");
        family[ActorEnum.Child3.ordinal()].setName("Martin");

        family[ActorEnum.Father.ordinal()].setDescription("");
        family[ActorEnum.Mother.ordinal()].setDescription("");
        family[ActorEnum.Child1.ordinal()].setDescription("");
        family[ActorEnum.Child2.ordinal()].setDescription("");
        family[ActorEnum.Child3.ordinal()].setDescription("");

        return family;
    }

    public static int[] illnessHealCheck(double foodAmount, double mortalityRate, double medicineAmount) throws ActorControlException {

        int returnArray[] = new int[4];

        /* array indexes:
        0 - 0-3 how much foodAmount (higher is better)
        1 - 0-3 how high mortalityRate (lower is better)
        2 - 0/1 is medicine available
        3 - errors if found
         */
        if (foodAmount <= 0 || foodAmount > 500) {
            throw new ActorControlException("Food needs to be between 1 and 500");
        }

        if (mortalityRate < 75 || mortalityRate > 125) {
            throw new ActorControlException("Mortality rate needs to be between 75 and 125");
        }

        if (medicineAmount < 0) {
            throw new ActorControlException("Medicine amount needs to be at least 0");
        }

        //range 1-500, tipping points 100 200 300
        returnArray[0] = (int) foodAmount / 100;
        if (returnArray[0] > 3) {
            returnArray[0] = 3;
        }

        //range 75-125, tipping points 85 110
        returnArray[1] = (int) (mortalityRate - 60) / 25;
        if (returnArray[1] > 2) {
            returnArray[1] = 2;
        }

        if (medicineAmount > 0) {
            returnArray[2] = 1;
        }
        else {
            returnArray[2] = 0;
        }

        return returnArray;

    }

    public static double illnessHealApply(double foodAmount, double mortalityRate, double medicineAmount) throws ActorControlException {

        if (foodAmount <= 0 || foodAmount > 500) {
            throw new ActorControlException("Food needs to be between 1 and 500");
        }

        if (mortalityRate < 75 || mortalityRate > 125) {
            throw new ActorControlException("Mortality rate needs to be between 75 and 125");
        }

        if (medicineAmount < 0) {
            throw new ActorControlException("Medicine amount needs to be at least 0 or greater.");
        }

        double healChance = 0;

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

    public void moveActor() {
        System.out.println("*** moveactor() called ***");
    }

    public static void familyStatusWrapper(ActorModel[] family) throws ActorControlException {
        int average = checkFamilyStatus(family);

        if (average < 0) //error handling
        {
            throw new ActorControlException("Average needs to be at least 0 or greater.");
        }

        String message = "Your family's average health is " + average + ".\n\n  C: Continue";
        FamilyStatusView view = new FamilyStatusView(message);
        view.display();
    }

    public static int checkFamilyStatus(ActorModel[] family) throws ActorControlException {

        int runningSum = 0;
        int aliveCount = 0;
        int health = 0;

        for (ActorModel person : family) {

            if (person.isAlive() == true) {

                aliveCount++;
                health = person.getHealth();

                if (health <= 0) {
                    throw new ActorControlException("Health can't be 0 or negative.");
                }
                //health can't be 0

                if (health > 20) {
                    throw new ActorControlException("Health can't be greater than 20.");
                }
                //health can't be over 20

                runningSum = runningSum + health;
            }
        }

        if (aliveCount < 2) {
            throw new ActorControlException("Need 2 or more family members.");
        }
        //need at least two alive

        int average = runningSum / aliveCount;

        return average;
    }

}
