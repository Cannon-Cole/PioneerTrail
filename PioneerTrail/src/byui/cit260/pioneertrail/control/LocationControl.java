/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.exceptions.LocationControlException;
import byui.cit260.pioneertrail.model.LocationModel;
import java.io.PrintWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole, Derek,
 */
public class LocationControl {

    public int overComeObstacle(int foodAmount, int peopleAlive, boolean hasProperGear) throws LocationControlException {

        if (foodAmount <= 0 || foodAmount > 500) {
            throw new LocationControlException("Food Amounts must be between 0-500 lbs.");
        }

        if (peopleAlive < 2 || peopleAlive > 5) {
            throw new LocationControlException("You must maintion 2-5 people in your party");
        }

        int hasGear = hasProperGear ? 1 : 0;

        int overcame = (foodAmount / peopleAlive) * hasGear;

        if (overcame >= 5) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int checkAfterHuntWeight(int estimateResources, int gatherResources, int reduceFoodSupply) throws LocationControlException {

        int afterHuntWeight = (estimateResources + gatherResources - reduceFoodSupply);

        if (estimateResources < 0 || estimateResources > 500) {
            throw new LocationControlException("Your food resources must be between 1 and 500 lbs.");
        }

        if (gatherResources < 5 || gatherResources > 150) {
            throw new LocationControlException("You may gather between 5 - 150 lbs of food");
        }

        if (reduceFoodSupply < 0 || reduceFoodSupply > 30) {
            throw new LocationControlException("You must reduce your food supply by 1-30 lbs on this turn");
        }
        else {
            return afterHuntWeight;
        }
    }

    public static boolean checkAfterHuntSuccess(int estimateResources, int gatherResources, int reduceFoodSupply) throws LocationControlException {

        int afterHuntWeight = checkAfterHuntWeight(estimateResources, gatherResources, reduceFoodSupply);

        if (afterHuntWeight >= 0 && afterHuntWeight <= 500) {
            return true;
        }

        return false;
    }

    public void exploreLocation() {
        PrintWriter output = PioneerTrail.getOutFile();
        output.println("*** exploreLocation() called ***");
    }

    public void huntForResources() {
        PrintWriter output = PioneerTrail.getOutFile();
        output.println("*** huntForResources() called ***");
    }

    public static LocationModel[][] createLocations(int rows, int columns) {

        //error check for size
        if (rows < 1 || columns < 1) {
            return null;
        }
        //creates an 2d array of locations
        LocationModel[][] locations = new LocationModel[rows][columns];

        //fills array with new location objects
        //row control
        for (int rowLoop = 0; rowLoop < rows; rowLoop++) {
            //column control
            for (int colLoop = 0; colLoop < columns; colLoop++) {
                //creates a temporary location object
                LocationModel tempLocation = new LocationModel();

                //sets rows
                tempLocation.setCurrentRow(rowLoop);
                tempLocation.setCurrentColumn(colLoop);

                //sets visited
                tempLocation.setVisited(false);

                //sets temporary object into the permanent array list
                locations[rowLoop][colLoop] = tempLocation;

            }
        }
        return locations;

    }

}

/*public static double illnessHeal(double foodAmount, double mortalityRate, double medicineAmount)throws LocationControlException {

        double healChance = 0;

        if (foodAmount <= 0 || foodAmount > 500) {
            throw new LocationControlException ("You must carry between 1-500 lbs of food.");
        }

        if (mortalityRate < 75 || mortalityRate > 125) {
            throw new LocationControlException ("Your health rate must be between 75-150.");
        }

        if (medicineAmount < 0) {
            throw new LocationControlException ("You need medicine.");
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
