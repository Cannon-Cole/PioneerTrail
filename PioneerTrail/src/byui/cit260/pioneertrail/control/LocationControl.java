/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.LocationModel;

/**
 *
 * @author Cole, Derek,
 */
public class LocationControl {

    public int overComeObstacle(int foodAmount, int peopleAlive, boolean hasProperGear) {

        if (foodAmount <= 0 || foodAmount > 500) {
            return -1;
        }

        if (peopleAlive < 2 || peopleAlive > 5) {
            return -2;
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
        }
        else {
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

    public void exploreLocation() {

        System.out.println("*** exploreLocation() called ***");
    }

    public void huntForResources() {

        System.out.println("*** huntForResources() called ***");
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